import java.util.regex.*;
public class ReplaceErrorWorld {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		String str="�������룬��Ҫ����ʧ�����¼www.yy.cn���½www.tt.cc";
		Pattern pattern;
		Matcher matcher;
		String regex="��½";
		pattern =Pattern.compile(regex);
		matcher =pattern.matcher(str);
		while(matcher.find())
		{
			String s=matcher.group();
			System.out.print(matcher.start()+"λ�ó���:");
			System.out.println(s);
		}
		System.out.println("��\"��½\"�滻Ϊ\"��¼\"���ַ���:");
		String result = matcher.replaceAll("��¼");
		System.out.println(result);
		pattern =Pattern.compile("����ʧ��");
		matcher =pattern.matcher(result);
		System.out.println("��\"����ʧ��\"�滻Ϊ\"����ʧ��\"���ַ���:");
		result = matcher.replaceAll("����ʧ��");
		System.out.println(result);
	}

}
