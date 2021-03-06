package com.trans.kuro_core.app;

import android.app.Application;
import android.content.Context;
import android.os.Handler;


public final class Kuro {
    public static Configurator init(Context context){
        Configurator.getInstance()
                .getKuroConfigs()
                .put(ConfigKeys.APPLICATION_CONTEXT, context.getApplicationContext());
        return Configurator.getInstance();
    }

    public static Configurator getConfiguretor(){
        return Configurator.getInstance();
    }
    public static <T> T getConfiguration(Object key){
        return getConfiguretor().getConfiguration(key);
    }

    public static Handler getHandler(){
        return getConfiguration(ConfigKeys.HANDLER);
    }

    public static Application getApplicationContext(){
            return getConfiguration(ConfigKeys.APPLICATION_CONTEXT);
    }
}
