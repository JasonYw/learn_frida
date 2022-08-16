package com.bytedance.android.live.liveinteract.plantform.utils;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C78656Gza;

/* loaded from: classes3.dex */
public final class TalkRoomLogUtilsKt$getCurrentPlayModes$1$filterPlayModes$1 extends Lambda implements Function1<Integer, String> {
    public static final TalkRoomLogUtilsKt$getCurrentPlayModes$1$filterPlayModes$1 INSTANCE = new TalkRoomLogUtilsKt$getCurrentPlayModes$1$filterPlayModes$1();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(29502);
    }

    public TalkRoomLogUtilsKt$getCurrentPlayModes$1$filterPlayModes$1() {
        super(1);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.lang.String] */
    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ String invoke(Integer num) {
        int intValue = num.intValue();
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(intValue)}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return C78656Gza.LIZ(intValue);
    }
}
