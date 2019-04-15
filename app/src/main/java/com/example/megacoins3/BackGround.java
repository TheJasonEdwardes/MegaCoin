package com.example.megacoins3;

import java.util.Random;

public class BackGround {

Random random = new Random();
int randomNumber;
long diceDelay;
int coins;
    int spaceOnBoard;
    int totalCoins ;
public BackGround(){



}

public long getDiceDelay(){
// delay time for the dice finish before counter moving round the board

    randomNumber = random.nextInt(6);
    if (randomNumber == 6){
      randomNumber = 5;
    }


   /** randomNumber =0;

    randomNumber = random.nextInt(1289);
    randomNumber = randomNumber+6;
    if (randomNumber % 6 ==0){
        randomNumber =0;
    }
    if (randomNumber % 6 ==1){
        randomNumber =1;
    }
    if (randomNumber % 6 ==2){
        randomNumber =2;
    }
    if (randomNumber % 6 ==3){
        randomNumber =3;
    }
    if (randomNumber % 6 ==4){
        randomNumber =4;

    }
    if (randomNumber % 6 ==5){
        randomNumber =5;

    }
*/
    switch(randomNumber){
        case 0:
            diceDelay = 2800 ;
            break;
        case 1:
            diceDelay = 2300;
            break;
        case 2:
            diceDelay = 2500;
            break;
        case 3:
            diceDelay = 2700;
            break;
        case 4:
            diceDelay = 2400;
            break;
        case 5:
            diceDelay = 2200;
            break;
    }

    return diceDelay;


}
public int getRandomNumber(){


    return randomNumber;
}
public int GetCoins( int currentSpace ) {

    //spaceOnBoard = spaceOnBoard + (randomNumber+1);

    spaceOnBoard = currentSpace;

    switch (spaceOnBoard) {

        case 0:
            coins = 4;
            break;
        case 1:
            coins = 1;

            break;
        case 2:
            coins = 5;

            break;
        case 3:
            coins = 4;

            break;
        case 4:
            coins = 1;

            break;
        case 5:
            coins = 3;

            break;
        case 6:
            coins = 4;

            break;
        case 7:
            coins = 5;

            break;
        case 8:
            coins = 4;

            break;
        case 9:
            coins = 5;

            break;
        case 10:
            coins = 1;

            break;
        case 11:
            coins = 3;

            break;
        case 12:
            coins = 1;
            break;
        case 13:
            coins = 4;
            break;
        case 14:
            coins = 5;
            break;
        case 15:
            coins = 3;
            break;
        case 16:
            coins = 4;
            break;
        case 17:
            coins = 1;
            break;
        case 18:
             coins = 4;
            break;
        case 19:
            coins = 1;
            break;
        case 20:
            coins = 3;
            break;
        case 21:
            coins = 4;
            break;
        case 22:
            coins = 1;
            break;
        case 23:
            coins = 5;
            break;

    }
    return coins ;
}
public int getTotalCoins(){
    //totalCoins = totalCoins + GetCoins();

    return totalCoins;
}
public int getImage (){
    int img = R.drawable.img_dice_six;


    return img;
}


}
