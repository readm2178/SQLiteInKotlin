package com.example.sqlitekotlin

import android.provider.BaseColumns

//step2

object DBcontract {

    /* Inner class that defines the table contents */

    class UserEntry : BaseColumns {

        companion object {
            val TABLE_NAME = "users"
            val COLUMN_USER_ID = "userid"
            val COLUMN_NAME = "name"
            val COLUMN_AGE = "age"

        }
    }
}