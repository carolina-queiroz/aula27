package Exemplo27;

// Abstract class
abstract class Animal {
    // Método abstrato (não possui corpo)
    public abstract void animalSound();
    // Método normal
    public void sleep() {
        System.out.println("Zzz");
    }
}
