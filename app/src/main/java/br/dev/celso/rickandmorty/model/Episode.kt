package br.dev.celso.rickandmorty.model

data class Episode(
    var id: Int = 0,
    var name: String = "",
    var airDate: String = "",
    var episode: String = "",
    var characters: List<Character>,
    var url: String = ""
)
