package com.harry18121911.todoapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.harry18121911.todoapp.CategoriesAdapter.CategoriesAdapter
import com.harry18121911.todoapp.TasksAdapter.TasksAdapter

class TodoActivity : ComponentActivity() {

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


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
            setContentView(R.layout.todo_activity_layout)
            initComponent()
            initUI()
    }

    private fun initComponent(){
        rvCategories = findViewById(R.id.rvCategories)
        rvTasks = findViewById(R.id.rvTasks)
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