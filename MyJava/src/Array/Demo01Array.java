package Array;
/*
数组：是一种容器，可以同时存放多个数据值。
数组的特点:
1,数组是一种引用数据类型
2，数组当中的多个数据，类型必须统一
3，数组的长度在程序运行期间不可改变

数组的·初始化：在内存当中创建一个数组，并且向其中赋予一些默认值
两种常见的初始化方式：
1，动态初始化（指定长度）
2，静态初始化（指定内容）
动态初始化数组的格式：
数据类型【】数组名称 = new 数据类型【数组长度】；
解析含义：
左侧的数据类型：也就是数组中保存的数据，全部都是统一的什么类型
左侧的中括号：代表我是一个数组
左侧数组名称：给数组取一个名字
右侧的new：代表创建数组的动作，要在内存中为数组开辟空间
右侧中括号的长度：也就是数组当中，到底可以保存多少个数据，是一个int数据

 */
public class Demo01Array {
    public static void main(String[] args) {
        //数据类型【】数组名称 = new 数据类型【数组长度】；
        int[] arrayA = new int[300];
        //创建一个能存放10个double类型数据的数组
        double[] arrayB = new double[10];
        //创建能放5个字符串的数组
        String[] arrayC=new String[5];
    }
}