import java.util.Scanner;

public class TesteRetangulo {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		Retangulo r =  new Retangulo();

		System.out.print("DIGITE A BASE DO RETANGULO: ");
		r.setBase(s.nextFloat());
		s.nextLine();
		
		System.out.print("DIGITE A ALTURA DO RETANGULO: ");
		r.setAltura(s.nextFloat());
		s.nextLine();
		
		System.out.printf("PERIMETRO: %f\n", r.calcularPerimetro());
		System.out.printf("AREA: %f", r.calcularArea());
	}
}
