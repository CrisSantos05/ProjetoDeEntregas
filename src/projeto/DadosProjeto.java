package projeto;

public class DadosProjeto {
	 private String nome;
	private float pesoProduto;
	private double kmViagem;
	//private double valorEntrega;
	
	
	
	void status() {
		
		System.out.println("Produto: " + nome);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPesoProduto() {
		return pesoProduto;
	}
	public void setPesoProduto(float pesoProduto) {
		this.pesoProduto = pesoProduto;
	}
	public double getKmViagem() {
		return kmViagem;
	}
	public void setKmViagem(double kmViagem) {
		this.kmViagem = kmViagem;
	}
	/*public double getValorEntrega() {
		return valorEntrega;
	}
	public void setValorEntrega(double valorEntrega) {
		this.valorEntrega = valorEntrega;
	}*/
	
	
	

}
