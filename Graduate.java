package com.javatestwork.school;
/**
 * 
 *<P>Title:</p>
 *<p>Description:����һ���о�����Graduate,��ʵ��StudentManageInterface��TeacherManageInterface �ӿ�;����ĳ�Ա������name(����)��sex(�Ա�)��age(����)��fee(ÿѧ��ѧ��)��pay(�¹���)��</p>
 * @author ������
 * @2017��11��10��
 * @Graduate.java
 */
public class Graduate implements StudentManageInterface, TeacherManageInterface {
	 private String name;//����
	 private String sex;//�Ա�
	 private int age;//����
	 private int fee;//ÿѧ��ѧ��
	 private int pay;//�¹���
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