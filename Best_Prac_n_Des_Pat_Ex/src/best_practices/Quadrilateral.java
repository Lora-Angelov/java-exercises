package best_practices;

public class Quadrilateral {
    int height;
    int width;
    String colour;

    public Quadrilateral() {
        this(10, 10, "Black");
    }

    public Quadrilateral(int sideLength) {
        this(sideLength, sideLength, "Black");
    }

    public Quadrilateral(int height, int width) {
        this(height, width, "Black");
    }

    public Quadrilateral(int height, int width, String colour) {
        this.height = height;
        this.width = width;
        this.colour = colour;
    }

}
