package com.example.applicationcontentproviderclient

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {

    lateinit var notesRecycler:RecyclerView
    lateinit var notesRefreshButton: FloatingActionButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        notesRefreshButton = findViewById(R.id.btn_client_refresh)
        notesRecycler = findViewById(R.id.rv_client_list)

        notesRefreshButton.setOnClickListener{}
    }
}