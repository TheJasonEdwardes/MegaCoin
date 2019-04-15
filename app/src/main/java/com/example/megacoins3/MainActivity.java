package com.example.megacoins3;

import android.app.Activity;
import android.graphics.drawable.AnimationDrawable;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;

import java.util.Random;







public class MainActivity extends Activity implements View.OnClickListener {
    int rabitcounter = 0;
    int currentImageTower1;
    int currentImageTower2;
    int currentImageTower3;
    int currentImageTower4;
    int diceRoll;
    int randomNumber;
    int boardspace = 0;
    int intTotalcoins =0 ;
    int scoreboard =0;
    BackGround backGround = new BackGround();
    int times = 1;
    int totalPoints=0;
    int currentSpace =0;
    int currentCoins ;
    long diceDelay;
    long millseconds, longdelay;
    int txt_turns_Left = 55;
    int random;
Level tower1_level1 = new Level(1,2,3,4,5,6,7,50);
    ImageView imgGameBoard1, imgGameBoard2, imgGameBoard3, imgGameBoard4, imgGameBoard5, imgGameBoard6, imgGameBoard7,
            imgGameBoard8, imgGameBoard9, imgGameBoard10, imgGameBoard11, imgGameBoard12, imgGameBoard13, imgGameBoard14,
            imgGameBoard15, imgGameBoard16, imgGameBoard17, imgGameBoard18, imgGameBoard19, imgGameBoard20, imgGameBoard21,
            imgGameBoard22, imgGameBoard23, imgGameBoard24;
    ImageView imgDice, imgView100, imgView200, imgView300, imgView400;
    ImageView btnRollDice, btnSpendOne, btnSpendTwo, btnSpendThree, btnSpendFour;
    TextView txtCoinsx, txtTotalCoins, txtTurnsLeft, txtScore,text5;

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
                if(totalPoints > scoreboard){
                    scoreboard = totalPoints;

                    text5.setText(""+ totalPoints);
                }

                //imgDice.setImageDrawable(getResources().getDrawable(R.drawable.mdice_five));
                //random = random_dice_roll.nextInt(5);


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

                    imgView100.setImageDrawable(getResources().getDrawable(arrayTimes1[currentImageTower1]));
                    times = times + 1;
                    currentImageTower1 = currentImageTower1 + 1;
                    intTotalcoins = intTotalcoins - 50;
                    if (currentImageTower1 >= arrayTimes1.length){

                        btnSpendOne.setEnabled(false);
                    }



                        txtCoinsx.setText("coin X" + times);
                        txtTotalCoins.setText("coins : " + intTotalcoins);

                }


                break;
                case R.id.btnSpendTwo:







                    if (intTotalcoins < 100) {


                } else {
                    currentImageTower2 = currentImageTower2 + 1;

                        intTotalcoins = intTotalcoins - 100;

                        int[] arrayTimes2 = {R.drawable.ntower2x2, R.drawable.ntower2x3, R.drawable.ntower2x4,
                                R.drawable.ntower2x5, R.drawable.ntower2x6, R.drawable.ntower2x7,
                                R.drawable.ntower2x8};

                        switch (currentImageTower2) {
                            case 1:
                                imgView200.setImageDrawable(getResources().getDrawable(arrayTimes2[0]));
                                times = times + 3;
                                break;
                            case 2:
                                imgView200.setImageDrawable(getResources().getDrawable(arrayTimes2[1]));
                                times = times + 3;
                                break;
                            case 3:
                                times = times + 3;
                                imgView200.setImageDrawable(getResources().getDrawable(arrayTimes2[2]));
                                break;
                            case 4:
                                times = times + 3;
                                imgView200.setImageDrawable(getResources().getDrawable(arrayTimes2[3]));
                                break;
                            case 5:
                                times = times + 3;
                                imgView200.setImageDrawable(getResources().getDrawable(arrayTimes2[4]));
                                break;
                            case 6:
                                times = times + 5;
                                imgView200.setImageDrawable(getResources().getDrawable(arrayTimes2[5]));
                                break;

                            case 7:
                                times = times + 5;
                                imgView200.setImageDrawable(getResources().getDrawable(arrayTimes2[6]));
                                btnSpendTwo.setEnabled(false);

                                break;


                        }
                        txtCoinsx.setText("coin X" + times);
                        txtTotalCoins.setText("coins : " + intTotalcoins);

                }
                    break;
            case R.id.btnSpendThree:

                if (intTotalcoins < 200) {


                } else {
                    currentImageTower3 = currentImageTower3 + 1;

                        intTotalcoins = intTotalcoins - 200;

                        int[] arrayTimes3 = {R.drawable.ntower3x2, R.drawable.ntower3x3, R.drawable.ntower3x4,
                                R.drawable.ntower3x5, R.drawable.ntower3x6, R.drawable.ntower3x7,
                                R.drawable.ntower3x8};

                        switch (currentImageTower3) {
                            case 1:
                                imgView300.setImageDrawable(getResources().getDrawable(arrayTimes3[0]));
                                times = times + 6;
                                break;
                            case 2:
                                imgView300.setImageDrawable(getResources().getDrawable(arrayTimes3[1]));
                                times = times + 3;
                                break;
                            case 3:
                                times = times + 3;
                                imgView300.setImageDrawable(getResources().getDrawable(arrayTimes3[2]));
                                break;
                            case 4:
                                times = times + 3;
                                imgView300.setImageDrawable(getResources().getDrawable(arrayTimes3[3]));
                                break;
                            case 5:
                                times = times + 10;
                                imgView300.setImageDrawable(getResources().getDrawable(arrayTimes3[4]));
                                break;
                            case 6:
                                times = times + 10;
                                imgView300.setImageDrawable(getResources().getDrawable(arrayTimes3[5]));
                                break;

                            case 7:
                                times = times + 5;
                                imgView300.setImageDrawable(getResources().getDrawable(arrayTimes3[6]));
                                btnSpendThree.setEnabled(false);

                                break;


                        }
                        txtCoinsx.setText("coin X" + times);
                        txtTotalCoins.setText("coins : " + intTotalcoins);

                }
                break;
            case R.id.btnSpendFour:

                if (intTotalcoins < 400) {


                } else {
                    currentImageTower4 = currentImageTower4 + 1;

                        intTotalcoins = intTotalcoins - 400;

                        int[] arrayTimes4 = {R.drawable.ntower4x2, R.drawable.ntower4x3, R.drawable.ntower4x4,
                                R.drawable.ntower4x5, R.drawable.ntower4x6, R.drawable.ntower4x7,
                                R.drawable.ntower4x8};

                        switch (currentImageTower4) {
                            case 1:
                                imgView400.setImageDrawable(getResources().getDrawable(arrayTimes4[0]));
                                times = times + 14;
                                break;
                            case 2:
                                imgView400.setImageDrawable(getResources().getDrawable(arrayTimes4[1]));
                                times = times + 16;
                                break;
                            case 3:
                                times = times + 15;
                                imgView400.setImageDrawable(getResources().getDrawable(arrayTimes4[2]));
                                break;
                            case 4:
                                times = times + 15;
                                imgView400.setImageDrawable(getResources().getDrawable(arrayTimes4[3]));
                                break;
                            case 5:
                                times = times + 15;
                                imgView400.setImageDrawable(getResources().getDrawable(arrayTimes4[4]));
                                break;
                            case 6:
                                times = times + 15;
                                imgView400.setImageDrawable(getResources().getDrawable(arrayTimes4[5]));
                                break;

                            case 7:
                                times = times + 30;
                                imgView400.setImageDrawable(getResources().getDrawable(arrayTimes4[6]));
                                btnSpendFour.setEnabled(false);

                                break;


                        }
                        txtCoinsx.setText("coin X" + times);
                        txtTotalCoins.setText("coins : " + intTotalcoins);
                    }

                break;

        }


    }


        //private void roll_dice_Animation(long mdicedelay, int randomdice) {
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
                txt_turns_Left = txt_turns_Left -1;
                imgDice.setAdjustViewBounds(true);
                imgDice.setLayerType(imgDice.LAYER_TYPE_HARDWARE, null);
                imgDice.setImageDrawable(getResources().getDrawable(diceAnimation[ran]));
                final AnimationDrawable image1anim = (AnimationDrawable) imgDice.getDrawable();

                image1anim.start();

            }

        }, mdicedelay);

    }
    private void boardSpaces() {


        if (longdelay == 0){
            longdelay =diceDelay + 1400;
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
                    currentSpace = currentSpace+1;
                    if (currentSpace == board_spaces.length){
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

                if ( (currentSpace == 1 )|| (currentSpace ==4) || (currentSpace ==7)||(currentSpace ==10)||(currentSpace ==12)||(currentSpace ==17)||(currentSpace ==19)||(currentSpace ==22)) {
                    currentCoins = 1;
                }

                if ((currentSpace == 0) ||(currentSpace == 5) || (currentSpace == 11 )|| (currentSpace ==15) ||(currentSpace == 18)||(currentSpace ==20)){
                    currentCoins = 3;
                }

                if ((currentSpace == 3) || (currentSpace == 6 )|| (currentSpace ==8) || (currentSpace == 13)||(currentSpace == 16)||(currentSpace ==21)){
                    currentCoins = 5;
                }

                if ((currentSpace == 2) || (currentSpace == 9 )|| (currentSpace ==14) || (currentSpace ==23)) {
                    currentCoins = 10;
                }
                intTotalcoins = intTotalcoins +(currentCoins * times);
                totalPoints = totalPoints + (currentCoins * times);
                txtScore.setText("points : "+ totalPoints);
                txtCoinsx.setText("coin X"+times);



            }

        },longdelay);

        }
    public void getpoints(Level level_tower, int idtower1,int idtower2,int idtower3,int idtower4,
                          int idtower5, int idtower6,int idtower7,int idintbtn){


        // return a number
        int tower1 = level_tower.getTower1();
        int tower2 = level_tower.getTower2();
        int tower3 = level_tower.getTower3();
        int tower4 = level_tower.getTower4();
        int tower5 = level_tower.getTower5();
        int tower6 = level_tower.getTower6();
        int tower7 = level_tower.getTower7();
        int idbtn = idintbtn;
        int id1 = idtower1;
        int id2 = idtower2;
        int id3 = idtower3;
        int id4 = idtower4;
        int id5 = idtower5;
        int id6 = idtower6;
        int id7 = idtower7;


        ((TextView)findViewById(id1)).setText("X"+tower1);
        ((TextView)findViewById(id2)).setText("X"+tower2);
        ((TextView)findViewById(id3)).setText("X"+tower3);
        ((TextView)findViewById(id4)).setText("X"+tower4);
        ((TextView)findViewById(id5)).setText("X"+tower5);
        ((TextView)findViewById(id6)).setText("X"+tower6);
        ((TextView)findViewById(id7)).setText("X"+tower7);
        ((TextView)findViewById(idbtn)).setText(""+idintbtn);
    }







}

