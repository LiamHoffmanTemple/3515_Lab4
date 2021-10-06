package edu.temple.imageactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.image_layout.view.*

class DisplayActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display)

        var title = intent.getStringExtra("title")
        var image = intent.getIntExtra("image", R.drawable.tabby)

        findViewById<TextView>(R.id.newTextView).text = title
        findViewById<ImageView>(R.id.newImageView).setImageResource(image)


    }
}