package com.aweme.storage;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.io.File;
import java.util.List;
import p002O.C0002O;
import p003X.C76564GGo;

/* renamed from: com.aweme.storage.n */
/* loaded from: classes13.dex */
public final class C2441n {
    public static ChangeQuickRedirect LIZ;
    public String LIZIZ;
    public List<C2442a> LIZJ;

    static {
        Covode.recordClassIndex(9447);
    }

    public final void LIZ() {
        List<C2442a> list;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported && !TextUtils.isEmpty(this.LIZIZ) && (list = this.LIZJ) != null && !list.isEmpty()) {
            for (C2442a c2442a : this.LIZJ) {
                if (c2442a != null) {
                    c2442a.LIZ(this.LIZIZ);
                }
            }
            C76564GGo.LIZ(this.LIZIZ);
        }
    }

    /* renamed from: com.aweme.storage.n$a */
    /* loaded from: classes13.dex */
    public static class C2442a {
        public static ChangeQuickRedirect LIZ;
        public String LIZIZ;
        public File LIZJ;

        static {
            Covode.recordClassIndex(9448);
        }

        public final void LIZ(String str) {
            if (!PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 1).isSupported && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(this.LIZIZ)) {
                new StringBuilder();
                String m25085C = C0002O.m25085C(str, File.separator, this.LIZIZ);
                this.LIZJ = new File(m25085C);
                if (this.LIZJ.exists()) {
                    C76564GGo.LIZ(m25085C);
                }
            }
        }

        public C2442a(String str, String str2) {
            this.LIZIZ = str;
        }
    }

    public C2441n(String str, String str2) {
        this.LIZIZ = str2;
    }

    public C2441n(String str, String str2, List<C2442a> list) {
        this.LIZIZ = str2;
        this.LIZJ = list;
    }
}
