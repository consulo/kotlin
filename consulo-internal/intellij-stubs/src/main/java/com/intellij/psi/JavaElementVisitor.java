package com.intellij.psi;

@SuppressWarnings("all")
public class JavaElementVisitor extends com.intellij.psi.PsiElementVisitor {
    public void visitAnnotation(com.intellij.psi.PsiAnnotation annotation) { visitElement(annotation); }
    public void visitAnnotationArrayInitializer(com.intellij.psi.PsiArrayInitializerMemberValue initializer) { visitElement(initializer); }
    public void visitAnnotationMethod(com.intellij.psi.PsiAnnotationMethod method) { visitMethod(method); }
    public void visitAnonymousClass(com.intellij.psi.PsiAnonymousClass c) { visitClass(c); }
    public void visitArrayAccessExpression(com.intellij.psi.PsiArrayAccessExpression expression) { visitExpression(expression); }
    public void visitArrayInitializerExpression(com.intellij.psi.PsiArrayInitializerExpression expression) { visitExpression(expression); }
    public void visitAssignmentExpression(com.intellij.psi.PsiAssignmentExpression expression) { visitExpression(expression); }
    public void visitBinaryExpression(com.intellij.psi.PsiBinaryExpression expression) { visitPolyadicExpression(expression); }
    public void visitBlockStatement(com.intellij.psi.PsiBlockStatement statement) { visitStatement(statement); }
    public void visitBreakStatement(com.intellij.psi.PsiBreakStatement statement) { visitStatement(statement); }
    public void visitClass(com.intellij.psi.PsiClass c) { visitElement(c); }
    public void visitClassInitializer(com.intellij.psi.PsiClassInitializer i) { visitElement(i); }
    public void visitClassObjectAccessExpression(com.intellij.psi.PsiClassObjectAccessExpression expression) { visitExpression(expression); }
    public void visitCodeBlock(com.intellij.psi.PsiCodeBlock block) { visitElement(block); }
    public void visitConditionalExpression(com.intellij.psi.PsiConditionalExpression expression) { visitExpression(expression); }
    public void visitDeclarationStatement(com.intellij.psi.PsiDeclarationStatement statement) { visitStatement(statement); }
    public void visitEnumConstant(com.intellij.psi.PsiEnumConstant enumConstant) { visitField(enumConstant); }
    public void visitExpression(com.intellij.psi.PsiExpression expression) { visitElement(expression); }
    public void visitExpressionList(com.intellij.psi.PsiExpressionList list) { visitElement(list); }
    public void visitField(com.intellij.psi.PsiField field) { visitVariable(field); }
    public void visitIdentifier(com.intellij.psi.PsiIdentifier identifier) { visitElement(identifier); }
    public void visitImportStatement(com.intellij.psi.PsiImportStatement statement) { visitElement(statement); }
    public void visitInstanceOfExpression(com.intellij.psi.PsiInstanceOfExpression expression) { visitExpression(expression); }
    public void visitJavaCodeReferenceElement(com.intellij.psi.PsiJavaCodeReferenceElement ref) { visitElement(ref); }
    public void visitJavaToken(com.intellij.psi.PsiJavaToken token) { visitElement(token); }
    public void visitKeyword(com.intellij.psi.PsiKeyword keyword) { visitElement(keyword); }
    public void visitLambdaExpression(com.intellij.psi.PsiLambdaExpression expression) { visitExpression(expression); }
    public void visitLiteralExpression(com.intellij.psi.PsiLiteralExpression expression) { visitExpression(expression); }
    public void visitLocalVariable(com.intellij.psi.PsiLocalVariable variable) { visitVariable(variable); }
    public void visitMethod(com.intellij.psi.PsiMethod method) { visitElement(method); }
    public void visitMethodCallExpression(com.intellij.psi.PsiMethodCallExpression expression) { visitCallExpression(expression); }
    public void visitCallExpression(com.intellij.psi.PsiCallExpression callExpression) { visitExpression(callExpression); }
    public void visitModifierList(com.intellij.psi.PsiModifierList list) { visitElement(list); }
    public void visitNameValuePair(com.intellij.psi.PsiNameValuePair pair) { visitElement(pair); }
    public void visitNewExpression(com.intellij.psi.PsiNewExpression expression) { visitCallExpression(expression); }
    public void visitPackageStatement(com.intellij.psi.PsiPackageStatement statement) { visitElement(statement); }
    public void visitParameter(com.intellij.psi.PsiParameter parameter) { visitVariable(parameter); }
    public void visitParameterList(com.intellij.psi.PsiParameterList list) { visitElement(list); }
    public void visitParenthesizedExpression(com.intellij.psi.PsiParenthesizedExpression expression) { visitExpression(expression); }
    public void visitPolyadicExpression(com.intellij.psi.PsiPolyadicExpression expression) { visitExpression(expression); }
    public void visitPostfixExpression(com.intellij.psi.PsiPostfixExpression expression) { visitUnaryExpression(expression); }
    public void visitPrefixExpression(com.intellij.psi.PsiPrefixExpression expression) { visitUnaryExpression(expression); }
    public void visitRecordComponent(com.intellij.psi.PsiRecordComponent recordComponent) { visitElement(recordComponent); }
    public void visitReferenceElement(com.intellij.psi.PsiJavaCodeReferenceElement ref) { visitElement(ref); }
    public void visitReferenceExpression(com.intellij.psi.PsiReferenceExpression expression) { visitExpression(expression); }
    public void visitReferenceList(com.intellij.psi.PsiReferenceList list) { visitElement(list); }
    public void visitReferenceParameterList(com.intellij.psi.PsiReferenceParameterList list) { visitElement(list); }
    public void visitReturnStatement(com.intellij.psi.PsiReturnStatement statement) { visitStatement(statement); }
    public void visitStatement(com.intellij.psi.PsiStatement statement) { visitElement(statement); }
    public void visitSuperExpression(com.intellij.psi.PsiSuperExpression expression) { visitExpression(expression); }
    public void visitThisExpression(com.intellij.psi.PsiThisExpression expression) { visitExpression(expression); }
    public void visitTypeCastExpression(com.intellij.psi.PsiTypeCastExpression expression) { visitExpression(expression); }
    public void visitTypeElement(com.intellij.psi.PsiTypeElement type) { visitElement(type); }
    public void visitTypeParameter(com.intellij.psi.PsiTypeParameter classParameter) { visitClass(classParameter); }
    public void visitTypeParameterList(com.intellij.psi.PsiTypeParameterList list) { visitElement(list); }
    public void visitUnaryExpression(com.intellij.psi.PsiUnaryExpression expression) { visitExpression(expression); }
    public void visitVariable(com.intellij.psi.PsiVariable variable) { visitElement(variable); }
    // Added by consulo-internal/remap/genstub.py from com.intellij.java.language.psi.JavaElementVisitor
    public JavaElementVisitor() { }
    public void visitAnnotationParameterList(com.intellij.psi.PsiAnnotationParameterList p0) { }
    public void visitAssertStatement(com.intellij.psi.PsiAssertStatement p0) { }
    public void visitCaseLabelElementList(com.intellij.psi.PsiCaseLabelElementList p0) { }
    public void visitCatchSection(com.intellij.psi.PsiCatchSection p0) { }
    public void visitCodeFragment(com.intellij.psi.JavaCodeFragment p0) { }
    public void visitContinueStatement(com.intellij.psi.PsiContinueStatement p0) { }
    public void visitDeconstructionList(com.intellij.psi.PsiDeconstructionList p0) { }
    public void visitDeconstructionPattern(com.intellij.psi.PsiDeconstructionPattern p0) { }
    public void visitDefaultCaseLabelElement(com.intellij.psi.PsiDefaultCaseLabelElement p0) { }
    public void visitDocComment(com.intellij.psi.javadoc.PsiDocComment p0) { }
    public void visitDocTag(com.intellij.psi.javadoc.PsiDocTag p0) { }
    public void visitDocTagValue(com.intellij.psi.javadoc.PsiDocTagValue p0) { }
    public void visitDocReferenceHolder(com.intellij.psi.javadoc.PsiDocReferenceHolder p0) { }
    public void visitDocToken(com.intellij.psi.javadoc.PsiDocToken p0) { }
    public void visitDoWhileStatement(com.intellij.psi.PsiDoWhileStatement p0) { }
    public void visitEmptyStatement(com.intellij.psi.PsiEmptyStatement p0) { }
    public void visitEnumConstantInitializer(com.intellij.psi.PsiEnumConstantInitializer p0) { }
    public void visitExpressionListStatement(com.intellij.psi.PsiExpressionListStatement p0) { }
    public void visitExpressionStatement(com.intellij.psi.PsiExpressionStatement p0) { }
    public void visitForeachPatternStatement(com.intellij.psi.PsiForeachPatternStatement p0) { }
    public void visitForeachStatement(com.intellij.psi.PsiForeachStatement p0) { }
    public void visitForeachStatementBase(com.intellij.psi.PsiForeachStatementBase p0) { }
    public void visitForStatement(com.intellij.psi.PsiForStatement p0) { }
    public void visitFragment(com.intellij.psi.PsiFragment p0) { }
    public void visitIfStatement(com.intellij.psi.PsiIfStatement p0) { }
    public void visitImplicitClass(com.intellij.psi.PsiImplicitClass p0) { }
    public void visitImplicitVariable(com.intellij.psi.ImplicitVariable p0) { }
    public void visitImportList(com.intellij.psi.PsiImportList p0) { }
    public void visitImportStaticReferenceElement(com.intellij.psi.PsiImportStaticReferenceElement p0) { }
    public void visitImportStaticStatement(com.intellij.psi.PsiImportStaticStatement p0) { }
    public void visitImportModuleStatement(com.intellij.psi.PsiImportModuleStatement p0) { }
    public void visitInlineDocTag(com.intellij.psi.javadoc.PsiInlineDocTag p0) { }
    public void visitJavaFile(com.intellij.psi.PsiJavaFile p0) { }
    public void visitLabeledStatement(com.intellij.psi.PsiLabeledStatement p0) { }
    public void visitMethodReferenceExpression(com.intellij.psi.PsiMethodReferenceExpression p0) { }
    public void visitModule(com.intellij.psi.PsiJavaModule p0) { }
    public void visitModuleReferenceElement(com.intellij.psi.PsiJavaModuleReferenceElement p0) { }
    public void visitModuleStatement(com.intellij.psi.PsiStatement p0) { }
    public void visitPackage(com.intellij.psi.PsiPackage p0) { }
    public void visitPackageAccessibilityStatement(com.intellij.psi.PsiPackageAccessibilityStatement p0) { }
    public void visitParenthesizedPattern(com.intellij.psi.PsiParenthesizedPattern p0) { }
    public void visitPattern(com.intellij.psi.PsiPattern p0) { }
    public void visitPatternVariable(com.intellij.psi.PsiPatternVariable p0) { }
    public void visitProvidesStatement(com.intellij.psi.PsiProvidesStatement p0) { }
    public void visitReceiverParameter(com.intellij.psi.PsiReceiverParameter p0) { }
    public void visitRecordHeader(com.intellij.psi.PsiRecordHeader p0) { }
    public void visitRequiresStatement(com.intellij.psi.PsiRequiresStatement p0) { }
    public void visitResourceExpression(com.intellij.psi.PsiResourceExpression p0) { }
    public void visitResourceList(com.intellij.psi.PsiResourceList p0) { }
    public void visitResourceVariable(com.intellij.psi.PsiResourceVariable p0) { }
    public void visitSnippetAttribute(com.intellij.psi.javadoc.PsiSnippetAttribute p0) { }
    public void visitSnippetAttributeList(com.intellij.psi.javadoc.PsiSnippetAttributeList p0) { }
    public void visitSnippetAttributeValue(com.intellij.psi.javadoc.PsiSnippetAttributeValue p0) { }
    public void visitSnippetDocTagBody(com.intellij.psi.javadoc.PsiSnippetDocTagBody p0) { }
    public void visitMarkdownCodeBlock(com.intellij.psi.javadoc.PsiMarkdownCodeBlock p0) { }
    public void visitMarkdownReferenceLink(com.intellij.psi.javadoc.PsiMarkdownReferenceLink p0) { }
    public void visitMarkdownReferenceLabel(com.intellij.psi.javadoc.PsiMarkdownReferenceLabel p0) { }
    public void visitSnippetDocTagValue(com.intellij.psi.javadoc.PsiSnippetDocTagValue p0) { }
    public void visitSnippetTag(com.intellij.psi.javadoc.PsiSnippetDocTag p0) { }
    public void visitSwitchExpression(com.intellij.psi.PsiSwitchExpression p0) { }
    public void visitSwitchLabeledRuleStatement(com.intellij.psi.PsiSwitchLabeledRuleStatement p0) { }
    public void visitSwitchLabelStatement(com.intellij.psi.PsiSwitchLabelStatement p0) { }
    public void visitSwitchStatement(com.intellij.psi.PsiSwitchStatement p0) { }
    public void visitSynchronizedStatement(com.intellij.psi.PsiSynchronizedStatement p0) { }
    public void visitTemplate(com.intellij.psi.PsiTemplate p0) { }
    public void visitTemplateExpression(com.intellij.psi.PsiTemplateExpression p0) { }
    public void visitThrowStatement(com.intellij.psi.PsiThrowStatement p0) { }
    public void visitTryStatement(com.intellij.psi.PsiTryStatement p0) { }
    public void visitTypeTestPattern(com.intellij.psi.PsiTypeTestPattern p0) { }
    public void visitUnnamedPattern(com.intellij.psi.PsiUnnamedPattern p0) { }
    public void visitUsesStatement(com.intellij.psi.PsiUsesStatement p0) { }
    public void visitWhileStatement(com.intellij.psi.PsiWhileStatement p0) { }
    public void visitYieldStatement(com.intellij.psi.PsiYieldStatement p0) { }
}
