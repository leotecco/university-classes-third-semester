import javax.swing.JFrame;
import javax.swing.JButton;

public class Principal extends JFrame {
	
	public Principal() {
		setLayout(null);
		setTitle("Principal");
				
		JButton btnNovo = new JButton();
		btnNovo.setText("Novo");
		btnNovo.setBounds(50, 50, 200, 30);
		
		JButton btnEditar = new JButton();
		btnEditar.setText("Editar");
		btnEditar.setBounds(50, 110, 200, 30);
		
				
		btnNovo.addActionListener((e) -> {
			new Produto();
		});
		
		btnEditar.addActionListener((e) -> {
			new Produto();
		});
		
		add(btnNovo);
		add(btnEditar);
		
		setSize(300, 230);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Principal();
	}
}
