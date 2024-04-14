package com.example.component_library.button.utils

import androidx.compose.ui.Modifier

fun Modifier.conditional(
    condition: Boolean,
    /**
     * The . after `Modifier` indicates that this function type is an extension function on `Modifier`.
     * It means that when you invoke this function, you can access properties and methods of the `Modifier`
     * class directly within the function body without specifying an instance of `Modifier`.
     *
     * takes no arguments, operates on Modifier objects (or its subclasses), and returns a Modifier object
     */
    ifTrue: Modifier.() -> Modifier,
    ifFalse: Modifier.() -> Modifier = { this }
): Modifier {
    return if (condition) {
        then(ifTrue(Modifier)) // applies ifTrue lambda to the modifier object
    } else {
        then(ifFalse(Modifier))
    }
}