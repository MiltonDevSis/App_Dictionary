package com.mpfcoding.app_dictionary.feature_dictionary.data.remote.dto

data class MeaningDto(
    val definitions: List<DefinitionDto>,
    val partOfSpeech: String
)