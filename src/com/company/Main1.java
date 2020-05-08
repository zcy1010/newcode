package com.company;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main1 {
    public static void solve(int[] staffList,int[][] planLists){
        for(int i=0;i<planLists.length;i++){
            int[] planList=planLists[i];
            int sum=0;
            for(int j=0;j<staffList.length;j++){
                int tep1=Math.abs(staffList[j]-planList[0]);
                int tep2=Math.abs(staffList[j]-planList[1]);
                sum=sum+Math.min(tep1,tep2);
            }
            System.out.println(sum);
        }
    }
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String[] allInformation = scanner.nextLine().split(" ");
        int staffNumber = Integer.parseInt(allInformation[0]);
        int planNumber = Integer.parseInt(allInformation[1]);
        int[] staffList = new int[staffNumber];
        String[] tepStaffs = scanner.nextLine().split(" ");
        for (int j = 0; j < tepStaffs.length; j++) {
            staffList[j]=(Integer.parseInt(tepStaffs[j]));
        }

        int[][] planLists = new int[planNumber][2];
        for (int i = 0; i < planNumber; i++) {
            String[] tepList = scanner.nextLine().split(" ");
            int[] tepPlanList = new int[2];
            for (int z = 0; z < 2; z++) {
                tepPlanList[z]=Integer.parseInt(tepList[z]);
            }
            planLists[i]=(tepPlanList);
        }
        solve(staffList,planLists);
    }
}
