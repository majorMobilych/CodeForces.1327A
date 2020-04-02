package com.app;

import com.solutions.SolutionsInterface;
import com.solutions.SolutionsInterfaceImpl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class RunApplication {
    private static final SolutionsInterface solver = new SolutionsInterfaceImpl();

    public static void main(String[] args) {
        List<String> listOfAnswers = new ArrayList<>();
        BufferedReader bufferedReader;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            int numberOfTests = Integer.parseInt(bufferedReader.readLine());
            for (int i = 0; i < numberOfTests; i++) {
                String currentTest = bufferedReader.readLine();
                listOfAnswers.add(solver.Solution(Integer.parseInt(currentTest.substring(0, currentTest.indexOf(" "))),
                        Integer.parseInt(currentTest.substring(currentTest.indexOf(" ") + 1))));
            }
            listOfAnswers.forEach(System.out::println);
        } catch (NumberFormatException | IOException exception) {
            System.out.print("Rerun the app. Please input a number of tests.");
            exception.printStackTrace();
        }
    }
}
