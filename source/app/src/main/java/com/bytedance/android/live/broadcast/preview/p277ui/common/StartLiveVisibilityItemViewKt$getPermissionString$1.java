package com.bytedance.android.live.broadcast.preview.p277ui.common;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.LK5;

/* renamed from: com.bytedance.android.live.broadcast.preview.ui.common.StartLiveVisibilityItemViewKt$getPermissionString$1 */
/* loaded from: classes22.dex */
public final class StartLiveVisibilityItemViewKt$getPermissionString$1 extends Lambda implements Function1<Integer, String> {
    public static final StartLiveVisibilityItemViewKt$getPermissionString$1 INSTANCE = new StartLiveVisibilityItemViewKt$getPermissionString$1();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(17433);
    }

    public StartLiveVisibilityItemViewKt$getPermissionString$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ String invoke(Integer num) {
        return LIZ(num.intValue());
    }

    public final String LIZ(int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        return LK5.LIZ(i);
    }
}
