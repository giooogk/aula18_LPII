package IMC;
import java.util.Date;


public class Pessoa {
	protected String nome;
	protected Date dataNascimento;
	
	public String toString(){
		System.out.println("Nome: " + this.nome
				+ "Data de nascimento: " + this.dataNascimento);
		return nome + dataNascimento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	
}
