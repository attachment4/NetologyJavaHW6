package ru.netology.services;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.api.Assertions;
import ru.netology.qa.Services;

public class ServicesTest {

    @ParameterizedTest
    // numLinesToSkip = 1 нужно, если в CSV есть заголовок (первая строка с названиями)
    @CsvFileSource(resources = "/vac.csv")
    public void shouldCalculateVacationMonths(int income, int expenses, int threshold, int expected) {
        Services service = new Services();

        int actual = service.calculate(income, expenses, threshold);
        System.out.println(actual);
        Assertions.assertEquals(expected, actual);
    }
}

  /*  @Test
    public void shouldCalculateForSmallIncoomes() {
        Main service = new Main();

        int expected = 3;
        int actual = service.calculate(10_000, 3_000, 20_000);
        System.out.println(actual);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateForLargeIncoomes() {
        Main service = new Main();

        int expected = 2;
        int actual = service.calculate(100_000, 60_000, 150_000);
        System.out.println(actual);
        Assertions.assertEquals(expected, actual);
    }
}
*/