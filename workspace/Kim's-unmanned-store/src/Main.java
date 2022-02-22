import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

class Ex1{
	private Frame mainFrame;
	private JPanel controlPanel;
	
    ImageIcon i = new ImageIcon("C:\\Users\\user\\Desktop\\���ȭ��\\�ھ���.png");
    Image im=i.getImage();
    
	Ex1(){
		prepareGUI();
    }
	
	private void prepareGUI() {
		// Frame ����
		mainFrame = new Frame("�ھ��� ���ΰ���"); 
		mainFrame.setExtendedState(Frame.MAXIMIZED_BOTH);
	    mainFrame.setLocationRelativeTo(null);
	    mainFrame.setResizable(false);
	    mainFrame.addWindowListener(new WindowAdapter() {
	       public void windowClosing(WindowEvent windowEvent) {
	          System.exit(0);
	       }
	    });
	    
	    MyPanel panel = new MyPanel();
	    panel.setLayout(new FlowLayout(FlowLayout.CENTER, 1000, 10));
	   
	    // ��ư
	    panel.add(new RoundedButton("  �α���  "));
	    panel.add(new RoundedButton("�α׾ƿ�"));
	    panel.setBorder(BorderFactory.createEmptyBorder(700, 0, 0, 0));
	    
	    mainFrame.add(panel);
	    mainFrame.setVisible(true);
	}
	
	
    class MyPanel extends JPanel{   
        public void paintComponent(Graphics g){
            super.paintComponent(g);
            g.drawImage(im,0,0,getWidth(),getHeight(),this);
        }
    }
}

public class Main {
    public static void main(String[] args) {
         new Ex1();
    } 
}