import java.util.List;
import java.util.ArrayList;

public class Locadora {
	private List<Funcionario> funcionarios = new ArrayList<>();
	private List<Cliente> clientes = new ArrayList<>();
	private List<Veiculo> veiculos = new ArrayList<>();
	
	public void addFuncionario(Funcionario funcionario) {
		this.funcionarios.add(funcionario);
	}
	
	public Funcionario getFuncionario(int posFuncionario) {
		return this.funcionarios.get(posFuncionario);
	}
	
	public void removeFuncionario(int posFuncionario) {
		this.funcionarios.remove(posFuncionario);
	}
	
	public int getSizeFuncionarios() {
		return this.funcionarios.size();
	}
}
