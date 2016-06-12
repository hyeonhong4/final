import java.util.*;
public class Temple{
  public static void main(String[] args){
    int game_loop=1;
    while(game_loop==1){
    int zen=0;
    int money=100;
    int day=1;
    int end=0;
    Scanner player = new Scanner(System.in);
    System.out.println("What Your name?");
    String name = player.nextLine();
    System.out.println("Boss: "+name+" you were a good worker, I am sad you are leaving the company. Good luck on becoming a monk.");
    System.out.println("Boss: "+name+" you get 30day.");
    temple_ p1 = new temple_(name,money,zen,day,end);
    System.out.println("Game Over");
    Scanner tem = new Scanner(System.in);
    System.out.println("ReGmae? < Press 1");
    game_loop = tem.nextInt();
    
    
    }
  }
}