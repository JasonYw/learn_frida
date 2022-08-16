package com.bytedance.android.live.broadcastgame.widget;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class LiveGameControlWidget$processEffectGameSticker$1$startTimes$2 extends Lambda implements Function0<Map<Integer, Long>> {
    public static final LiveGameControlWidget$processEffectGameSticker$1$startTimes$2 INSTANCE = new LiveGameControlWidget$processEffectGameSticker$1$startTimes$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(21850);
    }

    public LiveGameControlWidget$processEffectGameSticker$1$startTimes$2() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.Map<java.lang.Integer, java.lang.Long>] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Map<Integer, Long> mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return new LinkedHashMap();
    }
}
