package com.tedu.star;

public class Date {      
		public static void main(String[] args)  {              
				System.out.println("当前时刻为：");          
				System.out.println(new Date().toString());              
				System.out.println("转化显示格式后：");               
				System.out.println(convertCommonDateStr(new Date().toString()));     
		}         
		public static String convertCommonDateStr(String commonDateStr)  {              
				StringBuffer result=new StringBuffer("");         
				String[] arrStr=commonDateStr.split(" ");            
				result.append(arrStr[5]).append("/");          
				result.append(convertMonthStr(arrStr[1],true)).append("/");         
				result.append(arrStr[2]).append(" ");         
				result.append(arrStr[3]);         
				return result.toString();        
		}        
		public static  String convertMonthStr(String monthStr,boolean isWithZero)   {
				String monthResult=" ";          
				if("Jan".equals(monthStr))                 
					monthResult="01";               
				else if("Feb".equals(monthStr))                 
					monthResult="02";              
				else if("Mar".equals(monthStr))                  
					monthResult="03";               
				else if("Apr".equals(monthStr))                 
					monthResult="04";             
				else if("May".equals(monthStr))                
					monthResult="05";             
				else if("Jun".equals(monthStr))                 
					monthResult="06";              
				else if("Jul".equals(monthStr))                 
					monthResult="07";              
				else if("Aug".equals(monthStr))                 
					monthResult="08";              
				else if("Sep".equals(monthStr))                 
					monthResult="09";              
				else if("Oct".equals(monthStr))                
					monthResult="10";              
				else if("Nov".equals(monthStr))                 
					monthResult="11";             
				else if("Dec".equals(monthStr))                 
					monthResult="12";                 
				if(!isWithZero){                    
					if(monthResult.startsWith("0"))                      
						monthResult=monthResult.substring(1,2);         
				}              
				return monthResult;
		}  
}		