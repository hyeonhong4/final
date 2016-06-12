import java.util.*;
public class BigTemple extends Player{
  public BigTemple(String name,int money, int zen,int day,int end){
    super(name,money,zen,day,end);
    bigtemple(this);
    }
    
  

  public void bigtemple(Player x){
  while(x.day<=30 && end==2){
    if(x.zen>=100){
    System.out.println("Congrats, you became a master monk in "+x.day+" turns.");
    x.end++;
      break;}
    if(x.day==30){
      System.out.println("You ran out of money before becoming a master in 30 turns.");
      break;}
    Loop(x);
    while(x.end==2){
      Scanner player_number = new Scanner(System.in);
      System.out.print("");
      int player_choice = player_number.nextInt();
      if (player_choice<=4 && player_choice >0){
        if (player_choice==1){
          x.zen=x.zen+1;
        }
        else if (player_choice==2){
          x.money=x.money-10;
          x.zen=x.zen+5;
        }
        else if (player_choice==3){
          x.money=x.money+50;
          x.zen=x.zen-30;
        }
        else if (player_choice==4){
          System.out.println("You not buy new Temple");
        }
        else{
          continue;}
      }
      System.out.println("Collecting from all temples...");
      System.out.println("Collecting $15 and 5 Zen");
      System.out.println("Done collecting from temples...");       
      break;
    }
  x.day++;
  x.money=x.money+15;
  x.zen=x.zen+5;
  }
}
}