package sitrace.mm;

import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;

import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.File;
import java.io.IOException;
import java.io.StringWriter;

import sitrace.Rule;
import sitrace.Transformer;
import sitrace.TracerTransformer;
//meta class for a model transformation 

public class MTransformation{

	//ordered list of rulesf
	private Set<MRule> rules;
	private MRule rootRule;
	private Class instanceGen;
	private String directory;


	public Transformer getTransformer(){
		try{
			this.writeAllToDirectory();
		}
		catch(IOException e){}
		//load each rule into a list (ask each rule for its .class)
		List<java.lang.Class<? extends Rule>> ruleClasses = new ArrayList<java.lang.Class<? extends Rule>>();
		for (MRule r: getAllRules())
			ruleClasses.add(r.getRuleClass());

		//create a new transformer with the list
		Transformer transformer = new TracerTransformer(ruleClasses);
			 
		return transformer;
	}

	public Class getRootRuleClass(){
		return rootRule.getRuleClass();
	}

	public MTransformation(){
		instanceGen=null;
		rules = new HashSet<MRule>();
		rootRule=null;
		//default directory
		directory = "./generated";
	}
	public void setDirectory(String dir){
		directory = dir;
	}

	public String getCanonicalName(){
		return this.getPackage()+"."+this.getName();
	}

	public String getDirectory(){
		return directory;
	}

	public Class getInstanceGenenerator(){
		return instanceGen;
	}

	public void setInstanceGenerator(Class mg){
		instanceGen=mg;
	}

	public boolean hasInstanceGenerator(){
		return (instanceGen == null ? false : true);
	}

	public Set<MRule> getAllRules(){
		Set<MRule> result = new HashSet<MRule>();
		result.addAll(rules);
		for (MRule metarule: rules){
			result.addAll(metarule.getAllRules());
		}
		return result;
	}

	public void addRule(MRule metarule){
		rules.add(metarule);
		metarule.setTransformation(this);
		if (rootRule==null) 
			setRootRule(metarule);
	}

	public void addAllRules(List<MRule> metarules){
		for(MRule metarule:metarules)
			addRule(metarule);
	}
	
	public MRule getRootRule(){
		return rootRule;
	}

	public void setRootRule(MRule metarule){
		rootRule = metarule;
	}

	public String getPackage(){
		return getRootRule().getNameAsPackage().toLowerCase();
	}

	public String getName(){
		return "Main4"+rootRule.getName();
	}

	public String getFileName(){
		return getName()+".java";
	}

	public String getCode(){
		// create a new instance of the engine & initialize the engine
		VelocityEngine ve = new VelocityEngine();
		try{ ve.init();	} catch (Exception e){System.err.println("could not initialise Velocity engine");}
	
		//setup Velocity context for data
		VelocityContext context = new VelocityContext();
		context.put("MTransformation", this);

		//merge
		StringWriter result = new StringWriter();
		String charset = java.nio.charset.Charset.defaultCharset().name();
		try{
			ve.mergeTemplate("./src/sitrace/mm/MTransformation.template.vm", charset,context,result);
		} catch (Exception e){ System.err.println("merging template failed"); }
		
		return result.toString();
	} 

	private void writeAllToDirectory(String dir) throws IOException{
		File d = new File( dir ); 
		if ( d.isDirectory() && d.canWrite() ){
			(new File(dir+"/"+this.getPackage())).mkdir();
			BufferedWriter out = new BufferedWriter( new FileWriter( dir+"/"+this.getPackage()+"/"+this.getFileName() ) );
 			out.write( this.getCode() );
			out.close();
			for(MRule mrule : this.getAllRules()){
				mrule.writeToDirectory();
			}
		}else 
			throw new IOException("Could not write transformation to directory: "+dir);
	}

	public void writeAllToDirectory() throws IOException{
		this.writeAllToDirectory(this.getDirectory());
	}


}
