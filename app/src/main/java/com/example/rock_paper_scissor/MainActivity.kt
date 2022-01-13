package com.example.rock_paper_scissor

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.service.autofill.Validators.or

import android.view.View.GONE
import android.view.View.VISIBLE
import com.example.rock_paper_scissor.R.*
import com.example.rock_paper_scissor.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.button.setOnClickListener{
            clear_score()
        }


        binding.scissor.setOnClickListener{
            binding.playerScreen.setImageResource(R.drawable.scissor)
            val computer_move = (1..4).random()
            if(computer_move==1){
                binding.compScreen.setImageResource(R.drawable.rock)
                binding.resultScrren.text = "Computer wins"
                val comp_score:Int = binding.compScore.text.toString().toInt()+1
                binding.compScore.text = comp_score.toString()
            }
            else if(computer_move==2){
                binding.compScreen.setImageResource(R.drawable.paper)
                binding.resultScrren.text = "Player wins"
                val play_score:Int = binding.playerScore.text.toString().toInt()+1
                binding.playerScore.text = play_score.toString()
            }
            else{
                binding.compScreen.setImageResource(R.drawable.scissor)
                binding.resultScrren.text = "DRAW"
            }
        }

        binding.paper.setOnClickListener{
            binding.playerScreen.setImageResource(R.drawable.paper)
            val computer_move = (1..4).random()
            if(computer_move==1){
                binding.compScreen.setImageResource(R.drawable.rock)
                binding.resultScrren.text = "Player wins"
                val play_score:Int = binding.playerScore.text.toString().toInt()+1
                binding.playerScore.text = play_score.toString()
            }
            else if(computer_move==2){
                binding.compScreen.setImageResource(R.drawable.paper)
                binding.resultScrren.text = "DRAW"

            }
            else{
                binding.compScreen.setImageResource(R.drawable.scissor)
                binding.resultScrren.text = "Computer wins"
                val comp_score :Int=binding.compScore.text.toString().toInt()+1
                binding.compScore.text = comp_score.toString()
            }
        }

        binding.rock.setOnClickListener{
            binding.playerScreen.setImageResource(R.drawable.rock)
            val computer_move = (1..4).random()
            if(computer_move==1){
                binding.compScreen.setImageResource(R.drawable.rock)
                binding.resultScrren.text = "DRAW"

            }
            else if(computer_move==2){
                binding.compScreen.setImageResource(R.drawable.paper)
                binding.resultScrren.text = "Computer wins"
                val comp_score :Int=binding.compScore.text.toString().toInt()+1
                binding.compScore.text = comp_score.toString()

            }
            else{
                binding.compScreen.setImageResource(R.drawable.scissor)
                binding.resultScrren.text = "player wins"
                val play_score:Int = binding.playerScore.text.toString().toInt()+1
                binding.playerScore.text = play_score.toString()

            }
        }
    }
    private fun clear_score(){
        binding.compScore.text="0"
        binding.playerScore.text="0"
        binding.resultScrren.text = " "
        binding.playerScreen.setImageResource(R.drawable.userprofile)
        binding.compScreen.setImageResource(R.drawable.comp_profile)

    }
}


