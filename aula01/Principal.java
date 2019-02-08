public class Principal {
	public static void main(String args[]) {
		Pessoa p;
		p = new Pessoa();
		
		Pessoa p2 = new Pessoa();
		
		p.nome = "Leonardo";
		p.idade = 75;
		
		p2.nome = "Joao";
		p2.idade = 15;
		
		p.aniversario();
		p2.aniversario();
		
		System.out.printf("Nome: %s - Idade: %d\n", p.nome, p.idade);
		System.out.printf("Nome: %s - Idade: %d", p2.nome, p2.idade);
	}
}
