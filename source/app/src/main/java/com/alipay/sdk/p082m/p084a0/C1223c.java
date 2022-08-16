package com.alipay.sdk.p082m.p084a0;

import com.bytedance.covode.number.Covode;
import java.io.File;
import java.io.FileFilter;
import java.util.regex.Pattern;

/* renamed from: com.alipay.sdk.m.a0.c */
/* loaded from: classes2.dex */
public final class C1223c implements FileFilter {

    /* renamed from: a */
    public final /* synthetic */ C1222b f22071a;

    static {
        Covode.recordClassIndex(4723);
    }

    public C1223c(C1222b c1222b) {
        this.f22071a = c1222b;
    }

    @Override // java.io.FileFilter
    public final boolean accept(File file) {
        return Pattern.matches("cpu[0-9]+", file.getName());
    }
}
