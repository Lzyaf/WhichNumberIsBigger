package com.example.whichnumberisbigger;

public class BiggerNumberGame {
    private int number1;
    private int number2;
    private int score;
    private int lowerLimit;
    private int upperLimit;

    public BiggerNumberGame(int lowerLimit, int upperLimit) {
        this.lowerLimit = lowerLimit;
        this.upperLimit = upperLimit;
        generateRandomNumbers();
    }

    public void generateRandomNumbers() {
        number1 = (int) ((upperLimit + 1) * Math.random() + lowerLimit);
        number2 = (int) ((upperLimit + 1) * Math.random() + lowerLimit);

        while (number2 == number1) {
            number2 = (int) ((upperLimit - lowerLimit + 1) * Math.random() + lowerLimit);
        }
    }

    //    public String checkAnswer(int answer) {
//        ggez
//    }

    public String checkAnswer(int answer)
    {
        if (answer == Math.max(number1, number2)) {
            score++;
            return " You are correct!";
        } else {
            score--;
            return "You are wrong.";
        }
    }




    public int getNumber1() {
        return number1;
    }

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public int getNumber2() {
        return number2;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getLowerLimit() {
        return lowerLimit;
    }

    public void setLowerLimit(int lowerLimit) {
        this.lowerLimit = lowerLimit;
    }

    public int getUpperLimit() {
        return upperLimit;
    }

    public void setUpperLimit(int upperLimit) {
        this.upperLimit = upperLimit;
    }
}
