package com.bytedance.android.live.broadcast.utils;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;

/* loaded from: classes12.dex */
public final class WelfareAppLogger$sendAnchorWelfareConfirmEvent$1 extends Lambda implements Function1<HashMap<String, String>, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ boolean $isLiving;
    public final /* synthetic */ String $listPage;
    public final /* synthetic */ long $projectId;

    static {
        Covode.recordClassIndex(17971);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WelfareAppLogger$sendAnchorWelfareConfirmEvent$1(long j, boolean z, String str) {
        super(1);
        this.$projectId = j;
        this.$isLiving = z;
        this.$listPage = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(HashMap<String, String> hashMap) {
        String str;
        HashMap<String, String> hashMap2 = hashMap;
        if (!PatchProxy.proxy(new Object[]{hashMap2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(hashMap2);
            hashMap2.put("project_id", String.valueOf(this.$projectId));
            if (this.$isLiving) {
                str = "live_take_detail";
            } else {
                str = "live_take_entrance";
            }
            hashMap2.put("event_page", str);
            hashMap2.put("list_page", this.$listPage);
        }
        return Unit.INSTANCE;
    }
}
