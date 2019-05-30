import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Janela extends JFrame {
	public Janela(){
		setLayout(null);
		
		JLabel lblNome = new JLabel();
		lblNome.setText("Nome: ");
		lblNome.setBounds(10,10,100,30);
		
		JTextField txtNome = new JTextField();
		txtNome.setBounds(110,10,150,30);
		
		JButton bt = new JButton();
		bt.setText("OK");
		bt.setBounds(210,210,60,30);
		//bt.addActionListener(new Evento());
		
		/*bt.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				System.out.printf("Clicou novo");
			}
		});*/
		
		bt.addActionListener((e) -> {
				/*int numero = Integer.parseInt(txtNumero.getText());
				System.out.printf("Numero %d\n",numero);*/
				
				System.out.printf("Numero %s\n",txtNome.getText());
		});
		
		
		add(lblNome);add(txtNome);
		add(bt);
		
		setSize(300,300);
		setVisible(true);
	}
	public static void main(String args[]){
			new Janela();new Janela(); 
	}
}
