public class ContinueEBreak {
  public static void main(String[] args) {

    for (int i = 0; i < 10; i++) {
      if (i%2 == 0) {
        continue; // Pulando números pares
      }
      System.out.println(i);
    }


    for (int i = 0; i < 10; i++) {
      if (i == 5) {
        break; // Concluíndo o loop ao chegar em 5
      }
      
      System.out.println("i = " + i);
    }
    
  }
}