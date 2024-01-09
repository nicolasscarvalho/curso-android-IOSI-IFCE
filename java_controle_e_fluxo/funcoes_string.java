public class FuncoesString {
  public static void main(String[] args) {

    String str = "Curso de Android.";

    System.out.println("Tamanho da String: " + str.length());
    System.out.println("O elemento da posição 3 é: " + str.charAt(3));
    System.out.println(str + " é igual a String \"Curso de Android\"? " + str.equals("Curso de Android"));
    System.out.println(str + " inicia com a String \"Curso\"? " + str.startsWith("Curso"));
    System.out.println(str + " termina com a String \"Android\"? " + str.endsWith("Android"));
    System.out.println("String na posição 2 até a posição 7: " + str.substring(2, 7)); // Caso haja apenas um parâmetro, o código assume que o segundo é o final da String.
    System.out.println(str.replace("Curso", "Curso muito massa")); // Substitui a primeira String pela segunda em todos os casos que for encontrada.
    System.out.println("String em letras maiúsculas: " + str.toUpperCase());
    System.out.println("String em letras minúsculas: " + str.toLowerCase());
    
  }
}