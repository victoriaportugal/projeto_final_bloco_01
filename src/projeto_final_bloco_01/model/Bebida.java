package projeto_final_bloco_01.model;

public abstract class Bebida {
	
	private int id;
	private float valor;
	private int quantidade;
	private String nome_bebida;
	private String sabor_massa;

	public Bebida(int id, float valor, int quantidade, String nome_bebida, String sabor_massa) {
		this.id = id;
		this.valor = valor;
		this.quantidade = quantidade;
		this.nome_bebida = nome_bebida;
		this.sabor_massa = sabor_massa;
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
		return sabor_massa;
	}

	public void setCaracteristica(String caracteristica) {
		this.sabor_massa = caracteristica;
	}

	public void visualizar() {
		System.out.println("\n**");
		System.out.println("Dados da bebida:");
		System.out.println("**");
		System.out.println("Valor: " + this.valor);
		System.out.println("Quantidade: " + quantidade);
		System.out.println("Nome da bebida: " + this.nome_bebida);
		System.out.println("Sabor da massa: " + this.sabor_massa);

	}

}
