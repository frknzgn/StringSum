package test.java;

import main.java.Main;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StringSumUnitTest {

    @Test
    public void one_plus_one_equals_two(){

        //Arrange
       String num1 = "1";
       String num2 = "1";
       String expected = "2";

       //Act //when
        String actual = Main.sum(num1,num2);

        //Assert //then
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void beyondLong_plus_one_equals_wayBeyondlong(){

        //Arrange
        String num1 = "191991919199191919911191919999999999999999999999999999999999999999";
        String num2 = "1";
        String expected = "191991919199191919911191920000000000000000000000000000000000000000";

        //Act //when
        String actual = Main.sum(num1,num2);

        //Assert //then
        Assertions.assertEquals(expected,actual);
    }
}
