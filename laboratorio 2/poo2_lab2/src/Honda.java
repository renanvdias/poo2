public class Honda implements IVehicleMaker{
    public IVehicle makeVehicle(String modelo){
        if (modelo.equals("city")){
            return new City();
        }
        if (modelo.equals("civic")){
            return new Civic();
        }
        if (modelo.equals("fit")){
            return new Fit();
        }
        return null;
    }
}
