import java.util.Scanner;
import java.util.Random;

public class ROCKPAPER{
    public static void main(String[] args){
    Scanner player=new Scanner(System.in);
    System.out.println("ROCK,PAPER,SCISSORS");
    int g=0,p1=0,p2=0,x,y;
    do{
    System.out.println("PLAYER 1:CHOOSE A NUMBER");
    System.out.println("1.ROCK\n2.PAPER \n3.SCISSORS");
    x=player.nextInt();
    Random pc=new Random();
    y=pc.nextInt(1,4);
    System.out.println("You choose" + x +"\nPC choose "+ y);
    if(x==y){
        System.out.println("PC :"+p2+"\nYou:"+p1);
    }
    else if (x==1 && y==2 || x==2 && y==3 || x==3 && y==1){
        p2+=1;
        System.out.println("PC :"+p2+"\nYou:"+p1);
    }
    else if(x==1 && y==3|| x==2 && y==1 || x==3 && y==2){
        p1+=1;
        System.out.println("PC :"+p2+"\nYou:"+p1); 
    }
    else if (x>4) {
        System.out.println("INVALID CHOICE");  
    }
    g++;
    }while(g!=3);
    if (p1>p2) {
        System.out.println("CONTRATZ YOU WON");
    }
    else if (p1<p2) {
        System.out.println("TRY AGAIN LATER");
    }
    else{
        System.out.println("DRAW");
    }
    }}
