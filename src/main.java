public class main {
    public static void main(String[] args) {
        int clientOs = 0; // 0 - iOS , 1 - Android
        if (clientOs == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOs == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        System.out.println("Задача 2");
        int clientOS = 1;
        int clientDeviceYear = 2015;
        String message;
        if (clientDeviceYear < 2015) {
            if (clientOs == 0) {
                message = "Установите облегченную версию приложения для iOS по ссылке";
            } else {
                message = "Установите облегченную версию приложения для Android по ссылке";
            }
        } else {
            if (clientOs == 0) {
                message = "Установите облегченную версию приложения для iOS по ссылке";
            } else {
                message = "Установите облегченную версию приложения для Android по ссылке";
            }
        }
        System.out.println(message);
        System.out.println("Задача 3");
        int year = 2021;
        if (year <= 1584) {
            System.out.println(year + " год, григорианский календарь не действовал");
            return;
        }
        boolean isLeap = (year % 4 == 0) && (year % 100 != 0 || year % 400 == 0);
        System.out.println(year + " год " + (isLeap ? "является" : " не является") + " високосным");
        System.out.println("Задача 4");
        int deliveryDistance = 95; // Дистанция до клиента в км

        int deliveryTime;

        if (deliveryDistance <= 0) {
            System.out.println("Некорректное расстояние");
            return;
        } else if (deliveryDistance <= 20) {
            deliveryTime = 1;
        } else if (deliveryDistance <= 60) {
            deliveryTime = 2;
        } else if (deliveryDistance <= 100) {
            deliveryTime = 3;
        } else {
            System.out.println("Доставка невозможна: расстояние свыше 100 км");
            return;
        }

        System.out.println("Потребуется дней: " + deliveryTime);
        System.out.println("Задача 5");
        int monthNumber = 12; // Номер месяца (от 1 до 12)

        if (monthNumber < 1 || monthNumber > 12) {
            System.out.println("Некорректный номер месяца. Введите значение от 1 до 12.");
            return;
        }

        String season;

        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                season = "зима";
                break;
            case 3:
            case 4:
            case 5:
                season = "весна";
                break;
            case 6:
            case 7:
            case 8:
                season = "лето";
                break;
            case 9:
            case 10:
            case 11:
                season = "осень";
                break;
            default:
                season = "неопределенный сезон";
        }

        System.out.println(monthNumber + "-й месяц принадлежит к сезону: " + season);
    }
}