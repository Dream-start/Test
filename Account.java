package com.test;

public class Account {
 
    public static void main(String args[]) {   
          
        DepositAccount saver = new DepositAccount("1234567890","ZhangSan","000000",5000);       
        DepositAccount.setrate(0.023);  //设置年利率       
        System.out.println("用户名:"+saver.getname());//查询用户名  
        System.out.println("账户:"+saver.getaccountnumber()); // 查询账号  
        System.out.println("余额:"+saver.getbalance()); //查询余额      
        System.out.println("年利息：" + saver. rate_year());   
        saver.deposit(2000);   
    }  
  
}  
class DepositAccount{  
    private String username; //储户姓名  
    private String accountnumber; //账号  
    private String password; //密码  
    private float balance; //存款余额  
    static double rate;      //年利率，类成员变量   
    DepositAccount(String name,String number,String pass,float ba)//初始化开户，构造方法    
    {    
          
        this.accountnumber = number;     
        this.username = name; 
        this.password =pass;
        this.balance = ba;    
    }  
      
    public void deposit(float m){ //存款  
        System.out.println("余额：" + balance);    
        System.out.println("新存：" + m);    
        balance += m;    
        System.out.println("余额：" + balance);  
    }  
      
    public boolean withdraw(float m){ //取款  
        if(m <= balance){  
            balance-=m;  
            System.out.println("取款成功!\n余额:"+balance);  
            return true;  
        }  
        else {
        	System.out.println("取款失败!余额不足！");
            return false;  
        }  
    }  
      
    public String getname(){ //查询储户姓名  
        return username;  
    }  
      
    public String getaccountnumber(){ //查询账号  
        return accountnumber;  
    }  
      
    public float getbalance(){ //查询余额  
        return balance;  
    }  
      
    public void setpassword(String pass){ //设置密码  
        password= pass;  
    }  
      
    public static void setrate(double d) {  //设置年利率     
        rate = d;    
        }  
      
    public double rate_year() {  //计算年利息    
        return balance * rate;    
        }  
      
    public double rate_month() {  //计算月利息    
        return balance * rate/12;    
        }  
      
    }  