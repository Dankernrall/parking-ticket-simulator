import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean variant = false;//true - ручной ввод данных, false - автоматический
        String carBrand,carModel,color,plateNumber;
        int howLong,buyed;
        Scanner in = new Scanner(System.in);
        ParkingMeter parkingmeter = new ParkingMeter();
        PoliceOfficer policeofficer = new PoliceOfficer();
        if(!variant){
        ParkedCar mycar = new ParkedCar("KIA","RIO","Red","E412EM30",120);
        parkingmeter.setBuyedTime(100);
        policeofficer.checkcar(mycar.carBrand,mycar.carModel,mycar.color,mycar.plateNumber,mycar.howLong,parkingmeter.getBuyedTime());}
        else if (variant) {
            System.out.print("Введите марку автомобиля: ");carBrand = in.nextLine();
            System.out.print("Введите модель автомобиля: ");carModel = in.nextLine();
            System.out.print("Введите цвет: ");color = in.nextLine();
            System.out.print("Введите номерной знак: ");plateNumber = in.nextLine();
            System.out.print("Сколько времени стояла машина: ");howLong = in.nextInt();
            System.out.print("Сколько оплачено: ");buyed = in.nextInt();parkingmeter.setBuyedTime(buyed);
            policeofficer.checkcar(carBrand,carModel,color,plateNumber,howLong,parkingmeter.getBuyedTime());
        }


    }
}
