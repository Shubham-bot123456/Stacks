import java.util.Arrays;
import java.util.List;

public class NewStack {


    private Integer []array;
    private int counter;


    public NewStack(){
        array=new Integer[10];
        counter=0;
    }
    public void push(int number){
        array[counter++]=number;
    }


    public int size(){
        return counter;
    }


    public int pop(){
        int temp= array[--counter];
        array[counter]=null;
        return temp;
    }


    public int peek(){
        if(counter==0)throw new IllegalStateException("the array is null!");
        return array[counter-1];
    }


    public List<Integer> toStringArray(){
       Integer[] copyArray=  Arrays.copyOfRange(array,0,counter);
        return Arrays.asList(copyArray);
    }


}
