package com.bytedance.android.live.broadcast.widget;

import android.widget.LinearLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes4.dex */
public final class PreviewAudioInteractModeChooserWidget$initView$getTabLP$1 extends Lambda implements Function1<Integer, LinearLayout.LayoutParams> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ List $views;

    static {
        Covode.recordClassIndex(18422);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreviewAudioInteractModeChooserWidget$initView$getTabLP$1(List list) {
        super(1);
        this.$views = list;
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, android.widget.LinearLayout$LayoutParams] */
    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ LinearLayout.LayoutParams invoke(Integer num) {
        int intValue = num.intValue();
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(intValue)}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        if (this.$views.size() <= 4) {
            return new LinearLayout.LayoutParams(intValue / this.$views.size(), -1);
        }
        return new LinearLayout.LayoutParams((int) (intValue / 3.5f), -1);
    }
}
