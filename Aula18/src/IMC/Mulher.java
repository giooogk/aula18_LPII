package IMC;


public class Mulher extends PessoaIMC{

	public String resultIMC() {
		// TODO Auto-generated method stub
		String re = null;
		if(calcularIMC(altura, peso) < 19){
			re = calcularIMC(altura, peso) + " Abaixo do peso ideal ";
		}
		else if(19 < calcularIMC(altura, peso) && calcularIMC(altura, peso) < 25.8){
			re = calcularIMC(altura, peso) + " Peso ideal ";
		}
		else{
			re = calcularIMC(altura, peso) + "Acima do peso ideal";
		}
		return re;
	}
}
