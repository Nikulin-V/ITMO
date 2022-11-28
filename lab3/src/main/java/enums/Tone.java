package main.java.enums;

public enum Tone {
    AFFECTIONATELY("ласково"),
    CHEERFULLY("весело"),
    RUDELY("грубо"),
    DISCONTENTEDLY("недовольно");

    private final String word;

    Tone(String word) {
        this.word = word;
    }

    @Override
    public String toString() {
        return this.word;
    }
}