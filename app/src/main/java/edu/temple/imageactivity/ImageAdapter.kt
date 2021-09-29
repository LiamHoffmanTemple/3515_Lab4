package edu.temple.imageactivity

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*
import android.app.Activity as Activity


class ImageAdapter(var context: Context) : RecyclerView.Adapter<ImageAdapter.ViewHolder>() {

    var imageList = emptyList<ImageData>()

    internal fun setDataList(imageList: List<ImageData>) {
        this.imageList = imageList
    }

    // Provide a direct reference to each of the views with data items

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var image: ImageView = itemView.findViewById(R.id.image)
        var title: TextView = itemView.findViewById(R.id.title)


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageAdapter.ViewHolder {

        var view = LayoutInflater.from(parent.context).inflate(R.layout.image_layout, parent, false)
        return ViewHolder(view)
    }


    override fun onBindViewHolder(holder: ImageAdapter.ViewHolder, position: Int) {

        var images = imageList[position]
        holder.title.text = images.title
        holder.image.setImageResource(images.image)

        holder.image.setOnClickListener(){
            (context as Activity).findViewById<ImageView>(R.id.imageView).setImageResource(images.image)
            (context as Activity).findViewById<TextView>(R.id.imageTitle).text = images.title
        }

    }


    override fun getItemCount() = imageList.size

}