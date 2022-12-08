package anonymousInner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        monitoringSystem generalIndicationMonitoringModule = new monitoringSystem() {
            @Override
            public void startMonitoring() {
                System.out.println("Мониторинг общих показателей стартовал!");

            }
        };
        monitoringSystem errorIndicationMonitoringModule = new monitoringSystem() {
            @Override
            public void startMonitoring() {
                System.out.println("Мониторинг отслеживания ошибок стартовал!");
            }
        };
        monitoringSystem securityModule = new monitoringSystem() {
            @Override
            public void startMonitoring() {
                System.out.println("Мониторинг безопасности стартовал!");
            }
        };

        generalIndicationMonitoringModule.startMonitoring();
        errorIndicationMonitoringModule.startMonitoring();
        securityModule.startMonitoring();

    }

    /*
    * new <ИМЕНИ_НЕТ> <класс родительский/реализуемый интерфейс>(параметры конструктора родителя){
    * };
    * */
}

/*
class GeneralIndicationMonitoringModule extends monitoringSystem {
    @Override
    public void startMonitoring() {
        System.out.println("Мониторинг общих показателей стартовал!");
    }
}

class ErrorIndicationMonitoringModule extends monitoringSystem {
    @Override
    public void startMonitoring() {
        System.out.println("Мониторинг отслеживания ошибок стартовал!");
    }
}

class SecurityModule extends monitoringSystem {
    @Override
    public void startMonitoring() {
        System.out.println("Мониторинг безопасности стартовал!");

    }
}
*/



