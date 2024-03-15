package projeto_final_bloco_01.Controller;

import java.util.ArrayList;
import projeto_final_bloco_01.model.Bebida;
import projeto_final_bloco_01.repository.BebidaRepository;

public class BebidaController implements BebidaRepository {

	ArrayList<Bebida> listaBebida = new ArrayList<Bebida>();

	int id = 0;

	public int adicionar() {
		return id += 1;
	}

	@Override
	public void cadastrar(Bebida bebida) {
		listaBebida.add(bebida);
		System.out.println("\nA bebida com o código " + bebida.getId() + ", foi cadastrado com sucesso!");
	}

	@Override
	public void lista() {
		for (var bebida : listaBebida) {
			bebida.visualizar();
		}
	}

	@Override
	public void atualizar(Bebida bebida) {
		var buscarBebida = buscarNaCollection(bebida.getId());
		if (buscarBebida != null) {
			listaBebida.set(listaBebida.indexOf(buscarBebida), bebida);
				System.out.println("O id da bebida " + id + " atualizado com sucesso!");
		} else {
			System.out.println("O id da bebida " + id + " não foi encontrado!");
		}
	}

	@Override
	public void apagar(int id) {
		var buscarBebida = buscarNaCollection(id);
		if (buscarBebida != null) {
			if (listaBebida.remove(buscarBebida) == true)
				System.out.println("O id da bebida " + id + " apagado com sucesso!");
		} else {
			System.out.println("O id da bebida " + id + " não foi encontrado!");
		}
	}

	public Bebida buscarNaCollection(int id) {
		for (var buscarId : listaBebida) {
			if (buscarId.getId() == id) {
				return buscarId;
			}
		}
		return null;
	}
}
