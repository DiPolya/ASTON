package lesson_2;

 public class Main {
     public static void main (String[] args) {
         Product pro1 = new Product("Фен Mi lonic ", 2024, "Xiaomi ",
                 " Китай ", 2752, " Заказ оформлен ");
         pro1.info();

         Watch [] pro2 = new Watch[5];
         pro2 [0] = new Watch("Apple Watch 1-го поколения", 2015, "Apple", "California", 18900, "Добавлен в корзину");
         pro2 [1] = new Watch("Apple Watch Series 1", 2016, "Apple", "California", 47900, "Ждёт оплаты");
         pro2 [2] = new Watch("Apple Watch Series 3", 2017, "Apple", "California", 28400, "Добавлен в корзину");
         pro2 [3] = new Watch("Apple Watch Series 4", 2018, "Apple", "California", 28900, "Добавлен в корзину");
         pro2 [4] = new Watch("Apple Watch Series 5", 2019, "Apple", "California", 35800, "Оплачено");

         pro2.info2 ();

         Park.Attraction attraction = new Park("Самара", "Гагарина", "Аттракцион:").new Attraction("Взлёт", 10, 300);
         attraction.atr();
         attraction getInfo;
     }

 }