package desbravandoorientacaoobjetos;

public class Livro {
	private String nome;
	private String descricao;
	private double valor;
	private String isbn;
	private Autor autor;
	
	public Livro(Autor autor){
		setAutor(autor);
		setNome(null);
		setDescricao(" ");
		setValor(0);
		setIsbn("000-00-00000-00-0");
	}
	public String getNome(){
		return nome;
	}
	public void setNome(String nome){
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public Autor getAutor() {
		return autor;
	}
	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	public boolean aplicaDesconto(double porcentagem){
		if(porcentagem>0.3){
			return false;
		}
		this.valor -= this.valor*porcentagem;
		return true;
	}
	public boolean isAutor(){
		return this.autor!=null;
	}
	@Override
	public String toString(){
		return "Nome: "+getNome()+
			"\nValor: "+getValor()+
			"\nISBN: "+getIsbn()+
			"Descricao:"+getDescricao();
	}
	
}