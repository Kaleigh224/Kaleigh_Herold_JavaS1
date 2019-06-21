public class Character {
//    name
    private String name;
//    * strength
    private int strength;
//    * health
    private int health;
//    * stamina
    private int stamina
//    * speed
    private int speed;
    //    * attackPower
    private int attackPower;

    public Character(String name, int strength, int health, int stamina, int speed, int attackPower) {
        this.name = name;
        this.strength = strength;
        this.health = health;
        this.stamina = stamina;
        this.speed = speed;
        this.attackPower = attackPower;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }



//    run
    public void run() {

    }
//     attack
    public void attack() {

    }
//     heal
    public void heal() {

    }
//     decreaseHealth
    public void decreaseHealth() {

    }
//     increaseStamina
    public void increaseStamina() {

    }
//     decreaseStamina
    public void decreaseStamina() {

    }
}
