package com.dmytrod.cinemalist.domain.entity

import com.dmytrod.cinemalist.data.db.model.FavorableMovieModel

data class MovieEntity(
    val apiId: Int,
    val title: String?,
    val overview: String?,
    val isFavorite: Boolean,
    val posterPath: String?
) {
    companion object Mapper {

        val fromDB = fun(it: FavorableMovieModel): MovieEntity =
            MovieEntity(
                it.movieDBModel.apiId,
                it.movieDBModel.title,
                it.movieDBModel.overview,
                it.favoriteDBModel.isFavorite,
                it.movieDBModel.posterPath
            )
    }
}