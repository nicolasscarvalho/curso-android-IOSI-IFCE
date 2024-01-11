public class VetoresTextuais {
  public static void main(String[] args) {
    char letras[] = new char[26];
    char letra = 'a';

    for (int i = 0; i < letras.length; i++) {
      letras[i] = letra;
      letra++;
    }

    for (char L : letras) {
      System.out.print(L + " ");
    }
  }
}