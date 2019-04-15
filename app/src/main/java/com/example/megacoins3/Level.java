package com.example.megacoins3;

public class Level {
    int tower1, tower2, tower3, tower4, tower5, tower6, tower7, btn;


    // sets the towers x value

    public Level(int tower1,int tower2,int tower3,int tower4,int tower5,int tower6,int tower7,int btn){

        this.tower1 = tower1;
        this.tower2 = tower2;
        this.tower3 = tower3;
        this.tower4 = tower4;
        this.tower5 = tower5;
        this.tower6 = tower6;
        this.tower7 = tower7;
        this.btn = btn;
      }
        public int getTower1(){
        return tower1;
    }
    public int getTower2(){
        return tower2;
    }
    public int getTower3(){
        return tower3;
    }
    public int getTower4(){
        return tower4;
    }
    public int getTower5(){
        return tower5;
    }
    public int getTower6(){
        return tower6;
    }
    public int getTower7(){
        return tower7;
    }
    public int getbtn(){
        return btn;
    }
}
