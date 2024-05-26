package src.observer.party.before;

import src.observer.party.before.characters.Doorman;
import src.observer.party.before.characters.Wife;

public class Client {

    public static void main(String[] args) {
        Doorman doorman = new Doorman();
        Wife wife = new Wife(doorman);

        wife.startPartyIfPossible();

        System.out.println("5 minutes later...");
        wife.startPartyIfPossible();

        System.out.println("5 minutes later...");
        wife.startPartyIfPossible();

        System.out.println("5 minutes later...");
        wife.startPartyIfPossible();

        System.out.println("5 minutes later...");
        wife.startPartyIfPossible();

        System.out.println("Husband is coming");
        doorman.setStatus(true);

        System.out.println("5 minutes later...");
        wife.startPartyIfPossible();
    }
}
