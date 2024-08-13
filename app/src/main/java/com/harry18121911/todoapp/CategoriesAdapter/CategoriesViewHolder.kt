package com.harry18121911.todoapp.CategoriesAdapter

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.harry18121911.todoapp.R
import com.harry18121911.todoapp.TaskCategory

class CategoriesViewHolder(view: View): RecyclerView.ViewHolder(view){
    private val tvCategoryName:TextView = view.findViewById(R.id.tvCategoryName)
    private val divider:View = view.findViewById(R.id.divider)

    fun render(taskCategory: TaskCategory){
        tvCategoryName.text = "EJEMPLO"
    }
}