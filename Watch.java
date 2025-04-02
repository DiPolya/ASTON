package lesson_2;

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
    public void info2 () {
        System.out.println("Информация о товаре: Название: " + name + "Год: " + date +
                " Производитель: " + manufacturer + "Страна:" + country +
                "Цена: " + price + " руб, Статус бронирования:" + booking);
    }
}
