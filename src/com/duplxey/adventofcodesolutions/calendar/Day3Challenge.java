package com.duplxey.adventofcodesolutions.calendar;

import com.duplxey.adventofcodesolutions.challenge.Challenge;
import com.duplxey.adventofcodesolutions.challenge.ChallengeManager;

import java.util.ArrayList;

public class Day3Challenge extends Challenge {

    /*
     * WARNING: This is an extremely bad solution!
     */

    public Day3Challenge(ChallengeManager challengeManager) {
        super(challengeManager, 3);
    }

    @Override
    public int getSolution1() {
        String[] wires = getInput().split("\n");
        ArrayList<int[]> points1 = getPoints(wires[0]);
        ArrayList<int[]> points2 = getPoints(wires[1]);

        int minLength = 5000;

        for (int[] point1 : points1) {
            for (int[] point2 : points2) {
                if (point1[0] == point2[0] && point1[1] == point2[1]) {
                    if (point1[0] + point1[1] < minLength) {
                        minLength = point1[0] + point1[1];
                    }
                }
            }
        }

        return minLength;
    }

    private ArrayList<int[]> getPoints(String passed) {
        String[] orders = passed.split(",");
        ArrayList<int[]> points = new ArrayList<>();
        int x = 0, y = 0, len = 0;
        for (String order : orders) {
            char operation = order.charAt(0);
            int value = Integer.parseInt(order.substring(1));
            switch (operation) {
                case 'U':
                    for (int i = 0; i < value; i++) {
                        y++;
                        len++;
                        points.add(new int[] {x, y, len});
                    }
                    break;
                case 'D':
                    for (int i = 0; i < value; i++) {
                        y--;
                        len++;
                        points.add(new int[] {x, y, len});
                    }
                    break;
                case 'R':
                    for (int i = 0; i < value; i++) {
                        x++;
                        len++;
                        points.add(new int[] {x, y, len});
                    }
                    break;
                case 'L':
                    for (int i = 0; i < value; i++) {
                        x--;
                        len++;
                        points.add(new int[] {x, y, len});
                    }
                    break;
            }
        }
        return points;
    }

    @Override
    public int getSolution2() {
        String[] wires = getInput().split("\n");
        ArrayList<int[]> points1 = getPoints(wires[0]);
        ArrayList<int[]> points2 = getPoints(wires[1]);

        int minLength = Integer.MAX_VALUE;

        for (int[] point1 : points1) {
            for (int[] point2 : points2) {
                if (point1[0] == point2[0] && point1[1] == point2[1]) {
                    if (point1[2] + point2[2] < minLength) {
                        minLength = point1[2] + point2[2];
                    }
                }
            }
        }

        return minLength;
    }
}
