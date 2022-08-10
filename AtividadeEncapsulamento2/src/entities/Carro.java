package entities;

public class Carro {
	
	private int ano;
	private String modelo;
	private String cor;
	private String tipo;
	private String cambio;
	private String tipoCombustivel;
	private int valor;
	private String uso;
	private Clientes dono;
	
	public Carro() {
		
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) throws AnoException {
		if(ano >= 2019 ) {
			
		} else {
			throw new AnoException("Carro com mais de 3 anos de uso não são válidos.");
		}
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getCambio() {
		return cambio;
	}

	public void setCambio(String cambio) {
		this.cambio = cambio;
	}

	public String getTipoCombustivel() {
		return tipoCombustivel;
	}

	public void setTipoCombustivel(String tipoCombustivel) {
		this.tipoCombustivel = tipoCombustivel;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public String getUso() {
		return uso;
	}

	public void setUso(String uso) {
		this.uso = uso;
	}

	public Clientes getDono() {
		return dono;
	}

	public void setDono(Clientes dono) {
		this.dono = dono;
	}
	
	

}
