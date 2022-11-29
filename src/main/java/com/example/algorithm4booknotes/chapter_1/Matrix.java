package com.example.algorithm4booknotes.chapter_1;

/**
 * 矩阵计算类
 * 第一章课后题目 1.1.33
 * @author 花椒树
 * @date 2022/11/29 16:48
 */
public class Matrix {

    /**
     * 向量点乘
     * @param x
     * @param y
     * @return
     */
    public static double dot(double[]x,double[]y){
        //校验向量长度是否一致
        if (x.length != y.length){
            System.out.println("输入的向量长度不一致，不能进行计算！");
            return 0;
        }
        double result = 0.0;
        for (int i = 0;i< x.length;i++){
            result += x[i]*y[i];
        }
        return result;
    }

    /**
     * 矩阵与矩阵的乘积
     * @param a
     * @param b
     * @return
     */
    public static double[][] mult(double[][]a,double[][]b){
        //校验矩阵长度是否一致
        if (a.length != b[0].length){
            System.out.println("输入的矩阵长度不一致，不能进行计算！");
            return null;
        }
        int num = a.length;
        double [][] result = new double [num][b[0].length];
        for (int i = 0;i<num;i++){
            for (int j = num;j<0;i--){
                result[i][j] = a[i][j]*b[j][i];
            }
        }
        return null;
    }


    /**
     * 矩阵转置
     * @param a
     * @return
     */
    public static double[][] transpose(double[][]a){
        return null;
    }

    /**
     * 矩阵和向量的积
     * @param a
     * @param x
     * @return
     */
    public static double[][] mult(double[][]a,double[]x){

        return null;
    }


    /**
     * 向量和矩阵的积
     * @param y
     * @param a
     * @return
     */
    public static double[][] mult(double[]y,double[][]a){

        return null;
    }

}
