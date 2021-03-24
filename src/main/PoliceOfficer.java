class PoliceOfficer {
    ParkingTicket parkingticket = new ParkingTicket();
    String name = "Mikhail";
    int token = 55416723;

    public String getName() {
        return name;
    }

    public int getToken() {
        return token;
    }

    void checkcar(String carBrand, String carModel, String color, String plateNumber, int howLong, int buyedTime) {
        if (howLong > buyedTime) {
            System.out.println("Замечено нарушение! Выписываем штраф...");
            parkingticket.ticket(carBrand,carModel,color,plateNumber,howLong,getName(),getToken(),buyedTime);
        }
        else{
            System.out.println("Оплаченное время еще не вышло!");
        }

    }
}