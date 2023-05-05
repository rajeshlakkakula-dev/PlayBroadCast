package com.example.playbroadcast

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class MyReceiver : BroadcastReceiver() {


    // Create BroadCast Receiver
    override fun onReceive(p0: Context?, p1: Intent?) {


        val isAirplaneModeEnable = p1?.getBooleanExtra("state", false) ?: return

        if (isAirplaneModeEnable) {
            Toast.makeText(p0, "Airplane Mode Enabled", Toast.LENGTH_LONG).show()
        } else {

            Toast.makeText(p0, "Airplane Mode Disabled", Toast.LENGTH_LONG).show()

        }

    }

}