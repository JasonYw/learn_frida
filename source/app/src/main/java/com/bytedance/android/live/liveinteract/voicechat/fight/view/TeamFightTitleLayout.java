package com.bytedance.android.live.liveinteract.voicechat.fight.view;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.liveinteract.voicechat.fight.C5056a;
import com.bytedance.android.live.liveinteract.widget.widget.NoPaddingTextView;
import com.bytedance.android.live.liveinteract.widget.widget.PkTitleTextView;
import com.bytedance.android.live.user.IUserService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdk.chatroom.C5923dp;
import com.bytedance.android.livesdk.config.C6996fz;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.facebook.drawee.backends.pipeline.Fresco;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC413402Xu;
import p003X.C106862S5w;
import p003X.C116971W2r;
import p003X.C3Q0;
import p003X.C409882Kg;
import p003X.C78636GzG;
import p003X.C78652GzW;
import p003X.C79518HWe;
import p003X.C79528HWo;
import p003X.C81294I2m;
import p003X.H5X;
import p003X.H5Y;
import p003X.LK5;

/* loaded from: classes3.dex */
public final class TeamFightTitleLayout extends LinearLayout {
    public static ChangeQuickRedirect LIZ;
    public boolean LIZIZ;
    public boolean LIZJ;
    public final HSImageView LIZLLL;

    /* renamed from: LJ */
    public final ViewGroup f26489LJ;
    public final PkTitleTextView LJFF;
    public final NoPaddingTextView LJI;
    public Disposable LJII;

    static {
        Covode.recordClassIndex(31401);
    }

    public TeamFightTitleLayout(Context context) {
        this(context, null, 0, 6, null);
    }

    public TeamFightTitleLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
            return;
        }
        super.onDetachedFromWindow();
        Disposable disposable = this.LJII;
        if (disposable != null) {
            disposable.dispose();
        }
    }

    private final void LIZLLL() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 12).isSupported) {
            return;
        }
        this.LIZIZ = false;
        this.f26489LJ.setAlpha(1.0f);
        this.LIZLLL.setController(null);
        this.LIZLLL.setVisibility(4);
    }

    public final void LIZIZ() {
        int i;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 6).isSupported) {
            return;
        }
        PkTitleTextView pkTitleTextView = this.LJFF;
        if (this.LIZJ) {
            i = 2131588020;
        } else {
            i = 2131588015;
        }
        pkTitleTextView.setText(LK5.LIZ(i));
        ALogger.m15797i("TeamFightTitleLayout", "：administrator：" + this.LIZJ);
        if (this.LIZJ) {
            this.LJFF.setTextSize(2, 11.0f);
            this.f26489LJ.setBackgroundResource(2130857995);
            LIZ(11.0f, LK5.LIZ(72.0f), -3);
            return;
        }
        this.f26489LJ.setBackgroundResource(2130857994);
        UIUtils.updateLayout(this.f26489LJ, LK5.LIZ(68.0f), -3);
    }

    public final void LIZJ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 7).isSupported || this.LIZIZ) {
            return;
        }
        this.LIZIZ = true;
        this.LIZLLL.setController(Fresco.newDraweeControllerBuilder().mo27963setUri(C6996fz.LIZJ()).setAutoPlayAnimations(true).setControllerListener(new H5X(this)).mo27965build());
        this.LIZLLL.setVisibility(0);
        this.LJFF.setText(LK5.LIZ(2131588020));
        this.LJFF.setTextSize(2, 11.0f);
        this.LJFF.setGravity(17);
        C3Q0.LIZLLL(this.LJFF, 0);
        this.LJI.setVisibility(8);
        this.f26489LJ.setAlpha(1.0f);
        this.f26489LJ.setBackgroundResource(2130857995);
        LIZ(11.0f, LK5.LIZ(72.0f), -3);
    }

    public final void LIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 5).isSupported) {
            return;
        }
        this.LJFF.setGravity(17);
        this.LJFF.setTextSize(2, 12.0f);
        C3Q0.LIZLLL(this.LJFF, 0);
        this.LJI.setText("");
        this.LJI.setVisibility(8);
        LIZLLL();
        LIZIZ();
        if (this.LIZJ) {
            this.f26489LJ.setAlpha(0.5f);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        AbstractC413402Xu<Boolean> LJIILJJIL;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 2).isSupported) {
            return;
        }
        super.onAttachedToWindow();
        C5923dp LIZ2 = C409882Kg.LIZ(C5923dp.LJIIJ, null, 0L, 3, null);
        if (LIZ2 == null || (LJIILJJIL = LIZ2.LJIILJJIL()) == null || !LJIILJJIL.LIZIZ().booleanValue()) {
            Disposable disposable = this.LJII;
            if (disposable != null) {
                disposable.dispose();
            }
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 3);
            if (proxy.isSupported) {
                Object obj = proxy.result;
            } else {
                Disposable subscribe = ((IUserService) ServiceManager.getService(IUserService.class)).user().LJIIJ().observeOn(AndroidSchedulers.mainThread()).subscribe(new C78652GzW(this));
                Disposable disposable2 = this.LJII;
                if (disposable2 != null) {
                    disposable2.dispose();
                }
                this.LJII = subscribe;
            }
            if (C78636GzG.LIZIZ.LIZLLL() && C5056a.LIZJ.LIZLLL()) {
                this.LIZJ = true;
                LIZIZ();
            }
        }
    }

    public final void setStartMode(boolean z) {
        this.LIZIZ = z;
    }

    public final void LIZ(long j) {
        if (PatchProxy.proxy(new Object[]{new Long(j)}, this, LIZ, false, 10).isSupported) {
            return;
        }
        UIUtils.setViewVisibility(this.LJI, 0);
        this.LJI.setText(C81294I2m.LIZ(j));
    }

    public final void setFightingState(long j) {
        if (PatchProxy.proxy(new Object[]{new Long(j)}, this, LIZ, false, 8).isSupported) {
            return;
        }
        LIZLLL();
        this.LJFF.setPkTitle(LK5.LIZ(2131587982));
        this.LJFF.setTextSize(2, 12.0f);
        C3Q0.LIZLLL(this.LJFF, LK5.LIZ(2.0f));
        this.f26489LJ.setAlpha(1.0f);
        this.f26489LJ.setBackgroundResource(2130857994);
        UIUtils.updateLayout(this.f26489LJ, -2, -3);
        LIZ(j);
    }

    public final void setPenalState(long j) {
        String LIZ2;
        Map<String, String> map;
        if (PatchProxy.proxy(new Object[]{new Long(j)}, this, LIZ, false, 9).isSupported) {
            return;
        }
        LIZLLL();
        this.f26489LJ.setAlpha(1.0f);
        this.f26489LJ.setBackgroundResource(2130857994);
        PkTitleTextView pkTitleTextView = this.LJFF;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], H5Y.LIZIZ, H5Y.LIZ, false, 1);
        if (proxy.isSupported) {
            LIZ2 = (String) proxy.result;
        } else {
            SettingKey<Map<String, Map<String, String>>> settingKey = LiveSettingKeys.LIVE_LINKMIC_PLAY_STATUS_NAME;
            Intrinsics.checkNotNullExpressionValue(settingKey, "");
            Map<String, Map<String, String>> value = settingKey.getValue();
            if (value == null || (map = value.get("7")) == null || (LIZ2 = map.get("4")) == null) {
                LIZ2 = LK5.LIZ(2131585554);
                Intrinsics.checkNotNullExpressionValue(LIZ2, "");
            }
        }
        pkTitleTextView.setPkTitle(LIZ2);
        C3Q0.LIZLLL(this.LJFF, LK5.LIZ(2.0f));
        LIZ(j);
    }

    private final void LIZ(float f, int i, int i2) {
        if (PatchProxy.proxy(new Object[]{Float.valueOf(11.0f), Integer.valueOf(i), -3}, this, LIZ, false, 11).isSupported) {
            return;
        }
        String obj = this.LJFF.getText().toString();
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(LK5.LIZJ(11.0f));
        float measureText = textPaint.measureText(obj);
        float measureText2 = this.LJFF.getPaint().measureText(obj);
        if (measureText2 > measureText && measureText > 0.0f) {
            i = (int) (i * (measureText2 / measureText));
        }
        UIUtils.updateLayout(this.f26489LJ, i, -3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TeamFightTitleLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C106862S5w.LIZ(context);
        MethodCollector.m14708i(2085);
        C116971W2r.LIZ(LayoutInflater.from(context), 2131700247, (ViewGroup) this, true);
        setOrientation(0);
        View findViewById = findViewById(2131192302);
        Intrinsics.checkNotNullExpressionValue(findViewById, "");
        this.f26489LJ = (ViewGroup) findViewById;
        View findViewById2 = findViewById(2131194137);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "");
        this.LJFF = (PkTitleTextView) findViewById2;
        View findViewById3 = findViewById(2131165258);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "");
        this.LJI = (NoPaddingTextView) findViewById3;
        View findViewById4 = findViewById(2131192357);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "");
        this.LIZLLL = (HSImageView) findViewById4;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 4).isSupported) {
            this.LJFF.setTypeface(Typeface.DEFAULT);
            TextPaint paint = this.LJFF.getPaint();
            Intrinsics.checkNotNullExpressionValue(paint, "");
            paint.setFakeBoldText(true);
            this.LJFF.setGradient(false);
            this.LJFF.setTextSize(2, 12.0f);
            PkTitleTextView pkTitleTextView = this.LJFF;
            C79518HWe c79518HWe = new C79518HWe();
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            pkTitleTextView.LIZ(c79518HWe, new C79528HWo(context2));
            NoPaddingTextView noPaddingTextView = this.LJI;
            Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "");
            noPaddingTextView.setTypeface(Typeface.createFromAsset(context3.getAssets(), "fonts/clarity_mono_bold.otf"));
            this.LJI.setPadding(0, 0, 0, LK5.LIZ(1.0f));
        }
        MethodCollector.m14707o(2085);
    }

    public /* synthetic */ TeamFightTitleLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
