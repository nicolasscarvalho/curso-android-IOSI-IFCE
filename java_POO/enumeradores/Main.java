public class Main {
  public static void main(String[] args) {
    for (Enumeradores enumerador : Enumeradores.values()) {
      System.out.println(enumerador + "--" + enumerador.id);
    }
  }
}