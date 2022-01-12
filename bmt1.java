import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class bmt1 implements ActionListener{
    JFrame jf,f;
    int count=0;
    JLabel bookmy,name,phno,gender,date,time,movie,city,theatre,seats,cost;
    JTextField name1,phno1;
    JTextField seats1,cost1;
    JRadioButton male,female;
    String[] day={"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
    String[] month={"JAN","FEB","MAR","APR","MAY","JUN","JUL","AUG","SEPT","OCT","NOV","DEC"};
    String year[]={"2021","2022","2023","2024","2024","2025"};
    String city1[]={"Chennai","Bangalore","PKT","Coimbatore"};
    String movie1[]={"GRAY MAN","ATRANGI RE","VIKRAM","VALIMAI","BEAST"};
    String theatre1[]={"PVR","INOX","SPI","KARPAGAM"};
    JComboBox<String> day1,month1,year1,city2,movie2,theatre2;
    ImageIcon image;
    JButton proceed,jimg1;
    JPanel jseats;
    JButton A1, A2, A3, A4, A5, B1, B2, B3, B4, B5, C1, C2, C3, C4, C5;
    ButtonGroup b;
    bmt1(){
        JPanel jp=new JPanel();
        jf=new JFrame("TICKET BOOKING");
        bookmy=new JLabel("BOOK MY TICKETS");
        name=new JLabel("NAME:");
        phno=new JLabel("PH NO:");
        gender=new JLabel("GENDER:");
        date=new JLabel("DATE:");
        time=new JLabel("TIME:");
        movie=new JLabel("MOVIE:");
        city=new JLabel("CITY:");
        theatre=new JLabel("THEATRE:");
        seats=new JLabel("SEATS:");
        cost=new JLabel("COST:");

        name1=new JTextField(100);
        phno1=new JTextField(100);
        seats1=new JTextField(100);
        cost1=new JTextField(100);

        male=new JRadioButton("MALE");
        female=new JRadioButton("FEMALE");
        ButtonGroup gender1=new ButtonGroup();
        gender1.add(male);
        gender1.add(female);

        JCheckBox time1=new JCheckBox("10:00");
        JCheckBox time2=new JCheckBox("13:00");
        JCheckBox time3=new JCheckBox("16:00");
        ButtonGroup timez=new ButtonGroup();
        timez.add(time1);
        timez.add(time2);
        timez.add(time3);


        day1=new JComboBox<String>(day);
        month1=new JComboBox<String>(month);
        year1=new JComboBox<String>(year);
        movie2=new JComboBox<String>(movie1);
        movie2.addActionListener(this);
        city2=new JComboBox<String>(city1);
        theatre2=new JComboBox<String>(theatre1);

        JPanel jp1=new JPanel();
        ImageIcon image1=new ImageIcon("D:\\PIC\\bookmyt.jpg");
        jimg1=new JButton(image1);
        jimg1.setEnabled(true);
        jf.add(jimg1);

        jseats=new JPanel();
        jseats.setLayout(new GridLayout(3,5));

        A1=new JButton("A1");
        A2=new JButton("A2");
        A3=new JButton("A3");
        A4=new JButton("A4");
        A5=new JButton("A5");
        B1=new JButton("B1");
        B2=new JButton("B2");
        B3=new JButton("B3");
        B4=new JButton("B4");
        B5=new JButton("B5");
        C1=new JButton("C1");
        C2=new JButton("C2");
        C3=new JButton("C3");
        C4=new JButton("C4");
        C5=new JButton("C5");


        jseats.add(A1);
        jseats.add(A2);
        jseats.add(A3);
        jseats.add(A4);
        jseats.add(A5);
        jseats.add(B1);
        jseats.add(B2);
        jseats.add(B3);
        jseats.add(B4);
        jseats.add(B5);
        jseats.add(C1);
        jseats.add(C2);
        jseats.add(C3);
        jseats.add(C4);
        jseats.add(C5);

        A1.addActionListener(this);
        A2.addActionListener(this);
        A3.addActionListener(this);
        A4.addActionListener(this);
        A5.addActionListener(this);
        B1.addActionListener(this);
        B2.addActionListener(this);
        B3.addActionListener(this);
        B4.addActionListener(this);
        B5.addActionListener(this);
        C1.addActionListener(this);
        C2.addActionListener(this);
        C3.addActionListener(this);
        C4.addActionListener(this);
        C5.addActionListener(this);

        proceed=new JButton("PROCEED TO PAY");
        proceed.addActionListener(this);

        jf.add(bookmy);
        jf.add(name);
        jf.add(name1);
        jf.add(phno);
        jf.add(phno1);
        jf.add(gender);
        jf.add(male);
        jf.add(female);
        jf.add(date);
        jf.add(day1);
        jf.add(month1);
        jf.add(year1);
        jf.add(time);
        jf.add(time1);
        jf.add(time2);
        jf.add(time3);
        jf.add(movie);
        jf.add(movie2);
        jf.add(city);
        jf.add(city2);
        jf.add(theatre);
        jf.add(theatre2);
        jf.add(seats);
        jf.add(seats1);
        jf.add(cost);
        jf.add(cost1);
        jf.add(proceed);
        jf.add(jseats);

        bookmy.setBounds(280,0,400,50);
        name.setBounds(10,60,100,30);
        name1.setBounds(60,60,150,30);
        phno.setBounds(10,100,100,30);
        phno1.setBounds(60,100,150,30);
        gender.setBounds(10,150,100,30);
        male.setBounds(70,150,70,30);
        female.setBounds(140,150,100,30);
        date.setBounds(10,200,100,30);
        day1.setBounds(60,200,50,30);
        month1.setBounds(120,200,60,30);
        year1.setBounds(190,200,80,30);
        time.setBounds(10,250,100,30);
        time1.setBounds(50,250,60,30);
        time2.setBounds(110,250,60,30);
        time3.setBounds(170,250,60,30);
        movie.setBounds(10,300,100,30);
        movie2.setBounds(80,300,100,30);
        city.setBounds(10,350,100,30);
        city2.setBounds(80,350,100,30);
        theatre.setBounds(10,400,100,30);
        theatre2.setBounds(80,400,100,30);
        seats.setBounds(350,300,60,30);
        seats1.setBounds(410,300,150,30);
        cost.setBounds(350,350,60,30);
        cost1.setBounds(410,350,150,30);
        proceed.setBounds(50,500,200,40);
        jimg1.setBounds(410,60,150,200);
        jseats.setBounds(350,400,300,200);

        jf.add(jp);
        jf.getContentPane().setBackground(new Color(34, 124, 173, 247));
        jf.setVisible(true);
        jf.setSize(700,700);
        jf.setLayout(null);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent ae){
        String str=(String) movie2.getSelectedItem();
       // String str1=(String) ae.getSource();
        if(ae.getSource()==movie2)
        {
            if(str.equals("GRAY MAN")){
                jimg1.setIcon(new ImageIcon("D:\\PIC\\gray.jpg"));
            }
            if(str.equals("ATRANGI RE")){
                jimg1.setIcon(new ImageIcon("D:\\PIC\\atrangi.jpg"));
            }
            if(str.equals("VIKRAM")){
                jimg1.setIcon(new ImageIcon("D:\\PIC\\vik.jpg"));
            }
            if(str.equals("VALIMAI")){
                jimg1.setIcon(new ImageIcon("D:\\PIC\\valimai.jpg"));
            }
            if(str.equals("BEAST")){
                jimg1.setIcon(new ImageIcon("D:\\PIC\\beast.jpg"));
            }
        }
        else if(ae.getSource()==proceed)
        {
            f=new JFrame();
            f.setSize(500,200);
            JOptionPane.showMessageDialog(f,"SUCCESFULLY BOOKED","CONFIRMATION",JOptionPane.PLAIN_MESSAGE);
        }
        else {
            count++;

           if(ae.getSource()==A1){
               seats1.setText (Integer.toString(count));
               A1.setEnabled(false);
           }

            if(ae.getSource()==A2){
                seats1.setText (Integer.toString(count));
                A2.setEnabled(false);
            }

            if(ae.getSource()==A3){
                seats1.setText (Integer.toString(count));
                A3.setEnabled(false);
            }


            if(ae.getSource()==A4){
                seats1.setText (Integer.toString(count));
                A4.setEnabled(false);
            }

            if(ae.getSource()==A5){
                seats1.setText (Integer.toString(count));
                A5.setEnabled(false);
            }

            if(ae.getSource()==B1){
                seats1.setText (Integer.toString(count));
                B1.setEnabled(false);
            }

            if(ae.getSource()==B2){
                seats1.setText (Integer.toString(count));
                B2.setEnabled(false);
            }

            if(ae.getSource()==B3){
                seats1.setText (Integer.toString(count));
                B3.setEnabled(false);
            }

            if(ae.getSource()==B4){
                seats1.setText (Integer.toString(count));
                B4.setEnabled(false);
            }

            if(ae.getSource()==B5){
                seats1.setText (Integer.toString(count));
                B5.setEnabled(false);
            }

            if(ae.getSource()==C1){
                seats1.setText (Integer.toString(count));
                C1.setEnabled(false);
            }

            if(ae.getSource()==C2){
                seats1.setText (Integer.toString(count));
                C2.setEnabled(false);
            }

            if(ae.getSource()==C3){
                seats1.setText (Integer.toString(count));
                C3.setEnabled(false);
            }

            if(ae.getSource()==C4){
                seats1.setText (Integer.toString(count));
                C4.setEnabled(false);
            }
            if(ae.getSource()==C5){
                seats1.setText (Integer.toString(count));
                C5.setEnabled(false);
            }
           int c1=count*200;
         cost1.setText(Integer.toString(c1));
        }

    }
    public static void main(String[] args)
    {
        bmt1 m=new bmt1();
    }
}