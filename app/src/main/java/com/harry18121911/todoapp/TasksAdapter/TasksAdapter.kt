package com.harry18121911.todoapp.TasksAdapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.harry18121911.todoapp.R
import com.harry18121911.todoapp.Task

class TasksAdapter(var task:List<Task>, private val onTaskSelected:(Int) ->Unit): RecyclerView.Adapter<TasksViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TasksViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_todo_task, parent, false)
        return  TasksViewHolder(view)
    }

    override fun getItemCount(): Int {
        return task.size
    }

    override fun onBindViewHolder(holder: TasksViewHolder, position: Int) {
        holder.render(task[position])
        holder.itemView.setOnClickListener {  onTaskSelected(position) }
    }
}