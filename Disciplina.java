	
public class Disciplina {

	private String nome;
	private String acronimo;
	private String nomeProfessor;
	
	public Disciplina(String nome, String acronimo, String nomeProfessor) {
		
		this.nome = nome;
		this.acronimo = acronimo;
		this.nomeProfessor = nomeProfessor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getAcronimo() {
		return acronimo;
	}

	public void setAcronimo(String acronimo) {
		this.acronimo = acronimo;
	}

	public String getNomeProfessor() {
		return nomeProfessor;
	}

	public void setNomeProfessor(String nomeProfessor) {
		this.nomeProfessor = nomeProfessor;
	}
	
	public String toString() {
		
		return "Nome da Disciplina: " + getNome() + "\n" + "Acronimo: " + getAcronimo() + "\n" + "Nome do Professor: " + getNomeProfessor() + "\n";
	}

}
