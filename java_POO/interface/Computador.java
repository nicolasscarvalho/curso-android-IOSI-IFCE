public class Computador implements Maquina, Testes {
  @Override
  public void ligar(){
    System.out.println("Computador ligando");
  }

  @Override
  public void desligar() {
    System.out.println("Computador desligando");
  }

  @Override
  public void testar() {
    System.out.println("Computador realizando testes");
  }
}