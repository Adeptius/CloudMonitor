package ua.adeptius.utils;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ua.adeptius.main.Starter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

@Deprecated
public class Settings {
//
//    private static Logger LOGGER =  LoggerFactory.getLogger(Settings.class.getSimpleName());
//
//
//    private static HashMap<String, String> map = new HashMap<>();
//
//    public static void load(Class clazz){
//        LOGGER.trace("Загрузка файла настроек config.properties");
//        try {
//            Properties prop = new Properties();
//            String propFileName = "config.properties";
//
//            InputStream inputStream = clazz.getClassLoader().getResourceAsStream(propFileName);
//
//            if (inputStream != null) {
//                prop.load(inputStream);
//                initSettings(prop);
//            } else {
//                throw new FileNotFoundException("property file '" + propFileName + "' not found in the classpath");
//            }
//
//        } catch (Exception e) {
//            LOGGER.error("Ошибка загрузки config.properties", e);
//            throw new RuntimeException("Ошибка загрузки config.properties");
//        }
//    }
//
//    private static void initSettings(Properties prop) {
//        for (final String name: prop.stringPropertyNames())
//            map.put(name, prop.getProperty(name));
//    }
//
//    public static boolean getSettingBoolean(String category) {
//        return Boolean.parseBoolean(map.get(category.toString()));
//    }
//
//    public static void setSetting(String key, String value){
//        map.put(key, value);
//        Properties prop = new Properties();
//        try {
//            String filename = Starter.class.getProtectionDomain().getCodeSource().getLocation().getPath()+"config.properties";
//            OutputStream output = new FileOutputStream(filename);
//            for (Map.Entry<String, String> entry : map.entrySet()) {
//                prop.setProperty(entry.getKey(), entry.getValue());
//            }
//            prop.store(output, null);
////            System.out.println(key + " " + value);
//        } catch (Exception io) {
//            io.printStackTrace();
//        }
//    }
//
//    public static String getSetting(String name){
//        return map.get(name);
//    }
}
