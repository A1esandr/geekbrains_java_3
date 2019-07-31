package convertArrayToArrayList;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Integer[] anArray = {1, 2, 3};

        if(anArray instanceof Integer[]){
            System.out.println("anArray is simple array");
        }

        Converter<?> converter = new Converter<>(anArray);
        ArrayList<?> converted = converter.convert();

        if(converted instanceof ArrayList<?>){
            System.out.println("converted is ArrayList");
            System.out.println(String.format("Type of element in converted: %s", converted.get(0).getClass()));
        }
    }
}
