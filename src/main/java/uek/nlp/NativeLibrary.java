package uek.nlp;

import java.lang.reflect.Field;

public class NativeLibrary {
    static void load(String path) {
        try {
            System.setProperty("java.library.path", path);
            Field sysPathsField = ClassLoader.class.getDeclaredField("sys_paths");
            sysPathsField.setAccessible(true);
            sysPathsField.set(null, null);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
