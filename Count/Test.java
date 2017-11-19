/**
 * 
 */
package com.javatestwork.CarWeight;

/**
 *<P>Title:</p>
 *<p>Description:</p>
 * @author 幻想乡
 * @2017年11月10日
 * @Test.java
 */
public class Test {
	public static void main(String args[]) {     
		ComputeWeight[] goodsOne=new ComputeWeight[50],goodsTwo=new ComputeWeight[22];
		for(int i=0;i<goodsOne.length;i++){      
			if(i%3==0)
				goodsOne[i]=new Television();
			else if(i%3==1)      
				goodsOne[i]=new Computer();     
			else if(i%3==2)        
				goodsOne[i]=new WashMachine();     
			}     
			for(int i=0;i<goodsTwo.length;i++){      
				if(i%3==0)      
					goodsTwo[i]=new Television();     
				else if(i%3==1)      
					goodsTwo[i]=new Computer();     
				else if(i%3==2)        
					goodsTwo[i]=new WashMachine();     
				}
			Car bigcar=new Car(goodsOne);     
			System.out.println("大货车装载的货物重量:"+bigcar.getTotalWeights());
			Car smallcar=new Car(goodsTwo);     
			System.out.println("小货车装载的货物重量:"+smallcar.getTotalWeights());
			} 
}
