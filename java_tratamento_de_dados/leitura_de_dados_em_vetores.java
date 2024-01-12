import java.util.Scanner;

public class LeituraDeDadosEmVetores {
  public static void main(String[] args) {

    int[] vetor = new int[5];
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite os 5 números inteiros separados por espaço: ");
    for (int i =0; i < vetor.length; i++) {
      vetor[i] = scanner.nextInt();
    }

    for (int i = 0; i < vetor.length; i++) {
      System.out.print(vetor[i] + " ");
    }
    
  }
}