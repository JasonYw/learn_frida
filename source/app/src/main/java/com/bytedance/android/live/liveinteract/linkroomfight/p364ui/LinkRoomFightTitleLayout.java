package com.bytedance.android.live.liveinteract.linkroomfight.p364ui;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.live.liveinteract.widget.widget.NoPaddingTextView;
import com.bytedance.android.live.liveinteract.widget.widget.PkTitleTextView;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p003X.C106862S5w;
import p003X.C116971W2r;
import p003X.C3Q0;
import p003X.C78799H4n;
import p003X.C79518HWe;
import p003X.C79528HWo;
import p003X.C81294I2m;
import p003X.LK5;

/* renamed from: com.bytedance.android.live.liveinteract.linkroomfight.ui.LinkRoomFightTitleLayout */
/* loaded from: classes3.dex */
public final class LinkRoomFightTitleLayout extends LinearLayout {
    public static ChangeQuickRedirect LIZ;
    public final ViewGroup LIZIZ;
    public final PkTitleTextView LIZJ;
    public final NoPaddingTextView LIZLLL;

    static {
        Covode.recordClassIndex(27781);
    }

    public LinkRoomFightTitleLayout(Context context) {
        this(context, null, 0, 6, null);
    }

    public LinkRoomFightTitleLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final void setAnchor(boolean z) {
    }

    public final void setStartMode(boolean z) {
    }

    private final void LIZIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 7).isSupported) {
            return;
        }
        this.LIZIZ.setAlpha(1.0f);
    }

    public final void LIZ() {
        String LIZ2;
        Map<String, String> map;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 4).isSupported) {
            return;
        }
        LIZIZ();
        this.LIZIZ.setAlpha(1.0f);
        this.LIZIZ.setBackgroundResource(2130857994);
        PkTitleTextView pkTitleTextView = this.LIZJ;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], C78799H4n.LIZIZ, C78799H4n.LIZ, false, 2);
        if (proxy.isSupported) {
            LIZ2 = (String) proxy.result;
        } else {
            SettingKey<Map<String, Map<String, String>>> settingKey = LiveSettingKeys.LIVE_LINKMIC_PLAY_STATUS_NAME;
            Intrinsics.checkNotNullExpressionValue(settingKey, "");
            Map<String, Map<String, String>> value = settingKey.getValue();
            if (value == null || (map = value.get("16")) == null || (LIZ2 = map.get("6")) == null) {
                LIZ2 = LK5.LIZ(2131584985);
                Intrinsics.checkNotNullExpressionValue(LIZ2, "");
            }
        }
        pkTitleTextView.setPkTitle(LIZ2);
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 6).isSupported) {
            UIUtils.setViewVisibility(this.LIZLLL, 8);
        }
    }

    public final void LIZ(long j) {
        if (PatchProxy.proxy(new Object[]{new Long(j)}, this, LIZ, false, 5).isSupported) {
            return;
        }
        UIUtils.setViewVisibility(this.LIZLLL, 0);
        this.LIZLLL.setText(C81294I2m.LIZ(j));
    }

    public final void setFightingState(long j) {
        if (PatchProxy.proxy(new Object[]{new Long(j)}, this, LIZ, false, 2).isSupported) {
            return;
        }
        LIZIZ();
        this.LIZJ.setPkTitle(LK5.LIZ(2131585018));
        this.LIZJ.setTextSize(2, 12.0f);
        C3Q0.LIZLLL(this.LIZJ, LK5.LIZ(2.0f));
        this.LIZIZ.setAlpha(1.0f);
        this.LIZIZ.setBackgroundResource(2130857994);
        UIUtils.updateLayout(this.LIZIZ, -2, -3);
        LIZ(j);
    }

    public final void setPenalState(long j) {
        String LIZ2;
        Map<String, String> map;
        if (PatchProxy.proxy(new Object[]{new Long(j)}, this, LIZ, false, 3).isSupported) {
            return;
        }
        LIZIZ();
        this.LIZIZ.setAlpha(1.0f);
        this.LIZIZ.setBackgroundResource(2130857994);
        PkTitleTextView pkTitleTextView = this.LIZJ;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], C78799H4n.LIZIZ, C78799H4n.LIZ, false, 1);
        if (proxy.isSupported) {
            LIZ2 = (String) proxy.result;
        } else {
            SettingKey<Map<String, Map<String, String>>> settingKey = LiveSettingKeys.LIVE_LINKMIC_PLAY_STATUS_NAME;
            Intrinsics.checkNotNullExpressionValue(settingKey, "");
            Map<String, Map<String, String>> value = settingKey.getValue();
            if (value == null || (map = value.get("16")) == null || (LIZ2 = map.get("4")) == null) {
                LIZ2 = LK5.LIZ(2131585554);
                Intrinsics.checkNotNullExpressionValue(LIZ2, "");
            }
        }
        pkTitleTextView.setPkTitle(LIZ2);
        C3Q0.LIZLLL(this.LIZJ, LK5.LIZ(2.0f));
        LIZ(j);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkRoomFightTitleLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C106862S5w.LIZ(context);
        MethodCollector.m14708i(1896);
        C116971W2r.LIZ(LayoutInflater.from(context), 2131699973, (ViewGroup) this, true);
        setOrientation(0);
        View findViewById = findViewById(2131192302);
        Intrinsics.checkNotNullExpressionValue(findViewById, "");
        this.LIZIZ = (ViewGroup) findViewById;
        View findViewById2 = findViewById(2131194137);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "");
        this.LIZJ = (PkTitleTextView) findViewById2;
        View findViewById3 = findViewById(2131165258);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "");
        this.LIZLLL = (NoPaddingTextView) findViewById3;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
            this.LIZJ.setTypeface(Typeface.DEFAULT);
            TextPaint paint = this.LIZJ.getPaint();
            Intrinsics.checkNotNullExpressionValue(paint, "");
            paint.setFakeBoldText(true);
            this.LIZJ.setGradient(false);
            this.LIZJ.setTextSize(2, 12.0f);
            PkTitleTextView pkTitleTextView = this.LIZJ;
            C79518HWe c79518HWe = new C79518HWe();
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            pkTitleTextView.LIZ(c79518HWe, new C79528HWo(context2));
            NoPaddingTextView noPaddingTextView = this.LIZLLL;
            Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "");
            noPaddingTextView.setTypeface(Typeface.createFromAsset(context3.getAssets(), "fonts/clarity_mono_bold.otf"));
            this.LIZLLL.setPadding(0, 0, 0, LK5.LIZ(1.0f));
        }
        MethodCollector.m14707o(1896);
    }

    public /* synthetic */ LinkRoomFightTitleLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
