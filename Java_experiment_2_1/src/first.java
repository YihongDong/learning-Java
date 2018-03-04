
public class first {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int startPosition=0,endPosition=0;
		char cStart='α',cend='ω';
		startPosition = (int)cStart;
		endPosition = (int)cend;
		System.out.println("希腊字母"+cStart+"在Unicode表中的顺序位置："+startPosition);
		System.out.println("希腊字母表：");
		for(int i=startPosition;i<=endPosition;i++) {
			char c='\0';
		    c=(char)i;
		    System.out.print(" "+c);
		    if((i-startPosition+1)%10==0)
		    System.out.println("");
		}
	}
}
