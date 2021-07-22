package play;

import character.*;
import room.*;

import java.util.Scanner;

public class Play {

    public EncounterRoom encounterRoom;
    public Barbarian barbarian;
    public BossyMcBossFace bossyMcBossFace;
    public Cleric cleric;
    public Dwarf dwarf;
    public Elf elf;
    public Knight knight;
    public Ogre ogre;
    public Orc orc;
    public Warlock warlock;
    public Wizard wizard;

    public Play(EncounterRoom encounterRoom, Barbarian barbarian, BossyMcBossFace bossyMcBossFace, Cleric cleric, Dwarf dwarf, Elf elf, Knight knight, Ogre ogre, Orc orc, Warlock warlock, Wizard wizard) {
        this.encounterRoom = encounterRoom;
        this.barbarian = barbarian;
        this.bossyMcBossFace = bossyMcBossFace;
        this.cleric = cleric;
        this.dwarf = dwarf;
        this.elf = elf;
        this.knight = knight;
        this.ogre = ogre;
        this.orc = orc;
        this.warlock = warlock;
        this.wizard = wizard;
    }

    public static void main(String[] args) throws InterruptedException {

        EncounterRoom encounterRoom = new EncounterRoom();
        Barbarian barbarian = new Barbarian(80, 40);
        BossyMcBossFace bossyMcBossFace = new BossyMcBossFace(500, 500);
        Cleric cleric = new Cleric(50, 50);
        Dwarf dwarf = new Dwarf(75, 30);
        Elf elf = new Elf(80, 50);
        Knight knight = new Knight(100, 40);
        Ogre ogre = new Ogre(100, 50);
        Orc orc = new Orc(20, 30);
        Orc orc2 = new Orc(20, 30);
        Warlock warlock = new Warlock(80, 60);
        Wizard wizard = new Wizard(90, 50);

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Adventure Call. My name is FalconHoof, and I will be your guide on your quest.\n");
        Thread.sleep(2000);
        System.out.println("You awaken in a darkened cellar, unsure of your surroundings. To your right, another prisoner.\n");
        Thread.sleep(2000);
        System.out.println("'Who are you??' Asks the prisoner\n");
        Thread.sleep(2000);
        System.out.println("Choose your class");
        System.out.println("'barbarian'  'cleric'  'dwarf'  'elf'  'knight'  'warlock'  'wizard'");
        String playerClass = sc.nextLine();
        if (playerClass.equals("barbarian")){
            encounterRoom.addPlayerToRoom(barbarian);
        } else if (playerClass.equals("cleric")){
            encounterRoom.addPlayerToRoom(cleric);
        } else if (playerClass.equals("dwarf")){
            encounterRoom.addPlayerToRoom(dwarf);
        } else if (playerClass.equals("elf")){
            encounterRoom.addPlayerToRoom(elf);
        } else if (playerClass.equals("knight")){
            encounterRoom.addPlayerToRoom(knight);
        } else if (playerClass.equals("warlock")){
            encounterRoom.addPlayerToRoom(warlock);
        } else if (playerClass.equals("wizard")){
            encounterRoom.addPlayerToRoom(wizard);
        };
        System.out.println("\nHello traveller, you have chosen to be a " + playerClass + ".\n");
        Thread.sleep(2000);
        System.out.println("STATS:\n");
        System.out.println("HP: " + encounterRoom.getRoomPlayers().get(0).getHealth() + "\n");
        System.out.println("WEAPON: " + encounterRoom.getRoomPlayers().get(0).getWeapons().get(0).getName() + "\n");
        System.out.println("DAMAGE: " + encounterRoom.getRoomPlayers().get(0).getWeapons().get(0).getDamage() + "\n");

        Thread.sleep(2000);

        System.out.println("You ask your cellmate to identify themselves. You hear a whisper from the corner.\n\nWhat did they say, traveller?\n");
        Thread.sleep(2000);
        System.out.println("Choose your new friend's class");
        System.out.println("'barbarian'  'cleric'  'dwarf'  'elf'  'knight'  'warlock'  'wizard'");
        String player2Class = sc.nextLine();
        if (player2Class.equals("barbarian")){
            encounterRoom.addPlayerToRoom(barbarian);
        } else if (player2Class.equals("cleric")){
            encounterRoom.addPlayerToRoom(cleric);
        } else if (player2Class.equals("dwarf")){
            encounterRoom.addPlayerToRoom(dwarf);
        } else if (player2Class.equals("elf")){
            encounterRoom.addPlayerToRoom(elf);
        } else if (player2Class.equals("knight")){
            encounterRoom.addPlayerToRoom(knight);
        } else if (player2Class.equals("warlock")){
            encounterRoom.addPlayerToRoom(warlock);
        } else if (player2Class.equals("wizard")){
            encounterRoom.addPlayerToRoom(wizard);
        };
        System.out.println("\nYou see a " + player2Class + " rise from the shadows.");
        Thread.sleep(2000);
        System.out.println("STATS:\n");
        System.out.println("HP: " + encounterRoom.getRoomPlayers().get(1).getHealth() + "\n");
        System.out.println("WEAPON: " + encounterRoom.getRoomPlayers().get(1).getWeapons().get(0).getName() + "\n");
        System.out.println("DAMAGE: " + encounterRoom.getRoomPlayers().get(1).getWeapons().get(0).getDamage() + "\n");
        Thread.sleep(2000);
        System.out.println("Your sense of curiosity leads you towards the cell door, hanging on by just a thread.\n\n");
        Thread.sleep(2000);
        System.out.println("There must have been an attack...\n\n");
        Thread.sleep(2000);
        System.out.println("You grab the " + player2Class + " and cautiously navigate into the open dungeon. \n\n\n");
        Thread.sleep(2000);
        System.out.println("You see 2 figures approach in the smoke.\n\n");
        Thread.sleep(2000);

        encounterRoom.addEnemyToRoom(orc);
        encounterRoom.addEnemyToRoom(orc2);

        PlayableCharacter p1 = encounterRoom.getRoomPlayers().get(0);
        PlayableCharacter p2 = encounterRoom.getRoomPlayers().get(1);
        PlayableCharacter e1 = encounterRoom.getRoomEnemies().get(0);
        PlayableCharacter e2 = encounterRoom.getRoomEnemies().get(1);

        System.out.println("The smoke renders, with 2 Orcs approaching you. Time to live up to that famous " + playerClass + " reputation.\n\n");

        Thread.sleep(2000);


        while(e1.getHealth() > 0 || e2.getHealth() > 0) {

            System.out.println("Would you like to attack or block?\n\n");
            System.out.println("'attack'  'block'\n\n");
            String playerAttackChoice = sc.nextLine();

            if (playerAttackChoice.equals("attack")) {
                System.out.println("Who would you like to target?\n\n");
                System.out.println("1: '" + e1.getClass().getSimpleName() + "'  \n2: '" + e2.getClass().getSimpleName() + "'\n");
                String playerAttackTarget = sc.nextLine();
                if (playerAttackTarget.equals("1")) {
                    encounterRoom.attack(p1, e1);
                    System.out.println("You smack the " + e1.getClass().getSimpleName() + " for " + p1.getWeapons().get(0).getDamage() + " damage.\n\n Leaving the " + e1.getClass().getSimpleName() + " on " + e1.getHealth() + " hit points.\n\n");
                } else if (playerAttackTarget.equals("2")) {
                    encounterRoom.attack(p1, e2);
                    System.out.println("You smack the " + e2.getClass().getSimpleName() + " for " + p1.getWeapons().get(0).getDamage() + " damage.\n\n Leaving the " + e2.getClass().getSimpleName() + " on " + e2.getHealth() + " hit points.\n\n");
                }
            } else if (playerAttackChoice.equals("block")) {
                System.out.println("You brace yourself...\\n");
            }
            if (playerAttackChoice.equals("attack")) {
                encounterRoom.attack(e1, p1);
                encounterRoom.attack(e2, p2);
                Thread.sleep(2000);
                System.out.println("You get attacked.\n\n");
                Thread.sleep(2000);
                System.out.println("Your HP is " + p1.getHealth() + ".\n");
                System.out.println("Your " + p2.getClass().getSimpleName() + "'s HP is " + p2.getHealth() + ".\n");
                Thread.sleep(2000);
            }

            System.out.println("Would you like your " + p2.getClass().getSimpleName() + " to attack or block?\n\n");
            System.out.println("'attack'  'block'\n\n");
            String player2AttackChoice = sc.nextLine();

            if (player2AttackChoice.equals("attack")) {
                System.out.println("What would you like your " + p2.getClass().getSimpleName() + " to target?\n\n");
                System.out.println("1: '" + e1.getClass().getSimpleName() + "'  \n2: '" + e2.getClass().getSimpleName() + "'\n");
                String player2AttackTarget = sc.nextLine();
                if (player2AttackTarget.equals("1")) {
                    encounterRoom.attack(p1, e1);
                    System.out.println("You smack the " + e1.getClass().getSimpleName() + " for " + p1.getWeapons().get(0).getDamage() + " damage.\n\n Leaving the " + e1.getClass().getSimpleName() + " on " + e1.getHealth() + " hit points.\n\n");
                } else if (player2AttackTarget.equals("2")) {
                    encounterRoom.attack(p1, e2);
                    System.out.println("You smack the " + e2.getClass().getSimpleName() + " for " + p1.getWeapons().get(0).getDamage() + " damage.\n\n Leaving the " + e2.getClass().getSimpleName() + " on " + e2.getHealth() + " hit points.\n\n");
                }
            } else if (player2AttackChoice.equals("block")) {
                System.out.println("You brace yourself...\\n");
            }
            if (player2AttackChoice.equals("attack")) {

                if(encounterRoom.isEnemyDead(e1)){
                    System.out.println(e1.getClass().getSimpleName() + "is dead!!");
                    encounterRoom.attack(e2, p2);
                } else if (encounterRoom.isEnemyDead(e2)){
                    System.out.println(e2.getClass().getSimpleName() + "is dead!");
                    encounterRoom.attack(e1, p1);
                } else {
                    encounterRoom.attack(e1, p1);
                    encounterRoom.attack(e2, p2);
                };
                System.out.println("You get attacked.\n\n");
                Thread.sleep(2000);
                System.out.println("Your HP is " + p1.getHealth() + ".\n");
                System.out.println("Your " + p2.getClass().getSimpleName() + "'s HP is " + p2.getHealth() + ".\n");
            }


            ;
        }
        System.out.println("Room cleared!!");
    }
}

