/*
 * generated by Xtext
 */
package org.eclipse.fx.code.editor.ldef.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.fx.code.editor.ldef.lDef.Keyword;
import org.eclipse.fx.code.editor.ldef.lDef.LDef;
import org.eclipse.fx.code.editor.ldef.lDef.LDefPackage;
import org.eclipse.fx.code.editor.ldef.lDef.LexicalHighlighting;
import org.eclipse.fx.code.editor.ldef.lDef.LexicalPartitionHighlighting_JS;
import org.eclipse.fx.code.editor.ldef.lDef.LexicalPartitionHighlighting_Rule;
import org.eclipse.fx.code.editor.ldef.lDef.Paritioner_JS;
import org.eclipse.fx.code.editor.ldef.lDef.Paritioning;
import org.eclipse.fx.code.editor.ldef.lDef.Partition;
import org.eclipse.fx.code.editor.ldef.lDef.Partition_MultiLineRule;
import org.eclipse.fx.code.editor.ldef.lDef.Partition_SingleLineRule;
import org.eclipse.fx.code.editor.ldef.lDef.Partitioner_Rule;
import org.eclipse.fx.code.editor.ldef.lDef.Scanner_CharacterRule;
import org.eclipse.fx.code.editor.ldef.lDef.Scanner_JSRule;
import org.eclipse.fx.code.editor.ldef.lDef.Scanner_Keyword;
import org.eclipse.fx.code.editor.ldef.lDef.Scanner_MultiLineRule;
import org.eclipse.fx.code.editor.ldef.lDef.Scanner_SingleLineRule;
import org.eclipse.fx.code.editor.ldef.lDef.Scanner_WhitespaceRule;
import org.eclipse.fx.code.editor.ldef.lDef.Token;
import org.eclipse.fx.code.editor.ldef.services.LDefGrammarAccess;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class LDefSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private LDefGrammarAccess grammarAccess;
	
	@Override
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == LDefPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case LDefPackage.KEYWORD:
				sequence_Keyword(context, (Keyword) semanticObject); 
				return; 
			case LDefPackage.LDEF:
				sequence_LDef(context, (LDef) semanticObject); 
				return; 
			case LDefPackage.LEXICAL_HIGHLIGHTING:
				sequence_LexicalHighlighting(context, (LexicalHighlighting) semanticObject); 
				return; 
			case LDefPackage.LEXICAL_PARTITION_HIGHLIGHTING_JS:
				sequence_LexicalPartitionHighlighting_JS(context, (LexicalPartitionHighlighting_JS) semanticObject); 
				return; 
			case LDefPackage.LEXICAL_PARTITION_HIGHLIGHTING_RULE:
				sequence_LexicalPartitionHighlighting_Rule(context, (LexicalPartitionHighlighting_Rule) semanticObject); 
				return; 
			case LDefPackage.PARITIONER_JS:
				sequence_Paritioner_JS(context, (Paritioner_JS) semanticObject); 
				return; 
			case LDefPackage.PARITIONING:
				sequence_Paritioning(context, (Paritioning) semanticObject); 
				return; 
			case LDefPackage.PARTITION:
				sequence_Partition(context, (Partition) semanticObject); 
				return; 
			case LDefPackage.PARTITION_MULTI_LINE_RULE:
				sequence_Partition_MultiLineRule(context, (Partition_MultiLineRule) semanticObject); 
				return; 
			case LDefPackage.PARTITION_SINGLE_LINE_RULE:
				sequence_Partition_SingleLineRule(context, (Partition_SingleLineRule) semanticObject); 
				return; 
			case LDefPackage.PARTITIONER_RULE:
				sequence_Partitioner_Rule(context, (Partitioner_Rule) semanticObject); 
				return; 
			case LDefPackage.SCANNER_CHARACTER_RULE:
				sequence_Scanner_CharacterRule(context, (Scanner_CharacterRule) semanticObject); 
				return; 
			case LDefPackage.SCANNER_JS_RULE:
				sequence_Scanner_JSRule(context, (Scanner_JSRule) semanticObject); 
				return; 
			case LDefPackage.SCANNER_KEYWORD:
				sequence_Scanner_Keyword(context, (Scanner_Keyword) semanticObject); 
				return; 
			case LDefPackage.SCANNER_MULTI_LINE_RULE:
				sequence_Scanner_MultiLineRule(context, (Scanner_MultiLineRule) semanticObject); 
				return; 
			case LDefPackage.SCANNER_SINGLE_LINE_RULE:
				sequence_Scanner_SingleLineRule(context, (Scanner_SingleLineRule) semanticObject); 
				return; 
			case LDefPackage.SCANNER_WHITESPACE_RULE:
				sequence_Scanner_WhitespaceRule(context, (Scanner_WhitespaceRule) semanticObject); 
				return; 
			case LDefPackage.TOKEN:
				sequence_Token(context, (Token) semanticObject); 
				return; 
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (name=STRING version=STRING?)
	 */
	protected void sequence_Keyword(EObject context, Keyword semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID paritioning=Paritioning lexicalHighlighting=LexicalHighlighting)
	 */
	protected void sequence_LDef(EObject context, LDef semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LDefPackage.Literals.LDEF__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LDefPackage.Literals.LDEF__NAME));
			if(transientValues.isValueTransient(semanticObject, LDefPackage.Literals.LDEF__PARITIONING) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LDefPackage.Literals.LDEF__PARITIONING));
			if(transientValues.isValueTransient(semanticObject, LDefPackage.Literals.LDEF__LEXICAL_HIGHLIGHTING) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LDefPackage.Literals.LDEF__LEXICAL_HIGHLIGHTING));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getLDefAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getLDefAccess().getParitioningParitioningParserRuleCall_2_0(), semanticObject.getParitioning());
		feeder.accept(grammarAccess.getLDefAccess().getLexicalHighlightingLexicalHighlightingParserRuleCall_3_0(), semanticObject.getLexicalHighlighting());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     list+=LexicalPartitionHighlighting+
	 */
	protected void sequence_LexicalHighlighting(EObject context, LexicalHighlighting semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (partition=[Partition|ID] scriptURI=STRING)
	 */
	protected void sequence_LexicalPartitionHighlighting_JS(EObject context, LexicalPartitionHighlighting_JS semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LDefPackage.Literals.LEXICAL_PARTITION_HIGHLIGHTING__PARTITION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LDefPackage.Literals.LEXICAL_PARTITION_HIGHLIGHTING__PARTITION));
			if(transientValues.isValueTransient(semanticObject, LDefPackage.Literals.LEXICAL_PARTITION_HIGHLIGHTING_JS__SCRIPT_URI) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LDefPackage.Literals.LEXICAL_PARTITION_HIGHLIGHTING_JS__SCRIPT_URI));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getLexicalPartitionHighlighting_JSAccess().getPartitionPartitionIDTerminalRuleCall_1_0_1(), semanticObject.getPartition());
		feeder.accept(grammarAccess.getLexicalPartitionHighlighting_JSAccess().getScriptURISTRINGTerminalRuleCall_2_0(), semanticObject.getScriptURI());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (partition=[Partition|ID] tokenList+=Token+)
	 */
	protected void sequence_LexicalPartitionHighlighting_Rule(EObject context, LexicalPartitionHighlighting_Rule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     scriptURI=STRING
	 */
	protected void sequence_Paritioner_JS(EObject context, Paritioner_JS semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LDefPackage.Literals.PARITIONER_JS__SCRIPT_URI) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LDefPackage.Literals.PARITIONER_JS__SCRIPT_URI));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getParitioner_JSAccess().getScriptURISTRINGTerminalRuleCall_1_0(), semanticObject.getScriptURI());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (partitions+=Partition+ partitioner=Partitioner)
	 */
	protected void sequence_Paritioning(EObject context, Paritioning semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (parition=[Partition|ID] startSeq=STRING endSeq=STRING escapeSeq=STRING?)
	 */
	protected void sequence_Partition_MultiLineRule(EObject context, Partition_MultiLineRule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Partition(EObject context, Partition semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LDefPackage.Literals.PARTITION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LDefPackage.Literals.PARTITION__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPartitionAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (parition=[Partition|ID] startSeq=STRING endSeq=STRING? escapeSeq=STRING?)
	 */
	protected void sequence_Partition_SingleLineRule(EObject context, Partition_SingleLineRule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ruleList+=Partition_Rule+
	 */
	protected void sequence_Partitioner_Rule(EObject context, Partitioner_Rule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (characters+=STRING characters+=STRING*)
	 */
	protected void sequence_Scanner_CharacterRule(EObject context, Scanner_CharacterRule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     fileURI=STRING
	 */
	protected void sequence_Scanner_JSRule(EObject context, Scanner_JSRule semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LDefPackage.Literals.SCANNER_JS_RULE__FILE_URI) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LDefPackage.Literals.SCANNER_JS_RULE__FILE_URI));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getScanner_JSRuleAccess().getFileURISTRINGTerminalRuleCall_1_0(), semanticObject.getFileURI());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (keywords+=Keyword keywords+=Keyword*)
	 */
	protected void sequence_Scanner_Keyword(EObject context, Scanner_Keyword semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (startSeq=STRING endSeq=STRING escapeSeq=STRING?)
	 */
	protected void sequence_Scanner_MultiLineRule(EObject context, Scanner_MultiLineRule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (startSeq=STRING endSeq=STRING? escapeSeq=STRING?)
	 */
	protected void sequence_Scanner_SingleLineRule(EObject context, Scanner_SingleLineRule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((characters+=STRING characters+=STRING*) | javawhitespace?='javawhitespace' | fileURI=STRING)
	 */
	protected void sequence_Scanner_WhitespaceRule(EObject context, Scanner_WhitespaceRule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (default?='default'? name=ID scannerList+=Scanner*)
	 */
	protected void sequence_Token(EObject context, Token semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
