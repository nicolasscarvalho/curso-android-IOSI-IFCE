import java.util.Scanner;

public class LeituraDeDados {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Digite o ano em que você nasceu: ");
    int ano_nas = sc.nextInt();
    System.out.print("Digite o ano em que você deseja verificar: ");
    int ano = sc.nextInt();

    System.out.println("Em " + ano + " você terá " + (ano - ano_nas) + " anos.");  
  }
}