package com.bytedance.android.live.core.widget;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import com.bytedance.android.live.core.utils.AbstractC4148aa;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* loaded from: classes8.dex */
public class LiveTextView extends AppCompatTextView {
    public static ChangeQuickRedirect LIZIZ;
    public static AbstractC4148aa LIZJ;

    /* renamed from: LJ */
    public static boolean f26207LJ;

    static {
        Covode.recordClassIndex(24228);
    }

    public static void setEnableHostTypeface(boolean z) {
        f26207LJ = z;
    }

    public static void setFontManager(AbstractC4148aa abstractC4148aa) {
        LIZJ = abstractC4148aa;
    }

    public LiveTextView(Context context) {
        this(context, null);
    }

    private void LIZ(AttributeSet attributeSet) {
        Typeface LIZ;
        if (PatchProxy.proxy(new Object[]{attributeSet}, this, LIZIZ, false, 1).isSupported || !f26207LJ || attributeSet == null) {
            return;
        }
        int attributeIntValue = attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "textStyle", 0);
        AbstractC4148aa abstractC4148aa = LIZJ;
        if (abstractC4148aa != null && (LIZ = abstractC4148aa.LIZ(attributeIntValue)) != null) {
            setTypeface(LIZ);
        }
    }

    public LiveTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LIZ(attributeSet);
    }

    public LiveTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LIZ(attributeSet);
    }
}
