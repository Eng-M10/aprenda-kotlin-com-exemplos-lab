// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIO, AVANCADO }

data class Usuario (val nome: String, var email: String, var planoDio: String)

data class ConteudoEducacional(var nome: String, val duracao: Int, val nivel:Nivel)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
    
    
    fun matricular(usuario: Usuario) {
        
        	
         inscritos.add(usuario)
        
        
    }
    
}

fun main() {
    // Crie alguns objetos para simular cenários de teste
    val usuario1 = Usuario("Alex Garcia" , "A.garcia@outlook.com", "Dio Global")
    val usuario2 = Usuario("Silvia Andrade", "03garotinha80@gmail.com", "Dio Global")

    val conteudo1 = ConteudoEducacional("Curso de Kotlin", 120, Nivel.INTERMEDIO)
    val conteudo2 = ConteudoEducacional("Curso de Android", 180,Nivel.AVANCADO)
    val conteudo3 = ConteudoEducacional("Curso de Java",100,Nivel.INTERMEDIO)
    val conteudo4 = ConteudoEducacional("Curso de Introducao ao Desenvolvimento Web", 160, Nivel.BASICO)

    val formacao1 = Formacao("Desenvolvimento Android", mutableListOf(conteudo1, conteudo2))
    val formacao2 = Formacao("Desenvolvimento Backend com Kotlin e Java",mutableListOf(conteudo4,conteudo1,conteudo3)) 

    // Matricular usuários na formação
    formacao1.matricular(usuario1)
    formacao2.matricular(usuario2)

    // Verificar a lista de inscritos
    println("Inscritos na formação '${formacao1.nome}':")
    println("Conteudos :")
    for(conteudo in formacao1.conteudos)
    println("${conteudo.nome.toString()}  ${conteudo.duracao.toString()}H  ${conteudo.nivel.toString().lowercase().capitalize()} ")
    for (usuario in formacao1.inscritos) {
        println("Nome --------------Plano")
        println(usuario.nome.toString() +"---"+ usuario.planoDio.toString())
      
     }
            println("\n \n ")
      println("Inscritos na formação '${formacao2.nome}': ")
      for(conteudo in formacao2.conteudos)
    println("${conteudo.nome.toString()}  ${conteudo.duracao.toString()}H  ${conteudo.nivel.toString().lowercase().capitalize()} ")
    for (usuario in formacao2.inscritos) {
        println("Nome --------------Plano")
        println(usuario.nome.toString() +"---"+ usuario.planoDio.toString())
      
     }
}
