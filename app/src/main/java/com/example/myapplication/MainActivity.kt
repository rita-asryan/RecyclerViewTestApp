package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recycler = findViewById<RecyclerView>(R.id.recycler)
        val items = mutableListOf<UserModel>(
        UserModel("Anna", "Asryan", R.drawable.ic_baseline_account_box_24),
        UserModel("Karen", "Mnacakyan", R.drawable.ic_baseline_account_circle_24),
        UserModel("Jasmin", "Sargsyan", R.drawable.ic_baseline_account_box_24),
        UserModel("Edgar", "Shahvaladyan", R.drawable.ic_baseline_account_circle_24),
        UserModel("Eduard", "Tigranyan", R.drawable.ic_baseline_account_box_24),
        UserModel("Lala", "Asatrayna", R.drawable.ic_baseline_account_circle_24),
        UserModel("Anna", "Arustamyan", R.drawable.ic_baseline_account_box_24),
        UserModel("Ann", "Khachatryan", R.drawable.ic_baseline_account_circle_24),
        UserModel("Rita", "Minasyan", R.drawable.ic_baseline_account_box_24),
        UserModel("Tigran", "Alaverdyan", R.drawable.ic_baseline_account_circle_24),
        UserModel("Minas", "Asryan", R.drawable.ic_baseline_account_box_24),
        UserModel("Anna", "Hovhannisyan", R.drawable.ic_baseline_account_circle_24),
        )

       val adapter = MyRecyclerView(this, items)
        recycler.adapter = adapter
        recycler.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
    }
}