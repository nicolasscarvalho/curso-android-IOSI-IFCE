public class Cachorro extends Animal {
  @Override
  public void emitirSom() {
    System.out.println("Au au au");
  }

  public void dormindo() {
    System.out.println(this.nome + " está dormindo");
  }

  public void dormindo(boolean dia) {
    System.out.println(
      this.nome +
      ((dia == true) ? 
       " está dormindo de dia" : 
       " está dormindo de noite"
    ));
  }
}