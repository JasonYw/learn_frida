package com.bytedance.android.live.liveinteract.videotalk.dialog;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;

/* loaded from: classes.dex */
public final class VideoTalkSettingDialog$checkCPostionCanSwitchScene$1 extends Lambda implements Function1<String, Unit> {
    public static final VideoTalkSettingDialog$checkCPostionCanSwitchScene$1 INSTANCE = new VideoTalkSettingDialog$checkCPostionCanSwitchScene$1();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(30035);
    }

    public VideoTalkSettingDialog$checkCPostionCanSwitchScene$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(String str) {
        if (!PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(str);
        }
        return Unit.INSTANCE;
    }
}
