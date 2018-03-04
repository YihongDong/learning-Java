import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
public class Calendarframe  extends JFrame implements ActionListener{
	JLabel labelDay[]=new JLabel[42];
	JButton titleName[]= new JButton[7];
	String name[]={"��","һ","��","��","��","��","��"};
	JButton nextmonth,previousmonth;
	Calendarbean calendar;
	JLabel showmessage=new JLabel("",JLabel.CENTER);
	int year=2011, month=2;
	public Calendarframe() {
		JPanel pcenter=new JPanel();
		pcenter.setLayout(new GridLayout(7,7));
		for(int i=0;i<7;i++){
			titleName[i]= new JButton(name[1]);
			titleName[i].setBorder(new SoftBevelBorder(BevelBorder.RAISED));
			pcenter.add(titleName[i]);
			}
			for(int i=0;i<42;i++){
				labelDay[i]=new JLabel("",JLabel.CENTER);
				labelDay[i].setBorder(new SoftBevelBorder(BevelBorder.LOWERED));
				pcenter.add(labelDay[i]);
			}
				calendar=new Calendarbean();
				nextmonth= new JButton("����");
				previousmonth =new JButton("����");
				nextmonth.addActionListener(this);
				previousmonth.addActionListener(this);
				JPanel pnorth=new JPanel(),psouth=new JPanel();
				pnorth.add(previousmonth);
				pnorth.add(nextmonth);
				psouth.add(showmessage);
				add(pcenter,BorderLayout.CENTER);
				add(pnorth,BorderLayout.NORTH);
				add(psouth,BorderLayout.SOUTH);
				setyearandmonth(year,month);
				setDefaultCloseOperation(DISPOSE_ON_CLOSE);}
				public void setyearandmonth(int y, int m) {
					calendar.setyear(y);
					calendar.setmonth(m);
					String day[]=calendar.getcalendar();
					for(int i=0;i<42;i++)
						labelDay[i].setText(day[i]);
					showmessage.setText("����:"+calendar.getyear()+"��"+calendar.getmonth()+"��");}
				
				public void actionPerformed(ActionEvent e) {
					if(e.getSource()==nextmonth) {
						month+=1;
						if(month>12)
							month=1;
						calendar.setmonth(month);
						String day[]=calendar.getcalendar();
						for(int i=0; i<42;i++) {
							labelDay[i].setText(day[i]);}}
					else if(e.getSource()==previousmonth) {
						month=month-1;
						if(month<1 )
							month=12;
						calendar.setmonth(month);
						String day[]=calendar.getcalendar();
						for(int i=0; i<42;i++)
							labelDay[i].setText(day[i]);
					}
					showmessage.setText("����:"+calendar.getyear()+"��"+calendar.getmonth()+"��");
					}
}
