package com.example.recycler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private var recycleView : RecyclerView? = null
    private var recyclerView2 : RecyclerView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView2 = findViewById(R.id.Res2)
        recycleView = findViewById(R.id.Res1)

        val list = arrayListOf<String>()
        for (i in 1..20) {
            list.add("Игры $i")
        }

        val alist = arrayListOf<String>()
        for (d in 1..20) {
            alist.add("Мб $d")
        }

        val adapter2 = Adapter2(alist)
        val adapter = AdapterActivity(list)

        recycleView?.adapter = adapter
        recyclerView2?.adapter = adapter2

    }


}