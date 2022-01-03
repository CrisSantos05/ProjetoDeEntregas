package projeto;

import java.util.Scanner;

public class MainProjeto {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double totalPeso, totalKM, totalViagem;

		DadosProjeto dados = new DadosProjeto();
		TabelaValores valor = new TabelaValores();

		System.out.println("Entre com o nome do produto a ser enviado: ");
		dados.setNome(scan.nextLine());
		System.out.println("O produto a ser enviado �: " + dados.getNome().toUpperCase());
		System.out.println("______________________________");
		System.out.println("Qual o peso do produto? : ");
		dados.setPesoProduto(scan.nextFloat());
		System.out.println("O peso do produto �: " + dados.getPesoProduto() + " Kilo(s)");
		System.out.println("______________________________");
		System.out.println("Qual a dist�ncia da entrega?:");
		dados.setKmViagem(scan.nextDouble());
		System.out.println("A distancia da entrega �: " + dados.getKmViagem() + " Kolim�tros");
		System.out.println("______________________________");
		// dados.setValorEntrega(0);
		scan.close();

		totalPeso = dados.getPesoProduto() * valor.getValorPeso();
		totalKM = dados.getKmViagem() * valor.getValorporKm();
		totalViagem = totalPeso + totalKM;

		

		System.out.println("O valor total por Kilo: R$ " + totalPeso);
		System.out.println("O valor total por Kilometragem: R$ " + totalKM);
		System.out.println("O total da entrega �: R$ " + totalViagem);

	}

}
