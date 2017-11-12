package com.javatestwork.school;

/**
 *<P>Title:</p>
 *<p>Description:</p>
 * @author 幻想乡
 * @2017年11月10日
 * @Test.java
 */
public class Test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			 Graduate g=new Graduate("zhangsan","男",20);
			 g.setFee(5500);
			 g.setPay( 1000);
	         if ((g.getPay()*12) - (g.getFee() *2)< 2000)
	      	   System.out.println("Provide a loan(需要贷款)!");
	      	  else
	      		  System.out.println("Not provide a loan(不需要贷款)!");
		 }	
}
