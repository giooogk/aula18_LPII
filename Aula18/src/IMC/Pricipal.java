package IMC;
import java.util.ArrayList;

public class Pricipal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PessoaIMC m = new Mulher();
		PessoaIMC h = new Homem();
		
		m.setNome("Frida ");
		h.setNome("Zé Lezin ");
		
		m.setDataNascimento("06/07/1907");
		h.setDataNascimento("20/01/1945");
		
		m.setAltura(1.69);
		h.setAltura(1.75);
		
		m.setPeso(50.2);
		h.setPeso(74.8);
		
		ArrayList<PessoaIMC> p = new ArrayList<PessoaIMC>();
		
		p.add(h);
		p.add(m);
		
		
		System.out.println(m.toString());
		//System.out.println(p.size());
		
//		for(PessoaIMC a : p){
//			if (a.equals(m)){
//				System.out.println("--------------------------------" +
//						"Nome:" + a.getNome() + 
//						" Data de Nascimento: " + a.getDataNascimento() +
//						" Peso: " + a.getPeso()+
//						" Altura: " + a.getAltura() +
//						" IMC: " + a.resultIMC() +
//						"--------------------------------");
//			}
//			else{
//				System.out.println("--------------------------------" +
//						"Nome:" + a.getNome() + 
//						" Data de Nascimento: " + a.getDataNascimento() +
//						" Peso: " + a.getPeso()+
//						" Altura: " + a.getAltura() +
//						" IMC: " + a.resultIMC()+
//						"--------------------------------");
//			}
//			
//		}

	}

}
