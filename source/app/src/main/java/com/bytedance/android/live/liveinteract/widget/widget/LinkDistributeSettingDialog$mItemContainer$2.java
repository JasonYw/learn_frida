package com.bytedance.android.live.liveinteract.widget.widget;

import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.DialogC77613Gil;

/* loaded from: classes3.dex */
public final class LinkDistributeSettingDialog$mItemContainer$2 extends Lambda implements Function0<ViewGroup> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ DialogC77613Gil this$0;

    static {
        Covode.recordClassIndex(31935);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkDistributeSettingDialog$mItemContainer$2(DialogC77613Gil dialogC77613Gil) {
        super(0);
        this.this$0 = dialogC77613Gil;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r1v3, types: [android.view.View, java.lang.Object, android.view.ViewGroup] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ ViewGroup mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        ?? findViewById = this.this$0.findViewById(2131181717);
        Intrinsics.checkNotNull(findViewById);
        Intrinsics.checkNotNullExpressionValue(findViewById, "");
        return findViewById;
    }
}
