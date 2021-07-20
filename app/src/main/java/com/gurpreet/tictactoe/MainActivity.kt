package com.gurpreet.tictactoe

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun buclick(view: View){
    val buttonselected:Button=view as Button
    var cellid=0
        when(buttonselected.id){
            R.id.button-> cellid=1
            R.id.button2-> cellid=2
            R.id.button3-> cellid=3
            R.id.button4-> cellid=4
            R.id.button5-> cellid=5
            R.id.button6-> cellid=6
            R.id.button7-> cellid=7
            R.id.button8-> cellid=8
            R.id.button9-> cellid=9
        }
       // Toast.makeText(this, "cell selected: "+cellid,Toast.LENGTH_LONG).show()
    play(cellid,buttonselected)
    }

    var player1=ArrayList<Int>()
    var player2=ArrayList<Int>()
    var activeplayer=1

    fun play(cellid:Int,buttonselected:Button){
        if (activeplayer==1){
        buttonselected.text="X"
        buttonselected.setBackgroundColor(Color.GREEN)
        player1.add(cellid)
        activeplayer=2
        }
        else {
        buttonselected.text="O"
        buttonselected.setBackgroundColor(Color.BLUE)
        player2.add(cellid)
        activeplayer=1
        }
    buttonselected.isEnabled=false
    Winner()
    }

    fun Winner(){
        var winner:Int=-1
        if (player1.contains(1) && player1.contains(2) && player1.contains(3))
            winner=1
        if (player1.contains(4) && player1.contains(5) && player1.contains(6))
            winner=1
        if (player1.contains(7) && player1.contains(8) && player1.contains(9))
            winner=1
        if (player1.contains(1) && player1.contains(4) && player1.contains(7))
        winner=1
        if (player1.contains(2) && player1.contains(5) && player1.contains(8))
            winner=1
        if (player1.contains(3) && player1.contains(6) && player1.contains(9))
            winner=1
        if (player1.contains(1) && player1.contains(5) && player1.contains(9))
            winner=1
        if (player1.contains(3) && player1.contains(5) && player1.contains(7))
            winner=1

        if (player2.contains(1) && player1.contains(2) && player1.contains(3))
            winner=2
        if (player2.contains(4) && player1.contains(5) && player1.contains(6))
            winner=2
        if (player2.contains(7) && player1.contains(8) && player1.contains(9))
            winner=2
        if (player2.contains(1) && player1.contains(4) && player1.contains(7))
            winner=2
        if (player2.contains(2) && player1.contains(5) && player1.contains(8))
            winner=2
        if (player2.contains(3) && player1.contains(6) && player1.contains(9))
            winner=2
        if (player2.contains(1) && player1.contains(5) && player1.contains(9))
            winner=2
        if (player2.contains(3) && player1.contains(5) && player1.contains(7))
            winner=2

    if (winner!=-1) {
        if (winner == 1)
            Toast.makeText(this, "The winner is player 1", Toast.LENGTH_LONG).show()
        else if (winner == 2)
            Toast.makeText(this, "The winner is player 2", Toast.LENGTH_LONG).show()
    }
    }
}
