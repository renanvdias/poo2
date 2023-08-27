public class IVehicleMakerSingleton {
    private static IVehicleMaker toyota;
    private static IVehicleMaker honda;

    public static IVehicleMaker getInstance(String tipo){

        if(tipo.equals("toyota")){
            if(toyota == null)
                toyota = new Toyota();
            return toyota;
        }
        else {
            if(honda == null)
                honda = new Honda();
            return honda;
        }


    }
}
