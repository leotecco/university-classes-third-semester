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
	
	public void addCliente(Cliente cliente) {
		this.clientes.add(cliente);
	}
	
	public Cliente getCliente(int posCliente) {
		return this.clientes.get(posCliente);
	}
	
	public void Cliente(int posCliente) {
		this.clientes.remove(posCliente);
	}
	
	public void removeCliente(int posCliente) {
		this.clientes.remove(posCliente);
	}
	
	public int getSizeClientes() {
		return this.clientes.size();
	}
	
	public void addVeiculo(Veiculo veiculo) {
		this.veiculos.add(veiculo);
	}
	
	public Veiculo getVeiculo(int posVeiculo) {
		return this.veiculos.get(posVeiculo);
	}
	
	public void Veiculo(int posVeiculo) {
		this.veiculos.remove(posVeiculo);
	}
	
	public void removeVeiculo(int posVeiculo) {
		this.veiculos.remove(posVeiculo);
	}
	
	public int getSizeVeiculos() {
		return this.veiculos.size();
	}
}
