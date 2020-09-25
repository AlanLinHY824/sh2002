package com.powernode.designpattern.factory.abstractfactory;

/**
 * @Author AlanLin
 * @Description
 * @Date 2020/9/19
 */
public interface Factory {
    public CPU createCPU();
    public MainBoard createMainBoard();
}
