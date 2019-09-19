public class Taxi extends Veiculo implements CarbonFootprint {
	private int quantPessoas;

	public int getQuantPessoas() {
		return quantPessoas;
	}

	public void setQuantPessoas(int quantPessoas) {
		this.quantPessoas = quantPessoas;
	}

	public double getCarbonFootprint() {
		// TODO Auto-generated method stub
		return getQuilometragem() * 1.10;
	}

}
