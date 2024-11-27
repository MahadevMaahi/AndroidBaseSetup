package primary.internal.domain.repo

import primary.internal.data.remote.model.Comment

internal interface PrimaryRepository {

    suspend fun getPostComments(postId: Int): List<Comment>
}