import java.util.Random;
import java.awt.event.*;
import javax.swing.*;
public class Teacher implements ActionListener{
	int numberone,numbertwo;
	String operator="";
	boolean isright;
	Random random;
	int maxinteger;
	JTextField textone,texttwo,textresult;
	JLabel operatorlabel, message;
	Teacher(){
		random = new Random();
	}
		public void setMaxInteger(int n) {
			maxinteger=n;
		}
		public void actionPerformed(ActionEvent e) {
			String str =e.getActionCommand(); 
				if(str.equals("getproblem")) {
					numberone= random.nextInt(maxinteger)+1;
					numbertwo=random.nextInt(maxinteger)+1;
					double d=Math.random();
					if(d>=5) operator="+";
					else operator="-";
					textone.setText(""+numberone);
					texttwo.setText(""+numbertwo);
					operatorlabel.setText(operator);
					message.setText("请回答");
					textresult.setText(null);}
				else if(str.equals("anwser")) {
					String answer=textresult.getText();
					try { 
						int result=Integer.parseInt(answer);
						if(operator.equals("+")){
							if (result==numberone+numbertwo)
								message.setText("你回答正确");
							else
							message.setText("你回答错误");}
						else if (operator.equals("-")) {
							if (result==numberone-numbertwo)
							message.setText("你回答正确");
							else
							message.setText("你回答错误");}}
					catch(NumberFormatException ex) {message.setText("请输入数字字符");}}}
		public void setJTextField(JTextField ... t) {
			textone=t[0];
			texttwo=t[1];
			textresult=t[2];}
		public void setJLabel(JLabel ... label) {
			operatorlabel = label[0];
			message=label[1];
	}

}
