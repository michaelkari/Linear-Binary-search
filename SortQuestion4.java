import java.util.*;

public class SortQuestion4{
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
      System.out.println("Would you like to search array A(1), B(2), or C(3)?");
      choice2=sc.nextInt();
      while(!(choice2==1||choice2==2||choice2==3)){
        System.out.println("Please enter 1, 2, or 3");
        choice2=sc.nextInt();
      }
      if(choice2==1){
        int[] a={2,  9 , 4, 8, 0, 10, 15, 16, 19, 2, 1};
        for(int i=0;i<a.length;i++){
          System.out.print(a[i]+", ");
        }
        int check=4;
        System.out.println("\nInt checking for: "+check+"\n");
        System.out.println("The index of "+check+" is "+(linear(a,check)));
      }
      if(choice2==2){
        int[] a={45, 98, 56 ,84, 12, 13, 54 , 89, 105, 94};
        for(int i=0;i<a.length;i++){
          System.out.print(a[i]+", ");
        }
        int check=12;
        System.out.println("\nInt checking for: "+check+"\n");
        System.out.println("The index of "+check+" is "+(linear(a,check)));
      }
      if(choice2==3){
        int[] a={5, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 500};
        for(int i=0;i<a.length;i++){
          System.out.print(a[i]+", ");
        }
        int check=59;
        System.out.println("\nInt checking for: "+check+"\n");
        System.out.println("The index of "+check+" is "+(linear(a,check)));
      }
    }
    if(linorbin==2){
      System.out.println("Would you like to search array A(1), B(2), or C(3)?");
      choice=sc.nextInt();
      while(!(choice==1||choice==2||choice==3)){
        System.out.println("Please enter 1, 2, or 3");
        choice=sc.nextInt();
      }
      if(choice==1){
        int[] a={1,54,84,86,97,105,121,151,152,200};
        for(int i=0;i<a.length;i++){
          System.out.print(a[i]+", ");
        }
        int check=84;
        System.out.println("\nInt checking for: "+check+"\n");
        System.out.println("The index of "+check+" is "+(binary(a,check)));
      }
      if(choice==2){
        int[] a={5, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 500};
        for(int i=0;i<a.length;i++){
          System.out.print(a[i]+", ");
        }
        int check=59;
        System.out.println("\nInt checking for: "+check+"\n");
        System.out.println("The index of "+check+" is "+(binary(a,check)));
      }
      if(choice==3){
        int[] a={58, 94, 100, 200, 500, 501, 800, 801, 802, 803};
        for(int i=0;i<a.length;i++){
          System.out.print(a[i]+", ");
        }
        int check=501;
        System.out.println("\nInt checking for: "+check+"\n");
        System.out.println("The index of "+check+" is "+(binary(a,check)));
      }
    }
    
  }
  public static int binary(int[]a, int check){
    int hi=a.length-1;
    int low=0,guess=0;
    System.out.println("High: "+hi);
    System.out.println("Low: "+low);
    System.out.println("Guess: "+guess+"\n");
    
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
      System.out.println("High: "+hi);
      System.out.println("Low: "+low);
      System.out.println("New Guess: "+guess+"\n");
    }
    return-1;
  }
  public static int linear(int[]a, int check){
    int index=-1;
    System.out.println("Original Index: "+index+"\n");
    for(int i=0;i<a.length-1;i++){
      if(a[i]==check){
        index=i;
      }
      System.out.println("i: "+i);
      System.out.println("Index: "+index+"\n");
    }
    return index;
  }
}