package com.bytedance.android.live.linkpk;

import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.live.linkpk.d */
/* loaded from: classes3.dex */
public abstract class AbstractC4256d {
    public final String LIZ;

    static {
        Covode.recordClassIndex(25066);
    }

    /* renamed from: com.bytedance.android.live.linkpk.d$a */
    /* loaded from: classes3.dex */
    public static final class C4257a extends AbstractC4256d {
        public static final C4257a LIZIZ = new C4257a();

        public C4257a() {
            super("DISABLE", (byte) 0);
        }

        static {
            Covode.recordClassIndex(25067);
        }
    }

    /* renamed from: com.bytedance.android.live.linkpk.d$b */
    /* loaded from: classes3.dex */
    public static final class C4258b extends AbstractC4256d {
        public static final C4258b LIZIZ = new C4258b();

        public C4258b() {
            super("FINISHED", (byte) 0);
        }

        static {
            Covode.recordClassIndex(25068);
        }
    }

    /* renamed from: com.bytedance.android.live.linkpk.d$c */
    /* loaded from: classes3.dex */
    public static final class C4259c extends AbstractC4256d {
        public static final C4259c LIZIZ = new C4259c();

        public C4259c() {
            super("PENAL", (byte) 0);
        }

        static {
            Covode.recordClassIndex(25069);
        }
    }

    /* renamed from: com.bytedance.android.live.linkpk.d$d */
    /* loaded from: classes3.dex */
    public static final class C4260d extends AbstractC4256d {
        public static final C4260d LIZIZ = new C4260d();

        public C4260d() {
            super("PK", (byte) 0);
        }

        static {
            Covode.recordClassIndex(25070);
        }
    }

    public AbstractC4256d(String str) {
        this.LIZ = str;
    }

    public /* synthetic */ AbstractC4256d(String str, byte b) {
        this(str);
    }
}
