package com.powernode.designpattern.factory.abstractfactory;

/**
 * @Author AlanLin
 * @Description
 * @Date 2020/9/25
 */
public class InstallEngineer {
    private CPU cpu;
    private MainBoard mainBoard;
    private Factory factory;

    public void makeComputer(Factory factory){
        prepareHardwares(factory);
        System.out.println("后续操作");


    }

    public void prepareHardwares(Factory factory){
        this.cpu=factory.createCPU();
        this.mainBoard=factory.createMainBoard();
        mainBoard.installCPU(cpu);
    }
}
