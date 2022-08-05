package entities;

public class Produto {

	private String nomeDeHeroi;
	private String universoPertence;

	public Produto() {

	}

	public String getNomeDeHeroi() {
		return nomeDeHeroi;
	}

	public void setNomeHeroi(String nomeDeHeroi) {
		this.nomeDeHeroi = nomeDeHeroi;
	}

	public String getUniversoPertence() {
		return universoPertence;
	}

	public void setUniversoPertence(String universoPertence) {
		this.universoPertence = universoPertence;
	
	}

	@Override
	public String toString() {

		return "\nNome do Heroi: " + nomeDeHeroi 
				+ "\nPertence ao universo: " + universoPertence;
	}
}
