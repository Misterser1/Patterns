package org.rustem.CreationalPatterns.Singltone;

public class Program {
    public static void main(String[] args) {
        ProgramLogger.getInstance().addLogInfo("Салам");
        ProgramLogger.getInstance().showLogInfo();
    }
}
