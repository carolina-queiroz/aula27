package Exemplo27;

class Main {
    public static void main(String[] args) {
        // Cria um objeto Pig
        Pig myPig = new Pig();
        Animal animal = new Animal() {
            @Override
            public void animalSound() {
                System.out.println("The animals said hello");
            }
        };
        animal.sleep();
        myPig.animalSound();
        myPig.sleep();
    }
}