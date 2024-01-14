import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class ExcecoesDeArquivos {
  public static void main(String[] args) {

    String file_path = "arquivo_inexistente.txt";

    try {
      FileReader file_reader = new FileReader(file_path); // Referencia o caminho do arquivo
      BufferedReader buffered_reader = new BufferedReader(file_reader); // Promove a leitura do arquivo

      String linha;

      while ((linha = buffered_reader.readLine()) != null) {
        System.out.println(linha);
      }

      buffered_reader.close();
    }
    catch (IOException e){
      System.err.println("Erro ao ler o arquivo: " + e.getMessage());
    }
    
  }
}