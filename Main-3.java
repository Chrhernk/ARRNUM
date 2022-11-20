package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner SC =  new Scanner(System.in);

        ClassJavaCharacter[] CrewMate = {new ClassJavaCharacter(),new ClassJavaCharacter(),new ClassJavaCharacter(),
            new ClassJavaCharacter(), new ClassJavaCharacter(),new ClassJavaCharacter(),
            new ClassJavaCharacter(),new ClassJavaCharacter(),new ClassJavaCharacter(),new ClassJavaCharacter()}; // array making the characters

        String[] CrewNames = {"Bunmiir","Thorrigg","Thernam","Thalkyl","Brumnyl","Bunnus","Bhelmin","Karna","Horbrek", "Vonrus"}; // names stored in an array
        int [] RoomAssignments = {421,799,994,205,716,768,867,129,145,29}; // room number array

        PT("Hello System Tech! This is our current roster, Please be careful to note who is where, and which room numbers need serviced!"); // introduction
        PT("Here is our current roster below, please be well aware, This will update every few months from crew changes!"); // introduction

        Random rand = new Random(); // inting the random generation

        int i; // int for the for loop

        while (true) // while it returns true, it will loop this function
        {


            for (i = 0; i < CrewMate.length; i++) {
                CrewMate[i]._mFirstName = CrewNames[i]; // sets all crew member names from array
                int UnusedRoomCount = RoomAssignments.length - i; // Index of last unused room
                int rand_int1 = rand.nextInt(UnusedRoomCount); // Picking the random number between 0 - Last Unused room
                CrewMate[i]._mRoomNumber = RoomAssignments[rand_int1]; // assigned selected to crew mate
                RoomAssignments[rand_int1] = RoomAssignments[UnusedRoomCount - 1]; // Swaps the last selected room index with last unused room index
                RoomAssignments[UnusedRoomCount - 1] = CrewMate[i]._mRoomNumber;    // Swaps the last selected room index with last unused room index
                CrewMate[i].Talk("Hello all!"); // prints the Name, and Room Number for that loop
            }
            PT("Are these room numbers Acceptable?"); // asking the question to the user
            PT("[Yes] or [No]"); // showing the choices
            String Choice1 = SC.nextLine(); // user choice
            if (Choice1.equals("Yes")) {break;} // breaks the loop if yes is chosen

        }
    }
    static void PT(String stufftoSay) {System.out.println(stufftoSay);} // A simplified output method!

}
