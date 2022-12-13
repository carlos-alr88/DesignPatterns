package com.example.interview_exercise.model;

import java.util.*;

public class FirstNnumbers implements MissingNumberProblem{
    private Set<Integer> numbers = new TreeSet<>();

    public FirstNnumbers(){
        for (int i =1; i<=100; i++){
            numbers.add(i);
        }
    }

    @Override
    public boolean extract(int i) {
        if (numbers.contains(i)){
            numbers.remove(i);
            return true;
        }

        return false;
    }

    public Set<Integer> getNumbers() {
        return numbers;
    }

}
