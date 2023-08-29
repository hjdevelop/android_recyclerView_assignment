package com.example.android_recyclerview_assignment

import androidx.recyclerview.widget.RecyclerView
import com.example.android_recyclerview_assignment.databinding.BookmarkItemBinding

class BookMarkViewHolder(binding: BookmarkItemBinding) : RecyclerView.ViewHolder(binding.root) {

    val peopleImage = binding.bookmarkItemImageImageButton
    val name = binding.bookmarkItemNameTextView
    val phoneNumber = binding.bookmarkItemPhoneNumberTextView
    val bookMark = binding.bookmarkItemStateImageView

    fun bind(item: People) {
        peopleImage.setImageResource(item.peopleImage)
        name.text = item.peopleName
        phoneNumber.text = item.phoneNumber
        bookMark.setImageResource(R.drawable.ic_star_filled)
    }
}