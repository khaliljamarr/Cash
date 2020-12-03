package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner coins = new Scanner(System.in);

        int coincount = 0;
        float total;

        do {
            System.out.print("How much change is owed? ");
            total = coins.nextFloat();
        }
        while (total <= 0.00);

        int cents = Math.round(total * 100);

        while (cents >= 25)
        { coincount++;
            cents -= 25;
        }

        while (cents >= 10)
        { coincount++;
            cents -= 10;
        }

        while (cents >= 5)
        { coincount++;
            cents -= 5;
        }

        while (cents >= 1)
        { coincount++;
            cents -= 1;
        }

        System.out.println( "You will receive " + coincount + " coins.");
    }
}
