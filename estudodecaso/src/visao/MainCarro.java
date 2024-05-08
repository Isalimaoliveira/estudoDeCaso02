package visao;

import java.util.ArrayList;
import java.util.Scanner;

import modelo.Carro;

public class MainCarro {
	private static boolean CarroRemovido = false;

	public static void exibirMenu() {

		System.out.println("===== MENU =====");
		System.out.println("1. Cadastrar um veículo");
		System.out.println("2. Excluir um veículo");
		System.out.println("3. Listar veículos");
		System.out.println("4. Buscar veículo");
		System.out.println("5. Atualizar dados de um veículo");
		System.out.println("6. Encerrar programa");
		System.out.println("Escolha uma opção:");

	}

	public static void main(String[] args) {

		ArrayList<Carro> gerenciamento = new ArrayList<>();
		Scanner leitura = new Scanner(System.in);
		int op = 0; //declaração de uma variável op para armazenar a opção esscolhida pelo usuário.

		do {

			exibirMenu();
			op = leitura.nextInt();
			leitura.nextLine();


			switch (op) {

			case 1:

				if (gerenciamento.size() < 20) {
					System.out.println("Digite o numero da vaga:");
					String numerodavaga = leitura.nextLine();
					Integer numVagaInt = Integer.parseInt(numerodavaga);

					Carro car = new Carro();

					car.setNumerodavaga(numVagaInt);

					System.out.println("Digite a marca:");
					String marca = leitura.nextLine();
					car.setMarca(marca);

					System.out.println("Digite o modelo:");
					String modelo = leitura.nextLine();
					car.setModelo(modelo);

					System.out.println("Digite o ano de fabricação:");
					String anodefabricação = leitura.nextLine();
					Integer anoFabricação = Integer.parseInt(anodefabricação);
					car.setAnodefabricação(anoFabricação);

					System.out.println("Digite o preço:");
					String preçodocarro = leitura.nextLine();
					Integer preço = Integer.parseInt(preçodocarro);
					car.setPreçodocarro(preço);

					System.out.println("Digite o numero de portas:");
					String numerodeportas = leitura.nextLine();
					Integer numPortas = Integer.parseInt(numerodeportas);
					car.setNumerodeportas(numPortas);

					System.out.println("Digite a cor do carro:");
					String cor = leitura.nextLine();
					car.setCor(cor);

					System.out.println("Veículo cadastrado com sucesso!");

					gerenciamento.add(car);
				} else {
					System.out.println("Capacidade máxima atingida!");
				}
				break;

			case 2:
				// excluir

				System.out.println("Digite o numero da vaga do carro a ser excluído:");
				int carToDelete = leitura.nextInt();
				leitura.nextLine();

				for (int i = 0; i < gerenciamento.size(); i++) {
					if (gerenciamento.get(i).getNumerodavaga() == carToDelete) {
						gerenciamento.remove(i);
						System.out.println("Carro removido com sucesso.");
						CarroRemovido = true;

						break;

					}
				}
				if (!CarroRemovido) {
					System.out.println("Nenhum veículo encontrado para excluir.");
				}

				break;

			case 3:
//listar

				for (Carro carro : gerenciamento) {
					System.out.println(carro);
				}
				break;

			case 4:

//buscar

				System.out.println("Digite o numero da vaga do carro a ser buscado:");
				int carToSearch = leitura.nextInt();
				leitura.nextLine();

				boolean carroEncontrado = false;

				for (Carro carro : gerenciamento) {
					if (carro.getNumerodavaga() == carToSearch) {
						System.out.println(carro);
						carroEncontrado = true;

						break;

					}
				}
				if (!carroEncontrado) {
					System.out.println("Carro não encontrado.");

				}

				break;

			case 5:
				
//atualizar

				System.out.println("Digite o numero da vaga do carro a ser atualizado:");
				int carToUpdate = leitura.nextInt();
				leitura.nextLine();

				boolean encontrado = false;

				for (Carro carro : gerenciamento) {
					if (carro.getNumerodavaga() == carToUpdate) {

						System.out.println("Digite a nova marca:");
						carro.setMarca(leitura.nextLine());
						System.out.println("Digite o novo modelo:");
						carro.setModelo(leitura.nextLine());

						System.out.println("Digite o novo ano de fabricação:");
						carro.setAnodefabricação(leitura.nextInt());
						leitura.nextLine();

						System.out.println("Digite o novo preço:");
						carro.setPreçodocarro(leitura.nextFloat());
						leitura.nextLine();

						System.out.println("Digite o novo número de portas:");
						carro.setNumerodeportas(leitura.nextInt());
						leitura.nextLine();

						System.out.println("Digite a nova cor do carro:");
						carro.setCor(leitura.nextLine());

						System.out.println("Carro atualizado com sucesso.");
						encontrado = true;

						break;

					}
				}
				if (!encontrado) {
					System.out.println("Carro não encontrado.");

				}
				break;
				
			case 6:
				
//Encerrar programa.

				System.out.println("Encerrando o programa...");

				break;

			default:

				System.out.println("Opção inválida.");

			}

		} while (op != 6);

	}

}