package br.com.dio.apprepositories.data.repositories

import br.com.dio.apprepositories.data.model.Repo
import kotlinx.coroutines.flow.Flow

interface RepoRepository {
    suspend fun listRepositories(user: String): Flow<List<Repo>>
}