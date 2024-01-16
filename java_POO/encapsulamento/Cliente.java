public class Cliente {
  public String nome;
  protected String cpf;
  private int ano_nascimento;

  public int getAno_nascimento() {
    return ano_nascimento;
  }

  public void setAno_nascimento(int ano_nascimento, int ano_atual) {
    if (ano_atual - ano_nascimento >= 18) {this.ano_nascimento = ano_nascimento;}
    else {throw new IllegalArgumentException("Idade inválida");}
  }

}