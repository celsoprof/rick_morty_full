package br.dev.celso.rickandmorty.model

data class EpisodeResult(
    var info: EpisodeInfo,
    var results: List<Episode>
)