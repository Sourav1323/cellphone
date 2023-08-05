package com.company;
import java.util.Scanner;
public class array {
    public static void main(String[] args) {
//        int[] array= new int[5];
//        Scanner s = new Scanner(System.in);
//        array[0]=s.nextInt();
//        array[1]=s.nextInt();
//        array[2]=s.nextInt();
//        array[3]=s.nextInt();
//        array[4]=s.nextInt();
//        for(int i=0;i<5;i++) {
//            array[i] = s.nextInt();
//        }
//        for(int j=0; j<5; j++) {
//            System.out.println(array[j]);
//        }
//        for(int a: array){
//           System.out.println(a*2);
//        }
      /*  int[][] array1= new int[3][2];
        for(int i=0;i<3;i++) {
            for(int j=0;j<2;j++){
            array1[i][j] = s.nextInt();
        }*/

      /*  for(int k=0;k<3;k++){
            for(int h=0;h<2;h++){
                System.out.println(array1[k][h]);
            }

        }*/
        Scanner s = new Scanner(System.in);
        String[] sc = new String[s.nextInt()];
        //s.nextLine();
        for(int i=0; i==sc.length;i++){
            sc[i]=s.nextLine();
        }
        for(String a:sc){
            System.out.println(a);
        }

    }
}