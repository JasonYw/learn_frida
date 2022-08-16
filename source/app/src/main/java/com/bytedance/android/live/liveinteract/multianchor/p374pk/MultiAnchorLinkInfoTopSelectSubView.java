package com.bytedance.android.live.liveinteract.multianchor.p374pk;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.linkpk.LinkCrossRoomDataHolder;
import com.bytedance.android.live.liveinteract.multianchor.model.AnchorLinkUser;
import com.bytedance.android.live.liveinteract.multianchor.p374pk.MultiAnchorLinkInfoTopSelectSubView;
import com.bytedance.android.live.liveinteract.plantform.model.C4809b;
import com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4782v;
import com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4784x;
import com.bytedance.android.livesdk.widget.VHeadView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.DataCenter;
import java.util.Iterator;
import java.util.List;
import p003X.AbstractC78050Gpo;
import p003X.AbstractC79154HIe;
import p003X.C116971W2r;
import p003X.C79169HIt;
import p003X.HYR;
import p003X.M0Q;

/* renamed from: com.bytedance.android.live.liveinteract.multianchor.pk.MultiAnchorLinkInfoTopSelectSubView */
/* loaded from: classes3.dex */
public class MultiAnchorLinkInfoTopSelectSubView extends FrameLayout {
    public static ChangeQuickRedirect LIZ;
    public boolean LIZIZ;
    public AbstractC4782v LIZJ = AbstractC4782v.LJIIL.LIZ();
    public VHeadView LIZLLL;

    /* renamed from: LJ */
    public TextView f26356LJ;
    public TextView LJFF;
    public ImageView LJI;
    public VHeadView LJII;
    public TextView LJIIIIZZ;
    public RadioButton LJIIIZ;
    public VHeadView LJIIJ;
    public HYR LJIIJJI;

    static {
        Covode.recordClassIndex(28163);
    }

    private void LIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
            return;
        }
        View LIZ2 = C116971W2r.LIZ(LayoutInflater.from(getContext()), 2131700458, (ViewGroup) this, true);
        this.LIZLLL = (VHeadView) LIZ2.findViewById(2131165351);
        this.f26356LJ = (TextView) LIZ2.findViewById(2131195419);
        this.LJFF = (TextView) LIZ2.findViewById(2131166418);
        this.LJI = (ImageView) LIZ2.findViewById(2131179176);
        this.LJII = (VHeadView) LIZ2.findViewById(2131179019);
        this.LJIIIIZZ = (TextView) LIZ2.findViewById(2131194722);
        this.LJIIIZ = (RadioButton) LIZ2.findViewById(2131169408);
        this.LJIIJ = (VHeadView) LIZ2.findViewById(2131167988);
        setSelected(true);
    }

    public void setOnSelectedListener(HYR hyr) {
        this.LJIIJJI = hyr;
    }

    public MultiAnchorLinkInfoTopSelectSubView(Context context) {
        super(context);
        MethodCollector.m14708i(1923);
        LIZ();
        MethodCollector.m14707o(1923);
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        int i = 0;
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 4).isSupported || this.LIZIZ) {
            return;
        }
        super.setSelected(z);
        boolean isSelected = isSelected();
        TextView textView = this.LJFF;
        if (isSelected) {
            i = 4;
        }
        textView.setVisibility(i);
        HYR hyr = this.LJIIJJI;
        if (hyr != null) {
            hyr.LIZ(this, isSelected);
        }
    }

    private boolean LIZ(AnchorLinkUser anchorLinkUser) {
        AbstractC4782v abstractC4782v;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{anchorLinkUser}, this, LIZ, false, 3);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (AbstractC79154HIe.LIZ() != null && AbstractC79154HIe.LIZ().mo15726LJ()) {
            return false;
        }
        List<User> list = null;
        int LJJIFFI = AbstractC78050Gpo.LIZ().LJJIFFI();
        if (C79169HIt.LIZIZ(LJJIFFI, 4)) {
            AbstractC4784x LIZ2 = AbstractC4784x.LJII.LIZ();
            if (LIZ2 != null && LIZ2.LIZJ() != null) {
                list = LIZ2.LIZJ().LJIIIIZZ();
            }
        } else if (C79169HIt.LIZIZ(LJJIFFI, 64) && (abstractC4782v = this.LIZJ) != null && abstractC4782v.mo15709LJ() != null) {
            list = this.LIZJ.mo15709LJ().LJIIIIZZ();
        }
        if (anchorLinkUser.LIZ() != null && list != null) {
            Iterator<User> it = list.iterator();
            while (it.hasNext()) {
                if (it.next().getId() == anchorLinkUser.LIZ().getId()) {
                    return true;
                }
            }
        }
        return false;
    }

    public MultiAnchorLinkInfoTopSelectSubView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.m14708i(1924);
        LIZ();
        MethodCollector.m14707o(1924);
    }

    public MultiAnchorLinkInfoTopSelectSubView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        MethodCollector.m14708i(1925);
        LIZ();
        MethodCollector.m14707o(1925);
    }

    public final void LIZ(final AnchorLinkUser anchorLinkUser, DataCenter dataCenter, boolean z) {
        boolean z2;
        int i;
        if (PatchProxy.proxy(new Object[]{anchorLinkUser, dataCenter, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 2).isSupported) {
            return;
        }
        if (anchorLinkUser.f26348LJ == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.LIZIZ = z2;
        this.LJI.setVisibility(0);
        M0Q.LIZIZ(this.LIZLLL, anchorLinkUser.LIZ().getAvatarThumb(), this.LIZLLL.getWidth(), this.LIZLLL.getHeight(), 2130856545);
        if (anchorLinkUser.LIZ().getGender() == 1) {
            this.LJII.setImageResource(2130855960);
            this.LJII.setVisibility(0);
        } else if (anchorLinkUser.LIZ().getGender() == 2) {
            this.LJII.setImageResource(2130855958);
            this.LJII.setVisibility(0);
        } else {
            this.LJII.setVisibility(8);
        }
        this.LJIIIIZZ.setText(anchorLinkUser.LIZ().getNickName());
        this.LJIIIIZZ.setVisibility(0);
        if (this.LIZIZ) {
            this.f26356LJ.setVisibility(0);
            TextView textView = this.f26356LJ;
            if (anchorLinkUser.LJIIJ == 4) {
                i = 2131582006;
            } else {
                i = 2131582014;
            }
            textView.setText(i);
            this.LJFF.setVisibility(8);
            this.LJIIIZ.setVisibility(8);
        } else {
            this.f26356LJ.setVisibility(8);
            this.f26356LJ.setText("");
            this.LJIIIZ.setVisibility(0);
        }
        if (z) {
            if (this.LIZIZ && LIZ(anchorLinkUser)) {
                this.LJIIJ.setVisibility(0);
            } else {
                this.LJIIJ.setVisibility(8);
            }
        } else {
            this.LJIIJ.setVisibility(8);
        }
        this.LJIIJ.setOnClickListener(new View.OnClickListener(this, anchorLinkUser) { // from class: X.HYP
            public static ChangeQuickRedirect LIZ;
            public final MultiAnchorLinkInfoTopSelectSubView LIZIZ;
            public final AnchorLinkUser LIZJ;

            static {
                Covode.recordClassIndex(28183);
            }

            {
                this.LIZIZ = this;
                this.LIZJ = anchorLinkUser;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AbstractC4784x LIZ2;
                if (PatchProxy.proxy(new Object[]{view}, this, LIZ, false, 1).isSupported) {
                    return;
                }
                MultiAnchorLinkInfoTopSelectSubView multiAnchorLinkInfoTopSelectSubView = this.LIZIZ;
                AnchorLinkUser anchorLinkUser2 = this.LIZJ;
                if (PatchProxy.proxy(new Object[]{anchorLinkUser2, view}, multiAnchorLinkInfoTopSelectSubView, MultiAnchorLinkInfoTopSelectSubView.LIZ, false, 6).isSupported) {
                    return;
                }
                User LIZ3 = anchorLinkUser2.LIZ();
                int LJJIFFI = AbstractC78050Gpo.LIZ().LJJIFFI();
                if (C79169HIt.LIZIZ(LJJIFFI, 64)) {
                    if (multiAnchorLinkInfoTopSelectSubView.LIZJ == null) {
                        return;
                    }
                    multiAnchorLinkInfoTopSelectSubView.LIZJ.LIZJ().LIZ(LinkCrossRoomDataHolder.LJII().LIZLLL, LIZ3.getLiveRoomId(), LIZ3.getId(), LIZ3.getSecUid(), 0, "ceiling_view_canel_individual", new C4809b("ceiling_view_canel_individual"));
                } else if (!C79169HIt.LIZIZ(LJJIFFI, 4) || (LIZ2 = AbstractC4784x.LJII.LIZ()) == null) {
                } else {
                    LIZ2.LIZIZ().LIZ(LinkCrossRoomDataHolder.LJII().LIZLLL, LIZ3.getLiveRoomId(), LIZ3.getId(), LIZ3.getSecUid(), 0, "ceiling_view_canel_individual", new C4809b("ceiling_view_canel_individual"));
                }
            }
        });
        setOnClickListener(new View.OnClickListener(this) { // from class: X.HYQ
            public static ChangeQuickRedirect LIZ;
            public final MultiAnchorLinkInfoTopSelectSubView LIZIZ;

            static {
                Covode.recordClassIndex(28184);
            }

            {
                this.LIZIZ = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, LIZ, false, 1).isSupported) {
                    return;
                }
                MultiAnchorLinkInfoTopSelectSubView multiAnchorLinkInfoTopSelectSubView = this.LIZIZ;
                if (PatchProxy.proxy(new Object[]{view}, multiAnchorLinkInfoTopSelectSubView, MultiAnchorLinkInfoTopSelectSubView.LIZ, false, 5).isSupported) {
                    return;
                }
                multiAnchorLinkInfoTopSelectSubView.setSelected(!multiAnchorLinkInfoTopSelectSubView.isSelected());
            }
        });
    }
}
