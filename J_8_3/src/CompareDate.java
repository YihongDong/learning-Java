import java.util.*;
public class CompareDate {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Scanner scanner = new Scanner(System.in);
		System.out.println("�����һ����,��,������");
		System.out.print("�������");
		short yearOne = scanner.nextShort();
		System.out.print("�����·�");
		byte monthOne = scanner.nextByte();
		System.out.print("��������");
		byte dayOne = scanner.nextByte();
		System.out.println("����ڶ�����,��,������");
		System.out.print("�������");
		short yearTwo = scanner.nextShort();
		System.out.print("�����·�");
		byte monthTwo = scanner.nextByte();
		System.out.print("��������");
		byte dayTwo = scanner.nextByte();
		Calendar calendar = Calendar.getInstance();
		calendar.set(yearOne, monthOne-1,dayOne);
		long timeOne = calendar.getTimeInMillis();
		calendar.set(yearTwo,monthTwo-1,dayTwo);
		long timeTwo = calendar.getTimeInMillis();
		Date date1 = new Date(timeOne);
		Date date2 = new Date(timeTwo);
		if(date2.equals(date1))
			System.out.println("�������ڵ���,��,����ȫ��ͬ");
		else if(date2.after(date1))
			System.out.println("������ĵڶ������ڴ��ڵ�һ������");
		else 
			System.out.println("������ĵڶ�������С�ڵ�һ������");
		long days=Math.abs(timeTwo-timeOne)/(1000*60*60*24);
		System.out.println(yearOne+"��"+monthOne+"��"+dayOne+"�պ�"+yearTwo+"��"+monthTwo+"��"+dayTwo+"���"+days+"��");
	}

}
