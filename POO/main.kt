class Pessoa(val nome: String, var idade: Int) {}



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
  




  // INIT
  val gato: Animal = Animal("gato")
  gato.fala()
  
}