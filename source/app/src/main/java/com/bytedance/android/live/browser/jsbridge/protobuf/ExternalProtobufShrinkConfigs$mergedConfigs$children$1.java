package com.bytedance.android.live.browser.jsbridge.protobuf;

import com.bytedance.android.live.browser.jsbridge.protobuf.C4041d;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;

/* loaded from: classes8.dex */
public final class ExternalProtobufShrinkConfigs$mergedConfigs$children$1 extends Lambda implements Function1<Map.Entry<? extends String, ? extends C4041d.C4042b>, Boolean> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C4041d.C4042b $config;

    static {
        Covode.recordClassIndex(22945);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExternalProtobufShrinkConfigs$mergedConfigs$children$1(C4041d.C4042b c4042b) {
        super(1);
        this.$config = c4042b;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Boolean invoke(Map.Entry<? extends String, ? extends C4041d.C4042b> entry) {
        boolean containsKey;
        Map.Entry<? extends String, ? extends C4041d.C4042b> entry2 = entry;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{entry2}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            containsKey = ((Boolean) proxy.result).booleanValue();
        } else {
            C106862S5w.LIZ(entry2);
            containsKey = this.$config.LIZLLL.containsKey(entry2.getKey());
        }
        return Boolean.valueOf(containsKey);
    }
}
