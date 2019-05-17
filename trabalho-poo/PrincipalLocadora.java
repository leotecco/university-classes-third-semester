import java.util.Scanner;

public class PrincipalLocadora {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int opcaoMenuPrincipal = 0;
		int opcaoMenuFuncionario = 0;
		
		do {
			PrincipalLocadora.mostrarMenuPrincipal();
			opcaoMenuPrincipal = scanner.nextInt();
			Screen.clear();
			
			switch(opcaoMenuPrincipal) {
				case 1:
					PrincipalLocadora.mostrarMenuFuncionarios();
					opcaoMenuFuncionario = scanner.nextInt();
			}
			
			PrincipalLocadora.mostrarMenuFuncionarios();
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
		System.out.print("OPCAO:");
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
		System.out.print("OPCAO:");
	}
}
