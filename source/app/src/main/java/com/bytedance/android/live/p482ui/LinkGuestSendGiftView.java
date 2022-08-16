package com.bytedance.android.live.p482ui;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC78902H8m;
import p003X.C106862S5w;
import p003X.C4313534v;
import p003X.C82037IVb;
import p003X.GWO;
import p003X.HMS;
import p003X.M0Q;

/* renamed from: com.bytedance.android.live.ui.LinkGuestSendGiftView */
/* loaded from: classes3.dex */
public class LinkGuestSendGiftView extends FrameLayout {
    public static ChangeQuickRedirect LIZIZ;
    public boolean LIZ;
    public String LIZJ;
    public final AbstractC78902H8m<String, View> LIZLLL;

    /* renamed from: LJ */
    public final Lazy f26747LJ;
    public final Lazy LJFF;
    public boolean LJI;

    static {
        Covode.recordClassIndex(36322);
    }

    public LinkGuestSendGiftView(Context context) {
        this(context, null, 0, 6, null);
    }

    public LinkGuestSendGiftView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    @Deprecated(message = "Please use 'setVisibility' to set visibility")
    public static /* synthetic */ void getAllowSendGift$annotations() {
    }

    private final HSImageView getFansTicketIcon() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZIZ, false, 1);
        return (HSImageView) (proxy.isSupported ? proxy.result : this.f26747LJ.mo27335getValue());
    }

    private final ConstraintLayout getGuestSendGiftContainer() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZIZ, false, 2);
        return (ConstraintLayout) (proxy.isSupported ? proxy.result : this.LJFF.mo27335getValue());
    }

    public final boolean getAllowSendGift() {
        return this.LJI;
    }

    public boolean LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZIZ, false, 7);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        return HMS.LIZ(LiveSettingKeys.LIVE_GIFT_MULTIPLE_SEND_OPTIMIZE, (Integer) 3);
    }

    @Deprecated(message = "Please use 'updateFunTicketCount' to replace this. If you want to let it VISIBLE, please use 'setVisibility'")
    public final void LIZ(String str) {
        LIZIZ(str);
        if (!this.LJI) {
            return;
        }
        setVisibility(0);
    }

    public final void setAllowSendGift(boolean z) {
        int i;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        setVisibility(i);
        this.LJI = z;
    }

    public final void setBackground(int i) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZIZ, false, 4).isSupported) {
            return;
        }
        getGuestSendGiftContainer().setBackgroundResource(i);
    }

    public final void LIZIZ(String str) {
        if (!PatchProxy.proxy(new Object[]{str}, this, LIZIZ, false, 3).isSupported && str != null && str.length() != 0) {
            if (this.LIZ || (true ^ Intrinsics.areEqual(this.LIZJ, str))) {
                this.LIZ = false;
                this.LIZLLL.LIZ(str);
                this.LIZJ = str;
            }
        }
    }

    public final void LIZ(int i, float f) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), Float.valueOf(f)}, this, LIZIZ, false, 5).isSupported) {
            return;
        }
        UIUtils.updateLayout(getFansTicketIcon(), i, i);
        this.LIZLLL.LIZ(1, f);
    }

    public final void LIZIZ(int i, float f) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), Float.valueOf(9.0f)}, this, LIZIZ, false, 6).isSupported) {
            return;
        }
        UIUtils.updateLayout(getFansTicketIcon(), i, i);
        this.LIZLLL.LIZ(2, 9.0f);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkGuestSendGiftView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C106862S5w.LIZ(context);
        MethodCollector.m14708i(2321);
        this.LIZ = true;
        this.LIZJ = "0";
        this.f26747LJ = LazyKt__LazyJVMKt.lazy(new LinkGuestSendGiftView$fansTicketIcon$2(this));
        if (LIZ()) {
            LayoutInflater.from(context).inflate(2131699970, this);
            this.LIZLLL = new C82037IVb(this);
        } else {
            LayoutInflater.from(context).inflate(2131699969, this);
            this.LIZLLL = new GWO(this);
        }
        if (!PatchProxy.proxy(new Object[0], this, LIZIZ, false, 8).isSupported) {
            SettingKey<String> settingKey = LiveSettingKeys.LIVE_ROOM_MICSEAT_VALUE_ICON;
            Intrinsics.checkNotNullExpressionValue(settingKey, "");
            String value = settingKey.getValue();
            if (TextUtils.isEmpty(value)) {
                M0Q.LIZ(getFansTicketIcon(), 2130857430);
            } else {
                HSImageView fansTicketIcon = getFansTicketIcon();
                Intrinsics.checkNotNullExpressionValue(value, "");
                M0Q.LIZ((ImageView) fansTicketIcon, ImageModel.genBy(C4313534v.LIZ(value)));
            }
        }
        this.LJFF = LazyKt__LazyJVMKt.lazy(new LinkGuestSendGiftView$guestSendGiftContainer$2(this));
        MethodCollector.m14707o(2321);
    }

    public /* synthetic */ LinkGuestSendGiftView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
