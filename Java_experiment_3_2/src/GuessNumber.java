import java.util.Scanner;
import java.util.Random;
public class GuessNumber {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Scanner reader =new Scanner(System.in);
		Random random = new Random();
		System.out.println("����һ��1��100֮�����������²������");
		int realNumber = random.nextInt(100)+1;
		int yourGuess=0;
		System.out.println("�������Ĳ²⣺");
		yourGuess = reader.nextInt();
		while(yourGuess!=realNumber)
		{
			if(yourGuess>realNumber)
			{
				System.out.print("�´��ˣ���������Ĳ²⣺");
				yourGuess = reader.nextInt();
			}
			else if(yourGuess<realNumber)
			{
				System.out.print("��С�ˣ���������Ĳ²⣺");
				yourGuess = reader.nextInt();
			}
		}
		System.out.println("�¶��ˣ�");
}

}
