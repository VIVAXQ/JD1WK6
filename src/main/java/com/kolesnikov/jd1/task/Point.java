package com.kolesnikov.jd1.task;

public class Point {

    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance(Point point2) {
        int resultX = 0;
        int resultY = 0;
        if (this.x > point2.getX()) {
            resultX = this.x - point2.getX();
        } else {
            resultX = point2.getX() - this.x;
        }
        if (this.y > point2.getY()) {
            resultY = this.y - point2.getY();
        } else {
            resultY = point2.getY() - this.y;
        }
        return Math.sqrt(Math.pow(resultX, 2) + Math.pow(resultY, 2));
    }
}
