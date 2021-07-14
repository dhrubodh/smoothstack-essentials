/**
 * 
 */
package com.smoothstack.javabasics.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.smoothstack.javabasics.four.Line;

/**
 * @author dhrubo
 *
 *
 *JUnit Testing for Line Class
 */
public class LineTest {
	
    @Test
    public void getSlopeTest() {
        Line line = new Line(1, 2, 3, 4);
        assertEquals(1, line.getSlope(), 0.0001);

        line = new Line(1, 2, 1, 3);
        assertThrows(ArithmeticException.class, line::getSlope);
    }

    @Test
    public void getDistanceTest() {
        Line line = new Line(1, 2, 3, 4);
        assertEquals(Math.sqrt(8), line.getDistance(), 0.0001);
    }

    @Test
    public void parallelToTest() {
        Line lineOne = new Line(1,2,3,4);
        Line lineTwo = new Line(2,4,6,8);
        Line lineThree = new Line(2,4,6,9);


        assertTrue(lineOne.parallelTo(lineTwo));
        assertFalse(lineOne.parallelTo(lineThree));
    }
	
}
