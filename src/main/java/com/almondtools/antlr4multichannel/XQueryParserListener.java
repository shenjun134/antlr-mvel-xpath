// Generated from grammar/XQueryParser.g4 by ANTLR 4.7.2
package com.almondtools.antlr4multichannel;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link XQueryParser}.
 */
public interface XQueryParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link XQueryParser#module}.
	 * @param ctx the parse tree
	 */
	void enterModule(XQueryParser.ModuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#module}.
	 * @param ctx the parse tree
	 */
	void exitModule(XQueryParser.ModuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#versionDecl}.
	 * @param ctx the parse tree
	 */
	void enterVersionDecl(XQueryParser.VersionDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#versionDecl}.
	 * @param ctx the parse tree
	 */
	void exitVersionDecl(XQueryParser.VersionDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#mainModule}.
	 * @param ctx the parse tree
	 */
	void enterMainModule(XQueryParser.MainModuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#mainModule}.
	 * @param ctx the parse tree
	 */
	void exitMainModule(XQueryParser.MainModuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#libraryModule}.
	 * @param ctx the parse tree
	 */
	void enterLibraryModule(XQueryParser.LibraryModuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#libraryModule}.
	 * @param ctx the parse tree
	 */
	void exitLibraryModule(XQueryParser.LibraryModuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#moduleDecl}.
	 * @param ctx the parse tree
	 */
	void enterModuleDecl(XQueryParser.ModuleDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#moduleDecl}.
	 * @param ctx the parse tree
	 */
	void exitModuleDecl(XQueryParser.ModuleDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#prolog}.
	 * @param ctx the parse tree
	 */
	void enterProlog(XQueryParser.PrologContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#prolog}.
	 * @param ctx the parse tree
	 */
	void exitProlog(XQueryParser.PrologContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#defaultNamespaceDecl}.
	 * @param ctx the parse tree
	 */
	void enterDefaultNamespaceDecl(XQueryParser.DefaultNamespaceDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#defaultNamespaceDecl}.
	 * @param ctx the parse tree
	 */
	void exitDefaultNamespaceDecl(XQueryParser.DefaultNamespaceDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boundaryDecl}
	 * labeled alternative in {@link XQueryParser#setter}.
	 * @param ctx the parse tree
	 */
	void enterBoundaryDecl(XQueryParser.BoundaryDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boundaryDecl}
	 * labeled alternative in {@link XQueryParser#setter}.
	 * @param ctx the parse tree
	 */
	void exitBoundaryDecl(XQueryParser.BoundaryDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code defaultCollationDecl}
	 * labeled alternative in {@link XQueryParser#setter}.
	 * @param ctx the parse tree
	 */
	void enterDefaultCollationDecl(XQueryParser.DefaultCollationDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code defaultCollationDecl}
	 * labeled alternative in {@link XQueryParser#setter}.
	 * @param ctx the parse tree
	 */
	void exitDefaultCollationDecl(XQueryParser.DefaultCollationDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code baseURIDecl}
	 * labeled alternative in {@link XQueryParser#setter}.
	 * @param ctx the parse tree
	 */
	void enterBaseURIDecl(XQueryParser.BaseURIDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code baseURIDecl}
	 * labeled alternative in {@link XQueryParser#setter}.
	 * @param ctx the parse tree
	 */
	void exitBaseURIDecl(XQueryParser.BaseURIDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code constructionDecl}
	 * labeled alternative in {@link XQueryParser#setter}.
	 * @param ctx the parse tree
	 */
	void enterConstructionDecl(XQueryParser.ConstructionDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code constructionDecl}
	 * labeled alternative in {@link XQueryParser#setter}.
	 * @param ctx the parse tree
	 */
	void exitConstructionDecl(XQueryParser.ConstructionDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code orderingModeDecl}
	 * labeled alternative in {@link XQueryParser#setter}.
	 * @param ctx the parse tree
	 */
	void enterOrderingModeDecl(XQueryParser.OrderingModeDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code orderingModeDecl}
	 * labeled alternative in {@link XQueryParser#setter}.
	 * @param ctx the parse tree
	 */
	void exitOrderingModeDecl(XQueryParser.OrderingModeDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code emptyOrderDecl}
	 * labeled alternative in {@link XQueryParser#setter}.
	 * @param ctx the parse tree
	 */
	void enterEmptyOrderDecl(XQueryParser.EmptyOrderDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code emptyOrderDecl}
	 * labeled alternative in {@link XQueryParser#setter}.
	 * @param ctx the parse tree
	 */
	void exitEmptyOrderDecl(XQueryParser.EmptyOrderDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code copyNamespacesDecl}
	 * labeled alternative in {@link XQueryParser#setter}.
	 * @param ctx the parse tree
	 */
	void enterCopyNamespacesDecl(XQueryParser.CopyNamespacesDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code copyNamespacesDecl}
	 * labeled alternative in {@link XQueryParser#setter}.
	 * @param ctx the parse tree
	 */
	void exitCopyNamespacesDecl(XQueryParser.CopyNamespacesDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#namespaceDecl}.
	 * @param ctx the parse tree
	 */
	void enterNamespaceDecl(XQueryParser.NamespaceDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#namespaceDecl}.
	 * @param ctx the parse tree
	 */
	void exitNamespaceDecl(XQueryParser.NamespaceDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#schemaImport}.
	 * @param ctx the parse tree
	 */
	void enterSchemaImport(XQueryParser.SchemaImportContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#schemaImport}.
	 * @param ctx the parse tree
	 */
	void exitSchemaImport(XQueryParser.SchemaImportContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#moduleImport}.
	 * @param ctx the parse tree
	 */
	void enterModuleImport(XQueryParser.ModuleImportContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#moduleImport}.
	 * @param ctx the parse tree
	 */
	void exitModuleImport(XQueryParser.ModuleImportContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void enterVarDecl(XQueryParser.VarDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void exitVarDecl(XQueryParser.VarDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#functionDecl}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDecl(XQueryParser.FunctionDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#functionDecl}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDecl(XQueryParser.FunctionDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#optionDecl}.
	 * @param ctx the parse tree
	 */
	void enterOptionDecl(XQueryParser.OptionDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#optionDecl}.
	 * @param ctx the parse tree
	 */
	void exitOptionDecl(XQueryParser.OptionDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(XQueryParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(XQueryParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(XQueryParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(XQueryParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#exprSingle}.
	 * @param ctx the parse tree
	 */
	void enterExprSingle(XQueryParser.ExprSingleContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#exprSingle}.
	 * @param ctx the parse tree
	 */
	void exitExprSingle(XQueryParser.ExprSingleContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#flworExpr}.
	 * @param ctx the parse tree
	 */
	void enterFlworExpr(XQueryParser.FlworExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#flworExpr}.
	 * @param ctx the parse tree
	 */
	void exitFlworExpr(XQueryParser.FlworExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#forClause}.
	 * @param ctx the parse tree
	 */
	void enterForClause(XQueryParser.ForClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#forClause}.
	 * @param ctx the parse tree
	 */
	void exitForClause(XQueryParser.ForClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#forVar}.
	 * @param ctx the parse tree
	 */
	void enterForVar(XQueryParser.ForVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#forVar}.
	 * @param ctx the parse tree
	 */
	void exitForVar(XQueryParser.ForVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#letClause}.
	 * @param ctx the parse tree
	 */
	void enterLetClause(XQueryParser.LetClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#letClause}.
	 * @param ctx the parse tree
	 */
	void exitLetClause(XQueryParser.LetClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#letVar}.
	 * @param ctx the parse tree
	 */
	void enterLetVar(XQueryParser.LetVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#letVar}.
	 * @param ctx the parse tree
	 */
	void exitLetVar(XQueryParser.LetVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#orderByClause}.
	 * @param ctx the parse tree
	 */
	void enterOrderByClause(XQueryParser.OrderByClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#orderByClause}.
	 * @param ctx the parse tree
	 */
	void exitOrderByClause(XQueryParser.OrderByClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#orderSpec}.
	 * @param ctx the parse tree
	 */
	void enterOrderSpec(XQueryParser.OrderSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#orderSpec}.
	 * @param ctx the parse tree
	 */
	void exitOrderSpec(XQueryParser.OrderSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#quantifiedExpr}.
	 * @param ctx the parse tree
	 */
	void enterQuantifiedExpr(XQueryParser.QuantifiedExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#quantifiedExpr}.
	 * @param ctx the parse tree
	 */
	void exitQuantifiedExpr(XQueryParser.QuantifiedExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#quantifiedVar}.
	 * @param ctx the parse tree
	 */
	void enterQuantifiedVar(XQueryParser.QuantifiedVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#quantifiedVar}.
	 * @param ctx the parse tree
	 */
	void exitQuantifiedVar(XQueryParser.QuantifiedVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#typeswitchExpr}.
	 * @param ctx the parse tree
	 */
	void enterTypeswitchExpr(XQueryParser.TypeswitchExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#typeswitchExpr}.
	 * @param ctx the parse tree
	 */
	void exitTypeswitchExpr(XQueryParser.TypeswitchExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#caseClause}.
	 * @param ctx the parse tree
	 */
	void enterCaseClause(XQueryParser.CaseClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#caseClause}.
	 * @param ctx the parse tree
	 */
	void exitCaseClause(XQueryParser.CaseClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#ifExpr}.
	 * @param ctx the parse tree
	 */
	void enterIfExpr(XQueryParser.IfExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#ifExpr}.
	 * @param ctx the parse tree
	 */
	void exitIfExpr(XQueryParser.IfExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code add}
	 * labeled alternative in {@link XQueryParser#orExpr}.
	 * @param ctx the parse tree
	 */
	void enterAdd(XQueryParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code add}
	 * labeled alternative in {@link XQueryParser#orExpr}.
	 * @param ctx the parse tree
	 */
	void exitAdd(XQueryParser.AddContext ctx);
	/**
	 * Enter a parse tree produced by the {@code extension}
	 * labeled alternative in {@link XQueryParser#orExpr}.
	 * @param ctx the parse tree
	 */
	void enterExtension(XQueryParser.ExtensionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code extension}
	 * labeled alternative in {@link XQueryParser#orExpr}.
	 * @param ctx the parse tree
	 */
	void exitExtension(XQueryParser.ExtensionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code treat}
	 * labeled alternative in {@link XQueryParser#orExpr}.
	 * @param ctx the parse tree
	 */
	void enterTreat(XQueryParser.TreatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code treat}
	 * labeled alternative in {@link XQueryParser#orExpr}.
	 * @param ctx the parse tree
	 */
	void exitTreat(XQueryParser.TreatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mult}
	 * labeled alternative in {@link XQueryParser#orExpr}.
	 * @param ctx the parse tree
	 */
	void enterMult(XQueryParser.MultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mult}
	 * labeled alternative in {@link XQueryParser#orExpr}.
	 * @param ctx the parse tree
	 */
	void exitMult(XQueryParser.MultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code comparison}
	 * labeled alternative in {@link XQueryParser#orExpr}.
	 * @param ctx the parse tree
	 */
	void enterComparison(XQueryParser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by the {@code comparison}
	 * labeled alternative in {@link XQueryParser#orExpr}.
	 * @param ctx the parse tree
	 */
	void exitComparison(XQueryParser.ComparisonContext ctx);
	/**
	 * Enter a parse tree produced by the {@code or}
	 * labeled alternative in {@link XQueryParser#orExpr}.
	 * @param ctx the parse tree
	 */
	void enterOr(XQueryParser.OrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code or}
	 * labeled alternative in {@link XQueryParser#orExpr}.
	 * @param ctx the parse tree
	 */
	void exitOr(XQueryParser.OrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intersect}
	 * labeled alternative in {@link XQueryParser#orExpr}.
	 * @param ctx the parse tree
	 */
	void enterIntersect(XQueryParser.IntersectContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intersect}
	 * labeled alternative in {@link XQueryParser#orExpr}.
	 * @param ctx the parse tree
	 */
	void exitIntersect(XQueryParser.IntersectContext ctx);
	/**
	 * Enter a parse tree produced by the {@code castable}
	 * labeled alternative in {@link XQueryParser#orExpr}.
	 * @param ctx the parse tree
	 */
	void enterCastable(XQueryParser.CastableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code castable}
	 * labeled alternative in {@link XQueryParser#orExpr}.
	 * @param ctx the parse tree
	 */
	void exitCastable(XQueryParser.CastableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code range}
	 * labeled alternative in {@link XQueryParser#orExpr}.
	 * @param ctx the parse tree
	 */
	void enterRange(XQueryParser.RangeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code range}
	 * labeled alternative in {@link XQueryParser#orExpr}.
	 * @param ctx the parse tree
	 */
	void exitRange(XQueryParser.RangeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code allDescPath}
	 * labeled alternative in {@link XQueryParser#orExpr}.
	 * @param ctx the parse tree
	 */
	void enterAllDescPath(XQueryParser.AllDescPathContext ctx);
	/**
	 * Exit a parse tree produced by the {@code allDescPath}
	 * labeled alternative in {@link XQueryParser#orExpr}.
	 * @param ctx the parse tree
	 */
	void exitAllDescPath(XQueryParser.AllDescPathContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unary}
	 * labeled alternative in {@link XQueryParser#orExpr}.
	 * @param ctx the parse tree
	 */
	void enterUnary(XQueryParser.UnaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unary}
	 * labeled alternative in {@link XQueryParser#orExpr}.
	 * @param ctx the parse tree
	 */
	void exitUnary(XQueryParser.UnaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code union}
	 * labeled alternative in {@link XQueryParser#orExpr}.
	 * @param ctx the parse tree
	 */
	void enterUnion(XQueryParser.UnionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code union}
	 * labeled alternative in {@link XQueryParser#orExpr}.
	 * @param ctx the parse tree
	 */
	void exitUnion(XQueryParser.UnionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code instanceOf}
	 * labeled alternative in {@link XQueryParser#orExpr}.
	 * @param ctx the parse tree
	 */
	void enterInstanceOf(XQueryParser.InstanceOfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code instanceOf}
	 * labeled alternative in {@link XQueryParser#orExpr}.
	 * @param ctx the parse tree
	 */
	void exitInstanceOf(XQueryParser.InstanceOfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rootedPath}
	 * labeled alternative in {@link XQueryParser#orExpr}.
	 * @param ctx the parse tree
	 */
	void enterRootedPath(XQueryParser.RootedPathContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rootedPath}
	 * labeled alternative in {@link XQueryParser#orExpr}.
	 * @param ctx the parse tree
	 */
	void exitRootedPath(XQueryParser.RootedPathContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cast}
	 * labeled alternative in {@link XQueryParser#orExpr}.
	 * @param ctx the parse tree
	 */
	void enterCast(XQueryParser.CastContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cast}
	 * labeled alternative in {@link XQueryParser#orExpr}.
	 * @param ctx the parse tree
	 */
	void exitCast(XQueryParser.CastContext ctx);
	/**
	 * Enter a parse tree produced by the {@code and}
	 * labeled alternative in {@link XQueryParser#orExpr}.
	 * @param ctx the parse tree
	 */
	void enterAnd(XQueryParser.AndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code and}
	 * labeled alternative in {@link XQueryParser#orExpr}.
	 * @param ctx the parse tree
	 */
	void exitAnd(XQueryParser.AndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code validate}
	 * labeled alternative in {@link XQueryParser#orExpr}.
	 * @param ctx the parse tree
	 */
	void enterValidate(XQueryParser.ValidateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code validate}
	 * labeled alternative in {@link XQueryParser#orExpr}.
	 * @param ctx the parse tree
	 */
	void exitValidate(XQueryParser.ValidateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code relative}
	 * labeled alternative in {@link XQueryParser#orExpr}.
	 * @param ctx the parse tree
	 */
	void enterRelative(XQueryParser.RelativeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code relative}
	 * labeled alternative in {@link XQueryParser#orExpr}.
	 * @param ctx the parse tree
	 */
	void exitRelative(XQueryParser.RelativeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code integer}
	 * labeled alternative in {@link XQueryParser#primaryExpr}.
	 * @param ctx the parse tree
	 */
	void enterInteger(XQueryParser.IntegerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code integer}
	 * labeled alternative in {@link XQueryParser#primaryExpr}.
	 * @param ctx the parse tree
	 */
	void exitInteger(XQueryParser.IntegerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code decimal}
	 * labeled alternative in {@link XQueryParser#primaryExpr}.
	 * @param ctx the parse tree
	 */
	void enterDecimal(XQueryParser.DecimalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code decimal}
	 * labeled alternative in {@link XQueryParser#primaryExpr}.
	 * @param ctx the parse tree
	 */
	void exitDecimal(XQueryParser.DecimalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code double}
	 * labeled alternative in {@link XQueryParser#primaryExpr}.
	 * @param ctx the parse tree
	 */
	void enterDouble(XQueryParser.DoubleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code double}
	 * labeled alternative in {@link XQueryParser#primaryExpr}.
	 * @param ctx the parse tree
	 */
	void exitDouble(XQueryParser.DoubleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code string}
	 * labeled alternative in {@link XQueryParser#primaryExpr}.
	 * @param ctx the parse tree
	 */
	void enterString(XQueryParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code string}
	 * labeled alternative in {@link XQueryParser#primaryExpr}.
	 * @param ctx the parse tree
	 */
	void exitString(XQueryParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code var}
	 * labeled alternative in {@link XQueryParser#primaryExpr}.
	 * @param ctx the parse tree
	 */
	void enterVar(XQueryParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code var}
	 * labeled alternative in {@link XQueryParser#primaryExpr}.
	 * @param ctx the parse tree
	 */
	void exitVar(XQueryParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code paren}
	 * labeled alternative in {@link XQueryParser#primaryExpr}.
	 * @param ctx the parse tree
	 */
	void enterParen(XQueryParser.ParenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code paren}
	 * labeled alternative in {@link XQueryParser#primaryExpr}.
	 * @param ctx the parse tree
	 */
	void exitParen(XQueryParser.ParenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code current}
	 * labeled alternative in {@link XQueryParser#primaryExpr}.
	 * @param ctx the parse tree
	 */
	void enterCurrent(XQueryParser.CurrentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code current}
	 * labeled alternative in {@link XQueryParser#primaryExpr}.
	 * @param ctx the parse tree
	 */
	void exitCurrent(XQueryParser.CurrentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funcall}
	 * labeled alternative in {@link XQueryParser#primaryExpr}.
	 * @param ctx the parse tree
	 */
	void enterFuncall(XQueryParser.FuncallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funcall}
	 * labeled alternative in {@link XQueryParser#primaryExpr}.
	 * @param ctx the parse tree
	 */
	void exitFuncall(XQueryParser.FuncallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ordered}
	 * labeled alternative in {@link XQueryParser#primaryExpr}.
	 * @param ctx the parse tree
	 */
	void enterOrdered(XQueryParser.OrderedContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ordered}
	 * labeled alternative in {@link XQueryParser#primaryExpr}.
	 * @param ctx the parse tree
	 */
	void exitOrdered(XQueryParser.OrderedContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unordered}
	 * labeled alternative in {@link XQueryParser#primaryExpr}.
	 * @param ctx the parse tree
	 */
	void enterUnordered(XQueryParser.UnorderedContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unordered}
	 * labeled alternative in {@link XQueryParser#primaryExpr}.
	 * @param ctx the parse tree
	 */
	void exitUnordered(XQueryParser.UnorderedContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ctor}
	 * labeled alternative in {@link XQueryParser#primaryExpr}.
	 * @param ctx the parse tree
	 */
	void enterCtor(XQueryParser.CtorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ctor}
	 * labeled alternative in {@link XQueryParser#primaryExpr}.
	 * @param ctx the parse tree
	 */
	void exitCtor(XQueryParser.CtorContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#relativePathExpr}.
	 * @param ctx the parse tree
	 */
	void enterRelativePathExpr(XQueryParser.RelativePathExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#relativePathExpr}.
	 * @param ctx the parse tree
	 */
	void exitRelativePathExpr(XQueryParser.RelativePathExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#stepExpr}.
	 * @param ctx the parse tree
	 */
	void enterStepExpr(XQueryParser.StepExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#stepExpr}.
	 * @param ctx the parse tree
	 */
	void exitStepExpr(XQueryParser.StepExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#axisStep}.
	 * @param ctx the parse tree
	 */
	void enterAxisStep(XQueryParser.AxisStepContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#axisStep}.
	 * @param ctx the parse tree
	 */
	void exitAxisStep(XQueryParser.AxisStepContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#forwardStep}.
	 * @param ctx the parse tree
	 */
	void enterForwardStep(XQueryParser.ForwardStepContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#forwardStep}.
	 * @param ctx the parse tree
	 */
	void exitForwardStep(XQueryParser.ForwardStepContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#forwardAxis}.
	 * @param ctx the parse tree
	 */
	void enterForwardAxis(XQueryParser.ForwardAxisContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#forwardAxis}.
	 * @param ctx the parse tree
	 */
	void exitForwardAxis(XQueryParser.ForwardAxisContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#abbrevForwardStep}.
	 * @param ctx the parse tree
	 */
	void enterAbbrevForwardStep(XQueryParser.AbbrevForwardStepContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#abbrevForwardStep}.
	 * @param ctx the parse tree
	 */
	void exitAbbrevForwardStep(XQueryParser.AbbrevForwardStepContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#reverseStep}.
	 * @param ctx the parse tree
	 */
	void enterReverseStep(XQueryParser.ReverseStepContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#reverseStep}.
	 * @param ctx the parse tree
	 */
	void exitReverseStep(XQueryParser.ReverseStepContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#reverseAxis}.
	 * @param ctx the parse tree
	 */
	void enterReverseAxis(XQueryParser.ReverseAxisContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#reverseAxis}.
	 * @param ctx the parse tree
	 */
	void exitReverseAxis(XQueryParser.ReverseAxisContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#abbrevReverseStep}.
	 * @param ctx the parse tree
	 */
	void enterAbbrevReverseStep(XQueryParser.AbbrevReverseStepContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#abbrevReverseStep}.
	 * @param ctx the parse tree
	 */
	void exitAbbrevReverseStep(XQueryParser.AbbrevReverseStepContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#nodeTest}.
	 * @param ctx the parse tree
	 */
	void enterNodeTest(XQueryParser.NodeTestContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#nodeTest}.
	 * @param ctx the parse tree
	 */
	void exitNodeTest(XQueryParser.NodeTestContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exactMatch}
	 * labeled alternative in {@link XQueryParser#nameTest}.
	 * @param ctx the parse tree
	 */
	void enterExactMatch(XQueryParser.ExactMatchContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exactMatch}
	 * labeled alternative in {@link XQueryParser#nameTest}.
	 * @param ctx the parse tree
	 */
	void exitExactMatch(XQueryParser.ExactMatchContext ctx);
	/**
	 * Enter a parse tree produced by the {@code allNames}
	 * labeled alternative in {@link XQueryParser#nameTest}.
	 * @param ctx the parse tree
	 */
	void enterAllNames(XQueryParser.AllNamesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code allNames}
	 * labeled alternative in {@link XQueryParser#nameTest}.
	 * @param ctx the parse tree
	 */
	void exitAllNames(XQueryParser.AllNamesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code allWithNS}
	 * labeled alternative in {@link XQueryParser#nameTest}.
	 * @param ctx the parse tree
	 */
	void enterAllWithNS(XQueryParser.AllWithNSContext ctx);
	/**
	 * Exit a parse tree produced by the {@code allWithNS}
	 * labeled alternative in {@link XQueryParser#nameTest}.
	 * @param ctx the parse tree
	 */
	void exitAllWithNS(XQueryParser.AllWithNSContext ctx);
	/**
	 * Enter a parse tree produced by the {@code allWithLocal}
	 * labeled alternative in {@link XQueryParser#nameTest}.
	 * @param ctx the parse tree
	 */
	void enterAllWithLocal(XQueryParser.AllWithLocalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code allWithLocal}
	 * labeled alternative in {@link XQueryParser#nameTest}.
	 * @param ctx the parse tree
	 */
	void exitAllWithLocal(XQueryParser.AllWithLocalContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#filterExpr}.
	 * @param ctx the parse tree
	 */
	void enterFilterExpr(XQueryParser.FilterExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#filterExpr}.
	 * @param ctx the parse tree
	 */
	void exitFilterExpr(XQueryParser.FilterExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#predicateList}.
	 * @param ctx the parse tree
	 */
	void enterPredicateList(XQueryParser.PredicateListContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#predicateList}.
	 * @param ctx the parse tree
	 */
	void exitPredicateList(XQueryParser.PredicateListContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#constructor}.
	 * @param ctx the parse tree
	 */
	void enterConstructor(XQueryParser.ConstructorContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#constructor}.
	 * @param ctx the parse tree
	 */
	void exitConstructor(XQueryParser.ConstructorContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#directConstructor}.
	 * @param ctx the parse tree
	 */
	void enterDirectConstructor(XQueryParser.DirectConstructorContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#directConstructor}.
	 * @param ctx the parse tree
	 */
	void exitDirectConstructor(XQueryParser.DirectConstructorContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#dirElemConstructorOpenClose}.
	 * @param ctx the parse tree
	 */
	void enterDirElemConstructorOpenClose(XQueryParser.DirElemConstructorOpenCloseContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#dirElemConstructorOpenClose}.
	 * @param ctx the parse tree
	 */
	void exitDirElemConstructorOpenClose(XQueryParser.DirElemConstructorOpenCloseContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#dirElemConstructorSingleTag}.
	 * @param ctx the parse tree
	 */
	void enterDirElemConstructorSingleTag(XQueryParser.DirElemConstructorSingleTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#dirElemConstructorSingleTag}.
	 * @param ctx the parse tree
	 */
	void exitDirElemConstructorSingleTag(XQueryParser.DirElemConstructorSingleTagContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#dirAttributeList}.
	 * @param ctx the parse tree
	 */
	void enterDirAttributeList(XQueryParser.DirAttributeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#dirAttributeList}.
	 * @param ctx the parse tree
	 */
	void exitDirAttributeList(XQueryParser.DirAttributeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#dirAttributeValue}.
	 * @param ctx the parse tree
	 */
	void enterDirAttributeValue(XQueryParser.DirAttributeValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#dirAttributeValue}.
	 * @param ctx the parse tree
	 */
	void exitDirAttributeValue(XQueryParser.DirAttributeValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#dirElemContent}.
	 * @param ctx the parse tree
	 */
	void enterDirElemContent(XQueryParser.DirElemContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#dirElemContent}.
	 * @param ctx the parse tree
	 */
	void exitDirElemContent(XQueryParser.DirElemContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#commonContent}.
	 * @param ctx the parse tree
	 */
	void enterCommonContent(XQueryParser.CommonContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#commonContent}.
	 * @param ctx the parse tree
	 */
	void exitCommonContent(XQueryParser.CommonContentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code docConstructor}
	 * labeled alternative in {@link XQueryParser#computedConstructor}.
	 * @param ctx the parse tree
	 */
	void enterDocConstructor(XQueryParser.DocConstructorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code docConstructor}
	 * labeled alternative in {@link XQueryParser#computedConstructor}.
	 * @param ctx the parse tree
	 */
	void exitDocConstructor(XQueryParser.DocConstructorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code elementConstructor}
	 * labeled alternative in {@link XQueryParser#computedConstructor}.
	 * @param ctx the parse tree
	 */
	void enterElementConstructor(XQueryParser.ElementConstructorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code elementConstructor}
	 * labeled alternative in {@link XQueryParser#computedConstructor}.
	 * @param ctx the parse tree
	 */
	void exitElementConstructor(XQueryParser.ElementConstructorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code attrConstructor}
	 * labeled alternative in {@link XQueryParser#computedConstructor}.
	 * @param ctx the parse tree
	 */
	void enterAttrConstructor(XQueryParser.AttrConstructorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code attrConstructor}
	 * labeled alternative in {@link XQueryParser#computedConstructor}.
	 * @param ctx the parse tree
	 */
	void exitAttrConstructor(XQueryParser.AttrConstructorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code textConstructor}
	 * labeled alternative in {@link XQueryParser#computedConstructor}.
	 * @param ctx the parse tree
	 */
	void enterTextConstructor(XQueryParser.TextConstructorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code textConstructor}
	 * labeled alternative in {@link XQueryParser#computedConstructor}.
	 * @param ctx the parse tree
	 */
	void exitTextConstructor(XQueryParser.TextConstructorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code commentConstructor}
	 * labeled alternative in {@link XQueryParser#computedConstructor}.
	 * @param ctx the parse tree
	 */
	void enterCommentConstructor(XQueryParser.CommentConstructorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code commentConstructor}
	 * labeled alternative in {@link XQueryParser#computedConstructor}.
	 * @param ctx the parse tree
	 */
	void exitCommentConstructor(XQueryParser.CommentConstructorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code piConstructor}
	 * labeled alternative in {@link XQueryParser#computedConstructor}.
	 * @param ctx the parse tree
	 */
	void enterPiConstructor(XQueryParser.PiConstructorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code piConstructor}
	 * labeled alternative in {@link XQueryParser#computedConstructor}.
	 * @param ctx the parse tree
	 */
	void exitPiConstructor(XQueryParser.PiConstructorContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#singleType}.
	 * @param ctx the parse tree
	 */
	void enterSingleType(XQueryParser.SingleTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#singleType}.
	 * @param ctx the parse tree
	 */
	void exitSingleType(XQueryParser.SingleTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypeDeclaration(XQueryParser.TypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypeDeclaration(XQueryParser.TypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#sequenceType}.
	 * @param ctx the parse tree
	 */
	void enterSequenceType(XQueryParser.SequenceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#sequenceType}.
	 * @param ctx the parse tree
	 */
	void exitSequenceType(XQueryParser.SequenceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#itemType}.
	 * @param ctx the parse tree
	 */
	void enterItemType(XQueryParser.ItemTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#itemType}.
	 * @param ctx the parse tree
	 */
	void exitItemType(XQueryParser.ItemTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#kindTest}.
	 * @param ctx the parse tree
	 */
	void enterKindTest(XQueryParser.KindTestContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#kindTest}.
	 * @param ctx the parse tree
	 */
	void exitKindTest(XQueryParser.KindTestContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#documentTest}.
	 * @param ctx the parse tree
	 */
	void enterDocumentTest(XQueryParser.DocumentTestContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#documentTest}.
	 * @param ctx the parse tree
	 */
	void exitDocumentTest(XQueryParser.DocumentTestContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#elementTest}.
	 * @param ctx the parse tree
	 */
	void enterElementTest(XQueryParser.ElementTestContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#elementTest}.
	 * @param ctx the parse tree
	 */
	void exitElementTest(XQueryParser.ElementTestContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#attributeTest}.
	 * @param ctx the parse tree
	 */
	void enterAttributeTest(XQueryParser.AttributeTestContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#attributeTest}.
	 * @param ctx the parse tree
	 */
	void exitAttributeTest(XQueryParser.AttributeTestContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#schemaElementTest}.
	 * @param ctx the parse tree
	 */
	void enterSchemaElementTest(XQueryParser.SchemaElementTestContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#schemaElementTest}.
	 * @param ctx the parse tree
	 */
	void exitSchemaElementTest(XQueryParser.SchemaElementTestContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#schemaAttributeTest}.
	 * @param ctx the parse tree
	 */
	void enterSchemaAttributeTest(XQueryParser.SchemaAttributeTestContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#schemaAttributeTest}.
	 * @param ctx the parse tree
	 */
	void exitSchemaAttributeTest(XQueryParser.SchemaAttributeTestContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#piTest}.
	 * @param ctx the parse tree
	 */
	void enterPiTest(XQueryParser.PiTestContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#piTest}.
	 * @param ctx the parse tree
	 */
	void exitPiTest(XQueryParser.PiTestContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#commentTest}.
	 * @param ctx the parse tree
	 */
	void enterCommentTest(XQueryParser.CommentTestContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#commentTest}.
	 * @param ctx the parse tree
	 */
	void exitCommentTest(XQueryParser.CommentTestContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#textTest}.
	 * @param ctx the parse tree
	 */
	void enterTextTest(XQueryParser.TextTestContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#textTest}.
	 * @param ctx the parse tree
	 */
	void exitTextTest(XQueryParser.TextTestContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#anyKindTest}.
	 * @param ctx the parse tree
	 */
	void enterAnyKindTest(XQueryParser.AnyKindTestContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#anyKindTest}.
	 * @param ctx the parse tree
	 */
	void exitAnyKindTest(XQueryParser.AnyKindTestContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#qName}.
	 * @param ctx the parse tree
	 */
	void enterQName(XQueryParser.QNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#qName}.
	 * @param ctx the parse tree
	 */
	void exitQName(XQueryParser.QNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#ncName}.
	 * @param ctx the parse tree
	 */
	void enterNcName(XQueryParser.NcNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#ncName}.
	 * @param ctx the parse tree
	 */
	void exitNcName(XQueryParser.NcNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#functionName}.
	 * @param ctx the parse tree
	 */
	void enterFunctionName(XQueryParser.FunctionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#functionName}.
	 * @param ctx the parse tree
	 */
	void exitFunctionName(XQueryParser.FunctionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#keyword}.
	 * @param ctx the parse tree
	 */
	void enterKeyword(XQueryParser.KeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#keyword}.
	 * @param ctx the parse tree
	 */
	void exitKeyword(XQueryParser.KeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#keywordNotOKForFunction}.
	 * @param ctx the parse tree
	 */
	void enterKeywordNotOKForFunction(XQueryParser.KeywordNotOKForFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#keywordNotOKForFunction}.
	 * @param ctx the parse tree
	 */
	void exitKeywordNotOKForFunction(XQueryParser.KeywordNotOKForFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#keywordOKForFunction}.
	 * @param ctx the parse tree
	 */
	void enterKeywordOKForFunction(XQueryParser.KeywordOKForFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#keywordOKForFunction}.
	 * @param ctx the parse tree
	 */
	void exitKeywordOKForFunction(XQueryParser.KeywordOKForFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#stringLiteral}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteral(XQueryParser.StringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#stringLiteral}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteral(XQueryParser.StringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#noQuotesNoBracesNoAmpNoLAng}.
	 * @param ctx the parse tree
	 */
	void enterNoQuotesNoBracesNoAmpNoLAng(XQueryParser.NoQuotesNoBracesNoAmpNoLAngContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#noQuotesNoBracesNoAmpNoLAng}.
	 * @param ctx the parse tree
	 */
	void exitNoQuotesNoBracesNoAmpNoLAng(XQueryParser.NoQuotesNoBracesNoAmpNoLAngContext ctx);
}