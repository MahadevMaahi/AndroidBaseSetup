package primary.internal.data.repo

import primary.internal.data.remote.api.PrimaryApi
import primary.internal.data.remote.model.Comment
import primary.internal.domain.repo.PrimaryRepository

internal class PrimaryRepositoryImpl(
    private val primaryApi: PrimaryApi
): PrimaryRepository {
    override suspend fun getPostComments(postId: Int): List<Comment> {
        return primaryApi.getPostComments(postId = postId)
    }
}