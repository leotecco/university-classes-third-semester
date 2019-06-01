import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ProdutoJanela extends JDialog {
	private Produto produto;
	
	public ProdutoJanela() {
		setLayout(null);
		setModal(true);
		setTitle("Produto");
		
		JLabel labelNome = new JLabel("Nome");
		JLabel labelDescricao = new JLabel("Descricao");
		JLabel labelPreco = new JLabel("Preco");
		JLabel labelPeso = new JLabel("Peso");
		
		JTextField txtNome = new JTextField();
		JTextArea txtDescricao = new JTextArea();
		JTextField txtPreco = new JTextField();
		JTextField txtPeso = new JTextField();
		
		JButton btnSalvar = new JButton("Salvar");
		JButton btnCancelar = new JButton("Cancelar");				
		
		labelNome.setBounds(10, 0, 100, 50);
		txtNome.setBounds(60, 10, 200, 30);
		
		labelDescricao.setBounds(10, 40, 100, 50);
		txtDescricao.setBounds(80, 60, 175, 85);
		
		labelPreco.setBounds(10, 150, 100, 50);
		txtPreco.setBounds(60, 160, 200, 30);
		
		labelPeso.setBounds(10, 200, 100, 50);
		txtPeso.setBounds(60, 210, 200, 30);
		
		btnSalvar.setBounds(10, 260, 100, 30);
		btnCancelar.setBounds(160, 260, 100, 30);
		
		add(labelNome);
		add(labelDescricao);
		add(labelPreco);
		add(labelPeso);
		
		add(txtNome);
		add(txtDescricao);
		add(txtPreco);
		add(txtPeso);
		
		add(btnSalvar);
		add(btnCancelar);
		
		btnSalvar.addActionListener((e) -> {
			try {
				produto = new Produto();
			
				produto.setNome(txtNome.getText());
				produto.setDescricao(txtDescricao.getText());
				produto.setPreco(Float.parseFloat(txtPreco.getText()));
				produto.setPeso(Float.parseFloat(txtPeso.getText()));
			} catch (Exception ex) {
			}
			
			dispose();
		});
		
		btnCancelar.addActionListener((e) -> {
			dispose();
		});
		
		setSize(290, 340);
		setVisible(true);
	}
	
	public Produto getProduto() {
		return produto;
	} 
	
	public static void main(String[] args) {
		new ProdutoJanela();
	}
}

