package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    int x=-1 ;
    int b=1;
    String[] array= new String[9];
    private TextView textView2;
    int incremented=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void disable(View v){
        v.setEnabled(false);
    }

    public void algorithm(View v) {
//        Button key = (Button) v;
//        String compare = (String) key.getText();
//        String zen= "start";

        //if (compare.equals(zen)){

            int y = v.getId();
        TextView turns = (TextView) findViewById(R.id.textView2);

        Button buttona = (Button) v;
        String z = (String) buttona.getText();
        b = Integer.parseInt(z);
        if ((x == -1) && (z != "O")) {
            buttona.setText("X");
            array[b] = "X";
            x = x * -1;

            turns.setText("Player 2's turn");
            turns.setVisibility(View.VISIBLE);
            check(array, v);

        } else {
            if (z != "X") {
                buttona.setText("O");
                array[b] = "O";
                x = x * -1;
                turns.setText("Player 1's turn");
                turns.setVisibility(View.VISIBLE);

                check(array, v);

                // Remaining tasks:

                //2. It has to disable/reset all the buttons once a winner has been announced
                //3. The program should start when the button start is pressed
                //4. after the game is over the button start should display start again


            }
        }
    }

//    }
    //this method is supposed to check one raw, or one column, or one diagonal consits of X's or O's
    // then it will declare the first user with such feat as winner.
    public void check(String[] array, View v) {
         incremented =  incremented +1 ;
        TextView viewa = (TextView) findViewById(R.id.textView2);
        //findViewById returns type class.

        if ((array[0]=="X")&&(array[1]=="X")&&(array[2]=="X")){
            viewa.setText("Player one is the winner");
            viewa.setVisibility(View.VISIBLE);

        }
        else if ((array[3]=="X")&&(array[4]=="X")&&(array[5]=="X")){
            viewa.setText("Player one is the winner");
            viewa.setVisibility(View.VISIBLE);
        }
        else if ((array[6]=="X")&&(array[7]=="X")&&(array[8]=="X")){
            viewa.setText("Player one is the winner");
            viewa.setVisibility(View.VISIBLE);
        }
        else if ((array[0]=="X")&&(array[3]=="X")&&(array[6]=="X")){
            viewa.setText("Player one is the winner");
            viewa.setVisibility(View.VISIBLE);
        }
        else if ((array[1]=="X")&&(array[4]=="X")&&(array[7]=="X")){
            viewa.setText("Player one is the winner");
            viewa.setVisibility(View.VISIBLE);
        }
        else if ((array[2]=="X")&&(array[5]=="X")&&(array[8]=="X")){
            viewa.setText("Player one is the winner");
            viewa.setVisibility(View.VISIBLE);
        }
        else if ((array[0]=="X")&&(array[4]=="X")&&(array[8]=="X")){
            viewa.setText("Player one is the winner");
            viewa.setVisibility(View.VISIBLE);
        }
        else if ((array[2]=="X")&&(array[4]=="X")&&(array[6]=="X")){
            viewa.setText("Player one is the winner");
            viewa.setVisibility(View.VISIBLE);
        }
        //Now the case for the O s
        else if ((array[0]=="O")&&(array[1]=="O")&&(array[2]=="O")){
            viewa.setText("Player two is the winner");
            viewa.setVisibility(View.VISIBLE);
        }
        else if ((array[3]=="O")&&(array[4]=="O")&&(array[5]=="O")){
            viewa.setText("Player two is the winner");
            viewa.setVisibility(View.VISIBLE);
        }
        else if ((array[6]=="O")&&(array[7]=="O")&&(array[8]=="O")){
            viewa.setText("Player two is the winner");
            viewa.setVisibility(View.VISIBLE);
        }
        else if ((array[0]=="O")&&(array[3]=="O")&&(array[6]=="O")){
            viewa.setText("Player two is the winner");
            viewa.setVisibility(View.VISIBLE);
        }
        else if ((array[1]=="O")&&(array[4]=="O")&&(array[7]=="O")){
            viewa.setText("Player two is the winner");
            viewa.setVisibility(View.VISIBLE);
        }
        else if ((array[2]=="O")&&(array[5]=="O")&&(array[8]=="O")){
            viewa.setText("Player two is the winner");
            viewa.setVisibility(View.VISIBLE);
        }
        else if ((array[0]=="O")&&(array[4]=="O")&&(array[8]=="O")){
            viewa.setText("Player two is the winner");
            viewa.setVisibility(View.VISIBLE);
        }
        else if ((array[2]=="O")&&(array[4]=="O")&&(array[6]=="O")){
            viewa.setText("Player two is the winner");
            viewa.setVisibility(View.VISIBLE);
        }
        else if (incremented==9){
            viewa.setText("Neither is the winner");
            viewa.setVisibility(View.VISIBLE);
        }

    }
}


