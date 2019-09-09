package com.example.oemoem

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var scoreA = 0
    var scoreB = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bt_score_a.setOnClickListener {
         team_score_a.text = (++scoreA).toString()
        }
        bt_minus_a.setOnClickListener {
            team_score_a.text = (--scoreA).toString()
        }
        bt_reset_a.setOnClickListener {
            scoreA = 0
            team_score_a.text = scoreA.toString()
        }
        bt_score_b.setOnClickListener {
            team_score_b.text = (++scoreB).toString()
        }
        bt_minus_b.setOnClickListener {
            team_score_b.text = (--scoreB).toString()
        }
        bt_reset_b.setOnClickListener {
            scoreB = 0
            team_score_b.text = scoreB.toString()
        }
    }
}
