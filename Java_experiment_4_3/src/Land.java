
public class Land {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Village.setWaterAmount(200);
		int leftWater=Village.waterAmount;
		System.out.println("ˮ������"+leftWater+"��ˮ");
		Village zhaoZhuang,maJiaHeZhi;
		zhaoZhuang=new Village("��ׯ");
		maJiaHeZhi=new Village("��Һ���");
		zhaoZhuang.setPeopleNumber(80);
		maJiaHeZhi.setPeopleNumber(120);
		zhaoZhuang.drinkWater(50);
		leftWater=maJiaHeZhi.lookWaterAmount();
		String name=maJiaHeZhi.name;
		System.out.println(name+"����ˮ������"+leftWater+"��ˮ");
		maJiaHeZhi.drinkWater(100);
		leftWater=zhaoZhuang.lookWaterAmount();
		name=zhaoZhuang.name;
		System.out.println(name+"����ˮ������"+leftWater+"��ˮ");
		int peopleNumber=zhaoZhuang.getPeopleNumber();
		System.out.println("��ׯ���˿ڣ�"+peopleNumber);
		peopleNumber=maJiaHeZhi.getPeopleNumber();
		System.out.println("��Һ��ӵ��˿ڣ�"+peopleNumber);
	}

}
