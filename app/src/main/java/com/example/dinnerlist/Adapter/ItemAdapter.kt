package com.example.dinnerlist.Adapter

import android.content.Context
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.dinnerlist.Model.MyDinner
import com.example.dinnerlist.R
import kotlin.random.Random

class ItemAdapter (private val context: Context,
                   private val dataset: List<MyDinner>)
    :RecyclerView.Adapter<ItemAdapter.ItemViewHolder>(){

    //nexted class
    class ItemViewHolder(private val view: View): RecyclerView.ViewHolder(view){
    val textView: TextView = view.findViewById(R.id.item_title)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        // create a new view
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item, parent, false)

        return ItemViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]
        holder.textView.text = context.resources.getString(item.stringResrouceId)

        val thisColor = selectColor()
        holder.textView.setTextColor(Color.parseColor(thisColor))
    }

    override fun getItemCount(): Int {
        return dataset.size
    }

    fun selectColor(): String {
        val colorList = listOf(
            "#66bb6a",
            "#98ee99",
            "#338a3e",
            "#43a047",
            "#76d275",
            "#00701a"
        )

        val randomIndex = Random.nextInt(colorList.size);
        return colorList[randomIndex]
    }
}