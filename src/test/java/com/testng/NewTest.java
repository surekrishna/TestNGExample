package com.testng;

import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() {
	  someCode();
	  twoNumbers();
	  
  }
 
  public void someCode(){
	  System.out.println("Hello TestNG");
  }
  
  public void twoNumbers(){
	  int i = 10;
	  int j = 20;
	  System.out.println(i+j);
  }

}
