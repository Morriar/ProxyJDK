package com.sun.tools.javac.file;

import java.io.IOException;
import java.net.URI;

import javax.tools.SimpleJavaFileObject;

public class FromStringJavaObject extends SimpleJavaFileObject {
	
	private String contents = null;
	
	public FromStringJavaObject(String className, String contents) throws Exception{
	    		super(new URI(className), Kind.SOURCE);
	
	    		this.contents = contents;
	    }
	public CharSequence getCharContent(boolean ignoreEncodingErrors) throws IOException {
	    		return contents;
	    }
}