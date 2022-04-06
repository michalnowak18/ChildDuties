package com.kidsgamesprojects.childduties.utils

import android.content.Context

object ResourceUtils {

     fun getResourceDrawableId(pDrawableName: String?, context: Context): Int {
         val id = context.resources.getIdentifier(pDrawableName, "drawable", context.packageName)
         return id
     }
}