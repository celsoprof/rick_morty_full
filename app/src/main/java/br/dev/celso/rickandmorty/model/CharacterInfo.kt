package br.dev.celso.rickandmorty.model

data class CharacterInfo(
    var count: Int = 0,
    var pages: Int = 0,
    var next: String = "",
    var prev: String = ""
)
