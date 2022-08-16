package com.bytedance.android.live.broadcast.bgbroadcast.game.window;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.android.livesdk.chatroom.widget.LiveMessageRecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003X.C106862S5w;

/* loaded from: classes3.dex */
public final class GameMsgRecyclerView extends LiveMessageRecyclerView {
    public static ChangeQuickRedirect LIZ;
    public int LJFF;

    static {
        Covode.recordClassIndex(14860);
    }

    public GameMsgRecyclerView(Context context) {
        this(context, null, 0, 6, null);
    }

    public GameMsgRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final int getMaxHeight() {
        return this.LJFF;
    }

    public final void setMaxHeight(int i) {
        this.LJFF = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i, int i2) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, LIZ, false, 1).isSupported) {
            return;
        }
        int i3 = this.LJFF;
        if (i3 > 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GameMsgRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C106862S5w.LIZ(context);
    }

    public /* synthetic */ GameMsgRecyclerView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
