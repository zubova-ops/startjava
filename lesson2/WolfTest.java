public class WolfTest {
    public static void main(String[] args) {
        Wolf wolfGrey = new Wolf();
        wolfGrey.gender = 'M';
        System.out.println("gender = " + wolfGrey.gender);
        wolfGrey.name = "Stas seriy volk";
        System.out.println("name = " + wolfGrey.name);
        wolfGrey.weight = 85;
        System.out.println("weight = " + wolfGrey.weight);
        wolfGrey.age = 29;
        System.out.println("age = " + wolfGrey.age);
        wolfGrey.color = "blond";
        System.out.println("color = " + wolfGrey.color);

        wolfGrey.go();
        wolfGrey.sit();
        wolfGrey.run();
        wolfGrey.howl();
        wolfGrey.hunt();
    }
}