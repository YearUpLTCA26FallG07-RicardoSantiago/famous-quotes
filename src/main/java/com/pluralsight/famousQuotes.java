package com.pluralsight;

import java.util.Scanner;



public class famousQuotes {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //list array

        String[] quotes = new String[10];

        quotes[0] = "The only thing we have to fear is fear itself. - Franklin D. Roosevelt";
        quotes[1] = "I think, therefore I am. - René Descartes";
        quotes[2] = "That's one small step for man, one giant leap for mankind. - Neil Armstrong";
        quotes[3] = "Be the change that you wish to see in the world. - Mahatma Gandhi";
        quotes[4] = "In the middle of difficulty lies opportunity. - Albert Einstein";
        quotes[5] = "The unexamined life is not worth living. - Socrates";
        quotes[6] = "Success is not final, failure is not fatal: it is the courage to continue that counts. - Winston Churchill";
        quotes[7] = "To be yourself in a world that is constantly trying to make you something else is the greatest accomplishment;. - Ralph Waldo Emerson";
        quotes[8] = "Life is what happens when you're busy making other plans. - John Lennon";
        quotes[9] = "The journey of a thousand miles begins with a single step. - Lao Tzu";

        //menu interface

        int command = 0;

        while (command != 3) {

            System.out.println("""
                    Welcome! What do you want to do?
                    
                    1 - See a quote
                    2 - Add a quote
                    3 - Get random quote
                    
                    Enter your command: """);
            command = scanner.nextInt();
            scanner.nextLine();

            //case commands

            switch (command) {
                case 1:
                    System.out.println("Which quote would you like to see? 1-10");

                    int quoteNumber = scanner.nextInt();

                    if (quoteNumber >= 1 && quoteNumber <= quotes.length) {
                        System.out.println(quotes[quoteNumber - 1]);
                    } else {
                        System.out.println("Invalid quote number");
                    }
                    break;


            }
        }
    }
}