package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    //final - force a value not to be changed
    final int three_pointer = 3;
    final int two_pointer = 2;
    final int free_throw = 1;
    int teamAScore = 0;
    int teamBScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //team A onClick event handlers
    public void onclick_threePointer_A(View view){
        teamAScore += three_pointer;
        display_teamA(teamAScore);
    }

    public void onclick_twoPointer_A(View view){
        teamAScore += two_pointer;
        display_teamA(teamAScore);
    }

    public void onclick_freeThrow_A(View view){
        teamAScore += free_throw;
        display_teamA(teamAScore);
    }

    //team B onClick event handlers
    public void onclick_threePointer_B(View view){
        teamBScore += three_pointer;
        display_teamB(teamBScore);
    }

    public void onclick_twoPointer_B(View view){
        teamBScore += two_pointer;
        display_teamB(teamBScore);
    }

    public void onclick_freeThrow_B(View view){
        teamBScore += free_throw;
        display_teamB(teamBScore);
    }

    //Reset score event
    public void onclick_Reset(View view){
        teamAScore = 0;
        teamBScore = 0;
        display_teamA(teamAScore);
        display_teamB(teamBScore);
    }

    //Display Team A Score
    public void display_teamA(int score){
        TextView textView_teamAScore = (TextView) findViewById(R.id.team_A_score);
        textView_teamAScore.setText(String.valueOf(score));
    }

    //Display Team B Score
    public void display_teamB(int score){
        TextView textView_teamAScore = (TextView) findViewById(R.id.team_B_score);
        textView_teamAScore.setText(String.valueOf(score));
    }

}
