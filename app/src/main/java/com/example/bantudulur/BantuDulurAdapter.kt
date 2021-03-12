package com.example.bantudulur

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class BantuDulurAdapter(private val listBantuDulur:ArrayList<BantuDulur>) : RecyclerView.Adapter<BantuDulurAdapter.CardViewViewHolder>() {

    private lateinit var onItemClickCallBack: OnItemClickCallBack

    inner class CardViewViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var photo : ImageView = itemView.findViewById(R.id.item_image)
        var dulurName : TextView = itemView.findViewById(R.id.item_title)
        var dulurDetail : TextView = itemView.findViewById(R.id.item_detail)
    }

    interface OnItemClickCallBack {
        fun onItemClicked (data : BantuDulur)

    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.recyclerview, parent, false)
        return CardViewViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listBantuDulur.size
    }
    

    override fun onBindViewHolder(holder: CardViewViewHolder, position: Int) {
        val BantuDulur = listBantuDulur[position]
        holder.dulurName.text = BantuDulur.tittle
        holder.dulurDetail.text = BantuDulur.detail
        Glide.with(holder.itemView.context)
            .load(listBantuDulur[position].photo)
            .into(holder.photo)
        holder.itemView.setOnClickListener{onItemClickCallBack.onItemClicked(listBantuDulur[holder.adapterPosition])}

    }

    fun setOnItemClickCallBack(onItemClickCallBack: OnItemClickCallBack) {
        this.onItemClickCallBack = onItemClickCallBack
    }
}





