# javaProject
java study

#### 关于IDEA 报Error:java:无效的源发行版13  解决方法
* 主要原因 本机的JDK版本与项目的语言级别不同造成的
* 点击File–>Settings进入界面找到如图位置 并将相信应位置设置成自己的安装版本号，
Build,Execution,Deployment  --> Java Compiler --> 设置 project bytecode version [8]
Module 作相应设置
* 下一步，点击File选择Project Structure…进入。设置 Project language level -->8
