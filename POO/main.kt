

import numAleatorioclass Pessoa(val nome: String, var idade: Int) {}



class Pokemon(val nome: String) {
  var atk: Int? = null

  constructor(nome: String, atk: Int) : this(nome) {
    this.atk = atk
  }

  fun exibir() : Unit {
    println("O nome do pokemon é ${nome} e seu ataque é de ${atk ?: 0} pontos")
  }
}



class Animal(val especie: String) {
  var fala: String? = null

  init {
    fala = if(especie == "cachorro") {"Au, au !!"} else if (especie == "gato") {"Miau, miau !!"} else {"nada :("}
  }

  fun fala() {
    println("seu/sua ${especie} fez ${fala }")
  }
}



class Maquina () {
  var estado: Boolean? = null
    get () {
      println("Obtendo valor do estado da máquina...")
      return field
    }
    set (valor) {
      println("Setando valor do estado da máquina...")
      field = valor
    }
}



enum class notasMedias (val nota: Int) {
  baixa(5) {
    override fun toString(): String {
      return "Prioridade alta por média ${nota}"
    }
  },

  media(7) {
    override fun toString(): String {
      return "Prioridade intermediária por média ${nota}"
    }
  },

  alta(9) {
    override fun toString(): String {
      return "Prioridade alta por média ${nota}"
    }
  }
}



class Robo {
  lateinit var estado: String

  fun ligar() {
    if(this::estado.isInitialized) {estado = "ligado"}
  }
}



class Carro() {
  fun ligar() {println("Ligando o carro...")}
  fun andar() {println("Carro andando...")}
  fun estacionar() {println("Estacioando o carro")}
  fun desligar() {println("Desligando o carro")}
}



data class Endereco(var bairro: String, var rua: String, var num: Int) {}



open class Eletronico(val marca: String) {
  private fun ligarCorrente(): Unit {println("ligando corrente...")}

  public fun ligar():Unit {
    ligarCorrente()
    println("ligado")
  }
  public fun desligar():Unit {println("desligando...")}

  protected fun alarmeEmergencia(): Unit {println("Soando alarme de emergência")}
}

class Computador(val marcaPC: String):Eletronico(marcaPC) {
  fun instalarSoftware():Unit {println("Instalando software...")}
  fun soarErro(): Unit {alarmeEmergencia()}
}



open class Veiculo() {
  open fun desligar(): Unit {println("desligado")}
}

class Aviao():Veiculo() {
  override fun desligar(): Unit {
    println("Aterrizando...")
    println("Freando...")
    super.desligar()
  }

  fun sobrecargaUm(a: Int): Unit {}
  fun sobrecargaDois(a: Int, b: Int): Unit {}
  fun sobrecargaTrês(a: Int, b: Int, c: Int): Unit {}
}



class numAleatorio() {
  companion object {
    var x: Int = 23
    var y: Int = 89

    fun gerarNumero() {
      val num: Int = (x..y).random()
      println("O número gerado foi ${num}")
    }
  }

  fun outroGerador() {
    x = 100
    y = 200
    gerarNumero()
  }
}


fun main() {
  /*
  // CRIANDO PRIMEIRA CLASSE

  val pessoa: Pessoa = Pessoa("Nícolas", 18)
  println("nome: ${pessoa.nome}, idade: ${pessoa.idade}")
  */





  /*
  // CONSTRUTORES: PRIMÁRIOS E SECUNDÁRIOS

  val pokemonPrimario: Pokemon = Pokemon("Pikachu") // Utilizando construtor primário
  val pokemonSecundario: Pokemon = Pokemon("Charmander", 5000) // Utilizando construtor secundário

  pokemonPrimario.exibir()
  pokemonSecundario.exibir()
  */





  /*
  // INIT
  val gato: Animal = Animal("gato")
  gato.fala()
  */





  /*
  val cortadorDeGrama: Maquina = Maquina()
  cortadorDeGrama.estado
  cortadorDeGrama.estado = true
  */





  /*
  for(indice in notasMedias.values()) {
    println("Índice do Enum: ${indice}; Valor do Enum: ${indice.nota}")
  }
  */





  /*
  val meuRobo:Robo = Robo()
  meuRobo.ligar()
  println(meuRobo.estado)
  */





  /*
  val meuCarro: Carro = Carro()
  with(meuCarro) {
    ligar()
    andar()
    estacionar()
    desligar()
  }
  */





  /*
  val enderecoUm:Endereco = Endereco("abcd", "3", 18)
  val enderecoDois:Endereco = Endereco("abcd", "3", 18)

  println(enderecoUm == enderecoDois)
  */





  /*
  // Private: Pode ser utilizada apenas dentro do escopo
  // Public: Pode ser utilizada em qualquer escopo
  // Protected: Pode ser utilizada apenas dentro da classe filha
  val meuPC:Computador = Computador("Lenovo")
  meuPC.ligar()
  meuPC.instalarSoftware()
  meuPC.desligar()
  meuPC.soarErro()
  */





  /*
  val meuAviao: Aviao = Aviao()
  meuAviao.desligar()
  */





  numAleatorio.gerarNumero() // A partir do companion object
  val gerador: numAleatorio = numAleatorio() // A partir do objeto
  gerador.gerarOutro()
}