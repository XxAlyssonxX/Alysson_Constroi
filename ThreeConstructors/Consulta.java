package ThreeConstructors;

public class Consulta {
	private String data;
	private String nomePonte;
	private String nomeDents;
	
	public Consulta() {
	}
	
	public Consulta(String nomePonte) {
		this.nomePonte = nomePonte;
	}
	
	public Consulta(String data, String nomeDents) {
		this.data = data;
		this.nomeDents = nomeDents;
	}
	
	public String getData() {
		return data;
	}
	
	public String getPonte() {
		return nomePonte;
	}
	
	public String getDents() {
		return nomeDents;
	}
}
