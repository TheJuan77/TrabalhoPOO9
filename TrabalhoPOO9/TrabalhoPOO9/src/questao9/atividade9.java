package questao9;
import java.util.Random;


public class atividade9 {
	public static void main(String[] args) {
		Random aleatorio = new Random();
		int maximo = 0;
		int minimo = 10;
		String posicao="";

		final int quantidadeLinha = 4;
		final int quantidadeColuna = 4;		

		int M[][] = new int[quantidadeLinha][quantidadeColuna];

		for (int linha = 0; linha < quantidadeLinha; linha++) {
			for (int coluna = 0; coluna < quantidadeColuna; coluna++) {
				M[linha][coluna] = aleatorio.nextInt(9);
			}
		}

		for (int linha = 0; linha < quantidadeLinha; linha++) {
			for (int coluna = 0; coluna < quantidadeColuna; coluna++) {
				if (M[linha][coluna] > maximo) {
					maximo = M[linha][coluna];
					posicao = " Linha:"+(linha+1)+" - Coluna:"+(coluna+1);
				} else if (M[linha][coluna] < minimo) {
					minimo = M[linha][coluna];
				}

			}
		}
		
		for (int linha = 0; linha < quantidadeLinha; linha++) {
			System.out.print(" | ");
			for (int coluna = 0; coluna < quantidadeColuna; coluna++) {
				System.out.print(M[linha][coluna] +" | ");
			}
			System.out.println(" ");
		}
		
		
		System.out.println("Maior Numero: "+maximo);
		System.out.println("Posicao: "+posicao);
	}

	

}
