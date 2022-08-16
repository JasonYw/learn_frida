package com.bytedance.android.live.liveinteract.multianchor.p376ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.multianchor.model.AnchorLinkUser;
import com.bytedance.android.live.liveinteract.multianchor.p376ui.MultiAnchorLinkInfoTopSubView;
import com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4782v;
import com.bytedance.android.live.room.IRoomService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdk.widget.VHeadView;
import com.bytedance.android.livesdkapi.depend.live.ILiveRoomService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.DataCenter;
import java.util.Iterator;
import p003X.C116971W2r;
import p003X.M0Q;

/* renamed from: com.bytedance.android.live.liveinteract.multianchor.ui.MultiAnchorLinkInfoTopSubView */
/* loaded from: classes3.dex */
public class MultiAnchorLinkInfoTopSubView extends FrameLayout {
    public static ChangeQuickRedirect LIZ;
    public AbstractC4782v LIZIZ = AbstractC4782v.LJIIL.LIZ();
    public Room LIZJ = ((ILiveRoomService) ServiceManager.getService(IRoomService.class)).getCurrentRoom();
    public DataCenter LIZLLL;

    /* renamed from: LJ */
    public boolean f26366LJ;
    public boolean LJFF;
    public VHeadView LJI;
    public VHeadView LJII;
    public TextView LJIIIIZZ;
    public ImageView LJIIIZ;
    public VHeadView LJIIJ;
    public TextView LJIIJJI;
    public TextView LJIIL;

    static {
        Covode.recordClassIndex(28350);
    }

    private void LIZIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
            return;
        }
        View LIZ2 = C116971W2r.LIZ(LayoutInflater.from(getContext()), 2131700459, (ViewGroup) this, true);
        this.LJI = (VHeadView) LIZ2.findViewById(2131167988);
        this.LJII = (VHeadView) LIZ2.findViewById(2131165351);
        this.LJIIIIZZ = (TextView) LIZ2.findViewById(2131195419);
        this.LJIIIZ = (ImageView) LIZ2.findViewById(2131179176);
        this.LJIIJ = (VHeadView) LIZ2.findViewById(2131179019);
        this.LJIIJJI = (TextView) LIZ2.findViewById(2131194722);
        this.LJIIL = (TextView) LIZ2.findViewById(2131195556);
    }

    public final void LIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 3).isSupported) {
            return;
        }
        this.LJFF = true;
        this.LJI.setVisibility(8);
        if (this.f26366LJ) {
            VHeadView vHeadView = this.LJII;
            M0Q.LIZ(vHeadView, 2130857534, vHeadView.getWidth(), this.LJII.getHeight());
        } else {
            VHeadView vHeadView2 = this.LJII;
            M0Q.LIZ(vHeadView2, 2130856545, vHeadView2.getWidth(), this.LJII.getHeight());
        }
        this.LJIIIIZZ.setVisibility(8);
        this.LJIIIZ.setVisibility(8);
        this.LJIIJ.setVisibility(8);
        this.LJIIJJI.setVisibility(8);
        this.LJIIL.setVisibility(0);
    }

    public MultiAnchorLinkInfoTopSubView(Context context) {
        super(context);
        MethodCollector.m14708i(1939);
        LIZIZ();
        MethodCollector.m14707o(1939);
    }

    public void setStartPk(boolean z) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 2).isSupported) {
            return;
        }
        this.f26366LJ = z;
        if (this.f26366LJ) {
            this.LJIIL.setText(2131582013);
        } else {
            this.LJIIL.setText(2131582022);
        }
    }

    private boolean LIZ(AnchorLinkUser anchorLinkUser) {
        long j;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{anchorLinkUser}, this, LIZ, false, 5);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        Room room = this.LIZJ;
        if (room != null) {
            j = room.getOwnerUserId();
        } else {
            j = 0;
        }
        if (j == anchorLinkUser.LIZ().getId()) {
            return true;
        }
        Iterator<User> it = this.LIZIZ.mo15709LJ().LJIIIIZZ().iterator();
        while (it.hasNext()) {
            if (it.next().getId() == anchorLinkUser.LIZ().getId()) {
                return true;
            }
        }
        return false;
    }

    public MultiAnchorLinkInfoTopSubView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.m14708i(1940);
        LIZIZ();
        MethodCollector.m14707o(1940);
    }

    public MultiAnchorLinkInfoTopSubView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        MethodCollector.m14708i(1941);
        LIZIZ();
        MethodCollector.m14707o(1941);
    }

    public final void LIZ(final AnchorLinkUser anchorLinkUser, boolean z, DataCenter dataCenter) {
        if (PatchProxy.proxy(new Object[]{anchorLinkUser, Byte.valueOf(z ? (byte) 1 : (byte) 0), dataCenter}, this, LIZ, false, 4).isSupported) {
            return;
        }
        this.LIZLLL = dataCenter;
        this.LJFF = false;
        if (!z) {
            if (anchorLinkUser.f26348LJ == 1) {
                if (LIZ(anchorLinkUser)) {
                    this.LJI.setVisibility(0);
                } else {
                    this.LJI.setVisibility(8);
                }
                this.LJIIIIZZ.setVisibility(0);
            } else {
                this.LJI.setVisibility(8);
                this.LJIIIIZZ.setVisibility(8);
            }
            if (anchorLinkUser.LJIIJ == 4) {
                this.LJIIIIZZ.setText(2131582006);
            } else {
                this.LJIIIIZZ.setText(2131582014);
            }
        }
        this.LJIIIZ.setVisibility(0);
        M0Q.LIZIZ(this.LJII, anchorLinkUser.LIZ().getAvatarThumb(), this.LJII.getWidth(), this.LJII.getHeight(), 2130856545);
        if (anchorLinkUser.LIZ().getGender() == 1) {
            this.LJIIJ.setImageResource(2130855960);
            this.LJIIJ.setVisibility(0);
        } else if (anchorLinkUser.LIZ().getGender() == 2) {
            this.LJIIJ.setImageResource(2130855958);
            this.LJIIJ.setVisibility(0);
        } else {
            this.LJIIJ.setVisibility(8);
        }
        this.LJIIJJI.setText(anchorLinkUser.LIZ().getNickName());
        this.LJIIJJI.setVisibility(0);
        this.LJIIL.setVisibility(8);
        this.LJI.setOnClickListener(new View.OnClickListener(this, anchorLinkUser) { // from class: X.HcE
            public static ChangeQuickRedirect LIZ;
            public final MultiAnchorLinkInfoTopSubView LIZIZ;
            public final AnchorLinkUser LIZJ;

            static {
                Covode.recordClassIndex(28354);
            }

            {
                this.LIZIZ = this;
                this.LIZJ = anchorLinkUser;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, LIZ, false, 1).isSupported) {
                    return;
                }
                MultiAnchorLinkInfoTopSubView multiAnchorLinkInfoTopSubView = this.LIZIZ;
                AnchorLinkUser anchorLinkUser2 = this.LIZJ;
                if (PatchProxy.proxy(new Object[]{anchorLinkUser2, view}, multiAnchorLinkInfoTopSubView, MultiAnchorLinkInfoTopSubView.LIZ, false, 6).isSupported) {
                    return;
                }
                User LIZ2 = anchorLinkUser2.LIZ();
                if (multiAnchorLinkInfoTopSubView.LIZIZ == null || multiAnchorLinkInfoTopSubView.LIZJ == null) {
                    return;
                }
                if (anchorLinkUser2.LJIIJ == 4) {
                    C116971W2r.LIZJ(new HYT(2, multiAnchorLinkInfoTopSubView.LIZLLL, multiAnchorLinkInfoTopSubView.getContext(), null));
                } else {
                    C116971W2r.LIZJ(new HYT(1, multiAnchorLinkInfoTopSubView.LIZLLL, multiAnchorLinkInfoTopSubView.getContext(), LIZ2));
                }
            }
        });
    }
}
