package edu.aceplora.contact.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import edu.aceplora.contact.R
import edu.aceplora.contact.model.Contact

class Adapter(private val context: Context, private val list: List<Contact>):
    RecyclerView.Adapter<Adapter.ViewHolder>() {

    class ViewHolder(private val view: View): RecyclerView.ViewHolder(view) {
        val name: TextView = view.findViewById(R.id.tvName)
        val phone: TextView = view.findViewById(R.id.tvPhone)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return ViewHolder(adapterLayout)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = list[position]

        holder.name.text = context.resources.getString(item.name)
        holder.phone.text = context.resources.getString(item.phone)
    }

}
