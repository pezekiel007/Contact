package edu.aceplora.contact

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import edu.aceplora.contact.adapter.Adapter
import edu.aceplora.contact.data.DataSource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myContacts = DataSource().loadContacts()

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.adapter = Adapter(this, myContacts)
        recyclerView.layoutManager = LinearLayoutManager(this)

        recyclerView.setHasFixedSize(true)
    }
}