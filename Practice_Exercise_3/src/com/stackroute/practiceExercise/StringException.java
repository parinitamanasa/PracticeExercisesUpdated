package com.stackroute.practiceExercise;

public class StringException {
    public static void main(String[] args){
        try {
            throw new Exception("String Exception encountered");
        }catch (Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("Reached finally block after try catch;");
        }
        System.out.println("Rest of the code");
    }
}
