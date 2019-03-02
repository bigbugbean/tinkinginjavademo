package com.bugbean.tinkinginjavademo.chapter8;

/**
 * @author dugm
 * @description ${DESCRIPTION}
 * @date 2019-03-01 10:56
 */
public class Starship {
    private AlertStatus alertStatus;

    public void changeStatus(AlertStatus alertStatus) {
        this.alertStatus = alertStatus;
    }

    public void outPut() {
        alertStatus.alert();
    }

    public static void main(String[] args) {
        Starship ship = new Starship();
        ship.changeStatus(new LowStatus());
        ship.outPut();
        ship.changeStatus(new NormalStatus());
        ship.outPut();
        ship.changeStatus(new HignStatus());
        ship.outPut();
    }

}

class AlertStatus {
    public void alert() {
    }
}

class LowStatus extends AlertStatus {
    @Override
    public void alert() {
        System.out.println("change status to low");
    }
}

class NormalStatus extends AlertStatus {
    @Override
    public void alert() {
        System.out.println("change status to normal");
    }
}

class HignStatus extends AlertStatus {
    @Override
    public void alert() {
        System.out.println("change status to high");
    }
}
