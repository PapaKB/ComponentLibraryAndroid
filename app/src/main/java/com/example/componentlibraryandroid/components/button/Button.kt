package com.example.componentlibraryandroid.components.button

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.componentlibraryandroid.utils.conditional

@Composable
fun Button(
    isFullWidth: Boolean,
    label: String,
    onClick: () -> Unit,
    isEnabled: Boolean,
    modifier: Modifier = Modifier
) {
    Button(onClick = { onClick() }, enabled = isEnabled, modifier = modifier) {
        Text(text = label)
        modifier
            .conditional(condition = isFullWidth, ifTrue = { fillMaxWidth() })
    }
}