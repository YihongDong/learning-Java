import java.util.*;
public class ComputerPrice{
public static void main(String args[]) {
	String menu="������Ѽ:189Ԫ ���۳���:12.9Ԫ �����:69Ԫ ����ţ��:32Ԫ";
	Scanner scanner = new Scanner(menu);
	String regex="[^0123456789.]+";
	scanner.useDelimiter(regex);
	double sum=0;
	while(scanner.hasNext()) {
		try{
			double price=scanner.nextDouble();
			sum=sum+price;
			System.out.println(price);
		}
		catch (InputMismatchException exp) {
			String t = scanner.next();
		}
	}
			System.out.println("�˵��ܼ۸�:"+sum+"Ԫ");

	}
}