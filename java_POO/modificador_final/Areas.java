public class Areas { // modificador final em classes restringe que outras a herdem
  public final static float pi = 3.14f; // modificador final em atributos restringe que sejam alterados (uma constante)
  public final static double circulo(float raio) { // modificador final em métodos restringe que sejam sobrescritos
    return pi * Math.pow(raio, 2);
  }
}