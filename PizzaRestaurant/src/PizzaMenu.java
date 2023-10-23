import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.KeyEvent;
import java.util.EventListener;
import java.awt.event.ItemListener;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JTextArea;
import javax.swing.JTextField;

@SuppressWarnings("unused")
public class PizzaMenu implements EventListener
{  
	public static void main(String[] args){
		JFrame frame = new JFrame("Pizza Restaurant");
    
 
	JTextArea tA = new JTextArea();
	
	//menu user
		JMenu user = new JMenu ("Users");
		
		
		///////////////////////////////////////////////////
		JMenu chilliLevel =new JMenu ("Chilli Level");
		chilliLevel.setMnemonic(KeyEvent.VK_S);
		ButtonGroup b =new ButtonGroup();
		JRadioButtonMenuItem zero  = new JRadioButtonMenuItem("Level 0: No Chilli");
		b.add(zero);
		chilliLevel.add(zero);
		zero.setSelected(true);
		
		zero.addActionListener(new ActionListener()
	    {  public void actionPerformed(ActionEvent e)
	    {String selected = "";
	  	  if (zero.isSelected()) {
	  		  
	  		  selected += zero.getText()+"\n";
	  	  }
	  	  tA.setText(selected);
	    }
	});
		
		JRadioButtonMenuItem one  = new JRadioButtonMenuItem("Level 1: Mild Chilli");
		b.add(one);
		chilliLevel.add(one);
		   
			  one.addActionListener(new ActionListener()
	          {  public void actionPerformed(ActionEvent e)
	          {String selected = "";
	        	  if (one.isSelected()) {
	        		  
	        		  selected += one.getText()+"\n";
	        	  }
	        	  tA.setText(selected);
	          }
	      });
		JRadioButtonMenuItem two = new JRadioButtonMenuItem("Level 2: Hot Chilli");
		b.add(two);
		chilliLevel.add(two);
		
		two.addActionListener(new ActionListener()
	    {  public void actionPerformed(ActionEvent e)
	    {String selected = "";
	  	  if (two.isSelected()) {
	  		  
	  		  selected += two.getText()+"\n";
	  	  }
	  	  tA.setText(selected);
	    }
	});
		
		/////////////////////////
	JLabel username = new JLabel("Username");
		
		JTextField username1 = new JTextField();
		JLabel password = new JLabel("Password");
		JPasswordField password1 = new JPasswordField();
		
		
		final JComponent[] values = new JComponent[] {
				
				username, username1, password,password1
				
		};
		login.addActionListener(new ActionListener()
		
	    {  public void actionPerformed(ActionEvent e)
	    {
	  	  if (login.isSelected()) {
	  		  
	  		JOptionPane.showMessageDialog(null,values, "Login", JOptionPane.PLAIN_MESSAGE);
	  		
	  	  }
	  	 
	    }
	});
		////////////////////////
		
		JRadioButtonMenuItem three = new JRadioButtonMenuItem("Level 3: Extra Hot Chilli");
		b.add(three);
		chilliLevel.add(three);
		
		three.addActionListener(new ActionListener()
	    {  public void actionPerformed(ActionEvent e)
	    {String selected = "";
	  	  if (three.isSelected()) {
	  		  
	  		  selected += three.getText()+"\n";
	  	  }
	  	  tA.setText(selected);
	    }
	});

		
		JRadioButtonMenuItem four  = new JRadioButtonMenuItem("Level 4: Habenero-Hot");
		b.add(four);
		chilliLevel.add(four);
		four.addActionListener(new ActionListener()
	    {  public void actionPerformed(ActionEvent e)
	    {String selected = "";
	  	  if (four.isSelected()) {
	  		  
	  		  selected += four.getText()+"\n";
	  	  }
	  	  tA.setText(selected);
	    }
	});//////
		///////////////////////////////////////////////////
		
		
		
	//ingredients menu
	JMenu Ingredients = new JMenu ("Ingredients");
	Ingredients.setMnemonic(KeyEvent.VK_S);
	Ingredients.add(new JCheckBoxMenuItem("Tomato"));
	Ingredients.add(new JCheckBoxMenuItem("Cheese"));
	Ingredients.add(new JCheckBoxMenuItem("Pineapple"));
	Ingredients.add(new JCheckBoxMenuItem("Olives"));
	Ingredients.add(new JCheckBoxMenuItem("Mushrooms"));
	Ingredients.add(new JCheckBoxMenuItem("Onions"));
	Ingredients.addSeparator();
	Ingredients.add(new JCheckBoxMenuItem("Pork MeatBalls"));
	Ingredients.add(new JCheckBoxMenuItem("Pepperoni"));
	Ingredients.add(new JCheckBoxMenuItem("Ham"));
	Ingredients.add(new JCheckBoxMenuItem("Bacon"));
	
	Ingredients.addItemListener((ItemListener) frame);
	 
	
	
	
	//chilli level menu
	JMenu chilliLevel =new JMenu ("Chilli Level");
	chilliLevel.setMnemonic(KeyEvent.VK_S);
	ButtonGroup b =new ButtonGroup();
	JRadioButtonMenuItem zero  = new JRadioButtonMenuItem("Level 0: No Chilli");
	b.add(zero);
	chilliLevel.add(zero);
	
	JRadioButtonMenuItem one  = new JRadioButtonMenuItem("Level 1: Mild Chilli");
	b.add(one);
	chilliLevel.add(one);
	
	JRadioButtonMenuItem two = new JRadioButtonMenuItem("Level 2: Hot Chilli");
	b.add(two);
	chilliLevel.add(two);
	
	JRadioButtonMenuItem three = new JRadioButtonMenuItem("Level 3: Extra Hot Chilli");
	b.add(three);
	chilliLevel.add(three);
	
	JRadioButtonMenuItem four  = new JRadioButtonMenuItem("Level 4: Habenero-Hot");
	b.add(four);
	chilliLevel.add(four);
	
	
	//menu orders
	JMenu orders = new JMenu ("Order");
	orders.setMnemonic(KeyEvent.VK_S);
	ButtonGroup b1 =new ButtonGroup();
	JRadioButtonMenuItem veggie  = new JRadioButtonMenuItem("Prepare Veggie Pizza");
	b1.add(veggie);
	orders.add(veggie);
	
	
	JRadioButtonMenuItem nonveggie  = new JRadioButtonMenuItem("Prepare Non-Veggie Pizza");
	b1.add(nonveggie);
	orders.add(nonveggie);
	
	
	
	
	
  
	
	JMenuBar menuBar = new JMenuBar();
	
	menuBar.add(user);
	menuBar.add(Ingredients);
	menuBar.add(chilliLevel);
	menuBar.add(orders);
	

	frame.setJMenuBar(menuBar);
	frame.add(tA);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setSize(500,350);
	frame.setVisible(true);
	}}