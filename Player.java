import java.util.*;
public class Player{
  String name;
  int money;
  int zen;
  int end;
  int day;
  public Player(String name,int money, int zen,int day,int end){
    this.name = name;
    this.money=money;
    this.zen=zen;
    this.end=end;
    this.day=day;
  }
  public static void Loop(Player x){
    System.out.println(x.day+"Days");
    System.out.println("You have $"+x.money+" and "+x.zen+" Zen points");
    System.out.println("What would you like to do?");
    System.out.println("Meditate 0$ -> Press 1");
    System.out.println("Help Someone -10$ -> Press 2");
    System.out.println("Work at Company +$50, -30 Zen -> Press 3");
    System.out.println("Purchase Temple -> Press 4");
  }
}
