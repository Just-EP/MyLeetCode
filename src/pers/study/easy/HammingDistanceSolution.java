package pers.study.easy;

import java.util.Arrays;

/**
 * 两个整数之间的汉明距离指的是这两个数字对应二进制位不同的位置的数目。<br>
 *
 * 给出两个整数 x 和 y，计算它们之间的汉明距离。<br>
 *<br>
 * 注意：<br>
 * 0 ≤ x, y < 2<sup>31</sup>.<br>
 *<br>
 * 示例:<br>
 *<br>
 * 输入: x = 1, y = 4<br>
 *
 * 输出: 2<br>
 *
 * 解释:<br>
 * 1   (0 0 0 1)<br>
 * 4   (0 1 0 0)<br>
 *&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;↑&nbsp;&nbsp;&nbsp;↑<br>
 *<br>
 * 上面的箭头指出了对应二进制位不同的位置。<br>
 * 来源：力扣（LeetCode）<br>
 * 链接：https://leetcode-cn.com/problems/hamming-distance<br>
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。<br>
 * @author yangjiawei
 **/
public class HammingDistanceSolution {
    public int hammingDistance(int x, int y) {
        int result = 0;
        for(int i = 31;i >= 0; i--) {
            int bx = x >>> i & 1;
            int by = y >>> i & 1;
            if (bx != by) {
                result++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        HammingDistanceSolution hammingDistanceSolution = new HammingDistanceSolution();
        hammingDistanceSolution.hammingDistance(1,4);
    }
}
