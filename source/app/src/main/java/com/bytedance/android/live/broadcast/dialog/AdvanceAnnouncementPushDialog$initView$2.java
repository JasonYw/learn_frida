package com.bytedance.android.live.broadcast.dialog;

import android.view.View;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdkapi.announcement.IAnnouncementService;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p003X.C82070IWi;
import p003X.C82072IWk;
import p003X.IWH;
import p003X.IWK;

/* loaded from: classes3.dex */
public final /* synthetic */ class AdvanceAnnouncementPushDialog$initView$2 extends FunctionReferenceImpl implements Function1<View, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(15383);
    }

    public AdvanceAnnouncementPushDialog$initView$2(IWH iwh) {
        super(1, iwh, IWH.class, "onEditClicked", "onEditClicked(Landroid/view/View;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(View view) {
        if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 1).isSupported) {
            IWH iwh = (IWH) this.receiver;
            if (!PatchProxy.proxy(new Object[]{view}, iwh, IWH.LIZ, false, 12).isSupported && !PatchProxy.proxy(new Object[0], iwh, IWH.LIZ, false, 13).isSupported) {
                C82072IWk.LIZ(C82070IWi.LJIIZILJ, iwh.getContext(), true, "", "live_more", "", false, ((IAnnouncementService) ServiceManager.getService(IAnnouncementService.class)).getNeedShowFanGroupEntry(), false, false, new IWK(iwh), 416, null);
            }
        }
        return Unit.INSTANCE;
    }
}
