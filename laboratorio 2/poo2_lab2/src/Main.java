public class Main {
    public static void main(String[] args) {
        // utilizando o padrao Singleton (Toyota)
        IVehicleMaker toyota = IVehicleMakerSingleton.getInstance("toyota");

        // utilizando o padrao Fabrica (Toyota)
        IVehicle corolla = toyota.makeVehicle("corolla");

        // utilizando o veiculo fabricado (Toyota)
        corolla.start();
        corolla.drive();
        corolla.stop();

        // utilizando o padrao Singleton (Honda)
        IVehicleMaker honda = IVehicleMakerSingleton.getInstance("honda");

        // utilizando o padrao Fabrica (Honda)
        IVehicle city = toyota.makeVehicle("city");

        // utilizando o veiculo fabricado (Honda)
        city.start();
        city.drive();
        city.stop();
    }
}