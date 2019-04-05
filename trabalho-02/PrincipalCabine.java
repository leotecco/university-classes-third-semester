import java.util.Scanner;

public class PrincipalCabine {

	public static void main(String args[]) {
		Automovel[] automoveis = new Automovel[1000];
		CabinePedagio[] cabines = new CabinePedagio[1000];
		Scanner s = new Scanner(System.in);
		int opcaoEscolhida = 0;

		do {
			System.out.println("");
			System.out.println("");		
			System.out.println("======== MENU PRINCIPAL ========");
			System.out.println("");
			System.out.println("");
			System.out.println("1 - CRIAR AUTOMOVEL");
			System.out.println("2 - CRIAR CAMINHAO");
			System.out.println("3 - CRIAR MOTOCICLETA");
			System.out.println("4 - CRIAR CABINE PEDAGIO");
			System.out.println("5 - LISTAR AUTOMOVEIS");
			System.out.println("6 - LISTAR CABINES PEDAGIO");
			System.out.println("7 - PASSAR VEICULO");
			System.out.println("8 - SAIR");
			System.out.println("");
			System.out.println("");			
			System.out.print("DIGITE A OPCAO: ");
			opcaoEscolhida = s.nextInt();
			s.nextLine();
			
			switch(opcaoEscolhida) {
				case 1: 
				
				break;
				
				case 2: 
				
				break;
				
				case 3: 
				
				break;
				
				case 4: 
				
				break;
				
				case 5: 
				
				break;
				
				case 6: 
				
				break;
				
				case 7: 
				
				break;
			}
		} while(opcaoEscolhida != 8);
	}

}
