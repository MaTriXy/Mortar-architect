package mortarnav.autopath.compiler;

/**
 * @author Lukasz Piliszczuk - lukasz.pili@gmail.com
 */
public class Logger {

    private static final String TAG = "AutoPath Processor";

    public static void d(String message, Object... format) {
        if (format != null) {
            message = String.format(message, format);
        }

        log(message);
    }

    private static void log(String message) {
        System.out.println(TAG + " - " + message);
    }
}
