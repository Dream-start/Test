/**
 * 
 */
package com.javatestwork.school;

/**
 *<P>Title:</p>
 *<p>Description:定义一个老师管理接口TeacherManageInterface 并有两个抽象的工资方法setFee（）方法和getFee方法，分别用于设置和获取学生的学费，由子类实现</p>
 * @author 幻想乡
 * @2017年11月10日
 * @TeacherManageInterface.java
 */
public interface TeacherManageInterface {
	 void setPay(int pay);
	 int getPay();
}
