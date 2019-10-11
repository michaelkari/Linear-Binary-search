import java.util.*;

public class SortQuestion5{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int choice=0;
    int choice2=0;
    int linorbin;
    System.out.println("Would you like to linear search(1) or binary search(2)");
    linorbin=sc.nextInt();
    while(!(linorbin==1||linorbin==2)){
      System.out.println("Please enter 1 or 2");
      linorbin=sc.nextInt();
    }
    if(linorbin==1){
      int[] a={2,  9 , 4, 8, 0, 10, 15, 16, 19, 2, 1};
        for(int i=0;i<a.length;i++){
          System.out.print(a[i]+", ");
        }
        int check=4;
        System.out.println("\nInt checking for: "+check+"\n");
        long startTime   = System.nanoTime();
        int index=linear(a,check);
        long endTime   = System.nanoTime();
        System.out.println("NanoTime = "+(endTime-startTime));
        System.out.println("The index of "+check+" is "+index);
    }
    if(linorbin==2){
      int[] a={0, 1, 2, 2, 4, 8, 9, 10, 15, 16, 19};
      for(int i=0;i<a.length;i++){
        System.out.print(a[i]+", ");
      }
      int check=4;
      System.out.println("\nInt checking for: "+check+"\n");
      long startTime   = System.nanoTime();
      int index=binary(a,check);
      long endTime   = System.nanoTime();
      System.out.println("NanoTime = "+(endTime-startTime));
      System.out.println("The index of "+check+" is "+index);
    }
  }
  public static int binary(int[]a, int check){
    int hi=a.length-1;
    int low=0,guess=0;
    while(hi>=low){
      guess=low+((hi-low)/2);
      if(a[guess]>check){
        hi=guess-1;
      }
      else if(a[guess]<check){
        low=guess+1;
      }
      else{
        return guess;
      }
    }
    return-1;
  }
  public static int linear(int[]a, int check){
    int index=-1;
    for(int i=0;i<a.length-1;i++){
      if(a[i]==check){
        index=i;
      }
    }
    return index;
  }
}