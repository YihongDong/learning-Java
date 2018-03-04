
public class SaveMoney {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int amount=8000;  
        
        ConstructionBank bank1=new ConstructionBank();  
        bank1.year=8.236;  
        bank1.saveMoney=amount;  
        bank1.setInterestRate(0.035);  
        double interest1=bank1.computerInterest();  
          
        BankOfDalian bank2=new BankOfDalian();  
        bank2.saveMoney=amount;  
        bank2.year=8.236;  
        bank2.setInterestRate(0.035);  
        double interest2=bank2.computerInterest();  
        System.out.printf("两个银行利息相差%f元 \n",-interest1+interest2);  
	}

}
