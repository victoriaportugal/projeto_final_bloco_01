package projeto_final_bloco_01.model;

public class MilkShake extends Bebida {

	private String cobertura;
	private String massa;
	private boolean confete;


	public MilkShake(float valor, int quantidade, String nome_bebida, String caracteristica, int id, String cobertura,
			String massa, boolean confete) {
		super(valor, quantidade, nome_bebida, caracteristica, id);
		this.cobertura = cobertura;
		this.massa = massa;
		this.confete = confete;
	}

	public String getCobertura() {
		return cobertura;
	}

	public void setCobertura(String cobertura) {
		this.cobertura = cobertura;
	}

	public String getMassa() {
		return massa;
	}

	public void setMassa(String massa) {
		this.massa = massa;
	}

	public boolean isConfete() {
		return confete;
	}

	public void setConfete(boolean confete) {
		this.confete = confete;
	}

}
