package projeto_final_bloco_01.model;

public class MilkShake extends Bebida {

    private String cobertura;
    private String temConfete;

    
    public MilkShake(int id, float valor, int quantidade, String nome_bebida, String sabor_massa, String cobertura, String temConfete) {
    	super(id, valor, quantidade, nome_bebida, sabor_massa);
        this.cobertura = cobertura;
        this.temConfete = temConfete;
    }


	public String getCobertura() {
		return cobertura;
	}


	public void setCobertura(String cobertura) {
		this.cobertura = cobertura;
	}


	public String isTemConfete() {
		return temConfete;
	}


	public void setTemConfete(String temConfete) {
		this.temConfete = temConfete;
	}
	
	public void visualizar() {
		String temConfete = "";
		if(temConfete == "s") {
			temConfete = "s";
		}else {
			temConfete = "n";
		}
		super.visualizar();
		System.out.println("Digite o sabor da cobertura: " + this.cobertura);
		System.out.println("Na sua bebida tem confete? " + this.temConfete);
		
	}


}

