public class PrincipalCartao {

	public static void main(String args[]) {
		Cartao c = new Cartao();
		MaquinaCartao m = new MaquinaCartao();
		
		c.setTitular("Leonardo");
		c.creditar(500);
		
		m.passar(c, 200);
		
		System.out.printf("CARTAO DE %s: %.2f - MAQUINA: %.2f\n", c.getTitular(), c.getSaldo(), m.getValorRecebido());
	}
}
