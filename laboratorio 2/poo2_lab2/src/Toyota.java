public class Toyota implements IVehicleMaker{
    public IVehicle makeVehicle(String modelo){
        if (modelo.equals("corolla")){
            return new Corolla();
        }
        if (modelo.equals("hilux")){
            return new Hilux();
        }
        if (modelo.equals("etios")){
            return new Etios();
        }
        return null;
    }
}
