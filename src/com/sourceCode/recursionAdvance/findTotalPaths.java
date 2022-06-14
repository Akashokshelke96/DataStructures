package com.sourceCode.recursionAdvance;

public class findTotalPaths {
    public  static int findPath(int i ,int j , int n, int m ){
        if(i== n || j == m){
            return 0;
        }
        if(i == n-1 && j == m-1){
            return 1;
        }
        //movingDownwards
        int downPaths = findPath(i+1,j,n,m);

        //movingRight;
        int rightPaths =findPath(i,j+1,n,m);

        return downPaths+ rightPaths;
    }

    public static void main(String[] args) {
        int n = 3, m = 3;
        System.out.println(findPath(0,0,n,m));
    }
}
