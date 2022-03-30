package com.bridgelabz.oops.cards;

public class Player
{
    String name;
    String[] cards;


    Player(String name, int noOfCards) {
        this.name = name;
        cards = new String[noOfCards];
    }

    public String getName() {
        return name;
    }

    public String[] getCards() {
        return cards;
    }

    public void sort() {
        for (int i = 0; i < cards.length - 1; i++) {
            for (int j = i + 1; j < cards.length; j++) {
                int firstNum = switch (cards[i].split("\\(")[0]) {
                    case "Jack" -> 11;
                    case "Queen" -> 12;
                    case "King" -> 13;
                    case "Ace" -> 14;
                    default -> Integer.parseInt(cards[i].split("\\(")[0]);
                };
                int secondNum = switch (cards[j].split("\\(")[0]) {
                    case "Jack" -> 11;
                    case "Queen" -> 12;
                    case "King" -> 13;
                    case "Ace" -> 14;
                    default -> Integer.parseInt(cards[j].split("\\(")[0]);
                };
                if (firstNum > secondNum) {
                    String temp = cards[i];
                    cards[i] = cards[j];
                    cards[j] = temp;
                }
            }
        }
    }
}