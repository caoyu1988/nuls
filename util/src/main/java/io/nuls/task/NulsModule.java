package io.nuls.task;

import java.util.List;
import java.util.Map;

/**
 * Created by Niels on 2017/9/26.
 * nuls.io
 */
public interface NulsModule {

    String getModuleName();

    void init(Map<String,String> initParams);

    void start();

    void reboot();

    void shutdown();

    String getInfo();

    ModuleStatus getStatus();
}
