import java.awt.event.*;
import java.awt.*;

import javax.naming.NameParser;
import javax.swing.*;
public class FontDialog extends JDialog implements ItemListener,ActionListener{
	FontFamilyNames fontFamilyNames;
	int fontSize=38;
	String fontName;
	JComboBox fontNameList,fontSizeList;
	JLabel label;
	Font font;
	JButton yes,cancel;
	static int YES=1,NO=0;
	int state=-1;
	FontDialog(JFrame f) {
		super(f);
		setTitle("����Ի���");
		font=new Font("����",Font.PLAIN,12);
		fontFamilyNames=new FontFamilyNames();
		setModal(true);
		yes=new JButton("Yes");
		cancel=new JButton("cancel");
		yes.addActionListener(this);
		cancel.addActionListener(this);
		label=new JLabel("hello,����",JLabel.CENTER);
		fontNameList=new JComboBox();
		fontSizeList=new JComboBox();
		String name[]=fontFamilyNames.getFrontName();
		fontNameList.addItem("����");
		for(int k=0;k<name.length;k++)
			fontNameList.addItem(name[k]);
		fontSizeList.addItem("��С");
		for(int k=8;k<72;k=k+2)
			fontSizeList.addItem(new Integer(k));
		fontNameList.addItemListener(this);
		fontSizeList.addItemListener(this);
		JPanel pNorth=new JPanel();
		pNorth.add(fontNameList);
		pNorth.add(fontSizeList);
		add(pNorth,BorderLayout.NORTH);
		add(label,BorderLayout.CENTER);
		JPanel pSouth=new JPanel();
		pSouth.add(yes);
		pSouth.add(cancel);
		add(pSouth,BorderLayout.SOUTH);
		setBounds(100,100,280,170);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		validate();
	}
	public void itemStateChanged(ItemEvent e) {
		if(e.getSource()==fontNameList) {
			fontName=(String)fontNameList.getSelectedItem();
			font=new Font(fontName, Font.PLAIN, fontSize);
		}
		else if(e.getSource()==fontSizeList) {
			Integer m= (Integer) fontSizeList.getSelectedItem();
			fontSize=m.intValue();
			font=new Font(fontName, Font.PLAIN, fontSize);
		}
		label.setFont(font);
		label.repaint();
		validate();
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==yes) {
			state=YES;
			setVisible(false);
			
		}
		else if(e.getSource()==cancel) {
			state=NO;
			setVisible(false);
		}
	}
	public int getState() {
		return state;
	}
	public Font getFont() {
		return font;
	}
}
