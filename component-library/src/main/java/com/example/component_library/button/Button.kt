package com.example.component_library.button

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.component_library.button.utils.conditional

@Composable
fun Button(
    modifier: Modifier = Modifier,
    isFullWidth: Boolean = false,
    label: String,
    onClick: () -> Unit,
    isEnabled: Boolean = true,
) {
    val buttonModifier = modifier
        .conditional(condition = isFullWidth, ifTrue = { fillMaxWidth() })

    Button(
        onClick = { onClick() },
        enabled = isEnabled,
        modifier = buttonModifier,
        shape = RoundedCornerShape(5.dp)
    ) {
        Text(text = label)
    }
}

@Composable
@Preview(
    showBackground = true, showSystemUi = true
)
fun ButtonPreview() {
    Column(
        verticalArrangement = Arrangement.spacedBy(10.dp),
        modifier = Modifier.padding(10.dp)
    ) {
        Button(
            label = "Button Name",
            onClick = { },
        )
        Button(
            label = "full width",
            isFullWidth = true,
            onClick = { },
        )
        Button(
            label = "disabled",
            isEnabled = false,
            onClick = { },
        )
    }
}