package entities;

public class Veiculo {
	
	private int quantPneus;
	private double motor;
	private int quantPassageiros;
	private char tipoCombustivel;
	
	public int getQuantPneus() {
		return quantPneus;
	}
	public void setQuantPneus(int quantPneus) {
		this.quantPneus = quantPneus;
	}
	public double getMotor() {
		return motor;
	}
	public void setMotor(double motor) {
		this.motor = motor;
	}
	public int getQuantPassageiros() {
		return quantPassageiros;
	}
	public void setQuantPassageiros(int quantPassageiros) {
		this.quantPassageiros = quantPassageiros;
	}
	public char getTipoCombustivel() {
		return tipoCombustivel;
	}
	public void setTipoCombustivel(char tipoCombustivel) {
		this.tipoCombustivel = tipoCombustivel;
	}
	
	
	@Override
	public String toString() {
		return "\n*******Veículo*******\n"
				+"\nQuantidade de pneus: " + quantPneus
				+"\nPotencia do motor: " + motor
				+"\nQuantidade de passageiros: " + quantPassageiros
				+"\nTipo de combustivel: " + tipoCombustivel;
	}
	

}
