
public class Programa {
    public static void main(String[] args) {
        Triangulo triangulo1 = new Triangulo();
        triangulo1.ladoA = 8;
        triangulo1.ladoB = 7;
        triangulo1.ladoC = 6;

        Triangulo triangulo2 = new Triangulo();
        triangulo2.ladoA = 7;
        triangulo2.ladoB = 10;
        triangulo2.ladoC = 5;

        double areaTriangulo1 = triangulo1.area();
        double areaTriangulo2 = triangulo2.area();

        System.out.println("Area triangulo 1: "+areaTriangulo1);
        System.out.println("area triangulo 2: "+areaTriangulo2);
    }
    
}
 