class PoliceOfficer {
    private String name;
    private int token;

    public PoliceOfficer(String name, int token) {
        this.name = name;
        this.token = token;
    }

    public String getName() {
        return name;
    }

    public int getToken() {
        return token;
    }

    public void checkcar(ParkedCar parkedCar, ParkingMeter parkingMeter) {
        ParkingTicket parkingTicket = new ParkingTicket(parkedCar,this,parkingMeter);
        if (parkedCar.getHowLong() > parkingMeter.getBuyedTime()) {
            System.out.println(parkingTicket.toString());
        } else {
            System.out.println(toString());
        }

    }

    @Override
    public String toString() {
        return "Офицер: \"" + name +
                "\", с номером жетона: \"" + token +
                "\"\nне видит причин, для выписывания штрафа.";
    }
}