/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package math.util;

import khoata.util.MathUtility;

/**
 *
 * @author ADMIN
 */
public class MathUtil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //2 Cách 2 test = mắt
        System.out.println("5!: " + MathUtility.getFactorial(5));
        // expected:120, actual: 
        // tao hi vọng mày ói về 120 khi tao gọi mày
        // và test bộ data khác, test case, tình huống  khác
        System.out.println("0!: " + MathUtility.getFactorial(1));
        System.out.println("-5!: " + MathUtility.getFactorial(-5));
    }
   //Code viết ra thì Dep phải test trước cái đã
        // có vài hình thức test code khác nhau
        //1. TDD, Test Driven Development
        //Viết dàn khung của hàm getFactorial(int n)
        //sau đó dựng hàm test()
        //chạy thử ocoi xanh đỏ, đỏ nghĩa là lỗi, xanh nghĩa là ổn 
        // cứ việc tiếp tục xanh như thế trong quá trình coe
        // sửa code, nười ta gọi à lập trình hướng đối tượng theo thỏa mãng
        //việ test, TĐ\
        //2. sout(hàm kèm data) để coi kết quả ra sao, có đúng như mình kì vọng
        // nó phải trả về như thế này không -> xem kết quả test = mắt
        //3. JOPtionPane của bên JavaDesktop để popup kết quả lên màn hình vẫn xe = mắt
        //4. Viết 1 thang web gọi hàm xử lý...., hao sức quá
        // ta chơi cách 1 và 2 
}
