package org.example;

public class Square {
    private int sisi;

    public Square(int sisi) {
        this.sisi = sisi;
    }

    public int getLuas() {
        int luas = this.sisi * this.sisi;
        return luas;
    }
}