package com.powernode.designpattern.singleton.hungrysingleton;

/**
 * @Author AlanLin
 * @Description
 * @Date 2020/9/11
 */
public class HungrySingletonTest {
    public static void main(String[] args) {
        Thread thread = new Thread(()->{

        });

    }
}

class HungrySingleton{
    private static HungrySingleton hungrySingleton=new HungrySingleton();
    private HungrySingleton(){
        if (hungrySingleton!=null){
            throw new RuntimeException("单例模式不允许创建多个实例！");
        }
    }
    

}
