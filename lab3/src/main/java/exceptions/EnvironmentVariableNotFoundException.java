package main.java.exceptions;

public class EnvironmentVariableNotFoundException extends Exception {
    private final String fieldName;
    public EnvironmentVariableNotFoundException(String fieldName) {
        this.fieldName = fieldName;
    }

    public String getMessage() {
        return "Нет переменной окружения " + fieldName;
    }

}
