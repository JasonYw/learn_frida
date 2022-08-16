package com.android.ttcjpaysdk.thirdparty.view;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.appcompat.app.AppCompatDelegate;
import com.android.ttcjpaysdk.base.CJPayHostInfo;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.p1300mt.protector.impl.CastProtectorUtils;
import p003X.C135343c9S;
import p003X.C499305oK;

/* loaded from: classes17.dex */
public class CJPayCustomRoundCornerImageView extends CJPayRoundCornerImageView {
    public static ChangeQuickRedirect LIZ;
    public int LIZJ = CastProtectorUtils.parseColor("#FE2C55");

    static {
        Covode.recordClassIndex(9206);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 3).isSupported && !PatchProxy.proxy(new Object[]{this}, null, LIZ, true, 2).isSupported) {
            if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 4).isSupported) {
                super.onDetachedFromWindow();
            }
            C499305oK.LIZ(this);
        }
    }

    public CJPayCustomRoundCornerImageView(Context context) {
        super(context);
        LIZ(context);
    }

    private void LIZ(Context context) {
        if (PatchProxy.proxy(new Object[]{context}, this, LIZ, false, 1).isSupported) {
            return;
        }
        try {
            String str = CJPayHostInfo.inheritTheme;
            if (!TextUtils.isEmpty(str)) {
                if ("light".equals(str)) {
                    this.LIZJ = Color.parseColor(C135343c9S.LIZ().LIZJ().LIZIZ.LIZ);
                } else if ("dark".equals(str)) {
                    this.LIZJ = Color.parseColor("#26FFFFFF");
                } else {
                    this.LIZJ = Color.parseColor(C135343c9S.LIZ().LIZJ().LIZIZ.LIZ);
                }
            } else if (CJPayHostInfo.isFollowSystemTheme) {
                if (AppCompatDelegate.getDefaultNightMode() == 2) {
                    this.LIZJ = Color.parseColor("#26FFFFFF");
                } else {
                    this.LIZJ = Color.parseColor(C135343c9S.LIZ().LIZJ().LIZIZ.LIZ);
                }
            } else if ("dark".equals(C135343c9S.LIZ().LIZJ().LIZ)) {
                this.LIZJ = Color.parseColor("#26FFFFFF");
            } else {
                this.LIZJ = Color.parseColor(C135343c9S.LIZ().LIZJ().LIZIZ.LIZ);
            }
        } catch (Exception unused) {
        }
        setImageDrawable(new ColorDrawable(this.LIZJ));
    }

    public CJPayCustomRoundCornerImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LIZ(context);
    }

    public CJPayCustomRoundCornerImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LIZ(context);
    }
}
