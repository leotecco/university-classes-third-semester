// Alan da Silva Perez - RA: 578886
// Leonardo Jorge Tecco - RA: 577472

public class Livro {
	private String titulo;
	private String autor;
	private String descricao;
	private float preco;
	
	public void setTitulo(String t) {
		titulo = t;
	}
	
	public void setAutor(String a) {
		autor = a;
	}
	
	public void setDescricao(String d) {
		descricao = d;
	}
	
	public void setPreco(float p) {
		preco = p;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public String getAutor() {
		return autor;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public float getPreco() {
		return preco;
	}
}
