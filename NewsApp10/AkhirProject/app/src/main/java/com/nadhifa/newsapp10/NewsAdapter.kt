package com.nadhifa.newsapp10

import android.app.Application
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.google.firebase.FirebaseApp
import com.nadhifa.newsapp10.model.ArticlesItem
import kotlinx.android.synthetic.main.save_activity.view.*

class NewsAdapter(var context: Context,var listNews: List<ArticlesItem?>?) : RecyclerView.Adapter<NewsAdapter.NewsViewHolder>() {

    class NewsViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        fun bind(news: ArticlesItem) {
            with(itemView) {
                tv_tittle.text = news.title
                Glide.with(context).load(news.urlToImage).centerCrop().into(iv_news1)
                Glide.with(context).load(news.urlToImage).centerCrop().into(iv_news2)

            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.list_news, parent, false)
        return NewsViewHolder(view)
    }

    override fun onBindViewHolder(holder: NewsViewHolder, position: Int) {
        holder.bind(listNews?.get(position)!!)
    }

    override fun getItemCount(): Int = listNews!!.size

}