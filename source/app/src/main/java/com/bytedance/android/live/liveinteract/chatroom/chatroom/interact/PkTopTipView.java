package com.bytedance.android.live.liveinteract.chatroom.chatroom.interact;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.livesdk.chatroom.interact.model.AnchorTopTips;
import com.bytedance.android.livesdk.chatroom.interact.model.TopTip;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.facebook.drawee.view.SimpleDraweeView;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC80293Hkt;
import p003X.C106862S5w;
import p003X.C116971W2r;
import p003X.C3Q0;
import p003X.C4574547f;
import p003X.C87308Kak;
import p003X.LK1;
import p003X.LK5;
import p003X.M0Q;
import p003X.RunnableC147468fJW;
import p003X.RunnableC147469fJX;
import p003X.View$OnClickListenerC147466fJU;
import p003X.View$OnClickListenerC147467fJV;

/* loaded from: classes20.dex */
public final class PkTopTipView extends ConstraintLayout {
    public static ChangeQuickRedirect LIZ;
    public boolean LIZIZ;
    public boolean LIZJ;
    public HashMap LIZLLL;

    static {
        Covode.recordClassIndex(25640);
    }

    public final View LIZ(int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 4);
        if (proxy.isSupported) {
            return (View) proxy.result;
        }
        if (this.LIZLLL == null) {
            this.LIZLLL = new HashMap();
        }
        View view = (View) this.LIZLLL.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.LIZLLL.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final boolean getPkAvailable() {
        return this.LIZJ;
    }

    private final void LIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
            return;
        }
        C116971W2r.LIZ(LayoutInflater.from(getContext()), 2131700497, (ViewGroup) this, true);
        ConstraintLayout constraintLayout = (ConstraintLayout) LIZ(2131188369);
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        C3Q0.LIZIZ(constraintLayout, 0);
    }

    public final void setPkAvailable(boolean z) {
        this.LIZJ = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PkTopTipView(Context context) {
        super(context);
        C106862S5w.LIZ(context);
        LIZ();
    }

    public final void setData(AnchorTopTips anchorTopTips) {
        ImageModel imageModel;
        String str;
        if (PatchProxy.proxy(new Object[]{anchorTopTips}, this, LIZ, false, 3).isSupported) {
            return;
        }
        String str2 = null;
        if (anchorTopTips != null) {
            imageModel = anchorTopTips.LIZIZ;
        } else {
            imageModel = null;
        }
        M0Q.LIZ((HSImageView) LIZ(2131179698), imageModel);
        if (anchorTopTips != null) {
            str2 = anchorTopTips.LIZ;
        }
        TextView textView = (TextView) LIZ(2131165636);
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setText(str2);
        TextView textView2 = (TextView) LIZ(2131165636);
        Intrinsics.checkNotNullExpressionValue(textView2, "");
        textView2.setFocusable(false);
        TextView textView3 = (TextView) LIZ(2131165636);
        Intrinsics.checkNotNullExpressionValue(textView3, "");
        textView3.setFocusableInTouchMode(false);
        ((TextView) LIZ(2131165636)).postDelayed(new RunnableC147469fJX(this), 2000L);
        if (anchorTopTips != null && ((int) anchorTopTips.LIZJ) == AnchorTopTips.TopTipType.TopTipsPeakGuide.ordinal() && !this.LIZIZ) {
            ((TextView) LIZ(2131165636)).setTextColor(LK5.LIZIZ(2131629119));
            ((SimpleDraweeView) LIZ(2131179671)).setImageResource(2130856648);
            TextView textView4 = (TextView) LIZ(2131165636);
            Intrinsics.checkNotNullExpressionValue(textView4, "");
            textView4.setVisibility(0);
            HSImageView hSImageView = (HSImageView) LIZ(2131179671);
            Intrinsics.checkNotNullExpressionValue(hSImageView, "");
            hSImageView.setVisibility(0);
            ConstraintLayout constraintLayout = (ConstraintLayout) LIZ(2131188369);
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
            constraintLayout.setVisibility(0);
            ConstraintLayout constraintLayout2 = (ConstraintLayout) LIZ(2131188369);
            Intrinsics.checkNotNullExpressionValue(constraintLayout2, "");
            C3Q0.LIZIZ(constraintLayout2, LK1.LIZLLL(32));
            HashMap hashMap = new HashMap();
            if (this.LIZJ) {
                str = "pk_available";
            } else {
                str = "pk_not_available";
            }
            hashMap.put("remind_type", str);
            hashMap.put("content", String.valueOf((int) anchorTopTips.LIZJ));
            C4574547f.LIZ().LIZ("livesdk_yellow_bar_show", hashMap, Room.class);
        } else {
            ConstraintLayout constraintLayout3 = (ConstraintLayout) LIZ(2131188369);
            Intrinsics.checkNotNullExpressionValue(constraintLayout3, "");
            constraintLayout3.setVisibility(8);
        }
        ((HSImageView) LIZ(2131179671)).setOnClickListener(new View$OnClickListenerC147467fJV(this, anchorTopTips));
    }

    public final void setData(TopTip topTip) {
        ImageModel imageModel;
        if (PatchProxy.proxy(new Object[]{topTip}, this, LIZ, false, 2).isSupported) {
            return;
        }
        String str = null;
        if (topTip != null) {
            imageModel = topTip.LIZIZ;
        } else {
            imageModel = null;
        }
        M0Q.LIZ((HSImageView) LIZ(2131179698), imageModel);
        if (topTip != null) {
            str = topTip.LIZ;
        }
        TextView textView = (TextView) LIZ(2131165636);
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setText(str);
        TextView textView2 = (TextView) LIZ(2131165636);
        Intrinsics.checkNotNullExpressionValue(textView2, "");
        textView2.setFocusable(false);
        TextView textView3 = (TextView) LIZ(2131165636);
        Intrinsics.checkNotNullExpressionValue(textView3, "");
        textView3.setFocusableInTouchMode(false);
        ((TextView) LIZ(2131165636)).postDelayed(new RunnableC147468fJW(this), 2000L);
        if (topTip != null) {
            if (((int) topTip.LIZJ) == TopTip.TopTipType.TopTipPunish.ordinal()) {
                ((TextView) LIZ(2131165636)).setTextColor(LK5.LIZIZ(2131629120));
                ((SimpleDraweeView) LIZ(2131179671)).setImageResource(2130856649);
                TextView textView4 = (TextView) LIZ(2131165636);
                Intrinsics.checkNotNullExpressionValue(textView4, "");
                textView4.setVisibility(0);
                HSImageView hSImageView = (HSImageView) LIZ(2131179671);
                Intrinsics.checkNotNullExpressionValue(hSImageView, "");
                hSImageView.setVisibility(0);
                ConstraintLayout constraintLayout = (ConstraintLayout) LIZ(2131188369);
                Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
                constraintLayout.setVisibility(0);
                ConstraintLayout constraintLayout2 = (ConstraintLayout) LIZ(2131188369);
                Intrinsics.checkNotNullExpressionValue(constraintLayout2, "");
                C3Q0.LIZIZ(constraintLayout2, LK1.LIZLLL(32));
                HashMap hashMap = new HashMap();
                hashMap.put("action_type", "show");
                hashMap.put("content", String.valueOf((int) topTip.LIZJ));
                C4574547f.LIZ().LIZ("livesdk_pk_invite_yellow_bar", hashMap, Room.class);
            } else if (((int) topTip.LIZJ) == TopTip.TopTipType.TopTipTeamTask.ordinal()) {
                C87308Kak<Boolean> c87308Kak = AbstractC80293Hkt.LLJJIII;
                Intrinsics.checkNotNullExpressionValue(c87308Kak, "");
                if (!c87308Kak.LIZ().booleanValue()) {
                    ((TextView) LIZ(2131165636)).setTextColor(LK5.LIZIZ(2131629119));
                    ((SimpleDraweeView) LIZ(2131179671)).setImageResource(2130856648);
                    TextView textView5 = (TextView) LIZ(2131165636);
                    Intrinsics.checkNotNullExpressionValue(textView5, "");
                    textView5.setVisibility(0);
                    HSImageView hSImageView2 = (HSImageView) LIZ(2131179671);
                    Intrinsics.checkNotNullExpressionValue(hSImageView2, "");
                    hSImageView2.setVisibility(0);
                    ConstraintLayout constraintLayout3 = (ConstraintLayout) LIZ(2131188369);
                    Intrinsics.checkNotNullExpressionValue(constraintLayout3, "");
                    constraintLayout3.setVisibility(0);
                    ConstraintLayout constraintLayout4 = (ConstraintLayout) LIZ(2131188369);
                    Intrinsics.checkNotNullExpressionValue(constraintLayout4, "");
                    C3Q0.LIZIZ(constraintLayout4, LK1.LIZLLL(32));
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put("action_type", "show");
                    hashMap2.put("content", String.valueOf((int) topTip.LIZJ));
                    C4574547f.LIZ().LIZ("livesdk_pk_invite_yellow_bar", hashMap2, Room.class);
                }
            }
            ((HSImageView) LIZ(2131179671)).setOnClickListener(new View$OnClickListenerC147466fJU(this, topTip));
        }
        ConstraintLayout constraintLayout5 = (ConstraintLayout) LIZ(2131188369);
        Intrinsics.checkNotNullExpressionValue(constraintLayout5, "");
        constraintLayout5.setVisibility(8);
        ((HSImageView) LIZ(2131179671)).setOnClickListener(new View$OnClickListenerC147466fJU(this, topTip));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PkTopTipView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C106862S5w.LIZ(context);
        LIZ();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PkTopTipView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C106862S5w.LIZ(context);
        LIZ();
    }
}
