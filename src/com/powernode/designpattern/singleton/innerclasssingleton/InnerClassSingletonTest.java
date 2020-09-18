package com.powernode.designpattern.singleton.innerclasssingleton;

/**
 * @Author AlanLin
 * @Description
 * @Date 2020/9/14
 */
public class InnerClassSingletonTest {
    public static void main(String[] args) {

    }
}
class InnerClassSingleton{
    private static class InnerClassHolder{
        private static InnerClassSingleton instance=new InnerClassSingleton();
    }
    private InnerClassSingleton(){
        if (InnerClassHolder.instance!=null){
            throw new RuntimeException("单例模式不允许创建多个实例！");
        }
    }
    public static InnerClassSingleton getInstance(){
        return InnerClassHolder.instance;
    }
}
