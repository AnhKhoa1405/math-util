/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package khoata.util.test;

import khoata.util.MathUtility;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ADMIN
 */
public class MathUtilityTest {
    
    //mình sẽ test các tình huống xài hàm getFactorial() ở đây 
    // tình huống là tham số đưa vào: dương, âm, dương trong khoảng 0 -> 20 , ngoài khoảng
    // tình huống xài hàm, test hàm gọi là TEST CASES
    // thường sẽ có tình huống thành công hoặc thất bại
    // thành công: đưa vào value hơp lẹ 0...20
    // thất bại: đưa vào âm hoặc > 20, bị ăn đòn
    // hàm phải bắt các tình huống này vì giờ tao test thử xem coi hàm có xử lý không
    @Test //biến cái hàm này thành public static voi main()\
    // quy tắc đặt tên hàm cho việc test phần mềm: rất nhiều quy tắc
    //nhưng nói chung tên hàm sẽ bao gồm ngữ nghĩa kết quả trả về, tình trạng test
    // không giống như quy tắc đặt tên hàm khi viết app
    // mình đang viết code để test app
    
    
    // mình muốn test hàm trả về ngon nếu như đưa tham số ngon
     public void getFactorial_RunWell_IfValidArgument(){
         assertEquals(120, MathUtility.getFactorial(5));
         // tui mún check coi có đúng là gọi hàm 5! ói về 120 hay không?
         // có xanh heng, không thì đỏ heng
         assertEquals(720, MathUtility.getFactorial(6));
         assertEquals(24, MathUtility.getFactorial(4));
         assertEquals(6, MathUtility.getFactorial(3));
         assertEquals(1, MathUtility.getFactorial(1));
         assertEquals(1, MathUtility.getFactorial(0));
         System.out.println("abcdef");
         
     }
}
// Mặc định code test độc lập với code chính và độc lập với quá trình 
// clean and build tức là dù code bạn xanh hay đỏ miễn là 
// không bị error  cú pháp 
//bạn luôn đóng gói hay là buid ra được file .jar (chấm xanh đỏ)
//hợp về logic thì màu xanh tức là hàm chuẩn thì mới nên ra được .jar .war
//vậy ta cần có 1 cách để gài cái xanh đỏ vào cái quy trình built .jar .war
// nếu code đang màu đỏ thì phải disable cái nút bấm clean and build
