// Alan da Silva Perez - RA: 578886
// Leonardo Jorge Tecco - RA: 577472

import java.util.Scanner;

public class TesteLivros {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		Livro l = new Livro(); // cria objeto livro

		// informa os valores para o objeto
		System.out.println("CADASTRAR LIVRO ");
		System.out.print("DIGITE O TITULO: ");
		l.setTitulo(s.nextLine());
		System.out.print("DIGITE O AUTOR: ");
		l.setAutor(s.nextLine());
		System.out.print("DIGITE A DESCRICAO: ");
		l.setDescricao(s.nextLine());
		System.out.print("DIGITE O PRECO: ");
		l.setPreco(s.nextFloat());
		s.nextLine();
		
		// chama metodos que retornam os valores
		System.out.println("LIVRO CADASTRADO");
		System.out.printf("TITULO: %s\n", l.getTitulo());
		System.out.printf("AUTOR: %s\n", l.getAutor());
		System.out.printf("DESCRICAO: %s\n", l.getDescricao());
		System.out.printf("PRECO: %f", l.getPreco());
	}
}
