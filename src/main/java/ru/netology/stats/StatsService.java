package ru.netology.stats;

public class StatsService {

    //Сумма продаж
    
    public int salesSum(int[] sales) {
        int sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }
        return sum;
    }

    //Cредняя сумма продаж в месяц
    
    public int avgSales(int[] sales) {
        int avg = salesSum(sales) / sales.length;
        return avg;
    }

    //Номер месяца, в котором был минимум продаж (осуществлены продажи на минимальную сумму)

    public int getMonthMinSale(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    //Номер месяца, в котором был минимум продаж (осуществлены продажи на минимальную сумму)

    public int getMonthMaxSale(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    //Кол-во месяцев, в которых продажи были ниже среднего

    public int getMonthsSalesLessAvg(int[] sales) {
        int monthsLessAvg = 0;
        int average = avgSales(sales);
        for (int sale : sales) {
            if (sale < average) {
                monthsLessAvg = monthsLessAvg + 1;
            }
        }
        return monthsLessAvg;
    }

    //Кол-во месяцев, в которых продажи были выше среднего
    
    public int getMonthsSalesHigherAvg(int[] sales) {
        int monthsHighAvg = 0;
        int average = avgSales(sales);
        for (int sale : sales) {
            if (sale > average) {
                monthsHighAvg = monthsHighAvg + 1;
            }
        }
        return monthsHighAvg;
    }

}
