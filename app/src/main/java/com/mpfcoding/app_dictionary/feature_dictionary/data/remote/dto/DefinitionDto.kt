package com.mpfcoding.app_dictionary.feature_dictionary.data.remote.dto

data class DefinitionDto(
    val antonyms: List<String>,
    val definition: String,
    val example: String,
    val synonyms: List<String>
)