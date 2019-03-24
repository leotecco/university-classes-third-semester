// Alan da Silva Perez - RA: 578886
// Leonardo Jorge Tecco - RA: 577472

import java.util.Scanner;

public class TesteCarro {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int quatidadeDeCarros;
		int posCarroAtual = 0;
		int opcaoMenuPrincipal = 0;
		Carro[] carros;

		System.out.print("QUANTIDADE DE CARROS: ");
		quatidadeDeCarros = s.nextInt();
		s.nextLine();

		carros = new Carro[quatidadeDeCarros];

		// cria objetos do tipo Carro
		for (; posCarroAtual < quatidadeDeCarros; posCarroAtual++) {
			Carro carro = new Carro();

			System.out.printf("CARRO %d\n", posCarroAtual + 1);

			System.out.println("PLACA DO CARRO: ");
			carro.setPlaca(s.nextLine());

			System.out.println("MODELO DO CARRO: ");
			carro.setModelo(s.nextLine());

			System.out.println("CAPACIDADE TANQUE DO CARRO: ");
			carro.setCapacidadeTanque(s.nextFloat());
			s.nextLine();

			System.out.println("MEDIA DE CONSUMO DO CARRO(km/l): ");
			carro.setMediaDeConsumo(s.nextFloat());
			s.nextLine();

			carros[posCarroAtual] = carro;
		}

		// inicia menu principal
		do {
			System.out.println("\n\nMENU PRINCIPAL");
			System.out.println("(1) LISTAR CARROS");
			System.out.println("(2) ESCOLHER CARRO");
			System.out.println("(0) SAIR");

			opcaoMenuPrincipal = s.nextInt();
			s.nextLine();

			switch (opcaoMenuPrincipal) {
			case 1:
				for (int i = 0; i < carros.length; i++) {
					System.out.printf("\n\nCARRO %d\n", i + 1);

					System.out.printf("PLACA DO CARRO: %s\n", carros[i].getPlaca());
					System.out.printf("MODELO DO CARRO: %s\n", carros[i].getModelo());
					System.out.printf("CAPACIDADE TANQUE DO CARRO: %.2f\n", carros[i].getCapacidadeTanque());
					System.out.printf("MEDIA DE CONSUMO DO CARRO(km/l): %.2f\n", carros[i].getMediaDeConsumo());
				}

				System.out.printf("\n\n");

				break;

			case 2:
				Carro carroEscolhido;
				int opcaoMenuEscolherCarro = 0;

				System.out.print("ESCOLHA UM CARRO: ");
				carroEscolhido = carros[(s.nextInt() - 1)];
				s.nextLine();

				System.out.printf("\n\nPLACA DO CARRO: %s\n", carroEscolhido.getPlaca());
				System.out.printf("MODELO DO CARRO: %s\n", carroEscolhido.getModelo());
				System.out.printf("CAPACIDADE TANQUE DO CARRO: %.2f\n", carroEscolhido.getCapacidadeTanque());
				System.out.printf("MEDIA DE CONSUMO DO CARRO(km/l): %.2f\n", carroEscolhido.getMediaDeConsumo());

				// inicia menu do carro com a referencia do carro selecionado na variavel carroEscolhido
				do {
					System.out.println("\n\nMENU CARRO");
					System.out.println("(1) ABASTECER");
					System.out.println("(2) ANDAR");
					System.out.println("(0) SAIR");

					opcaoMenuEscolherCarro = s.nextInt();
					s.nextLine();

					switch (opcaoMenuEscolherCarro) {
					case 1:
						float litros;
						System.out.println("LITROS: ");
						System.out.printf("LITROS ABASTECIDOS: %f", carroEscolhido.abastecer(s.nextFloat()));
						break;

					case 2:
						System.out.print("ANDAR(km): ");

						if (carroEscolhido.andar(s.nextFloat())) {
							System.out.print("CARRO ANDOU");
						} else {
							System.out.print("CARRO NAO ANDOU");
						}
						break;
					}

				} while (opcaoMenuEscolherCarro != 0);

				break;
			}
		} while (opcaoMenuPrincipal != 0);
	}
}
