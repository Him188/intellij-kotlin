/*
 * Copyright 2010-2021 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea.refactoring.rename;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TestMetadata;
import org.jetbrains.kotlin.test.TestRoot;
import org.junit.runner.RunWith;

/*
 * This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}.
 * DO NOT MODIFY MANUALLY.
 */
@SuppressWarnings("all")
@TestRoot("idea")
@TestDataPath("$CONTENT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
@TestMetadata("testData/refactoring/renameMultiModule")
public class MultiModuleRenameTestGenerated extends AbstractMultiModuleRenameTest {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
    }

    @TestMetadata("fileNotUnderSourceRootWithNamesakeUnderSourceRoot/fileNotUnderSourceRootWithNamesakeUnderSourceRoot.test")
    public void testFileNotUnderSourceRootWithNamesakeUnderSourceRoot_FileNotUnderSourceRootWithNamesakeUnderSourceRoot() throws Exception {
        runTest("testData/refactoring/renameMultiModule/fileNotUnderSourceRootWithNamesakeUnderSourceRoot/fileNotUnderSourceRootWithNamesakeUnderSourceRoot.test");
    }

    @TestMetadata("headerAndImplClassByImplTypeAlias/headerAndImplClassByImplTypeAlias.test")
    public void testHeaderAndImplClassByImplTypeAlias_HeaderAndImplClassByImplTypeAlias() throws Exception {
        runTest("testData/refactoring/renameMultiModule/headerAndImplClassByImplTypeAlias/headerAndImplClassByImplTypeAlias.test");
    }

    @TestMetadata("headerAndImplTypeAliasByImplClass/headerAndImplTypeAliasByImplClass.test")
    public void testHeaderAndImplTypeAliasByImplClass_HeaderAndImplTypeAliasByImplClass() throws Exception {
        runTest("testData/refactoring/renameMultiModule/headerAndImplTypeAliasByImplClass/headerAndImplTypeAliasByImplClass.test");
    }

    @TestMetadata("headersAndImplsByHeaderClassMemberFunParameter/headersAndImplsByHeaderClassMemberFunParameter.test")
    public void testHeadersAndImplsByHeaderClassMemberFunParameter_HeadersAndImplsByHeaderClassMemberFunParameter() throws Exception {
        runTest("testData/refactoring/renameMultiModule/headersAndImplsByHeaderClassMemberFunParameter/headersAndImplsByHeaderClassMemberFunParameter.test");
    }

    @TestMetadata("headersAndImplsByHeaderClassMemberFun/headersAndImplsByHeaderClassMemberFun.test")
    public void testHeadersAndImplsByHeaderClassMemberFun_HeadersAndImplsByHeaderClassMemberFun() throws Exception {
        runTest("testData/refactoring/renameMultiModule/headersAndImplsByHeaderClassMemberFun/headersAndImplsByHeaderClassMemberFun.test");
    }

    @TestMetadata("headersAndImplsByHeaderClassMemberVal/headersAndImplsByHeaderClassMemberVal.test")
    public void testHeadersAndImplsByHeaderClassMemberVal_HeadersAndImplsByHeaderClassMemberVal() throws Exception {
        runTest("testData/refactoring/renameMultiModule/headersAndImplsByHeaderClassMemberVal/headersAndImplsByHeaderClassMemberVal.test");
    }

    @TestMetadata("headersAndImplsByHeaderClassPrimaryConstructorParameter/headersAndImplsByHeaderClassPrimaryConstructorParameter.test")
    public void testHeadersAndImplsByHeaderClassPrimaryConstructorParameter_HeadersAndImplsByHeaderClassPrimaryConstructorParameter() throws Exception {
        runTest("testData/refactoring/renameMultiModule/headersAndImplsByHeaderClassPrimaryConstructorParameter/headersAndImplsByHeaderClassPrimaryConstructorParameter.test");
    }

    @TestMetadata("headersAndImplsByHeaderClassSecondaryConstructorParameter/headersAndImplsByHeaderClassSecondaryConstructorParameter.test")
    public void testHeadersAndImplsByHeaderClassSecondaryConstructorParameter_HeadersAndImplsByHeaderClassSecondaryConstructorParameter() throws Exception {
        runTest("testData/refactoring/renameMultiModule/headersAndImplsByHeaderClassSecondaryConstructorParameter/headersAndImplsByHeaderClassSecondaryConstructorParameter.test");
    }

    @TestMetadata("headersAndImplsByHeaderClassWithFileNames/headersAndImplsByHeaderClassWithFileNames.test")
    public void testHeadersAndImplsByHeaderClassWithFileNames_HeadersAndImplsByHeaderClassWithFileNames() throws Exception {
        runTest("testData/refactoring/renameMultiModule/headersAndImplsByHeaderClassWithFileNames/headersAndImplsByHeaderClassWithFileNames.test");
    }

    @TestMetadata("headersAndImplsByHeaderClass/headersAndImplsByHeaderClass.test")
    public void testHeadersAndImplsByHeaderClass_HeadersAndImplsByHeaderClass() throws Exception {
        runTest("testData/refactoring/renameMultiModule/headersAndImplsByHeaderClass/headersAndImplsByHeaderClass.test");
    }

    @TestMetadata("headersAndImplsByHeaderFunParameter/headersAndImplsByHeaderFunParameter.test")
    public void testHeadersAndImplsByHeaderFunParameter_HeadersAndImplsByHeaderFunParameter() throws Exception {
        runTest("testData/refactoring/renameMultiModule/headersAndImplsByHeaderFunParameter/headersAndImplsByHeaderFunParameter.test");
    }

    @TestMetadata("headersAndImplsByHeaderFun/headersAndImplsByHeaderFun.test")
    public void testHeadersAndImplsByHeaderFun_HeadersAndImplsByHeaderFun() throws Exception {
        runTest("testData/refactoring/renameMultiModule/headersAndImplsByHeaderFun/headersAndImplsByHeaderFun.test");
    }

    @TestMetadata("headersAndImplsByHeaderVal/headersAndImplsByHeaderVal.test")
    public void testHeadersAndImplsByHeaderVal_HeadersAndImplsByHeaderVal() throws Exception {
        runTest("testData/refactoring/renameMultiModule/headersAndImplsByHeaderVal/headersAndImplsByHeaderVal.test");
    }

    @TestMetadata("headersAndImplsByImplClassMemberFunParameter/headersAndImplsByImplClassMemberFunParameter.test")
    public void testHeadersAndImplsByImplClassMemberFunParameter_HeadersAndImplsByImplClassMemberFunParameter() throws Exception {
        runTest("testData/refactoring/renameMultiModule/headersAndImplsByImplClassMemberFunParameter/headersAndImplsByImplClassMemberFunParameter.test");
    }

    @TestMetadata("headersAndImplsByImplClassMemberFun/headersAndImplsByImplClassMemberFun.test")
    public void testHeadersAndImplsByImplClassMemberFun_HeadersAndImplsByImplClassMemberFun() throws Exception {
        runTest("testData/refactoring/renameMultiModule/headersAndImplsByImplClassMemberFun/headersAndImplsByImplClassMemberFun.test");
    }

    @TestMetadata("headersAndImplsByImplClassMemberVal/headersAndImplsByImplClassMemberVal.test")
    public void testHeadersAndImplsByImplClassMemberVal_HeadersAndImplsByImplClassMemberVal() throws Exception {
        runTest("testData/refactoring/renameMultiModule/headersAndImplsByImplClassMemberVal/headersAndImplsByImplClassMemberVal.test");
    }

    @TestMetadata("headersAndImplsByImplClassPrimaryConstructorParameter/headersAndImplsByImplClassPrimaryConstructorParameter.test")
    public void testHeadersAndImplsByImplClassPrimaryConstructorParameter_HeadersAndImplsByImplClassPrimaryConstructorParameter() throws Exception {
        runTest("testData/refactoring/renameMultiModule/headersAndImplsByImplClassPrimaryConstructorParameter/headersAndImplsByImplClassPrimaryConstructorParameter.test");
    }

    @TestMetadata("headersAndImplsByImplClassSecondaryConstructorParameter/headersAndImplsByImplClassSecondaryConstructorParameter.test")
    public void testHeadersAndImplsByImplClassSecondaryConstructorParameter_HeadersAndImplsByImplClassSecondaryConstructorParameter() throws Exception {
        runTest("testData/refactoring/renameMultiModule/headersAndImplsByImplClassSecondaryConstructorParameter/headersAndImplsByImplClassSecondaryConstructorParameter.test");
    }

    @TestMetadata("headersAndImplsByImplClassWithFileNames/headersAndImplsByImplClassWithFileNames.test")
    public void testHeadersAndImplsByImplClassWithFileNames_HeadersAndImplsByImplClassWithFileNames() throws Exception {
        runTest("testData/refactoring/renameMultiModule/headersAndImplsByImplClassWithFileNames/headersAndImplsByImplClassWithFileNames.test");
    }

    @TestMetadata("headersAndImplsByImplClass/headersAndImplsByImplClass.test")
    public void testHeadersAndImplsByImplClass_HeadersAndImplsByImplClass() throws Exception {
        runTest("testData/refactoring/renameMultiModule/headersAndImplsByImplClass/headersAndImplsByImplClass.test");
    }

    @TestMetadata("headersAndImplsByImplFunParameter/headersAndImplsByImplFunParameter.test")
    public void testHeadersAndImplsByImplFunParameter_HeadersAndImplsByImplFunParameter() throws Exception {
        runTest("testData/refactoring/renameMultiModule/headersAndImplsByImplFunParameter/headersAndImplsByImplFunParameter.test");
    }

    @TestMetadata("headersAndImplsByImplFun/headersAndImplsByImplFun.test")
    public void testHeadersAndImplsByImplFun_HeadersAndImplsByImplFun() throws Exception {
        runTest("testData/refactoring/renameMultiModule/headersAndImplsByImplFun/headersAndImplsByImplFun.test");
    }

    @TestMetadata("headersAndImplsByImplVal/headersAndImplsByImplVal.test")
    public void testHeadersAndImplsByImplVal_HeadersAndImplsByImplVal() throws Exception {
        runTest("testData/refactoring/renameMultiModule/headersAndImplsByImplVal/headersAndImplsByImplVal.test");
    }

    @TestMetadata("implClassAndTypeAliasByHeaderClass/implClassAndTypeAliasByHeaderClass.test")
    public void testImplClassAndTypeAliasByHeaderClass_ImplClassAndTypeAliasByHeaderClass() throws Exception {
        runTest("testData/refactoring/renameMultiModule/implClassAndTypeAliasByHeaderClass/implClassAndTypeAliasByHeaderClass.test");
    }

    @TestMetadata("suspendFunImplInImplModule/suspendFunImplInImplModule.test")
    public void testSuspendFunImplInImplModule_SuspendFunImplInImplModule() throws Exception {
        runTest("testData/refactoring/renameMultiModule/suspendFunImplInImplModule/suspendFunImplInImplModule.test");
    }

    @TestMetadata("suspendFunInCommonModule/suspendFunInCommonModule.test")
    public void testSuspendFunInCommonModule_SuspendFunInCommonModule() throws Exception {
        runTest("testData/refactoring/renameMultiModule/suspendFunInCommonModule/suspendFunInCommonModule.test");
    }
}
