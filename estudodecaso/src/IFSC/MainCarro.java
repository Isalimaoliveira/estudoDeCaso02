package IFSC;

import java.util.ArrayList;
import java.util.Scanner;

public class MainCarro {

	public static void main(String[] args) {

		ArrayList<Carro> gerenciamento = new ArrayList<>();
		Scanner leitura = new Scanner(System.in);
		
		int op = 0;
		while (op != 5) {

			switch (op) {
			case 1:

				System.out.println("Digite o numero da vaga:");
				String numerodavaga = leitura.nextLine();

				Integer numVagaInt = Integer.parseInt(numerodavaga);

				Carro car = new Carro();

				car.setNumerodavaga(numVagaInt);

				/////////////////////

				System.out.println("Digite a marca:");
				String marca = leitura.nextLine();

				car.setMarca(marca);

				///////////////////////

				System.out.println("Digite o modelo:");
				String modelo = leitura.nextLine();

				car.setModelo(modelo);

				/////////////////////

				System.out.println("Digite o ano de fabricação:");
				String anodefabricação = leitura.nextLine();

				Integer anoFabricação = Integer.parseInt(anodefabricação);

				car.setAnodefabricação(anoFabricação);

				/////////////////////

				System.out.println("Digite o preço:");
				String preçodocarro = leitura.nextLine();

				Integer preço = Integer.parseInt(preçodocarro);

				car.setPreçodocarro(preço);

				/////////////////////

				System.out.println("Digite o numero de portas:");
				String numerodeportas = leitura.nextLine();

				Integer numPortas = Integer.parseInt(numerodeportas);

				car.setNumerodeportas(numPortas);

				/////////////////////

				System.out.println("Digite a cor do carro:");
				String cor = leitura.nextLine();

				car.setCor(cor);

				/////////////////////

				// adicionar
				gerenciamento.add(car);
				break;

			case 2:
				for (Carro carro : gerenciamento) {
					System.out.println(carro.getCor());
				}
				break;
			case 3:
				break;
			case 4:
				break;
				

			}
		}

	}
}