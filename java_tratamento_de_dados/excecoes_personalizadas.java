public class ExcecoesPersonalizadas {

  float calculaMedia(float[] notas) throws IllegalArgumentException {
    
    if (notas.length == 0) {
      throw new IllegalArgumentException("Não é possível calcular a média de um array vazio.");
    }
    
    float soma = 0;
    
    for (float nota : notas) {
      if (nota < 0 || nota > 10) { throw new IllegalArgumentException("Nota inválida: Fora do intervalo de 0 a 10."); }
      else { soma += nota; }
    }
    
    return soma / notas.length;
    
  }
  
  public static void main(String[] args) {

    float[] notas = {8.5f, -7.0f, 6.5f, 9.0f};
    
    try {
      float media = new ExcecoesPersonalizadas().calculaMedia(notas);
      System.out.println("Média das notas: " + media);
    } catch (IllegalArgumentException e) {
      System.err.println("Erro: " + e.getMessage());
    }
    
  }
}