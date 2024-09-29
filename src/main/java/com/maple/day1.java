package com.maple;

public class day1 {
    //@TODO 编译

        //@TODO 检验你的代码，是否有异常，出错等问题。
        //@TODO 如果没有问题，逻辑通顺，就可以编译。

    //@TODO 运行
        //@TODO 是在编译之后，开始正式的启动项目。
        //@TODO 此时也是检验，项目有没有问题，只不过这个问题会更深入。
        //@TODO 如果没问题，就可以启动成功。！

    //@TODO 运行时
        //@TODO 运行时，点击某个事件，也有可能出现异常，这时候会报错。
        //@TODO 运行时的报错，不一定会终止项目。


    //@todo 怎样启动一个正常的JAVA代码？

        //@todo 先输入main方法。
//
//    public static void main(String[] args) {
//
//    }
        //@todo 这个就是main方法，一个程序里只能有一个。
        //@todo 多个的话，会报错

        //@todo  那么我们现在可以开始我们的编程了！

    public static void main(String[] args) {
        //@todo 接下来展示的是：输出语句
        System.out.println("abc");
        //@todo 这句话的意思是，输出abc
        //@todo 接下来我按ctrl+shift+f10 启动代码

        //@todo 你一定要背下来这句话，输出语句 system.out.println();
        //@todo print是打印的意思，ln是换行，这句话整体的意思是：
        //@todo 1.使用System类里的out，使用out里面的println（）
        //@todo 2.使用println（）后，把你括号里写的东西输出出来。

        System.out.println("不管我写什么，他都可以打印，然后换行");

        //@todo 学会输出语句后，我们开始学变量！

        //@todo 例如：什么是变量？ 变量有哪些？ 怎么起名字？ 如何创建变量？

        //@todo 首先：变量是一个名字，这个名字，指代了一个东西

        //@todo 例如，我是侯德伟， 侯德伟是一个人

        //@todo 例如，一个变量叫apple ，他是一个苹果。

        //@todo 例如，现在有个变量叫index，他是一个数字5

        //@todo 写法如下：

        int index = 5;

        String apple = "苹果";

        String 侯德伟 = "人";

        //@todo 那么接下来，我要把这三个变量，一一打印出来

        System.out.println("index = " + index);
        System.out.println("apple = " + apple);
        System.out.println("侯德伟 = " + 侯德伟);

        //@todo 那么现在，我们已经知道了什么是变量！
        //@todo 接下来我们要对变量，进行约束。

        //@todo 首先，变量的起名，就有约束，最好是以驼峰命名规范，（abcDabc）这种
        //@todo 就是首字母小写，后面单词可以大写。
        //@todo 然后，尽量不用中文，别用数字开头，就可以啦。

        //@todo 现在我们解释一下，刚才三个变量，的左边单词是什么意思？
        //@todo 分别是 String ， int 这两个单词。
        //@todo int 代表一种声明， 声明这个变量是一个 数字类型的数据。
        //@todo 之所以index可以用int来声明，是因为他是一个数字5.
        //@todo String是声明一个字符串，“apple”，"侯德伟"这都属于字符串。

        //@todo 例如：

        int a = 10;
        int b,c = 10;
        int abc = 1-1;
        int def = 10/4;

        //@todo 这五个变量，分别介绍了一些属性
        //@todo 第一个，a变量，他的含义是：定义了一个整形数据a，他等于10。
        //@todo 第二个，b变量，他的含义是：定义了一个整形数据b，他等于10。
        //@todo 第三个，c变量，他的含义是：定义了一个整形数据c，他等于10。
        //@todo 第四个，abc变量，他的含义是：定义了一个整形数据abc，他等于1-1=0。
        //@todo 第五个，edf变量，他的含义是：定义了一个整形数据edf，他等于10/4=2。
        //@todo 那么为什么10/4=2呢？ 不应是2.5吗？
        //@todo 因为int 声明的是 整形数据，是整数，自动截取整数部分。
    }


}
