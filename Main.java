import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

class frame  implements ActionListener {
	String degree[]= {"b.tech","m.tech"};
	String year[]= {"1","2","3","4"};
	String date[]= {"1","2","3","4","5","6","7","8","9","10"};
	String mon[]= {"january","febrarauay"};
	String yr[]= {"1980","1950","2000","2002"};
	String branch[]= {"CSE","IT","ICT","IOT"};
	String activity[]= {"tennis","cricket","basketball"}; 
	JFrame f;
	JButton b3;
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l12,l11,t;
	JCheckBox cb,cb1,cb2;
	final JList list;
	JTextArea a,jt;
	JTextField t1,t2,t3;
	JRadioButton b1,b2;
	
	JComboBox jb,jb2,jb3,jb4,jb5,jb6;
	frame(){
		 f=new JFrame("Response form");
		 t=new JLabel("Student Response Form");
		t.setBounds(300,0, 250, 100); 
		f.add(t); 
		 l1=new JLabel("Register No"); 
		 l2=new JLabel("Name");
		 l3=new JLabel("gender");
		 l4=new JLabel("Degree");
		 l5=new JLabel("Branch");
		 l6=new JLabel("Year of study");
		 l7=new JLabel("Date of birth");
		l8=new JLabel("Address");
		 l9=new JLabel("Email id");
		l10=new JLabel("Hobby");
		 l11=new JLabel("Extra Curricular Activities");
		 l12=new JLabel("you entered");
		cb=new JCheckBox("stamp collection");
		 cb1=new JCheckBox("reading novels");
		 cb2=new JCheckBox("playing tennis");
		JPanel jp3=new JPanel();
		jp3.add(cb);
		jp3.add(cb1);
		jp3.add(cb2);
		list=new JList<String>(activity);
		JScrollPane jsp=new JScrollPane(list);
		 a=new JTextArea(60,80);
		JScrollPane jsp1=new JScrollPane(a);
		 t1=new JTextField(50);
		 t2=new JTextField(50);
		 b3=new JButton("submit");
		JPanel jp=new JPanel();
		 b1=new JRadioButton("Male");
		 b2=new JRadioButton("FeMale"); 
		ButtonGroup bg=new ButtonGroup();
		bg.add(b1);
		bg.add(b2); 
		jp.add(b1);
		jp.add(b2);
		jb=new JComboBox(degree);
	 jb2=new JComboBox(branch);
		 jb3=new JComboBox(year);
		 jb4=new JComboBox(date);
		 jb5=new JComboBox(mon);
		 jb6=new JComboBox(yr);
		JPanel jp2=new JPanel(); 
		jp2.add(jb4);
		jp2.add(jb5); 
		jp2.add(jb6);
		 jt=new JTextArea(50,90);
	 t3=new JTextField(50);
		l1.setBounds(10,60, 100, 50); 
		t1.setBounds(120, 80, 100, 20); 
		l10.setBounds(380,50, 50, 55);
		
		jp3.setBounds(400, 60, 400, 50);
		l11.setBounds(380, 100, 200, 40); 
		jsp.setBounds(420, 150, 150, 50);
		l12.setBounds(380, 200,80 ,50);
		jsp1.setBounds(400, 250, 350, 300);
		l2.setBounds(10,100, 100, 50);  
		t2.setBounds(120, 120, 100, 20); 
		
		l3.setBounds(10,140, 100, 50); 
		//b1.setBounds(90, 130, 90, 70);     
		//b2.setBounds(110, 150, 10, 30); 
		jp.setLayout(new GridLayout(1,2));  
		jp.setBounds(120, 140, 190, 50);
		l4.setBounds(10,180, 100, 50);
		jb.setBounds(120, 190, 90, 30);
		l5.setBounds(10,220, 100, 50); 
		jb2.setBounds(120, 230, 60, 30);
		l6.setBounds(10,260, 100, 50);
		jb3.setBounds(120, 270, 50, 20);
		l7.setBounds(10,300, 100, 50); 
		jp2.setBounds(120, 300, 200, 50);
		l8.setBounds(10,340, 100, 50); 
	    jt.setBounds(120, 340, 250, 150);
		l9.setBounds(10,500, 100, 50);
		t3.setBounds(120,510 ,250, 30);
        b3.setBounds(90,600, 80, 50); 
		
		
        list.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		 
		
		f.add(l1); 
		f.add(t1);  
		f.add(l10);
		f.add(jp3);
		f.add(l11);
		f.add(jsp);
		f.add(l12);
		f.add(jsp1);
		f.add(l2);
		f.add(t2); 
		f.add(l3);
		f.add(jp); 
		f.add(l4);
		f.add(jb);
		f.add(l5);
		f.add(jb2);
		f.add(l6);
		f.add(jb3);
		f.add(l7);
		f.add(jp2);
		f.add(l8);
		f.add(jt);
		f.add(l9);
		f.add(t3);
		f.add(b3);
		b3.addActionListener(this);
	
		f.setSize(800,700);
		f.setLayout(null);
		f.setVisible(true);
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e) {
	String s1;
	if(b1.isSelected()) {
		s1="male";
	} 
	if(b2.isSelected()) {
		s1="female";
	}
	String msge=" ";
	if(cb.isSelected()) {
		msge+=cb.getText() + " ";
	}
	if(cb1.isSelected()) {
		msge+=cb1.getText() + " ";
	}
	if(cb2.isSelected()) {
		msge+=cb2.getText() + " ";
	}
	
	a.append("her register number is "+ t1.getText() +"\n");
	a.append("her  name is "+ t2.getText() +"\n");
	
	a.append("she is studying in "+ (String)jb3.getItemAt(jb3.getSelectedIndex())+ jb.getItemAt(jb.getSelectedIndex())+ jb2.getItemAt(jb2.getSelectedIndex())+"\n");
	a.append("she was born on" + jb4.getItemAt(jb4.getSelectedIndex()) +"-"+jb5.getItemAt(jb5.getSelectedIndex()) +"-"+ jb3.getItemAt(jb3.getSelectedIndex())+"\n");
	a.append("she is residing at " + jt.getText() +"\n");
	a.append("her email id "+ t3.getText() + "\n");
	a.append("she is interested in "+ msge +"\n");
	
	
	a.append("she plays "+ "well" + "\n");
	ListModel j=list.getModel();
	for(int i=0;i<j.getSize();i++) {
		String dat=(String)j.getElementAt(i);
		a.append(dat);
	}
	a.append("well" +"\n");
	
	
} 
}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		frame ob=new frame();

	}

}
