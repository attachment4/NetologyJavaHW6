package ru.netology.qa;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public int calculate(int income, int expenses, int theshold) {
        int count = 0;
        int money = 0;
        for (int month = 0; month < 12; month++) {
            if (money >= theshold) {
                count++;
                money = (money - theshold) / 3;

            } else {
                money = money + income - expenses;
            }
        }
        return count;
    }
}