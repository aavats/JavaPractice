import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseListener;

class MyWindwoApp implements MouseMotionListener,MouseListener
{
	JFrame aframe;
	public MyWindwoApp()
	{
		aframe = new JFrame("New Frame");
		aframe.addMouseMotionListener(this);
		aframe.addMouseListener(this);
		aframe.setSize(400,400);
		aframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		aframe.setVisible(true);
	}
	

	@Override
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub
		//JOptionPane.showMessageDialog(aframe, "Mouse got dragged!!");
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub
		//JOptionPane.showMessageDialog(aframe, "Mouse got Moved!!");
		
	}


	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(aframe, "Mouse got clicked");
		
	}


	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		//JOptionPane.showMessageDialog(aframe, "Mouse entered!!");
	}


	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(aframe, "Mouse got exited!");
	}


	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}



public class InterfaceInEventHandling {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyWindwoApp anewwindow = new MyWindwoApp();
		
	}

}
