import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StartHere {
    public static void main (String arg[]){
 
        FirstWindow fw = new FirstWindow(); 
        fw.setVisible(true); /**Can see the new window*/
     
    }
}
cb1.addActionListener(new ActionListener()
{
    public void actionPerformed(ActionEvent e)
    {
        textA.setText("Databases");
        
       
    }
});