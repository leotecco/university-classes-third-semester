// Alan da Silva Perez - RA: 578886
// Leonardo Jorge Tecco - RA: 577472

public class Carro {
	private String placa;
	private String modelo;
	private float tanque;
	private float capacidadeTanque;
	private float mediaDeConsumo;

	public boolean andar(float km) {
		float consumo = km / mediaDeConsumo;

		if (tanque >= consumo) {
			tanque -= consumo;

			return true;
		}

		return false;
	}

	public float abastecer(float litros) {
		if ((tanque + litros) < capacidadeTanque) {
			tanque += litros;
			return litros;
		}

		litros = capacidadeTanque - tanque;
		tanque = capacidadeTanque;

		return litros;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String p) {
		placa = p;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String m) {
		modelo = m;
	}

	public float getCapacidadeTanque() {
		return capacidadeTanque;
	}

	public void setCapacidadeTanque(float c) {
		capacidadeTanque = c;
	}

	public float getMediaDeConsumo() {
		return mediaDeConsumo;
	}

	public void setMediaDeConsumo(float mc) {
		mediaDeConsumo = mc;
	}
}
