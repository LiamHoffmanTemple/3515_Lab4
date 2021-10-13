package edu.temple.imageactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.GridLayoutManager
import kotlinx.android.synthetic.main.activity_selection.*

class SelectionActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_selection)
        findViewById<TextView>(R.id.labelView).text = resources.getString(R.string.recyclerText)
        var dataList = mutableListOf<ImageData>()
        var  imageAdapter: ImageAdapter = ImageAdapter(this)
        recyclerView.layoutManager = GridLayoutManager(this,2)
        recyclerView.adapter = imageAdapter
        this

        dataList.add(ImageData(resources.getStringArray(R.array.cats)[0],R.drawable.abyssinian))
        dataList.add(ImageData(resources.getStringArray(R.array.cats)[1],R.drawable.bengal))
        dataList.add(ImageData(resources.getStringArray(R.array.cats)[2],R.drawable.bombay))
        dataList.add(ImageData(resources.getStringArray(R.array.cats)[3],R.drawable.maine_coon))
        dataList.add(ImageData(resources.getStringArray(R.array.cats)[4],R.drawable.munchkin))
        dataList.add(ImageData(resources.getStringArray(R.array.cats)[5],R.drawable.persian))
        dataList.add(ImageData(resources.getStringArray(R.array.cats)[6],R.drawable.savannah))
        dataList.add(ImageData(resources.getStringArray(R.array.cats)[7],R.drawable.scottish_fold))
        dataList.add(ImageData(resources.getStringArray(R.array.cats)[8],R.drawable.simese))
        dataList.add(ImageData(resources.getStringArray(R.array.cats)[9],R.drawable.tabby))


        imageAdapter.setDataList(dataList)




    }
}