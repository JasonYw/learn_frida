package com.bytedance.android.live.broadcast.setting;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;

/* loaded from: classes.dex */
public final class PublishFullRecordToProfileSettingItem$onCheckStateChanged$2 extends Lambda implements Function1<Throwable, Unit> {
    public static final PublishFullRecordToProfileSettingItem$onCheckStateChanged$2 INSTANCE = new PublishFullRecordToProfileSettingItem$onCheckStateChanged$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(17879);
    }

    public PublishFullRecordToProfileSettingItem$onCheckStateChanged$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(Throwable th) {
        if (!PatchProxy.proxy(new Object[]{th}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(th);
        }
        return Unit.INSTANCE;
    }
}
