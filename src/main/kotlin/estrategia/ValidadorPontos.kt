package org.example.estrategia

interface ValidadorPontos {
    fun validar(forca: Int, destreza: Int, constituicao: Int, inteligencia: Int, sabedoria: Int, carisma: Int): Boolean
}
