package com.my.custom.annotations.main;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import com.my.custom.annotations.MethodInfo;
import com.my.custom.annotations.VariableInfo;

public class AnnotationExample {
	
		@VariableInfo(modifier="public",version=2, comments="These are my own comments.")
	    public String testVar;
	 
	    @Override
	    @MethodInfo(author = "Pankaj", comments = "Main method", date = "Nov 17 2012", revision = 1)
	    public String toString() {
	        return "Overriden toString method";
	    }
	 
	    @Deprecated
	    @MethodInfo(comments = "deprecated method", date = "Nov 17 2012", myMetaData = "")
	    public static void oldMethod() {
	        System.out.println("old method, don't use it.");
	    }
	 
	    @SuppressWarnings({ "unchecked", "deprecation" })
	    @MethodInfo(author = "Imran", comments = "Main method", date = "Nov 17 2012", revision = 10, myMetaData = "This is my custom metadata")
	    public static void genericsTest() throws FileNotFoundException {
	        List l = new ArrayList();
	        l.add("abc");
	        oldMethod();
	    }
	 


}
