public class Construtor {
  public String nome;
  public String sobrenome;
  public int idade;
  public int ano_nasc;

  public Construtor(String nome, String sobrenome, int idade) { // Mesmo nome da classe principal
    this.nome = nome;
    this.sobrenome = sobrenome;
    this.idade = idade;
    this.ano_nasc = 2024 - idade;
  }

  public Construtor() { // Mesmo nome da classe principal
    this.nome = "Nome não definido";
    this.sobrenome = "Sobrenome não definido";
  }
}