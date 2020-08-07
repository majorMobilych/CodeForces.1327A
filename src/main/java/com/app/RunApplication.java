package com.app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import static com.solutions.Solutions.solution;

/**
 * @author majorMobilych, https://github.com/majorMobilych;
 * @see com.solutions.Solutions, public static String solution(int number, int amountOfTerms);
 */
public class RunApplication {

    public static void main(String[] args) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Please, enter number of test:");
            /* Integer.parseInt(String s) throws NumberFormatException - if input String isn't a number */
            int t = Integer.parseInt(bufferedReader.readLine());

            List<String> listOfAnswers = new ArrayList<>();
            for (int i = 0; i < t; i++) {
                System.out.println("Please, enter data for test " + i + ":");
                String currentTest = bufferedReader.readLine();

                /* 'n' stands for 'number' solution(int number, int amountOfTerms), Solutions.class,
                 * Integer.parseInt(String s) throws NumberFormatException - if input String isn't a number */
                int n = Integer.parseInt(currentTest.substring(0, currentTest.indexOf(" ")));
                /* 'k' stands for 'amountOfTerms' in solution(int number, int amountOfTerms), Solutions.class,
                 * Integer.parseInt(String s) throws NumberFormatException - if input String isn't a number */
                int k = Integer.parseInt(currentTest.substring(currentTest.indexOf(" ") + 1));

                listOfAnswers.add(solution(n, k));
            }
            listOfAnswers.forEach(System.out::println);
        } catch (NumberFormatException | IOException exception) {
            System.out.print("Rerun the app. Please input data correctly.");
            exception.printStackTrace();
        }
    }
}
