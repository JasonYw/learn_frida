package com.bytedance.android.live.base.service;

import android.content.Context;
import androidx.lifecycle.ViewModel;
import com.bytedance.android.live.base.IService;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.event.UserProfileEvent;
import com.bytedance.covode.number.Covode;
import p003X.AbstractC134584bxD;
import p003X.C423142om;

/* loaded from: classes12.dex */
public interface IVSReportService extends IService {
    public static final C423142om Companion = C423142om.LIZ;

    static {
        Covode.recordClassIndex(14278);
    }

    void logReport(boolean z, String str, String str2, String str3, String str4, ViewModel viewModel, String str5);

    boolean loginCheck(Context context, boolean z);

    boolean report(AbstractC134584bxD abstractC134584bxD, Context context, long j, boolean z, UserProfileEvent userProfileEvent, User user, boolean z2, ViewModel viewModel);

    void reportComment(Long l, long j, long j2, String str, String str2, int i, long j3, long j4, boolean z, String str3, ViewModel viewModel, Context context);
}
