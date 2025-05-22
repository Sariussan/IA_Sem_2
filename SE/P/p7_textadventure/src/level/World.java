package level;

import java.util.Scanner;

import models.*;
import monster.*;
import exceptions.*;

/**
 * A World with rooms, items and a hero (later on, more can be added)
 */
public class World {

    /** Our hero that visits the world */
    Hero hero;

    /** the current room the hero is in */
    private Room currentRoom;

    /** to fetch keyboard input */
    Scanner inputFetcher;

    /**
     * Constructs a word for a hero
     * 
     * @param hero the hero that walks around in this world
     */
    public World(Hero hero) {
        this.hero = hero;
        this.inputFetcher = new Scanner(System.in);
    }

    /**
     * Set a room as current room, where actions take place
     * 
     * @param r
     */
    public void setCurrentRoom(Room r) {
        currentRoom = r;
    }

    /**
     * Print help for keyboard input
     */
    public void printHelp() {
        System.out.println("u:            Umsehen");
        System.out.println("a:            Gegenstand aufheben");
        System.out.println("i:            Inventar ausgeben");
        System.out.println("l:            Gegenstand ablegen");
        System.out.println("g:            in nächsten Raum gehen.");
    }

    /**
     * Start the text adventure => infinite loop that processes keyboard input and
     * performs actions accordingly
     */
    public void start() {

        while (true) {

            System.out.println("Was möchtest du als nächstes tun (Enter für Hilfe)? ");
            String input = inputFetcher.nextLine();

            if (input.equals("u")) {
                currentRoom.introduceRoom();
                currentRoom.listContent();
            } else if (input.equals("a")) {
                take();
            } else if (input.equals("i")) {
                hero.listInventoryContent();
            } else if (input.equals("l")) {
                put();
            } else if (input.equals("g")) {
                moveToNextRoom();
            } else {
                System.out.println("Ich verstehe dich nicht. Probiere es nochmal.");
                printHelp();
            }
            System.out.println();
        }
    }

    /**
     * go to a new room
     * - first, the user gets asked where to go
     * - a list with all rooms, that can be reached should be listed
     * - input with the number of the room that should be reached should be fetched
     * - fetch the room and go to it (currentRoom = the fetched room),
     * - error handling if invalid input
     * - check to not get stuck in dialogue
     */
    public void moveToNextRoom() {

        System.out.println("Wohin möchtest du gehen? ");
        currentRoom.listAdjacentRooms();
        int roomNumber = inputFetcher.nextInt();
        inputFetcher.nextLine(); // newline
        try {
            Room nextRoom = currentRoom.getAdjacentRoom(roomNumber);
            setCurrentRoom(nextRoom);
            System.out.println("Du bist jetzt in " + currentRoom.getName());
        } catch (NotThereException e) {
            System.out.println("Dieser Raum existiert nicht.");
            return;
        }
    }

    /**
     * pick an item
     * - Ask the user which items are in the room (with running number starting at
     * 0)
     * - getInput, with this input fetch item
     * - this item should be put in the hero's inventory if possible (and removed
     * from the room)
     * - error hanling, if something is wrong
     * - check to not get stuck in dialogue
     */
    public void take() {

        System.out.println("Was möchtest du aufheben? ");
        currentRoom.listContent();

        int itemNumber = inputFetcher.nextInt();
        inputFetcher.nextLine(); // newline
        try {
            InventoryItem item = currentRoom.getItem(itemNumber);
            hero.zuInventarHinzufuegen(item);
            currentRoom.removeItem(item);
            System.out.println("Du hast " + item.getDisplayName() + " aufgehoben.");
        } catch (NotThereException e) {
            System.out.println("Dieser Gegenstand existiert nicht.");
            return;
        } catch (InventoryFullException e) {
            System.out.println("Das Inventar ist voll.");
            return;
        } catch (TooWeakException e) {
            System.out.println("Der Gegenstand ist zu schwer.");
            return;
        }
    }

    /**
     * remove an item
     * - list which items are in the inventory (with running number beginning from
     * 0)
     * - fetch input which item to remove
     * - remove this item
     * - check to not get stuck in dialogue
     */
    public void put() {
        System.out.println("Was möchtest du ablegen? ");
        hero.listInventoryContent();
        int itemNumber = inputFetcher.nextInt();
        inputFetcher.nextLine(); // newline
        try {
            InventoryItem item = hero.getInventoryItem(itemNumber);
            currentRoom.addItem(item);
            hero.removeInventoryItem(item);
            System.out.println("Du hast " + item.getDisplayName() + " abgelegt.");
        } catch (NotThereException e) {
            System.out.println("Dieser Gegenstand existiert nicht.");
            return;
        }
    }
}
