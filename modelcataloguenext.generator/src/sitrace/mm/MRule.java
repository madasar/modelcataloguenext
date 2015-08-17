package sitrace.mm;

//meta class for a model transformation rule
import java.util.ArrayList;
import java.util.List;

import java.util.HashSet;
import java.util.Set;

import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;
import java.io.StringWriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.File;
import java.io.IOException;
import java.io.StringWriter;

import com.sun.tools.javac.Main;

public class MRule{
	
	private Class source;
	private Class target;

	private String sourceName;
	private String targetName;

	private MRule parentRule;
	private MTransformation transformation;

	private Set<MRule> subRules;
	
	private int ruleNo;
	private boolean check;
	private String checkMethodName;
	private boolean loadmm;
	private String nsuri;
	private String uriFrag;

	private String metamodelpath;
	private String mmelementname;
	private boolean loaded;

	private boolean createeclassinstace;

	public static int nextRule=0;
	public static int nextRule(){
		return nextRule++;
	}

	public void setUriFragment(String uf){
		uriFrag=uf;
	}
	public String getUriFragment(){
		return uriFrag;
	}

	public boolean createString(){
		return (target == String.class ? true : false );
	}


	public boolean createInteger(){
		return (target == Integer.class ? true : false );
	}


	public boolean createBoolean(){
		return (target == Boolean.class ? true : false );
	}

	private Set<MSetProperty> setProperties;

	public Set<MSetProperty> getSetProperties(){
		Set<MSetProperty> sProperties = new HashSet<MSetProperty>();
		sProperties.addAll(setProperties);
		for(MRule superRule: getSuperConvertors()){
			sProperties.addAll(superRule.getSetProperties());
		}
		return sProperties;
	}

	public void addSetProperty(MSetProperty setProperty){
		setProperties.add(setProperty);
	}

	private Set<MRule> subConvertors;

	public Set<MRule> getSubConvertors(){
		if (subConvertors==null){
			//create new set at subConvertors
			subConvertors= new HashSet<MRule>();
			//for all rules of the transformation 
			for(MRule rule:getAllRules())
			//if 'this' is in a 'rule's super convertor add 'rule' to sub convertors 
				if (rule.getSuperConvertors().contains(this)){
					subConvertors.add(rule);
				}
			return subConvertors;
		}
			else 
		return subConvertors;
	}

	private Set<MRule> superConvertors;

	public Set<MRule> getSuperConvertors(){
		return superConvertors;
	}

	public void addSuperConvertor(MRule superConv){
		superConvertors.add(superConv);
	}

	public String getCanonicalName(){
		return this.getPackage()+"."+this.getName();
	}

	public Set<MRule> getSubRules(){
		return subRules;
	}

	public boolean createEClassInstance(){
		return createeclassinstace;
	}

	public void createEClassInstance(boolean b){
		 createeclassinstace=b;
	}

	public String getMMElementName(){
		return mmelementname;
	}

	public void setMMElementName(String mn){
		mmelementname=mn;
	}
	
	
	public String getMMPath(){
		return metamodelpath;
	}

	public void setMMPath(String fp){
		metamodelpath=fp;
	}

	public String getMMnsURI(){
		return nsuri;
	}

	public void setMMnsURI(String fp){
		nsuri=fp;
	}

	public String getSourceElementName(){
		return sourceName;
	}
	
	public String getTargetElementName(){
		return targetName;
	}

	public void setTargetElementName(String tn){
		targetName=tn;
	}

	public void setSourceElementName(String sn){
		sourceName=sn;
	}

	public void setLoadMetaModel(boolean t){
		loadmm=t;
	}

	public boolean loadMetaModel(){
		return loadmm;
	}


	public void setCheckTupleType(boolean t){
		check=t;
	}

	public boolean checkTupleType(){
		return check;
	}

	public String getCheckMethodName(){
		return checkMethodName;
	}

	public void setCheckMethodName(String c){
		 checkMethodName = c;
	}

	public MRule(Class s, Class t){
		source = s;
		target = t;
		checkMethodName = null;
		parentRule = null;
		ruleNo = nextRule();
		subRules = new HashSet<MRule>();
		check=false;
		sourceName="";
		targetName="";
		loaded = false;
		uriFrag = null;
		setProperties = new HashSet<MSetProperty>();
		superConvertors = new  HashSet<MRule>();
	}

	public Set<MRule> getAllRules(){
		Set<MRule> all = new HashSet<MRule>();
		all.addAll(subRules);
		for (MRule metarule: subRules){
			all.addAll(metarule.getAllRules());
		}
		return all;
	}

	public String getPackage(){
		return getTransformation().getPackage();
	}

	public String getDirectory(){
		return getTransformation().getDirectory();
	}


	public MTransformation getTransformation(){
		if (transformation == null)
			return parentRule.getTransformation();
		else
			return transformation;
	}

	public void setTransformation(MTransformation mt){
		 transformation=mt;
	}

	public void addSubRule(MRule submetarule){
		submetarule.setParentRule(this);
		subRules.add(submetarule);
	}
		
	public void setParentRule(MRule metarule){
		parentRule = metarule;
	}

	public String getName(){
		return getNameAsPackage()+ruleNo;
	}


	public String toString(){
		return getName();
	}

	public String getNameAsPackage(){
		return getFromName()+"2"+getToName();
	}

	public String getToName(){
		return target.getSimpleName()+getTargetElementName();
	}

	public String getFromName(){
		return source.getSimpleName()+getSourceElementName();
	}

	public String getFileName(){
		return getName()+".java";
	}

	public void setSource(Class s){
		source = s;
	}

	public void setTarget(Class t){
		target = t;
	}

	public Class getSource(){
		return source;
	}

	public Class getTarget(){
		return target;
	}

	public String getCode(){
		// create a new instance of the engine & initialize the engine
		VelocityEngine ve = new VelocityEngine();
		try{ ve.init();	} catch (Exception e){System.err.println("could not initialise Velocity engine");}
	
		//setup Velocity context for data
		VelocityContext context = new VelocityContext();
		context.put("MRule", this);

		//merge
		StringWriter result = new StringWriter();
		String charset = java.nio.charset.Charset.defaultCharset().name();
		try{
			ve.mergeTemplate("./src/sitrace/mm/MRule.template.vm", charset,context,result);
		} catch (Exception e){ System.err.println("merging template failed"); }
		
		return result.toString();
	}	


	private void writeToDirectory(String dir) throws IOException{
		File d = new File( dir ); 
		if ( d.isDirectory() && d.canWrite() ){
			(new File(dir+"/"+this.getPackage())).mkdir();
			BufferedWriter out = new BufferedWriter( new FileWriter( dir+"/"+this.getPackage()+"/"+this.getFileName() ) );
 			out.write( this.getCode() );
			out.close();
		}else 
			throw new IOException("Could not write rule to directory: "+dir);
	}

	protected void writeToDirectory() throws IOException{
		this.writeToDirectory(this.getDirectory());
	}

	public Class getRuleClass(){
		if (!loaded) this.loadGenerator();
			try {
				return Class.forName(this.getPackage()+"."+this.getName());
			}catch (Exception e){
				System.out.println(e);
				System.out.println("could not load generated rule, make sure "+this.getDirectory()+" is in the class path" );
			}
		
		return null;
	}


	private void loadGenerator(){			
		try{
			this.writeToDirectory();
		}catch (Exception e){
			System.out.println(e);
			System.out.println("could not create model generator" );
		}

		//run the javac on the out (./generated/?.java)  file
        	Main compiler = new Main();
		String[] compOpts = {"-cp", "lib/org.eclipse.emf.ecore.xmi_2.5.0.v200906151043.jar:lib/org.eclipse.emf.common_2.5.0.v200906151043.jar:lib/org.eclipse.emf.ecore_2.5.0.v200906151043.jar:generated/:lib/kodkod.jar:src/", this.getDirectory()+"/"+this.getPackage()+"/"+this.getFileName()}; 
		compiler.compile(compOpts);

		//load the resulting class
		Class class_ = null;
		try {
			class_ = Class.forName(this.getPackage()+"."+this.getName());
			loaded = true;
		}catch (Exception e){
			System.out.println(e);
			System.out.println("could not load generated class, make sure "+this.getDirectory()+" is in the class path" );
		}

		

	}


}
