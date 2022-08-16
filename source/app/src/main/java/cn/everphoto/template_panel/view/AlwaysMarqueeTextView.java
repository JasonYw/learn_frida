package cn.everphoto.template_panel.view;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.C86039JvN;

/* loaded from: classes4.dex */
public final class AlwaysMarqueeTextView extends C86039JvN {
    public static ChangeQuickRedirect LIZIZ;

    static {
        Covode.recordClassIndex(3823);
    }

    @Override // android.view.View
    public final boolean isFocused() {
        return true;
    }

    public AlwaysMarqueeTextView(Context context) {
        super(context);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean z) {
        if (!PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZIZ, false, 2).isSupported && z) {
            super.onWindowFocusChanged(z);
        }
    }

    public AlwaysMarqueeTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AlwaysMarqueeTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        if (!PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), rect}, this, LIZIZ, false, 1).isSupported && z) {
            super.onFocusChanged(z, i, rect);
        }
    }
}
