package IMC;


public abstract class PessoaIMC extends Pessoa{
	protected double peso;
	protected double altura;
	
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double calcularIMC(double altura,double peso){
		return (peso/(altura*altura));
	}
	public abstract String resultIMC();
	
	public String toString(){
		String info = "Nome: " + this.nome
				+ "Data de nascimento: " + this.dataNascimento
				+"Altura: " +this.altura + "Peso: " + this.peso
				+ "IMC: " + resultIMC();
		return info;
	}
	public void setDataNascimento(String string) {
		// TODO Auto-generated method stub
		
	}
}
