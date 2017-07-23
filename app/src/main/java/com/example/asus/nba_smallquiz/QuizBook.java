package com.example.asus.nba_smallquiz;

/**
 * Created by Asus on 22/7/2017.
 */

public class QuizBook {

    public static String[] questions = new String[]{
            "NBA founded in June 7, 1946.",
            "NBA had total of 30 teams.",
            "NBA tallest player is Gheorghe Muresan.",
            "There are 83 games in the NBA's regular season.",
            "Lebron James had fight for Miami Heat and Cleveland Cavaliers.",
            "Michael Jordan retired his basketball career at Chicago Bulls.",
            "Each NBA team can have a maximum of 16 players, 13 of which can be active each game.",
            "There are only 8 teams that qualify to the playoffs.",
            "The shot clock is 24 seconds.",
    };

    public static int[] images = new int [] {
            R.drawable.nba, R.drawable.teams, R.drawable.tall, R.drawable.games,
            R.drawable.james, R.drawable.jordan, R.drawable.players, R.drawable.trophy,
            R.drawable.clock
    };

    public static boolean[] answers = new boolean[]{
            false, true, true, false, true, true, false, true, true
    };
}
