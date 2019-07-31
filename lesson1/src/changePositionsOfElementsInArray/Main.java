package changePositionsOfElementsInArray;

public class Main {
    public static void main(String[] args){
        Integer[] anArray = {1, 2, 3};
        String[] strArray = {"test1", "test2", "test3"};
        String[] strArraySingle = {"single"};

        System.out.println(anArray[0]);
        System.out.println(anArray[1]);
        System.out.println(anArray[2]);

        Reverser<Integer> reverser = new Reverser<Integer>(anArray);
        Integer[] reversed = reverser.reverse();

        System.out.println(reversed[0]);
        System.out.println(reversed[1]);
        System.out.println(reversed[2]);

        // String
        System.out.println(strArray[0]);
        System.out.println(strArray[1]);
        System.out.println(strArray[2]);

        Reverser<String> reverserStr = new Reverser<String>(strArray);
        String[] reversedStr = reverserStr.reverse();

        System.out.println(reversedStr[0]);
        System.out.println(reversedStr[1]);
        System.out.println(reversedStr[2]);

        // null
        Reverser<String> reverserNull = new Reverser<String>(null);
        String[] reversedNull = reverserNull.reverse();

        System.out.println(reversedNull);

        // Array with single element
        Reverser<String> reverserSingle = new Reverser<String>(strArraySingle);
        String[] reversedSingle = reverserSingle.reverse();

        System.out.println(reversedSingle[0]);
    }


}
