package com.alibaba.p052a.p061b.p065d;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.util.Arrays;
import java.util.Comparator;

/* renamed from: com.alibaba.a.b.d.g */
/* loaded from: classes13.dex */
public class C0969g {

    /* renamed from: a */
    public static C0969g f21401a = new C0969g();

    /* renamed from: b */
    public C0972b f21402b = new C0972b(this, null);

    /* renamed from: c */
    public C0971a f21403c = new C0971a(this, null);

    /* renamed from: com.alibaba.a.b.d.g$1 */
    /* loaded from: classes13.dex */
    public static /* synthetic */ class C09701 {
        static {
            Covode.recordClassIndex(4280);
        }
    }

    /* renamed from: com.alibaba.a.b.d.g$a */
    /* loaded from: classes13.dex */
    public class C0971a implements Comparator<String> {
        static {
            Covode.recordClassIndex(4281);
        }

        public C0971a() {
        }

        public /* synthetic */ C0971a(C0969g c0969g, C09701 c09701) {
            this();
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(String str, String str2) {
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                return 0;
            }
            return str.compareTo(str2);
        }
    }

    /* renamed from: com.alibaba.a.b.d.g$b */
    /* loaded from: classes13.dex */
    public class C0972b implements Comparator<String> {
        static {
            Covode.recordClassIndex(4282);
        }

        public C0972b() {
        }

        public /* synthetic */ C0972b(C0969g c0969g, C09701 c09701) {
            this();
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(String str, String str2) {
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                return 0;
            }
            return str.compareTo(str2) * (-1);
        }
    }

    static {
        Covode.recordClassIndex(4279);
    }

    /* renamed from: a */
    public static C0969g m20111a() {
        return f21401a;
    }

    /* renamed from: a */
    public String[] m20110a(String[] strArr, boolean z) {
        Comparator comparator = z ? this.f21403c : this.f21402b;
        if (comparator == null || strArr == null || strArr.length <= 0) {
            return null;
        }
        Arrays.sort(strArr, comparator);
        return strArr;
    }
}
