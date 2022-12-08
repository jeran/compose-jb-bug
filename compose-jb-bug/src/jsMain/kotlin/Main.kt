import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.text.BasicText
import androidx.compose.ui.window.Window
import org.jetbrains.skiko.wasm.onWasmReady

private val items = listOf(1, 2, 3)

fun main() {
    onWasmReady {
        Window("") {
            LazyColumn {
                items(items) { item ->
                    BasicText(text = item.toString())
                }
            }
        }
    }
}
