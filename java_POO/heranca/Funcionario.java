public class Funcionario {
  public String nome;
  protected int idade;
  protected float salario;
  protected float bonus;
  
  protected float horaExtra(int horasSemanais, int horasFeriados) {
    return (horasSemanais * 1.5f) * (horasFeriados * 2f);
  }
}