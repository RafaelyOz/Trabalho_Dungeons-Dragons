package org.example.Personagem

enum class Classe(
    val nome: String,
    val dadoVida: Int,
    val proficiencias: List<String>
) {
    GUERREIRO("Guerreiro", 10, listOf("Armas Marciais", "Armaduras Pesadas")),
    MAGO("Mago", 6, listOf("Armas Simples", "Magias Arcanas")),
    LADINO("Ladino", 8, listOf("Furtividade", "Ferramentas de Ladrão")),
    BARBARO("Barbaro",12, listOf("Machado", "Armaduras leves")),
    BARDO("Bardo",8, listOf("Instrumentos Musicais", "Adagas")),
    BRUXO("Bruxo",8, listOf("Bastões", "Adagas")),
    CLERIGO("Clerigo",8, listOf("Martelo", "Armaduras médias")),
    DRUIDA( "Druida",8, listOf("Clavas", "Armaduras leves")),
    FEITICEIRO("Feiticeiro",6, listOf("Varinhas", "Armaduras leves"));

}
