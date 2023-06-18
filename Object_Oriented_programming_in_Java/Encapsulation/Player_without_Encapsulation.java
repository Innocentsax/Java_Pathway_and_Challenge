package Encapsulation;

public class Player_without_Encapsulation {
    public String name;
    public int health;
    public String weapon;

    public void loseHealth(int damage){
        health -= damage;
        if(health < 0){
            System.out.println("Player knocked out of game");
        }
    }

    public int healthRemaining(){
        return health;
    }

    public void restoreHealth(int extraHealth){
        health += extraHealth;
        if (health > 100){
            System.out.println("Player restored to 100%");
            health = 100;
        }
    }
}
