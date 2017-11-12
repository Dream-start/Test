package com.javatestwork.school;
/**
 * 
 *<P>Title:</p>
 *<p>Description:定义一个研究生类Graduate,并实现StudentManageInterface和TeacherManageInterface 接口;定义的成员变量有name(姓名)、sex(性别)、age(年龄)、fee(每学期学费)、pay(月工资)；</p>
 * @author 幻想乡
 * @2017年11月10日
 * @Graduate.java
 */
public class Graduate implements StudentManageInterface, TeacherManageInterface {
	 private String name;//姓名
	 private String sex;//性别
	 private int age;//年龄
	 private int fee;//每学期学费
	 private int pay;//月工资
	 public Graduate(String name,String sex, int age)
	 {
	  this.name = name;
	  this.sex = sex;
	  this.age = age;
	 }
	public int getFee()
	 {
	  return this.fee;
	 }
	 public int getPay()
	 {
	  return this.pay;
	 }
	 public void setFee(int fee)
	 {
	  this.fee = fee;
	 }
	 public void setPay(int pay)
	 {
	  this.pay = pay;
	 }
	 public String getName()
	 {
	  return name;
	 }
	 public void setName(String name)
	 {
	  this.name = name;
	 }
	 public String getSex()
	 {
	  return sex;
	 }
	 public void setSex(String sex)
	 {
	  this.sex = sex;
	 }
	 public int getAge()
	 {
	  return age;
	 }
	 public void setAge(int age)
	 {
	  this.age = age;
	 }
	 
}
