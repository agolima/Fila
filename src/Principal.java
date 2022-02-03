import java.util.Scanner;

public class Principal {
	public static void main(String[] args){

		Fila f = new Fila();
		Elemento e;



		Scanner scanner = new Scanner(System.in);

		do {


			System.out.println("Digite [1] para listar o número de aviões esperando para decolar.");
			System.out.println("Digite [2] para autorizar a decolagem do primeiro avião da fila.");
			System.out.println("Digite [3] para adicionar um avião a lista de espera:");
			System.out.println("Digite [4] para listar todos os aviões que estão na lista de espera.");
			System.out.println("Digite [5] para listar as características do primeiro avião da fila.");
			int opcao = scanner.nextInt();

			switch(opcao){

			case 1:
				
				f.numeroEsperando();
				
				break;

			case 2:
				
				f.autorizarDecolagem();
			

				break;

			case 3:
				scanner = new Scanner(System.in);

				System.out.println("Digite o nome da aeronave: ");
				String nome = scanner.nextLine();
				scanner = new Scanner(System.in);


				System.out.println("Digite o identificador da aeronave: ");
				String identificador = scanner.nextLine();
				scanner = new Scanner(System.in);

				System.out.println("Digite a origem do vôo: ");
				String origem = scanner.nextLine();
				scanner = new Scanner(System.in);

				System.out.println("Digite o destino do vôo: ");
				String destino = scanner.nextLine();
				scanner = new Scanner(System.in);

				Elemento e1 = new Elemento(nome, identificador, origem, destino);
				
				f.addFilaEspera(e1);

				break;

			case 4:
				
				
				f.listar();
				
				break;

			case 5:
			
				f.listarCaracteristicas();
				
				
				break;

			default:
				System.out.println("Opção inválida.");
				break;
			}
		}while (true);
	}
}