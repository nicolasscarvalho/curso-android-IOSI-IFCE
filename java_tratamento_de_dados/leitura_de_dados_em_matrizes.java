import java.util.Scanner;

public class LeituraDeDadosEmMatrizes {
  public static void main(String[] args) {

    int[][] matriz = new int[3][3];
    Scanner scanner = new Scanner(System.in);

    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz[i].length; j++) {
        System.out.print("Digite um valor para a linha " + (i+1) + " e coluna " + (j+1) + ": ");
        matriz[i][j] = scanner.nextInt();
      }
      System.out.println();
    }

    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz[i].length; j++) {
        System.out.print(matriz[i][j] + " ");
      }
      System.out.println();
    }
    
  }
}