package com.github.Cka3o4Huk;

import java.util.List;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

import com.narmnevis.range.Range;

@Mojo(name = "generate")
public class RangeMojo extends AbstractMojo {

	public static class Field{
		String name;
		String type;
	}
	
	@Parameter
	List<Field> fields;
	
	@Parameter(defaultValue="out.csv")
	String outputFileName;
	
	@Parameter(defaultValue="csv")
	String outputFormat;
	
	@Parameter(defaultValue="50")
	Integer size;
	
    @Parameter(defaultValue = "false")
    boolean skip;
    
	@Override
	public void execute() throws MojoExecutionException, MojoFailureException {
        if(skip){
            return;
        }
        
        if (fields == null ) {
            getLog().error("No fields defined.");
            return;
        }
        
		Range rnd = new Range();
		
		for(Field field : fields){
			rnd = rnd.withDataSpec(field.name, field.type);
		}
		
		rnd = rnd.withOutputFormat(outputFormat);
		rnd = rnd.withLocation(outputFileName);
		rnd = rnd.withSize(size);
		
		rnd.generate();
	}

}
