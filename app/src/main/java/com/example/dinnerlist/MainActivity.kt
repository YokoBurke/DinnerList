package com.example.dinnerlist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import androidx.recyclerview.widget.RecyclerView
import com.example.dinnerlist.Adapter.ItemAdapter
import com.example.dinnerlist.Data.Datasource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myDataset = Datasource().loadDinner()
        val recyclerView = findViewById<RecyclerView>(R.id.my_recycler)
        recyclerView.adapter = ItemAdapter(this, myDataset)
        recyclerView.setHasFixedSize(true)
    }
}