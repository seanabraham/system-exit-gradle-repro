/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package me.seanabraham;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    @Test public void testAppHasAGreeting() {
        App classUnderTest = new App();
        classUnderTest.doAThing();
        assertNotNull("app should have a greeting", classUnderTest.getGreeting());
    }

    @Test public void fakeTest() {
        System.out.println("Hi");
    }
}