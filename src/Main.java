import java.awt.Color;

class Triangles {

    public static void triangle(double x, double y, double s, int n) {
        // X and y are base coordinates, s is size, n is number of recursions

        if (n <= 0) {
            return;
        }


        StdDraw.setPenColor(Color.black);
        StdDraw.setPenRadius(.0005);

        //triangle coordinates
        double x2 = x + s;
        double x3 = (x + x2) / 2.0;
        double y3 = y + (Math.sqrt(3) * s / 2);

        StdDraw.line(x, y, x2, y);
        StdDraw.line(x, y, x3, y3);
        StdDraw.line(x2, y, x3, y3);


        triangle(x, y, s / 2.0, n - 1);
        triangle((x + x2) / 2.0, (y + y) / 2.0, s / 2.0, n - 1);
        triangle((x + x3) / 2.0, (y + y3) / 2.0, s / 2.0, n - 1);


    }

    public static void main(String[] args) {


        triangle(0, 0, 1, 5);
    }
}