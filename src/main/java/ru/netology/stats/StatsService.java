package ru.netology.stats;

public class StatsService {
    public long calculateTotalSale(long[] sales) {
        long totalSale = 0;
        for (long sale : sales) {
            totalSale += sale;
        }
        return totalSale;
    }


    public long calculateAverageSale(long[] sales) {
        long totalSale = 0;
        for (long sale : sales) {
            totalSale += sale;
        }
        long averageSale = totalSale / 12;
        return averageSale;
    }

    public int calculateMonthMaxSale(long[] sales) {
        int monthMax = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[monthMax]) {
                monthMax = i;
            }
        }
        return monthMax + 1;
    }

    public int calculateMonthMinSale(long[] sales) {
        int monthMin = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[monthMin]) {
                monthMin = i;
            }

        }
        return monthMin + 1;
    }
    public int calculateMonthsBelowAverage(long[] sales) {
        int counterBelowAverage = 0;
        long averageSale = calculateAverageSale(sales);
        for (long sale : sales) {
            if (sale < averageSale) {
                counterBelowAverage++;
            }
        }
        return counterBelowAverage;
    }

    public int calculateMonthsAboveAverage(long[] sales) {
        int counterAboveAverage =0;
        long averageSale = calculateAverageSale(sales);
        for (long sale : sales) {
            if (sale > averageSale) {
                counterAboveAverage++;
            }

        }
        return counterAboveAverage;
    }
}