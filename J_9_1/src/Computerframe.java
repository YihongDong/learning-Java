import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Computerframe extends JFrame{
	JMenuBar menubar;
	JMenu choicegrade;//择级别的某单
	JMenuItem grade1, grade2;
	JTextField textone, texttwo, textresult;
	JButton getproblem, giveanwser;
	JLabel operatorlabel, message;
	Teacher teacherzhang;
	Computerframe(){
		teacherzhang =new Teacher();
		teacherzhang.setMaxInteger(20);
		setLayout(new FlowLayout());
		menubar= new JMenuBar();
		choicegrade= new JMenu("选择级别");
		grade1 = new JMenuItem("幼几级别");
		grade2= new JMenuItem("儿童级别");
		grade1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {teacherzhang.setMaxInteger(10);}});
		grade2.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {
			teacherzhang.setMaxInteger(50);}});
		choicegrade.add(grade1);
		choicegrade.add(grade2);
		menubar.add(choicegrade);
		setJMenuBar(menubar);
		textone=new JTextField(5);
		texttwo=new JTextField(5);
		textresult=new JTextField(5);
		operatorlabel=new JLabel("+");
		operatorlabel.setFont(new Font("Arial",Font.BOLD,20));
		message= new JLabel("你还没有回答呢");
		getproblem= new JButton("获取题目");
		giveanwser= new JButton("确认答案");
		add(getproblem);
		add(textone);
		add(operatorlabel);
		add(texttwo);
		add(new JLabel("="));
		add(textresult);
		add(giveanwser); 
		add(message);
		textresult.requestFocus();
		textone.setEditable(false);
		texttwo.setEditable(false);
		getproblem.setActionCommand("getproblem");
		textresult.setActionCommand("answer");
		giveanwser.setActionCommand("answer");
		teacherzhang.setJTextField(textone,texttwo,textresult);
		teacherzhang.setJLabel (operatorlabel,message);
		getproblem.addActionListener(teacherzhang);
		giveanwser.addActionListener(teacherzhang);
		textresult.addActionListener(teacherzhang);
		setVisible(true);
		validate();
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}
}
