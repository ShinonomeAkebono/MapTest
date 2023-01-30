package com.example.maptest

import android.app.AlertDialog
import android.app.Dialog
import android.content.DialogInterface
import android.os.Bundle
import androidx.fragment.app.DialogFragment
import kotlinx.coroutines.NonCancellable.start

class StartDialogFragment : DialogFragment() {
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        return activity?.let {
            // Use the Builder class for convenient dialog construction
            val builder = AlertDialog.Builder(it)
            builder.setMessage("Do you want to set here as Goal?")
                .setPositiveButton("SET",
                    DialogInterface.OnClickListener { dialog, id ->
                        // START THE GAME!
                        print(dialog)
                    })
                .setNegativeButton("CANCEL",
                    DialogInterface.OnClickListener { dialog, id ->
                        // User cancelled the dialog
                        print(dialog)
                    })
            // Create the AlertDialog object and return it
            builder.create()
        } ?: throw IllegalStateException("Activity cannot be null")
    }
}