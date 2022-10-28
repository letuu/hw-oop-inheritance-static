package pro.sky.java.ds_3_0.task1;

public class ValidationUtils {

    public static String validOrDefault(String value, String defaultValue) {
        return value == null || value.isBlank() ? defaultValue : value;
    }
}
