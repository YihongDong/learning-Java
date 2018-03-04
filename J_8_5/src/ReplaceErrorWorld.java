import java.util.regex.*;
public class ReplaceErrorWorld {

	public static void main(String[] args) {
		// TODO ×Ô¶¯Éú³ÉµÄ·½·¨´æ¸ù
		String str="Íü¼ÇÃÜÂë£¬²»Òª¾ª»ÅÊ§´í£¬ÇëµÇÂ¼www.yy.cn»òµÇÂ½www.tt.cc";
		Pattern pattern;
		Matcher matcher;
		String regex="µÇÂ½";
		pattern =Pattern.compile(regex);
		matcher =pattern.matcher(str);
		while(matcher.find())
		{
			String s=matcher.group();
			System.out.print(matcher.start()+"Î»ÖÃ³öÏÖ:");
			System.out.println(s);
		}
		System.out.println("½«\"µÇÂ½\"Ìæ»»Îª\"µÇÂ¼\"µÄ×Ö·û´®:");
		String result = matcher.replaceAll("µÇÂ¼");
		System.out.println(result);
		pattern =Pattern.compile("¾ª»ÅÊ§´í");
		matcher =pattern.matcher(result);
		System.out.println("½«\"¾ª»ÅÊ§´í\"Ìæ»»Îª\"¾ª»ÅÊ§´ë\"µÄ×Ö·û´®:");
		result = matcher.replaceAll("¾ª»ÅÊ§´ë");
		System.out.println(result);
	}

}
