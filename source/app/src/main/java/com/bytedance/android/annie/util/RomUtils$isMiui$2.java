package com.bytedance.android.annie.util;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C116971W2r;

/* loaded from: classes2.dex */
public final class RomUtils$isMiui$2 extends Lambda implements Function0<Boolean> {
    public static final RomUtils$isMiui$2 INSTANCE = new RomUtils$isMiui$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(11217);
    }

    public RomUtils$isMiui$2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Boolean mo30099invoke() {
        return Boolean.valueOf(LIZ());
    }

    private boolean LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        try {
            if (C116971W2r.LIZ("miui.os.Build") == null) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
