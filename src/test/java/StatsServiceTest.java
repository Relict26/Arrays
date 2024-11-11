package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StatsServiceTest {

    @Test
    public void testSumSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        assertEquals(180, service.sumSales(sales));
    }

    @Test
    public void testAverageSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        assertEquals(15.0, service.averageSales(sales));
    }

    @Test
    public void testMaxSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        assertEquals(6, service.maxSales(sales));
    }

    @Test
    public void testMinSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        assertEquals(9, service.minSales(sales));
    }

    @Test
    public void testCountMonthsBelowAverage() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        assertEquals(5, service.countMonthsBelowAverage(sales));
    }

    @Test
    public void testCountMonthsAboveAverage() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        assertEquals(5, service.countMonthsAboveAverage(sales));
    }
}