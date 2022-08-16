package com.bytedance.android.annie.util;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class RomUtils$isFlyme$2 extends Lambda implements Function0<Boolean> {
    public static final RomUtils$isFlyme$2 INSTANCE = new RomUtils$isFlyme$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(11216);
    }

    public RomUtils$isFlyme$2() {
        super(0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0036, code lost:
        if (kotlin.text.StringsKt__StringsKt.indexOf$default((java.lang.CharSequence) r3, "Flyme", 0, false, 6, (java.lang.Object) null) < 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004c, code lost:
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004a, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual(android.os.Build.USER, "flyme") != false) goto L13;
     */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ java.lang.Boolean mo30099invoke() {
        /*
            r9 = this;
            r2 = 0
            java.lang.Object[] r3 = new java.lang.Object[r2]
            com.bytedance.hotfix.base.ChangeQuickRedirect r1 = com.bytedance.android.annie.util.RomUtils$isFlyme$2.changeQuickRedirect
            r0 = 1
            com.bytedance.hotfix.PatchProxyResult r1 = com.bytedance.hotfix.PatchProxy.proxy(r3, r9, r1, r2, r0)
            boolean r0 = r1.isSupported
            if (r0 == 0) goto L1b
            java.lang.Object r0 = r1.result
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r2 = r0.booleanValue()
        L16:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            return r0
        L1b:
            java.lang.String r0 = android.os.Build.DISPLAY
            if (r0 == 0) goto L38
            int r0 = r0.length()
            if (r0 == 0) goto L38
            java.lang.String r3 = android.os.Build.DISPLAY
            java.lang.String r0 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r0)
            r5 = 0
            r6 = 0
            r7 = 6
            r8 = 0
            java.lang.String r4 = "Flyme"
            int r0 = kotlin.text.StringsKt__StringsKt.indexOf$default(r3, r4, r5, r6, r7, r8)
            if (r0 >= 0) goto L4c
        L38:
            java.lang.String r0 = android.os.Build.USER
            if (r0 == 0) goto L16
            int r0 = r0.length()
            if (r0 == 0) goto L16
            java.lang.String r1 = android.os.Build.USER
            java.lang.String r0 = "flyme"
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r0)
            if (r0 == 0) goto L16
        L4c:
            r2 = 1
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.annie.util.RomUtils$isFlyme$2.mo30099invoke():java.lang.Object");
    }
}
