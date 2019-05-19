import java.util.Scanner;

public class PrincipalLocadora {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int opcaoMenuPrincipal = 0;
		int opcaoMenuFuncionario = 0;
		int opcaoMenuCliente = 0;
		int opcaoMenuVeiculo = 0;
		
		Locadora locadora = new Locadora();
		
		do {
			PrincipalLocadora.mostrarMenuPrincipal();
			opcaoMenuPrincipal = scanner.nextInt();
			scanner.nextLine();
			
			switch(opcaoMenuPrincipal) {
				case 1:
					do {
						PrincipalLocadora.mostrarMenuFuncionarios();
						opcaoMenuFuncionario = scanner.nextInt();
						scanner.nextLine();
						
						switch(opcaoMenuFuncionario) {
							case 1:
								Funcionario funcionario = new Funcionario();
								
								System.out.print("NOME: ");
								funcionario.setNome(scanner.nextLine());
								System.out.print("CPF: ");
								funcionario.setCpf(scanner.nextLine());
								System.out.print("RG: ");
								funcionario.setRg(scanner.nextLine());
								System.out.print("TELEFONE: ");
								funcionario.setTelefone(scanner.nextLine());
								System.out.print("CARGO: ");
								funcionario.setCargo(scanner.nextLine());
								System.out.print("SALARIO: ");
								funcionario.setSalario(scanner.nextFloat());
								
								locadora.addFuncionario(funcionario);
								
								break;
							case 2:
								int quantidadeFuncionarios = locadora.getSizeFuncionarios();
								
								System.out.println("");
								
								for (int i = 0; i < quantidadeFuncionarios; i++) {
									Funcionario funcionarioAtual = locadora.getFuncionario(i);
									
									System.out.println("#" + i + " FUNCIONARIO");
									System.out.println("NOME: " + funcionarioAtual.getNome());
									System.out.println("CPF: " + funcionarioAtual.getCpf());
									System.out.println("RG: " + funcionarioAtual.getRg());
									System.out.println("TELEFONE: " + funcionarioAtual.getTelefone());
									System.out.println("CARGO: " + funcionarioAtual.getCargo());
									System.out.println("SALARIO: " + funcionarioAtual.getSalario());
									
									System.out.println("");
								}
								
								break;
							case 3:
								System.out.print("NUMERO DO FUNCIONARIO QUE DESEJA REMOVER: ");
								int posicaoFuncionarioRemovido = scanner.nextInt();
								scanner.nextLine();
								
								try {
									locadora.removeFuncionario(posicaoFuncionarioRemovido);
									System.out.println("FUNCIONARIO REMOVIDO COM SUCESSO!");
								} catch(Exception e) {
									System.out.println("FUNCIONARIO NAO ENCONTRADO!");
								}
								
								break;
						}
					} while(opcaoMenuFuncionario != 0);
					
					break;
				case 2: 
					do {
						PrincipalLocadora.mostrarMenuClientes();
						opcaoMenuCliente = scanner.nextInt();
						scanner.nextLine();
						
						switch(opcaoMenuCliente) {
							case 1:
							case 2:
							case 3:
						}
					} while(opcaoMenuCliente != 0);
					
					break;
				case 3: 
					do {
						PrincipalLocadora.mostrarMenuVeiculos();
						opcaoMenuVeiculo = scanner.nextInt();
						scanner.nextLine();
						
						switch(opcaoMenuVeiculo) {
							case 1:
							case 2:
							case 3:
						}
					} while(opcaoMenuVeiculo != 0);
					
					break;
			}
		} while(opcaoMenuPrincipal != 0);
	}
	
	public static void mostrarMenuPrincipal() {
		System.out.println("");
		System.out.println("====== LOCADORA DE VEICULOS ======");
		System.out.println("");
		System.out.println("1 - GERENCIAR FUNCIONARIOS");
		System.out.println("2 - GERENCIAR CLIENTES");
		System.out.println("3 - GERENCIAR VEICULOS");
		System.out.println("4 - REGISTRAR LOCACAO");
		System.out.println("5 - REGISTRAR DEVOLUCAO");
		System.out.println("0 - SAIR");
		System.out.println("");
		System.out.print("OPCAO: ");
	}
	
	public static void mostrarMenuFuncionarios() {
		System.out.println("");
		System.out.println("====== LOCADORA DE VEICULOS - FUNCIONARIOS ======");
		System.out.println("");
		System.out.println("1 - ADICIONAR FUNCIONARIO");
		System.out.println("2 - LISTAR FUNCIONARIOS");
		System.out.println("3 - EXCLUIR FUNCIONARIO");
		System.out.println("0 - SAIR");
		System.out.println("");
		System.out.print("OPCAO: ");
	}
	
	public static void mostrarMenuClientes() {
		System.out.println("");
		System.out.println("====== LOCADORA DE VEICULOS - CLIENTES ======");
		System.out.println("");
		System.out.println("1 - ADICIONAR CLIENTE");
		System.out.println("2 - LISTAR CLIENTES");
		System.out.println("3 - EXCLUIR CLIENTE");
		System.out.println("0 - SAIR");
		System.out.println("");
		System.out.print("OPCAO: ");
	}
	
	public static void mostrarMenuVeiculos() {
		System.out.println("");
		System.out.println("====== LOCADORA DE VEICULOS - VEICULOS ======");
		System.out.println("");
		System.out.println("1 - ADICIONAR VEICULO");
		System.out.println("2 - LISTAR VEICULOS");
		System.out.println("3 - EXCLUIR VEICULO");
		System.out.println("0 - SAIR");
		System.out.println("");
		System.out.print("OPCAO: ");
	}
}
