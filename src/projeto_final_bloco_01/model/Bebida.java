package projeto_final_bloco_01.model;

public abstract class Bebida {

	private float valor;
	private int quantidade;
	private String nome_bebida;
	private String caracteristica;
	private int id;
	
	
	public Bebida(float valor, int quantidade, String nome_bebida, String caracteristica, int id) {
		super();
		this.valor = valor;
		this.quantidade = quantidade;
		this.nome_bebida = nome_bebida;
		this.caracteristica = caracteristica;
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public String getNome_bebida() {
		return nome_bebida;
	}

	public void setNome_bebida(String nome_bebida) {
		this.nome_bebida = nome_bebida;
	}

	public String getCaracteristica() {
		return caracteristica;
	}

	public void setCaracteristica(String caracteristica) {
		this.caracteristica = caracteristica;
	}
	
	public void visualizar() {
		System.out.println("\n\n***********************************************************");
		System.out.println("BEBIDA CADASTRADA:");
		System.out.println("***********************************************************");
		System.out.println("Valor: " + this.valor);
		System.out.println("Caracteristica: " + this.caracteristica);
		System.out.println("Nome da bebida: " + nome_bebida);
		System.out.println("Quantidade: " + this.quantidade);
		
	}
}
