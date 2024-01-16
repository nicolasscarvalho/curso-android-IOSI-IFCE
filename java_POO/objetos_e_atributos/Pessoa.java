public class Pessoa {
  public String nome = "Carlos";
  public int ano_nasc = 1997;

  int idade(int ano_atual) {
    return (ano_atual - ano_nasc);
  }
}