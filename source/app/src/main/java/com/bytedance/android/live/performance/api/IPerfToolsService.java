package com.bytedance.android.live.performance.api;

import android.app.Activity;
import android.app.Dialog;
import com.bytedance.android.live.base.IService;
import com.bytedance.android.live.performance.p404b.C5179a;
import com.bytedance.covode.number.Covode;
import com.umeng.commonsdk.internal.C33836a;
import java.util.List;
import java.util.Map;

/* loaded from: classes17.dex */
public interface IPerfToolsService extends IService {
    static {
        Covode.recordClassIndex(C33836a.f42631g);
    }

    void addPerformanceData(String str, double d);

    void clearData();

    void clearSceneInfo();

    void dismiss();

    int getCurrentEntrance();

    int getCurrentPerformanceType();

    List<C5179a> getDataForEntrance(int i);

    List<Double> getDataForPerformanceEntrance(int i);

    String getNormalInfo(String str);

    String getPerformanceChartTitle(int i);

    void initAndShowDebugTool(boolean z);

    boolean isContentVisible();

    boolean isNormalViewVisible();

    boolean isPerformanceViewVisible();

    void removeSceneInfo(String str);

    IPerfToolsService setActivity(Activity activity);

    void setData(String str, String str2);

    void setDialog(Dialog dialog, boolean z);

    void setSceneInfo(String str, Map<String, String> map);

    void updateNormalInfo(C5179a c5179a);

    void updatePerformanceChart(double d);

    void verifyEntranceNormalData();
}
