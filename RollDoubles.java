/*
Write a java program to make rolling a pair of dice 10,000 times and counts
the number of times doubles of are rolled for each different pair of doubles. Hint:
Math.random()0

*/

public class RollDoubles {
    public static void main(String[] args) {
        int frequency1=0;
        int frequency2=0;
        int frequency3=0;
        int frequency4=0;
        int frequency5=0;
        int frequency6=0;
        int dice1,dice2;
        for (int roll=1;roll<=10000;roll++){
            dice1=(int)(Math.random()*10)%6+1;
            dice2=(int)(Math.random()*10)%6+1;
            if (dice1==dice2){
                switch(dice1){
                    case 1:     ++frequency1;
                                break;
                    case 2:     ++frequency2;
                                break;
                    case 3:     ++frequency3;
                                break;
                    case 4:     ++frequency4;
                                break;
                    case 5:     ++frequency5;
                                break;
                    case 6:     ++frequency6;
                                break;
                }
            }
        }
        System.out.println("Double\tFrequency");
        System.out.printf("1\t%d\n2\t%d\n3\t%d\n4\t%d\n5\t%d\n6\t%d\n",frequency1,frequency2,frequency3,frequency4,frequency5,frequency6);
        
    }

}
/*
Output :
 i. Double  Frequency
    1       413
    2       397
    3       399
    4       404
    5       97
    6       95
ii. Double  Frequency
    1       392
    2       404
    3       411
    4       411
    5       99
    6       104

*/

