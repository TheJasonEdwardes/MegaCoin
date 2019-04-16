package com.example.megacoins3;

import android.app.Activity;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;

import java.util.Random;
import java.util.logging.Level;


public class MainActivity extends Activity implements View.OnClickListener {

    int rabitcounter = 0;

    int currentImageTower1 = 0;
    int currentImageTower2 = 0;
    int currentImageTower3 = 0;
    int currentImageTower4 = 0;
    int diceRoll;
    int randomNumber;
    int boardspace = 0;
    int intTotalcoins = 0;
    int scoreboard = 0;
    BackGround backGround = new BackGround();
    int times = 1;
    int totalPoints = 0;
    int currentSpace = 0;
    int currentCoins;
    long diceDelay;
    long millseconds, longdelay;
    int txt_turns_Left = 55;
    int random;

    ImageView imgGameBoard1, imgGameBoard2, imgGameBoard3, imgGameBoard4, imgGameBoard5, imgGameBoard6, imgGameBoard7,
            imgGameBoard8, imgGameBoard9, imgGameBoard10, imgGameBoard11, imgGameBoard12, imgGameBoard13, imgGameBoard14,
            imgGameBoard15, imgGameBoard16, imgGameBoard17, imgGameBoard18, imgGameBoard19, imgGameBoard20, imgGameBoard21,
            imgGameBoard22, imgGameBoard23, imgGameBoard24;
    ImageView imgDice, imgView100, imgView200, imgView300, imgView400;
    ImageView btnRollDice, btnSpendOne, btnSpendTwo, btnSpendThree, btnSpendFour;
    TextView txtCoinsx, txtTotalCoins, txtTurnsLeft, txtScore, text5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imgDice = findViewById(R.id.imgDice);
        imgGameBoard1 = findViewById(R.id.square1);
        imgGameBoard2 = findViewById(R.id.square2);
        imgGameBoard3 = findViewById(R.id.square3);
        imgGameBoard4 = findViewById(R.id.square4);
        imgGameBoard5 = findViewById(R.id.square5);
        imgGameBoard6 = findViewById(R.id.square6);
        imgGameBoard7 = findViewById(R.id.square7);
        imgGameBoard8 = findViewById(R.id.square8);
        imgGameBoard9 = findViewById(R.id.square9);
        imgGameBoard10 = findViewById(R.id.square10);
        imgGameBoard11 = findViewById(R.id.square11);
        imgGameBoard12 = findViewById(R.id.square12);
        imgGameBoard13 = findViewById(R.id.square13);
        imgGameBoard14 = findViewById(R.id.square14);
        imgGameBoard15 = findViewById(R.id.square15);
        imgGameBoard16 = findViewById(R.id.square16);
        imgGameBoard17 = findViewById(R.id.square17);
        imgGameBoard18 = findViewById(R.id.square18);
        imgGameBoard19 = findViewById(R.id.square19);
        imgGameBoard20 = findViewById(R.id.square20);
        imgGameBoard21 = findViewById(R.id.square21);
        imgGameBoard22 = findViewById(R.id.square22);
        imgGameBoard23 = findViewById(R.id.square23);
        imgGameBoard24 = findViewById(R.id.square24);
        imgView100 = findViewById(R.id.img_100);
        imgView200 = findViewById(R.id.img_200);
        imgView300 = findViewById(R.id.img_300);
        imgView400 = findViewById(R.id.img_400);

        txtCoinsx = findViewById(R.id.txtCoinsx);
        txtTotalCoins = findViewById(R.id.txtTotalCoins);
        txtTurnsLeft = findViewById(R.id.txtTurnsLeft);
        txtScore = findViewById(R.id.txtScore);
        text5 = findViewById(R.id.text5);
        btnSpendOne = findViewById(R.id.btnSpendOne);
        btnSpendTwo = findViewById(R.id.btnSpendTwo);
        btnSpendThree = findViewById(R.id.btnSpendThree);
        btnSpendFour = findViewById(R.id.btnSpendFour);
        btnRollDice = findViewById(R.id.btnRollDice);
        btnRollDice.setOnClickListener(this);
        btnSpendOne.setOnClickListener(this);
        btnSpendTwo.setOnClickListener(this);
        btnSpendThree.setOnClickListener(this);
        btnSpendFour.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.btnRollDice:
                btnRollDice.setEnabled(false);

                randomNumber = backGround.getRandomNumber();
                boardspace = boardspace + randomNumber;
                if (boardspace > 23) {
                    boardspace = boardspace - 23;
                }
                if (totalPoints > scoreboard) {
                    scoreboard = totalPoints;

                    text5.setText("" + totalPoints);
                }




                diceDelay = backGround.getDiceDelay();
                random = backGround.getRandomNumber();
                roll_dice_Animation(500, random);


                txtTurnsLeft.setText("turns left: " + txt_turns_Left);
                boardSpaces();


                break;
            case R.id.btnSpendOne:
                if (intTotalcoins < 50) {

                } else {

                    int[] arrayTimes1 = {R.drawable.ntower1x2, R.drawable.ntower1x3, R.drawable.ntower1x4,
                            R.drawable.ntower1x5, R.drawable.ntower1x6, R.drawable.ntower1x7,
                            R.drawable.ntower1x8};

                    //imgView100.setImageDrawable(getResources().getDrawable(arrayTimes1[currentImageTower1]));
                    imgView100.setBackgroundResource(arrayTimes1[currentImageTower1]);
                    times = times + 1;
                    currentImageTower1 = currentImageTower1 + 1;
                    intTotalcoins = intTotalcoins - 50;
                    if (currentImageTower1 >= arrayTimes1.length) {

                        btnSpendOne.setEnabled(false);
                    }


                    txtCoinsx.setText("coin X" + times);
                    txtTotalCoins.setText("coins : " + intTotalcoins);

                }


                break;
            case R.id.btnSpendTwo:


                if (intTotalcoins < 100) {


                } else {


                    int[] arrayTimes2 = {R.drawable.ntower2x2, R.drawable.ntower2x3, R.drawable.ntower2x4,
                            R.drawable.ntower2x5, R.drawable.ntower2x6, R.drawable.ntower2x7,
                            R.drawable.ntower2x8};

                    int[] currentCoinArray = {3, 3, 3, 3, 3, 5, 5};


                    intTotalcoins = intTotalcoins - 100;
                    imgView200.setBackgroundResource(arrayTimes2[currentImageTower2]);
                    //imgView200.setImageDrawable(getResources().getDrawable(arrayTimes2[currentImageTower2]));
                    times = times + currentCoinArray[currentImageTower2];
                    currentImageTower2 = currentImageTower2 + 1;
                    if (currentImageTower2 == 7) {
                        btnSpendTwo.setEnabled(false);
                    }


                    txtCoinsx.setText("coin X" + times);
                    txtTotalCoins.setText("coins : " + intTotalcoins);

                }
                break;
            case R.id.btnSpendThree:

                if (intTotalcoins < 200) {


                } else {


                    intTotalcoins = intTotalcoins - 200;

                    int[] arrayTimes3 = {R.drawable.ntower3x2, R.drawable.ntower3x3, R.drawable.ntower3x4,
                            R.drawable.ntower3x5, R.drawable.ntower3x6, R.drawable.ntower3x7,
                            R.drawable.ntower3x8};

                    int[] currentCoinArray = {6, 3, 3, 3, 10, 10, 5};

                    intTotalcoins = intTotalcoins - 200;

                    imgView300.setBackgroundResource(arrayTimes3[currentImageTower3]);

                    times = times + currentCoinArray[currentImageTower3];
                    currentImageTower3 = currentImageTower3 + 1;
                    if (currentImageTower3 == 7) {
                        btnSpendThree.setEnabled(false);
                    }


                    txtCoinsx.setText("coin X" + times);
                    txtTotalCoins.setText("coins : " + intTotalcoins);

                }
                break;
            case R.id.btnSpendFour:

                if (intTotalcoins < 400) {


                } else {

                    int[] arrayTimes4 = {R.drawable.ntower4x2, R.drawable.ntower4x3, R.drawable.ntower4x4,
                            R.drawable.ntower4x5, R.drawable.ntower4x6, R.drawable.ntower4x7,
                            R.drawable.ntower4x8};

                    int[] currentCoinArray = {14, 16, 15, 15, 15, 15, 30};

                    intTotalcoins = intTotalcoins - 400;

                    imgView400.setBackgroundResource(arrayTimes4[currentImageTower4]);

                    times = times + currentCoinArray[currentImageTower4];
                    currentImageTower4 = currentImageTower4 + 1;
                    if (currentImageTower4 == 7) {
                        btnSpendFour.setEnabled(false);
                    }
                    txtCoinsx.setText("coin X" + times);
                    txtTotalCoins.setText("coins : " + intTotalcoins);
                    break;

                }


        }

    }

    private void roll_dice_Animation(long mdicedelay, int randomdice) {
        final int ran = randomdice;


        // dicedelay = time delayed before the dice is rolled a second time

        // delays 1000, and runs for 2500 = 3500ms


        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                // random number between 0-5
                final int[] diceAnimation = {R.drawable.img_dice_one, R.drawable.img_dice_two,
                        R.drawable.img_dice_three, R.drawable.img_dice_four,
                        R.drawable.img_dice_five, R.drawable.img_dice_six};
                txt_turns_Left = txt_turns_Left - 1;
                imgDice.setAdjustViewBounds(true);
                imgDice.setLayerType(imgDice.LAYER_TYPE_HARDWARE, null);
                imgDice.setImageDrawable(getResources().getDrawable(diceAnimation[ran]));
                final AnimationDrawable image1anim = (AnimationDrawable) imgDice.getDrawable();

                image1anim.start();

            }

        }, mdicedelay);

    }


    private void boardSpaces() {


        if (longdelay == 0) {
            longdelay = diceDelay + 1400;
        }


        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                millseconds = 500;


                longdelay = millseconds + diceDelay;

                final ImageView board_spaces[] = {imgGameBoard1, imgGameBoard2, imgGameBoard3, imgGameBoard4,
                        imgGameBoard5, imgGameBoard6, imgGameBoard7, imgGameBoard8, imgGameBoard9, imgGameBoard10,
                        imgGameBoard11, imgGameBoard12, imgGameBoard13, imgGameBoard14, imgGameBoard15,
                        imgGameBoard16, imgGameBoard17, imgGameBoard18, imgGameBoard19, imgGameBoard20,
                        imgGameBoard21, imgGameBoard22, imgGameBoard23, imgGameBoard24};


                //int img = backGround.getImage();
                ///imgGameBoard23.setImageDrawable(getResources().getDrawable(img));

                for (int x = 0; x <= backGround.getRandomNumber(); x++) {
                    // time on after each pice moves
                    diceRoll = x;

                    millseconds = millseconds + 500;
                    currentSpace = currentSpace + 1;
                    if (currentSpace == board_spaces.length) {
                        currentSpace = 0;
                    }


                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {

                            rabitcounter++;

                            if (rabitcounter == 24) {
                                board_spaces[23].setImageResource(android.R.color.transparent);
                                rabitcounter = 0;
                                board_spaces[0].setImageDrawable(getResources().getDrawable(R.drawable.cat_pictures3));
                            } else {
                                if (rabitcounter > 0) {
                                    int temp = rabitcounter - 1;
                                    board_spaces[temp].setImageResource(android.R.color.transparent);


                                }
                                board_spaces[rabitcounter].setImageDrawable(getResources().getDrawable(R.drawable.cat_pictures3));
                            }
                            if (diceRoll != backGround.getRandomNumber()) {
                            } else {
                                txtTotalCoins.setText("coins : " + intTotalcoins);
                                btnRollDice.setEnabled(true);
                                if (txt_turns_Left == 0) {
                                    times = 1;
                                    intTotalcoins = 0;
                                    txt_turns_Left = 55;
                                    txtCoinsx.setText("coin X" + times);
                                    txtTotalCoins.setText("coins : " + intTotalcoins);
                                    imgView100.setImageDrawable(getResources().getDrawable(R.drawable.tower50x1));
                                    totalPoints = 0;
                                }
                            }


                        }


                        }, millseconds);

                }

                /*


                 */

                if ((currentSpace == 1) || (currentSpace == 4) || (currentSpace == 7) || (currentSpace == 10) || (currentSpace == 12) || (currentSpace == 17) || (currentSpace == 19) || (currentSpace == 22)) {
                    currentCoins = 1;
                }

                if ((currentSpace == 0) || (currentSpace == 5) || (currentSpace == 11) || (currentSpace == 15) || (currentSpace == 18) || (currentSpace == 20)) {
                    currentCoins = 3;
                }

                if ((currentSpace == 3) || (currentSpace == 6) || (currentSpace == 8) || (currentSpace == 13) || (currentSpace == 16) || (currentSpace == 21)) {
                    currentCoins = 5;
                }

                if ((currentSpace == 2) || (currentSpace == 9) || (currentSpace == 14) || (currentSpace == 23)) {
                    currentCoins = 10;
                }
                intTotalcoins = intTotalcoins + (currentCoins * times);
                totalPoints = totalPoints + (currentCoins * times);
                txtScore.setText("points : " + totalPoints);
                txtCoinsx.setText("coin X" + times);


            }

        }, longdelay);

        }


    }

