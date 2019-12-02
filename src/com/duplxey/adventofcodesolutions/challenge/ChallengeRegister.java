package com.duplxey.adventofcodesolutions.challenge;

import com.duplxey.adventofcodesolutions.calendar.Day1Challenge;

public class ChallengeRegister {

    public ChallengeRegister(ChallengeManager challengeManager) {
        challengeManager.register(new Day1Challenge(challengeManager));
    }
}