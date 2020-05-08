package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class main2 {
    public static void solve(ArrayList<Integer> numbers,ArrayList<ArrayList<Integer>> numberLists) {
        for(int z=0;z<numbers.size();z++){
            ArrayList<Integer>numberList=numberLists.get(z);

            double sum=0;
            for(int i=0;i<numberList.size();i++){
                sum+=numberList.get(i);
            }
            double average=sum/numberList.size();
            double fCha=0;
            for(int i=0;i<numberList.size();i++){
                fCha+=(numberList.get(i)-average)*(numberList.get(i)-average);
            }
            int min=numberList.get(0);
            int max=numberList.get(0);
            for(int i=0;i<numberList.size();i++){
                if(numberList.get(i)<min){
                    min=numberList.get(i);
                }
                if(numberList.get(i)>max){
                    max=numberList.get(i);
                }
            }
//            System.out.println(max-min);
            DecimalFormat df = new DecimalFormat("0.000");
            System.out.println(max-min+" "+df.format(fCha/numberList.size()));



        }
    }

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int size= Integer.parseInt(scanner.nextLine());
        ArrayList<Integer> tepNumbers=new ArrayList<>();
        ArrayList<ArrayList<Integer>> tepNumberLists=new ArrayList<>();

        for(int i=0;i<Integer.valueOf(size);i++){
            tepNumbers.add(Integer.parseInt(scanner.nextLine()));
            String[] tepList=scanner.nextLine().split(" ");
            ArrayList<Integer> tepNumberList = new ArrayList<>();
            for(int j=0;j<tepList.length;j++){
                tepNumberList.add(Integer.parseInt(tepList[j]));
            }
            tepNumberLists.add(tepNumberList);
        }
        solve(tepNumbers,tepNumberLists);

    }
}
