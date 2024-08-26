package personagem

import org.example.Personagem.Classe
import org.example.Racas.BonusRaca


class Personagem(
    val classe: Classe,
    var forca: Int = 8,
    var destreza: Int = 8,
    var constituicao: Int = 8,
    var inteligencia: Int = 8,
    var sabedoria: Int = 8,
    var carisma: Int = 8,
    var bonusRaca: BonusRaca? = null
) {
    fun aplicarBonusRaca() {
        bonusRaca?.aplicarBonus(this)
    }

    fun calcularPontosVida(): Int {
        return classe.dadoVida + calcularModificador(constituicao)
    }

    fun calcularModificador(atributo: Int): Int {
        return (atributo - 10) / 2
    }

    fun mostrarProficiencias() {
        println("Proficiencias da classe ${classe.nome}: ${classe.proficiencias.joinToString(", ")}")
    }

    fun mostrarInformacoes() {
        println("Classe: ${classe.nome}")
        println("Raça: ${bonusRaca?.javaClass?.simpleName ?: "Desconhecida"}")
        println("Pontos de Vida: ${calcularPontosVida()}")
        println("Força: $forca (Modificador: ${calcularModificador(forca)})")
        println("Destreza: $destreza (Modificador: ${calcularModificador(destreza)})")
        println("Constituição: $constituicao (Modificador: ${calcularModificador(constituicao)})")
        println("Inteligência: $inteligencia (Modificador: ${calcularModificador(inteligencia)})")
        println("Sabedoria: $sabedoria (Modificador: ${calcularModificador(sabedoria)})")
        println("Carisma: $carisma (Modificador: ${calcularModificador(carisma)})")
        mostrarProficiencias()
    }
}
