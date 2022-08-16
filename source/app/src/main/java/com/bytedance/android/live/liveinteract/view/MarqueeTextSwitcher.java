package com.bytedance.android.live.liveinteract.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextSwitcher;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003X.C106862S5w;
import p003X.C91461M1n;

/* loaded from: classes5.dex */
public final class MarqueeTextSwitcher extends TextSwitcher {
    public static ChangeQuickRedirect LIZ;

    static {
        Covode.recordClassIndex(30754);
    }

    public MarqueeTextSwitcher(Context context) {
        this(context, null, 2, null);
    }

    @Override // android.widget.TextSwitcher
    public final void setCurrentText(CharSequence charSequence) {
        if (PatchProxy.proxy(new Object[]{charSequence}, this, LIZ, false, 2).isSupported) {
            return;
        }
        super.setCurrentText(charSequence);
        View currentView = getCurrentView();
        if (!(currentView instanceof C91461M1n)) {
            currentView = null;
        }
        C91461M1n c91461M1n = (C91461M1n) currentView;
        if (c91461M1n != null) {
            c91461M1n.setOriginText(charSequence);
        }
    }

    @Override // android.widget.TextSwitcher
    public final void setText(CharSequence charSequence) {
        if (PatchProxy.proxy(new Object[]{charSequence}, this, LIZ, false, 1).isSupported) {
            return;
        }
        super.setText(charSequence);
        View currentView = getCurrentView();
        if (!(currentView instanceof C91461M1n)) {
            currentView = null;
        }
        C91461M1n c91461M1n = (C91461M1n) currentView;
        if (c91461M1n != null) {
            c91461M1n.setOriginText(charSequence);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarqueeTextSwitcher(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C106862S5w.LIZ(context);
        MethodCollector.m14708i(2069);
        MethodCollector.m14707o(2069);
    }

    public /* synthetic */ MarqueeTextSwitcher(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
