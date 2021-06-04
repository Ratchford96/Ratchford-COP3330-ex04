
/*
 * UCF COP3330 Summer 2021 Assignment 1 Solution
 * Copyright 2021 Joseph Ratchford
 */
import java.util.Scanner;
public class MadLib {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a noun:");
        String noun = input.nextLine();

        System.out.print("Enter a verb:");
        String verb = input.nextLine();

        System.out.print("Enter a adjective");
        String adjective = input.nextLine();

        System.out.print("Enter a adverb");
        String adverb = input.nextLine();

        String output = "Do you " + verb + " your" + adjective + noun + adverb + " ? , That's hilarious!";

        System.out.println(output);


    }
}
