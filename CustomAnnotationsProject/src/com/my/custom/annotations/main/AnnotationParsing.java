package com.my.custom.annotations.main;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

import com.my.custom.annotations.MethodInfo;

public class AnnotationParsing {

	 public static void main(String[] args) {
	        try {
	            for (Method method : AnnotationParsing.class
	                    .getClassLoader()
	                    .loadClass(("com.my.custom.annotations.main.AnnotationExample"))
	                    .getMethods()) {
	                // checks if MethodInfo annotation is present for the method
	                if (method.isAnnotationPresent(MethodInfo.class)) {
	                    try {
	                        // iterates all the annotations available in the method
	                        for (Annotation anno : method.getDeclaredAnnotations()) {
	                            System.out.println("Annotation in Method '"
	                                    + method + "' : " + anno);
	                        }
	                        MethodInfo methodAnno = method.getAnnotation(MethodInfo.class);
	                        if (methodAnno.revision() == 1) {
	                            System.out.println("Method with revision no 1 = "
	                                    + method);
	                        }
	                        
	                        if(methodAnno.myMetaData().equals("This is my custom metadata")) {
	                        	System.out.println("Method with my meta Data Here: Imran");
	                        } else{
	                        	System.out.println("This is a different story");
	                        }
	 
	                    } catch (Throwable ex) {
	                        ex.printStackTrace();
	                    }
	                }
	            }
	        } catch (SecurityException | ClassNotFoundException e) {
	            e.printStackTrace();
	        }
	    }
}
