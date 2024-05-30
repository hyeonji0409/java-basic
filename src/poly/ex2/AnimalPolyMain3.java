package poly.ex2;

public class AnimalPolyMain3 {
    public static void main(String[] args) {

        Animal a = new Animal();
        a.sound();

        Animal[] animalArr = {new Dog(), new Cat(), new Cow(), new Duck(), new Pig()};

        for (Animal animal : animalArr) {
            soundAnimal(animal);
        }
    }

    // option + command + m 단축키로 생성 가능
    private static void soundAnimal(Animal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }


}
