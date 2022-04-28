package edu.handong.csee.java.hw2.math;
/**
 * this class is MathCalculator which calculate various commands and operations
 */
public class MathCalculator{ 
    private String name;
/**
 * this setter method receives a name of MathDriver and set the private variable.
 * @param args this parameter is a name of MathDriver
 */
    public void setName(String args){
        name=args;
    }  
/**
 * this getter method return the name of Mathdriver saved in private variable.
 * @return name this return a string value from private name variable
 */
    public String getName(){
        return name;
    } 
/**
 * getMax method return a bigger integer between two numbers received.
 * @param a number 1
 * @param b number 2
 * @return return a bigger number between two input numbers
 */
    public int getMax(int a, int b){
        if(a>b) return a;
        else return b;
    }
/**
 * getMin method return a smaller integer between two numbers received.
 * @param a number 1
 * @param b number 2
 * @return return a smaller number between two input numbers
 */
    public int getMin(int a, int b){
        if(a<b) return a;
        else return b;
    } 
/**
 * getAbs method return an absolute value of a number received.
 * @param a number will convert to absolute value
 * @return return an absolute value of input number if it is negative number.
 */
    public int getAbs(int a){
        if(a<0) return(-1*a);
        else return a;
    }
/** 
 * getSum method return a sum of two numbers received.
 * @param a number 1
 * @param b number 2
 * @return return a sum of two input numbers
 */
    public int getSum(int a, int b){
        return a+b;
    }
/**
 * getDiff method return a smaller integer between two number received.
 * @param a number 1
 * @param b number 2
 * @return return a difference between two input number
 */
    public int getDiff(int a, int b){
        return a-b;
    }
/**
 * getProduct method return a product between two number received.
 * @param a number 1
 * @param b number 2
 * @return return a product of two input number
 */
    public int getProduct(int a, int b){
        return a*b;
    }
/**
 * getQuotient method return a Quotient between two number received.
 * @param a number 1
 * @param b number 2 <br>it should not be 0
 * @return return a quotient of two number
 */
    public int getQuotient(int a, int b){
            return a/b;
    }
/**
 * getRemainder method return a remainder when dividing two number that received.
 * @param a number 1
 * @param b number 2 <br>it should not be 0
 * @return return a remainder of dividing of two input numbers
 */
    public int getRemainder(int a, int b){
        return a%b;
    }
/**
 * getPower method return a value that calculate nth power of value a.
 * @param a number 1 which is base
 * @param b number 2 which is exponent
 * @return return a nth power value of input number
 */
    public int getPower(int a, int b){
        if(b==0) return 1;
        else{   
            int tmp=a;
            for(int i=0; i<b-1; i++){
                tmp*=a;
            }
            return tmp;
        }
    }
/**
 * getFactorial method return a factorial of value a.
 * @param a number 1
 * @return return a factorial value of input number
 */
    public int getFactorial(int a){
        if(a==0) return 1;
        else{
            int factorial=1;
            for(int i=1; i<=a; i++){
                factorial*=i;
            }
            return factorial;
        }
    }
/**
 * getGcd method return the Greatest common divisor between two numbers received.
 * @param a number 1
 * @param b number 2
 * @return return a greatest common divisor of two input numbers
 */
    public int getGcd(int a, int b){
        int gcd=0;

        for(int i=1; i<=a && i<=b; i++){
            if(a%i==0 && b%i==0){
                gcd=i;
            }
        }
        return gcd;
    }
/**
 * getGcd method return the least common multiple of two numbers received.
 * @param a number 1
 * @param b number 2
 * @return return a least common multiple value of two input numbers
 */
    public int getLcm(int a, int b){
        int lcm;
        int i=1;

        while(true){
           if(i%a==0 && i%b==0){
            lcm=i;
            break;
           }
           i++;
        }
        return lcm;
    }
/**
 * getSquare method return a square value of value a.
 * @param a number 1
 * @return return a square value of input number
 */
    public int getSquare(int a){
        return a*a;
    }





}