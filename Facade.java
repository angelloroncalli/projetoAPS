import java.util.ArrayList;

public class Facade {
	
	private ArrayList<Atividade> atividades;
	private ArrayList<Disciplina> disciplinas;
	private static Facade INSTANCIA = null;
	
	public Facade() {
		
		this.atividades = new ArrayList<Atividade>();
		this.disciplinas = new ArrayList<Disciplina>();
	}
	
	public static Facade getInstance() {
		
		return INSTANCIA == null ? new Facade() : INSTANCIA;
	}

	public ArrayList<Atividade> getAtividades() {
		return atividades;
	}

	public void setAtividades(ArrayList<Atividade> atividades) {
		this.atividades = atividades;
	}

	public ArrayList<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}
	
	public void addAtividade(String nome, String tag, int id) {
		
		Atividade atividade = new Atividade(nome, tag, id);
		this.atividades.add(atividade);
	}
	
	public void addDisciplina(String nome, String acronimo, String nomeProfessor) {
		
		Disciplina disciplina = new Disciplina(nome, acronimo, nomeProfessor);
		this.disciplinas.add(disciplina);
	}
	
	public void verAtividades() {
		
		atividades = getAtividades();
		for (Atividade atividade : atividades) {
			System.out.println(atividade.toString());
		}
	}
	
	public void verDisciplinas() {
		
		disciplinas = getDisciplinas();
		for (Disciplina disciplina : disciplinas) {
			System.out.println(disciplina.toString());
		}
	}
}
