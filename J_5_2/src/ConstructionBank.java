
public class ConstructionBank extends Bank{
	double year;  
    public double computerInterest(){  
        super.year=(int)year;  
        double r=year-(int)year;  
        int day=(int)(r*1000);  
          
        double yearInterest=super.computerInterest();  
        double dayInterest=day*0.0001*saveMoney;  
          
        interest=yearInterest+dayInterest;  
        System.out.printf("%d Ԫ���ڽ�������%d����%d�����Ϣ��%fԪ\n",  
                saveMoney,super.year,day,interest);  
        return interest;  
    }  
}
