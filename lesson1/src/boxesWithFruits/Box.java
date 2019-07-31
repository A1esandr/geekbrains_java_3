package boxesWithFruits;

import java.util.ArrayList;

public class Box<T extends Fruit> {
    private ArrayList<T> fruits = new ArrayList<>();
    private static final Float emptyBoxWeight = 1.0f;

    public Box(T ... fruits){
        if(fruits != null && fruits.length > 0){
            for(T fruit : fruits){
                this.fruits.add(fruit);
            }
        }
    }

    public Float getWeight(){
        Float weight = emptyBoxWeight;
        if(fruits.size() > 0){
            for(T fruit : fruits){
                weight += fruit.getWeight();
            }
        }
        return weight;
    }

    public boolean compare(Box<?> box){
        boolean result = false;
        if(box != null && this.getWeight().equals(box.getWeight())){
            result = true;
        }
        return result;
    }

    public void pourTo(Box<T> box){
        if(box != null && this.fruits.size() > 0){
            for(T fruit : this.fruits){
                box.addFruit(fruit);
            }
            this.fruits = new ArrayList<>();
        }
    }

    public void addFruit(T fruit){
        if(fruit != null){
            this.fruits.add(fruit);
        }
    }
}
