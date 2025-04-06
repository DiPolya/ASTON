package lesson_2;

import java.util.Arrays;

public class Watch {
    private String name;
    private int date;
    private String manufacturer;
    private String country;
    private int price;
    private String booking;

    public Watch (String name, int date, String manufacturer,
                   String country, int price, String booking ){
        this.name = name;
        this.date = date;
        this.manufacturer = manufacturer;
        this.country = country;
        this.price = price;
        this.booking = booking;
    }
public void infoproduct(){
      System.out.println("Информация о товаре: \nНазвание: " + name + "\nГод: " + date +
              "\nПроизводитель: " + manufacturer + "\nСтрана:" + country +
              "\nЦена: " + price + " руб, \nСтатус бронирования:" + booking);
}

}
