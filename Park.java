package lesson_2;

public class Park {

    public class Attraction {

        private String name;
        private int time;
        private int price;

        public Attraction(String name, int time, int price) {
            this.name = name;
            this.time = time;
            this.price = price;

        }

        public void getInfo(){
            System.out.println("\nАттракцион: " + name  + "\nВремя сеанса: " + time +
                    " мин \nЦена:" + price + " руб");
        }

    }

}
