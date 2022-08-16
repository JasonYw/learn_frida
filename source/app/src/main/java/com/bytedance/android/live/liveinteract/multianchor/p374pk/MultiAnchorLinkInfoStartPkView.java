package com.bytedance.android.live.liveinteract.multianchor.p374pk;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.android.live.liveinteract.multianchor.model.AnchorLinkUser;
import com.bytedance.android.live.liveinteract.multianchor.p374pk.MultiAnchorLinkInfoStartPkView;
import com.bytedance.android.live.liveinteract.multianchor.p376ui.MultiAnchorLinkInfoTopSubView;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.DataCenter;
import java.util.Collections;
import java.util.List;
import p003X.AbstractC79761HcJ;
import p003X.C116971W2r;

/* renamed from: com.bytedance.android.live.liveinteract.multianchor.pk.MultiAnchorLinkInfoStartPkView */
/* loaded from: classes3.dex */
public class MultiAnchorLinkInfoStartPkView extends FrameLayout {
    public static ChangeQuickRedirect LIZ;
    public MultiAnchorLinkInfoTopSubView LIZIZ;
    public MultiAnchorLinkInfoTopSubView LIZJ;
    public MultiAnchorLinkInfoTopSubView LIZLLL;

    /* renamed from: LJ */
    public MultiAnchorLinkInfoTopSubView f26355LJ;
    public AbstractC79761HcJ LJFF;
    public DataCenter LJI;

    static {
        Covode.recordClassIndex(28161);
    }

    public int getShowingCount() {
        if (this.LIZIZ.LJFF) {
            return 0;
        }
        if (this.LIZJ.LJFF) {
            return 1;
        }
        if (this.LIZLLL.LJFF) {
            return 2;
        }
        if (this.f26355LJ.LJFF) {
            return 3;
        }
        return 4;
    }

    private void LIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
            return;
        }
        View LIZ2 = C116971W2r.LIZ(LayoutInflater.from(getContext()), 2131700456, (ViewGroup) this, true);
        this.LIZIZ = (MultiAnchorLinkInfoTopSubView) LIZ2.findViewById(2131183453);
        this.LIZJ = (MultiAnchorLinkInfoTopSubView) LIZ2.findViewById(2131183454);
        this.LIZLLL = (MultiAnchorLinkInfoTopSubView) LIZ2.findViewById(2131183455);
        this.f26355LJ = (MultiAnchorLinkInfoTopSubView) LIZ2.findViewById(2131183456);
        this.LIZIZ.setStartPk(true);
        this.LIZJ.setStartPk(true);
        this.LIZLLL.setStartPk(true);
        this.f26355LJ.setStartPk(true);
        this.LIZIZ.setOnClickListener(new View.OnClickListener(this) { // from class: X.HcF
            public static ChangeQuickRedirect LIZ;
            public final MultiAnchorLinkInfoStartPkView LIZIZ;

            static {
                Covode.recordClassIndex(28175);
            }

            {
                this.LIZIZ = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, LIZ, false, 1).isSupported) {
                    return;
                }
                MultiAnchorLinkInfoStartPkView multiAnchorLinkInfoStartPkView = this.LIZIZ;
                if (PatchProxy.proxy(new Object[]{view}, multiAnchorLinkInfoStartPkView, MultiAnchorLinkInfoStartPkView.LIZ, false, 6).isSupported || multiAnchorLinkInfoStartPkView.LJFF == null) {
                    return;
                }
                multiAnchorLinkInfoStartPkView.LJFF.LIZ(multiAnchorLinkInfoStartPkView.LIZIZ);
            }
        });
        this.LIZJ.setOnClickListener(new View.OnClickListener(this) { // from class: X.HcG
            public static ChangeQuickRedirect LIZ;
            public final MultiAnchorLinkInfoStartPkView LIZIZ;

            static {
                Covode.recordClassIndex(28179);
            }

            {
                this.LIZIZ = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, LIZ, false, 1).isSupported) {
                    return;
                }
                MultiAnchorLinkInfoStartPkView multiAnchorLinkInfoStartPkView = this.LIZIZ;
                if (PatchProxy.proxy(new Object[]{view}, multiAnchorLinkInfoStartPkView, MultiAnchorLinkInfoStartPkView.LIZ, false, 5).isSupported || multiAnchorLinkInfoStartPkView.LJFF == null) {
                    return;
                }
                multiAnchorLinkInfoStartPkView.LJFF.LIZ(multiAnchorLinkInfoStartPkView.LIZJ);
            }
        });
        this.LIZLLL.setOnClickListener(new View.OnClickListener(this) { // from class: X.HcH
            public static ChangeQuickRedirect LIZ;
            public final MultiAnchorLinkInfoStartPkView LIZIZ;

            static {
                Covode.recordClassIndex(28181);
            }

            {
                this.LIZIZ = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, LIZ, false, 1).isSupported) {
                    return;
                }
                MultiAnchorLinkInfoStartPkView multiAnchorLinkInfoStartPkView = this.LIZIZ;
                if (PatchProxy.proxy(new Object[]{view}, multiAnchorLinkInfoStartPkView, MultiAnchorLinkInfoStartPkView.LIZ, false, 4).isSupported || multiAnchorLinkInfoStartPkView.LJFF == null) {
                    return;
                }
                multiAnchorLinkInfoStartPkView.LJFF.LIZ(multiAnchorLinkInfoStartPkView.LIZLLL);
            }
        });
        this.f26355LJ.setOnClickListener(new View.OnClickListener(this) { // from class: X.HcI
            public static ChangeQuickRedirect LIZ;
            public final MultiAnchorLinkInfoStartPkView LIZIZ;

            static {
                Covode.recordClassIndex(28182);
            }

            {
                this.LIZIZ = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, LIZ, false, 1).isSupported) {
                    return;
                }
                MultiAnchorLinkInfoStartPkView multiAnchorLinkInfoStartPkView = this.LIZIZ;
                if (PatchProxy.proxy(new Object[]{view}, multiAnchorLinkInfoStartPkView, MultiAnchorLinkInfoStartPkView.LIZ, false, 3).isSupported || multiAnchorLinkInfoStartPkView.LJFF == null) {
                    return;
                }
                multiAnchorLinkInfoStartPkView.LJFF.LIZ(multiAnchorLinkInfoStartPkView.f26355LJ);
            }
        });
    }

    public void setTopSubViewClickListener(AbstractC79761HcJ abstractC79761HcJ) {
        this.LJFF = abstractC79761HcJ;
    }

    public MultiAnchorLinkInfoStartPkView(Context context) {
        super(context);
        MethodCollector.m14708i(1920);
        LIZ();
        MethodCollector.m14707o(1920);
    }

    public MultiAnchorLinkInfoStartPkView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.m14708i(1921);
        LIZ();
        MethodCollector.m14707o(1921);
    }

    public final void LIZ(List<AnchorLinkUser> list, DataCenter dataCenter) {
        if (PatchProxy.proxy(new Object[]{list, dataCenter}, this, LIZ, false, 2).isSupported) {
            return;
        }
        Room room = (Room) dataCenter.get("data_room", (String) new Room());
        int i = 0;
        while (true) {
            if (i < list.size()) {
                AnchorLinkUser anchorLinkUser = list.get(i);
                if (anchorLinkUser.LIZ() != null && anchorLinkUser.LIZ().getId() == room.ownerUserId) {
                    break;
                }
                i++;
            } else {
                i = 0;
                break;
            }
        }
        if (list.size() > 0) {
            Collections.swap(list, 0, i);
        }
        this.LJI = dataCenter;
        if (list.size() == 0) {
            this.LIZIZ.LIZ();
            this.LIZJ.LIZ();
            this.LIZLLL.LIZ();
            this.f26355LJ.LIZ();
        } else if (list.size() == 1) {
            this.LIZIZ.LIZ(list.get(0), true, this.LJI);
            this.LIZJ.LIZ();
            this.LIZLLL.LIZ();
            this.f26355LJ.LIZ();
        } else if (list.size() == 2) {
            this.LIZIZ.LIZ(list.get(0), true, this.LJI);
            this.LIZJ.LIZ(list.get(1), false, this.LJI);
            this.LIZLLL.LIZ();
            this.f26355LJ.LIZ();
        } else if (list.size() == 3) {
            this.LIZIZ.LIZ(list.get(0), true, this.LJI);
            this.LIZJ.LIZ(list.get(1), false, this.LJI);
            this.LIZLLL.LIZ(list.get(2), false, this.LJI);
            this.f26355LJ.LIZ();
        } else if (list.size() >= 4) {
            this.LIZIZ.LIZ(list.get(0), true, this.LJI);
            this.LIZJ.LIZ(list.get(1), false, this.LJI);
            this.LIZLLL.LIZ(list.get(2), false, this.LJI);
            this.f26355LJ.LIZ(list.get(3), false, this.LJI);
        }
    }

    public MultiAnchorLinkInfoStartPkView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        MethodCollector.m14708i(1922);
        LIZ();
        MethodCollector.m14707o(1922);
    }
}
