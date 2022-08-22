public class Main {
    public static void main(String[] args) {
        int clientOS = 0;
        int releaseYears = 2014;
        if(clientOS == 0)
        {
            if(releaseYears >= 2015)
            {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
            else
            {
                System.out.println("становите облегченную версию приложения для iOS по ссылке");
            }
        }
        clientOS = 1;
        if(clientOS == 1)
        {
            if(releaseYears >= 2015)
            {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
            else
            {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        }

        int years = 2022;
        if((years % 4 == 0 || years % 400 == 0) && years % 100 != 0)
        {
            System.out.println(years + " год является високосным");
        }
        else
        {
            System.out.println(years + " год не является високосным");
        }

        int deliveryDistance  = 60;
        int day = 0;
        if (deliveryDistance >= 0 && deliveryDistance  <= 20)
        {
            day = 1;
            System.out.println("Потребуется " + day + " дней");
        }
        else if (deliveryDistance > 20 && deliveryDistance <= 60)
        {
            day = 2;
            System.out.println("потребуется " + day + " дней");
        }
        else if (deliveryDistance > 60 && deliveryDistance <= 100)
        {
            day = 3;
            System.out.println("потребуется " + day + " дней");
        }

        int monthNumber = 12;
        switch (monthNumber)
        {
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
            default:
                System.out.println("Такого месяца не существует");
        }
    }
}