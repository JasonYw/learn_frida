package com.android.ttcjpaysdk.thirdparty.counter.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.android.ttcjpaysdk.base.theme.widget.CJPayCustomButton;
import com.android.ttcjpaysdk.base.utils.CJPayBasicUtils;
import com.android.ttcjpaysdk.thirdparty.counter.data.FastPayGuideInfo;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.p1594ss.ttm.player.MediaPlayer;
import p003X.C116971W2r;

/* loaded from: classes17.dex */
public class FastPayGuideView extends LinearLayout {
    public static ChangeQuickRedirect LIZ;
    public TextView LIZIZ;
    public TextView LIZJ;
    public TextView LIZLLL;

    /* renamed from: LJ */
    public TextView f25521LJ;
    public TextView LJFF;
    public TextView LJI;
    public CJPayCustomButton LJII;
    public ProgressBar LJIIIIZZ;
    public TextView LJIIIZ;
    public FastPayGuideInfo LJIIJ;
    public int LJIIJJI;
    public View.OnClickListener LJIIL;
    public View.OnClickListener LJIILIIL;
    public View.OnClickListener LJIILJJIL;
    public Context LJIILL;
    public View LJIILLIIL;

    static {
        Covode.recordClassIndex(8317);
    }

    public void setClickListener(View.OnClickListener onClickListener) {
        this.LJIIL = onClickListener;
    }

    public void setMoreClickListener(View.OnClickListener onClickListener) {
        this.LJIILIIL = onClickListener;
    }

    public void setProtocolLinkClickListener(View.OnClickListener onClickListener) {
        this.LJIILJJIL = onClickListener;
    }

    public FastPayGuideView(Context context) {
        this(context, null);
    }

    public FastPayGuideView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FastPayGuideView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        MethodCollector.m14708i(MediaPlayer.MEDIA_PLAYER_OPTION_ENABLE_EXPIRED_LICENSE);
        this.LJIILL = context;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
            this.LJIILLIIL = C116971W2r.LIZ(LayoutInflater.from(this.LJIILL), 2131690732, (ViewGroup) this, false);
            this.LIZIZ = (TextView) this.LJIILLIIL.findViewById(2131174620);
            this.LIZJ = (TextView) this.LJIILLIIL.findViewById(2131174619);
            this.LIZLLL = (TextView) this.LJIILLIIL.findViewById(2131174613);
            this.f25521LJ = (TextView) this.LJIILLIIL.findViewById(2131174612);
            this.LJFF = (TextView) this.LJIILLIIL.findViewById(2131174615);
            this.LJI = (TextView) this.LJIILLIIL.findViewById(2131174614);
            this.LJII = (CJPayCustomButton) this.LJIILLIIL.findViewById(2131174617);
            this.LJIIIIZZ = (ProgressBar) this.LJIILLIIL.findViewById(2131174618);
            this.LJIIIZ = (TextView) this.LJIILLIIL.findViewById(2131174611);
            this.LJIIJJI = CJPayBasicUtils.dipToPX(this.LJIILL, 470.0f);
            this.LJIILLIIL.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            addView(this.LJIILLIIL);
        }
        MethodCollector.m14707o(MediaPlayer.MEDIA_PLAYER_OPTION_ENABLE_EXPIRED_LICENSE);
    }
}
