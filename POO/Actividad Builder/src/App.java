public class App {
    public static void main(String[] args) {
        Director director = new Director();
        InterfazBuilder basico = new BuilderBásico();
        InterfazBuilder romance = new BuilderRomance();

        director.crearPack(romance);

        Pack pack = romance.getPack();
        System.out.println(pack);
    }
}
