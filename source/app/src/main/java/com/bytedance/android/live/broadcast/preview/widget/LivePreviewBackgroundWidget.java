package com.bytedance.android.live.broadcast.preview.widget;

import android.text.TextUtils;
import android.view.View;
import androidx.core.view.MotionEventCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.user.IUser;
import com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.user.IUserService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC4569445g;
import p003X.C3VF;
import p003X.KA1;
import p003X.M0O;
import p003X.M0W;

/* loaded from: classes12.dex */
public final class LivePreviewBackgroundWidget extends LiveRecyclableWidget implements KA1, AbstractC4569445g {
    public static ChangeQuickRedirect LIZ;

    static {
        Covode.recordClassIndex(17513);
    }

    @Override // com.bytedance.ies.sdk.widgets.Widget
    public final int getLayoutId() {
        return 2131700798;
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget
    public final void onInit(Object[] objArr) {
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget
    public final void onLoad(Object[] objArr) {
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 2).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget
    public final void onUnload() {
    }

    @Override // p003X.KA1
    public final void LIZ(boolean z, String str, int i) {
        C3VF user;
        IUser LIZ2;
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0), str, 2130854253}, this, LIZ, false, 1).isSupported || this.context == null) {
            return;
        }
        View view = this.contentView;
        if (!(view instanceof HSImageView)) {
            view = null;
        }
        HSImageView hSImageView = (HSImageView) view;
        if (hSImageView == null) {
            return;
        }
        if (z) {
            hSImageView.setImageAlpha(MotionEventCompat.ACTION_MASK);
            hSImageView.setVisibility(0);
            float screenWidth = UIUtils.getScreenWidth(this.context) / UIUtils.getScreenHeight(this.context);
            if (!TextUtils.isEmpty(str)) {
                hSImageView.getHierarchy().setPlaceholderImage(2130854253);
                M0O.LIZ(hSImageView, str);
                return;
            }
            IUserService iUserService = (IUserService) ServiceManager.getService(IUserService.class);
            if (iUserService != null && (user = iUserService.user()) != null && (LIZ2 = user.LIZ()) != null && LIZ2.getAvatarMedium() != null) {
                IUser LIZ3 = user.LIZ();
                Intrinsics.checkNotNullExpressionValue(LIZ3, "");
                M0O.LIZ(hSImageView, LIZ3.getAvatarMedium(), new M0W(5, screenWidth, null));
                return;
            }
            hSImageView.setVisibility(0);
            hSImageView.setImageAlpha(0);
            return;
        }
        hSImageView.setVisibility(0);
        hSImageView.setImageAlpha(0);
    }
}
