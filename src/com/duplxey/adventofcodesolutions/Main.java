package com.duplxey.adventofcodesolutions;

import com.duplxey.adventofcodesolutions.challenge.Challenge;
import com.duplxey.adventofcodesolutions.challenge.ChallengeManager;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ChallengeManager challengeManager = new ChallengeManager();
        Scanner scanner = new Scanner(System.in);

        System.out.println("AdventOfCode | solutions by duplxey");
        System.out.println("Pick a challenge: ");
        if (challengeManager.getChallenges().size() == 0) {
            System.out.println("Ouch, there are no challenges registered.");
        } else {
            for (Challenge challenge : challengeManager.getChallenges().values()) {
                System.out.println(challenge.getIndex() + ") day " + challenge.getIndex());
            }
        }
        int selected = 0;
        try {
            selected = scanner.nextInt();
        } catch (NumberFormatException e) {
            System.out.println("Selection could not be converted to an integer.");
        }
        Challenge challenge = challengeManager.getChallenge(selected);
        if (!challenge.hasInput()) {
            System.out.println("That challenge has no input. Please add it to: /input/challenge" + selected + ".txt.");
        } else {
            System.out.println("Day " + selected + " solution1: " + challenge.getSolution1());
            System.out.println("Day " + selected + " solution2: " + challenge.getSolution2());
        }
    }
}
