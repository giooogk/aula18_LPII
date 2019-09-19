public class Moto extends Veiculo implements CarbonFootprint {
	private int cilindradas;

	public int getCilindradas() {
		return cilindradas;
	}

	public void setCilindradas(int cilindradas) {
		this.cilindradas = cilindradas;
	}

	public double getCarbonFootprint() {
		// TODO Auto-generated method stub
		if (cilindradas >= 650) 
		{
			return getQuilometragem() * 0.65;
		}
		
		if (cilindradas > 150 && cilindradas < 650) 
		{
			return getQuilometragem() * 0.50;
		}
		
		if (cilindradas <= 150) 
		{
			return getQuilometragem() * 0.20;
		}
		
		return 0;
	}

}
