package pers.study.easy;

/**
 *给你一个 32 位的有符号整数 x ，返回将 x 中的数字部分反转后的结果。<br>
 *<br>
 * 如果反转后整数超过 32 位的有符号整数的范围 [−2<sup>31</sup>,  2<sup>31</sup> − 1] ，就返回 0。<br>
 *<br>
 * 假设环境不允许存储 64 位整数（有符号或无符号）。<br>
 *  
 *<br>
 * 示例 1：<br>
 *<br>
 * 输入：x = 123<br>
 * 输出：321<br>
 * 示例 2：<br>
 *<br>
 * 输入：x = -123<br>
 * 输出：-321<br>
 * 示例 3：<br>
 *<br>
 * 输入：x = 120<br>
 * 输出：21<br>
 * 示例 4：<br>
 *<br>
 * 输入：x = 0<br>
 * 输出：0<br>
 *  
 *<br>
 * 提示：<br>
 *<br>
 * -2<sup>31</sup> <= x <= 2<sup>31</sup> - 1
 *<br>
 * 来源：力扣（LeetCode）<br>
 * 链接：https://leetcode-cn.com/problems/reverse-integer<br>
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。<br>
 * @author yangjiawei
 **/
public class ReverseSolution {
    public int reverse(int x) {
        try {
            StringBuilder builder = new StringBuilder(String.valueOf(Math.abs(x)));
            int resultNum = Integer.parseInt(builder.reverse().toString());
            if(x < 0){
                resultNum = - resultNum;
            }
            return resultNum;
        } catch (Exception e) {
            return 0;
        }
    }
}
