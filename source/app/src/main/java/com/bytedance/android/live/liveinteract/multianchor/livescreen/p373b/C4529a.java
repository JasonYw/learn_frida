package com.bytedance.android.live.liveinteract.multianchor.livescreen.p373b;

import android.content.Context;
import android.view.View;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.multianchor.model.AnchorLinkUser;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.DataCenter;
import p003X.C106862S5w;
import p003X.HRR;
import p003X.View$OnClickListenerC79358HQa;

/* renamed from: com.bytedance.android.live.liveinteract.multianchor.livescreen.b.a */
/* loaded from: classes3.dex */
public final class C4529a {
    public static ChangeQuickRedirect LIZ;
    public AnchorLinkUser LIZIZ;
    public String LIZJ;
    public final DataCenter LIZLLL;

    /* renamed from: LJ */
    public final HRR f26345LJ;

    static {
        Covode.recordClassIndex(28095);
    }

    public final View LIZ() {
        return this.f26345LJ;
    }

    public final void LIZ(int i) {
        User LIZ2;
        int i2 = 1;
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 2).isSupported) {
            return;
        }
        if (i >= 0 && i != 0) {
            AnchorLinkUser anchorLinkUser = this.LIZIZ;
            if (anchorLinkUser != null && (LIZ2 = anchorLinkUser.LIZ()) != null) {
                int gender = LIZ2.getGender();
                if (gender != 1) {
                    if (gender != 2) {
                        i2 = 0;
                    } else {
                        i2 = 2;
                    }
                }
                this.f26345LJ.LIZ(i2, i);
                return;
            }
            return;
        }
        this.f26345LJ.LIZ();
    }

    public final void LIZ(AnchorLinkUser anchorLinkUser) {
        ImageModel imageModel;
        User LIZ2;
        User LIZ3;
        if (PatchProxy.proxy(new Object[]{anchorLinkUser}, this, LIZ, false, 1).isSupported) {
            return;
        }
        this.LIZIZ = anchorLinkUser;
        HRR hrr = this.f26345LJ;
        String str = null;
        if (anchorLinkUser != null && (LIZ3 = anchorLinkUser.LIZ()) != null) {
            imageModel = LIZ3.getAvatarThumb();
        } else {
            imageModel = null;
        }
        hrr.setAvatarThumb(imageModel);
        HRR hrr2 = this.f26345LJ;
        if (anchorLinkUser != null && (LIZ2 = anchorLinkUser.LIZ()) != null) {
            str = LIZ2.getNickName();
        }
        hrr2.setNickName(str);
    }

    public C4529a(Context context, DataCenter dataCenter) {
        C106862S5w.LIZ(context, dataCenter);
        this.LIZLLL = dataCenter;
        this.f26345LJ = new HRR(context);
        this.f26345LJ.setOnClickListener(new View$OnClickListenerC79358HQa(this));
    }
}
