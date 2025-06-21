package org.rustem.Singltone;

public class ProgramLogger {
    private static String logFile;

    private ProgramLogger(){}


    private static class SingletonHolder {
        public static final ProgramLogger SINGLETON_HOLDER = new ProgramLogger();
    }

    //Double-Checked Locking тоже как вариант если не использовать класс
//    private static ProgramLogger getInstance(){
//        if (INSTANSE == null) {
//            synchronized (ProgramLogger.class) {
//                if (INSTANSE == null){
//                   INSTANSE = new ProgramLogger();
//                }
//            }
//        }
//        return INSTANSE;
//    }

    public static ProgramLogger getInstance(){
        return SingletonHolder.SINGLETON_HOLDER;
    }

    public void addLogInfo(String logInfo){
        logFile = logInfo;
    }

    public void showLogInfo(){
        System.out.println(logFile);
    }
}
