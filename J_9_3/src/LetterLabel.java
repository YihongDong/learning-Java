import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class LetterLabel extends JTextField implements FocusListener{
	public LetterLabel() {
		// TODO 自动生成的构造函数存根
		setEditable(false);
		addFocusListener(this);
		setBackground(Color.white);
		setFont(new Font("Arial",Font.PLAIN,30));
	}
	public static LetterLabel[] getLetterLabel(int n)
	{
		LetterLabel a[]=new LetterLabel[n];
		for(int k=0;k<a.length;k++)
			a[k]=new LetterLabel();
		return a;
	}
	public void focusGained(FocusEvent e) {
		setBackground(Color.cyan);
	}
	public void focusLost(FocusEvent e) {
		setBackground(Color.white);
	}
	public void setText(char c) {
		setText(""+c);
	}
}
