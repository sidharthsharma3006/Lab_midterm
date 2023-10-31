package com.example.person_validation;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
 
	  @Test
	    public void testCorrectInput() {
	        assertTrue(App.validatePerson("ram", 3025));
	    }

	    @Test
	    public void testIncorrectName() {
	        assertFalse(App.validatePerson("alice", 3025));
	    }

	    @Test
	    public void testIncorrectId() {
	        assertFalse(App.validatePerson("ram", 1234));
	    }

	    @Test
	    public void testIncorrectNameAndId() {
	        assertFalse(App.validatePerson("alice", 1234));
	    }
  
}




