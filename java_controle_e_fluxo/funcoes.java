public class Funcoes {
  void hello() { // Função sem parâmetros e sem retorno
    System.out.println("Hello, World !!");
  }
  
  void hello(String nome) { // Função com parâmetro, mas sem retorno
    System.out.println("Hello, " + nome);
  }
  
  int soma(int a, int b) { // Função com parâmetros e retorno
    return a + b;
  }
  
  public static void main(String[] args) {
    new Funcoes().hello();
    new Funcoes().hello("João");
    int resultado = new Funcoes().soma(2, 3);
  }
}