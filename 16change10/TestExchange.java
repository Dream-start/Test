package com.num.work;

import java.util.Scanner;

public class TestExchange{       
	public static void main(String[] args)  {            
		System.out.println("ÇëÊäÈëÒ»¸ö16½øÖÆÊý£º");            
		Scanner S=new Scanner(System.in);            
		String s=S.next();             
		Exchange E=new Exchange(s);            
		try         {                  
			E.Change16To10();            
		}          
		catch(MyException e) {                
			e.printcount();            
		}        
	} 
}
