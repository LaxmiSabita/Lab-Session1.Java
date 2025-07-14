public class Rectangle {
    // Enum for colors
    enum Color {
        RED, GREEN, BLUE
    }

    // Member variables
    private double width;
    private double height;
    private Color boxColor;

    // Constructor
    public Rectangle(double width, double height, Color color) {
        this.width = width;
        this.height = height;
        this.boxColor = color;
    }

    // Main method
    public static void main(String[] args) {
        // Just print enum
        System.out.println(Color.BLUE);
    }
}
