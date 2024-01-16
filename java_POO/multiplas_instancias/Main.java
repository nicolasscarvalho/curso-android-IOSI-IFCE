public class Main {
  public static void main(String[] args) {
    Pessoa pessoa_um = new Pessoa();
    pessoa_um.nome = "Antônio";
    pessoa_um.sobrenome = "Silva";

    Pessoa pessoa_dois = pessoa_um;
    pessoa_dois.nome = "João";
    pessoa_dois.sobrenome = "Pereira";

    System.out.println(pessoa_um.nome + " " + pessoa_um.sobrenome); // João pereira 
    System.out.println(pessoa_dois.nome + " " + pessoa_dois.sobrenome); // João pereira

    // Apontam para o mesmo objeto
  }
}