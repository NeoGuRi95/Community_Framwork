package com.ll.exam;

public class App {
    // 테스트 설정
    public static String BASE_PACKAGE_PATH = "com.ll.exam";
    public static String DB_HOST = "localhost";
    public static int DB_PORT = 3306;
    public static String DB_ID = "root";
    public static String DB_PASSWORD = "0000";
    public static String DB_NAME = "blog";
    public static boolean isProd = false;

    static {
        String profilesActive = System.getenv("SPRING_PROFILES_ACTIVE");

        if (profilesActive != null && profilesActive.equals("production")) {
            isProd = true;
        }
        // 운영 설정
        if (isProd) {
            DB_HOST = "172.17.0.1";
            DB_PORT = 3306;
            DB_ID = "jea";
            DB_PASSWORD = "0000";
            DB_NAME = "site1";
        }
    }
}
