package com.bytedance.android.live.broadcast.widget;

import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.livesdk.config.C6947ec;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
public final class PreviewToolAreaWidget$mToolAreaConfig$2 extends Lambda implements Function0<C6947ec> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ PreviewToolAreaWidget this$0;

    static {
        Covode.recordClassIndex(18738);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreviewToolAreaWidget$mToolAreaConfig$2(PreviewToolAreaWidget previewToolAreaWidget) {
        super(0);
        this.this$0 = previewToolAreaWidget;
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [com.bytedance.android.livesdk.config.ec, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ C6947ec mo30099invoke() {
        Object mo27335getValue;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        PreviewToolAreaWidget previewToolAreaWidget = this.this$0;
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[0], previewToolAreaWidget, PreviewToolAreaWidget.LIZ, false, 5);
        if (proxy2.isSupported) {
            mo27335getValue = proxy2.result;
        } else {
            mo27335getValue = previewToolAreaWidget.LIZIZ.mo27335getValue();
        }
        if (((Boolean) mo27335getValue).booleanValue()) {
            return C6947ec.LIZIZ.LIZ();
        }
        SettingKey<C6947ec> settingKey = LiveConfigSettingKeys.LIVE_PREVIEW_TOOL_AREA_CONFIG;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        return settingKey.getValue();
    }
}
