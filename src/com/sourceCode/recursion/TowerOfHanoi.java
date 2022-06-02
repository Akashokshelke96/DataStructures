package com.sourceCode.recursion;

public class TowerOfHanoi {
    public static void towerOfHanoi(int n, String src ,String helper ,String dest ) {//all the 3 columns are named and passed as parameter so that we change column func below in recursion

        //TIME COMPLEXITY 0(2^n);
        if(n==1){
            System.out.println("Transferring disks " + n + " from " + src + " to " + dest + " using helper column as " + helper);
            return;
        }
        towerOfHanoi(n-1,src,dest,helper);//here we transferred N-1 disks to HELPER as column acting as dest, from SRC column using DEST as the helper Column
        System.out.println("Transferring disks " + n + " from " + src + " to " + dest + " using helper column as " + helper);
        towerOfHanoi(n-1,helper,src,dest);//here we transferred n-1 disk from HELPER as source, SRC as helper to DEST column
    }
    public static void main(String[] args) {
        int n = 3;
        towerOfHanoi(n,"S","H","D");
    }
}
