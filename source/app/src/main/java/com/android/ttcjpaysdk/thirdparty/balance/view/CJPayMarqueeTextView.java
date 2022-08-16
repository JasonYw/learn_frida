package com.android.ttcjpaysdk.thirdparty.balance.view;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* loaded from: classes22.dex */
public class CJPayMarqueeTextView extends AppCompatTextView {
    public static ChangeQuickRedirect LIZ;
    public boolean LIZIZ = true;

    static {
        Covode.recordClassIndex(8002);
    }

    @Override // android.view.View
    public boolean isFocused() {
        return this.LIZIZ;
    }

    public CJPayMarqueeTextView(Context context) {
        super(context);
    }

    @Override // android.widget.TextView, android.view.View
    public void onWindowFocusChanged(boolean z) {
        if (!PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 3).isSupported && z) {
            super.onWindowFocusChanged(true);
        }
    }

    public void setMarqueeEnable(boolean z) {
        if (!PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 1).isSupported && this.LIZIZ != z) {
            this.LIZIZ = z;
            if (z) {
                setEllipsize(TextUtils.TruncateAt.MARQUEE);
            } else {
                setEllipsize(TextUtils.TruncateAt.END);
            }
            onWindowFocusChanged(z);
        }
    }

    public CJPayMarqueeTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CJPayMarqueeTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // android.widget.TextView, android.view.View
    public void onFocusChanged(boolean z, int i, Rect rect) {
        if (!PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), rect}, this, LIZ, false, 2).isSupported && z) {
            super.onFocusChanged(true, i, rect);
        }
    }
}
