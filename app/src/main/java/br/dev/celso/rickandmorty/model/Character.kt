package br.dev.celso.rickandmorty.model

data class Character(
    var id: Int = 0,
    var name: String = "",
    var status: String = "",
    var species: String = "",
    var gender: String = "",
    var origin: Origin,
    var location: Location,
    var image: String = "",

)
