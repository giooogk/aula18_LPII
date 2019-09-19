package IMC;


public class Pessoa {
	protected String nome;
	protected String dataNascimento;
	
	public String toString(){
		String info = "Nome: " + this.nome
				+ "Data de nascimento: " + this.dataNascimento;
		return info;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String data) {
		this.dataNascimento = data;
	}
	
	
}
