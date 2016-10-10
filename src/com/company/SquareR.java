package com.company;

/**
 * Created by jg101 on 10/10/16.
 */
import java.util.Random;
public class SquareR {

    public String name = "";

    public SquareR(String n) {
        name = n;

    }
    public int squ(){

            Random rn = new Random();
            int ran = 0;

            while(true){
                ran = rn.nextInt(2147483647);
                double ranS = Math.sqrt(ran);

                if ((ranS % 1) == 0 ){
                    break;
                }
                else {

                }
            }

            return ran;



        }










}
