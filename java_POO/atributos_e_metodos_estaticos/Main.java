public class Main {
  public static void main(String[] args) {
    
    Estatico estatico = new Estatico();

    System.out.println("Valor de x antes: " + estatico.x);

    estatico.x += 10;

    System.out.println("Valor de x depois: " + estatico.x);

    estatico.update_x(30);

    System.out.println("Valor de x modificado: " + estatico.x);
    
  }
}