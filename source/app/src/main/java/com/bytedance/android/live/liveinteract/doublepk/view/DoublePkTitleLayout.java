package com.bytedance.android.live.liveinteract.doublepk.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.live.liveinteract.widget.widget.NoPaddingTextView;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.unisus.uniservice.logger.LoggerUtil;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p003X.C106862S5w;
import p003X.C116971W2r;
import p003X.H5U;
import p003X.H5V;
import p003X.LK5;
import p003X.RunnableC63251Axh;

/* loaded from: classes3.dex */
public final class DoublePkTitleLayout extends LinearLayout {
    public static ChangeQuickRedirect LIZ;
    public int LIZIZ;
    public final ViewGroup LIZJ;
    public final TextView LIZLLL;

    /* renamed from: LJ */
    public final NoPaddingTextView f26313LJ;
    public final H5U LJFF;

    static {
        Covode.recordClassIndex(26830);
    }

    public DoublePkTitleLayout(Context context) {
        this(context, null, 0, 6, null);
    }

    public DoublePkTitleLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final void setStartMode(boolean z) {
    }

    private final void LIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 4).isSupported) {
            return;
        }
        this.LIZIZ = -1;
        RunnableC63251Axh.LIZIZ.LIZIZ(this.LJFF);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 6).isSupported) {
            return;
        }
        super.onDetachedFromWindow();
        LIZ();
    }

    public final void LIZIZ(int i) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 3).isSupported) {
            return;
        }
        UIUtils.setViewVisibility(this.f26313LJ, 0);
        this.f26313LJ.setText(LIZ(i));
    }

    private String LIZ(long j) {
        String valueOf;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{new Long(j)}, this, LIZ, false, 5);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        long j2 = j / 60;
        long j3 = j % 60;
        String valueOf2 = String.valueOf(j2);
        if (j3 < 10) {
            valueOf = "0" + j3;
        } else {
            valueOf = String.valueOf(j3);
        }
        return valueOf2 + LoggerUtil.TWO_POINT_TAG + valueOf;
    }

    public final void LIZ(int i) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 1).isSupported) {
            return;
        }
        LIZ();
        if (i > 0) {
            this.LIZLLL.setText(LK5.LIZ(2131582980));
            this.LIZIZ = i;
            RunnableC63251Axh.LIZIZ.LIZ(this.LJFF);
            LIZIZ(i);
        } else {
            this.LIZLLL.setText(LK5.LIZ(2131582982));
            UIUtils.setViewVisibility(this.f26313LJ, 8);
        }
        UIUtils.updateLayout(this.LIZJ, -2, -3);
    }

    public final void setFinisState(int i) {
        String LIZ2;
        Map<String, String> map;
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 2).isSupported) {
            return;
        }
        LIZ();
        if (i > 0) {
            TextView textView = this.LIZLLL;
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], H5V.LIZIZ, H5V.LIZ, false, 1);
            if (proxy.isSupported) {
                LIZ2 = (String) proxy.result;
            } else {
                SettingKey<Map<String, Map<String, String>>> settingKey = LiveSettingKeys.LIVE_LINKMIC_PLAY_STATUS_NAME;
                Intrinsics.checkNotNullExpressionValue(settingKey, "");
                Map<String, Map<String, String>> value = settingKey.getValue();
                if (value == null || (map = value.get("18")) == null || (LIZ2 = map.get("6")) == null) {
                    LIZ2 = LK5.LIZ(2131585554);
                    Intrinsics.checkNotNullExpressionValue(LIZ2, "");
                }
            }
            textView.setText(LIZ2);
            this.LIZIZ = i;
            RunnableC63251Axh.LIZIZ.LIZ(this.LJFF);
            LIZIZ(i);
            return;
        }
        UIUtils.setViewVisibility(this.f26313LJ, 8);
        this.LIZLLL.setText(LK5.LIZ(2131582981));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DoublePkTitleLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C106862S5w.LIZ(context);
        MethodCollector.m14708i(1818);
        this.LJFF = new H5U(this);
        C116971W2r.LIZ(LayoutInflater.from(context), 2131699010, (ViewGroup) this, true);
        setOrientation(0);
        View findViewById = findViewById(2131192302);
        Intrinsics.checkNotNullExpressionValue(findViewById, "");
        this.LIZJ = (ViewGroup) findViewById;
        View findViewById2 = findViewById(2131194137);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "");
        this.LIZLLL = (TextView) findViewById2;
        View findViewById3 = findViewById(2131165258);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "");
        this.f26313LJ = (NoPaddingTextView) findViewById3;
        MethodCollector.m14707o(1818);
    }

    public /* synthetic */ DoublePkTitleLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
