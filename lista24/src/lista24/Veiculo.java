package lista24;

public class Veiculo {
	
	private String marca;
	private int ano;
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano2) {
		this.ano = ano2;
	}
	
	public void exibirInfo() {
		System.out.println("O veículo é da marca " + marca+ " e do ano " + ano);
		
	}
}