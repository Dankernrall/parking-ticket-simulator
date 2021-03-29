class ParkingTicket {
    private int price;
    private int estimatedTime;
    private ParkedCar parkedCar;
    private PoliceOfficer policeOfficer;
    private ParkingMeter parkingMeter;

    public ParkingTicket(ParkedCar parkedCar, PoliceOfficer policeOfficer, ParkingMeter parkingMeter) {
        this.parkedCar = parkedCar;
        this.policeOfficer = policeOfficer;
        this.parkingMeter = parkingMeter;
        estimatedTime = Math.abs(parkedCar.getHowLong() - parkingMeter.getBuyedTime());
        if (estimatedTime < 60) price = 25;
        else {
            price = 25 + ((estimatedTime - 1) / 60 * 10);
        }
    }



    @Override
    public String toString() {
        return "Выписан штраф от полицейского " + policeOfficer.getName() +
                " с номером жетона: " + policeOfficer.getToken() +
                ".\nНа машину: " + parkedCar.getCarBrand() +
                " " + parkedCar.getCarModel() + ". Номерной знак: " +
                parkedCar.getPlateNumber() + ". Цвет: " +
                parkedCar.getColor() + ".\nМашина простояла " +
                parkedCar.getHowLong() + " минут из " + parkingMeter.getBuyedTime() +
                " купленных.\nИтого к оплате за " + (Math.abs(parkingMeter.getBuyedTime() - parkedCar.getHowLong()))
                + " минут свыше купленных - " + price + "$.";
    }
}
