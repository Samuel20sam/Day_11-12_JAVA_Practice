package com.bridgelabz.oops.stocks;

import java.util.*;

public class StockPortfolio
{
    public static float total = 0;

    public Map<String, List<Stock>> map = new LinkedHashMap<>();
    Scanner in = new Scanner(System.in);


    public void stockValue ()
    {
        System.out.println("How many portfolio do you want to create");
        int portfolio = in.nextInt();
        for (int a = 1; a <= portfolio; a++)
        {
            System.out.println("Create an portfolio Name");
            String portfolioName = in.next();

            map.put(portfolioName, new LinkedList<>());
            System.out.println("Enter number of Stocks");
            int stocks = in.nextInt();

            for (int i = 1; i <= stocks; i++)
            {
                System.out.println("Share " +i +" Enter the share name");
                String shareName = in.next();
                System.out.println("Share " +i +" Enter the number of shares");
                int noOfShare = in.nextInt();
                System.out.println("Share " +i +" Enter share price of each stock");
                float sharePrice = in.nextFloat();

                Stock stock = new Stock(shareName, noOfShare, sharePrice);
                map.get(portfolioName).add(stock);
            }
        }
        display();
    }

    public void display ()
    {
        for (String key : map.keySet())
        {
            System.out.println("\nAccount Name:" + key);
            for (Stock info : map.get(key))
            {
                System.out.println  ("Stock Name: " + info.getShareName() +
                                     " | Number of Shares: " + info.getNoOfShare() +
                                     " | Share Price: " + info.getSharePrice() +
                                     " | Stock Value: " + info.getNoOfShare() * info.getSharePrice());

                total += (info.getNoOfShare() * info.getSharePrice());
            }
            System.out.println("The total value of all stocks of " +key +" is " + total);
        }
    }
}