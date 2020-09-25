package com.powernode.designpattern.factory.abstractfactory;

/**
 * @Author AlanLin
 * @Description
 * @Date 2020/9/25
 */
public class Factory2 implements Factory {
    @Override
    public CPU createCPU() {
        return new IntelCPU("英特尔11代CPU");
    }

    @Override
    public MainBoard createMainBoard() {
        return new MSIMainBoard();
    }
}
