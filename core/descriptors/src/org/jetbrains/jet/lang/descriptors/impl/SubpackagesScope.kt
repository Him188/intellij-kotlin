/*
 * Copyright 2010-2014 JetBrains s.r.o.
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

package org.jetbrains.jet.lang.descriptors.impl

import org.jetbrains.jet.lang.descriptors.DeclarationDescriptor
import org.jetbrains.jet.lang.descriptors.PackageViewDescriptor
import org.jetbrains.jet.lang.resolve.name.FqName
import org.jetbrains.jet.lang.resolve.name.Name
import org.jetbrains.jet.lang.resolve.scopes.JetScopeImpl
import org.jetbrains.jet.utils.Printer
import org.jetbrains.jet.utils.*

import java.util.ArrayList

public class SubpackagesScope(private val containingDeclaration: PackageViewDescriptor) : JetScopeImpl() {
    override fun getContainingDeclaration(): DeclarationDescriptor {
        return containingDeclaration
    }

    override fun getPackage(name: Name): PackageViewDescriptor? {
        return if (name.isSpecial()) null else containingDeclaration.getModule().getPackage(containingDeclaration.getFqName().child(name))
    }

    override fun getAllDescriptors(): Collection<DeclarationDescriptor> {
        val subFqNames = containingDeclaration.getModule().getPackageFragmentProvider().getSubPackagesOf(containingDeclaration.getFqName())
        val result = ArrayList<DeclarationDescriptor>(subFqNames.size())
        for (subFqName in subFqNames) {
            result.addIfNotNull<DeclarationDescriptor>(getPackage(subFqName.shortName()))
        }
        return result
    }

    override fun printScopeStructure(p: Printer) {
        p.println(javaClass.getSimpleName(), " {")
        p.pushIndent()

        p.println("thisDescriptor = ", containingDeclaration)

        p.popIndent()
        p.println("}")
    }
}
