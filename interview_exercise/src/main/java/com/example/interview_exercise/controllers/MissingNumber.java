package com.example.interview_exercise.controllers;

import com.example.interview_exercise.model.FirstNnumbers;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class MissingNumber {
    static FirstNnumbers model = new FirstNnumbers();

    @DeleteMapping("/extract")
    public ResponseEntity<?> findMissingNumber(@RequestParam int num) {
        if (num > 100) {
            return new ResponseEntity<Object>("Parameter " + num+ " must be < 100", HttpStatus.BAD_REQUEST);
        }

        model.extract(num);
        // Implement the findMissingNumber function here
        // Return true if the number is missing, otherwise return false
        return new ResponseEntity<Object>(
                "Success",
                HttpStatus.OK);
    }

    @GetMapping("/allNumbers")
    public ResponseEntity<?> findMissingNumber() {
        return new ResponseEntity<Object>(
                model.getNumbers(),
                HttpStatus.OK);
    }
}
