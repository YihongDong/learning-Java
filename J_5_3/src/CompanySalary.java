abstract class Employee {
	public abstract double earning();
}

class YearWorkers extends Employee{  
    public double earning(){  
        return 12000;  
    }  
}  
  
class MonthWorkers extends Employee{  
    public double earning(){  
        return 12*2300;  
    }  
}  
  
class WeekWorkers extends Employee{  
    public double earning(){  
        return 52*780;  
    }  
}  

class Company{  
    Employee[] employee;  
    double salaries=0;  
    Company(Employee[] employee){  
        this.employee=employee;  
    }  
      
    public double salariesPay(){  
        salaries=0;  
        for(int i=0;i<employee.length;i++)  
            salaries+=employee[i].earning();  
        return salaries;  
    }  
}  

public class CompanySalary {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Employee[] employee=new Employee[29];  
        for(int i=0;i<employee.length;i++){  
            if(i%3==0)  
                employee[i]=new WeekWorkers();  
            else if(i%3==1)  
                employee[i]=new MonthWorkers();  
            else  
                employee[i]=new YearWorkers();  
        }  
          
        Company company=new Company(employee);  
        System.out.println("公司总薪水"+company.salariesPay());
	}

}
