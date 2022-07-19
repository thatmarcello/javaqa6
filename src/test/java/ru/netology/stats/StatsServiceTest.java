package ru.netology.stats;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class StatsServiceTest {

    @Test
    public void shouldFindSumSales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedSum = 180;
        int actualSum = service.salesSum(sales);

        Assertions.assertEquals(expectedSum, actualSum);

    }

    @Test
    public void shouldFindAverage() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedAvg = 15;
        int actualAvg = service.avgSales(sales);

        Assertions.assertEquals(expectedAvg, actualAvg);
    }

    @Test
    public void shouldFindMinSale() {
        StatsService service = new StatsService();
        int[] sales = {20, 15, 13, 15, 17, 20, 19, 3, 6, 14, 14, 18};
        int expectedMinSale = 8;
        int actualMinSale = service.getMonthMinSale(sales);

        Assertions.assertEquals(expectedMinSale, actualMinSale);
    }

    @Test
    public void shouldFindMaxSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMaxSale = 8;
        int actualMaxSale = service.getMonthMaxSale(sales);

        Assertions.assertEquals(expectedMaxSale, actualMaxSale);
    }

    @Test
    public void  shouldFindMonthsSalesLessThaneAvg() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonths = 5;
        int actualMonths = service.getMonthsSalesLessAvg(sales);

        Assertions.assertEquals(expectedMonths, actualMonths);
    }

    @Test
    public void shouldFindMonthsSalesHigherThaneAvg() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonths = 5;
        int actualMonths = service.getMonthsSalesHigherAvg(sales);

        Assertions.assertEquals(expectedMonths, actualMonths);
    }

}
