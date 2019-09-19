package IMC;
import java.util.ArrayList;



public class Pricipal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mulher m = new Mulher();
		Homem h = new Homem();
		
		ArrayList<Pessoa> p;
		p.add(m);
		p.add(h);
		
		System.out.println(p.size());
//		for(Pessoa p  : )
	//	System.out.println("---------------------------------------------" +
		//		m.getNome() + m.dataNascimento + m.getPeso() + m.getAltura());

	}

}
