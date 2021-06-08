package pers.study.easy;

/**
 * 给你一个整数 x ，如果 x 是一个回文整数，返回 true ；否则，返回 false 。<br>
 *<br>
 * 回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。例如，121 是回文，而 123 不是。<br>
 *<br>
 *  
 *
 * 示例 1：<br>
 *<br>
 * 输入：x = 121<br>
 * 输出：true<br>
 * 示例 2：<br>
 *<br>
 * 输入：x = -121<br>
 * 输出：false<br>
 * 解释：从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。<br>
 * 示例 3：<br>
 *<br>
 * 输入：x = 10<br>
 * 输出：false<br>
 * 解释：从右向左读, 为 01 。因此它不是一个回文数。<br>
 * 示例 4：<br>
 *<br>
 * 输入：x = -101<br>
 * 输出：false<br>
 *  <br>
 *<br>
 * 提示：<br>
 *<br>
 * -2<sup>31</sup> <= x <= 2<sup>31</sup> - 1<br>
 *<br>
 * 来源：力扣（LeetCode）<br>
 * 链接：https://leetcode-cn.com/problems/palindrome-number<br>
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。<br>
 * @author yangjiawei
 **/
public class PalindromeSolution {
    public boolean isPalindrome(int x) {
        if (x < 0 || (x != 0 && x % 10 == 0)){
            return false;
        }
        int i = -1;
        int x1 = x;
        int y = 0;
        while (i != 0){
            i = x1 / 10;
            int mod = x1 % 10;
            y = y * 10 + mod;
            x1 = i;
        }
        return x == y;
    }
}
