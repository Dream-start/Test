package com.num.work;

//�ȴӼ�������һ��ʮ�����������ٽ���ת��Ϊʮ��������Ȼ�������������Ĳ���һ����Ч��ʮ�������������׳��쳣�� 
import java.util.Scanner; 

class Exchange {     
	String s;       
	private  int  y;       
	Exchange(){}       
	Exchange(String s){          
		this.s=s;     
	}          
	int  getY(){          
		return y;     
	}        
	void setY(int y){          
		this.y=y;     
	}        
	void Change16To10(){             
		int y=0;            
		int i,k;             
		for(i=0;i<s.length();i++) {                 
			k=Change(s.charAt(i));                 
			y+=k*Math.pow(16,s.length()-(i+1));           
		}             
		System.out.println(y);             
		System.out.println("�ɹ�ת��");         
	}        
	int Change(char h){             
		int x;            
		switch(h)            
		{                  
			case '0':                  
				x=0;                   
				break;                 
			case '1':                  
				x=1;                  
				break;                 
			case '2':                 
				x=2;                  
				break;             
			case '3':                  
				x=3;                  
				break;              
			case '4':                     
				x=4;                  
				break;              
			case '5':                     
				x=5;                    
				break;              
			case '6':                   
				x=6;                   
				break;              
			case '7':                  
				x=7;                  
				break;                 
			case '8':                  
				x=8;                  
				break;                 
			case '9':
				x=9;                  
				break;             
			case 'a':                      
				x=10;  
				break;              
			case 'b':                  
				x=11;                 
				break;             
			case 'c':                  
				x=12;                  
				break;             
			case 'd':                  
				x=13;                    
				break;             
			case 'e':                  
				x=14;                  
				break;              
			case 'f':                   
				x=15;                      
				break;               
			default:                     
		throw new MyException();                 
		}              
		return x;        
		}       
		}  
class MyException extends RuntimeException{       
	public MyException(){}        
	public MyException(String msg)     {             
		super(msg);       
	}        
	public void printcount()  {             
		System.out.println("16���������벻��ȷ��");        
	}     
}    
