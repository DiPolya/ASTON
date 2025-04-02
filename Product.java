package lesson_2;

public class Product {
    private String name;
    private int date;
    private String manufacturer;
    private String country;
    private int price;
    private String booking;

    public Product(String name, int date, String manufacturer,
                   String country, int price, String booking ){
        this.name = name;
        this.date = date;
        this.manufacturer = manufacturer;
        this.country = country;
        this.price = price;
        this.booking = booking;
    }


    public void info() {
        System.out.println("Информация о товаре: \nНазвание: " + name + "\nГод: " + 2024 +
                "\nПроизводитель: " + manufacturer + "\nСтрана:" + country +
                "\nЦена: " + 2752 + " руб, \nСтатус бронирования:" + booking);
    }
}
