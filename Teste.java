
public class Teste {
	
	public static void main(String[] args) {
		
		// criando uma inst�ncia do sistema
				Facade sistema = Facade.getInstance();
				// cadastrando disciplinas
				sistema.addDisciplina(null, "APS", "Danielle");
				sistema.addDisciplina("Programa��o Web", "WEB", "Francisco");
				// vendo se o cadastro est� ok
				sistema.verDisciplinas();
				// cadastrando atividades
				sistema.addAtividade("Projeto de APS", "#projeto", 0);
				sistema.addAtividade("Review de Processos �geis", "#resumo", 0);
				sistema.addAtividade("Prova Final", "#prova", 1);
				// vendo se o cadastro de atividades est� ok
				sistema.verAtividades();
	}
}
