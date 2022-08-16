package com.bytedance.android.live.liveinteract.interact.audience.p362ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.IUser;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.liveinteract.multianchor.model.AnchorLinkUser;
import com.bytedance.common.utility.Lists;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.ArrayList;
import java.util.List;
import p003X.M0Q;

/* renamed from: com.bytedance.android.live.liveinteract.interact.audience.ui.AudienceInteractWaitingView */
/* loaded from: classes12.dex */
public class AudienceInteractWaitingView extends FrameLayout {
    public static ChangeQuickRedirect LIZ;

    static {
        Covode.recordClassIndex(27413);
    }

    private void LIZ() {
        MethodCollector.m14708i(1880);
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
            MethodCollector.m14707o(1880);
            return;
        }
        LayoutInflater.from(getContext()).inflate(2131700312, this);
        MethodCollector.m14707o(1880);
    }

    public AudienceInteractWaitingView(Context context) {
        super(context);
        MethodCollector.m14708i(1877);
        LIZ();
        MethodCollector.m14707o(1877);
    }

    public AudienceInteractWaitingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.m14708i(1878);
        LIZ();
        MethodCollector.m14707o(1878);
    }

    public final void LIZ(List<AnchorLinkUser> list, IUser iUser) {
        if (PatchProxy.proxy(new Object[]{list, iUser}, this, LIZ, false, 2).isSupported) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        ImageModel avatarThumb = iUser.getAvatarThumb();
        if (list != null) {
            for (AnchorLinkUser anchorLinkUser : list) {
                if (anchorLinkUser.LIZ() != null && anchorLinkUser.LIZ().getId() != iUser.getId()) {
                    arrayList.add(anchorLinkUser);
                } else if (anchorLinkUser.LIZ() != null && anchorLinkUser.LIZ().getId() == iUser.getId() && anchorLinkUser.LIZ().isAnonymous) {
                    avatarThumb = anchorLinkUser.LIZ().getAvatarThumb();
                }
            }
        }
        if (Lists.isEmpty(arrayList)) {
            HSImageView hSImageView = (HSImageView) findViewById(2131184463);
            hSImageView.setVisibility(0);
            M0Q.LIZIZ((ImageView) hSImageView, avatarThumb);
        } else if (arrayList.size() == 1) {
            findViewById(2131195752).setVisibility(0);
            M0Q.LIZIZ((ImageView) findViewById(2131195754), avatarThumb);
            M0Q.LIZIZ((ImageView) findViewById(2131195755), ((AnchorLinkUser) arrayList.get(0)).LIZ().getAvatarThumb());
        } else {
            findViewById(2131192117).setVisibility(0);
            M0Q.LIZIZ((ImageView) findViewById(2131192122), avatarThumb);
            M0Q.LIZIZ((ImageView) findViewById(2131192123), ((AnchorLinkUser) arrayList.get(0)).LIZ().getAvatarThumb());
        }
    }

    public AudienceInteractWaitingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        MethodCollector.m14708i(1879);
        LIZ();
        MethodCollector.m14707o(1879);
    }
}
