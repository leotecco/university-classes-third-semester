import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.DefaultListModel;
import java.awt.BorderLayout;

public class Principal extends JFrame {
	
	public Principal() {
		setLayout(null);
		setTitle("Principal");
		
		DefaultListModel<String> lista = new DefaultListModel();
		JList<String> jList = new JList<>(lista);
		JScrollPane jScrollPane = new JScrollPane(jList); 
		jScrollPane.setBounds(10, 10, 260, 100);
				
		JButton btnNovo = new JButton();
		btnNovo.setText("Novo");
		btnNovo.setBounds(50, 170, 80, 30);
		
		JButton btnEditar = new JButton();
		btnEditar.setText("Editar");
		btnEditar.setBounds(150, 170, 80, 30);
		
				
		btnNovo.addActionListener((e) -> {
			ProdutoJanela produtoJanela = new ProdutoJanela();
			
			// if (produtoJanela.isSalvar()) {
				Produto produto = produtoJanela.getProduto();
				lista.addElement(produto.toString());
			// }
		});
		
		btnEditar.addActionListener((e) -> {
			new ProdutoJanela();
		});
		
		add(jScrollPane);
		
	
		add(btnNovo);
		add(btnEditar);
		
		setSize(300, 250);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Principal();
	}
}
