public class TesteFatura {
	public static void main(String args[]) {
		Fatura f = new Fatura("2378924", "TESTE DE FATURA", 10, (float)105.50);
		
		System.out.printf("NUMERO DA FATURA: %s\n", f.getNumero());
		System.out.printf("DESCRICAO DA FATURA: %s\n", f.getDescricao());
		System.out.printf("QUANTIDADE DE ITENS DA FATURA: %s\n", f.getQuantidadeItem());
		System.out.printf("PRECO ITEM DA FATURA: %s\n", f.getPrecoItem());
		System.out.printf("VALOR TOTAL DA FATURA: %s\n", f.calcularTotalFatura());
	}
}
