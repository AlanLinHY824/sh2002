package com.powernode.designpattern.factory.abstractfactory;

/**
 * @Author AlanLin
 * @Description
 * @Date 2020/9/25
 */
public class Factory1 implements Factory {
    @Override
    public CPU createCPU() {
        return new AMDCPU("AMD战龙");
    }

    @Override
    public MainBoard createMainBoard() {
        return new GAMainBoard();
    }
}
