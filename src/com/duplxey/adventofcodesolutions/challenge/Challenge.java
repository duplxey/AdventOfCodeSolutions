package com.duplxey.adventofcodesolutions.challenge;

import com.duplxey.adventofcodesolutions.util.FileUtil;

import java.io.File;
import java.io.IOException;

public abstract class Challenge {

    private ChallengeManager challengeManager;
    private int index;

    private String input;

    public Challenge(ChallengeManager challengeManager, int index) {
        this.challengeManager = challengeManager;
        this.index = index;

        init();
    }

    private void init() {
        File file = new File(challengeManager.getInputDirectory(), "challenge" + index + ".txt");
        if (!file.exists()) {
            try {
                if (file.createNewFile()) {
                    System.out.println("Created a new file named '" + file.getName() + "'.");
                }
            } catch (IOException e) {
                System.out.println("Failed to create a file named '" + file.getName() + "'.");
                e.printStackTrace();
            }
        }
        input = FileUtil.getFileContent(file);
    }

    public boolean hasInput() {
        return input != null && input.length() > 0;
    }

    public abstract int getSolution1();
    public abstract int getSolution2();

    public String getInput() {
        return input;
    }

    public int getIndex() {
        return index;
    }
}
