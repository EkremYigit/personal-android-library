package com.example.mylibrary

import android.content.Context
import android.view.Gravity
import android.widget.Toast

 object ToastMapper {

    fun showToastWithPosition(context: Context, text: String, position: Position) {
        val toast = Toast.makeText(context, text, Toast.LENGTH_SHORT)
        toast.setGravity(getPosition(position),0,0)
        toast.show()
    }

    private fun getPosition(position: Position): Int {
        return when(position) {
            Position.Bottom-> Gravity.BOTTOM
            Position.Middle-> Gravity.CENTER_HORIZONTAL
            Position.Top-> Gravity.TOP
        }
    }
}
enum class Position {
    Bottom,
    Middle,
    Top
}