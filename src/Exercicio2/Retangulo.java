package Exercicio2;

class Retangulo extends Forma {
    private float lado;
    private float altura;

    public Retangulo(float lado, float altura) {
        this.lado = lado;
        this.altura = altura;
    }

    public float calcularArea() {
        return lado * altura;
    }

    public float calcularPerimetro() {
        return 2 * (lado + altura);
    }
}