public class Matrizes {
  public static void main(String[] args) {

    int[][] matriz = new int[4][];

    for (int k = 0; k < matriz.length; k++) {
      matriz[k] = new int[k+1];
    }

    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz[i].length; j++) {
        matriz[i][j] = i + j;      
      }
    }


    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz[i].length; j++) {
        System.out.print(matriz[i][j] + " ");      
      }
      System.out.println();
    }
    
  }
}