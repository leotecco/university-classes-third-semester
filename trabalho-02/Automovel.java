// Alan da Silva Perez - RA: 578886
// Leonardo Jorge Tecco - RA: 577472

import java.util.Scanner;

public class Automovel {
	private int eixos;
	private float saldo;
	private float multiplicador = (float)0.5;
	
	public void preencherDados() {
		Scanner s = new Scanner(System.in);
		
		System.out.print("DIGITE A QUANTIDADE DE EIXOS: ");
		eixos = s.nextInt();
		s.nextLine();
		
		System.out.print("DIGITE O SALDO INICIAL: ");
		saldo = s.nextFloat();
		s.nextLine();
	}
	
	public boolean debitarSaldo(float valor) {
		if (valor > saldo) {
			return false;
		}
		
		saldo -= valor;
		return true;
	}
	
	public void mostrarDados() {
		System.out.printf("EIXOS: %d\n", eixos);
		System.out.printf("SALDO: %.2f\n", saldo);
	}
	
	public int getEixos() {
		return eixos;
	}
	
	public float getSaldo() {
		return saldo;
	}
	
	public void setEixos(int e) {
		eixos = e;
	}
	
	public void setSaldo(float s) {
		saldo = s;
	}
}
