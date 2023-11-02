package com.example.shapokapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var sneakerList: ArrayList<Sneacker>
    private lateinit var snickerAdapter: SneackerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)

        sneakerList = ArrayList()

        sneakerList.add(Sneacker(R.drawable.adidas , name = "adidas - 40 000"))
        sneakerList.add(Sneacker(R.drawable.nike1 , name = "Jordan - 80 000"))
        sneakerList.add(Sneacker(R.drawable.nike2 , name = "nike2 - 70 000"))
        sneakerList.add(Sneacker(R.drawable.nike3 , name = "monarch - 30 000"))

        sneakerList.add(Sneacker(R.drawable.adidas , name = "adidas - 40 000"))
        sneakerList.add(Sneacker(R.drawable.nike1 , name = "Jordan - 80 000"))
        sneakerList.add(Sneacker(R.drawable.nike2 , name = "nike2 - 70 000"))
        sneakerList.add(Sneacker(R.drawable.nike3 , name = "monarch - 30 000"))


        snickerAdapter = SneackerAdapter(sneakerList)
        recyclerView.adapter = snickerAdapter


    }
}