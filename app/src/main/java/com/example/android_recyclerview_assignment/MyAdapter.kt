package com.example.android_recyclerview_assignment

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.android_recyclerview_assignment.databinding.BookmarkItemBinding
import com.example.android_recyclerview_assignment.databinding.NotBookmarkItemBinding

class MyAdapter(val mPeople: MutableList<People>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        if (viewType == BookMarkType.YES) {
            return BookMarkViewHolder(
                BookmarkItemBinding.inflate(
                    LayoutInflater.from(parent.context),
                    parent,
                    false
                )
            )
        }
        else {
            return NotBookMarkViewHolder(
                NotBookmarkItemBinding.inflate(
                    LayoutInflater.from(parent.context),
                    parent,
                    false
                )
            )
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (mPeople[position].bookMark) {
            BookMarkType.YES -> {
                (holder as BookMarkViewHolder).bind(mPeople[position])
            }
            BookMarkType.NO -> {
                (holder as NotBookMarkViewHolder).bind(mPeople[position])
            }
        }
    }

    override fun getItemCount(): Int {
        return mPeople.size
    }

    override fun getItemViewType(position: Int): Int {
        return mPeople[position].bookMark
    }
}