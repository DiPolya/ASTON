package lesson_2;

public class Park {
    private String city;
    private String street;
    private Attraction attraction;

    public class Attraction {
        private String name;
        private int time;
        private int price;

        public Attraction(String name, int time, int price) {
            this.name = name;
            this.time = time;
            this.price = price;

            public void atr(){
                System.out.println("Название аттракциона:" + attraction.name +
                        "\nВремя сеанса: " + attraction.time + " мин \nЦена:" + attraction.price);
            }
        }

    }

    public Park(String city, String street,
                Attraction  attraction) {
        this.city = city;
        this.street = street;
        this.attraction = attraction;

    }

    public void getInfo() {
        System.out.println("Парк: \nГород: " + city + "\nУлица: " + street +
                "\nАттракцион: " + attraction + "\nНазвание аттракциона:" + attraction.name +
                "\nВремя сеанса: " + attraction.time + " мин \nЦена:" + attraction.price);
    }
}
