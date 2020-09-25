package com.powernode.designpattern.factory.abstractfactory;

/**
 * @Author AlanLin
 * @Description
 * @Date 2020/9/19
 */
public class AbstractFactoryTest {
    public static void main(String[] args) {
        InstallEngineer installEngineer = new InstallEngineer();
        installEngineer.makeComputer(new Factory2());
    }
}


