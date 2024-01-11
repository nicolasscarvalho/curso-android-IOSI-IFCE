public class VetoresNumericos {
  public static void main(String[] args) {

    int[] vetor = new int[10]; // Criando vetor com 10 posições
    for (int i = 0; i < vetor.length; i++) {
      vetor[i] = i * 2; // Atribuindo valores ao vetor
    }

    int vetor2[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }; // Criando vetor e já atribuindo valores
    int soma = 0;
    for (int valor : vetor2) {
      soma += valor;
    }
    
  }
}