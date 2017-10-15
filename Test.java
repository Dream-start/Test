package com.test;

class Student{
	private String name;
	private int age;
	private String education;
	public Student(String name, int age, String education) {
		super();
		this.name = name;
		this.age = age;
		this.education = education;
	}
	public Student() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEducation() {
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
	}
	public void show(){
		System.out.println("姓名：" + this.getName() + "\t  年龄：" + this.getAge() + "\t  学位：" + this.getEducation() );
	}
}
class Undergraduate extends Student{
	private String specialty;
	public String getSpecialty() {
		return specialty;
	}
	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}
	public Undergraduate(String name, int age, String education, String specialty) {
		super(name, age, education);
		this.specialty = specialty;
	}
	public Undergraduate(String name, int age, String education) {
		super(name, age, education);
	}
	public void show(){
		System.out.println("姓名：" + this.getName() + "\t  年龄：" + this.getAge() + "\t  学位：" + this.getEducation() + "\t  专业：" + this.getSpecialty());
	} 
}
class Graduate extends Student{
	private String direction;
	public String getDirection() {
		return direction;
	}
	public void setDirection(String direction) {
		this.direction = direction;
	}
	public Graduate(String name, int age, String education, String direction) {
		super(name, age, education);
		this.direction = direction;
	} 
	public Graduate(String name, int age, String education) {
		super(name, age, education);
	}
	public void show(){
		System.out.println("姓名：" + this.getName() + "\t  年龄：" + this.getAge() + "\t  学位：" + this.getEducation() + "\t  研究方向：" + this.getDirection());
	}
}
public class Test {
	public static void main(String[] args) {
		Undergraduate stu1=new Undergraduate("王某某",20,"本科","软件工程");
        Graduate stu2=new Graduate("李某某",23,"研究生","人工智能");
        stu1.show();
        stu2.show();
	}
}