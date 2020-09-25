package com.powernode.designpattern.factory.abstractfactory;

/**
 * @Author AlanLin
 * @Description
 * @Date 2020/9/19
 */
public class AMDCPU implements CPU {

    private String name;

    public AMDCPU(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void calculate() {
        System.out.println("AMD芯片");
    }

}
