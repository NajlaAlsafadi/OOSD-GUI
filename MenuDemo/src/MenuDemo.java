import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.KeyEvent;
import java.util.EventListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JTextArea;

public class MenuDemo implements EventListener
{  
	public static void main(String[] args){
		JFrame frame = new JFrame("Simple Menu Excercise");
    String itemSateChanged;
 
	JTextArea tA = new JTextArea();
	JMenu faceMenu = new JMenu ("Face");
	faceMenu.setMnemonic(KeyEvent.VK_U);
	faceMenu.add(new JMenuItem("Chin"));
	faceMenu.add(new JMenuItem("Nose"));
	faceMenu.add(new JMenuItem("eyes"));
	faceMenu.add(new JMenuItem("Mouth"));
	
	
	JMenu bodyMenu =new JMenu ("Body");
	bodyMenu.setMnemonic(KeyEvent.VK_S);
	ButtonGroup b =new ButtonGroup();
	JRadioButtonMenuItem head = new JRadioButtonMenuItem("Head");
	
	b.add(head);
	bodyMenu.add(head);
	
      
	
	JRadioButtonMenuItem shoulders = new JRadioButtonMenuItem("Shoulders");
	b.add(shoulders);
	bodyMenu.add(shoulders);


	JRadioButtonMenuItem knees = new JRadioButtonMenuItem("Knees");
	b.add(knees);
	bodyMenu.add(knees);
	JRadioButtonMenuItem toes = new JRadioButtonMenuItem("Toes");
	b.add(toes);
	bodyMenu.add(toes);
	
	
  
	
	JMenuBar menuBar = new JMenuBar();
	menuBar.add(faceMenu);
	menuBar.add(bodyMenu);
	frame.setJMenuBar(menuBar);
	frame.add(tA);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setSize(500,350);
	frame.setVisible(true);
	
	
	@Override
	public void itemStateChanged(ItemEvent e) 
	{
		String selected = "";
		
		if (head.isSelected())
		{
			selected += head.getText()+"\n";
		}
		
		if (shoulders.isSelected()) 
		
		{
			selected += shoulders.getText()+"\n";
		}
		
		if (knees.isSelected()) 
		{
			selected+= knees.getText()+"\n";
		}
		if (toes.isSelected()) 
		{
			selected+= toes.getText()+"\n";
		}
		
		tA.setText(selected);
	}
    
        
	
	
	}
	
  

}
