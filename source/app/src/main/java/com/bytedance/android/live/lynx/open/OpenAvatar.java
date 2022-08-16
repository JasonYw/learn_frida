package com.bytedance.android.live.lynx.open;

import com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.lynx.tasm.behavior.LynxContext;
import com.lynx.tasm.p1544ui.image.FrescoImageView;
import com.lynx.tasm.p1544ui.image.UIImage;
import p003X.C106862S5w;

/* loaded from: classes10.dex */
public final class OpenAvatar extends UIImage<FrescoImageView> {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(32248);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OpenAvatar(LynxContext lynxContext) {
        super(lynxContext);
        C106862S5w.LIZ(lynxContext);
    }

    @Override // com.lynx.tasm.p1544ui.image.UIImage, com.lynx.tasm.behavior.p1543ui.image.AbsUIImage
    public final void setSource(String str) {
        String str2;
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 1).isSupported || str == null) {
            return;
        }
        IInteractGameService iInteractGameService = (IInteractGameService) ServiceManager.getService(IInteractGameService.class);
        if (iInteractGameService != null) {
            str2 = iInteractGameService.decryptUserInfo(str);
        } else {
            str2 = null;
        }
        if (str2 == null || str2.length() == 0) {
            str2 = "res:///2130841780";
        }
        super.setSource(str2);
    }
}
