package com.bytedance.android.live.liveinteract.chatroom.chatroom.p353ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p003X.C106862S5w;
import p003X.C116971W2r;

/* renamed from: com.bytedance.android.live.liveinteract.chatroom.chatroom.ui.ChatRoomLinkAlertView */
/* loaded from: classes.dex */
public final class ChatRoomLinkAlertView extends FrameLayout {
    public static ChangeQuickRedirect LIZ;
    public ImageView LIZIZ;

    static {
        Covode.recordClassIndex(26404);
    }

    public ChatRoomLinkAlertView(Context context) {
        this(context, null, 0, 6, null);
    }

    public ChatRoomLinkAlertView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatRoomLinkAlertView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C106862S5w.LIZ(context);
        MethodCollector.m14708i(1765);
        C116971W2r.LIZ(LayoutInflater.from(context), 2131700178, (ViewGroup) this, true);
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
            Intrinsics.checkNotNullExpressionValue(findViewById(2131193417), "");
            View findViewById = findViewById(2131165351);
            Intrinsics.checkNotNullExpressionValue(findViewById, "");
            this.LIZIZ = (ImageView) findViewById;
        }
        MethodCollector.m14707o(1765);
    }

    public /* synthetic */ ChatRoomLinkAlertView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
