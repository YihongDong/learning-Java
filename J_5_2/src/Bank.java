
public class Bank {
	int saveMoney;  
    int year;  
    double interest;  
    double interestRate=0.29;  
      
    public double computerInterest(){  
        return interest=year*interestRate*saveMoney;  
    }  
    public void setInterestRate(double rate){  
        interestRate=rate;  
    }
}
