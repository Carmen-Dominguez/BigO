/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bigo;

import java.util.List;
import java.util.Map;
import java.util.Arrays;
import javax.swing.*;

/**
 *
 * @author cdomi
 */
public class BigO {

    public BigO() {
    }

    //Example of Big O (1)
    public void insert(int number) {
        if (number != 0) {
            System.out.println("This number is not zero");
        } else {
            System.out.println("This number is zero");
        }
    }

    //Example of Big O (N)
    public void printList(String[] entry) {
        for (String entry1 : entry) {
            System.out.println(entry1);
        }
    }

    //Example of Big O (n^2)
    public void populateGrid(int coX, int coY) {
        int[][] point = new int[coX][coY];
        for (int x = 0; x < coX; x++) {
            for (int y = 0; y < coY; y++) {
                point[x][y] = Integer.parseInt(JOptionPane.showInputDialog("Enter the point value "
                        + "for block: (" + coX + ", " + coY + ")"));
            }
        }
    }

    //Example of Big O (log N)
    public boolean binarySort(int[] numbers, int search) 
    {
        //BinarySort requires array to be sorted first
        //This method uses quicksort which is f(n log n)
        Arrays.sort(numbers);
        
        int result = Arrays.binarySearch(numbers, search);

        //If result is -1, it means the value wasn't found
        return (result != -1);
    }
    
    
   //Example of Big O (N log N)
   public void insertionSort(int[] numbers)
   {
        int temp;
        for (int x = 0; x < numbers.length; x++) 
        {
            for(int y = x ; y > 0 ; y--)
            {
                //Compare the number to the left
                if(numbers[y] < numbers[y-1])
                {
                    temp = numbers[y];
                    numbers[y] = numbers[y-1];
                    numbers[y-1] = temp;
                }
            }
        }
        //Print sorted list
        for (int p = 0; p < numbers.length; p++)
        {
            System.out.println(numbers[p]);
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        int[] stuff = new int[4];

        stuff[0] = 5;
        stuff[1] = 2;
        stuff[2] = 8;
        stuff[3] = 4;
        
        String sorted = "";

        BigO bla = new BigO();
            bla.insertionSort(stuff);
        

    }

}
