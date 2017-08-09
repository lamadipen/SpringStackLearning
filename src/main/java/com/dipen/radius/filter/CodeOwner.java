package com.dipen.radius.filter;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface CodeOwner {
	public String name();
	public String action();
	
	/*
	 * Usage
	 * @CodeOwner(name="dipen",action="view")
	 * public void anyMethod(){
	 * 
	 * }
	 */
}
