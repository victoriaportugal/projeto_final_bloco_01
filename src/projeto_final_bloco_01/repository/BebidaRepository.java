package projeto_final_bloco_01.repository;

import projeto_final_bloco_01.model.Bebida;
import projeto_final_bloco_01.model.MilkShake;

public interface BebidaRepository {

	public void cadastrar(Bebida bebida);
	
	public void lista();
	
	public void atualizar(Bebida bebida);
	
	public void apagar(int id);


	

	
	}


