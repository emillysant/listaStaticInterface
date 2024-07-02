public class Geometry {
    public static double quadrado(double lado) {
      return lado*lado;
    };
    public static double retangulo(double base, double altura){
        return base*altura;
    }
    public static double triangulo(double base, double altura){
        return (base*altura)/2;
    }
    public static double circulo(double raio){
        return Math.PI*(raio*raio);
    }

    public static double cubo(double a) {
        return Math.pow(a, 3);
    }
    public static double paralelepipedo(double a, double b, double c) {
        return a*b*c;
    }
    public static double trapezio(double base1, double base2, double altura) {
        return ((base1 + base2) * altura) / 2;
    }
    public static double esfera(double raio) {
        return (4.0 / 3) * Math.PI * Math.pow(raio, 3);
    }


}
