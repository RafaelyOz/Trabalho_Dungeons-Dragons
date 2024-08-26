package org.example.estrategia

class DistribuidorPontos : ValidadorPontos {
    override fun validar(forca: Int, destreza: Int, constituicao: Int, inteligencia: Int, sabedoria: Int, carisma: Int): Boolean {

        return isInRange(forca) && isInRange(destreza) && isInRange(constituicao) &&
                isInRange(inteligencia) && isInRange(sabedoria) && isInRange(carisma)
    }

    private fun isInRange(value: Int): Boolean {
        return value in 8..15
    }
}
