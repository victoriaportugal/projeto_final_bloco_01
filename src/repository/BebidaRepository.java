package repository;

import projeto_final_bloco_01.model.Bebida;

public interface BebidaRepository {

	public void cadastrar(Bebida bebida2);
	
	public void lista();
	
	public void atualizar(Bebida bebida2);
	
	public void apagar(int id);
	
	}


