import java.util.*;
public class ComputerPrice{
public static void main(String args[]) {
	String menu="北京烤鸭:189元 西芹炒肉:12.9元 酸菜鱼:69元 铁板牛柳:32元";
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
			System.out.println("菜单总价格:"+sum+"元");

	}
}