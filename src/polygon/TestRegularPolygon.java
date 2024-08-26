package polygon;

public class TestRegularPolygon {
    public static void main(String[] args) {
        // Create three RegularPolygon objects
        RegularPolygon polygon1 = new RegularPolygon(); // No-arg constructor
        RegularPolygon polygon2 = new RegularPolygon(6, 4); // 6 sides, 4 length
        RegularPolygon polygon3 = new RegularPolygon(10, 4, 5.6, 7.8); // 10 sides, 4 length, centered at (5.6, 7.8)

        // Display perimeter and area for each polygon
        System.out.println("Polygon 1: Perimeter = " + polygon1.getPerimeter() + ", Area = " + polygon1.getArea());
        System.out.println("Polygon 2: Perimeter = " + polygon2.getPerimeter() + ", Area = " + polygon2.getArea());
        System.out.println("Polygon 3: Perimeter = " + polygon3.getPerimeter() + ", Area = " + polygon3.getArea());
    }
}
