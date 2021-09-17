package com.example.dinnerlist.Data

import com.example.dinnerlist.Model.MyDinner
import com.example.dinnerlist.R

class Datasource {

    fun loadDinner(): List<MyDinner>{
        return listOf<MyDinner>(
            MyDinner(R.string.dinner_1),
            MyDinner(R.string.dinner_2),
            MyDinner(R.string.dinner_3),
            MyDinner(R.string.dinner_4),
            MyDinner(R.string.dinner_5),
            MyDinner(R.string.dinner_6),
            MyDinner(R.string.dinner_7),
            MyDinner(R.string.dinner_8),
            MyDinner(R.string.dinner_9),
            MyDinner(R.string.dinner_10),
            MyDinner(R.string.dinner_11),
            MyDinner(R.string.dinner_12),
            MyDinner(R.string.dinner_13),
            MyDinner(R.string.dinner_14),
            MyDinner(R.string.dinner_15)
        )

    }
}