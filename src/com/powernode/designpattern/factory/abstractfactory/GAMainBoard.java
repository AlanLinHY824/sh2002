package com.powernode.designpattern.factory.abstractfactory;

/**
 * @Author AlanLin
 * @Description
 * @Date 2020/9/25
 */
public class GAMainBoard implements MainBoard {

    private String name;

    @Override
    public void installCPU(CPU cpu) {
        System.out.println("技嘉主板安装"+cpu.getName());
    }
}
