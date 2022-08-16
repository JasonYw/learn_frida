package com.bytedance.android.live.liveinteract.chatroom.chatroom.interact;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.liveinteract.chatroom.chatroom.model.C4365a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.List;
import p003X.C116971W2r;
import p003X.C81918IQm;
import p003X.M0Q;

/* loaded from: classes12.dex */
public class CustomOnlineFriendsCircleContainer extends RelativeLayout {
    public static ChangeQuickRedirect LIZ;
    public int LIZIZ;
    public int LIZJ;
    public int LIZLLL;

    /* renamed from: LJ */
    public int f26267LJ;

    static {
        Covode.recordClassIndex(25618);
    }

    public CustomOnlineFriendsCircleContainer(Context context) {
        this(context, null);
    }

    public final boolean LIZ(List<C4365a> list) {
        MethodCollector.m14708i(1728);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{list}, this, LIZ, false, 2);
        if (proxy.isSupported) {
            boolean booleanValue = ((Boolean) proxy.result).booleanValue();
            MethodCollector.m14707o(1728);
            return booleanValue;
        }
        removeAllViews();
        int size = list.size();
        if (size >= 3) {
            size = 3;
        }
        boolean z = false;
        for (int i = 0; i < size; i++) {
            C4365a c4365a = list.get(i);
            RelativeLayout relativeLayout = new RelativeLayout(getContext());
            int i2 = this.LIZJ;
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i2, i2);
            layoutParams.leftMargin = (this.LIZLLL * i) + 0;
            addView(relativeLayout, layoutParams);
            HSImageView hSImageView = new HSImageView(getContext());
            int i3 = this.LIZJ;
            relativeLayout.addView(hSImageView, new RelativeLayout.LayoutParams(i3, i3));
            M0Q.LIZ(hSImageView, c4365a.LIZ.getAvatarThumb(), 2130856979, C116971W2r.LIZ(getContext(), 2131626090), C81918IQm.LIZ(getContext(), 1.0f), null);
            if (c4365a.LIZIZ) {
                HSImageView hSImageView2 = new HSImageView(getContext());
                int i4 = this.LIZIZ;
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(i4, i4);
                layoutParams2.addRule(12);
                layoutParams2.addRule(11);
                layoutParams2.rightMargin = this.f26267LJ;
                hSImageView2.setImageResource(2130854998);
                relativeLayout.addView(hSImageView2, layoutParams2);
                z = true;
            }
        }
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            getChildAt(childCount).bringToFront();
        }
        MethodCollector.m14707o(1728);
        return z;
    }

    public CustomOnlineFriendsCircleContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CustomOnlineFriendsCircleContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        MethodCollector.m14708i(1727);
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
            this.LIZJ = (int) C81918IQm.LIZ(getContext(), 18.0f);
            this.LIZIZ = (int) C81918IQm.LIZ(getContext(), 4.0f);
            this.LIZLLL = (int) C81918IQm.LIZ(getContext(), 12.0f);
            this.f26267LJ = (int) C81918IQm.LIZ(getContext(), 3.0f);
        }
        MethodCollector.m14707o(1727);
    }
}
