/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package khoata.util;

/**
 *
 * @author ADMIN
 */
public class MathUtility {
    //class này chứa các hàm tiện ích dùng chung cho mọi nơi nên nó nên là static
    public static final double PI = 3.1415;
    
    
    //hàm tính n! n>= 0 && n <= 20
    // nếu quá 20 thì tràn kiểu long
    //0! = 1; 1! = 1;
//    public static long getFactorial(int n){
//        //object là những gì cụ thể và class là nhóm mà object đó thuộc về
//        if(n < 0 || n > 20){
//           throw new IllegalArgumentException("n must be >= 0 & <= 20");
//           //đưa đầu vào cà chớn, mình hok thèm trả về 1 giá ám chỉ sai rồi
//        }
//        if( n == 0 || n == 1){
//            return 1;
//        }
//        long result = 1;
//        for (int i = 2; i <= n; i++) {
//            result *= i;
//        }
//        return result;
//    }
    public static long getFactorial(int n){
        //object là những gì cụ thể và class là nhóm mà object đó thuộc về
        if(n < 0 || n > 20){
           throw new IllegalArgumentException("n must be >= 0 & <= 20");
           //đưa đầu vào cà chớn, mình hok thèm trả về 1 giá ám chỉ sai rồi
        }
        if( n == 0 || n == 1){
            return 1;
        }
        return n * getFactorial(n-1); //đệ quy đó em
        // gọi lại chính mình với quy mô nhỏ hơn
        // n! = n * (n - 1)!
    }
}
