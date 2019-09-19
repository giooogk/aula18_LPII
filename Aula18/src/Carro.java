public class Carro extends Veiculo implements CarbonFootprint {
	private double motor;

	public double getMotor() {
		return motor;
	}

	public void setMotor(double motor) {
		this.motor = motor;
	}

	public double getCarbonFootprint() {
		// TODO Auto-generated method stub
		if (motor >= 2.0) 
		{
			return getQuilometragem() * 1.85;
		}
		
		if (motor > 1.0 && motor < 2.0) 
		{
			return getQuilometragem() * 1.22;
		}
		
		if (motor <= 1.0) 
		{
			return getQuilometragem() * 0.13;
		}
		
		return 0;
	}

}
