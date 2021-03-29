class ParkedCar {
    private String carBrand;
    private String carModel;
    private String plateNumber;
    private String color;
    private int howLong;

    ParkedCar(String carBrand, String carModel, String color, String plateNumber, int howLong) {
        this.carBrand = carBrand;
        this.carModel = carModel;
        this.color = color;
        this.plateNumber = plateNumber;
        this.howLong = howLong;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public String getCarModel() {
        return carModel;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public String getColor() {
        return color;
    }

    public int getHowLong() {
        return howLong;
    }
}
