package IMC;

public class Homem extends PessoaIMC{

	public String resultIMC() {
		// TODO Auto-generated method stub
		String re = null;
		if(calcularIMC(altura, peso) < 20.7){
			re = calcularIMC(altura, peso) + " Abaixo do peso ideal ";
		}
		else if(20.7 < calcularIMC(altura, peso) && calcularIMC(altura, peso) < 26.4){
			re = calcularIMC(altura, peso) + " Peso ideal ";
		}
		else{
			re = calcularIMC(altura, peso) + "Acima do peso ideal";
		}
		return re;
	}

}
