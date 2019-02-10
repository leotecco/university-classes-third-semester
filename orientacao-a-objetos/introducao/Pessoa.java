public class Pessoa {
	String nome;
	int idade;
	float peso;
	
	void aniversario() {
		idade++;
	}
	
	void andar() {
		peso -= 0.01;
	}
	
	void comer() {
		peso += 1;
	}
}
