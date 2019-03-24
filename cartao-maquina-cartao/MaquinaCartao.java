public class MaquinaCartao{
    private float valorRecebido;
    
    boolean passar(Cartao c, float valor){
		boolean deuCerto = c.debitar(valor);
	
		if (deuCerto){
			valorRecebido+=valor;
			return true;
		} else {
			System.out.printf("nao autorizado");
			return false;
		}
	}
	
	public float getValorRecebido() {
		return valorRecebido;
	}
}
