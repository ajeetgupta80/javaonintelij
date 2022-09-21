package generic;

import java.util.ArrayList;
import java.util.Arrays;



// here problem with our custom list it can only add integer but it cannot be a list of character
// or boolean or something else in this list we cannot define its type like the original one
// <INTEGER> this problem can be solve through generic

public class customarraylist {

  private  int[] data;
  private static int DEFAULT_SIZE = 10;
  private int size = 0;

  public customarraylist()
  {
      this.data = new int[DEFAULT_SIZE];
  }


  public void add(int num)
  {
      if(isFull())
      {
          resize();
      }
      data[size++]= num;
  }


  private boolean isFull()
  {
      return size == data.length;
  }

  private void resize()
  {
      int[] temp = new int[data.length *2];
      // copy the current item in new array
      for(int i=0; i<data.length; i++)
      {
          temp[i]= data[i];
      }
      data = temp;

  }

  public int remove()
  {
      int removed = data[--size];
      return removed;
  }

  public int get(int index)
  {
      return data[index];
  }

  public int size()
  {
      return size;
  }

  public void set(int index, int value)
  {
      data[index]= value;
  }
    @Override
    public String toString() {
        return "{" + Arrays.toString(data) + "}" + "size = " + size;
    }



    public static void main(String[] args) {
      customarraylist list = new customarraylist();
      list.add(99);
      list.add(990);
      System.out.println(list);


      ArrayList<Integer> list2 = new ArrayList<>();


    }
}
