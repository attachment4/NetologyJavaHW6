package ru.netology.services;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.api.Assertions;
import ru.netology.qa.Main;

public class services {

    @ParameterizedTest
    @CsvFileSource(resources = "/vac.csv")
    public void shouldCalculateVacationMonths(int income, int expenses, int threshold, int expected) {
        Main service = new Main();

        int actual = service.calculate(income, expenses, threshold);
        System.out.println(actual);
        Assertions.assertEquals(expected, actual);
    }
}