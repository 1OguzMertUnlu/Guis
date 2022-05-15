import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;

public class Gui1 extends JFrame implements ActionListener,ItemListener{

	private JTextField   txt1,txt2;
	private JLabel lbl1,lbl2,lblempty;
	private JButton btn1;
	private ButtonGroup grb;
	private JRadioButton rbtn1,rbtn2,rbtn3,rbtn4;
	private JPanel pnl1,pnl2;
	public Gui1() {
		
		txt1 = new JTextField(9);
		txt2 = new JTextField();
		
		
		setLayout(new GridLayout(2,1));
	    lbl1 = new JLabel("sayi1");
		lbl2 = new JLabel("sayi2");
		lblempty=new JLabel(" ");
		
		btn1=new JButton("hesapla");
		grb = new ButtonGroup();
		
		btn1.addActionListener(this);
		
		rbtn1= new JRadioButton("toplama");
		rbtn2= new JRadioButton("cýkarma");
		rbtn3= new JRadioButton("carpma");
		rbtn4= new JRadioButton("bolme");
		
		rbtn1.addItemListener(this);
		
	    grb.add(rbtn1);
	    grb.add(rbtn2);
	    grb.add(rbtn3);
	    grb.add(rbtn4);
	    
	   
	    pnl1= new JPanel();
		pnl2= new JPanel();
		
		pnl1.setLayout(new GridLayout(3,2));	
		pnl2.setLayout(new GridLayout(1,4));
        		
		 
		pnl1.add (lbl1);
		pnl1.add (txt1);
		pnl1.add (lbl2);
		pnl1.add (txt2);
		pnl1.add(lblempty);
		pnl1.add(btn1);
		

		grb.add(rbtn1);
		grb.add(rbtn2);
		grb.add(rbtn3);
		grb.add(rbtn4);
		
		pnl2.add(rbtn1);
		pnl2.add(rbtn2);
		pnl2.add(rbtn3);
		pnl2.add(rbtn4); 
		
		
		
		add (pnl1);
		add(pnl2);
		
		
		setVisible(true);
		setLocationRelativeTo(null);
		setSize(300,400);
		setTitle("combobox example");
	}
	public static void main(String[] args) {
		new Gui1();
	}
	@Override
	public void itemStateChanged(ItemEvent event) {
		
		
	}
	@Override
	public void actionPerformed(ActionEvent event) {
		String number1=txt1.getText();
		String number2=txt2.getText();
		
		int fnum=Integer.parseInt(number1);
		int snum=Integer.parseInt(number2);
		
		int result;
		
		if(event.getSource()==btn1 && rbtn1.isSelected())
		{
			result=fnum+snum;
			lblempty.setText("result"+ result);
		}
		
		else if(event.getSource()==btn1 && rbtn2.isSelected())
		{
			result=fnum-snum;
			lblempty.setText("result"+ result);
		}
		else if(event.getSource()==btn1 && rbtn3.isSelected())
		{
			result=fnum*snum;
			lblempty.setText("result"+ result);
		}
		else if(event.getSource()==btn1 && rbtn4.isSelected())
		{
			result=fnum/snum;
			lblempty.setText("result"+ result);
		}
	}
}
