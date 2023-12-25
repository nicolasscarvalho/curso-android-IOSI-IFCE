// Observação: qualquer função pode chamar outra dentro do seu corpo
fun soma (a: Int, b: Int) : Int {
  return a + b
}


fun main() {
  /*
  // TIPOS, VARIÁVEIS E COMENTÁRIOS
  
  // Declarando e adotando valores ao mesmo tempo para variáveis
  var a: Int = 25
  var b: Float = 20.23f
  var c: Double = 3.1415926535
  var d: Long = 901928379849283
  var e: Char = 'a'
  var f: String = "abacaxi"
  var g: Short = 901
  var h: Byte = 0b1010
  var i: UInt = 12u

  // Exibindo os valores
  println(a)
  println(b)
  println(c)
  println(d)
  println(e)
  println(f)
  println(g)
  println(h)
  println(i)
  */


  

  
  /*
  // CAPACIDADE DAS VARIÁVEIS

  println("Short mínimo: ${UInt.MIN_VALUE} Short máximo: ${Short.MAX_VALUE}")
  println("UInt mínimo: ${UInt.MIN_VALUE} UInt máximo: ${UInt.MAX_VALUE}")
  */



  
  
  /*
  // VARIÁVEIS MUTÁVEIS E IMUTÁVEIS

  val var_constante = 10 // atribuir ou incrementar outro valor RESULTARÁ em erro
  var var_mutavel = 20 // atribuir ou incrementar outro valor NÃO IMPLICARÁ em erro
  */




  
  /*
  // OPERADORES
  
  LÓGICOS
     && ~~ And
     || ~~ Ou
     !  ~~ Not

  MATEMÁTICOS
    + ~~ Adição
    - ~~ Subtração
    * ~~ Multiplicação
    / ~~ Divisão
    % ~~ Resto da divisão
    
  COMPARATIVOS
    >  ~~ Maior
    >= ~~ Maior ou igual
    <  ~~ Menor
    <= ~~ Menor ou igual
    == ~~ Igual no sentido de comparação
    != ~~ Diferente no sentido de comparação
  */




  
  /*
  // ESTRUTURA DE DECISÃO IF
  
  val idade: Int = 45

  if (idade <= 17) {
    println("Indivíduo adolescente")
  }
  else if (idade >= 18 && idade <= 59){
    println("Indivíduo adulto")
  }
  else {
    println("Indivíduo idoso")
  }
  */


  

  /*
  // ESTRUTURA DE DECISÃO WHEN (SEMELHANTE AO SWITCH CASE)

  val cargo: String = "professor"
  when(cargo) {
    "professor" -> println("Salário de R$ 3000.00")
    "coordenador" -> println("Salário de R$ 4000.00")
    "diretor" -> println("Salário de R$ 6000.00")
  }
  */


  

  
  /*
  // ESTRUTURA DE DECISÃO FOR

  println("Crescente")
  for (i in 0 .. 10) {
    print("${i} ")
  }

  print("\nDecrescente")
  for (j in 10 downTo 0) {
    print("${j} ")
  }

  println("\nAtravés de saltos\n")
  for (k in 1 .. 10 step 2) {
    print("${k} ")
  }

  println("\nPercorrendo uma frase\n")
  val frase: String = "Uma frase qualquer"
  for (l in frase) {
    print("${l} ")
  }
  */

  


  
  /*
  // ESTRUTURA DE REPETIÇÃO WHILE

  val frase: String = "Uma frase qualquer"
  var index: Int = 0

  while (index < frase.length) {
    print("${frase[index]} ")
    index ++
  }
  */



  
  

  /*
  // ESTRUTURA DE REPETIÇÃO DO/WHILE

  do {
    println("${idade} ")
    var idade = 18
  }
  while (idade != 18)
  */


  

  
  /*
  // CONTINUE E BREAK

  println("Apenas números pares com o CONTINUE")
  
  for (i in 1 .. 20) {
    
    if (i%2 != 0) {
      continue
    }
    print("${i} ")
    
  }

  
  println("\nProcurando um CHAR em uma STRING com o BREAK")
  
  val frase: String = "uma frase qualquer"
  var index: Int = 0
  val caractere = 'f'

  while (index <= frase.length - 1) {
    
    if (frase[index] == caractere) {
      print("Posição encontrada: ${index}")
      break
    }
    index ++
    
  }
  */


  

  
  /*
  // FUNÇÕES E SEUS TIPOS
  
  // Observação: qualquer função pode chamar outra dentro do seu corpo
  println("Resultado da soma entre 10 e 23: ")
  print( soma(10, 23) )
  */




  
  /*
  // VETORES

  val estado_maquinas: BooleanArray = booleanArrayOf(true, false, true)
  val alunos = arrayOf("André", "Bianca", "Carla")
  println(alunos)
  */
}