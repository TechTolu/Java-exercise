package chapterSix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KataTest {

    @Test
    public void aGradeCanBeCalculatedTest(){
        Kata kata = new Kata();
        char result = kata.calculateGradeFor(98);
        assertEquals('A', result);
    }
    @Test
    public void bGradeCanBeCalculatedTest(){
        Kata gradeSomething = new Kata();
        char result = gradeSomething.calculateGradeFor(89);
        assertEquals('B', result);
    }
    @Test
    public void cGradeCanBeCalculatedTest(){
        Kata gradeSomething = new Kata();
        char myResult = gradeSomething.calculateGradeFor(79);
        assertEquals('C', myResult);
    }
    @Test
    public void dGradeCanBeCalculatedTest(){
        Kata gradeSomething = new Kata();
        char myResult = gradeSomething.calculateGradeFor(65);
        assertEquals('D', myResult);
    }
    @Test
    public void fGradeCanBeCalculatedTest(){
        Kata gradeSomething = new Kata();
        char myResult = gradeSomething.calculateGradeFor(59);
        assertEquals('F', myResult);

    }
}
