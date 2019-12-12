# java-common-tools
编写数据验证工具类，并编写相应单元测试⽤例，具体要求如下：
1、GitHub 上创建项目 java-common-tools
2、创建 maven 项目，并提交到 GitHub 上
3、创建数据验证工具类 com.zeroten.common.util.CheckUtils。（src/main/java⽬录下）
4、为工具类编写如下数据验证方法（使用静态方法）：
	方法1、public static boolean isAnyEmpty(String... strings)
		String... strings 为可变参数，你可以认为它是 String[] strings。如果 strings 中有任意1个字符串为空，则返回 false，否则返回 true。
	方法2、public static boolean isEmpty(Object[] arr)
		判断引⽤类型数组是否为空，为空或 null 则返回 true，否则返回 false。
	方法3、public static boolean equals(String str1, String str2)
		判断 str1 字符串是否相等，相等则返回 true，否则返回 false。当其中1个是 null 时返回false。
	方法4、public static boolean equals(Integer n1, Integer n2)
		判断 n1 和 n2 的值是否相等，相等则返回 true，否则返回 false。当其中1个是 null 时返回 false。
编写测试类 com.zeroten.common.util.CheckUtilsTest（src/main/test⽬录下）对数据验证工具
类进行测试，设计的测试用例尽量把各种输⼊情况都考虑到。
