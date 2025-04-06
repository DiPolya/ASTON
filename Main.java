package lesson_2;

import java.util.Arrays;

public class Main {
     public static void main (String[] args) {
         Product pro1 = new Product("Фен Mi lonic ", 2024, "Xiaomi ",
                 " Китай ", 2752, " Заказ оформлен ");
         pro1.info();

         Watch [] productsArray = new Watch[5];
         productsArray  [0] = new Watch("Apple Watch 1-го поколения", 2015, "Apple", "California", 18900, "Добавлен в корзину");
         productsArray  [1] = new Watch("Apple Watch Series 1", 2016, "Apple", "California", 47900, "Ждёт оплаты");
         productsArray  [2] = new Watch("Apple Watch Series 3", 2017, "Apple", "California", 28400, "Добавлен в корзину");
         productsArray  [3] = new Watch("Apple Watch Series 4", 2018, "Apple", "California", 28900, "Добавлен в корзину");
         productsArray  [4] = new Watch("Apple Watch Series 5", 2019, "Apple", "California", 35800, "Оплачено");

         for (Watch watch : productsArray){
             watch.infoproduct() ;
         }

         Park park = new Park();
         Park.Attraction number1 = park.new Attraction("Супер полёт", 10, 500);
         Park.Attraction number2 = park.new Attraction("Колесо обозрения", 5, 360);
         Park.Attraction number3 = park.new Attraction("Батут", 10, 250);
         Park.Attraction number4 = park.new Attraction("Торпеда", 4, 350);
         Park.Attraction number5 = park.new Attraction("Весёлая гусеница", 7, 250);

         number1.getInfo();
         number2.getInfo();
         number3.getInfo();
         number4.getInfo();
         number5.getInfo();
     }

 }