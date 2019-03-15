public class Cartao {
	private float saldo;
	private String titular;
	
	public Cartao(String t) {
		titular = t;
	}

	public void creditar(float paramFloat) {
		saldo += paramFloat;
	}
  
	public boolean debitar(float paramFloat) {
		if (saldo >= paramFloat) {
			saldo -= paramFloat;
			return true;
		}

		return false;
	}
	
	public float getSaldo() {
		return saldo;
	}
	
	public void setTitular(String t) {
		titular = t;
	}
	
	public String getTitular() {
		return titular;
	}
}
