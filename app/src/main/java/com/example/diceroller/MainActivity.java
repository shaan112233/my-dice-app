package com.example.diceroller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button b_roll;
    Button b_roll1;
    TextView tv_rollNumber;
    ImageView iv_dice;
    ImageView iv_dice1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b_roll = (Button) findViewById(R.id.b_roll);
        b_roll1 = (Button) findViewById(R.id.b_roll1);

        tv_rollNumber = (TextView) findViewById(R.id.tb_rollNumber);
        iv_dice = (ImageView) findViewById(R.id.iv_dice);
        iv_dice1 = (ImageView) findViewById(R.id.iv_dice1);

        b_roll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random r = new Random();
                int theRoll;
                int theRoll1;

                theRoll1 = r.nextInt(6) + 1;
                tv_rollNumber.setText("You rolled a " +theRoll1);


                theRoll = r.nextInt(6) + 1;
                tv_rollNumber.setText("You rolled a " + theRoll + " and a " + theRoll1);



                switch (theRoll) {
                    case 1: {
                        iv_dice.setImageResource(R.drawable.dice_1);
                        break;
                    }
                    case 2: {
                        iv_dice.setImageResource(R.drawable.dice_2);
                        break;
                    }
                    case 3: {
                        iv_dice.setImageResource(R.drawable.dice_3);
                        break;
                    }
                    case 4: {
                        iv_dice.setImageResource(R.drawable.dice_4);
                        break;
                    }
                    case 5: {
                        iv_dice.setImageResource(R.drawable.dice_5);
                        break;
                    }
                    case 6: {
                        iv_dice.setImageResource(R.drawable.dice_6);
                        break;
                    }
                }

                switch (theRoll1) {
                    case 1: {
                        iv_dice1.setImageResource(R.drawable.dice_1);
                        break;
                    }
                    case 2: {
                        iv_dice1.setImageResource(R.drawable.dice_2);
                        break;
                    }
                    case 3: {
                        iv_dice1.setImageResource(R.drawable.dice_3);
                        break;
                    }
                    case 4: {
                        iv_dice1.setImageResource(R.drawable.dice_4);
                        break;
                    }
                    case 5: {
                        iv_dice1.setImageResource(R.drawable.dice_5);
                        break;
                    }
                    case 6: {
                        iv_dice1.setImageResource(R.drawable.dice_6);
                        break;
                    }
                }




            }
        });

        b_roll1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random r = new Random();
                int theRoll;
                int theRoll1;

                theRoll1 = r.nextInt(6) + 1;
                tv_rollNumber.setText("You rolled a " +theRoll1);

                theRoll = r.nextInt(6) + 1;
                tv_rollNumber.setText("You rolled a " + theRoll + " and a " + theRoll1);

                switch (theRoll) {
                    case 1: {
                        iv_dice.setImageResource(R.drawable.dice_1);
                        break;
                    }
                    case 2: {
                        iv_dice.setImageResource(R.drawable.dice_2);
                        break;
                    }
                    case 3: {
                        iv_dice.setImageResource(R.drawable.dice_3);
                        break;
                    }
                    case 4: {
                        iv_dice.setImageResource(R.drawable.dice_4);
                        break;
                    }
                    case 5: {
                        iv_dice.setImageResource(R.drawable.dice_5);
                        break;
                    }
                    case 6: {
                        iv_dice.setImageResource(R.drawable.dice_6);
                        break;
                    }

                }

                switch (theRoll1) {
                    case 1: {
                        iv_dice1.setImageResource(R.drawable.dice_1);
                        break;
                    }
                    case 2: {
                        iv_dice1.setImageResource(R.drawable.dice_2);
                        break;
                    }
                    case 3: {
                        iv_dice1.setImageResource(R.drawable.dice_3);
                        break;
                    }
                    case 4: {
                        iv_dice1.setImageResource(R.drawable.dice_4);
                        break;
                    }
                    case 5: {
                        iv_dice1.setImageResource(R.drawable.dice_5);
                        break;
                    }
                    case 6: {
                        iv_dice1.setImageResource(R.drawable.dice_6);
                        break;
                    }
                }

            }
        });

    }
}
