package com.example.algorithm4booknotes.chapter_1;

import edu.princeton.cs.algs4.StdDraw;

public class TestStdDrawFunc {
    public static void main(String[] args) {

        new TestStdDrawFunc().printImageline();

    }

    /**
     * 使用函数绘制函数曲线
     */
    public void printImageline(){
        int n = 100;
        StdDraw.setXscale(0,n);
        StdDraw.setYscale(0,n*n*n);
        StdDraw.setPenRadius(.01);
        for (int i = 1;i<n;i++){
            StdDraw.point(i,i);
            StdDraw.point(i,i*i);
            StdDraw.point(i,i*Math.log(i));

        }
    }
}
