package com.harry18121911.todoapp.TasksAdapter

import android.view.View
import android.widget.CheckBox
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.harry18121911.todoapp.R
import com.harry18121911.todoapp.Task

class TasksViewHolder (view:View): RecyclerView.ViewHolder(view){

    private val tvTask :TextView = view.findViewById(R.id.tvTask)
    private val cbTask :CheckBox = view.findViewById(R.id.cbTask)

    fun render(task: Task){
        tvTask.text = task.name
    }
}