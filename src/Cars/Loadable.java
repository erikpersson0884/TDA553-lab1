package Cars;

interface Loadable{
    void loadCar(Car carToBeUnloaded);
    void unloadCar(Car carToBeUnloaded);
    boolean carIsInRange(Car objectToBeloaded);
}
