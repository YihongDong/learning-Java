import java.awt.GraphicsEnvironment;;
public class FontFamilyNames {
	String allFontNames[];
	public String [] getFrontName() {
		GraphicsEnvironment gEnvironment=GraphicsEnvironment.getLocalGraphicsEnvironment();
		allFontNames=gEnvironment.getAvailableFontFamilyNames();
				
		return allFontNames;		
	}
}
