public class FindMess{
	public static void main(String argsp[])
	{
		String mess ="����:���� ��������:1989.10.16. ������վ:http://www.zhang.com."+"���:185 cm,����:72kg";
		int index=mess.indexOf(":");
		String name = mess.substring(index+1);
		if(name.startsWith("��"))
		{
			System.out.println("�����е�������\"��\"");
		}
		index = mess.indexOf(":", index+1);
		String date = mess.substring(index+1, index+11);
		System.out.println(date);
		index = mess.indexOf(":",index+1);
		int heightPostion = mess.indexOf("���");
		String personNet = mess.substring(index+1,heightPostion-1);
		System.out.println(personNet);
		index = mess.indexOf(":", heightPostion);
		int cmPosition = mess.indexOf("cm");
		String height=mess.substring(index+1,cmPosition);
		height = height.trim();
		int h = Integer.parseInt(height);
		if(h>=180) {
			System.out.println("�����е����"+height+"���ڻ����180 cm");
		}
		else {
			System.out.println("�����е����"+height+"С��180 cm");
		}
		index=mess.lastIndexOf(":");
		int kgPosition = mess.indexOf("kg");
		String weight = mess.substring(index+1,kgPosition);
		weight = weight.trim();
		int w = Integer.parseInt(weight);
		if(w>=75) {
			System.out.println("�����е�����"+weight+"���ڻ����75 kg");
		}
		else {
			System.out.println("�����е�����"+weight+"С��75 kg");
		}
	}
}