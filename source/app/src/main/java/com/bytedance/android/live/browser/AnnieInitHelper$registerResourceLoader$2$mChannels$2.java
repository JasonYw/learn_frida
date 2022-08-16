package com.bytedance.android.live.browser;

import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.C88350KrY;

/* loaded from: classes5.dex */
public final class AnnieInitHelper$registerResourceLoader$2$mChannels$2 extends Lambda implements Function0<List<String>> {
    public static final AnnieInitHelper$registerResourceLoader$2$mChannels$2 INSTANCE = new AnnieInitHelper$registerResourceLoader$2$mChannels$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(21864);
    }

    public AnnieInitHelper$registerResourceLoader$2$mChannels$2() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, java.util.List<java.lang.String>] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ List<String> mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        ArrayList arrayList = new ArrayList();
        List<String> list = C88350KrY.LIZIZ;
        Intrinsics.checkNotNullExpressionValue(list, "");
        arrayList.addAll(list);
        SettingKey<List<String>> settingKey = LiveConfigSettingKeys.LIVE_LYNX_GECKO_CHANNEL_LIST;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        List<String> value = settingKey.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        arrayList.addAll(value);
        return arrayList;
    }
}
