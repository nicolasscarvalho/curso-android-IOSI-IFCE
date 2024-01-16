public class Main {
  public static void main(String[] args) {
    Construtor construtor_um = new Construtor();
    Construtor construtor_dois = new Construtor("João", "Silva", 16);

    System.out.println(construtor_um.nome + " " + construtor_um.sobrenome + " " + construtor_um.idade + " " + construtor_um.ano_nasc);
    System.out.println(construtor_dois.nome + " " + construtor_dois.sobrenome + " " + construtor_dois.idade + " " + construtor_dois.ano_nasc);
  }
}