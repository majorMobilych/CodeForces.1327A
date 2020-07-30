package com.app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import static com.solutions.Solutions.solution;

public class RunApplication {

    public static void main(String[] args) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Please, enter number of test:");
            int numberOfTests = Integer.parseInt(bufferedReader.readLine());

            List<String> listOfAnswers = new ArrayList<>();
            for (int i = 0; i < numberOfTests; i++) {
                System.out.println("Please, enter data for test " + i + ":");
                String currentTest = bufferedReader.readLine();

                listOfAnswers.add(solution(Integer.parseInt(currentTest.substring(0, currentTest.indexOf(" "))),
                        Integer.parseInt(currentTest.substring(currentTest.indexOf(" ") + 1))));
            }
            listOfAnswers.forEach(System.out::println);
        } catch (NumberFormatException | IOException exception) {
            System.out.print("Rerun the app. Please input a number of tests.");
            exception.printStackTrace();
        }
    }
}
