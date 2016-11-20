package com.company;
public class Frac {

    private int numerator;
    private int denominator;

    Frac() {
        this.numerator = 0;
        this.denominator = 1;
    }

    Frac(int number) {
        this.numerator = number;
        this.denominator = 1;
    }

    Frac(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public String toString() {
        return numerator + "/" + denominator;
    }

    public Frac sum(Frac frac) {
        Frac resultFrac = new Frac();
        if (this.denominator == frac.denominator) {
            resultFrac.numerator = this.numerator + frac.numerator;
            resultFrac.denominator = this.denominator;
        }
        else {
            resultFrac.numerator = this.numerator * frac.denominator + this.denominator * frac.numerator;
            resultFrac.denominator = this.denominator * frac.denominator;
        }
        return resultFrac;
    }

    public Frac sum(int number) {
        Frac resultFrac = new Frac();
        resultFrac.numerator = this.numerator + this.denominator * number;
        resultFrac.denominator = this.denominator;
        return resultFrac;
    }

    public Frac mult(Frac frac) {
        Frac resultFrac = new Frac();
        resultFrac.numerator = this.numerator * frac.numerator;
        resultFrac.denominator = this.denominator * frac.denominator;
        return resultFrac;
    }

    public Frac mult(int number) {
        Frac resultFrac = new Frac();
        resultFrac.numerator = this.numerator * number;
        resultFrac.denominator = this.denominator;
        return resultFrac;
    }

    public Frac div(Frac frac) {
        Frac resultFrac = new Frac();
        resultFrac.numerator = this.numerator * frac.denominator;
        resultFrac.denominator = this.denominator * frac.numerator;
        return resultFrac;
    }

    public Frac div(int number) {
        Frac resultFrac = new Frac();
        resultFrac.numerator = this.numerator;
        resultFrac.denominator = this.denominator * number;
        return resultFrac;
    }

    public Frac inverse() {
        Frac resultFrac = new Frac();
        resultFrac.numerator = this.denominator;
        resultFrac.denominator = this.numerator;
        return  resultFrac;
    }

    public Boolean isDenominatorZero() {
        return this.denominator == 0;
    }

    private int GCD(int firstNumber, int secondNumber) {
        if (secondNumber == 0)
            return firstNumber;
        return GCD(secondNumber, firstNumber % secondNumber);
    }

    public Boolean isShorten() {
        return GCD(this.numerator, this.denominator) != 1;
    }

    public Frac shortFrac() {
        Frac resultFrac = new Frac();
        int gcd = GCD(this.numerator, this.denominator);
        resultFrac.numerator = this.numerator / gcd;
        resultFrac.denominator = this.denominator / gcd;
        return resultFrac;
    }

    public Boolean isEqual(Frac frac) {
        Frac f1 = this.shortFrac(), f2 = frac.shortFrac();
        return (f1.numerator == f2.numerator && f1.denominator == f2.denominator);
    }

    public int compareTo(Frac frac) {
        Frac f1 = this.mult(frac.denominator).div(frac.denominator);
        Frac f2 = frac.mult(this.denominator).div(this.denominator);
        return (f1.isEqual(f2) ? 0 : f1.numerator > f2.numerator ? 1 : -1);
    }
    
}
