public class Pessoa extends FxTreinos {
  public void treinar(FxTreinos academia, int dia) {
    if (dia == 1) {System.out.println("Dia 1 - " + academia.TreinoA());}
    else if (dia == 2) {System.out.println("Dia 2 - " + academia.TreinoB());}
    else {System.out.println("Dia 3 - " + academia.TreinoC());}
  }
}