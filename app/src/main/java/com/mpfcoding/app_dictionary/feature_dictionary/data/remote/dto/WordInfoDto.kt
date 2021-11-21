package com.mpfcoding.app_dictionary.feature_dictionary.data.remote.dto

import com.mpfcoding.app_dictionary.feature_dictionary.data.local.entity.WordInfoEntity


data class WordInfoDto(
    val meanings: List<MeaningDto>,
    val origin: String,
    val phonetic: String,
    val phonetics: List<PhoneticDto>,
    val word: String
){
    fun toWordInfoEntity(): WordInfoEntity {
        return WordInfoEntity(
            meaning = meanings.map { it.toMeaning() },
            origin = origin,
            phonetic = phonetic,
            word = word
        )
    }
}