package com.javaintroduction;
import java.math.BigInteger;
import java.math.BigDecimal;

public class ObjDataTypeDemo01 {
	//pre-defineed obj dt
	String s="akash";
	String str=new String("java");//constructors
	StringBuffer s1=new StringBuffer("hello");
	StringBuilder s2=new StringBuilder("vcube");
	
	//user-defined
	BigInteger b1=new BigInteger("4982995981956512652962165396526519486512015852598456556231652");
	BigInteger bi1=new BigInteger("985264965526352652652652526952652635269356935");
	BigDecimal b2=new BigDecimal("5502.55");
	BigDecimal bd2=new BigDecimal("5455.544");

	
	//wrapper obj
	//auto-boxing
	Integer i1=100;
	Character c1='A';
	Float f1=34.45f;
	Double d1=55.4d;
	
	//auto-unboxing
	int i2=i1;
	char c2=c1;
	float f2=f1;
	double d2=d1;
	
	Integer i5=100;
	Integer i6=100;
	
	Integer i7=130;
	Integer i8=130;
	
	

	public static void main(String[] args) {
    System.out.println("main method started");
    ObjDataTypeDemo01 o=new ObjDataTypeDemo01();
    
    System.out.println(o.s);
    System.out.println(o.str);
    System.out.println(o.s1);
    System.out.println(o.s2);
    
    System.out.println(o.b1);
    System.out.println(o.b1.add(o.bi1));
    System.out.println(o.b2.add(o.bd2));
    System.out.println(o.b2);
    
    System.out.println(o.i1);
    System.out.println(o.c1);
    System.out.println(o.f1);
    System.out.println(o.d1);
    
    //wrapper caching: whenever we create wrapper obj data with the values of -128 to 127 the values are storing inside the same obj, internaly its not creating new object but if we store more than 127 value,it creates new obj every timw
    //here == opprater checks addresses of the obj
    //where as 2nd scenario its creating two diff objs so its giving me the false
    System.out.println(o.i5==o.i6);//--> same address
    System.out.println(o.i7==o.i8);//--> diff address 



    
	}

}
