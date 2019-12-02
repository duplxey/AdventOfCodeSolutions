package com.duplxey.adventofcodesolutions.challenge;

import com.duplxey.adventofcodesolutions.calendar.Day1Challenge;
import com.duplxey.adventofcodesolutions.calendar.Day2Challenge;

public class ChallengeRegister {

    public ChallengeRegister(ChallengeManager challengeManager) {
        challengeManager.register(new Day1Challenge(challengeManager));
        challengeManager.register(new Day2Challenge(challengeManager));
    }
}
