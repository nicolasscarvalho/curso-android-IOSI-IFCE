public class Cliente {
  public String nome; // public -> Classe, métodos e atrbitutos acessíveis em qualquer escopo
  protected String cpf; // protected -> Classe, métodos e atrbitutos acessíveis apenas no escopo do projeto
  private int ano_nascimento; // private -> Classe, métodos e atrbitutos acessíveis apenas no escopo da classe

  public int getAno_nascimento() {
    return ano_nascimento;
  }

  public void setAno_nascimento(int ano_nascimento, int ano_atual) {
    if (ano_atual - ano_nascimento >= 18) {this.ano_nascimento = ano_nascimento;}
    else {throw new IllegalArgumentException("Idade inválida");}
  }

}