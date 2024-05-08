package controle;

import java.util.ArrayList;
import modelo.Carro;

public class CarroDAO {

	private ArrayList<Carro> gerenciamento;
	private int geradorNumeroVaga;

	public CarroDAO() {
		this.gerenciamento = new ArrayList<>();
		this.geradorNumeroVaga = 1;
	}

	public int inserir(Carro carro) {

		if (carro != null) {
			carro.setNumerodavaga(geradorNumeroVaga);
			geradorNumeroVaga = geradorNumeroVaga + 1;
			gerenciamento.add(carro);
		}

		return carro.getNumerodavaga();
	}

	public ArrayList<Carro> listar() {
		return this.gerenciamento;
	}

}