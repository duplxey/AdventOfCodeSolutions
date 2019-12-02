package com.duplxey.adventofcodesolutions.calendar;

import com.duplxey.adventofcodesolutions.challenge.Challenge;
import com.duplxey.adventofcodesolutions.challenge.ChallengeManager;

import java.util.Arrays;

public class Day2Challenge extends Challenge {

    public Day2Challenge(ChallengeManager challengeManager) {
        super(challengeManager, 2);
    }

    @Override
    public int getSolution1() {
        String[] input = getInput().split(",");
        int[] numbers = new int[input.length];
        for (int i = 0; i < input.length; i++) numbers[i] = Integer.parseInt(input[i]);

        numbers[1] = 12;
        numbers[2] = 2;

        for (int i = 0; i < numbers.length; i += 4) {
            int a1 = numbers[i+1];
            int a2 = numbers[i+2];
            int a3 = numbers[i+3];
            if (numbers[i] == 1) {
                numbers[a3] = numbers[a1] + numbers[a2];
            } else if (numbers[i] == 2) {
                numbers[a3] = numbers[a1] * numbers[a2];
            } else if (numbers[i] == 99) {
                break;
            }
        }
        return numbers[0];
    }

    @Override
    public int getSolution2() {
        String[] input = getInput().split(",");
        int[] loaded = new int[input.length];
        for (int i = 0; i < input.length; i++) loaded[i] = Integer.parseInt(input[i]);

        for (int noun = 0; noun < 99; noun++) {
            for (int verb = 0; verb < 99; verb++) {
                int[] numbers = Arrays.copyOf(loaded, loaded.length);
                numbers[1] = noun;
                numbers[2] = verb;
                for (int i = 0; i < numbers.length; i += 4) {
                    int a1 = numbers[i+1];
                    int a2 = numbers[i+2];
                    int a3 = numbers[i+3];
                    if (numbers[i] == 1) {
                        numbers[a3] = numbers[a1] + numbers[a2];
                    } else if (numbers[i] == 2) {
                        numbers[a3] = numbers[a1] * numbers[a2];
                    } else if (numbers[i] == 99) {
                        break;
                    }
                }
                if (numbers[0] == 19690720) {
                    return 100 * noun + verb;
                }
            }
        }
        return 0;
    }
}
