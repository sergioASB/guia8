package edu.bo.ucb.guia8

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val mySnackbar = Snackbar.make(findViewById(R.id.layout_principal), R.string.app_name, Snackbar.LENGTH_LONG)
        mySnackbar.setAction(R.string.undo_string, MyUndoListener())
        mySnackbar.show()
    }
}
