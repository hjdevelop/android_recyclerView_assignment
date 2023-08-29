package com.example.android_recyclerview_assignment

import androidx.recyclerview.widget.RecyclerView
import com.example.android_recyclerview_assignment.databinding.NotBookmarkItemBinding

class NotBookMarkViewHolder(binding: NotBookmarkItemBinding) : RecyclerView.ViewHolder(binding.root) {

    val peopleImage = binding.notBookmarkItemImageImageButton
    val name = binding.notBookmarkItemNameTextView
    val phoneNumber = binding.notBookmarkItemPhoneNumberTextView
    val bookMark = binding.notBookmarkItemStateImageView

    fun bind(item: People) {
        peopleImage.setImageResource(item.peopleImage)
        name.text = item.peopleName
        phoneNumber.text = item.phoneNumber
        bookMark.setImageResource(R.drawable.ic_star_outline)
    }
}