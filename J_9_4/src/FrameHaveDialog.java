import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
public class FrameHaveDialog extends JFrame implements ActionListener{
	JTextArea text;
	JButton buttonFont;
	public FrameHaveDialog() {
		// TODO 自动生成的构造函数存根
		buttonFont=new JButton("设置字体");
		text=new JTextArea("Java 2使用教程(第四版)");
		buttonFont.addActionListener(this);
		add(buttonFont,BorderLayout.NORTH);
		add(text);
		setBounds(60,60,300,300);
		setVisible(true);
		validate();
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==buttonFont) {
			FontDialog dialog=new FontDialog(this);
			dialog.setVisible(true);
			if(dialog.getState()==FontDialog.YES) {
				text.setFont(dialog.getFont());
				text.repaint();
			}
			if(dialog.getState()==FontDialog.NO)
				text.repaint();
		}
	}
}
