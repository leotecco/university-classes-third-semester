import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.BorderLayout;

public class Teste{
	public static void main(String args[]){
		JFrame obj = new JFrame();

		JLabel rotulo = new JLabel();
		rotulo.setText("Ola mundo");
		
		JButton bt = new JButton();
		bt.setText("OK");
		
		obj.add(rotulo,BorderLayout.NORTH);
		obj.add(bt,BorderLayout.SOUTH);
		
		obj.setSize(300,300);
		obj.setVisible(true);
	}
}
