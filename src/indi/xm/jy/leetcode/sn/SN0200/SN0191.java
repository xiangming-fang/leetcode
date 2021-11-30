package indi.xm.jy.leetcode.sn.SN0200;


import org.junit.Test;

// 位1的个数
public class SN0191 {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int res = 0;
        while ( n != 0){
            n = n & (n - 1);
            res ++;
        }
        return res;
    }

    @Test
    public void test(){
        System.out.println(hammingWeight(-3));
    }
}
