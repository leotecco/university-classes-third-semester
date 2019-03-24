// Alan da Silva Perez - RA: 578886
// Leonardo Jorge Tecco - RA: 577472

public class Retangulo {
	private float base;
	private float altura;
	
	public float calcularPerimetro() {
		return (base * 2) + (altura * 2);
	}
	
	public float calcularArea() {
		return base * altura;
	}
	
	public void setBase(float b) {
		base = b;
	}
	
	public void setAltura(float a) {
		altura = a;
	}
	
	public float getBase() {
		return base;
	}
	
	public float getAltura() {
		return altura;
	}
}
