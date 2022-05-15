
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.*;
import javax.swing.JOptionPane;
import java.awt.event.*;

public class Gui2 extends JFrame implements ItemListener
{

	private JComboBox combo;
	private JLabel lbl;
	private Icon[] icon = {new ImageIcon(getClass().getResource("at.jpg")),new ImageIcon(getClass().getResource("keçi.jpg"))};
	
	public Gui2()
	{
		
		super("JCombobox Example");
		String[] animal = {"Seciniz","at", "keçi"};
		setLayout(new FlowLayout());
		
		combo=new JComboBox(animal);
		
		lbl=new JLabel("image..");
		combo.addItemListener(this);
		add(combo);
		add(lbl);
		
		setVisible(true);
		setLocationRelativeTo(null);
		setSize(500,500);
	}
	
public static void main(String[] args) {
		
		new Gui2();
	}



@Override
public void itemStateChanged(ItemEvent e) {
	// TODO Auto-generated method stub
	switch(combo.getSelectedIndex())
	{
	case 1:
		lbl.setIcon(icon[0]);
		break;
	case 2:
		lbl.setIcon(icon[1]);
		break;
}
}
	
}

