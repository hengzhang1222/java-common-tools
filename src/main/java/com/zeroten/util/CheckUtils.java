package com.zeroten.util;

/**
 * Created by 恒 on 2019/12/10.
 */
public class CheckUtils {
    /*
        tring... strings 为可变参数，你可以认为它是 String[] strings。
        如果 strings 中有任意⼀个字符串为空，则返回 false，否则返回 true。
    */

    public static boolean isAnyEmpty(String... strings) {
        boolean flag = true;
        if(strings.length == 0 ){
            return false;
        }else {
            while (flag){
                for (int i = 0; i < strings.length; i++) {
                    //获取数组中的每一个元素进行判断
                    if(strings[i] ==null){
                        flag = false;
                        break;
                    }else if (strings[i].toString().trim().length()  == 0 ) {
                        flag = false;
                        break;
                    } else {
                        flag = true;
                    }
                }
                break;
            }
        }
        return  flag;
    }
    /*
        判断引⽤类型数组是否为空，为空或 null 则返回 true，否则返回 false。
     */
    public static boolean isEmpty(Object[] arr){

        int index = 0;
        boolean flag = false;

        if(arr.length == 0 || arr[index] == null ){
            flag = true;
        }else if(arr[index].toString().trim().length() == 0){
            flag = true;
        }else {
            flag = false;
        }
        return flag;
    }
    /*
        判断 str1 字符串是否相等，相等则返回 true，否则返回 false。当其中⼀个是 null 时返回false。
     */
    public static boolean equalsStr(String str1, String str2){
        boolean flag = true;
        int index1 = 0;
        int index2 = 0;
        if( str1 == null ||  str1 == "" || str2 == null || str2 == ""){
            flag = false;
        }else if(str1.length() != str2.length()){
            flag = false;
        }else {
            byte[] b1 = str1.trim().getBytes();
            byte[] b2 = str2.trim().getBytes();
            // asddf    asddf
            while (flag){
                if(b1[index1] != b2[index2]){
                    flag = false;
                    break;
                }else {
                    flag = true;
                    index1++;
                    index2++;
                }
                break;
            }
        }
        return flag;
    }
    /*
        判断 n1 和 n2 的值是否相等，相等则返回 true，否则返回 false。当其中⼀个是 null 时返回 false。
     */
    public static boolean equalsInt(int n1, int n2){
        boolean flag = true;
        if(n1 == n2){
            flag = true;
        }else {
            flag = false;
        }
        return flag;
    }

    public static void main(String[] args) {

        /*
        System.out.println(equalsInt(11 , 11));
        */

       /*
        System.out.println(equalsStr(null, "aa"));
        */

        /*
        Character[] in = {};
        System.out.println(isEmpty(in));
        */

        /*
        String[] st = {"sfs","   ","dd","sF"};
        System.out.println(isAnyEmpty(st));
        */

    }
}
