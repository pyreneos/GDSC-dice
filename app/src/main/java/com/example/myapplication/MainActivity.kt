package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.TypedValue
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.content.Context


import kotlin.random.Random



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
    var number=0
    fun ZarAtma(v: View,){
        var i=0
        val num1=findViewById(R.id.textView4) as TextView
        val pngg1=findViewById(R.id.imageView2) as ImageView
        val pngg2=findViewById(R.id.imageView) as ImageView

        var rastgele= Random.nextInt(1,7)
        when(rastgele) {
                    1 -> pngg1.setImageResource(R.drawable.dic1)
                    2 -> pngg1.setImageResource(R.drawable.dic2)
                    3 -> pngg1.setImageResource(R.drawable.dic3)
                    4 -> pngg1.setImageResource(R.drawable.dic4)
                    5 -> pngg1.setImageResource(R.drawable.dic5)
                    6 -> pngg1.setImageResource(R.drawable.dic6)
        }
        if  (number%2==1){
            var spec=""
            var ras = Random.nextInt(1, 7)
            when (ras) {
                1 -> pngg2.setImageResource(R.drawable.dic1)
                2 -> pngg2.setImageResource(R.drawable.dic2)
                3 -> pngg2.setImageResource(R.drawable.dic3)
                4 -> pngg2.setImageResource(R.drawable.dic4)
                5 -> pngg2.setImageResource(R.drawable.dic5)
                6 -> pngg2.setImageResource(R.drawable.dic6)
            }
            if(ras==rastgele){
                when (ras) {
                    1 -> spec="\nHep Yek"
                    2 -> spec="\nDubara"
                    3 -> spec="\nDü Se"
                    4 -> spec="\nDört Cihar"
                    5 -> spec="\nDü Beş"
                    6 -> spec="\nDü Şeş"
                }
            }
            num1.text=rastgele.toString()+" - "+ras.toString()+spec
        }
        else{
            num1.text=rastgele.toString()
        }

    }
    fun reset(v:View){
        val num=findViewById(R.id.textView4) as TextView
        val pngg1=findViewById(R.id.imageView2) as ImageView
        val pngg2=findViewById(R.id.imageView) as ImageView
        pngg2.setImageResource(R.drawable.dsc_2)
        pngg1.setImageResource(R.drawable.dsc_2)
        num.text="GDSC-METU"
        number=0
        pngg2.visibility=View.INVISIBLE
        pngg1.margin(132F , 84F,)
    }
    fun change_dicenum(v:View){
        number++
        val num=findViewById(R.id.textView4) as TextView
        val pngg2=findViewById(R.id.imageView) as ImageView
        val pngg1=findViewById(R.id.imageView2) as ImageView
        if (number%2==1){
            pngg1.margin(32F , 84F)
            pngg2.visibility=View.VISIBLE
            pngg2.setImageResource(R.drawable.dsc_2)
            pngg1.setImageResource(R.drawable.dsc_2)
            num.text="GDSC-METU"
        }
        else{
            pngg1.margin(132F , 84F,)
            pngg2.visibility=View.INVISIBLE
            pngg2.setImageResource(R.drawable.dsc_2)
            pngg1.setImageResource(R.drawable.dsc_2)
            num.text="GDSC-METU"
        }
    }
    fun View.margin(left: Float = 0F, top: Float = 0F) {
        layoutParams<ViewGroup.MarginLayoutParams> {
            left.run { leftMargin = dpToPx(this) }
            top.run { topMargin = dpToPx(this) }
        }
    }

    inline fun <reified T : ViewGroup.LayoutParams> View.layoutParams(block: T.() -> Unit) {
        if (layoutParams is T) block(layoutParams as T)
    }

    fun View.dpToPx(dp: Float): Int = context.dpToPx(dp)
    fun Context.dpToPx(dp: Float): Int = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp, resources.displayMetrics).toInt()
}