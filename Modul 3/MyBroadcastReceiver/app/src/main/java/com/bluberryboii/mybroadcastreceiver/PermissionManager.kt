package com.bluberryboii.mybroadcastreceiver

import android.app.Activity
import android.content.pm.PackageManager
import androidx.core.app.ActivityCompat
import java.security.Permission

object PermissionManager {
    fun check(activity: Activity, permission: String, requestCode: Int) {
        if (ActivityCompat.checkSelfPermission(activity, permission) != PackageManager.PERMISSION_GRANTED){
            ActivityCompat.requestPermissions(activity, arrayOf(permission), requestCode)
        }
    }
}