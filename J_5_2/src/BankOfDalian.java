
public class BankOfDalian extends Bank{
	double year;  
    public double computerInterest(){  
        super.year=(int)year;  
        double r=year-(int)year;  
        int day=(int)(r*1000);  
          
        double yearInterest=super.computerInterest();  
        double dayInterest=day*0.00012*saveMoney;  
        interest=yearInterest+dayInterest;  
        System.out.printf("%d 元存在大连银行%d年零%d天的利息：%f元\n",  
                saveMoney,super.year,day,interest);  
        return interest;  
    }  
}
