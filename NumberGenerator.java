import java.util.Arrays;
import java.util.Random;

public class NumberGenerator {

    private int NUMBER_OF_NUMBERS;
    private int[] playingLine;
    private int LAST_NUMBER;
    public NumberGenerator(int NUMBER_OF_NUMBERS, int LAST_NUMBER) {
        this.NUMBER_OF_NUMBERS = NUMBER_OF_NUMBERS;
        this.LAST_NUMBER = LAST_NUMBER;
        playingLine = new int[NUMBER_OF_NUMBERS];
    }

    public NumberGenerator() {
    }

    public int getNUMBER_OF_NUMBERS() {
        return NUMBER_OF_NUMBERS;
    }

    public void setNUMBER_OF_NUMBERS(int NUMBER_OF_NUMBERS) {
        this.NUMBER_OF_NUMBERS = NUMBER_OF_NUMBERS;
    }

    private int[] generate(){
        Random random = new Random();

        for(int i = 0; i< playingLine.length; i++){

            int checkNumber = random.nextInt(LAST_NUMBER);
            while(isRepeated(playingLine, checkNumber)){
                checkNumber = random.nextInt(LAST_NUMBER);
                isRepeated(playingLine, checkNumber);
            }
            playingLine[i] = checkNumber;
        }
        Arrays.sort(playingLine);
        return playingLine;


    }

    private boolean isRepeated(int[] array, int value){
        for(int i=0; i<array.length; i++){
            if (array[i] == value)
                return true;
        }
        return false;
    }


    public String toString(){
        return Arrays.toString(generate());
    }




}
