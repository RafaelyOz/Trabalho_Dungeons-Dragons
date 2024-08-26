import org.example.Personagem.Classe
import org.example.Racas.*
import personagem.Personagem
import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    var continuar = true

    while (continuar) {
        // Introdução
        println("Bem-vindo ao Criador de Personagens!")
        println("Prepare-se para embarcar em uma jornada épica, onde você dará vida ao seu herói.")
        println("Escolha sua classe, defina suas habilidades e descubra o poder do seu personagem no mundo da fantasia.")
        println("Vamos começar a criar sua lenda!")

        println("Escolha uma classe:")
        val classes = listOf(
            Classe.GUERREIRO, Classe.MAGO, Classe.LADINO, Classe.BARBARO, Classe.BARDO,
            Classe.BRUXO, Classe.CLERIGO, Classe.DRUIDA, Classe.FEITICEIRO
        )
        classes.forEachIndexed { index, classe ->
            println("${index + 1}. ${classe.nome}")
        }

        val escolhaClasse = scanner.nextInt()
        val classeEscolhida = classes.getOrNull(escolhaClasse - 1)
            ?: throw IllegalArgumentException("Escolha inválida.")


        scanner.nextLine()
        println("Digite o nome do Personagem:")
        val nome = scanner.nextLine()


        println("Escolha uma raça:")
        val racas = listOf(
            Elfo(), Anao(), Humano(), MeioElfo(), MeioOrc(), Halfling(), Gnomo()
        )
        racas.forEachIndexed { index, raca ->
            val nomeRaca = raca.javaClass.simpleName.replace("Bonus", "")
            println("${index + 1}. $nomeRaca")
        }

        val escolhaRaca = scanner.nextInt()
        val racaEscolhida = racas.getOrNull(escolhaRaca - 1)
            ?: throw IllegalArgumentException("Escolha inválida.")

        val personagem = Personagem(classeEscolhida, bonusRaca = racaEscolhida)

        // Função auxiliar para garantir que o valor esteja entre 8 e 15
        fun obterValorAtributo(nomeAtributo: String): Int {
            var valor: Int
            do {
                print("Digite o valor para $nomeAtributo (entre 8 e 15): ")
                valor = scanner.nextInt()
                if (valor !in 8..15) {
                    println("Valor inválido. Insira um valor entre 8 e 15.")
                }
            } while (valor !in 8..15)
            return valor
        }


        fun calcularCusto(valor: Int): Int {
            return when (valor) {
                8 -> 0
                9 -> 1
                10 -> 2
                11 -> 3
                12 -> 4
                13 -> 5
                14 -> 7
                15 -> 9
                else -> throw IllegalArgumentException("Valor de atributo inválido.")
            }
        }


        fun atualizarAtributos(): Boolean {
            val forca = obterValorAtributo("Força")
            val destreza = obterValorAtributo("Destreza")
            val constituicao = obterValorAtributo("Constituição")
            val inteligencia = obterValorAtributo("Inteligência")
            val sabedoria = obterValorAtributo("Sabedoria")
            val carisma = obterValorAtributo("Carisma")


            val custoTotal = calcularCusto(forca) + calcularCusto(destreza) + calcularCusto(constituicao) +
                    calcularCusto(inteligencia) + calcularCusto(sabedoria) + calcularCusto(carisma)

            if (custoTotal > 27) {
                println("O custo total dos atributos excede 27 pontos. Por favor, ajuste os valores.")
                return false
            }


            personagem.forca = forca
            personagem.destreza = destreza
            personagem.constituicao = constituicao
            personagem.inteligencia = inteligencia
            personagem.sabedoria = sabedoria
            personagem.carisma = carisma

            return true
        }


        while (!atualizarAtributos()) {

        }


        personagem.aplicarBonusRaca()


        println("\nInformações do Personagem:")
        println("Nome: $nome")
        personagem.mostrarInformacoes()


        println("\nDeseja criar outro personagem? (S/N)")
        val resposta = scanner.next().trim().uppercase()
        continuar = resposta == "S"
    }

    println("Criação de personagens finalizada.")
}
