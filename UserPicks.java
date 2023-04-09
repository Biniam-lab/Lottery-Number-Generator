import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class UserPicks {

    private int NUMBER_OF_NUMBERS;
    private int[] playingLine;
    private int LAST_NUMBER;

    public UserPicks(int NUMBER_OF_NUMBERS, int LAST_NUMBER) {
        this.NUMBER_OF_NUMBERS = NUMBER_OF_NUMBERS;
        this.LAST_NUMBER = LAST_NUMBER;
        playingLine = new int[NUMBER_OF_NUMBERS];
    }

    private int[] generate(){
        Scanner scanner = new Scanner(System.in);


        for(int i = 0; i< playingLine.length; i++){

            int checkNumber = scanner.nextInt();
            while(isRepeated(playingLine, checkNumber)){
                checkNumber = scanner.nextInt();
                isRepeated(playingLine, checkNumber);
            }
            playingLine[i] = checkNumber;

        }
        Arrays.sort(playingLine);
        return playingLine;
    }

    private boolean isRepeated(int[] array, int value){
        for(int i=0; i<array.length; i++){
            if (array[i] == value){
                System.out.println("Number is already picked");
                return true;
            }

        }
        return false;
    }


    public String toString(){
        return Arrays.toString(generate());
    }
}
