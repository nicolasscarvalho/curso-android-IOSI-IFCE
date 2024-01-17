public class Main {
  public static void main(String[] args) {
    Operario operario = new Operario();

    operario.nome = "Sebastião";
    operario.idade = 43;
    operario.salario = 1000f;
    operario.bonus = 300f;
    float hora_extra = operario.horaExtra(10, 8);

    System.out.println("Ganho total do funcionário: " + (operario.salario + operario.bonus + hora_extra));
  }
}