package ru.netology.javaqa.services;

public class VacationService {

    public int calculate(int income, int expenses, int threshold) {
        int months = 0;
        int cash = 0;
        for (int i = 0; i <= 12; i++) {
            if (cash >= threshold) { // идем в отпуск
                months++;
                cash -= expenses;
                cash = cash / 3;
            } else {  // работаем
                cash += income;
                cash -= expenses;
            }
        }
        return months;
    }
}
