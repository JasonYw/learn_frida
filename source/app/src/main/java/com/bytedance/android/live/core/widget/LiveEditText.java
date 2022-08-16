package com.bytedance.android.live.core.widget;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatEditText;
import com.bytedance.android.live.core.utils.AbstractC4148aa;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* loaded from: classes17.dex */
public class LiveEditText extends AppCompatEditText {
    public static ChangeQuickRedirect LIZLLL;

    /* renamed from: LJ */
    public static AbstractC4148aa f26206LJ;
    public static boolean LJFF;

    static {
        Covode.recordClassIndex(24227);
    }

    public static void setEnableHostTypeface(boolean z) {
        LJFF = z;
    }

    public static void setFontManager(AbstractC4148aa abstractC4148aa) {
        f26206LJ = abstractC4148aa;
    }

    public LiveEditText(Context context) {
        this(context, null);
    }

    public final void LIZ(AttributeSet attributeSet) {
        Typeface LIZ;
        if (PatchProxy.proxy(new Object[]{attributeSet}, this, LIZLLL, false, 1).isSupported || !LJFF || attributeSet == null) {
            return;
        }
        int attributeIntValue = attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "textStyle", 0);
        AbstractC4148aa abstractC4148aa = f26206LJ;
        if (abstractC4148aa != null && (LIZ = abstractC4148aa.LIZ(attributeIntValue)) != null) {
            setTypeface(LIZ);
        }
    }

    public LiveEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LIZ(attributeSet);
    }

    public LiveEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
