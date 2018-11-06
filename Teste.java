
public class Teste {
	
	public static void main(String[] args) {
		
		// criando uma instância do sistema
				Facade sistema = Facade.getInstance();
				// cadastrando disciplinas
				sistema.addDisciplina(null, "APS", "Danielle");
				sistema.addDisciplina("Programação Web", "WEB", "Francisco");
				// vendo se o cadastro está ok
				sistema.verDisciplinas();
				// cadastrando atividades
				sistema.addAtividade("Projeto de APS", "#projeto", 0);
				sistema.addAtividade("Review de Processos Ágeis", "#resumo", 0);
				sistema.addAtividade("Prova Final", "#prova", 1);
				// vendo se o cadastro de atividades está ok
				sistema.verAtividades();
	}
}
