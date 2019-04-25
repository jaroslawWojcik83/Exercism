import java.awt.geom.Point2D;

class Darts {

    private double x, y;

    Darts(double x, double y) {
        this.x = x;
        this.y = y;
    }

    int score() {

        int points = 10;
        int radiusInner = 1;
        int radiusMiddle  = 5;
        int radiusOuter = 10;

        double position = Point2D.distance(0, 0, x, y);

        if (position > radiusOuter) {
            points = 0;
        } else if (position > radiusMiddle) {
            points = 1;
        } else if (position > radiusInner) {
            points =  5;
        }
        return points;
    }
}
