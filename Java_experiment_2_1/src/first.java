
public class first {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		int startPosition=0,endPosition=0;
		char cStart='��',cend='��';
		startPosition = (int)cStart;
		endPosition = (int)cend;
		System.out.println("ϣ����ĸ"+cStart+"��Unicode���е�˳��λ�ã�"+startPosition);
		System.out.println("ϣ����ĸ��");
		for(int i=startPosition;i<=endPosition;i++) {
			char c='\0';
		    c=(char)i;
		    System.out.print(" "+c);
		    if((i-startPosition+1)%10==0)
		    System.out.println("");
		}
	}
}
