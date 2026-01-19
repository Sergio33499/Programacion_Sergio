package Tema4;

public class Hero {
    private static final int POTION_HEAL = 10;
    private static final int REST_HEAL = 50;
    private static final int EXPERIENCE_PER_ATTACK = 10;
    private static final int EXPERIENCE_TO_LEVEL_UP = 50;
    private static final int DEFAULT_DAMAGE = 10;
    private static final int LEVEL_UP_HEALTH = 5;
    private static final int LEVEL_UP_ATTACK = 1;
    private static final int LEVEL_UP_DEFENSE = 1;

    private String name;
    private int level;
    private int health;
    private int maxHealth;
    private int experience;
    private int attack;
    private int defense;

    public Hero(String name, int level, int maxHealth, int attack, int defense){
        this.name = name;
        this.level = level;
        this.maxHealth = maxHealth;
        this.health = maxHealth;
        this.experience = 0;
        this.attack = attack;
        this.defense = defense;
    }

    public int getHealth() {
        return health;
    }

    public String getName() {
        return name;
    }

    public void drinkPotion(){
        health += POTION_HEAL;
        if (health > maxHealth){
            health = maxHealth;
        }
        System.out.println(name + " ha bebido una poción y ahora tiene " + health + " de salud.");
    }

    public void rest() {
        health += REST_HEAL;
        if (health > maxHealth) {
            health = maxHealth;
        }
        System.out.println(name + " ha descansado y ahora tiene " + health + " de salud.");
    }

    public void attack(Hero target) {
        int damage = Math.max(attack - target.defense, DEFAULT_DAMAGE);
        target.health -= damage;
        if (target.health < 0) {
            target.health = 0;
        }
        System.out.println(name + " ataca a " + target.name + " causando " + damage + " de daño.");
        gainExperience(EXPERIENCE_PER_ATTACK);
    }

    private void gainExperience(int exp) {
        experience += exp;
        System.out.println(name + " gana " + exp + " de experiencia (total: " + experience + ").");

        while (experience >= EXPERIENCE_TO_LEVEL_UP) {
            levelUp();
            experience -= EXPERIENCE_TO_LEVEL_UP;
        }
    }

    public void levelUp() {
        level++;
        maxHealth += LEVEL_UP_HEALTH;
        health += LEVEL_UP_HEALTH;
        attack += LEVEL_UP_ATTACK;
        defense += LEVEL_UP_DEFENSE;
        System.out.println(name + " sube al nivel " + level + "!");
    }


    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", level=" + level +
                ", health=" + health +
                "/" + maxHealth +
                ", experience=" + experience +
                ", attack=" + attack +
                ", defense=" + defense +
                '}';
    }

    public static void main(String[] args){
        Hero hero1 = new Hero("Paco", 1,100,50,30);
        Hero hero2 = new Hero("Pepe", 1,100,35,40);

        System.out.println(hero1);
        System.out.println(hero2);

        hero1.drinkPotion();
        hero2.rest();

        for (int i = 0; i < 5; i++) {
            hero1.attack(hero2);
        }

        System.out.println(hero1);
        System.out.println(hero2);
    }
}
