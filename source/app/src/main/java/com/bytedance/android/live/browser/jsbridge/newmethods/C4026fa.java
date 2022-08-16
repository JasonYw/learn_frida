package com.bytedance.android.live.browser.jsbridge.newmethods;

import android.app.Activity;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.service.IVSReportService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdk.chatroom.event.UserProfileEvent;
import com.bytedance.android.livesdkapi.depend.model.live.abs.AbstractC9489d;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.bytedance.ies.web.jsbridge2.C13052h;
import kotlin.jvm.internal.Intrinsics;
import p003X.C106862S5w;
import p003X.C3UZ;
import p003X.C423702pg;
import p003X.C432733Ad;

/* renamed from: com.bytedance.android.live.browser.jsbridge.newmethods.fa */
/* loaded from: classes12.dex */
public final class C4026fa extends C3UZ<C4016dn, Object> {
    public static ChangeQuickRedirect LIZ;
    public final Activity LIZIZ;
    public final DataCenter LIZJ;

    static {
        Covode.recordClassIndex(22852);
    }

    public C4026fa(Activity activity, DataCenter dataCenter) {
        C106862S5w.LIZ(dataCenter);
        this.LIZIZ = activity;
        this.LIZJ = dataCenter;
    }

    @Override // com.bytedance.ies.web.jsbridge2.AbstractC13049f
    public final /* synthetic */ void invoke(Object obj, C13052h c13052h) {
        long j;
        long j2;
        int i;
        long j3;
        long j4;
        C4016dn c4016dn = (C4016dn) obj;
        if (!PatchProxy.proxy(new Object[]{c4016dn, c13052h}, this, LIZ, false, 1).isSupported) {
            C106862S5w.LIZ(c4016dn, c13052h);
            Activity activity = this.LIZIZ;
            if (activity != null) {
                AbstractC9489d LIZLLL = C423702pg.LIZLLL(this.LIZJ);
                String str = c4016dn.LIZ;
                long j5 = -1;
                if (str != null) {
                    j = Long.parseLong(str);
                } else {
                    j = -1;
                }
                String str2 = c4016dn.LIZJ;
                String str3 = c4016dn.LIZLLL;
                if (str3 != null) {
                    j2 = Long.parseLong(str3);
                } else {
                    j2 = -1;
                }
                Integer num = c4016dn.LJI;
                if (num != null) {
                    i = num.intValue();
                } else {
                    i = 1;
                }
                C432733Ad c432733Ad = new C432733Ad(j, str2, j2, i);
                String str4 = c4016dn.LIZ;
                if (str4 != null) {
                    j3 = Long.parseLong(str4);
                } else {
                    j3 = -1;
                }
                UserProfileEvent userProfileEvent = new UserProfileEvent(j3);
                userProfileEvent.mSource = c4016dn.LJII;
                userProfileEvent.forceNoRotate = true;
                userProfileEvent.requestPage = c4016dn.LJIIIIZZ;
                userProfileEvent.reportType = c4016dn.LJIIIZ;
                userProfileEvent.mCommentReportModel = c432733Ad;
                User user = new User();
                String str5 = c4016dn.LIZ;
                if (str5 != null) {
                    j4 = Long.parseLong(str5);
                } else {
                    j4 = -1;
                }
                user.setId(j4);
                user.setSecUid(c4016dn.LIZIZ);
                IVSReportService iVSReportService = (IVSReportService) ServiceManager.getService(IVSReportService.class);
                String str6 = c4016dn.LIZ;
                if (str6 != null) {
                    j5 = Long.parseLong(str6);
                }
                Boolean bool = (Boolean) this.LIZJ.get("data_is_portrait");
                if (bool == null) {
                    bool = Boolean.FALSE;
                }
                Intrinsics.checkNotNullExpressionValue(bool, "");
                iVSReportService.report(LIZLLL, activity, j5, false, userProfileEvent, user, bool.booleanValue(), this.LIZJ);
            }
        }
    }
}
