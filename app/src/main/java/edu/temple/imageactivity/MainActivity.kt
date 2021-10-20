package edu.temple.imageactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import kotlinx.android.synthetic.main.activity_selection.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_selection)



        var dataList = mutableListOf<ImageData>()
        var  imageAdapter: ImageAdapter = ImageAdapter(this)

        this
        dataList.add(ImageData("Abyssinian",R.drawable.abyssinian))
        dataList.add(ImageData("Bengal",R.drawable.bengal))
        dataList.add(ImageData("Bombay",R.drawable.bombay))
        dataList.add(ImageData("Maine Coon",R.drawable.maine_coon))
        dataList.add(ImageData("Munchkin",R.drawable.munchkin))
        dataList.add(ImageData("Persian",R.drawable.persian))
        dataList.add(ImageData("Savannah",R.drawable.savannah))
        dataList.add(ImageData("Scottish Fold",R.drawable.scottish_fold))
        dataList.add(ImageData("Siamese",R.drawable.simese))
        dataList.add(ImageData("Tabby",R.drawable.tabby))


        imageAdapter.setDataList(dataList)

        val selectionFragment: Fragment = SelectionFragment(dataList)
        val displayFragment: Fragment = DisplayFragment()

        supportFragmentManager.beginTransaction()
            .add(R.id.SelectionFragment, selectionFragment)
            .add(R.id.DisplayFragment, displayFragment)
            .commit()


    }
}