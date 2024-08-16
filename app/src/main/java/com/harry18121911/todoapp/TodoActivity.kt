package com.harry18121911.todoapp

import android.app.Dialog
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.harry18121911.todoapp.CategoriesAdapter.CategoriesAdapter
import com.harry18121911.todoapp.TasksAdapter.TasksAdapter

class TodoActivity : AppCompatActivity() {

    private val categories = listOf(
        TaskCategory.Business,
        TaskCategory.Personal,
        TaskCategory.Other
    )

    private val tasks = mutableListOf(
        Task(name = "PruebaBusiness", TaskCategory.Business),
        Task(name = "PruebaPersonal", TaskCategory.Personal),
        Task(name = "PruebaOther", TaskCategory.Other)
    )

    private lateinit var rvCategories: RecyclerView
    private lateinit var categoriesAdapter: CategoriesAdapter

    private lateinit var rvTasks: RecyclerView
    private lateinit var tasksAdapter: TasksAdapter

    private lateinit var  fabAddTask : FloatingActionButton


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
            setContentView(R.layout.todo_activity_layout)
            initComponent()
            initUI()
            initListeners()
    }

    private fun initListeners(){
        fabAddTask.setOnClickListener { showDialog()  }
    }

    private fun showDialog(){
        val dialog = Dialog(this)
    }

    private fun initComponent(){
        rvCategories = findViewById(R.id.rvCategories)
        rvTasks = findViewById(R.id.rvTasks)
        fabAddTask = findViewById(R.id.fabAddTask)
    }

    private fun initUI(){
        categoriesAdapter = CategoriesAdapter(categories)
        tasksAdapter = TasksAdapter(tasks)
        rvCategories.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        rvCategories.adapter = categoriesAdapter
        rvTasks.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        rvTasks.adapter = tasksAdapter
    }
}