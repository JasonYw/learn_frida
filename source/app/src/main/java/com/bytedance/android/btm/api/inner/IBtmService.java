package com.bytedance.android.btm.api.inner;

import android.app.Activity;
import android.view.View;
import com.bytedance.android.btm.api.BtmLaunchApi;
import com.bytedance.android.btm.api.BtmPageClass;
import com.bytedance.android.btm.api.BtmPageInstance;
import com.bytedance.android.btm.api.BtmPageLifecycle;
import com.bytedance.android.btm.api.HybridContainerClass;
import com.bytedance.android.btm.api.IAcrossProcessCallback;
import com.bytedance.android.btm.api.ICreateBtmChainCallback;
import com.bytedance.android.btm.api.ICreateBtmIdCallback;
import com.bytedance.android.btm.api.model.BtmItem;
import com.bytedance.android.btm.api.model.EventModelV1;
import com.bytedance.android.btm.api.model.EventModelV3;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

/* loaded from: classes18.dex */
public interface IBtmService {
    static {
        Covode.recordClassIndex(11310);
    }

    EventModelV1 addBtmEventParam(EventModelV1 eventModelV1);

    EventModelV3 addBtmEventParam(EventModelV3 eventModelV3);

    JSONObject createBtmChain(BtmItem btmItem);

    void createBtmChainAsync(BtmItem btmItem, ICreateBtmChainCallback iCreateBtmChainCallback);

    String createBtmId(BtmItem btmItem);

    void createBtmIdAcrossProcess(BtmItem btmItem, IAcrossProcessCallback iAcrossProcessCallback);

    void createBtmIdAsync(BtmItem btmItem, ICreateBtmIdCallback iCreateBtmIdCallback);

    String findBtmByPage(Object obj);

    IAppLog getAppLog();

    BtmLaunchApi getLaunchApi();

    IMonitor getMonitor();

    String getPageId(PageFinder pageFinder);

    BtmPageLifecycle getPageLifecycle();

    Activity getTopActivity();

    void init();

    boolean judgeTopActivity();

    void onLowMemory();

    void onRegisterHybridContainer(HybridContainerClass hybridContainerClass);

    void onRegisterPage(BtmPageClass btmPageClass);

    void onRegisterPage(BtmPageInstance btmPageInstance);

    void onUnregisterPage(BtmPageInstance btmPageInstance);

    boolean registerBtmPage(View view, String str);
}
