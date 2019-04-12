// Alan da Silva Perez - RA: 578886
// Leonardo Jorge Tecco - RA: 577472

import java.util.Scanner;

public class PrincipalCabine {

	public static void main(String args[]) {
		Automovel[] automoveis = new Automovel[1000];
		CabinePedagio[] cabines = new CabinePedagio[1000];
		Scanner s = new Scanner(System.in);
		int opcaoEscolhida = 0;
		int posicaoAutomoveis = 0;
		int posicaoCabines = 0;

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
					Automovel automovel = new Automovel();
					automovel.preencherDados();
					automoveis[posicaoAutomoveis] = automovel;
					posicaoAutomoveis++;
				break;
				
				case 2: 
					Caminhao caminhao = new Caminhao();
					caminhao.preencherDados();
					automoveis[posicaoAutomoveis] = caminhao;
					posicaoAutomoveis++;
				break;
				
				case 3: 
					Motocicleta motocicleta = new Motocicleta();
					motocicleta.preencherDados();
					automoveis[posicaoAutomoveis] = motocicleta;
					posicaoAutomoveis++;
				break;
				case 4: 
					CabinePedagio cabine = new CabinePedagio();
					cabine.preencherDados();
					cabines[posicaoCabines] = cabine;
					posicaoCabines++;
				break;
				case 5: 
					int contadorAutomoveis = 0;
					for (Automovel a : automoveis) {
						if (a == null) {
							break;
						}
						
						System.out.println("================");
						System.out.printf("#%d AUTOMOVEL\n", contadorAutomoveis);
						a.mostrarDados();
						System.out.println("================");
						contadorAutomoveis++;
					}
				break;
				
				case 6: 
					int contadorCabines = 0;
					for (CabinePedagio c : cabines) {
						if (c == null) {
							break;
						}
						
						System.out.println("================");
						System.out.printf("#%d CABINE\n", contadorCabines);
						c.mostrarDados();
						System.out.println("================");
						contadorCabines++;
					}
				break;
				
				case 7: 
					System.out.print("DIGITE O NUMERO DO AUTOMOVEL: ");
					Automovel automovelEscolhido = automoveis[s.nextInt()];
					s.nextLine();
					
					System.out.print("AUTOMOVEL SELECIONADO: ");
					automovelEscolhido.mostrarDados();
					
					System.out.print("DIGITE O NUMERO DA CABINE: ");
					CabinePedagio cabineEscolhida = cabines[s.nextInt()];
					s.nextLine();
					
					System.out.print("CABINE SELECIONADA: ");
					cabineEscolhida.mostrarDados();
					
					if (!cabineEscolhida.passarVeiculo(automovelEscolhido)) {
						System.out.print("SALDO INSUFICIENTE!");
					}
					
					System.out.print("AUTOMOVEL ATUALIZADO: ");
					automovelEscolhido.mostrarDados();
					
					System.out.print("CABINE ATUALIZADA: ");
					cabineEscolhida.mostrarDados();
				break;
			}
		} while(opcaoEscolhida != 8);
	}

}
