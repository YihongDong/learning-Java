
public class MainClass {
	public static void main(String args[]) {
		Tv haierTV=new Tv();
		haierTV.setChannel(5);
		System.out.println("haierTV��Ƶ����"+haierTV.getChannel());
		Family zhangSanFamily=new Family();
		zhangSanFamily.buyTV(haierTV);
		System.out.println("zhangSanFamily��ʼ�����ӽ�Ŀ");
		zhangSanFamily.seeTV();
		int m=2;
		System.out.println("zhangSanFamily�����Ӹ�����"+m+"Ƶ��");
		zhangSanFamily.remoteControl(m);
		System.out.println("haierTV��Ƶ����"+haierTV.getChannel());
		System.out.println("zhangSanFamily�ٿ����ӽ�Ŀ");
		zhangSanFamily.seeTV();
	}
}
