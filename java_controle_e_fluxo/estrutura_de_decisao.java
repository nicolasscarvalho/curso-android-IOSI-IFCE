public class EstruturaDeDecisao {
  public static void main(String[] args) {

    Float nota = 8.0F;

    if ((nota < 0.0F) || (nota > 10.0F)) {
      System.out.println("Nota inválida.");
    }
    else if (nota <= 5.0F) {
      System.out.println("Nota abaixo da média.");
    }
    else if ((nota >= 6.0F) && (nota <= 8.0F)) {
      System.out.println("Nota acima da média.");
    }
    else if (nota == 0.9F) {
      System.out.println("Puxa, quase lá hein... Muito bom !!");
    }
    else {
      System.out.println("Excelente, nota máxima !!");
    }
    
  }
}