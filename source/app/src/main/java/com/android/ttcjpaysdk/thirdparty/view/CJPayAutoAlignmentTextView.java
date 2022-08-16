package com.android.ttcjpaysdk.thirdparty.view;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* loaded from: classes22.dex */
public class CJPayAutoAlignmentTextView extends AppCompatTextView {
    public static ChangeQuickRedirect LIZ;
    public int LIZIZ;
    public int LIZJ;

    static {
        Covode.recordClassIndex(9205);
    }

    public CJPayAutoAlignmentTextView(Context context) {
        super(context);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00dd, code lost:
        if (((java.lang.Boolean) r1.result).booleanValue() != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00df, code lost:
        r18.drawText("  ", 0.0f, r17.LIZIZ, getPaint());
        r11 = android.text.StaticLayout.getDesiredWidth("  ", getPaint()) + 0.0f;
        r2 = r2.substring(3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x016b, code lost:
        if (r2.charAt(r12) == ' ') goto L23;
     */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v2 */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onDraw(android.graphics.Canvas r18) {
        /*
            Method dump skipped, instructions count: 422
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.ttcjpaysdk.thirdparty.view.CJPayAutoAlignmentTextView.onDraw(android.graphics.Canvas):void");
    }

    public CJPayAutoAlignmentTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CJPayAutoAlignmentTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, LIZ, false, 1).isSupported) {
            return;
        }
        super.onLayout(z, i, i2, i3, i4);
    }
}
