/**
 * 
 */
package com.javatestwork.CarWeight;

/**
 *<P>Title:</p>
 *<p>Description:</p>
 * @author 幻想乡
 * @2017年11月10日
 * @Car.java
 */
public class Car {
	ComputeWeight[] goods; 
	double totalWeights=0; 
	Car(ComputeWeight[] goods){
		this.goods=goods;    
	}  
	public double getTotalWeights(){     
		totalWeights=0;     
		for(int i=0;i<goods.length;i++){      
			totalWeights+=goods[i].computeWeight();     
		}     
	return totalWeights;    
	} 
}
