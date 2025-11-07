package lista24;

public class Cachorro extends Animal{
	
	private String raca;

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}
	
	public void abanarRabo() {
		System.out.println("O cachorro da raça " + getRaca() + " está abanando o rabo");
	}

	
}
