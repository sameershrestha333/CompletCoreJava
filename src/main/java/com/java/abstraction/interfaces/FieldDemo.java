package com.java.abstraction.interfaces;
interface FieldDemo
{
	int i = 0;
	//By default, field is public, static and final

	//Following statements give compile time errors

	private double d = 10;
	protected long l = 15;

	//You can't use any other modifiers other than public, static and final
}