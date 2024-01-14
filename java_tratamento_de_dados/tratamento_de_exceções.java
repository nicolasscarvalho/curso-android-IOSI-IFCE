import java.util.Scanner;
import java.util.InputMismatchException;

public class TratamentoDeExcecoes {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    try {
      System.out.print("Digite um número inteiro: ");
      int idade = scanner.nextInt();
      float calculo = 10/0;
      int tamanho = "Maria".length();
    }
    catch (InputMismatchException e) {
     System.out.println("Erro: Entrada inválida. Digite um número inteiro.");
    }
    catch (ArithmeticException e) {
      System.out.println("Erro: Divisão por zero.");
    }
    catch (NullPointerException e) {
      System.out.println("Erro: Ponteiro nulo.");
    }
    catch (Exception e) {
      System.out.println("Erro: Ocorreu um erro inesperado.");
    }
    finally {
      System.out.println("Tratamento de erros finalizado.");  
    }
      
  }
}