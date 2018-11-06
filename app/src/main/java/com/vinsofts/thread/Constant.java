package com.vinsofts.thread;

import java.util.concurrent.TimeUnit;

public class Constant {
    private static final String name = "https://api-v2.soundcloud.com/";
    private static final String name1 = name + "charts?kind=top&genre=soundcloud" +
            "%3Agenres%3Aall-music&client_id=a7Ucuq0KY8Ksn8WzBG6wj4x6pcId6BpU&limit=100&offset=0";
    private static final String name2 = name + "charts?kind=top&genre=soundcloud%3Agenres%3Aall-" +
            "audio&client_id=a7Ucuq0KY8Ksn8WzBG6wj4x6pcId6BpU&limit=100&offset=1";
    private static final String name3 = name + "charts?kind=top&genre=soundcloud%3Agenres%3Aaltern" +
            "ativerock&client_id=a7Ucuq0KY8Ksn8WzBG6wj4x6pcId6BpU&limit=100&offset=0";
    private static final String name4 = name + "charts?kind=top&genre=soundcloud%3Agenres%3Aambient" +
            "&client_id=a7Ucuq0KY8Ksn8WzBG6wj4x6pcId6BpU&limit=100&offset=0";
    private static final String name5 = name + "charts?kind=top&genre=soundcloud%3Agenres%3Aclassi" +
            "cal&client_id=a7Ucuq0KY8Ksn8WzBG6wj4x6pcId6BpU&limit=100&offset=0";
    private static final String name6 = name + "charts?kind=top&genre=soundcloud%3Agenres%3Acountr" +
            "y&client_id=a7Ucuq0KY8Ksn8WzBG6wj4x6pcId6BpU&limit=100&offset=0";
    public static String[] list = {name1,name2,name3,name4,name5,name6};
    public static final int KEEP_ALIVE_TIME =1;
    public static final TimeUnit KEEP_ALIVE_TIME_UNIT = TimeUnit.SECONDS;
    public static final int CORE_POOL_SIZE = 2;
    public static final int MAXIMUM_POOL_SIZE = 3;
}
