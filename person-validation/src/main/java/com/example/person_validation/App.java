package com.example.person_validation;

/**
 * Hello world!
 *
 */
public class App 
{
	public static boolean validatePerson(String name, int id) {
        if ("Ram".equals(name) && id == 3025) {
            return true; 
        }
        return false; 
    }
}
