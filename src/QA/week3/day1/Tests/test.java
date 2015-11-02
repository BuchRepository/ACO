package QA.week3.day1.Tests;


import QA.week3.day1.Logger.Log4Test;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

public class test {
    private static final Logger LOGGER = Logger.getLogger(Log4Test.class);
    public void SomeMethod(){
        LOGGER.info("Some log");

        try{
            throw new Exception ("Some exception");
        } catch (Exception e){
            LOGGER.log(Level.ERROR, "Exception", e);
        }LOGGER.info("some minor");
    }


    public static void main(String[]args){
        test t = new test();
        t.SomeMethod();




        }
        }