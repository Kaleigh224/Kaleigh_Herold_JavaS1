package com.company;

public class ModulusAnimation {
    public static void main( String[] args ) throws Exception {
        for ( int i=0; i<80; i++ )
        {
            if ( i%10 == 0 )
                System.out.print(" _____$$$$_________$$$$                 \r");
            else if ( i%16 == 1)
                System.out.println("___$$$$$$$$_____$$$$$$$$                 \r");
            else if ( i%16 == 2)
                System.out.println("_$$$$$$$$$$$$_$$$$$$$$$$$$                 \r");
            else if ( i%16 == 3)
                System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$                 \r");
            else if ( i%16 == 4)
                System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$                 \r");
            else if ( i%16 == 5)
                System.out.println("_$$$$$$$$$$$$$$$$$$$$$$$$$                 \r");
            else if ( i%16 == 6)
                System.out.println("__$$$$$$$$$$$$$$$$$$$$$$$                 \r");
            else if ( i%16 == 7)
                System.out.println("____$$$$$$$$$$$$$$$$$$$                 \r");
            else if ( i%16 == 8)
                System.out.println("_______$$$$$$$$$$$$$                 \r");
            else if ( i%16 == 9)
                System.out.println("__________$$$$$$$                 \r");
            else if ( i%16 == 10)
                System.out.println("____________$$$                 \r");
            else if ( i%16 == 6)
                System.out.println("_____________$                 \r");




/*
_____$$$$_________$$$$
___$$$$$$$$_____$$$$$$$$
_$$$$$$$$$$$$_$$$$$$$$$$$$
$$$$$$$$$$$$$$$$$$$$$$$$$$$
$$$$$$$$$$$$$$$$$$$$$$$$$$$
_$$$$$$$$$$$$$$$$$$$$$$$$$
__$$$$$$$$$$$$$$$$$$$$$$$
____$$$$$$$$$$$$$$$$$$$
_______$$$$$$$$$$$$$
__________$$$$$$$
____________$$$
_____________$


 */



            Thread.sleep(200);
        }
    }

}


