/*
 * Copyright 2010-2016 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jetbrains.kotlin.idea.maven.configuration

import com.intellij.openapi.command.WriteCommandAction
import com.intellij.openapi.module.Module
import com.intellij.openapi.projectRoots.Sdk
import com.intellij.psi.PsiFile
import com.intellij.testFramework.IdeaTestUtil
import org.jetbrains.idea.maven.model.MavenConstants
import org.jetbrains.kotlin.idea.configuration.AbstractConfigureProjectByChangingFileTest
import org.jetbrains.kotlin.idea.configuration.NotificationMessageCollector
import org.jetbrains.kotlin.test.KotlinTestUtils
import org.jetbrains.kotlin.test.AndroidStudioTestUtils
import java.io.File

abstract class AbstractMavenConfigureProjectByChangingFileTest : AbstractConfigureProjectByChangingFileTest<KotlinMavenConfigurator>() {
    override fun shouldRunTest(): Boolean {
        return super.shouldRunTest() && !AndroidStudioTestUtils.skipIncompatibleTestAgainstAndroidStudio()
    }

    fun doTestWithMaven(path: String) {
        val pathWithFile = MavenConstants.POM_XML
        doTest(pathWithFile, pathWithFile.replace("pom", "pom_after"), KotlinJavaMavenConfigurator())
    }

    fun doTestWithJSMaven(path: String) {
        val pathWithFile = MavenConstants.POM_XML
        doTest(pathWithFile, pathWithFile.replace("pom", "pom_after"), KotlinJavascriptMavenConfigurator())
    }

    override fun runConfigurator(
        module: Module,
        file: PsiFile,
        configurator: KotlinMavenConfigurator,
        version: String,
        collector: NotificationMessageCollector
    ) {
        WriteCommandAction.runWriteCommandAction(module.project) {
            configurator.configureModule(module, file, version, collector)
        }
    }

    override fun getProjectJDK(): Sdk {
        val root = KotlinTestUtils.getTestsRoot(this::class.java)
        val dir = KotlinTestUtils.getTestDataFileName(this::class.java, name)

        val pomFile = File("$root/$dir", MavenConstants.POM_XML)

        if (pomFile.readText().contains("<target>9</target>")) {
            return IdeaTestUtil.getMockJdk9()
        } else {
            return super.getProjectJDK()
        }
    }
}
