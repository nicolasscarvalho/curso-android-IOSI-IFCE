public class Main {
  public static void main(String[] args) {
    
    Cliente claudio = new Cliente();
    claudio.nome = "Claudio";
    claudio.cpf = "123.456.789-00";
    
    try {
      claudio.setAno_nascimento(2009, 2023);
      System.out.println(claudio.getAno_nascimento());
    }
    catch (IllegalArgumentException e) {
      System.out.println(e.getMessage());
    }
    
  }
}