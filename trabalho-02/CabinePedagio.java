// Alan da Silva Perez - RA: 578886
// Leonardo Jorge Tecco - RA: 577472

import java.util.Scanner;

public class CabinePedagio {
	private float valorPedagioPorEixo;
	private float valorTotalRecebido;
	
	public void preencherDados() {
		Scanner s = new Scanner(System.in);
		
		System.out.print("DIGITE O VALOR DO PEDAGIO POR EIXO: ");
		valorPedagioPorEixo = s.nextFloat();
		s.nextLine();
	}
	
	public void mostrarDados() {
		System.out.printf("VALOR PEDAGIO POR EIXO: %.2f\n", valorPedagioPorEixo);
		System.out.printf("VALOR TOTAL RECEBIDO: %.2f\n", valorTotalRecebido);
	}

	public boolean passarVeiculo(Automovel automovel) {
		float multiplicador;
		
		if (automovel instanceof Caminhao) {
			multiplicador = 2;
		} else if (automovel instanceof Motocicleta) {
			multiplicador = 1;
		} else {
			multiplicador = (float)0.5;
		}
		
		float valor = automovel.getEixos() * valorPedagioPorEixo * multiplicador;
		
		
		if (automovel.debitarSaldo(valor)) {
			valorTotalRecebido += valor;
			return true;
		}
		
		return false;
	}
	
}
