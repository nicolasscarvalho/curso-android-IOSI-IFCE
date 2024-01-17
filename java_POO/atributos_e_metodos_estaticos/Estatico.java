public class Estatico {
  public static int x = 10; // Métodos e atributos estáticos não necessitam instanciar um objeto para serem acessados.

  public static void update_x (int new_x) { // Métodos estáticos podem acessar e modificar apenas atributos estáticos 
    x = new_x;
  }
  
}