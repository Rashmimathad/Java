public class MajesticRunner {
    public static void main(String[] args) {
        System.out.println("main started");
        Platform platform=new Platform(1,3);
        BusStand busStand=new BusStand("Kempegowda Bus Stand",15,platform);
        Majestic majestic=new Majestic(3,true,busStand);
        majestic.getMajesticInfo();
        System.out.println("main ended");
    }
}
