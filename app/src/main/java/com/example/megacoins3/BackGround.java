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

    public int GetCoins(int currentSpace) {

        //spaceOnBoard = spaceOnBoard + (randomNumber+1);

        spaceOnBoard = currentSpace;

        // coin 1 = (spaceOnBoard) 1,4,10,12,17,19 (single coin img)
        if (spaceOnBoard == 1 || spaceOnBoard == 4 || spaceOnBoard == 10 || spaceOnBoard == 12 || spaceOnBoard == 17 || spaceOnBoard == 19) {
            coins = 100;
        }
        //coin 3 = (spaceOnBoard) 5,11,15,20 (3 gold bars)
        if (spaceOnBoard == 5 || spaceOnBoard == 11 || spaceOnBoard == 15 || spaceOnBoard == 20) {
            coins = 300;
        }
        //coin value 4 = (spaceOnBoard) 0,3,6,8,13,16,18,21 (dimond img)
        if (spaceOnBoard == 0 || spaceOnBoard == 3 || spaceOnBoard == 6 || spaceOnBoard == 8 || spaceOnBoard == 13 || spaceOnBoard == 16 || spaceOnBoard == 18 || spaceOnBoard == 21) {
            coins = 400;
        }
        // coin 5 = (spaceOnBoard) 2,7,9,14,23 (chest img)
        if (spaceOnBoard == 2 || spaceOnBoard == 7 || spaceOnBoard == 9 || spaceOnBoard == 14 || spaceOnBoard == 23
        ) {
            coins = 500;


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
