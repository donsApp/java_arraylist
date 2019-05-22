/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utils.arraylist;

import java.util.ArrayList;
import java.util.Collections;


/**
 *
 * @author John
 */
public class MyArrayList {
    
    public static void main(String[] args)
    {
        ArrayList<Integer> num = new ArrayList<>();
        
        num.add(1);
        num.add(10);
        num.add(20);
        num.add(5);
        num.add(15);
        
        Collections.sort(num, Collections.reverseOrder());
        
        for(int i : num)
        {
            System.out.print(i + ", ");
        }
        
        //System.out.print("\t" + num);
    }
}
