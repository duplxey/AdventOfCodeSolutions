package com.duplxey.adventofcodesolutions.calendar;

import com.duplxey.adventofcodesolutions.challenge.Challenge;
import com.duplxey.adventofcodesolutions.challenge.ChallengeManager;

public class Day1Challenge extends Challenge {

    public Day1Challenge(ChallengeManager challengeManager) {
        super(challengeManager, 1);
    }

    @Override
    public int getSolution1() {
        int sum = 0;
        for (String line : getInput().split("\n")) {
            int a = Integer.parseInt(line);
            sum += a/3-2;
        }
        return sum;
    }

    @Override
    public int getSolution2() {
        int sum = 0;
        for (String line : getInput().split("\n")) {
            int moduleSum = 0;
            int current = Integer.parseInt(line);
            while (current/3 - 2 > 0) {
                current = current/3 - 2;
                moduleSum += current;
            }
            sum += moduleSum;
        }
        return sum;
    }
}
