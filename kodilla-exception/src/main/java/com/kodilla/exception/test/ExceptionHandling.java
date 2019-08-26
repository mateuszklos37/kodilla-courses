package com.kodilla.exception.test;


public class ExceptionHandling {
        public void errorHandle(){
            SecondChallenge second = new SecondChallenge();
            try {
                second.probablyIWillThrowException(2.6, 2.5);
            }
            catch (Exception e){
                System.out.println("Forbidden values: x must be 1.0-1.99 and y must be different than 1.5!");
            }
            finally {
                System.out.println("Insert the next step, please");
            }

        }
}
