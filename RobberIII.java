import java.util.*;
public class RobberIII
{
      public int RobbingKHouses(int houses[], int k)
      {
            int Min = Integer.MAX_VALUE;
            if(k == (int)(houses.length/2))
            {
                  int MaxOdd = 0, MaxEven = 0;
                  for(int i = 0; i< houses.length; i++)
                  {
                        if(i % 2 == 0)
                              MaxEven = Math.max(MaxEven, houses[i]);
                        else
                              MaxOdd = Math.max(MaxOdd, houses[i]);
                  }
                  return Math.min(MaxEven, MaxOdd);
            }
            else if(k < houses.length)
            {
                  for(int i = 0; i < houses.length; i++)
                        Min = Math.min(Min, houses[i]);
            }
            return Min;
      }
      public static void main(String args[])
      {
            Scanner sc = new Scanner(System.in);
            int x;
            System.out.print("Enter number of Houses : ");
            x = sc.nextInt();
            int array[] = new int[x];
            for(int i = 0; i < array.length; i++)
            {
                  System.out.print("Enter loot : ");
                  array[i] = sc.nextInt();
            }
            System.out.print("Enter value of K : ");
            x = sc.nextInt();
            RobberIII robberIII = new RobberIII();
            System.out.println("The Maximum Loot possible after robbing k Houses : "+robberIII.RobbingKHouses(array, x));
            sc.close();
      }
}