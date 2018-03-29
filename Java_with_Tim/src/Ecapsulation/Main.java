package Ecapsulation;

public class Main {

    public static void main(String[] args) {

/*    Player player = new Player();
    player.name = "Tim";
    player.health = 20;
    player.weapon = "Sword";

    int dameage = 10;

    player.loseHealth(dameage);
        System.out.println("Remaining health = "+ player.healthRemaining());*/

EnchencedPlayer player = new EnchencedPlayer("Tim",50,"Sword");
        System.out.println("Initial health is " + player.getHealth());





    }
}
