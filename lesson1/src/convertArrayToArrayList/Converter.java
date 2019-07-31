package convertArrayToArrayList;

import java.util.ArrayList;

public class Converter<T> {
    private T[] arr;

    public Converter (T[] given) {
        this.arr = given;
    }

    public ArrayList<T> convert(){
        ArrayList<T> result = null;

        if(arr != null && arr.length > 0){
            result = new ArrayList<T>();
            for(T el : arr){
                result.add(el);
            }
        } else if(arr != null) {
            result = new ArrayList<T>();
        }

        return result;
    }
}
