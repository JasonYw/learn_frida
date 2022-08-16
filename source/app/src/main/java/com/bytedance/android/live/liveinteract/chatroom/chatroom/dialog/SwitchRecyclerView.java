package com.bytedance.android.live.liveinteract.chatroom.chatroom.dialog;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.C106862S5w;

/* loaded from: classes12.dex */
public final class SwitchRecyclerView extends RecyclerView {
    public static ChangeQuickRedirect LIZ;

    static {
        Covode.recordClassIndex(25443);
    }

    @Override // android.view.View
    public final float getTopFadingEdgeStrength() {
        return 0.0f;
    }

    @Override // android.view.View
    public final float getBottomFadingEdgeStrength() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        if (proxy.isSupported) {
            return ((Float) proxy.result).floatValue();
        }
        return super.getBottomFadingEdgeStrength();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwitchRecyclerView(Context context) {
        super(context);
        C106862S5w.LIZ(context);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwitchRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C106862S5w.LIZ(context);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwitchRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C106862S5w.LIZ(context);
    }
}
