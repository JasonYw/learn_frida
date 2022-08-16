package com.bytedance.android.live.broadcast.dialog;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.unisus.uniservice.logger.LoggerUtil;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringBuilderJVMKt;
import p003X.K8Z;
import p003X.KQW;

/* loaded from: classes5.dex */
public final class LiveStreamCreateFailDialog$getLogStr$1 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ StringBuilder $sb;
    public final /* synthetic */ KQW this$0;

    static {
        Covode.recordClassIndex(15392);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveStreamCreateFailDialog$getLogStr$1(KQW kqw, StringBuilder sb) {
        super(0);
        this.this$0 = kqw;
        this.$sb = sb;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        LIZ();
        return Unit.INSTANCE;
    }

    public final void LIZ() {
        String str;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            return;
        }
        Map<String, Pair<Boolean, String>> map = K8Z.LIZLLL;
        StringBuilder sb = this.$sb;
        sb.append("----------------");
        StringsKt__StringBuilderJVMKt.appendln(sb);
        StringBuilder sb2 = this.$sb;
        sb2.append("So load Status:");
        StringsKt__StringBuilderJVMKt.appendln(sb2);
        Intrinsics.checkNotNullExpressionValue(map, "");
        for (Map.Entry<String, Pair<Boolean, String>> entry : map.entrySet()) {
            StringBuilder sb3 = this.$sb;
            sb3.append("{" + entry.getKey() + "} : status[" + entry.getValue().first + LoggerUtil.M_RIGHT_TAG);
            if (!((Boolean) entry.getValue().first).booleanValue()) {
                StringBuilder sb4 = this.$sb;
                sb4.append("errmsg: [" + ((String) entry.getValue().second) + "]\n");
            } else {
                this.$sb.append("\n");
            }
        }
        StringBuilder sb5 = this.$sb;
        sb5.append("------------------");
        StringsKt__StringBuilderJVMKt.appendln(sb5);
        StringBuilder sb6 = this.$sb;
        Error error = this.this$0.f8468LJ;
        if (error != null) {
            str = error.toString();
        } else {
            str = null;
        }
        sb6.append(str);
        StringsKt__StringBuilderJVMKt.appendln(sb6);
    }
}
