public class WolfTest {
    public static void main(String[] args) {
        Wolf wolfOne = new Wolf();
        wolfOne.gender = 'M';
        System.out.println("gender = " + wolfOne.gender);
        wolfOne.name = "Stas seriy volk";
        System.out.println("name = " + wolfOne.name);
        wolfOne.weight = 85;
        System.out.println("weight = " + wolfOne.weight);
        wolfOne.age = 29;
        System.out.println("age = " + wolfOne.age);
        wolfOne.color = "blond";
        System.out.println("color = " + wolfOne.color);

        wolfOne.go();
        wolfOne.sit();
        wolfOne.run();
        wolfOne.howl();
        wolfOne.hunt();
    }
}