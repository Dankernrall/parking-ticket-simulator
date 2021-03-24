class ParkingTicket {
int price;
void ticket(String carBrand, String carModel, String color, String plateNumber, int howLong,String officer, int token, int buyedTime){
    int estimatedTime = Math.abs(howLong - buyedTime);
    if(estimatedTime<60) price = 25;
    else{price = 25 + Math.round((estimatedTime/60)*10);}
    System.out.println("Выписан штраф от полицейского " + officer + " с номером жетона: " + token
    + ".\nНа машину: " + carBrand + " " + carModel + ". Номерной знак: " + plateNumber + ". Цвет: "
    + color +".\nМашина простояла " + howLong + " минут из " + buyedTime + " купленных.\nИтого к оплате за "
    + (Math.abs(buyedTime-howLong)) + " минут свыше купленных - " + price +"$.");
}
}
