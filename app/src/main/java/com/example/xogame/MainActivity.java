package com.example.xogame;
import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ArrayList<Integer> player1 = new ArrayList<>();
    ArrayList<Integer> player2 = new ArrayList<>();
    ArrayList<Integer> player = null;
    int cnt = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void processGame(View view) {
        if (cnt % 2 == 0) {
            Button ChoosesBtn = (Button) view;
            ChoosesBtn.setText("X");
            ChoosesBtn.setBackgroundResource(R.color.xocolor);
            ChoosesBtn.setEnabled(false);
            int cellNo = 0;
            if (ChoosesBtn.getId() == R.id.btn1)
                cellNo = 1;
            if (ChoosesBtn.getId() == R.id.btn2)
                cellNo = 2;
            if (ChoosesBtn.getId() == R.id.btn3)
                cellNo = 3;
            if (ChoosesBtn.getId() == R.id.btn4)
                cellNo = 4;
            if (ChoosesBtn.getId() == R.id.btn5)
                cellNo = 5;
            if (ChoosesBtn.getId() == R.id.btn6)
                cellNo = 6;
            if (ChoosesBtn.getId() == R.id.btn7)
                cellNo = 7;
            if (ChoosesBtn.getId() == R.id.btn8)
                cellNo = 8;
            if (ChoosesBtn.getId() == R.id.btn9)
                cellNo = 9;
            player1.add(cellNo);
            if (isGameOver(player1)) {
                Button button1=findViewById(R.id.btn1);
                Button button2=findViewById(R.id.btn2);
                Button button3=findViewById(R.id.btn3);
                Button button4=findViewById(R.id.btn4);
                Button button5=findViewById(R.id.btn5);
                Button button6=findViewById(R.id.btn6);
                Button button7=findViewById(R.id.btn7);
                Button button8=findViewById(R.id.btn8);
                Button button9=findViewById(R.id.btn9);
                button1.setEnabled(false);
                button2.setEnabled(false);
                button3.setEnabled(false);
                button4.setEnabled(false);
                button5.setEnabled(false);
                button6.setEnabled(false);
                button7.setEnabled(false);
                button8.setEnabled(false);
                button9.setEnabled(false);
                displayWinner("player1");
            }

        }
       if (cnt % 2 != 0) {
            Button ChoosesBtn1 = (Button) view;
            ChoosesBtn1.setTextSize(20);
            ChoosesBtn1.setText("O");
            ChoosesBtn1.setBackgroundResource(R.color.xocolor1);
            ChoosesBtn1.setEnabled(false);
            int cellNo1 = 0;
            if (ChoosesBtn1.getId() == R.id.btn1)
                cellNo1 = 1;
            if (ChoosesBtn1.getId() == R.id.btn2)
                cellNo1 = 2;
            if (ChoosesBtn1.getId() == R.id.btn3)
                cellNo1 = 3;
            if (ChoosesBtn1.getId() == R.id.btn4)
                cellNo1 = 4;
            if (ChoosesBtn1.getId() == R.id.btn5)
                cellNo1 = 5;
            if (ChoosesBtn1.getId() == R.id.btn6)
                cellNo1 = 6;
            if (ChoosesBtn1.getId() == R.id.btn7)
                cellNo1 = 7;
            if (ChoosesBtn1.getId() == R.id.btn8)
                cellNo1 = 8;
            if (ChoosesBtn1.getId() == R.id.btn9)
                cellNo1 = 9;
            player2.add(cellNo1);
            if (isGameOver(player2)) {

               Button button1=findViewById(R.id.btn1);
                Button button2=findViewById(R.id.btn2);
                Button button3=findViewById(R.id.btn3);
                Button button4=findViewById(R.id.btn4);
                Button button5=findViewById(R.id.btn5);
                Button button6=findViewById(R.id.btn6);
                Button button7=findViewById(R.id.btn7);
                Button button8=findViewById(R.id.btn8);
                Button button9=findViewById(R.id.btn9);
                button1.setEnabled(false);
                button2.setEnabled(false);
                button3.setEnabled(false);
                button4.setEnabled(false);
                button5.setEnabled(false);
                button6.setEnabled(false);
                button7.setEnabled(false);
                button8.setEnabled(false);
                button9.setEnabled(false);
                displayWinner("player2");
            }

        } cnt++;
    }



        public void mobilechooses () {

        }
        public boolean isGameOver (ArrayList < Integer > player)


        {
            ArrayList<Integer> row1 = new ArrayList<>(Arrays.asList(1, 2, 3));
            ArrayList<Integer> row2 = new ArrayList<>(Arrays.asList(4, 5, 6));
            ArrayList<Integer> row3 = new ArrayList<>(Arrays.asList(7, 8, 9));
            ArrayList<Integer> row4 = new ArrayList<>(Arrays.asList(1, 4, 7));
            ArrayList<Integer> row5 = new ArrayList<>(Arrays.asList(2, 5, 8));
            ArrayList<Integer> row6 = new ArrayList<>(Arrays.asList(3, 6, 9));
            ArrayList<Integer> a1 = new ArrayList<>(Arrays.asList(1, 5, 9));
            ArrayList<Integer> a2 = new ArrayList<>(Arrays.asList(3, 5, 7));
            if (player.containsAll(row1) || player.containsAll(row2) || player.containsAll(row3) ||
                    player.containsAll(row4) || player.containsAll(row5) || player.containsAll(row6) ||
                    player.containsAll(a1) || player.containsAll(a2))
                return true;
            else return false;
        }
        private void displayWinner (String winner){
            AlertDialog.Builder adb = new AlertDialog.Builder(this);
            adb.setIcon(R.drawable.bzwinner);
            adb.setTitle("The winner is:");
            adb.setMessage(winner);
            adb.setPositiveButton("Ok", null);
            adb.create().show();

        }
    }