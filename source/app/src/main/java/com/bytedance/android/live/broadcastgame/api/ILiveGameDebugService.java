package com.bytedance.android.live.broadcastgame.api;

import android.view.ViewGroup;
import com.bytedance.android.live.base.IService;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.widgets.WidgetManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import p003X.C6D6;

/* loaded from: classes23.dex */
public interface ILiveGameDebugService extends IService {
    static {
        Covode.recordClassIndex(19012);
    }

    void clearMessage(Class<?> cls);

    void dispatchLiveGameDebugMsg(C6D6 c6d6);

    void registerMessageWatcher(Class<?> cls, boolean z, Function1<?, Unit> function1);

    void setDebugContainer(WidgetManager widgetManager, ViewGroup viewGroup);

    void startLiveGameDebug();

    void stopLiveGameDebug();

    void unregisterMessageWatcher(Class<?> cls, Function1<?, Unit> function1);
}
