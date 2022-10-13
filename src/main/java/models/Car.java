package models;

public class Car {

    private String location;
    private String make;
    private String model;
    private String year;
    private String engine;
    private String fuel;
    private String gear;
    private String wD;
    private String doors;
    private String seats;
    private String clasS;
    private String fuelConsumption ;
    private String carRegistrationNumber ;
    private String price;
    private String distanceIncluded ;
    private String features;
    private String about;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public String getGear() {
        return gear;
    }

    public void setGear(String gear) {
        this.gear = gear;
    }

    public String getwD() {
        return wD;
    }

    public void setwD(String wD) {
        this.wD = wD;
    }

    public String getDoors() {
        return doors;
    }

    public void setDoors(String doors) {
        this.doors = doors;
    }

    public String getSeats() {
        return seats;
    }

    public void setSeats(String seats) {
        this.seats = seats;
    }

    public String getClasS() {
        return clasS;
    }

    public void setClasS(String clasS) {
        this.clasS = clasS;
    }

    public String getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(String fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public String getCarRegistrationNumber() {
        return carRegistrationNumber;
    }

    public void setCarRegistrationNumber(String carRegistrationNumber) {
        this.carRegistrationNumber = carRegistrationNumber;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDistanceIncluded() {
        return distanceIncluded;
    }

    public void setDistanceIncluded(String distanceIncluded) {
        this.distanceIncluded = distanceIncluded;
    }

    public String getFeatures() {
        return features;
    }

    public void setFeatures(String features) {
        this.features = features;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }



    @Override
    public String toString() {
        return "Car{" +
                "location='" + location + '\'' +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year='" + year + '\'' +
                ", engine='" + engine + '\'' +
                ", fuel='" + fuel + '\'' +
                ", gear='" + gear + '\'' +
                ", wD='" + wD + '\'' +
                ", doors='" + doors + '\'' +
                ", seats='" + seats + '\'' +
                ", clasS='" + clasS + '\'' +
                ", fuelConsumption='" + fuelConsumption + '\'' +
                ", carRegistrationNumber='" + carRegistrationNumber + '\'' +
                ", price='" + price + '\'' +
                ", distanceIncluded='" + distanceIncluded + '\'' +
                ", features='" + features + '\'' +
                ", about='" + about + '\'' +
                '}';
    }


}
