package aula0108;
import java.util.Random;

public class desafio01 {
	private int[][] matriz = new int[5][5];
	private Random gerador = new Random();
	
	public void setMatriz() {
		int x;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				x = gerador.nextInt((int) 1 + 26);
				while (existeNum(x)) {
					x = gerador.nextInt((int) 1 + 26);
				}
				matriz[i][j] = x;
			}
		}
	}

	public void getMatriz() {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
	}

	public boolean existeNum(int randomico) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				if (randomico == matriz[i][j]) {
					return true;
				}
			}
		}
		return false;
	}

	public static void main(String[] args) {

		long x = System.currentTimeMillis();

		System.out.println("***Desafio 01***");
		System.out.println(" ");
		desafio01 obj = new desafio01();
		obj.setMatriz();
		obj.getMatriz();
		
		
		long y = System.currentTimeMillis();
		System.out.print("\n");
		System.out.println("Tempo de execução " + (y - x) + "ms");
	}

}
