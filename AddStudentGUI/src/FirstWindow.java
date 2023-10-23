import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
 
 
public class FirstWindow extends JFrame implements ItemListener{
    private static final long serialVersionUID = 1L;
	private Object GridLayout;
	private Object cb1;
 
    public FirstWindow() { /**Constructor*/
         
        //Setting title of window:
        super("Student Information System"); /**"super" refers to superclass == class you are extending == JFrame */
     
         
        //Setting default window size:
        setSize(600,600); /**Set window size widthxheight (px); method from JFrame*/
         
         
        //Setting default on how you close the window:  
        setDefaultCloseOperation(EXIT_ON_CLOSE); /**Exit application*/
        /** 
         * "setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);"
         *      Can't close program when trying to exit; Most of time, don't want to do this
         * */
         
        
        JLabel label;
        label = new JLabel("This has a border with a raised bevel edge!");
        
        label.setVerticalAlignment(JLabel.CENTER);
        
        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createTitledBorder("New Student"));
        
        Container container = new Container();
		container.add(panel);
        //Creating the panels:
        JPanel NewStudent = new JPanel(); 
        JPanel Buttons = new JPanel();
        JPanel AddStudent = new JPanel();
        JPanel ShowStudent = new JPanel(); 
        JPanel Modules = new JPanel();
        
        
        //Creating buttons & adding it to the panel:
        JButton b1 = new JButton("Button 1"); 
        JButton b2 = new JButton("Button 2"); 
         
        NewStudent.add(b1); 
        Buttons.add(b2);
         
        NewStudent.setBorder(BorderFactory.createTitledBorder("New Student")); 
        //Creating checkboxes & adding it to the panel:
        JCheckBox cb1 = new JCheckBox("Databases");
        cb1.setBounds(100,100, 50,50); 
        cb1.addItemListener(this);
        
        JCheckBox cb2 = new JCheckBox("Java");
        cb2.setBounds(100,100, 50,50);
        cb2.addItemListener(this);
        
        JCheckBox cb3 = new JCheckBox("Accountancy");
        cb3.setBounds(100,100, 50,50); 
        cb3.addItemListener(this);
        ShowStudent.add(cb1, GridLayout);
        ShowStudent.add(cb2, GridLayout);
        ShowStudent.add(cb3, GridLayout);
        
       
        
        //Creating label, text area, text field * & adding it to the panel: 
        JLabel label1 = new JLabel("Name");
        JLabel label2 = new JLabel("Address");/**Label = text on screen; can't change it*/
        JTextArea ta = new JTextArea("This is a text area"); /**Text area = can change it*/
        ta.setBounds(600, 600, 100, 100);
        JTextField textField = new JTextField("Peter Smith"); /**Text field = ~submitting form or something*/
        JTextField textField1 = new JTextField("35 Liffey Street, DUblin 2"); 
        
		Buttons.add(label1);
		NewStudent.add(ta);
		Buttons.add(textField);
		Buttons.add(label2);
        Buttons.add(textField1); 
        NewStudent.add(ta);
        
        //Adding the panels to the JFrame & specifying its location:
        /**Refers to JFrame which we extend to from this class*/
        add(NewStudent, BorderLayout.CENTER); 
        add(AddStudent, BorderLayout.SOUTH); /**Second parameter specifies the location of where to add the panel to the window; else overwrites & don't see all the panels*/
        add(Buttons, BorderLayout.NORTH);
       
        add(ShowStudent,BorderLayout.EAST);
   
        label.setBorder(BorderFactory.createRaisedBevelBorder());
    }

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		
	}
}
