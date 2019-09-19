package IMC;


public abstract class PessoaIMC extends Pessoa{
	private double peso;
	private double altura;
	
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
		return (nome + dataNascimento + this.peso + this.altura);
	}
}
