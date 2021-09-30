package com.example.dinnerlist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.LinearLayout
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.dinnerlist.Adapter.ItemAdapter
import com.example.dinnerlist.Data.Datasource

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private var isLinearLayoutManager = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myDataset = Datasource().loadDinner()
        recyclerView = findViewById<RecyclerView>(R.id.my_recycler)
        recyclerView.adapter = ItemAdapter(this, myDataset)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
    }

    private fun chooseLayout() {
        if (isLinearLayoutManager){
            recyclerView.layoutManager = LinearLayoutManager(this)
        } else {
            recyclerView.layoutManager = GridLayoutManager(this, 3)
        }

    }

    private fun setIcon(menuItem: MenuItem?){
        if (menuItem == null)
            return

        menuItem.icon =
            if (isLinearLayoutManager)
            ContextCompat.getDrawable(this, R.drawable.list_view)
        else ContextCompat.getDrawable(this, R.drawable.grid_view)

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {

        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.action_switch_layout -> {
                isLinearLayoutManager = !isLinearLayoutManager
                chooseLayout()
                setIcon(item)
                return true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}