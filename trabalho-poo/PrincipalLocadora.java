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
								Cliente cliente = new Cliente();
								
								System.out.print("NOME: ");
								cliente.setNome(scanner.nextLine());
								System.out.print("CPF: ");
								cliente.setCpf(scanner.nextLine());
								System.out.print("RG: ");
								cliente.setRg(scanner.nextLine());
								System.out.print("TELEFONE: ");
								cliente.setTelefone(scanner.nextLine());
								System.out.print("CNH: ");
								cliente.setCnh(scanner.nextLine());
								System.out.print("VALIDADE CNH: ");
								cliente.setValidadeCnh(scanner.nextLine());
								
								locadora.addCliente(cliente);
								
								break;
							case 2:
								int quantidadeClientes = locadora.getSizeClientes();
								
								System.out.println("");
								
								for (int i = 0; i < quantidadeClientes; i++) {
									Cliente clienteAtual = locadora.getCliente(i);
									
									System.out.println("#" + i + " CLIENTE");
									System.out.println("NOME: " + clienteAtual.getNome());
									System.out.println("CPF: " + clienteAtual.getCpf());
									System.out.println("RG: " + clienteAtual.getRg());
									System.out.println("TELEFONE: " + clienteAtual.getTelefone());
									System.out.println("CNH: " + clienteAtual.getCnh());
									System.out.println("VALIDADE CNH: " + clienteAtual.getValidadeCnh());
									
									System.out.println("");
								}
								
								break;
							case 3:
								System.out.print("NUMERO DO CLIENTE QUE DESEJA REMOVER: ");
								int posicaoClienteRemovido = scanner.nextInt();
								scanner.nextLine();
								
								try {
									locadora.removeCliente(posicaoClienteRemovido);
									System.out.println("CLIENTE REMOVIDO COM SUCESSO!");
								} catch(Exception e) {
									System.out.println("CLIENTE NAO ENCONTRADO!");
								}
								
								break;
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
								Veiculo veiculo = new Veiculo();
								
								System.out.print("PLACA: ");
								veiculo.setPlaca(scanner.nextLine());
								System.out.print("MODELO: ");
								veiculo.setModelo(scanner.nextLine());
								System.out.print("ANO: ");
								veiculo.setAno(scanner.nextInt());
								System.out.print("QUILOMETRAGEM: ");
								veiculo.setQuilometragem(scanner.nextFloat());
								scanner.nextLine();
								System.out.print("LOCADO(S/N): ");
								veiculo.setLocado(scanner.nextLine());
								System.out.print("VALOR DA LOCACAO: ");
								veiculo.setValorDaLocacao(scanner.nextFloat());
								scanner.nextLine();
								
								locadora.addVeiculo(veiculo);
								
								break;
							case 2:
								int quantidadeVeiculos = locadora.getSizeVeiculos();
								
								System.out.println("");
								
								for (int i = 0; i < quantidadeVeiculos; i++) {
									Veiculo veiculoAtual = locadora.getVeiculo(i);
									
									System.out.println("#" + i + " VEICULO");
									System.out.println("PLACA: " + veiculoAtual.getPlaca());
									System.out.println("MODELO: " + veiculoAtual.getModelo());
									System.out.println("ANO: " + veiculoAtual.getAno());
									System.out.println("QUILOMETRAGEM: " + veiculoAtual.getQuilometragem());
									System.out.println("LOCADO(S/N): " + veiculoAtual.getLocado());
									System.out.println("VALOR DA LOCACAO: " + veiculoAtual.getValorDaLocacao());									
									
									System.out.println("");
								}
								
								break;
							case 3:
								System.out.print("NUMERO DO VEICULO QUE DESEJA REMOVER: ");
								int posicaoVeiculoRemovido = scanner.nextInt();
								scanner.nextLine();
								
								try {
									locadora.removeVeiculo(posicaoVeiculoRemovido);
									System.out.println("VEICULO REMOVIDO COM SUCESSO!");
								} catch(Exception e) {
									System.out.println("VEICULO NAO ENCONTRADO!");
								}
								
								break;
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
