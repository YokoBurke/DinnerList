package com.example.dinnerlist.Data

import com.example.dinnerlist.Model.MyDinner
import com.example.dinnerlist.R

class Datasource {

    fun loadDinner(): List<MyDinner>{
        return listOf<MyDinner>(
            MyDinner(R.string.dinner_1, R.drawable.image1),
            MyDinner(R.string.dinner_2, R.drawable.image2),
            MyDinner(R.string.dinner_3, R.drawable.image3),
            MyDinner(R.string.dinner_4, R.drawable.image4),
            MyDinner(R.string.dinner_5, R.drawable.image5),
            MyDinner(R.string.dinner_6, R.drawable.image6),
            MyDinner(R.string.dinner_7, R.drawable.image7),
            MyDinner(R.string.dinner_8, R.drawable.image8),
            MyDinner(R.string.dinner_9, R.drawable.image9),
            MyDinner(R.string.dinner_10, R.drawable.image10),
            MyDinner(R.string.dinner_11, R.drawable.image11),
            MyDinner(R.string.dinner_12, R.drawable.image12),
            MyDinner(R.string.dinner_13, R.drawable.image13),
            MyDinner(R.string.dinner_14, R.drawable.image14),
            MyDinner(R.string.dinner_15, R.drawable.image15)
        )

    }
}