package test;

import java.util.Date;
import java.util.GregorianCalendar;
/**
 * Created by zhoujiongy on 2016/7/27.
 */
public class Employee implements Cloneable{
    private String name;
    private double salary;
    private Date hireDay;

    public Employee(String n,double s){
        this.name=n;
        this.salary=s;
        this.hireDay=new Date();
    }

    public Employee clone() throws CloneNotSupportedException{
        Employee cloned=(Employee) super.clone();
        cloned.hireDay=(Date) hireDay.clone();
        return cloned;
    }

    public void setHireDay(int year, int month, int day){
        Date newHireDay = new GregorianCalendar(year,month-1,day).getTime();
        hireDay.setTime(newHireDay.getTime());
    }
    public void raiseSalary(double byPercent){
        double raise = this.salary * byPercent / 100;
        this.salary += raise;
    }
    public String toString(){
        return "Employee[name=" + name + ",salary=" + salary + ",hireDay=" + hireDay + "]";
    }
}
