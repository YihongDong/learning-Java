import java.util.Scanner;
public class Number {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		int number = 0,d5,d4,d3,d2,d1;
		Scanner reader = new Scanner(System.in);
		System.out.println("����һ��1��99999֮�����");
		number = reader.nextInt();
		if(number<=99999&&number>=1)
		{
			d5 =number/10000;
			d4=number%10000/1000;
			d3=number%1000/100;
			d2=number%100/10;
			d1=number%10;
			if(d5!=0)
			{
				System.out.println(number+"��5λ��");
				if(d1==d5&&d3==d4)
					System.out.println(number+"�ǻ�����");
				else
					System.out.println(number+"���ǻ�����");
			}
			else if(d4!=0)
			{
				System.out.println(number+"��4λ��");
				if(d1==d4&&d2==d3)
					System.out.println(number+"�ǻ�����");
				else
					System.out.println(number+"���ǻ�����");
			}
			else if(d3!=0)
			{
				System.out.println(number+"��3λ��");
				if(d1==d3)
					System.out.println(number+"�ǻ�����");
				else
					System.out.println(number+"���ǻ�����");
			}
			else if(d2!=0)
			{
				System.out.println(number+"��2λ��");
				if(d1==d2)
					System.out.println(number+"�ǻ�����");
				else
					System.out.println(number+"���ǻ�����");
			}
			else
			{
				System.out.println(number+"��1λ��");
				System.out.println(number+"�ǻ�����");
			}
		}
		else
			System.out.printf("\n%d����1��99999֮��",number);
	}

}
