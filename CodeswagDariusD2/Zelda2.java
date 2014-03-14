import java.awt.event.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.*;

public class Zelda2 implements KeyListener,ActionListener{

private Timer time;
private JFrame win;
private GraphicsPanel2 gp;
private int key;


public Zelda2(){
 win=new JFrame("Zelda2");
 gp=new GraphicsPanel2();
 win.add(gp);
 win.setSize(1750 ,1070);
 win.setVisible(true);
 time=new Timer(14,this);
 time.start();
 win.addKeyListener(this);
 key= 0;
}

public void keyPressed(KeyEvent e){
key++;
	if(e.getKeyCode()==87){
		//W-Up
		gp.moveDir('u');
	}
	else if(e.getKeyCode()==83){
		//S-Down
		gp.moveDir('d');
	}
  	else if(e.getKeyCode()==68){
		//D-Right
		gp.moveDir('r');
	}
	else if(e.getKeyCode()==65){
		//A-Left
		gp.moveDir('l');
	}else if (e.getKeyCode() == KeyEvent.VK_SPACE) {
		gp.moveDir('s');
	}
	else if(e.getKeyCode()==82){
		//A-Left
		gp.reset();
	}
}

@Override
public void keyReleased(KeyEvent e) {
 key--;
 if (e.getKeyCode() == KeyEvent.VK_SPACE) {
		return;
	}/*
if (key != 0) {
 System.out.println("blegh");
 return;
} */
else gp.moveDir('x');
 /*	if(e.getKeyCode()==87){
		//W-Up
		System.out.println('u');
	}
	else if(e.getKeyCode()==83){
		//S-Down
		System.out.println('d');
	}
  	else if(e.getKeyCode()==68){
		//D-Right
		System.out.println('r');
	}
	else if(e.getKeyCode()==65){
		//A-Left
		System.out.print('l');
	}else 
	else if(e.getKeyCode()==82){
		//A-Left
		gp.reset();
	}
	*/

}

public void actionPerformed(ActionEvent e)
{
  gp.update();
  gp.repaint();

}

public static void main(String args[]){
 new Zelda2();
}




@Override
public void keyTyped(KeyEvent arg0) {
	// TODO Auto-generated method stub

}
}
