public class Mobi {

    public static void main(String[] args) {

        int score = 300; // начальнвй баланс счёта
        System.out.println("Баланс Вашего счёта равен " + score + " рублей.");
        int contri = 2100; // первое пополнение
        int bonus = (contri / 100);
        int amount = score + contri; // баланс после первого пополнения
        if (contri > 1000) {
            int balance = bonus + amount;
            System.out.println("Зачисление " + contri + " рублей. " +
                    "Дополнительно по условиям акции Вам начислено " + bonus + " рублей. " +
                    "Баланс Вашего счёта равен " + balance + " рублей. ");
        } else {
            System.out.println("Зачисление " + contri + " рублей. Баланс Вашего счёта равен " + amount + " рублей. " +
                    "Пополните счёт более чем на 1000 рублей и получите 1 рубль за каждые полные 100 рублей пополнения.");
        }

    }
}
