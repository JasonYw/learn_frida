package com.bytedance.android.live.liveinteract.plantform.utils;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsKt;
import p003X.C106862S5w;
import p003X.C78656Gza;

/* loaded from: classes3.dex */
public final class TalkRoomLogUtilsKt$getCurrentPlayModes$1$filterPlayModes$2 extends Lambda implements Function1<String, Boolean> {
    public static final TalkRoomLogUtilsKt$getCurrentPlayModes$1$filterPlayModes$2 INSTANCE = new TalkRoomLogUtilsKt$getCurrentPlayModes$1$filterPlayModes$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(29503);
    }

    public TalkRoomLogUtilsKt$getCurrentPlayModes$1$filterPlayModes$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Boolean invoke(String str) {
        String str2 = str;
        boolean z = true;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str2}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            z = ((Boolean) proxy.result).booleanValue();
        } else {
            C106862S5w.LIZ(str2);
            if ((C78656Gza.LIZIZ && StringsKt__StringsKt.contains$default((CharSequence) str2, (CharSequence) "normal(", false, 2, (Object) null)) || !(!Intrinsics.areEqual(str2, "normal"))) {
                z = false;
            }
        }
        return Boolean.valueOf(z);
    }
}
