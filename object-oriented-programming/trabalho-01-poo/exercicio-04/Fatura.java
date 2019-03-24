public class Fatura {
	private String numero;
	private String descricao;
	private int quantidadeItem;
	private float precoItem;
	
	public Fatura(String n, String d, int q, float p) {
		numero = n;
		descricao = d;
		quantidadeItem = q;
		precoItem = p;
	}
	
	public float calcularTotalFatura() {
		return quantidadeItem * precoItem;
	}
	
	public String getNumero() {
		return numero;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public int getQuantidadeItem() {
		return quantidadeItem;
	}
	
	public float getPrecoItem() {
		return precoItem;
	}
}
