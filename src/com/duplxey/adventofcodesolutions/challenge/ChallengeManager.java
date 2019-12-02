package com.duplxey.adventofcodesolutions.challenge;

import java.io.File;
import java.util.HashMap;

public class ChallengeManager {

    private File inputDirectory;
    private HashMap<Integer, Challenge> challenges = new HashMap<>();

    public ChallengeManager() {
        init();

        // Register the challenges
        new ChallengeRegister(this);
    }

    private void init() {
        inputDirectory = new File("input");
        if (!inputDirectory.exists()) {
            if (inputDirectory.mkdir()) {
                System.out.println("Directory 'input' has been successfully created.");
            } else {
                System.out.println("Directory 'input' creation failed.");
            }
        }
    }

    public void register(Challenge challenge) {
        challenges.put(challenge.getIndex(), challenge);
    }

    public void unregister(int index) {
        challenges.remove(index);
    }

    public Challenge getChallenge(int index) {
        return challenges.get(index);
    }

    public HashMap<Integer, Challenge> getChallenges() {
        return challenges;
    }

    public File getInputDirectory() {
        return inputDirectory;
    }
}
