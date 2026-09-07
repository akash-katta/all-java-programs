package com.javaintroduction;

public class Testdetatypedemo01 {
  byte b=(byte) 135;
  short s=(short) 32768;
  
  int i= (int) 2147483648l;
  long l=1000000000000000000l;
  
  float f=1151065659056509.5595995959595959595959252525f;
  double d=3400000000000000000000000000000000000000d;
  
  char c=65;
  
  boolean boo;
	public static void main(String[] args) {
  System.out.println("main method started");

  Testdetatypedemo01 t1=new Testdetatypedemo01();
  
    System.out.println(t1.b);
    System.out.println(t1.s);
    System.out.println(t1.i);
    System.out.println(t1.l);
    
    System.out.println(t1.f);
    System.out.println(t1.d);
    System.out.println(t1.c);
    System.out.println(t1.boo);
	}

}
