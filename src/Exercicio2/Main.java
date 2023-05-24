package Exercicio2;

public class Main {
    public static void main(String[] args) {
        Forma[] formas = new Forma[5];
        formas[0] = new Retangulo(3.0f, 4.0f);
        formas[1] = new Circulo(2.5f);
        formas[2] = new Quadrado(5.0f);
        formas[3] = new Retangulo(2.0f, 6.0f);
        formas[4] = new Circulo(3.5f);

        for (Forma forma : formas) {
            System.out.println("Área: " + forma.calcularArea());
            System.out.println("Perímetro: " + forma.calcularPerimetro());
            System.out.println();
        }
    }
}