import java.io.FileNotFoundException
import java.util.Scanner

fun main() {
  /*
  // OPERADOR ELVIS
  val responseAPI: String? = "nome"
  println(nameResponseAPI ?: "Falha ao obter valor")
  */


  /*
  // FUNÇÃO LET
  
  val responseAPI: String? = "sobrenome"
  responseAPI?.let {
    println(it)
  } ?: println("Falha ao obter valor")
  */


  /*
  // LENDO DADOS NO TERMINAL COM KOTLIN
  
  print("Digite sua idade atual: ")
  val age: Int? = readlnOrNull()?.toInt() ?: 0
  println("Sua idade é ${age}")
  */


  /*
  // LENDO DADOS NO TERMINAL COM JAVA
  
  val scanner = Scanner(System.`in`)
  print("Digite o dia do seu nascimento: ")
  val day: Int? = scanner.nextInt()
  println("Você nasceu no dia ${day}")
  */
  

  /*
  // LENDO ARQUIVOS COM JAVA
  
  val filePath: String = "texto.txt"

  try {
    Scanner(filePath).use { l ->
      while (l.hasNext()) {
        println(l.next())
      }

      l.close()
    }
  } catch (e: FileNotFoundException) {
    println("Arquivo não encontrado")
  }
  */


  /*
  // Any: Qualquer valor como parâmetro
  // Unit: Qualquer valor para retorno
  // Nothing: Sinaliza uma função a ser implementada

  fun mostraQualquerValor(valor: Any): Unit {
    println("Valor passado: ${valor}, ${valor.javaClass.name} ")
  }

  fun funcaoParaSerImplementada(): Nothing {
    TODO("Função a ser implementada")
  }
  */
}
