package com.harry18121911.todoapp.TasksAdapter

import android.content.res.ColorStateList
import android.graphics.Paint
import android.view.View
import android.widget.CheckBox
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.harry18121911.todoapp.R
import com.harry18121911.todoapp.Task
import com.harry18121911.todoapp.TaskCategory

class TasksViewHolder (view:View): RecyclerView.ViewHolder(view){

    private val tvTask :TextView = view.findViewById(R.id.tvTask)
    private val cbTask :CheckBox = view.findViewById(R.id.cbTask)

    fun render(task: Task){

        if(task.isSelected){
            tvTask.paintFlags = tvTask.paintFlags or Paint.STRIKE_THRU_TEXT_FLAG
        }else{
            tvTask.paintFlags = tvTask.paintFlags and Paint.STRIKE_THRU_TEXT_FLAG.inv()
        }

        cbTask.isChecked = task.isSelected

       val color = when(task.category){
            TaskCategory.Business ->   R.color.blue
            TaskCategory.Personal ->  R.color.greenYellow
            TaskCategory.Other -> R.color.yellow
        }

        cbTask.buttonTintList = ColorStateList.valueOf(
            ContextCompat.getColor(cbTask.context,color)
        )

        tvTask.text = task.name
    }
}