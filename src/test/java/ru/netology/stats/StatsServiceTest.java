package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StatsServiceTest {
    @Test
    public void testTotalSale() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.calculateTotalSale(sales);
        long expected = 180;
        Assertions.assertEquals(expected, actual);
    }

@Test
    public void testAverageSale() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.calculateAverageSale(sales);
        long expected = 15;

        Assertions.assertEquals(expected, actual);
}
@Test
    public void testMonthMaxSale() {
        StatsService service = new StatsService();
    long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    long actual = service.calculateMonthMaxSale(sales);
    long expected = 8;

    Assertions.assertEquals(expected, actual);
}
@Test
    public void testMonthMinSale() {
        StatsService service = new StatsService();
    long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    long actual = service.calculateMonthMinSale(sales);
    long expected = 9;

    Assertions.assertEquals(expected, actual);
}
@Test
    public void testMonthsBelowAverage() {
    StatsService service = new StatsService();
    long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    long actual = service.calculateMonthsBelowAverage(sales);
    long expected = 5;

    Assertions.assertEquals(expected, actual);
}
@Test
    public void testMonthsAboveAverage() {
    StatsService service = new StatsService();
    long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    long actual = service.calculateAverageSale(sales);
    long expected = 15;

    Assertions.assertEquals(expected, actual);
}
}