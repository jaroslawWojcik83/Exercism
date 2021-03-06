class Triangle {

    private double side1;
    private double side2;
    private double side3;

    Triangle(double side1, double side2, double side3) throws TriangleException {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        if (side1 == 0 || side2 ==0 || side3 == 0) {
            throw new TriangleException("At least one of the three sides of the triangle has an incorrect value");
        }
        if (side1 + side2 < side3 || side2 + side3 < side1 || side1 + side3 < side2) {
            throw new TriangleException("It isn't triangle");
        }
    }

    public boolean isEquilateral() {
        return (side1 == side2 && side2 == side3);
    }

    public boolean isIsosceles() {
        return  (side1 == side2 || side2 == side3 || side1 == side3);
    }

    public boolean isScalene() {
        return (side1 != side2 && side2 != side3 && side1 != side3);
    }

}
