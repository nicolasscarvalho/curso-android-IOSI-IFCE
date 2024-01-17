public class Main {
  public static void main(String[] args) {
    Cachorro cachorro = new Cachorro();

    cachorro.nome = "Rex";
    cachorro.raca = "Vira-lata";

    cachorro.emitirSom();
    cachorro.dormindo();
    cachorro.dormindo(true);
  }
}