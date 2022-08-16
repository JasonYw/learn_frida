package com.bytedance.android.live.broadcast.widget;

import com.bytedance.android.live.broadcast.api.model.PermissionResult;
import com.bytedance.android.live.broadcast.api.model.WelfarePermissionInfo;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.C35G;
import p003X.C415682ck;

/* loaded from: classes12.dex */
public final class PreviewWelfareWidget$onCreate$1 extends Lambda implements Function1<PermissionResult, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ PreviewWelfareWidget this$0;

    static {
        Covode.recordClassIndex(18775);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreviewWelfareWidget$onCreate$1(PreviewWelfareWidget previewWelfareWidget) {
        super(1);
        this.this$0 = previewWelfareWidget;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(PermissionResult permissionResult) {
        boolean z;
        PermissionResult permissionResult2 = permissionResult;
        if (!PatchProxy.proxy(new Object[]{permissionResult2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(permissionResult2);
            WelfarePermissionInfo welfarePermissionInfo = permissionResult2.welfarePermissionInfo;
            if (welfarePermissionInfo != null && welfarePermissionInfo.available) {
                z = true;
            } else {
                z = false;
            }
            C415682ck.LIZ("has welfare permission: " + z);
            if (z) {
                Boolean LIZ = C415682ck.LIZ();
                Intrinsics.checkNotNullExpressionValue(LIZ, "");
                if (LIZ.booleanValue()) {
                    this.this$0.LJIIJJI().m15893LJ().LIZ().hasWelfarePermission = true;
                    this.this$0.LJIILJJIL();
                    C35G.LIZ(false);
                    C415682ck.LIZ("preview welfare icon show");
                }
            }
            this.this$0.LJIILL();
            C415682ck.LIZ("preview welfare icon hide");
        }
        return Unit.INSTANCE;
    }
}
