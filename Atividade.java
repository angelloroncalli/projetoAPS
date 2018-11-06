import java.util.ArrayList;
import java.util.Date;

public class Atividade {

		private int id;
		private String nome;
		private String tag;
		private Date deadline;
		private int idDaDisciplina;
		private boolean concluida;
		private boolean emAndamento;
		private ArrayList<Atividade> atividadesConcluidas;
		private ArrayList<Atividade> atividadesEmAndamento;
		private ArrayList<String> tags;
		
		public Atividade(String nome, String tag, int idDaDisciplina) {
			
			this.nome = nome;
			this.tag = tag;
			this.idDaDisciplina = idDaDisciplina;
			this.atividadesConcluidas = new ArrayList<Atividade>();
			this.atividadesEmAndamento = new ArrayList<Atividade>();
			this.concluida = false;
			this.emAndamento = true;
			
		}
		
		public void concluirAtividade() {
			
			this.concluida = true;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getTag() {
			return tag;
		}

		public void setTag(String tag) {
			this.tag = tag;
		}

		public Date getDeadline() {
			return deadline;
		}

		public void setDeadline(Date deadline) {
			this.deadline = deadline;
		}

		public int getIdDaDisciplina() {
			return idDaDisciplina;
		}

		public void setIdDaDisciplina(int idDaDisciplina) {
			this.idDaDisciplina = idDaDisciplina;
		}

		public boolean isConcluida() {
			return concluida;
		}

		public void setConcluida(boolean concluida) {
			this.concluida = concluida;
		}

		public boolean isEmAndamento() {
			return emAndamento;
		}

		public void setEmAndamento(boolean emAndamento) {
			this.emAndamento = emAndamento;
		}

		public ArrayList<Atividade> getAtividadesConcluidas() {
			return atividadesConcluidas;
		}

		public void setAtividadesConcluidas(ArrayList<Atividade> atividadesConcluidas) {
			this.atividadesConcluidas = atividadesConcluidas;
		}

		public ArrayList<Atividade> getAtividadesEmAndamento() {
			return atividadesEmAndamento;
		}

		public void setAtividadesEmAndamento(ArrayList<Atividade> atividadesEmAndamento) {
			this.atividadesEmAndamento = atividadesEmAndamento;
		}

		public ArrayList<String> getTags() {
			return tags;
		}

		public void setTags(ArrayList<String> tags) {
			this.tags = tags;
		}
		
		public String toString() {
			
			return "Nome da Atividade: " + getNome() + "\n" + "Tag: " + getTag() + "\n" + "Id: " + getId() + "\n";
		}
		
}
