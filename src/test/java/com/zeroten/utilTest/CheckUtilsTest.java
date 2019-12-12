package com.zeroten.utilTest;


import com.zeroten.util.CheckUtils;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by 恒 on 2019/12/11.
 */
public class CheckUtilsTest {

    @Test
    public void CheckUtilsInt(){
        //断言  测试条件
        Assert.assertFalse(CheckUtils.equalsInt(1, 2));
        Assert.assertTrue(CheckUtils.equalsInt(1, 1));
        Assert.assertTrue(CheckUtils.equalsInt(1, 1));
        Assert.assertFalse(CheckUtils.equalsInt(null,1));
        //要测试的类的方法 。 测试场景，可能出现的情况
        CheckUtils.equalsInt(1, 2);
        CheckUtils.equalsInt(1 ,1);
        CheckUtils.equalsInt(1, 1);
        CheckUtils.equalsInt(null,1);
    }

    @Test
    public void CheckUtilsIStr(){
        //断言  测试条件
        Assert.assertFalse(CheckUtils.equalsStr(null, "ds"));
        Assert.assertFalse(CheckUtils.equalsStr("", "zz"));
        Assert.assertTrue(CheckUtils.equalsStr("aa", "aa"));
        Assert.assertFalse(CheckUtils.equalsStr("as", "ss"));
        Assert.assertFalse(CheckUtils.equalsStr(" ", null));
        //要测试的类的方法 。 测试场景，可能出现的情况
        CheckUtils.equalsStr(null, "ds");
        CheckUtils.equalsStr(" ", "zz");
        CheckUtils.equalsStr("aa", "aa");
        CheckUtils.equalsStr("as", "ss");
        CheckUtils.equalsStr(" ", null);
    }

    @Test
    public void CheckUtilsIsAnyEmpty(){
        String[] str = {};
        String[] str2 = {"da",""};
        String[] str3 = {"aa","ss"};
        String[] str4 = {null,"ss"};
        Assert.assertFalse(CheckUtils.isAnyEmpty(str));
        Assert.assertFalse(CheckUtils.isAnyEmpty(str2));
        Assert.assertTrue(CheckUtils.isAnyEmpty(str3));
        Assert.assertFalse(CheckUtils.isAnyEmpty(str4));

        CheckUtils.isAnyEmpty(str);
        CheckUtils.isAnyEmpty(str2);
        CheckUtils.isAnyEmpty(str3);
        CheckUtils.isAnyEmpty(str4);
    }

    //判断引?类型数组是否为空，为空或 null 则返回 true，否则返回 false。
    @Test
    public void CheckUtilsIsEmpty(){

        Integer[] in = {};
        Integer[] in3 = {null};
        Integer[] in4 = {1,2};
        Character[] ch = {};
        Character[] ch2 = {null};
        Character[] ch3 = {'a'};

        Assert.assertTrue(CheckUtils.isEmpty(in));
        Assert.assertTrue(CheckUtils.isEmpty(in3));
        Assert.assertFalse(CheckUtils.isEmpty(in4));

        Assert.assertTrue(CheckUtils.isEmpty(ch));
        Assert.assertTrue(CheckUtils.isEmpty(ch2));
        Assert.assertFalse(CheckUtils.isEmpty(ch3));

        CheckUtils.isEmpty(in);
        CheckUtils.isEmpty(in3);
        CheckUtils.isEmpty(in4);
        CheckUtils.isEmpty(ch);
        CheckUtils.isEmpty(ch2);
        CheckUtils.isEmpty(ch3);

    }

    public static void main(String[] args) {
        Integer[] in2 = {null,3};
        System.out.println(in2.length);
        System.out.println(in2);
    }
}
