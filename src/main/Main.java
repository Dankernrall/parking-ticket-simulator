public class Main {
    public static void main(String[] args) {
        ParkingMeter parkingmeter = new ParkingMeter();
        PoliceOfficer policeofficer = new PoliceOfficer("Mikhail", 1523232); // Задаем полицейского
        ParkedCar mycar = new ParkedCar("KIA", "RIO", "Red", "E412EM30", 200); // Задаем машину
        parkingmeter.setBuyedTime(200); // Устанавливаем купленное время
        policeofficer.checkcar(mycar, parkingmeter);
    }
}
