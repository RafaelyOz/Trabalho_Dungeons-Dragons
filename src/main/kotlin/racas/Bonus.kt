package org.example.Racas

import personagem.Personagem

interface BonusRaca {
    fun aplicarBonus(personagem: Personagem)
}

class Elfo : BonusRaca {
    override fun aplicarBonus(personagem: Personagem) {
        personagem.destreza += 2
        personagem.inteligencia += 1
    }
}

class Anao : BonusRaca {
    override fun aplicarBonus(personagem: Personagem) {
        personagem.forca += 2
        personagem.constituicao += 2
    }
}

class Humano : BonusRaca {
    override fun aplicarBonus(personagem: Personagem) {
        personagem.forca += 1
        personagem.destreza += 1
        personagem.constituicao += 1
        personagem.inteligencia += 1
        personagem.sabedoria += 1
        personagem.carisma += 1
    }
}

class MeioElfo : BonusRaca {
    override fun aplicarBonus(personagem: Personagem) {
        personagem.carisma += 2
    }
}

class MeioOrc : BonusRaca {
    override fun aplicarBonus(personagem: Personagem) {
        personagem.forca += 2
        personagem.constituicao += 1
    }
}

class Halfling : BonusRaca {
    override fun aplicarBonus(personagem: Personagem) {
        personagem.destreza += 2
    }
}

class Gnomo : BonusRaca {
    override fun aplicarBonus(personagem: Personagem) {
        personagem.inteligencia += 2
    }
}
