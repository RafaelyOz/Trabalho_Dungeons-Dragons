package org.example.racas

import org.example.Racas.*

interface Raca {
    val nomeRaca: String
    val forca: Int
    val destreza: Int
    val constituicao: Int
    val inteligencia: Int
    val sabedoria: Int
    val carisma: Int

    fun aplicarBonus(): BonusRaca
}

enum class TipoRaca(
    override val nomeRaca: String,
    override val forca: Int,
    override val destreza: Int,
    override val constituicao: Int,
    override val inteligencia: Int,
    override val sabedoria: Int,
    override val carisma: Int
) : Raca {
    ELFO("Elfo", 0, 2, 0, 1, 0, 0) {
        override fun aplicarBonus() = Elfo()
    },
    ANAO("Anão", 2, 0, 2, 0, 0, 0) {
        override fun aplicarBonus() = Anao()
    },
    HUMANO("Humano", 1, 1, 1, 1, 1, 1) {
        override fun aplicarBonus() = Humano()
    },
    MEIO_ELFO("Meio-Elfo", 0, 0, 0, 0, 0, 2) {
        override fun aplicarBonus() = MeioElfo()
    },
    MEIO_ORC("Meio-Orc", 2, 0, 1, 0, 0, 0) {
        override fun aplicarBonus() = MeioOrc()
    },
    HALFLING("Halfling", 0, 2, 0, 0, 0, 0) {
        override fun aplicarBonus() = Halfling()
    },
    GNOMO("Gnomo", 0, 0, 0, 2, 0, 0) {
        override fun aplicarBonus() = Gnomo()
    }
}
