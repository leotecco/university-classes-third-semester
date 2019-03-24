// Alan da Silva Perez - RA: 578886
// Leonardo Jorge Tecco - RA: 577472

import java.util.Scanner;

public class TesteRetangulo {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		Retangulo r =  new Retangulo(); // cria objeto reangulo

		// informa valores para o objeto
		System.out.print("DIGITE A BASE DO RETANGULO: ");
		r.setBase(s.nextFloat());
		s.nextLine();
		
		System.out.print("DIGITE A ALTURA DO RETANGULO: ");
		r.setAltura(s.nextFloat());
		s.nextLine();
		
		// realiza os calculos atraves dos metodos
		System.out.printf("PERIMETRO: %f\n", r.calcularPerimetro());
		System.out.printf("AREA: %f", r.calcularArea());
	}
}
