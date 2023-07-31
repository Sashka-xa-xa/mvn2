package ru.netology.services;

public class BonusService {
    public int calculate(int income, int expenses, int threshold) {
        int counter = 0; // счётчик месяцев отдыха
        int money = 0; // количество денег на счету
        for (int i = 0; i < 12; i++) {
            if (money >= threshold) { // отдаем
                counter++; // увеличиваем счётчик месяцев отдыха
                money = money - expenses;
                money /= 3;
            } else {
                money = money + income;
                money -= expenses;
            }
        }
        return counter;
    }

}
