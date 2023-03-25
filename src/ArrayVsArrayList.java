import java.util.ArrayList;

public class ArrayVsArrayList {







    public static void main(String[] args) {

        int[] array =new int[10];
        ArrayList<Integer> list = new ArrayList<Integer>();

        array[0]=1;
        array[1]=2;
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);


        //print elements

        System.out.println(array[0]);

        System.out.println("List Value = "+list.get(1));

        System.out.println(array);

        System.out.println(list);
        //print full array or arraylist

        for(int e : array)

        System.out.println(e+",   ");

        System.out.println(list);



        //delete/remove

        list.remove(1);
        System.out.println(list);


        //edit/update

        array[9]=10;
        for(int e : array)

        System.out.println(e+",   ");
        list.set(0,1);

       System.out.println(list);








        
    }
    
}
