package br.dev.celso.rickandmorty.model

data class CharacterResult(
    var info: CharacterInfo,
    var results: List<Character>
)
