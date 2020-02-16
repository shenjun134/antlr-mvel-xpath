// Generated from grammar/XQueryParser.g4 by ANTLR 4.7.2
package com.almondtools.antlr4multichannel;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link XQueryParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface XQueryParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link XQueryParser#module}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule(XQueryParser.ModuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link XQueryParser#versionDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVersionDecl(XQueryParser.VersionDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link XQueryParser#mainModule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainModule(XQueryParser.MainModuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link XQueryParser#libraryModule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLibraryModule(XQueryParser.LibraryModuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link XQueryParser#moduleDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModuleDecl(XQueryParser.ModuleDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link XQueryParser#prolog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProlog(XQueryParser.PrologContext ctx);
	/**
	 * Visit a parse tree produced by {@link XQueryParser#defaultNamespaceDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultNamespaceDecl(XQueryParser.DefaultNamespaceDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boundaryDecl}
	 * labeled alternative in {@link XQueryParser#setter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoundaryDecl(XQueryParser.BoundaryDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code defaultCollationDecl}
	 * labeled alternative in {@link XQueryParser#setter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultCollationDecl(XQueryParser.DefaultCollationDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code baseURIDecl}
	 * labeled alternative in {@link XQueryParser#setter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBaseURIDecl(XQueryParser.BaseURIDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code constructionDecl}
	 * labeled alternative in {@link XQueryParser#setter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructionDecl(XQueryParser.ConstructionDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code orderingModeDecl}
	 * labeled alternative in {@link XQueryParser#setter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderingModeDecl(XQueryParser.OrderingModeDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code emptyOrderDecl}
	 * labeled alternative in {@link XQueryParser#setter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyOrderDecl(XQueryParser.EmptyOrderDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code copyNamespacesDecl}
	 * labeled alternative in {@link XQueryParser#setter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCopyNamespacesDecl(XQueryParser.CopyNamespacesDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link XQueryParser#namespaceDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamespaceDecl(XQueryParser.NamespaceDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link XQueryParser#schemaImport}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSchemaImport(XQueryParser.SchemaImportContext ctx);
	/**
	 * Visit a parse tree produced by {@link XQueryParser#moduleImport}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModuleImport(XQueryParser.ModuleImportContext ctx);
	/**
	 * Visit a parse tree produced by {@link XQueryParser#varDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDecl(XQueryParser.VarDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link XQueryParser#functionDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDecl(XQueryParser.FunctionDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link XQueryParser#optionDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptionDecl(XQueryParser.OptionDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link XQueryParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(XQueryParser.ParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link XQueryParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(XQueryParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link XQueryParser#exprSingle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprSingle(XQueryParser.ExprSingleContext ctx);
	/**
	 * Visit a parse tree produced by {@link XQueryParser#flworExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlworExpr(XQueryParser.FlworExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link XQueryParser#forClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForClause(XQueryParser.ForClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link XQueryParser#forVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForVar(XQueryParser.ForVarContext ctx);
	/**
	 * Visit a parse tree produced by {@link XQueryParser#letClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLetClause(XQueryParser.LetClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link XQueryParser#letVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLetVar(XQueryParser.LetVarContext ctx);
	/**
	 * Visit a parse tree produced by {@link XQueryParser#orderByClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderByClause(XQueryParser.OrderByClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link XQueryParser#orderSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderSpec(XQueryParser.OrderSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link XQueryParser#quantifiedExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuantifiedExpr(XQueryParser.QuantifiedExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link XQueryParser#quantifiedVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuantifiedVar(XQueryParser.QuantifiedVarContext ctx);
	/**
	 * Visit a parse tree produced by {@link XQueryParser#typeswitchExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeswitchExpr(XQueryParser.TypeswitchExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link XQueryParser#caseClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseClause(XQueryParser.CaseClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link XQueryParser#ifExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfExpr(XQueryParser.IfExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code add}
	 * labeled alternative in {@link XQueryParser#orExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd(XQueryParser.AddContext ctx);
	/**
	 * Visit a parse tree produced by the {@code extension}
	 * labeled alternative in {@link XQueryParser#orExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtension(XQueryParser.ExtensionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code treat}
	 * labeled alternative in {@link XQueryParser#orExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTreat(XQueryParser.TreatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mult}
	 * labeled alternative in {@link XQueryParser#orExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMult(XQueryParser.MultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code comparison}
	 * labeled alternative in {@link XQueryParser#orExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison(XQueryParser.ComparisonContext ctx);
	/**
	 * Visit a parse tree produced by the {@code or}
	 * labeled alternative in {@link XQueryParser#orExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr(XQueryParser.OrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intersect}
	 * labeled alternative in {@link XQueryParser#orExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntersect(XQueryParser.IntersectContext ctx);
	/**
	 * Visit a parse tree produced by the {@code castable}
	 * labeled alternative in {@link XQueryParser#orExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCastable(XQueryParser.CastableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code range}
	 * labeled alternative in {@link XQueryParser#orExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRange(XQueryParser.RangeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code allDescPath}
	 * labeled alternative in {@link XQueryParser#orExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAllDescPath(XQueryParser.AllDescPathContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unary}
	 * labeled alternative in {@link XQueryParser#orExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary(XQueryParser.UnaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code union}
	 * labeled alternative in {@link XQueryParser#orExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnion(XQueryParser.UnionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code instanceOf}
	 * labeled alternative in {@link XQueryParser#orExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstanceOf(XQueryParser.InstanceOfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rootedPath}
	 * labeled alternative in {@link XQueryParser#orExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRootedPath(XQueryParser.RootedPathContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cast}
	 * labeled alternative in {@link XQueryParser#orExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCast(XQueryParser.CastContext ctx);
	/**
	 * Visit a parse tree produced by the {@code and}
	 * labeled alternative in {@link XQueryParser#orExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd(XQueryParser.AndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code validate}
	 * labeled alternative in {@link XQueryParser#orExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValidate(XQueryParser.ValidateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code relative}
	 * labeled alternative in {@link XQueryParser#orExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelative(XQueryParser.RelativeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code integer}
	 * labeled alternative in {@link XQueryParser#primaryExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteger(XQueryParser.IntegerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code decimal}
	 * labeled alternative in {@link XQueryParser#primaryExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecimal(XQueryParser.DecimalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code double}
	 * labeled alternative in {@link XQueryParser#primaryExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDouble(XQueryParser.DoubleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code string}
	 * labeled alternative in {@link XQueryParser#primaryExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(XQueryParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code var}
	 * labeled alternative in {@link XQueryParser#primaryExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(XQueryParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code paren}
	 * labeled alternative in {@link XQueryParser#primaryExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParen(XQueryParser.ParenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code current}
	 * labeled alternative in {@link XQueryParser#primaryExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCurrent(XQueryParser.CurrentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funcall}
	 * labeled alternative in {@link XQueryParser#primaryExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncall(XQueryParser.FuncallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ordered}
	 * labeled alternative in {@link XQueryParser#primaryExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrdered(XQueryParser.OrderedContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unordered}
	 * labeled alternative in {@link XQueryParser#primaryExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnordered(XQueryParser.UnorderedContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ctor}
	 * labeled alternative in {@link XQueryParser#primaryExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCtor(XQueryParser.CtorContext ctx);
	/**
	 * Visit a parse tree produced by {@link XQueryParser#relativePathExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelativePathExpr(XQueryParser.RelativePathExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link XQueryParser#stepExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStepExpr(XQueryParser.StepExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link XQueryParser#axisStep}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAxisStep(XQueryParser.AxisStepContext ctx);
	/**
	 * Visit a parse tree produced by {@link XQueryParser#forwardStep}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForwardStep(XQueryParser.ForwardStepContext ctx);
	/**
	 * Visit a parse tree produced by {@link XQueryParser#forwardAxis}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForwardAxis(XQueryParser.ForwardAxisContext ctx);
	/**
	 * Visit a parse tree produced by {@link XQueryParser#abbrevForwardStep}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbbrevForwardStep(XQueryParser.AbbrevForwardStepContext ctx);
	/**
	 * Visit a parse tree produced by {@link XQueryParser#reverseStep}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReverseStep(XQueryParser.ReverseStepContext ctx);
	/**
	 * Visit a parse tree produced by {@link XQueryParser#reverseAxis}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReverseAxis(XQueryParser.ReverseAxisContext ctx);
	/**
	 * Visit a parse tree produced by {@link XQueryParser#abbrevReverseStep}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbbrevReverseStep(XQueryParser.AbbrevReverseStepContext ctx);
	/**
	 * Visit a parse tree produced by {@link XQueryParser#nodeTest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNodeTest(XQueryParser.NodeTestContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exactMatch}
	 * labeled alternative in {@link XQueryParser#nameTest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExactMatch(XQueryParser.ExactMatchContext ctx);
	/**
	 * Visit a parse tree produced by the {@code allNames}
	 * labeled alternative in {@link XQueryParser#nameTest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAllNames(XQueryParser.AllNamesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code allWithNS}
	 * labeled alternative in {@link XQueryParser#nameTest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAllWithNS(XQueryParser.AllWithNSContext ctx);
	/**
	 * Visit a parse tree produced by the {@code allWithLocal}
	 * labeled alternative in {@link XQueryParser#nameTest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAllWithLocal(XQueryParser.AllWithLocalContext ctx);
	/**
	 * Visit a parse tree produced by {@link XQueryParser#filterExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilterExpr(XQueryParser.FilterExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link XQueryParser#predicateList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredicateList(XQueryParser.PredicateListContext ctx);
	/**
	 * Visit a parse tree produced by {@link XQueryParser#constructor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructor(XQueryParser.ConstructorContext ctx);
	/**
	 * Visit a parse tree produced by {@link XQueryParser#directConstructor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirectConstructor(XQueryParser.DirectConstructorContext ctx);
	/**
	 * Visit a parse tree produced by {@link XQueryParser#dirElemConstructorOpenClose}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirElemConstructorOpenClose(XQueryParser.DirElemConstructorOpenCloseContext ctx);
	/**
	 * Visit a parse tree produced by {@link XQueryParser#dirElemConstructorSingleTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirElemConstructorSingleTag(XQueryParser.DirElemConstructorSingleTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link XQueryParser#dirAttributeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirAttributeList(XQueryParser.DirAttributeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link XQueryParser#dirAttributeValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirAttributeValue(XQueryParser.DirAttributeValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link XQueryParser#dirElemContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirElemContent(XQueryParser.DirElemContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link XQueryParser#commonContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommonContent(XQueryParser.CommonContentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code docConstructor}
	 * labeled alternative in {@link XQueryParser#computedConstructor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDocConstructor(XQueryParser.DocConstructorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code elementConstructor}
	 * labeled alternative in {@link XQueryParser#computedConstructor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementConstructor(XQueryParser.ElementConstructorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code attrConstructor}
	 * labeled alternative in {@link XQueryParser#computedConstructor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttrConstructor(XQueryParser.AttrConstructorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code textConstructor}
	 * labeled alternative in {@link XQueryParser#computedConstructor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextConstructor(XQueryParser.TextConstructorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code commentConstructor}
	 * labeled alternative in {@link XQueryParser#computedConstructor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommentConstructor(XQueryParser.CommentConstructorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code piConstructor}
	 * labeled alternative in {@link XQueryParser#computedConstructor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPiConstructor(XQueryParser.PiConstructorContext ctx);
	/**
	 * Visit a parse tree produced by {@link XQueryParser#singleType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleType(XQueryParser.SingleTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link XQueryParser#typeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDeclaration(XQueryParser.TypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link XQueryParser#sequenceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSequenceType(XQueryParser.SequenceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link XQueryParser#itemType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitItemType(XQueryParser.ItemTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link XQueryParser#kindTest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKindTest(XQueryParser.KindTestContext ctx);
	/**
	 * Visit a parse tree produced by {@link XQueryParser#documentTest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDocumentTest(XQueryParser.DocumentTestContext ctx);
	/**
	 * Visit a parse tree produced by {@link XQueryParser#elementTest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementTest(XQueryParser.ElementTestContext ctx);
	/**
	 * Visit a parse tree produced by {@link XQueryParser#attributeTest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeTest(XQueryParser.AttributeTestContext ctx);
	/**
	 * Visit a parse tree produced by {@link XQueryParser#schemaElementTest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSchemaElementTest(XQueryParser.SchemaElementTestContext ctx);
	/**
	 * Visit a parse tree produced by {@link XQueryParser#schemaAttributeTest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSchemaAttributeTest(XQueryParser.SchemaAttributeTestContext ctx);
	/**
	 * Visit a parse tree produced by {@link XQueryParser#piTest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPiTest(XQueryParser.PiTestContext ctx);
	/**
	 * Visit a parse tree produced by {@link XQueryParser#commentTest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommentTest(XQueryParser.CommentTestContext ctx);
	/**
	 * Visit a parse tree produced by {@link XQueryParser#textTest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextTest(XQueryParser.TextTestContext ctx);
	/**
	 * Visit a parse tree produced by {@link XQueryParser#anyKindTest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnyKindTest(XQueryParser.AnyKindTestContext ctx);
	/**
	 * Visit a parse tree produced by {@link XQueryParser#qName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQName(XQueryParser.QNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link XQueryParser#ncName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNcName(XQueryParser.NcNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link XQueryParser#functionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionName(XQueryParser.FunctionNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link XQueryParser#keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyword(XQueryParser.KeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link XQueryParser#keywordNotOKForFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeywordNotOKForFunction(XQueryParser.KeywordNotOKForFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link XQueryParser#keywordOKForFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeywordOKForFunction(XQueryParser.KeywordOKForFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link XQueryParser#stringLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiteral(XQueryParser.StringLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link XQueryParser#noQuotesNoBracesNoAmpNoLAng}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNoQuotesNoBracesNoAmpNoLAng(XQueryParser.NoQuotesNoBracesNoAmpNoLAngContext ctx);
}