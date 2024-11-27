package primary.internal.presentation.ui.primary

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import primary.internal.domain.repo.PrimaryRepository
import javax.inject.Inject

@HiltViewModel
internal class PrimaryViewModel @Inject constructor(
    private val repository: PrimaryRepository
): ViewModel() {
}