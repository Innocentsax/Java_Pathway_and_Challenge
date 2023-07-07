package org.example.JUnit_Testing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GraderTest {

    @Test
    void CheckNumberToScore(){
        var grader = new Grader();
        assertEquals('F', grader.determineLetterGrade(59));
    }
    @Test
    void CheckNumberToScore1(){
        var grader = new Grader();
        assertEquals('D', grader.determineLetterGrade(69));
    }
    @Test
    void CheckNumberToScore2(){
        var grader = new Grader();
        assertEquals('C', grader.determineLetterGrade(79));
    }
    @Test
    void CheckNumberToScore3(){
        var grader = new Grader();
        assertEquals('B', grader.determineLetterGrade(89));    }
    @Test
    void CheckNumberToScore4(){
        var grader = new Grader();
        assertEquals('A', grader.determineLetterGrade(99));
    }
    void CheckNumberToScore5(){
        var grader = new Grader();
        assertThrows(IllegalArgumentException.class, () -> {grader.determineLetterGrade(-1);});
    }

}