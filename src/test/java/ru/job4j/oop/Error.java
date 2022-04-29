package ru.job4j.oop;

public class Error {
    private boolean active;
    private int status;
    private String message;

    public Error() {

    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printInfo() {
        System.out.println("active: " + active);
        System.out.println("status: " + status);
        System.out.println("message: " + message);
        System.out.println("--------------");
    }

    public static void main(String[] args) {
        Error error = new Error();
        error.printInfo();
        Error errorReady = new Error(true, 1, "ready");
        errorReady.printInfo();
        Error errorPause = new Error(false, 0, "pause");
        errorPause.printInfo();
    }
}