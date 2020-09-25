package com.powernode.designpattern.factory.abstractfactory;

/**
 * @Author AlanLin
 * @Description
 * @Date 2020/9/25
 */
public class IntelCPU implements CPU {

    private String name;

    public IntelCPU(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    @Override
    public void calculate() {
        System.out.println("英特尔芯片");
    }
}
