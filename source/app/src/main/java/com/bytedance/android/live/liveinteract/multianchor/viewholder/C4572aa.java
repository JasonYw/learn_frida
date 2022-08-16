package com.bytedance.android.live.liveinteract.multianchor.viewholder;

import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.style.MetricAffectingSpan;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.liveinteract.multianchor.match.AbstractC4530a;
import com.bytedance.android.live.liveinteract.multianchor.match.AbstractC4531c;
import com.bytedance.android.live.liveinteract.multianchor.match.C4533e;
import com.bytedance.android.livesdk.chatroom.interact.model.C6053g;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.internal.Intrinsics;
import p003X.C106862S5w;
import p003X.C2WC;
import p003X.C79688Hb8;
import p003X.C79730Hbo;
import p003X.C81294I2m;
import p003X.LK5;

/* renamed from: com.bytedance.android.live.liveinteract.multianchor.viewholder.aa */
/* loaded from: classes3.dex */
public final class C4572aa extends RecyclerView.ViewHolder {
    public static ChangeQuickRedirect LIZ;
    public final TextView LIZIZ;
    public final TextView LIZJ;
    public final TextView LIZLLL;

    /* renamed from: LJ */
    public final TextView f26370LJ;
    public final TextView LJFF;
    public final Drawable LJI = LK5.LIZJ(2130856554);

    static {
        Covode.recordClassIndex(28430);
    }

    private final boolean LJFF() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 4);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        AbstractC4531c m15723LJ = m15723LJ();
        if (m15723LJ == null) {
            return false;
        }
        return m15723LJ.LIZJ;
    }

    private final MetricAffectingSpan LJIIIIZZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 17);
        if (proxy.isSupported) {
            return (MetricAffectingSpan) proxy.result;
        }
        return new C79688Hb8(this);
    }

    private final MetricAffectingSpan LJIIIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 18);
        if (proxy.isSupported) {
            return (MetricAffectingSpan) proxy.result;
        }
        return new C79730Hbo();
    }

    public final AbstractC4530a LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        if (proxy.isSupported) {
            return (AbstractC4530a) proxy.result;
        }
        return AbstractC4530a.LIZ.LIZ();
    }

    public final C4533e LIZIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 2);
        if (proxy.isSupported) {
            return (C4533e) proxy.result;
        }
        return C4533e.LIZJ.LIZ();
    }

    public final boolean LIZJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        AbstractC4531c m15723LJ = m15723LJ();
        if (m15723LJ == null) {
            return false;
        }
        return m15723LJ.LIZIZ;
    }

    /* renamed from: LJ */
    private final AbstractC4531c m15723LJ() {
        C2WC<AbstractC4531c> LIZIZ;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 3);
        if (proxy.isSupported) {
            return (AbstractC4531c) proxy.result;
        }
        C4533e LIZIZ2 = LIZIZ();
        if (LIZIZ2 != null && (LIZIZ = LIZIZ2.LIZIZ()) != null) {
            return LIZIZ.LIZ();
        }
        return null;
    }

    private final boolean LJI() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 6);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        AbstractC4531c m15723LJ = m15723LJ();
        if (m15723LJ == null || !m15723LJ.LIZJ()) {
            return false;
        }
        return true;
    }

    private final void LJII() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 15).isSupported) {
            return;
        }
        this.f26370LJ.setVisibility(8);
        this.LJFF.setText(LK5.LIZ(2131586421));
    }

    public final void LIZLLL() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 13).isSupported) {
            return;
        }
        this.LIZIZ.setText(LK5.LIZ(2131586419));
        this.LJFF.setText(LK5.LIZ(2131586412));
        this.LJFF.setCompoundDrawablesWithIntrinsicBounds(this.LJI, (Drawable) null, (Drawable) null, (Drawable) null);
        this.LIZJ.setVisibility(4);
        this.f26370LJ.setVisibility(8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4572aa(View view) {
        super(view);
        C106862S5w.LIZ(view);
        View findViewById = view.findViewById(2131182760);
        Intrinsics.checkNotNullExpressionValue(findViewById, "");
        this.LIZIZ = (TextView) findViewById;
        View findViewById2 = view.findViewById(2131182762);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "");
        this.LIZJ = (TextView) findViewById2;
        View findViewById3 = view.findViewById(2131182758);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "");
        this.LJFF = (TextView) findViewById3;
        View findViewById4 = view.findViewById(2131182740);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "");
        this.LIZLLL = (TextView) findViewById4;
        View findViewById5 = view.findViewById(2131182757);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "");
        this.f26370LJ = (TextView) findViewById5;
    }

    private final SpannableStringBuilder LIZ(long j) {
        String str;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{new Long(j)}, this, LIZ, false, 16);
        if (proxy.isSupported) {
            return (SpannableStringBuilder) proxy.result;
        }
        int length = String.valueOf(j).length();
        if (j < 60) {
            str = " " + j + " 秒";
        } else {
            int i = ((j % 60) > 0L ? 1 : ((j % 60) == 0L ? 0 : -1));
            long j2 = j / 60;
            if (i != 0) {
                j2++;
            }
            length = String.valueOf(j2).length();
            str = " " + j2 + " 分钟";
        }
        if (LK5.LIZ(220.0f) / LK5.LIZJ() > 0.65f) {
            SpannableStringBuilder append = new SpannableStringBuilder().append((CharSequence) LK5.LIZ(2131586415));
            Intrinsics.checkNotNullExpressionValue(append, "");
            return append;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) LK5.LIZ(2131586414, str));
        spannableStringBuilder.setSpan(LJIIIZ(), 0, 5, 34);
        int i2 = length + 5;
        spannableStringBuilder.setSpan(LJIIIIZZ(), 5, i2, 34);
        spannableStringBuilder.setSpan(LJIIIZ(), i2, spannableStringBuilder.length(), 34);
        return spannableStringBuilder;
    }

    public final void LIZ(C6053g c6053g) {
        if (PatchProxy.proxy(new Object[]{c6053g}, this, LIZ, false, 11).isSupported) {
            return;
        }
        C106862S5w.LIZ(c6053g);
        long j = c6053g.LIZLLL;
        this.LIZIZ.setText(LK5.LIZ(2131586417));
        this.LIZJ.setVisibility(4);
        this.LJFF.setText(LIZ(j));
        this.LJFF.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        this.LIZLLL.setText(LK5.LIZ(2131586405));
        this.LIZLLL.setSelected(false);
        this.f26370LJ.setVisibility(8);
    }

    private final void LIZ(long j, int i) {
        if (PatchProxy.proxy(new Object[]{new Long(j), Integer.valueOf(i)}, this, LIZ, false, 14).isSupported || LJFF()) {
            return;
        }
        long j2 = i;
        if (1 <= j && j2 > j) {
            LJII();
        }
        if (j <= 0) {
            this.LIZIZ.setText(LK5.LIZ(2131586419));
            this.LJFF.setText(LK5.LIZ(2131586420));
            this.LIZJ.setVisibility(4);
            this.f26370LJ.setVisibility(0);
        }
    }

    public final void LIZ(long j, C6053g c6053g) {
        if (PatchProxy.proxy(new Object[]{new Long(j), c6053g}, this, LIZ, false, 12).isSupported) {
            return;
        }
        C106862S5w.LIZ(c6053g);
        long j2 = c6053g.LIZLLL;
        int LIZ2 = c6053g.LIZ();
        if (LJFF()) {
            LIZLLL();
            long j3 = LIZ2;
            if (1 <= j && j3 > j) {
                LJII();
            }
        } else if (j2 > 60) {
            this.LIZIZ.setText(LK5.LIZ(2131586419));
            this.LJFF.setText(LK5.LIZ(2131586411));
            this.LIZJ.setVisibility(4);
            this.f26370LJ.setVisibility(0);
            LIZ(j, LIZ2);
        } else if (1 <= j2 && 59 >= j2) {
            this.LIZIZ.setText(LK5.LIZ(2131586418));
            this.LJFF.setText(LK5.LIZ(2131586411));
            this.LIZJ.setVisibility(0);
            this.LIZJ.setText(C81294I2m.LIZ(j));
            this.f26370LJ.setVisibility(0);
            this.LJFF.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            LIZ(j, LIZ2);
        } else if (j <= 0) {
            this.LIZIZ.setText(LK5.LIZ(2131586419));
            this.LJFF.setText(LK5.LIZ(2131586420));
            this.LIZJ.setVisibility(4);
            this.f26370LJ.setVisibility(0);
        }
        this.LIZLLL.setText(LK5.LIZ(2131584388));
        this.LIZLLL.setSelected(true);
        if (LJI()) {
            this.f26370LJ.setVisibility(8);
        }
    }
}
