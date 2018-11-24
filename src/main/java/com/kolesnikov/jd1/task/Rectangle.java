package com.kolesnikov.jd1.task;

public class Rectangle {

    private Point point1;
    private Point point2;

    public Rectangle(Point point1, Point point2) {
        this.point1 = point1;
        this.point2 = point2;
    }

    public int rectangleArea() {
        int resultX = 0;
        int resultY = 0;
        if (this.point1.getX() > this.point2.getX()) {
            resultX = this.point1.getX() - point2.getX();
        } else {
            resultX = point2.getX() - this.point1.getX();
        }
        if (this.point1.getY() > this.point2.getY()) {
            resultY = this.point1.getY() - this.point2.getY();
        } else {
            resultY = this.point2.getY() - this.point1.getY();
        }
        return Math.abs(resultX * resultY);
    }
    // наверное можно было бы создать ещё один класс, который бы сделал код более лаконичным,
    // но этого не было по условию

    public double rectangleDiagonal() {
        return new Point(this.point1.getX(), this.point1.getY()).distance(this.point2);
    }
}
