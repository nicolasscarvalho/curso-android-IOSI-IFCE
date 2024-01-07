public class ConversaoDeTipo {
  public static void main(String[] args) {

    String str = "10";

    System.out.println(Integer.valueOf(str));
    System.out.println(Byte.valueOf(str));
    System.out.println(Short.valueOf(str));
    System.out.println(Float.valueOf(str));
    System.out.println(Double.valueOf(str));

    // -------------------------------------

    // System.out.println(str.intValue());
    // System.out.println(str.byteValue());
    // System.out.println(str.shortValue());
    // System.out.println(str.floatValue());
    // System.out.println(str.doubleValue());
    
  }
}