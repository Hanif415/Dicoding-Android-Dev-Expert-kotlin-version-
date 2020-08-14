package com.bluberryboii.submision1

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import kotlinx.android.synthetic.main.item_user.view.*

class UserAdapter internal constructor(private val context: Context) : BaseAdapter() {
    internal var user = arrayListOf<User>()

    override fun getView(position: Int, view: View?, viewGroup: ViewGroup?): View {
        var itemView = view
        if (itemView != null) {
            itemView = LayoutInflater.from(context).inflate(R.layout.item_user, viewGroup, false)
        }

        val viewHolder = ViewHolder(itemView as View)

        val user = getItem(position) as User
        viewHolder.bind(user)
        return itemView
    }

    override fun getItem(i: Int): Any = user[i]

    override fun getItemId(i: Int): Long = i.toLong()

    override fun getCount(): Int = user.size

    inner class ViewHolder constructor(private val view: View) {
        fun bind(user: User) {
            with(view) {
                tv_username.text = user.username
                tv_company.text = user.company
                tv_location.text = user.location
                img_avatar.setImageResource(user.avatar)
            }
        }
    }
}