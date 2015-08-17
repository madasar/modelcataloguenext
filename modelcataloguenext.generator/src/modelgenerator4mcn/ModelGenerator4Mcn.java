package modelgenerator4mcn;
//This (meta) model was automatically generated 

//import statements
import fur.FInstance;
import java.lang.Iterable;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import kodkod.ast.Formula;
import kodkod.ast.Relation;
import kodkod.ast.Variable;
import kodkod.ast.Expression;
import kodkod.engine.Solution;
import kodkod.engine.Solver;
import kodkod.engine.satlab.SATFactory;
import kodkod.instance.Bounds;
import kodkod.instance.TupleFactory;
import kodkod.instance.Universe;

public class ModelGenerator4Mcn implements Iterator<FInstance>, Iterable<FInstance>{

	private final Relation _Integer;
	private final Relation _String;
	private final Relation _CatalogueElement;
	private final Relation _DataType;
	private final Relation _Boolean;
	private final Relation _DataModel_releaseLabel;
	private final Relation _DataConstraint_language;
	private final Relation _DataConstraint_content;
	private final Relation _Tag_label;
	private final Relation _Tag_URI;
	private final Relation _CatalogueElement_label;
	private final Relation _CatalogueElement_GUID;
	private final Relation _CatalogueElement_createdByUser;
	private final Relation _Relationship_type;
	private final Relation _DataModel;
	private final Relation _DataClass;
	private final Relation _DataItem;
	private final Relation _DataConstraint;
	private final Relation _ReferenceType;
	private final Relation _PrimitiveType;
	private final Relation _Relationship;
	private final Relation _Tag;
	private final Relation _EnumValue;
	private final Relation _Enumeration;
	private final Relation _False;
	private final Relation _True;
	private final Relation _relatedTo_ReferenceType_to_ReferenceType_relatedTo;
	private final Relation _type_EnumValue_to_EnumValue_type;
	private final Relation _OrderedValues_Enumeration_to_Enumeration_OrderedValues;
	private final Relation _type_DataItem_to_DataItem_type;
	private final Relation _extends_DataClass_to_DataClass_extends;
	private final Relation _contains_DataClass_to_DataClass_contains;
	private final Relation _defines_DataClass_to_DataClass_defines;
	private final Relation _declares_DataModel_to_DataModel_declares;
	private final Relation _owns_DataModel_to_DataModel_owns;
	private final Relation _finalised_DataModel_to_DataModel_finalised;
	private final Relation _releaseLabel_DataModel_to_DataModel_releaseLabel;
	private final Relation _language_DataConstraint_to_DataConstraint_language;
	private final Relation _content_DataConstraint_to_DataConstraint_content;
	private final Relation _label_Tag_to_Tag_label;
	private final Relation _URI_Tag_to_Tag_URI;
	private final Relation _constraints_CatalogueElement_to_CatalogueElement_constraints;
	private final Relation _tags_CatalogueElement_to_CatalogueElement_tags;
	private final Relation _label_CatalogueElement_to_CatalogueElement_label;
	private final Relation _GUID_CatalogueElement_to_CatalogueElement_GUID;
	private final Relation _createdByUser_CatalogueElement_to_CatalogueElement_createdByUser;
	private final Relation _source_Relationship_to_Relationship_source;
	private final Relation _target_Relationship_to_Relationship_target;
	private final Relation _type_Relationship_to_Relationship_type;
	private Solver solver;
	private Iterator<Solution> solutions;

	//constructor to initialise (meta) models objects
	public ModelGenerator4Mcn(){
		_Integer = Relation.nary("_Integer", 1);
		_String = Relation.nary("_String", 1);
		_CatalogueElement = Relation.nary("_CatalogueElement", 1);
		_DataType = Relation.nary("_DataType", 1);
		_Boolean = Relation.nary("_Boolean", 1);
		_DataModel_releaseLabel = Relation.nary("_DataModel_releaseLabel", 1);
		_DataConstraint_language = Relation.nary("_DataConstraint_language", 1);
		_DataConstraint_content = Relation.nary("_DataConstraint_content", 1);
		_Tag_label = Relation.nary("_Tag_label", 1);
		_Tag_URI = Relation.nary("_Tag_URI", 1);
		_CatalogueElement_label = Relation.nary("_CatalogueElement_label", 1);
		_CatalogueElement_GUID = Relation.nary("_CatalogueElement_GUID", 1);
		_CatalogueElement_createdByUser = Relation.nary("_CatalogueElement_createdByUser", 1);
		_Relationship_type = Relation.nary("_Relationship_type", 1);
		_DataModel = Relation.nary("_DataModel", 1);
		_DataClass = Relation.nary("_DataClass", 1);
		_DataItem = Relation.nary("_DataItem", 1);
		_DataConstraint = Relation.nary("_DataConstraint", 1);
		_ReferenceType = Relation.nary("_ReferenceType", 1);
		_PrimitiveType = Relation.nary("_PrimitiveType", 1);
		_Relationship = Relation.nary("_Relationship", 1);
		_Tag = Relation.nary("_Tag", 1);
		_EnumValue = Relation.nary("_EnumValue", 1);
		_Enumeration = Relation.nary("_Enumeration", 1);
		_False = Relation.nary("_False", 1);
		_True = Relation.nary("_True", 1);
		_relatedTo_ReferenceType_to_ReferenceType_relatedTo = Relation.nary("_relatedTo_ReferenceType_to_ReferenceType_relatedTo", 2);
		_type_EnumValue_to_EnumValue_type = Relation.nary("_type_EnumValue_to_EnumValue_type", 2);
		_OrderedValues_Enumeration_to_Enumeration_OrderedValues = Relation.nary("_OrderedValues_Enumeration_to_Enumeration_OrderedValues", 2);
		_type_DataItem_to_DataItem_type = Relation.nary("_type_DataItem_to_DataItem_type", 2);
		_extends_DataClass_to_DataClass_extends = Relation.nary("_extends_DataClass_to_DataClass_extends", 2);
		_contains_DataClass_to_DataClass_contains = Relation.nary("_contains_DataClass_to_DataClass_contains", 2);
		_defines_DataClass_to_DataClass_defines = Relation.nary("_defines_DataClass_to_DataClass_defines", 2);
		_declares_DataModel_to_DataModel_declares = Relation.nary("_declares_DataModel_to_DataModel_declares", 2);
		_owns_DataModel_to_DataModel_owns = Relation.nary("_owns_DataModel_to_DataModel_owns", 2);
		_finalised_DataModel_to_DataModel_finalised = Relation.nary("_finalised_DataModel_to_DataModel_finalised", 2);
		_releaseLabel_DataModel_to_DataModel_releaseLabel = Relation.nary("_releaseLabel_DataModel_to_DataModel_releaseLabel", 2);
		_language_DataConstraint_to_DataConstraint_language = Relation.nary("_language_DataConstraint_to_DataConstraint_language", 2);
		_content_DataConstraint_to_DataConstraint_content = Relation.nary("_content_DataConstraint_to_DataConstraint_content", 2);
		_label_Tag_to_Tag_label = Relation.nary("_label_Tag_to_Tag_label", 2);
		_URI_Tag_to_Tag_URI = Relation.nary("_URI_Tag_to_Tag_URI", 2);
		_constraints_CatalogueElement_to_CatalogueElement_constraints = Relation.nary("_constraints_CatalogueElement_to_CatalogueElement_constraints", 2);
		_tags_CatalogueElement_to_CatalogueElement_tags = Relation.nary("_tags_CatalogueElement_to_CatalogueElement_tags", 2);
		_label_CatalogueElement_to_CatalogueElement_label = Relation.nary("_label_CatalogueElement_to_CatalogueElement_label", 2);
		_GUID_CatalogueElement_to_CatalogueElement_GUID = Relation.nary("_GUID_CatalogueElement_to_CatalogueElement_GUID", 2);
		_createdByUser_CatalogueElement_to_CatalogueElement_createdByUser = Relation.nary("_createdByUser_CatalogueElement_to_CatalogueElement_createdByUser", 2);
		_source_Relationship_to_Relationship_source = Relation.nary("_source_Relationship_to_Relationship_source", 2);
		_target_Relationship_to_Relationship_target = Relation.nary("_target_Relationship_to_Relationship_target", 2);
		_type_Relationship_to_Relationship_type = Relation.nary("_type_Relationship_to_Relationship_type", 2);
		solver = new Solver();
		solver.options().setSolver(SATFactory.MiniSat);
		solutions = solver.solveAll(this.declaration(),this.bounds());
	}

	//the model declartion is helper for the constructor, it builds the Formula that defines the relationships of the model
	private Formula declaration(){
		final List<Formula> decls = new ArrayList<Formula>();
		//declare the model

		//constraints for _Integer

		//constraints for _String

		//constraints for _CatalogueElement
		//_CatalogueElement is not instanceable, so any instance must be a sub element
		final Variable sub1 = Variable.unary("sub1");
		decls.add( sub1.in(_DataModel).or( sub1.in(_DataClass) ).or( sub1.in(_DataItem) ).or( sub1.in(_DataType) ).or( sub1.in(_EnumValue) ).forAll(sub1.oneOf(_CatalogueElement)) );


		//constraints for _DataType
		//_DataType is a kind of _CatalogueElement
		decls.add( _DataType.in( _CatalogueElement ) );
		//_DataType must be disjoint from the sibling _DataModel
		decls.add( _DataType.intersection(_DataModel).no() );
		//_DataType must be disjoint from the sibling _DataClass
		decls.add( _DataType.intersection(_DataClass).no() );
		//_DataType must be disjoint from the sibling _DataItem
		decls.add( _DataType.intersection(_DataItem).no() );
		//_DataType must be disjoint from the sibling _EnumValue
		decls.add( _DataType.intersection(_EnumValue).no() );
		//_DataType is not instanceable, so any instance must be a sub element
		final Variable sub2 = Variable.unary("sub2");
		decls.add( sub2.in(_ReferenceType).or( sub2.in(_PrimitiveType) ).or( sub2.in(_Enumeration) ).forAll(sub2.oneOf(_DataType)) );


		//constraints for _Boolean
		//_Boolean is not instanceable, so any instance must be a sub element
		final Variable sub3 = Variable.unary("sub3");
		decls.add( sub3.in(_True).or( sub3.in(_False) ).forAll(sub3.oneOf(_Boolean)) );


		//constraints for _DataModel_releaseLabel
		//_DataModel_releaseLabel is a kind of _String
		decls.add( _DataModel_releaseLabel.in( _String ) );
		//_DataModel_releaseLabel must be disjoint from the sibling _DataConstraint_language
		decls.add( _DataModel_releaseLabel.intersection(_DataConstraint_language).no() );
		//_DataModel_releaseLabel must be disjoint from the sibling _DataConstraint_content
		decls.add( _DataModel_releaseLabel.intersection(_DataConstraint_content).no() );
		//_DataModel_releaseLabel must be disjoint from the sibling _Tag_label
		decls.add( _DataModel_releaseLabel.intersection(_Tag_label).no() );
		//_DataModel_releaseLabel must be disjoint from the sibling _Tag_URI
		decls.add( _DataModel_releaseLabel.intersection(_Tag_URI).no() );
		//_DataModel_releaseLabel must be disjoint from the sibling _CatalogueElement_label
		decls.add( _DataModel_releaseLabel.intersection(_CatalogueElement_label).no() );
		//_DataModel_releaseLabel must be disjoint from the sibling _CatalogueElement_GUID
		decls.add( _DataModel_releaseLabel.intersection(_CatalogueElement_GUID).no() );

		//constraints for _DataConstraint_language
		//_DataConstraint_language is a kind of _String
		decls.add( _DataConstraint_language.in( _String ) );
		//_DataConstraint_language must be disjoint from the sibling _DataModel_releaseLabel
		decls.add( _DataConstraint_language.intersection(_DataModel_releaseLabel).no() );
		//_DataConstraint_language must be disjoint from the sibling _DataConstraint_content
		decls.add( _DataConstraint_language.intersection(_DataConstraint_content).no() );
		//_DataConstraint_language must be disjoint from the sibling _Tag_label
		decls.add( _DataConstraint_language.intersection(_Tag_label).no() );
		//_DataConstraint_language must be disjoint from the sibling _Tag_URI
		decls.add( _DataConstraint_language.intersection(_Tag_URI).no() );
		//_DataConstraint_language must be disjoint from the sibling _CatalogueElement_label
		decls.add( _DataConstraint_language.intersection(_CatalogueElement_label).no() );
		//_DataConstraint_language must be disjoint from the sibling _CatalogueElement_GUID
		decls.add( _DataConstraint_language.intersection(_CatalogueElement_GUID).no() );

		//constraints for _DataConstraint_content
		//_DataConstraint_content is a kind of _String
		decls.add( _DataConstraint_content.in( _String ) );
		//_DataConstraint_content must be disjoint from the sibling _DataModel_releaseLabel
		decls.add( _DataConstraint_content.intersection(_DataModel_releaseLabel).no() );
		//_DataConstraint_content must be disjoint from the sibling _DataConstraint_language
		decls.add( _DataConstraint_content.intersection(_DataConstraint_language).no() );
		//_DataConstraint_content must be disjoint from the sibling _Tag_label
		decls.add( _DataConstraint_content.intersection(_Tag_label).no() );
		//_DataConstraint_content must be disjoint from the sibling _Tag_URI
		decls.add( _DataConstraint_content.intersection(_Tag_URI).no() );
		//_DataConstraint_content must be disjoint from the sibling _CatalogueElement_label
		decls.add( _DataConstraint_content.intersection(_CatalogueElement_label).no() );
		//_DataConstraint_content must be disjoint from the sibling _CatalogueElement_GUID
		decls.add( _DataConstraint_content.intersection(_CatalogueElement_GUID).no() );

		//constraints for _Tag_label
		//_Tag_label is a kind of _String
		decls.add( _Tag_label.in( _String ) );
		//_Tag_label must be disjoint from the sibling _DataModel_releaseLabel
		decls.add( _Tag_label.intersection(_DataModel_releaseLabel).no() );
		//_Tag_label must be disjoint from the sibling _DataConstraint_language
		decls.add( _Tag_label.intersection(_DataConstraint_language).no() );
		//_Tag_label must be disjoint from the sibling _DataConstraint_content
		decls.add( _Tag_label.intersection(_DataConstraint_content).no() );
		//_Tag_label must be disjoint from the sibling _Tag_URI
		decls.add( _Tag_label.intersection(_Tag_URI).no() );
		//_Tag_label must be disjoint from the sibling _CatalogueElement_label
		decls.add( _Tag_label.intersection(_CatalogueElement_label).no() );
		//_Tag_label must be disjoint from the sibling _CatalogueElement_GUID
		decls.add( _Tag_label.intersection(_CatalogueElement_GUID).no() );

		//constraints for _Tag_URI
		//_Tag_URI is a kind of _String
		decls.add( _Tag_URI.in( _String ) );
		//_Tag_URI must be disjoint from the sibling _DataModel_releaseLabel
		decls.add( _Tag_URI.intersection(_DataModel_releaseLabel).no() );
		//_Tag_URI must be disjoint from the sibling _DataConstraint_language
		decls.add( _Tag_URI.intersection(_DataConstraint_language).no() );
		//_Tag_URI must be disjoint from the sibling _DataConstraint_content
		decls.add( _Tag_URI.intersection(_DataConstraint_content).no() );
		//_Tag_URI must be disjoint from the sibling _Tag_label
		decls.add( _Tag_URI.intersection(_Tag_label).no() );
		//_Tag_URI must be disjoint from the sibling _CatalogueElement_label
		decls.add( _Tag_URI.intersection(_CatalogueElement_label).no() );
		//_Tag_URI must be disjoint from the sibling _CatalogueElement_GUID
		decls.add( _Tag_URI.intersection(_CatalogueElement_GUID).no() );

		//constraints for _CatalogueElement_label
		//_CatalogueElement_label is a kind of _String
		decls.add( _CatalogueElement_label.in( _String ) );
		//_CatalogueElement_label must be disjoint from the sibling _DataModel_releaseLabel
		decls.add( _CatalogueElement_label.intersection(_DataModel_releaseLabel).no() );
		//_CatalogueElement_label must be disjoint from the sibling _DataConstraint_language
		decls.add( _CatalogueElement_label.intersection(_DataConstraint_language).no() );
		//_CatalogueElement_label must be disjoint from the sibling _DataConstraint_content
		decls.add( _CatalogueElement_label.intersection(_DataConstraint_content).no() );
		//_CatalogueElement_label must be disjoint from the sibling _Tag_label
		decls.add( _CatalogueElement_label.intersection(_Tag_label).no() );
		//_CatalogueElement_label must be disjoint from the sibling _Tag_URI
		decls.add( _CatalogueElement_label.intersection(_Tag_URI).no() );
		//_CatalogueElement_label must be disjoint from the sibling _CatalogueElement_GUID
		decls.add( _CatalogueElement_label.intersection(_CatalogueElement_GUID).no() );

		//constraints for _CatalogueElement_GUID
		//_CatalogueElement_GUID is a kind of _String
		decls.add( _CatalogueElement_GUID.in( _String ) );
		//_CatalogueElement_GUID must be disjoint from the sibling _DataModel_releaseLabel
		decls.add( _CatalogueElement_GUID.intersection(_DataModel_releaseLabel).no() );
		//_CatalogueElement_GUID must be disjoint from the sibling _DataConstraint_language
		decls.add( _CatalogueElement_GUID.intersection(_DataConstraint_language).no() );
		//_CatalogueElement_GUID must be disjoint from the sibling _DataConstraint_content
		decls.add( _CatalogueElement_GUID.intersection(_DataConstraint_content).no() );
		//_CatalogueElement_GUID must be disjoint from the sibling _Tag_label
		decls.add( _CatalogueElement_GUID.intersection(_Tag_label).no() );
		//_CatalogueElement_GUID must be disjoint from the sibling _Tag_URI
		decls.add( _CatalogueElement_GUID.intersection(_Tag_URI).no() );
		//_CatalogueElement_GUID must be disjoint from the sibling _CatalogueElement_label
		decls.add( _CatalogueElement_GUID.intersection(_CatalogueElement_label).no() );

		//constraints for _CatalogueElement_createdByUser
		//_CatalogueElement_createdByUser is a kind of _Integer
		decls.add( _CatalogueElement_createdByUser.in( _Integer ) );
		//_CatalogueElement_createdByUser must be disjoint from the sibling _Relationship_type
		decls.add( _CatalogueElement_createdByUser.intersection(_Relationship_type).no() );

		//constraints for _Relationship_type
		//_Relationship_type is a kind of _Integer
		decls.add( _Relationship_type.in( _Integer ) );
		//_Relationship_type must be disjoint from the sibling _CatalogueElement_createdByUser
		decls.add( _Relationship_type.intersection(_CatalogueElement_createdByUser).no() );

		//constraints for _DataModel
		//_DataModel is a kind of _CatalogueElement
		decls.add( _DataModel.in( _CatalogueElement ) );
		//_DataModel must be disjoint from the sibling _DataClass
		decls.add( _DataModel.intersection(_DataClass).no() );
		//_DataModel must be disjoint from the sibling _DataItem
		decls.add( _DataModel.intersection(_DataItem).no() );
		//_DataModel must be disjoint from the sibling _DataType
		decls.add( _DataModel.intersection(_DataType).no() );
		//_DataModel must be disjoint from the sibling _EnumValue
		decls.add( _DataModel.intersection(_EnumValue).no() );

		//constraints for _DataClass
		//_DataClass is a kind of _CatalogueElement
		decls.add( _DataClass.in( _CatalogueElement ) );
		//_DataClass must be disjoint from the sibling _DataModel
		decls.add( _DataClass.intersection(_DataModel).no() );
		//_DataClass must be disjoint from the sibling _DataItem
		decls.add( _DataClass.intersection(_DataItem).no() );
		//_DataClass must be disjoint from the sibling _DataType
		decls.add( _DataClass.intersection(_DataType).no() );
		//_DataClass must be disjoint from the sibling _EnumValue
		decls.add( _DataClass.intersection(_EnumValue).no() );

		//constraints for _DataItem
		//_DataItem is a kind of _CatalogueElement
		decls.add( _DataItem.in( _CatalogueElement ) );
		//_DataItem must be disjoint from the sibling _DataModel
		decls.add( _DataItem.intersection(_DataModel).no() );
		//_DataItem must be disjoint from the sibling _DataClass
		decls.add( _DataItem.intersection(_DataClass).no() );
		//_DataItem must be disjoint from the sibling _DataType
		decls.add( _DataItem.intersection(_DataType).no() );
		//_DataItem must be disjoint from the sibling _EnumValue
		decls.add( _DataItem.intersection(_EnumValue).no() );

		//constraints for _DataConstraint

		//constraints for _ReferenceType
		//_ReferenceType is a kind of _DataType
		decls.add( _ReferenceType.in( _DataType ) );
		//_ReferenceType must be disjoint from the sibling _PrimitiveType
		decls.add( _ReferenceType.intersection(_PrimitiveType).no() );
		//_ReferenceType must be disjoint from the sibling _Enumeration
		decls.add( _ReferenceType.intersection(_Enumeration).no() );

		//constraints for _PrimitiveType
		//_PrimitiveType is a kind of _DataType
		decls.add( _PrimitiveType.in( _DataType ) );
		//_PrimitiveType must be disjoint from the sibling _ReferenceType
		decls.add( _PrimitiveType.intersection(_ReferenceType).no() );
		//_PrimitiveType must be disjoint from the sibling _Enumeration
		decls.add( _PrimitiveType.intersection(_Enumeration).no() );

		//constraints for _Relationship

		//constraints for _Tag

		//constraints for _EnumValue
		//_EnumValue is a kind of _CatalogueElement
		decls.add( _EnumValue.in( _CatalogueElement ) );
		//_EnumValue must be disjoint from the sibling _DataModel
		decls.add( _EnumValue.intersection(_DataModel).no() );
		//_EnumValue must be disjoint from the sibling _DataClass
		decls.add( _EnumValue.intersection(_DataClass).no() );
		//_EnumValue must be disjoint from the sibling _DataItem
		decls.add( _EnumValue.intersection(_DataItem).no() );
		//_EnumValue must be disjoint from the sibling _DataType
		decls.add( _EnumValue.intersection(_DataType).no() );

		//constraints for _Enumeration
		//_Enumeration is a kind of _DataType
		decls.add( _Enumeration.in( _DataType ) );
		//_Enumeration must be disjoint from the sibling _ReferenceType
		decls.add( _Enumeration.intersection(_ReferenceType).no() );
		//_Enumeration must be disjoint from the sibling _PrimitiveType
		decls.add( _Enumeration.intersection(_PrimitiveType).no() );

		//constraints for _False
		//_False is a kind of _Boolean
		decls.add( _False.in( _Boolean ) );
		//_False must be disjoint from the sibling _True
		decls.add( _False.intersection(_True).no() );

		//constraints for _True
		//_True is a kind of _Boolean
		decls.add( _True.in( _Boolean ) );
		//_True must be disjoint from the sibling _False
		decls.add( _True.intersection(_False).no() );

		//constraints for _relatedTo_ReferenceType_to_ReferenceType_relatedTo
		//declare the binary relation AB as a function of A B
		//declare the multiplicity contraints of the binary relation _relatedTo_ReferenceType_to_ReferenceType_relatedTo
		decls.add (_relatedTo_ReferenceType_to_ReferenceType_relatedTo.function(_ReferenceType , _DataClass ));

		//for every A there is one AB and A.AB is a B 
		final Variable _relatedto_referencetype_to_referencetype_relatedto_type4 = Variable.unary("_relatedto_referencetype_to_referencetype_relatedto_type4");
		decls.add ( _relatedto_referencetype_to_referencetype_relatedto_type4.join( _relatedTo_ReferenceType_to_ReferenceType_relatedTo ).one().and( _relatedto_referencetype_to_referencetype_relatedto_type4.join(_relatedTo_ReferenceType_to_ReferenceType_relatedTo).in(_DataClass ) ).forAll(_relatedto_referencetype_to_referencetype_relatedto_type4.oneOf(_ReferenceType)) );


		//constraints for _type_EnumValue_to_EnumValue_type
		//declare the binary relation AB as a function of A B
		//declare the multiplicity contraints of the binary relation _type_EnumValue_to_EnumValue_type
		decls.add (_type_EnumValue_to_EnumValue_type.function(_EnumValue , _PrimitiveType ));

		//for every A there is one AB and A.AB is a B 
		final Variable _type_enumvalue_to_enumvalue_type_type5 = Variable.unary("_type_enumvalue_to_enumvalue_type_type5");
		decls.add ( _type_enumvalue_to_enumvalue_type_type5.join( _type_EnumValue_to_EnumValue_type ).one().and( _type_enumvalue_to_enumvalue_type_type5.join(_type_EnumValue_to_EnumValue_type).in(_PrimitiveType ) ).forAll(_type_enumvalue_to_enumvalue_type_type5.oneOf(_EnumValue)) );


		//constraints for _OrderedValues_Enumeration_to_Enumeration_OrderedValues
		//declare the multiplicity contraints of the relation
		decls.add (_OrderedValues_Enumeration_to_Enumeration_OrderedValues.in( _Enumeration.product(_EnumValue) ) );

		//for every A  A.AB is a B
		final Variable _orderedvalues_enumeration_to_enumeration_orderedvalues_type6 = Variable.unary("_orderedvalues_enumeration_to_enumeration_orderedvalues_type6");
		decls.add ( _orderedvalues_enumeration_to_enumeration_orderedvalues_type6.join(_OrderedValues_Enumeration_to_Enumeration_OrderedValues).in(_EnumValue).forAll(_orderedvalues_enumeration_to_enumeration_orderedvalues_type6.oneOf(_Enumeration)) );

		//this binary relation is containment
		//the B may only exist if there is an A and an AB
		//TODO: create decls.add ( );

		//constraints for _type_DataItem_to_DataItem_type
		//decare the binary relation AB as a partialfunction of A B
		//declare the multiplicity contraints of the relation _type_DataItem_to_DataItem_type
		decls.add (_type_DataItem_to_DataItem_type.partialFunction(_DataItem , _DataType));

		//for every A A.AB is a B
		final Variable _type_dataitem_to_dataitem_type_type7 = Variable.unary("_type_dataitem_to_dataitem_type_type7");
		decls.add ( _type_dataitem_to_dataitem_type_type7.join(_type_DataItem_to_DataItem_type).in(_DataType).forAll(_type_dataitem_to_dataitem_type_type7.oneOf(_DataItem)) );


		//constraints for _extends_DataClass_to_DataClass_extends
		//decare the binary relation AB as a partialfunction of A B
		//declare the multiplicity contraints of the relation _extends_DataClass_to_DataClass_extends
		decls.add (_extends_DataClass_to_DataClass_extends.partialFunction(_DataClass , _DataClass));

		//for every A A.AB is a B
		final Variable _extends_dataclass_to_dataclass_extends_type8 = Variable.unary("_extends_dataclass_to_dataclass_extends_type8");
		decls.add ( _extends_dataclass_to_dataclass_extends_type8.join(_extends_DataClass_to_DataClass_extends).in(_DataClass).forAll(_extends_dataclass_to_dataclass_extends_type8.oneOf(_DataClass)) );


		//constraints for _contains_DataClass_to_DataClass_contains
		//declare the multiplicity contraints of the relation
		decls.add (_contains_DataClass_to_DataClass_contains.in( _DataClass.product(_DataClass) ) );

		//for every A  A.AB is a B
		final Variable _contains_dataclass_to_dataclass_contains_type9 = Variable.unary("_contains_dataclass_to_dataclass_contains_type9");
		decls.add ( _contains_dataclass_to_dataclass_contains_type9.join(_contains_DataClass_to_DataClass_contains).in(_DataClass).forAll(_contains_dataclass_to_dataclass_contains_type9.oneOf(_DataClass)) );


		//constraints for _defines_DataClass_to_DataClass_defines
		//declare the multiplicity contraints of the relation
		decls.add (_defines_DataClass_to_DataClass_defines.in( _DataClass.product(_DataItem) ) );

		//for every A  A.AB is a B
		final Variable _defines_dataclass_to_dataclass_defines_type10 = Variable.unary("_defines_dataclass_to_dataclass_defines_type10");
		decls.add ( _defines_dataclass_to_dataclass_defines_type10.join(_defines_DataClass_to_DataClass_defines).in(_DataItem).forAll(_defines_dataclass_to_dataclass_defines_type10.oneOf(_DataClass)) );

		//this binary relation is containment
		//the B may only exist if there is an A and an AB
		//TODO: create decls.add ( );

		//constraints for _declares_DataModel_to_DataModel_declares
		//declare the multiplicity contraints of the relation
		decls.add (_declares_DataModel_to_DataModel_declares.in( _DataModel.product(_DataClass) ) );

		//for every A  A.AB is a B
		final Variable _declares_datamodel_to_datamodel_declares_type11 = Variable.unary("_declares_datamodel_to_datamodel_declares_type11");
		decls.add ( _declares_datamodel_to_datamodel_declares_type11.join(_declares_DataModel_to_DataModel_declares).in(_DataClass).forAll(_declares_datamodel_to_datamodel_declares_type11.oneOf(_DataModel)) );

		//this binary relation is containment
		//the B may only exist if there is an A and an AB
		//TODO: create decls.add ( );

		//constraints for _owns_DataModel_to_DataModel_owns
		//declare the multiplicity contraints of the relation
		decls.add (_owns_DataModel_to_DataModel_owns.in( _DataModel.product(_DataType) ) );

		//for every A  A.AB is a B
		final Variable _owns_datamodel_to_datamodel_owns_type12 = Variable.unary("_owns_datamodel_to_datamodel_owns_type12");
		decls.add ( _owns_datamodel_to_datamodel_owns_type12.join(_owns_DataModel_to_DataModel_owns).in(_DataType).forAll(_owns_datamodel_to_datamodel_owns_type12.oneOf(_DataModel)) );

		//this binary relation is containment
		//the B may only exist if there is an A and an AB
		//TODO: create decls.add ( );

		//constraints for _finalised_DataModel_to_DataModel_finalised
		//declare the binary relation AB as a function of A B
		//declare the multiplicity contraints of the binary relation _finalised_DataModel_to_DataModel_finalised
		decls.add (_finalised_DataModel_to_DataModel_finalised.function(_DataModel , _Boolean ));

		//for every A there is one AB and A.AB is a B 
		final Variable _finalised_datamodel_to_datamodel_finalised_type13 = Variable.unary("_finalised_datamodel_to_datamodel_finalised_type13");
		decls.add ( _finalised_datamodel_to_datamodel_finalised_type13.join( _finalised_DataModel_to_DataModel_finalised ).one().and( _finalised_datamodel_to_datamodel_finalised_type13.join(_finalised_DataModel_to_DataModel_finalised).in(_Boolean ) ).forAll(_finalised_datamodel_to_datamodel_finalised_type13.oneOf(_DataModel)) );


		//constraints for _releaseLabel_DataModel_to_DataModel_releaseLabel
		//declare the binary relation AB as a function of A B
		//declare the multiplicity contraints of the binary relation _releaseLabel_DataModel_to_DataModel_releaseLabel
		decls.add (_releaseLabel_DataModel_to_DataModel_releaseLabel.function(_DataModel , _DataModel_releaseLabel ));

		//for every A there is one AB and A.AB is a B 
		final Variable _releaselabel_datamodel_to_datamodel_releaselabel_type14 = Variable.unary("_releaselabel_datamodel_to_datamodel_releaselabel_type14");
		decls.add ( _releaselabel_datamodel_to_datamodel_releaselabel_type14.join( _releaseLabel_DataModel_to_DataModel_releaseLabel ).one().and( _releaselabel_datamodel_to_datamodel_releaselabel_type14.join(_releaseLabel_DataModel_to_DataModel_releaseLabel).in(_DataModel_releaseLabel ) ).forAll(_releaselabel_datamodel_to_datamodel_releaselabel_type14.oneOf(_DataModel)) );


		//constraints for _language_DataConstraint_to_DataConstraint_language
		//declare the binary relation AB as a function of A B
		//declare the multiplicity contraints of the binary relation _language_DataConstraint_to_DataConstraint_language
		decls.add (_language_DataConstraint_to_DataConstraint_language.function(_DataConstraint , _DataConstraint_language ));

		//for every A there is one AB and A.AB is a B 
		final Variable _language_dataconstraint_to_dataconstraint_language_type15 = Variable.unary("_language_dataconstraint_to_dataconstraint_language_type15");
		decls.add ( _language_dataconstraint_to_dataconstraint_language_type15.join( _language_DataConstraint_to_DataConstraint_language ).one().and( _language_dataconstraint_to_dataconstraint_language_type15.join(_language_DataConstraint_to_DataConstraint_language).in(_DataConstraint_language ) ).forAll(_language_dataconstraint_to_dataconstraint_language_type15.oneOf(_DataConstraint)) );


		//constraints for _content_DataConstraint_to_DataConstraint_content
		//declare the binary relation AB as a function of A B
		//declare the multiplicity contraints of the binary relation _content_DataConstraint_to_DataConstraint_content
		decls.add (_content_DataConstraint_to_DataConstraint_content.function(_DataConstraint , _DataConstraint_content ));

		//for every A there is one AB and A.AB is a B 
		final Variable _content_dataconstraint_to_dataconstraint_content_type16 = Variable.unary("_content_dataconstraint_to_dataconstraint_content_type16");
		decls.add ( _content_dataconstraint_to_dataconstraint_content_type16.join( _content_DataConstraint_to_DataConstraint_content ).one().and( _content_dataconstraint_to_dataconstraint_content_type16.join(_content_DataConstraint_to_DataConstraint_content).in(_DataConstraint_content ) ).forAll(_content_dataconstraint_to_dataconstraint_content_type16.oneOf(_DataConstraint)) );


		//constraints for _label_Tag_to_Tag_label
		//decare the binary relation AB as a partialfunction of A B
		//declare the multiplicity contraints of the relation _label_Tag_to_Tag_label
		decls.add (_label_Tag_to_Tag_label.partialFunction(_Tag , _Tag_label));

		//for every A A.AB is a B
		final Variable _label_tag_to_tag_label_type17 = Variable.unary("_label_tag_to_tag_label_type17");
		decls.add ( _label_tag_to_tag_label_type17.join(_label_Tag_to_Tag_label).in(_Tag_label).forAll(_label_tag_to_tag_label_type17.oneOf(_Tag)) );


		//constraints for _URI_Tag_to_Tag_URI
		//decare the binary relation AB as a partialfunction of A B
		//declare the multiplicity contraints of the relation _URI_Tag_to_Tag_URI
		decls.add (_URI_Tag_to_Tag_URI.partialFunction(_Tag , _Tag_URI));

		//for every A A.AB is a B
		final Variable _uri_tag_to_tag_uri_type18 = Variable.unary("_uri_tag_to_tag_uri_type18");
		decls.add ( _uri_tag_to_tag_uri_type18.join(_URI_Tag_to_Tag_URI).in(_Tag_URI).forAll(_uri_tag_to_tag_uri_type18.oneOf(_Tag)) );


		//constraints for _constraints_CatalogueElement_to_CatalogueElement_constraints
		//declare the multiplicity contraints of the relation
		decls.add (_constraints_CatalogueElement_to_CatalogueElement_constraints.in( _CatalogueElement.product(_DataConstraint) ) );

		//for every A  A.AB is a B
		final Variable _constraints_catalogueelement_to_catalogueelement_constraints_type19 = Variable.unary("_constraints_catalogueelement_to_catalogueelement_constraints_type19");
		decls.add ( _constraints_catalogueelement_to_catalogueelement_constraints_type19.join(_constraints_CatalogueElement_to_CatalogueElement_constraints).in(_DataConstraint).forAll(_constraints_catalogueelement_to_catalogueelement_constraints_type19.oneOf(_CatalogueElement)) );

		//this binary relation is containment
		//the B may only exist if there is an A and an AB
		//TODO: create decls.add ( );

		//constraints for _tags_CatalogueElement_to_CatalogueElement_tags
		//declare the multiplicity contraints of the relation
		decls.add (_tags_CatalogueElement_to_CatalogueElement_tags.in( _CatalogueElement.product(_Tag) ) );

		//for every A  A.AB is a B
		final Variable _tags_catalogueelement_to_catalogueelement_tags_type20 = Variable.unary("_tags_catalogueelement_to_catalogueelement_tags_type20");
		decls.add ( _tags_catalogueelement_to_catalogueelement_tags_type20.join(_tags_CatalogueElement_to_CatalogueElement_tags).in(_Tag).forAll(_tags_catalogueelement_to_catalogueelement_tags_type20.oneOf(_CatalogueElement)) );

		//this binary relation is containment
		//the B may only exist if there is an A and an AB
		//TODO: create decls.add ( );

		//constraints for _label_CatalogueElement_to_CatalogueElement_label
		//declare the binary relation AB as a function of A B
		//declare the multiplicity contraints of the binary relation _label_CatalogueElement_to_CatalogueElement_label
		decls.add (_label_CatalogueElement_to_CatalogueElement_label.function(_CatalogueElement , _CatalogueElement_label ));

		//for every A there is one AB and A.AB is a B 
		final Variable _label_catalogueelement_to_catalogueelement_label_type21 = Variable.unary("_label_catalogueelement_to_catalogueelement_label_type21");
		decls.add ( _label_catalogueelement_to_catalogueelement_label_type21.join( _label_CatalogueElement_to_CatalogueElement_label ).one().and( _label_catalogueelement_to_catalogueelement_label_type21.join(_label_CatalogueElement_to_CatalogueElement_label).in(_CatalogueElement_label ) ).forAll(_label_catalogueelement_to_catalogueelement_label_type21.oneOf(_CatalogueElement)) );


		//constraints for _GUID_CatalogueElement_to_CatalogueElement_GUID
		//declare the binary relation AB as a function of A B
		//declare the multiplicity contraints of the binary relation _GUID_CatalogueElement_to_CatalogueElement_GUID
		decls.add (_GUID_CatalogueElement_to_CatalogueElement_GUID.function(_CatalogueElement , _CatalogueElement_GUID ));

		//for every A there is one AB and A.AB is a B 
		final Variable _guid_catalogueelement_to_catalogueelement_guid_type22 = Variable.unary("_guid_catalogueelement_to_catalogueelement_guid_type22");
		decls.add ( _guid_catalogueelement_to_catalogueelement_guid_type22.join( _GUID_CatalogueElement_to_CatalogueElement_GUID ).one().and( _guid_catalogueelement_to_catalogueelement_guid_type22.join(_GUID_CatalogueElement_to_CatalogueElement_GUID).in(_CatalogueElement_GUID ) ).forAll(_guid_catalogueelement_to_catalogueelement_guid_type22.oneOf(_CatalogueElement)) );


		//constraints for _createdByUser_CatalogueElement_to_CatalogueElement_createdByUser
		//declare the binary relation AB as a function of A B
		//declare the multiplicity contraints of the binary relation _createdByUser_CatalogueElement_to_CatalogueElement_createdByUser
		decls.add (_createdByUser_CatalogueElement_to_CatalogueElement_createdByUser.function(_CatalogueElement , _CatalogueElement_createdByUser ));

		//for every A there is one AB and A.AB is a B 
		final Variable _createdbyuser_catalogueelement_to_catalogueelement_createdbyuser_type23 = Variable.unary("_createdbyuser_catalogueelement_to_catalogueelement_createdbyuser_type23");
		decls.add ( _createdbyuser_catalogueelement_to_catalogueelement_createdbyuser_type23.join( _createdByUser_CatalogueElement_to_CatalogueElement_createdByUser ).one().and( _createdbyuser_catalogueelement_to_catalogueelement_createdbyuser_type23.join(_createdByUser_CatalogueElement_to_CatalogueElement_createdByUser).in(_CatalogueElement_createdByUser ) ).forAll(_createdbyuser_catalogueelement_to_catalogueelement_createdbyuser_type23.oneOf(_CatalogueElement)) );


		//constraints for _source_Relationship_to_Relationship_source
		//declare the binary relation AB as a function of A B
		//declare the multiplicity contraints of the binary relation _source_Relationship_to_Relationship_source
		decls.add (_source_Relationship_to_Relationship_source.function(_Relationship , _CatalogueElement ));

		//for every A there is one AB and A.AB is a B 
		final Variable _source_relationship_to_relationship_source_type24 = Variable.unary("_source_relationship_to_relationship_source_type24");
		decls.add ( _source_relationship_to_relationship_source_type24.join( _source_Relationship_to_Relationship_source ).one().and( _source_relationship_to_relationship_source_type24.join(_source_Relationship_to_Relationship_source).in(_CatalogueElement ) ).forAll(_source_relationship_to_relationship_source_type24.oneOf(_Relationship)) );


		//constraints for _target_Relationship_to_Relationship_target
		//declare the binary relation AB as a function of A B
		//declare the multiplicity contraints of the binary relation _target_Relationship_to_Relationship_target
		decls.add (_target_Relationship_to_Relationship_target.function(_Relationship , _CatalogueElement ));

		//for every A there is one AB and A.AB is a B 
		final Variable _target_relationship_to_relationship_target_type25 = Variable.unary("_target_relationship_to_relationship_target_type25");
		decls.add ( _target_relationship_to_relationship_target_type25.join( _target_Relationship_to_Relationship_target ).one().and( _target_relationship_to_relationship_target_type25.join(_target_Relationship_to_Relationship_target).in(_CatalogueElement ) ).forAll(_target_relationship_to_relationship_target_type25.oneOf(_Relationship)) );


		//constraints for _type_Relationship_to_Relationship_type
		//declare the binary relation AB as a function of A B
		//declare the multiplicity contraints of the binary relation _type_Relationship_to_Relationship_type
		decls.add (_type_Relationship_to_Relationship_type.function(_Relationship , _Relationship_type ));

		//for every A there is one AB and A.AB is a B 
		final Variable _type_relationship_to_relationship_type_type26 = Variable.unary("_type_relationship_to_relationship_type_type26");
		decls.add ( _type_relationship_to_relationship_type_type26.join( _type_Relationship_to_Relationship_type ).one().and( _type_relationship_to_relationship_type_type26.join(_type_Relationship_to_Relationship_type).in(_Relationship_type ) ).forAll(_type_relationship_to_relationship_type_type26.oneOf(_Relationship)) );


		return Formula.and(decls);
	}

	//the bounds methods is used only by the constructor, and sets the bounds for each relation of the model
	private final Bounds bounds(){
		//the number of atoms (taken from the fur model) 
		final int noAtoms = 140;
		final List<Object> atoms = new ArrayList<Object>(noAtoms);
		int intStartRange=atoms.size();
		for(int i = 0 ; i < 32 ; i++){
			atoms.add(java.lang.Integer.valueOf(1<<i));
		}
		for(int i = 0; i < 10 ; i++ ){
			atoms.add("_Integer"+i);
		}
		for(int i = 0; i < 10 ; i++ ){
			atoms.add("_String"+i);
		}
		for(int i = 0; i < 70 ; i++ ){
			atoms.add("_CatalogueElement"+i);
		}
		for(int i = 0; i < 2 ; i++ ){
			atoms.add("_Boolean"+i);
		}
		for(int i = 0; i < 10 ; i++ ){
			atoms.add("_DataConstraint"+i);
		}
		for(int i = 0; i < 10 ; i++ ){
			atoms.add("_Relationship"+i);
		}
		for(int i = 0; i < 10 ; i++ ){
			atoms.add("_Tag"+i);
		}
		final Universe u = new Universe(atoms);
		final TupleFactory f = u.factory();
		final Bounds b = new Bounds(u);
		for(int i = 0 ; i < 32 ; i++){
			b.boundExactly(1<<i, f.setOf(java.lang.Integer.valueOf(1<<i)));
		}
		b.bound(_Integer, f.range(f.tuple(atoms.get(intStartRange)), f.tuple(atoms.get(intStartRange+ 32-1 ))) );
		b.bound(_String, f.range(f.tuple("_String0") , f.tuple("_String"+(10-1) )) );
		b.bound(_CatalogueElement, f.range(f.tuple("_CatalogueElement0") , f.tuple("_CatalogueElement"+(70-1) )) );
		b.bound(_DataType , b.upperBound(_CatalogueElement) );
		b.bound(_Boolean, f.range(f.tuple("_Boolean0") , f.tuple("_Boolean"+(2-1) )) );
		b.bound(_DataModel_releaseLabel , b.upperBound(_String) );
		b.bound(_DataConstraint_language , b.upperBound(_String) );
		b.bound(_DataConstraint_content , b.upperBound(_String) );
		b.bound(_Tag_label , b.upperBound(_String) );
		b.bound(_Tag_URI , b.upperBound(_String) );
		b.bound(_CatalogueElement_label , b.upperBound(_String) );
		b.bound(_CatalogueElement_GUID , b.upperBound(_String) );
		b.bound(_CatalogueElement_createdByUser , b.upperBound(_Integer) );
		b.bound(_Relationship_type , b.upperBound(_Integer) );
		b.bound(_DataModel , b.upperBound(_CatalogueElement) );
		b.bound(_DataClass , b.upperBound(_CatalogueElement) );
		b.bound(_DataItem , b.upperBound(_CatalogueElement) );
		b.bound(_DataConstraint, f.range(f.tuple("_DataConstraint0") , f.tuple("_DataConstraint"+(10-1) )) );
		b.bound(_ReferenceType , b.upperBound(_DataType) );
		b.bound(_PrimitiveType , b.upperBound(_DataType) );
		b.bound(_Relationship, f.range(f.tuple("_Relationship0") , f.tuple("_Relationship"+(10-1) )) );
		b.bound(_Tag, f.range(f.tuple("_Tag0") , f.tuple("_Tag"+(10-1) )) );
		b.bound(_EnumValue , b.upperBound(_CatalogueElement) );
		b.bound(_Enumeration , b.upperBound(_DataType) );
		b.bound(_False , b.upperBound(_Boolean) );
		b.bound(_True , b.upperBound(_Boolean) );
		b.bound(_relatedTo_ReferenceType_to_ReferenceType_relatedTo, b.upperBound(_ReferenceType).product(b.upperBound(_DataClass)) );
		b.bound(_type_EnumValue_to_EnumValue_type, b.upperBound(_EnumValue).product(b.upperBound(_PrimitiveType)) );
		b.bound(_OrderedValues_Enumeration_to_Enumeration_OrderedValues, b.upperBound(_Enumeration).product(b.upperBound(_EnumValue)) );
		b.bound(_type_DataItem_to_DataItem_type, b.upperBound(_DataItem).product(b.upperBound(_DataType)) );
		b.bound(_extends_DataClass_to_DataClass_extends, b.upperBound(_DataClass).product(b.upperBound(_DataClass)) );
		b.bound(_contains_DataClass_to_DataClass_contains, b.upperBound(_DataClass).product(b.upperBound(_DataClass)) );
		b.bound(_defines_DataClass_to_DataClass_defines, b.upperBound(_DataClass).product(b.upperBound(_DataItem)) );
		b.bound(_declares_DataModel_to_DataModel_declares, b.upperBound(_DataModel).product(b.upperBound(_DataClass)) );
		b.bound(_owns_DataModel_to_DataModel_owns, b.upperBound(_DataModel).product(b.upperBound(_DataType)) );
		b.bound(_finalised_DataModel_to_DataModel_finalised, b.upperBound(_DataModel).product(b.upperBound(_Boolean)) );
		b.bound(_releaseLabel_DataModel_to_DataModel_releaseLabel, b.upperBound(_DataModel).product(b.upperBound(_DataModel_releaseLabel)) );
		b.bound(_language_DataConstraint_to_DataConstraint_language, b.upperBound(_DataConstraint).product(b.upperBound(_DataConstraint_language)) );
		b.bound(_content_DataConstraint_to_DataConstraint_content, b.upperBound(_DataConstraint).product(b.upperBound(_DataConstraint_content)) );
		b.bound(_label_Tag_to_Tag_label, b.upperBound(_Tag).product(b.upperBound(_Tag_label)) );
		b.bound(_URI_Tag_to_Tag_URI, b.upperBound(_Tag).product(b.upperBound(_Tag_URI)) );
		b.bound(_constraints_CatalogueElement_to_CatalogueElement_constraints, b.upperBound(_CatalogueElement).product(b.upperBound(_DataConstraint)) );
		b.bound(_tags_CatalogueElement_to_CatalogueElement_tags, b.upperBound(_CatalogueElement).product(b.upperBound(_Tag)) );
		b.bound(_label_CatalogueElement_to_CatalogueElement_label, b.upperBound(_CatalogueElement).product(b.upperBound(_CatalogueElement_label)) );
		b.bound(_GUID_CatalogueElement_to_CatalogueElement_GUID, b.upperBound(_CatalogueElement).product(b.upperBound(_CatalogueElement_GUID)) );
		b.bound(_createdByUser_CatalogueElement_to_CatalogueElement_createdByUser, b.upperBound(_CatalogueElement).product(b.upperBound(_CatalogueElement_createdByUser)) );
		b.bound(_source_Relationship_to_Relationship_source, b.upperBound(_Relationship).product(b.upperBound(_CatalogueElement)) );
		b.bound(_target_Relationship_to_Relationship_target, b.upperBound(_Relationship).product(b.upperBound(_CatalogueElement)) );
		b.bound(_type_Relationship_to_Relationship_type, b.upperBound(_Relationship).product(b.upperBound(_Relationship_type)) );

		return b;
	}

	//get method for _Integer
	public Relation get_Integer(){
		return _Integer;
	}

	//get method for _String
	public Relation get_String(){
		return _String;
	}

	//get method for _CatalogueElement
	public Relation get_CatalogueElement(){
		return _CatalogueElement;
	}

	//get method for _DataType
	public Relation get_DataType(){
		return _DataType;
	}

	//get method for _Boolean
	public Relation get_Boolean(){
		return _Boolean;
	}

	//get method for _DataModel_releaseLabel
	public Relation get_DataModel_releaseLabel(){
		return _DataModel_releaseLabel;
	}

	//get method for _DataConstraint_language
	public Relation get_DataConstraint_language(){
		return _DataConstraint_language;
	}

	//get method for _DataConstraint_content
	public Relation get_DataConstraint_content(){
		return _DataConstraint_content;
	}

	//get method for _Tag_label
	public Relation get_Tag_label(){
		return _Tag_label;
	}

	//get method for _Tag_URI
	public Relation get_Tag_URI(){
		return _Tag_URI;
	}

	//get method for _CatalogueElement_label
	public Relation get_CatalogueElement_label(){
		return _CatalogueElement_label;
	}

	//get method for _CatalogueElement_GUID
	public Relation get_CatalogueElement_GUID(){
		return _CatalogueElement_GUID;
	}

	//get method for _CatalogueElement_createdByUser
	public Relation get_CatalogueElement_createdByUser(){
		return _CatalogueElement_createdByUser;
	}

	//get method for _Relationship_type
	public Relation get_Relationship_type(){
		return _Relationship_type;
	}

	//get method for _DataModel
	public Relation get_DataModel(){
		return _DataModel;
	}

	//get method for _DataClass
	public Relation get_DataClass(){
		return _DataClass;
	}

	//get method for _DataItem
	public Relation get_DataItem(){
		return _DataItem;
	}

	//get method for _DataConstraint
	public Relation get_DataConstraint(){
		return _DataConstraint;
	}

	//get method for _ReferenceType
	public Relation get_ReferenceType(){
		return _ReferenceType;
	}

	//get method for _PrimitiveType
	public Relation get_PrimitiveType(){
		return _PrimitiveType;
	}

	//get method for _Relationship
	public Relation get_Relationship(){
		return _Relationship;
	}

	//get method for _Tag
	public Relation get_Tag(){
		return _Tag;
	}

	//get method for _EnumValue
	public Relation get_EnumValue(){
		return _EnumValue;
	}

	//get method for _Enumeration
	public Relation get_Enumeration(){
		return _Enumeration;
	}

	//get method for _False
	public Relation get_False(){
		return _False;
	}

	//get method for _True
	public Relation get_True(){
		return _True;
	}

	//get method for _relatedTo_ReferenceType_to_ReferenceType_relatedTo
	public Relation get_relatedTo_ReferenceType_to_ReferenceType_relatedTo(){
		return _relatedTo_ReferenceType_to_ReferenceType_relatedTo;
	}

	//get method for _type_EnumValue_to_EnumValue_type
	public Relation get_type_EnumValue_to_EnumValue_type(){
		return _type_EnumValue_to_EnumValue_type;
	}

	//get method for _OrderedValues_Enumeration_to_Enumeration_OrderedValues
	public Relation get_OrderedValues_Enumeration_to_Enumeration_OrderedValues(){
		return _OrderedValues_Enumeration_to_Enumeration_OrderedValues;
	}

	//get method for _type_DataItem_to_DataItem_type
	public Relation get_type_DataItem_to_DataItem_type(){
		return _type_DataItem_to_DataItem_type;
	}

	//get method for _extends_DataClass_to_DataClass_extends
	public Relation get_extends_DataClass_to_DataClass_extends(){
		return _extends_DataClass_to_DataClass_extends;
	}

	//get method for _contains_DataClass_to_DataClass_contains
	public Relation get_contains_DataClass_to_DataClass_contains(){
		return _contains_DataClass_to_DataClass_contains;
	}

	//get method for _defines_DataClass_to_DataClass_defines
	public Relation get_defines_DataClass_to_DataClass_defines(){
		return _defines_DataClass_to_DataClass_defines;
	}

	//get method for _declares_DataModel_to_DataModel_declares
	public Relation get_declares_DataModel_to_DataModel_declares(){
		return _declares_DataModel_to_DataModel_declares;
	}

	//get method for _owns_DataModel_to_DataModel_owns
	public Relation get_owns_DataModel_to_DataModel_owns(){
		return _owns_DataModel_to_DataModel_owns;
	}

	//get method for _finalised_DataModel_to_DataModel_finalised
	public Relation get_finalised_DataModel_to_DataModel_finalised(){
		return _finalised_DataModel_to_DataModel_finalised;
	}

	//get method for _releaseLabel_DataModel_to_DataModel_releaseLabel
	public Relation get_releaseLabel_DataModel_to_DataModel_releaseLabel(){
		return _releaseLabel_DataModel_to_DataModel_releaseLabel;
	}

	//get method for _language_DataConstraint_to_DataConstraint_language
	public Relation get_language_DataConstraint_to_DataConstraint_language(){
		return _language_DataConstraint_to_DataConstraint_language;
	}

	//get method for _content_DataConstraint_to_DataConstraint_content
	public Relation get_content_DataConstraint_to_DataConstraint_content(){
		return _content_DataConstraint_to_DataConstraint_content;
	}

	//get method for _label_Tag_to_Tag_label
	public Relation get_label_Tag_to_Tag_label(){
		return _label_Tag_to_Tag_label;
	}

	//get method for _URI_Tag_to_Tag_URI
	public Relation get_URI_Tag_to_Tag_URI(){
		return _URI_Tag_to_Tag_URI;
	}

	//get method for _constraints_CatalogueElement_to_CatalogueElement_constraints
	public Relation get_constraints_CatalogueElement_to_CatalogueElement_constraints(){
		return _constraints_CatalogueElement_to_CatalogueElement_constraints;
	}

	//get method for _tags_CatalogueElement_to_CatalogueElement_tags
	public Relation get_tags_CatalogueElement_to_CatalogueElement_tags(){
		return _tags_CatalogueElement_to_CatalogueElement_tags;
	}

	//get method for _label_CatalogueElement_to_CatalogueElement_label
	public Relation get_label_CatalogueElement_to_CatalogueElement_label(){
		return _label_CatalogueElement_to_CatalogueElement_label;
	}

	//get method for _GUID_CatalogueElement_to_CatalogueElement_GUID
	public Relation get_GUID_CatalogueElement_to_CatalogueElement_GUID(){
		return _GUID_CatalogueElement_to_CatalogueElement_GUID;
	}

	//get method for _createdByUser_CatalogueElement_to_CatalogueElement_createdByUser
	public Relation get_createdByUser_CatalogueElement_to_CatalogueElement_createdByUser(){
		return _createdByUser_CatalogueElement_to_CatalogueElement_createdByUser;
	}

	//get method for _source_Relationship_to_Relationship_source
	public Relation get_source_Relationship_to_Relationship_source(){
		return _source_Relationship_to_Relationship_source;
	}

	//get method for _target_Relationship_to_Relationship_target
	public Relation get_target_Relationship_to_Relationship_target(){
		return _target_Relationship_to_Relationship_target;
	}

	//get method for _type_Relationship_to_Relationship_type
	public Relation get_type_Relationship_to_Relationship_type(){
		return _type_Relationship_to_Relationship_type;
	}


	//indicates for _Integer
	public boolean get_IntegerIsSuper(){
		return true;
	}

	//indicates for _String
	public boolean get_StringIsSuper(){
		return true;
	}

	//indicates for _CatalogueElement
	public boolean get_CatalogueElementIsSuper(){
		return true;
	}

	//indicates for _DataType
	public boolean get_DataTypeIsSuper(){
		return true;
	}

	//indicates for _Boolean
	public boolean get_BooleanIsSuper(){
		return true;
	}

	//indicates for _DataModel_releaseLabel
	public boolean get_DataModel_releaseLabelIsSuper(){
		return false;
	}

	//indicates for _DataConstraint_language
	public boolean get_DataConstraint_languageIsSuper(){
		return false;
	}

	//indicates for _DataConstraint_content
	public boolean get_DataConstraint_contentIsSuper(){
		return false;
	}

	//indicates for _Tag_label
	public boolean get_Tag_labelIsSuper(){
		return false;
	}

	//indicates for _Tag_URI
	public boolean get_Tag_URIIsSuper(){
		return false;
	}

	//indicates for _CatalogueElement_label
	public boolean get_CatalogueElement_labelIsSuper(){
		return false;
	}

	//indicates for _CatalogueElement_GUID
	public boolean get_CatalogueElement_GUIDIsSuper(){
		return false;
	}

	//indicates for _CatalogueElement_createdByUser
	public boolean get_CatalogueElement_createdByUserIsSuper(){
		return false;
	}

	//indicates for _Relationship_type
	public boolean get_Relationship_typeIsSuper(){
		return false;
	}

	//indicates for _DataModel
	public boolean get_DataModelIsSuper(){
		return false;
	}

	//indicates for _DataClass
	public boolean get_DataClassIsSuper(){
		return false;
	}

	//indicates for _DataItem
	public boolean get_DataItemIsSuper(){
		return false;
	}

	//indicates for _DataConstraint
	public boolean get_DataConstraintIsSuper(){
		return false;
	}

	//indicates for _ReferenceType
	public boolean get_ReferenceTypeIsSuper(){
		return false;
	}

	//indicates for _PrimitiveType
	public boolean get_PrimitiveTypeIsSuper(){
		return false;
	}

	//indicates for _Relationship
	public boolean get_RelationshipIsSuper(){
		return false;
	}

	//indicates for _Tag
	public boolean get_TagIsSuper(){
		return false;
	}

	//indicates for _EnumValue
	public boolean get_EnumValueIsSuper(){
		return false;
	}

	//indicates for _Enumeration
	public boolean get_EnumerationIsSuper(){
		return false;
	}

	//indicates for _False
	public boolean get_FalseIsSuper(){
		return false;
	}

	//indicates for _True
	public boolean get_TrueIsSuper(){
		return false;
	}

	//indicates for _relatedTo_ReferenceType_to_ReferenceType_relatedTo
	public boolean get_relatedTo_ReferenceType_to_ReferenceType_relatedToIsSuper(){
		return false;
	}

	//indicates for _type_EnumValue_to_EnumValue_type
	public boolean get_type_EnumValue_to_EnumValue_typeIsSuper(){
		return false;
	}

	//indicates for _OrderedValues_Enumeration_to_Enumeration_OrderedValues
	public boolean get_OrderedValues_Enumeration_to_Enumeration_OrderedValuesIsSuper(){
		return false;
	}

	//indicates for _type_DataItem_to_DataItem_type
	public boolean get_type_DataItem_to_DataItem_typeIsSuper(){
		return false;
	}

	//indicates for _extends_DataClass_to_DataClass_extends
	public boolean get_extends_DataClass_to_DataClass_extendsIsSuper(){
		return false;
	}

	//indicates for _contains_DataClass_to_DataClass_contains
	public boolean get_contains_DataClass_to_DataClass_containsIsSuper(){
		return false;
	}

	//indicates for _defines_DataClass_to_DataClass_defines
	public boolean get_defines_DataClass_to_DataClass_definesIsSuper(){
		return false;
	}

	//indicates for _declares_DataModel_to_DataModel_declares
	public boolean get_declares_DataModel_to_DataModel_declaresIsSuper(){
		return false;
	}

	//indicates for _owns_DataModel_to_DataModel_owns
	public boolean get_owns_DataModel_to_DataModel_ownsIsSuper(){
		return false;
	}

	//indicates for _finalised_DataModel_to_DataModel_finalised
	public boolean get_finalised_DataModel_to_DataModel_finalisedIsSuper(){
		return false;
	}

	//indicates for _releaseLabel_DataModel_to_DataModel_releaseLabel
	public boolean get_releaseLabel_DataModel_to_DataModel_releaseLabelIsSuper(){
		return false;
	}

	//indicates for _language_DataConstraint_to_DataConstraint_language
	public boolean get_language_DataConstraint_to_DataConstraint_languageIsSuper(){
		return false;
	}

	//indicates for _content_DataConstraint_to_DataConstraint_content
	public boolean get_content_DataConstraint_to_DataConstraint_contentIsSuper(){
		return false;
	}

	//indicates for _label_Tag_to_Tag_label
	public boolean get_label_Tag_to_Tag_labelIsSuper(){
		return false;
	}

	//indicates for _URI_Tag_to_Tag_URI
	public boolean get_URI_Tag_to_Tag_URIIsSuper(){
		return false;
	}

	//indicates for _constraints_CatalogueElement_to_CatalogueElement_constraints
	public boolean get_constraints_CatalogueElement_to_CatalogueElement_constraintsIsSuper(){
		return false;
	}

	//indicates for _tags_CatalogueElement_to_CatalogueElement_tags
	public boolean get_tags_CatalogueElement_to_CatalogueElement_tagsIsSuper(){
		return false;
	}

	//indicates for _label_CatalogueElement_to_CatalogueElement_label
	public boolean get_label_CatalogueElement_to_CatalogueElement_labelIsSuper(){
		return false;
	}

	//indicates for _GUID_CatalogueElement_to_CatalogueElement_GUID
	public boolean get_GUID_CatalogueElement_to_CatalogueElement_GUIDIsSuper(){
		return false;
	}

	//indicates for _createdByUser_CatalogueElement_to_CatalogueElement_createdByUser
	public boolean get_createdByUser_CatalogueElement_to_CatalogueElement_createdByUserIsSuper(){
		return false;
	}

	//indicates for _source_Relationship_to_Relationship_source
	public boolean get_source_Relationship_to_Relationship_sourceIsSuper(){
		return false;
	}

	//indicates for _target_Relationship_to_Relationship_target
	public boolean get_target_Relationship_to_Relationship_targetIsSuper(){
		return false;
	}

	//indicates for _type_Relationship_to_Relationship_type
	public boolean get_type_Relationship_to_Relationship_typeIsSuper(){
		return false;
	}


	//get sub method for _Integer
	public List<Relation> get_IntegerGetAllSubRelations(){
		List<Relation> subRels = new ArrayList<Relation>();
		return subRels;
	}

	//get sub method for _String
	public List<Relation> get_StringGetAllSubRelations(){
		List<Relation> subRels = new ArrayList<Relation>();
		return subRels;
	}

	//get sub method for _CatalogueElement
	public List<Relation> get_CatalogueElementGetAllSubRelations(){
		List<Relation> subRels = new ArrayList<Relation>();
		subRels.add (_DataModel);
		subRels.add (_DataClass);
		subRels.add (_DataItem);
		subRels.add (_DataType);
		subRels.add (_ReferenceType);
		subRels.add (_PrimitiveType);
		subRels.add (_EnumValue);
		subRels.add (_Enumeration);
		return subRels;
	}

	//get sub method for _DataType
	public List<Relation> get_DataTypeGetAllSubRelations(){
		List<Relation> subRels = new ArrayList<Relation>();
		subRels.add (_ReferenceType);
		subRels.add (_PrimitiveType);
		subRels.add (_Enumeration);
		return subRels;
	}

	//get sub method for _Boolean
	public List<Relation> get_BooleanGetAllSubRelations(){
		List<Relation> subRels = new ArrayList<Relation>();
		subRels.add (_True);
		subRels.add (_False);
		return subRels;
	}


	//iterator hasNext method 
	public boolean hasNext(){
		return solutions.hasNext();
	}

	//iterator next method
	public FInstance next(){
		return new FInstance(this, solutions.next());
	}

	//iterator remove method
	public void remove(){
		throw new UnsupportedOperationException();
	}

	//iterable method
	public Iterator<FInstance> iterator(){
		return this;
	}

	public static void main(String[] args){
		ModelGenerator4Mcn model = new ModelGenerator4Mcn();

		System.out.println(model.declaration());

		while (model.hasNext()){
			System.out.println("instance: "+model.next());
		}
		System.out.println(model.declaration());

	}

}

