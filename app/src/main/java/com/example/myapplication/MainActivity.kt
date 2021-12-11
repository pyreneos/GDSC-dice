package com.example.myapplication

import android.graphics.drawable.Drawable
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageSwitcher
import android.widget.ImageView
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
    fun ZarAtma(v: View){

        val num=findViewById(R.id.textView4) as TextView
        val pngg=findViewById(R.id.imageView2) as ImageView
        var x=0
        var ras=0

        var rastgele= Random.nextInt(1,7)
        when(rastgele){
            1->pngg.setImageResource(R.drawable.dic1)
            2->pngg.setImageResource(R.drawable.dic2)
            3->pngg.setImageResource(R.drawable.dic3)
            4->pngg.setImageResource(R.drawable.dic4)
            5->pngg.setImageResource(R.drawable.dic5)
            6->pngg.setImageResource(R.drawable.dic6)
        }



        num.text=ras.toString()
    }
    fun reset(v:View){
        val num=findViewById(R.id.textView4) as TextView
        val pngg=findViewById(R.id.imageView2) as ImageView
        pngg.setImageResource(R.drawable.dic1)
        num.text="Numara"
    }

}