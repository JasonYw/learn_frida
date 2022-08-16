package com.alibaba.p052a.p053a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.core.view.MotionEventCompat;
import com.alibaba.p052a.p053a.p060g.C0919c;
import com.alibaba.p052a.p053a.p060g.C0921d;
import com.alibaba.p052a.p053a.p060g.C0925f;
import com.alibaba.p052a.p053a.p060g.C0929h;
import com.bytedance.covode.number.Covode;
import java.util.Map;

/* renamed from: com.alibaba.a.a.d */
/* loaded from: classes13.dex */
public interface AbstractC0894d extends IInterface {

    /* renamed from: com.alibaba.a.a.d$a */
    /* loaded from: classes13.dex */
    public static abstract class AbstractBinderC0895a extends Binder implements AbstractC0894d {

        /* renamed from: com.alibaba.a.a.d$a$a */
        /* loaded from: classes13.dex */
        public static class C0896a implements AbstractC0894d {

            /* renamed from: a */
            public IBinder f21197a;

            static {
                Covode.recordClassIndex(4206);
            }

            public C0896a(IBinder iBinder) {
                this.f21197a = iBinder;
            }

            @Override // com.alibaba.p052a.p053a.AbstractC0894d
            /* renamed from: a */
            public void mo20383a() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.alibaba.mtl.appmonitor.IMonitor");
                    this.f21197a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.alibaba.p052a.p053a.AbstractC0894d
            /* renamed from: a */
            public void mo20382a(int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.alibaba.mtl.appmonitor.IMonitor");
                    obtain.writeInt(i);
                    this.f21197a.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.alibaba.p052a.p053a.AbstractC0894d
            /* renamed from: a */
            public void mo20381a(int i, int i2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.alibaba.mtl.appmonitor.IMonitor");
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    this.f21197a.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.alibaba.p052a.p053a.AbstractC0894d
            /* renamed from: a */
            public void mo20380a(C0914g c0914g, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.alibaba.mtl.appmonitor.IMonitor");
                    if (c0914g != null) {
                        obtain.writeInt(1);
                        c0914g.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeString(str);
                    this.f21197a.transact(40, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.alibaba.p052a.p053a.AbstractC0894d
            /* renamed from: a */
            public void mo20379a(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.alibaba.mtl.appmonitor.IMonitor");
                    obtain.writeString(str);
                    this.f21197a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.alibaba.p052a.p053a.AbstractC0894d
            /* renamed from: a */
            public void mo20377a(String str, String str2, double d) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.alibaba.mtl.appmonitor.IMonitor");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeDouble(d);
                    this.f21197a.transact(24, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.alibaba.p052a.p053a.AbstractC0894d
            /* renamed from: a */
            public void mo20376a(String str, String str2, double d, Map map) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.alibaba.mtl.appmonitor.IMonitor");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeDouble(d);
                    obtain.writeMap(map);
                    this.f21197a.transact(19, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.alibaba.p052a.p053a.AbstractC0894d
            /* renamed from: a */
            public void mo20375a(String str, String str2, C0921d c0921d, double d, Map map) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.alibaba.mtl.appmonitor.IMonitor");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    if (c0921d != null) {
                        obtain.writeInt(1);
                        c0921d.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeDouble(d);
                    obtain.writeMap(map);
                    this.f21197a.transact(38, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.alibaba.p052a.p053a.AbstractC0894d
            /* renamed from: a */
            public void mo20374a(String str, String str2, C0921d c0921d, C0929h c0929h, Map map) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.alibaba.mtl.appmonitor.IMonitor");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    if (c0921d != null) {
                        obtain.writeInt(1);
                        c0921d.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (c0929h != null) {
                        obtain.writeInt(1);
                        c0929h.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeMap(map);
                    this.f21197a.transact(39, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.alibaba.p052a.p053a.AbstractC0894d
            /* renamed from: a */
            public void mo20373a(String str, String str2, C0925f c0925f) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.alibaba.mtl.appmonitor.IMonitor");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    if (c0925f != null) {
                        obtain.writeInt(1);
                        c0925f.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f21197a.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.alibaba.p052a.p053a.AbstractC0894d
            /* renamed from: a */
            public void mo20372a(String str, String str2, C0925f c0925f, C0919c c0919c) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.alibaba.mtl.appmonitor.IMonitor");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    if (c0925f != null) {
                        obtain.writeInt(1);
                        c0925f.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (c0919c != null) {
                        obtain.writeInt(1);
                        c0919c.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f21197a.transact(11, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.alibaba.p052a.p053a.AbstractC0894d
            /* renamed from: a */
            public void mo20371a(String str, String str2, C0925f c0925f, C0919c c0919c, boolean z) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.alibaba.mtl.appmonitor.IMonitor");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    int i = 1;
                    if (c0925f != null) {
                        obtain.writeInt(1);
                        c0925f.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (c0919c != null) {
                        obtain.writeInt(1);
                        c0919c.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!z) {
                        i = 0;
                    }
                    obtain.writeInt(i);
                    this.f21197a.transact(12, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.alibaba.p052a.p053a.AbstractC0894d
            /* renamed from: a */
            public void mo20370a(String str, String str2, C0925f c0925f, boolean z) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.alibaba.mtl.appmonitor.IMonitor");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    int i = 1;
                    if (c0925f != null) {
                        obtain.writeInt(1);
                        c0925f.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!z) {
                        i = 0;
                    }
                    obtain.writeInt(i);
                    this.f21197a.transact(10, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.alibaba.p052a.p053a.AbstractC0894d
            /* renamed from: a */
            public void mo20369a(String str, String str2, String str3) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.alibaba.mtl.appmonitor.IMonitor");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeString(str3);
                    this.f21197a.transact(32, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.alibaba.p052a.p053a.AbstractC0894d
            /* renamed from: a */
            public void mo20368a(String str, String str2, String str3, double d, Map map) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.alibaba.mtl.appmonitor.IMonitor");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeString(str3);
                    obtain.writeDouble(d);
                    obtain.writeMap(map);
                    this.f21197a.transact(20, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.alibaba.p052a.p053a.AbstractC0894d
            /* renamed from: a */
            public void mo20367a(String str, String str2, String str3, String str4, String str5, Map map) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.alibaba.mtl.appmonitor.IMonitor");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeString(str3);
                    obtain.writeString(str4);
                    obtain.writeString(str5);
                    obtain.writeMap(map);
                    this.f21197a.transact(31, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.alibaba.p052a.p053a.AbstractC0894d
            /* renamed from: a */
            public void mo20366a(String str, String str2, String str3, String str4, Map map) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.alibaba.mtl.appmonitor.IMonitor");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeString(str3);
                    obtain.writeString(str4);
                    obtain.writeMap(map);
                    this.f21197a.transact(30, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.alibaba.p052a.p053a.AbstractC0894d
            /* renamed from: a */
            public void mo20365a(String str, String str2, String str3, Map map) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.alibaba.mtl.appmonitor.IMonitor");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeString(str3);
                    obtain.writeMap(map);
                    this.f21197a.transact(29, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.alibaba.p052a.p053a.AbstractC0894d
            /* renamed from: a */
            public void mo20364a(String str, String str2, Map map) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.alibaba.mtl.appmonitor.IMonitor");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeMap(map);
                    this.f21197a.transact(28, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.alibaba.p052a.p053a.AbstractC0894d
            /* renamed from: a */
            public void mo20363a(Map map) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.alibaba.mtl.appmonitor.IMonitor");
                    obtain.writeMap(map);
                    this.f21197a.transact(13, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.alibaba.p052a.p053a.AbstractC0894d
            /* renamed from: a */
            public void mo20362a(boolean z) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.alibaba.mtl.appmonitor.IMonitor");
                    obtain.writeInt(z ? 1 : 0);
                    this.f21197a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.alibaba.p052a.p053a.AbstractC0894d
            /* renamed from: a */
            public void mo20361a(boolean z, String str, String str2, String str3) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.alibaba.mtl.appmonitor.IMonitor");
                    obtain.writeInt(z ? 1 : 0);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeString(str3);
                    this.f21197a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.alibaba.p052a.p053a.AbstractC0894d
            /* renamed from: a */
            public boolean mo20378a(String str, String str2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.alibaba.mtl.appmonitor.IMonitor");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    boolean z = false;
                    this.f21197a.transact(18, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f21197a;
            }

            @Override // com.alibaba.p052a.p053a.AbstractC0894d
            /* renamed from: b */
            public void mo20360b() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.alibaba.mtl.appmonitor.IMonitor");
                    this.f21197a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.alibaba.p052a.p053a.AbstractC0894d
            /* renamed from: b */
            public void mo20359b(int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.alibaba.mtl.appmonitor.IMonitor");
                    obtain.writeInt(i);
                    this.f21197a.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.alibaba.p052a.p053a.AbstractC0894d
            /* renamed from: b */
            public void mo20358b(C0914g c0914g, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.alibaba.mtl.appmonitor.IMonitor");
                    if (c0914g != null) {
                        obtain.writeInt(1);
                        c0914g.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeString(str);
                    this.f21197a.transact(41, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.alibaba.p052a.p053a.AbstractC0894d
            /* renamed from: b */
            public void mo20356b(String str, String str2, double d, Map map) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.alibaba.mtl.appmonitor.IMonitor");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeDouble(d);
                    obtain.writeMap(map);
                    this.f21197a.transact(37, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.alibaba.p052a.p053a.AbstractC0894d
            /* renamed from: b */
            public void mo20355b(String str, String str2, String str3) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.alibaba.mtl.appmonitor.IMonitor");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeString(str3);
                    this.f21197a.transact(33, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.alibaba.p052a.p053a.AbstractC0894d
            /* renamed from: b */
            public boolean mo20357b(String str, String str2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.alibaba.mtl.appmonitor.IMonitor");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    boolean z = false;
                    this.f21197a.transact(23, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.alibaba.p052a.p053a.AbstractC0894d
            /* renamed from: c */
            public void mo20354c() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.alibaba.mtl.appmonitor.IMonitor");
                    this.f21197a.transact(14, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.alibaba.p052a.p053a.AbstractC0894d
            /* renamed from: c */
            public void mo20353c(int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.alibaba.mtl.appmonitor.IMonitor");
                    obtain.writeInt(i);
                    this.f21197a.transact(16, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.alibaba.p052a.p053a.AbstractC0894d
            /* renamed from: c */
            public boolean mo20352c(String str, String str2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.alibaba.mtl.appmonitor.IMonitor");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    boolean z = false;
                    this.f21197a.transact(27, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.alibaba.p052a.p053a.AbstractC0894d
            /* renamed from: d */
            public void mo20351d() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.alibaba.mtl.appmonitor.IMonitor");
                    this.f21197a.transact(15, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.alibaba.p052a.p053a.AbstractC0894d
            /* renamed from: d */
            public void mo20350d(int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.alibaba.mtl.appmonitor.IMonitor");
                    obtain.writeInt(i);
                    this.f21197a.transact(17, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.alibaba.p052a.p053a.AbstractC0894d
            /* renamed from: d */
            public boolean mo20349d(String str, String str2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.alibaba.mtl.appmonitor.IMonitor");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    boolean z = false;
                    this.f21197a.transact(36, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.alibaba.p052a.p053a.AbstractC0894d
            /* renamed from: e */
            public void mo20348e(int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.alibaba.mtl.appmonitor.IMonitor");
                    obtain.writeInt(i);
                    this.f21197a.transact(21, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.alibaba.p052a.p053a.AbstractC0894d
            /* renamed from: f */
            public void mo20347f(int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.alibaba.mtl.appmonitor.IMonitor");
                    obtain.writeInt(i);
                    this.f21197a.transact(22, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.alibaba.p052a.p053a.AbstractC0894d
            /* renamed from: g */
            public void mo20346g(int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.alibaba.mtl.appmonitor.IMonitor");
                    obtain.writeInt(i);
                    this.f21197a.transact(25, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.alibaba.p052a.p053a.AbstractC0894d
            /* renamed from: h */
            public void mo20345h(int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.alibaba.mtl.appmonitor.IMonitor");
                    obtain.writeInt(i);
                    this.f21197a.transact(26, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.alibaba.p052a.p053a.AbstractC0894d
            /* renamed from: i */
            public void mo20344i(int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.alibaba.mtl.appmonitor.IMonitor");
                    obtain.writeInt(i);
                    this.f21197a.transact(34, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.alibaba.p052a.p053a.AbstractC0894d
            /* renamed from: j */
            public void mo20343j(int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.alibaba.mtl.appmonitor.IMonitor");
                    obtain.writeInt(i);
                    this.f21197a.transact(35, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        static {
            Covode.recordClassIndex(4205);
        }

        public AbstractBinderC0895a() {
            attachInterface(this, "com.alibaba.mtl.appmonitor.IMonitor");
        }

        /* renamed from: a */
        public static AbstractC0894d m20411a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.alibaba.mtl.appmonitor.IMonitor");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC0894d)) ? new C0896a(iBinder) : (AbstractC0894d) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1598968902) {
                parcel2.writeString("com.alibaba.mtl.appmonitor.IMonitor");
                return true;
            }
            boolean z = false;
            C0925f c0925f = null;
            C0914g c0914g = null;
            C0914g c0914g2 = null;
            C0929h c0929h = null;
            C0921d c0921d = null;
            C0919c c0919c = null;
            C0919c c0919c2 = null;
            C0925f c0925f2 = null;
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.alibaba.mtl.appmonitor.IMonitor");
                    a();
                    break;
                case 2:
                    parcel.enforceInterface("com.alibaba.mtl.appmonitor.IMonitor");
                    if (parcel.readInt() != 0) {
                        z = true;
                    }
                    a(z);
                    break;
                case 3:
                    parcel.enforceInterface("com.alibaba.mtl.appmonitor.IMonitor");
                    if (parcel.readInt() != 0) {
                        z = true;
                    }
                    a(z, parcel.readString(), parcel.readString(), parcel.readString());
                    break;
                case 4:
                    parcel.enforceInterface("com.alibaba.mtl.appmonitor.IMonitor");
                    a(parcel.readString());
                    break;
                case 5:
                    parcel.enforceInterface("com.alibaba.mtl.appmonitor.IMonitor");
                    b();
                    break;
                case 6:
                    parcel.enforceInterface("com.alibaba.mtl.appmonitor.IMonitor");
                    a(parcel.readInt());
                    break;
                case 7:
                    parcel.enforceInterface("com.alibaba.mtl.appmonitor.IMonitor");
                    b(parcel.readInt());
                    break;
                case 8:
                    parcel.enforceInterface("com.alibaba.mtl.appmonitor.IMonitor");
                    a(parcel.readInt(), parcel.readInt());
                    break;
                case 9:
                    parcel.enforceInterface("com.alibaba.mtl.appmonitor.IMonitor");
                    String readString = parcel.readString();
                    String readString2 = parcel.readString();
                    if (parcel.readInt() != 0) {
                        c0925f = C0925f.CREATOR.createFromParcel(parcel);
                    }
                    a(readString, readString2, c0925f);
                    break;
                case 10:
                    parcel.enforceInterface("com.alibaba.mtl.appmonitor.IMonitor");
                    String readString3 = parcel.readString();
                    String readString4 = parcel.readString();
                    if (parcel.readInt() != 0) {
                        c0925f2 = C0925f.CREATOR.createFromParcel(parcel);
                    }
                    if (parcel.readInt() != 0) {
                        z = true;
                    }
                    a(readString3, readString4, c0925f2, z);
                    break;
                case 11:
                    parcel.enforceInterface("com.alibaba.mtl.appmonitor.IMonitor");
                    String readString5 = parcel.readString();
                    String readString6 = parcel.readString();
                    C0925f createFromParcel = parcel.readInt() != 0 ? C0925f.CREATOR.createFromParcel(parcel) : null;
                    if (parcel.readInt() != 0) {
                        c0919c2 = C0919c.CREATOR.createFromParcel(parcel);
                    }
                    a(readString5, readString6, createFromParcel, c0919c2);
                    break;
                case 12:
                    parcel.enforceInterface("com.alibaba.mtl.appmonitor.IMonitor");
                    String readString7 = parcel.readString();
                    String readString8 = parcel.readString();
                    C0925f createFromParcel2 = parcel.readInt() != 0 ? C0925f.CREATOR.createFromParcel(parcel) : null;
                    if (parcel.readInt() != 0) {
                        c0919c = C0919c.CREATOR.createFromParcel(parcel);
                    }
                    a(readString7, readString8, createFromParcel2, c0919c, parcel.readInt() != 0);
                    break;
                case 13:
                    parcel.enforceInterface("com.alibaba.mtl.appmonitor.IMonitor");
                    a(parcel.readHashMap(getClass().getClassLoader()));
                    break;
                case 14:
                    parcel.enforceInterface("com.alibaba.mtl.appmonitor.IMonitor");
                    c();
                    break;
                case MotionEventCompat.AXIS_HAT_X /* 15 */:
                    parcel.enforceInterface("com.alibaba.mtl.appmonitor.IMonitor");
                    d();
                    break;
                case 16:
                    parcel.enforceInterface("com.alibaba.mtl.appmonitor.IMonitor");
                    c(parcel.readInt());
                    break;
                case MotionEventCompat.AXIS_LTRIGGER /* 17 */:
                    parcel.enforceInterface("com.alibaba.mtl.appmonitor.IMonitor");
                    d(parcel.readInt());
                    break;
                case 18:
                    parcel.enforceInterface("com.alibaba.mtl.appmonitor.IMonitor");
                    boolean a = a(parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(a ? 1 : 0);
                    return true;
                case MotionEventCompat.AXIS_THROTTLE /* 19 */:
                    parcel.enforceInterface("com.alibaba.mtl.appmonitor.IMonitor");
                    a(parcel.readString(), parcel.readString(), parcel.readDouble(), parcel.readHashMap(getClass().getClassLoader()));
                    break;
                case 20:
                    parcel.enforceInterface("com.alibaba.mtl.appmonitor.IMonitor");
                    a(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readDouble(), parcel.readHashMap(getClass().getClassLoader()));
                    break;
                case 21:
                    parcel.enforceInterface("com.alibaba.mtl.appmonitor.IMonitor");
                    e(parcel.readInt());
                    break;
                case MotionEventCompat.AXIS_GAS /* 22 */:
                    parcel.enforceInterface("com.alibaba.mtl.appmonitor.IMonitor");
                    f(parcel.readInt());
                    break;
                case MotionEventCompat.AXIS_BRAKE /* 23 */:
                    parcel.enforceInterface("com.alibaba.mtl.appmonitor.IMonitor");
                    boolean b = b(parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(b ? 1 : 0);
                    return true;
                case MotionEventCompat.AXIS_DISTANCE /* 24 */:
                    parcel.enforceInterface("com.alibaba.mtl.appmonitor.IMonitor");
                    a(parcel.readString(), parcel.readString(), parcel.readDouble());
                    break;
                case MotionEventCompat.AXIS_TILT /* 25 */:
                    parcel.enforceInterface("com.alibaba.mtl.appmonitor.IMonitor");
                    g(parcel.readInt());
                    break;
                case 26:
                    parcel.enforceInterface("com.alibaba.mtl.appmonitor.IMonitor");
                    h(parcel.readInt());
                    break;
                case 27:
                    parcel.enforceInterface("com.alibaba.mtl.appmonitor.IMonitor");
                    boolean c = c(parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(c ? 1 : 0);
                    return true;
                case 28:
                    parcel.enforceInterface("com.alibaba.mtl.appmonitor.IMonitor");
                    a(parcel.readString(), parcel.readString(), parcel.readHashMap(getClass().getClassLoader()));
                    break;
                case 29:
                    parcel.enforceInterface("com.alibaba.mtl.appmonitor.IMonitor");
                    a(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readHashMap(getClass().getClassLoader()));
                    break;
                case 30:
                    parcel.enforceInterface("com.alibaba.mtl.appmonitor.IMonitor");
                    a(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readHashMap(getClass().getClassLoader()));
                    break;
                case 31:
                    parcel.enforceInterface("com.alibaba.mtl.appmonitor.IMonitor");
                    a(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readHashMap(getClass().getClassLoader()));
                    break;
                case 32:
                    parcel.enforceInterface("com.alibaba.mtl.appmonitor.IMonitor");
                    a(parcel.readString(), parcel.readString(), parcel.readString());
                    break;
                case MotionEventCompat.AXIS_GENERIC_2 /* 33 */:
                    parcel.enforceInterface("com.alibaba.mtl.appmonitor.IMonitor");
                    b(parcel.readString(), parcel.readString(), parcel.readString());
                    break;
                case MotionEventCompat.AXIS_GENERIC_3 /* 34 */:
                    parcel.enforceInterface("com.alibaba.mtl.appmonitor.IMonitor");
                    i(parcel.readInt());
                    break;
                case MotionEventCompat.AXIS_GENERIC_4 /* 35 */:
                    parcel.enforceInterface("com.alibaba.mtl.appmonitor.IMonitor");
                    j(parcel.readInt());
                    break;
                case MotionEventCompat.AXIS_GENERIC_5 /* 36 */:
                    parcel.enforceInterface("com.alibaba.mtl.appmonitor.IMonitor");
                    boolean d = d(parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(d ? 1 : 0);
                    return true;
                case MotionEventCompat.AXIS_GENERIC_6 /* 37 */:
                    parcel.enforceInterface("com.alibaba.mtl.appmonitor.IMonitor");
                    b(parcel.readString(), parcel.readString(), parcel.readDouble(), parcel.readHashMap(getClass().getClassLoader()));
                    break;
                case MotionEventCompat.AXIS_GENERIC_7 /* 38 */:
                    parcel.enforceInterface("com.alibaba.mtl.appmonitor.IMonitor");
                    String readString9 = parcel.readString();
                    String readString10 = parcel.readString();
                    if (parcel.readInt() != 0) {
                        c0921d = C0921d.CREATOR.createFromParcel(parcel);
                    }
                    a(readString9, readString10, c0921d, parcel.readDouble(), parcel.readHashMap(getClass().getClassLoader()));
                    break;
                case MotionEventCompat.AXIS_GENERIC_8 /* 39 */:
                    parcel.enforceInterface("com.alibaba.mtl.appmonitor.IMonitor");
                    String readString11 = parcel.readString();
                    String readString12 = parcel.readString();
                    C0921d createFromParcel3 = parcel.readInt() != 0 ? C0921d.CREATOR.createFromParcel(parcel) : null;
                    if (parcel.readInt() != 0) {
                        c0929h = C0929h.CREATOR.createFromParcel(parcel);
                    }
                    a(readString11, readString12, createFromParcel3, c0929h, parcel.readHashMap(getClass().getClassLoader()));
                    break;
                case 40:
                    parcel.enforceInterface("com.alibaba.mtl.appmonitor.IMonitor");
                    if (parcel.readInt() != 0) {
                        c0914g2 = C0914g.CREATOR.createFromParcel(parcel);
                    }
                    a(c0914g2, parcel.readString());
                    break;
                case MotionEventCompat.AXIS_GENERIC_10 /* 41 */:
                    parcel.enforceInterface("com.alibaba.mtl.appmonitor.IMonitor");
                    if (parcel.readInt() != 0) {
                        c0914g = C0914g.CREATOR.createFromParcel(parcel);
                    }
                    b(c0914g, parcel.readString());
                    break;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel2.writeNoException();
            return true;
        }
    }

    static {
        Covode.recordClassIndex(4204);
    }

    /* renamed from: a */
    void mo20383a();

    /* renamed from: a */
    void mo20382a(int i);

    /* renamed from: a */
    void mo20381a(int i, int i2);

    /* renamed from: a */
    void mo20380a(C0914g c0914g, String str);

    /* renamed from: a */
    void mo20379a(String str);

    /* renamed from: a */
    void mo20377a(String str, String str2, double d);

    /* renamed from: a */
    void mo20376a(String str, String str2, double d, Map map);

    /* renamed from: a */
    void mo20375a(String str, String str2, C0921d c0921d, double d, Map map);

    /* renamed from: a */
    void mo20374a(String str, String str2, C0921d c0921d, C0929h c0929h, Map map);

    /* renamed from: a */
    void mo20373a(String str, String str2, C0925f c0925f);

    /* renamed from: a */
    void mo20372a(String str, String str2, C0925f c0925f, C0919c c0919c);

    /* renamed from: a */
    void mo20371a(String str, String str2, C0925f c0925f, C0919c c0919c, boolean z);

    /* renamed from: a */
    void mo20370a(String str, String str2, C0925f c0925f, boolean z);

    /* renamed from: a */
    void mo20369a(String str, String str2, String str3);

    /* renamed from: a */
    void mo20368a(String str, String str2, String str3, double d, Map map);

    /* renamed from: a */
    void mo20367a(String str, String str2, String str3, String str4, String str5, Map map);

    /* renamed from: a */
    void mo20366a(String str, String str2, String str3, String str4, Map map);

    /* renamed from: a */
    void mo20365a(String str, String str2, String str3, Map map);

    /* renamed from: a */
    void mo20364a(String str, String str2, Map map);

    /* renamed from: a */
    void mo20363a(Map map);

    /* renamed from: a */
    void mo20362a(boolean z);

    /* renamed from: a */
    void mo20361a(boolean z, String str, String str2, String str3);

    /* renamed from: a */
    boolean mo20378a(String str, String str2);

    /* renamed from: b */
    void mo20360b();

    /* renamed from: b */
    void mo20359b(int i);

    /* renamed from: b */
    void mo20358b(C0914g c0914g, String str);

    /* renamed from: b */
    void mo20356b(String str, String str2, double d, Map map);

    /* renamed from: b */
    void mo20355b(String str, String str2, String str3);

    /* renamed from: b */
    boolean mo20357b(String str, String str2);

    /* renamed from: c */
    void mo20354c();

    /* renamed from: c */
    void mo20353c(int i);

    /* renamed from: c */
    boolean mo20352c(String str, String str2);

    /* renamed from: d */
    void mo20351d();

    /* renamed from: d */
    void mo20350d(int i);

    /* renamed from: d */
    boolean mo20349d(String str, String str2);

    /* renamed from: e */
    void mo20348e(int i);

    /* renamed from: f */
    void mo20347f(int i);

    /* renamed from: g */
    void mo20346g(int i);

    /* renamed from: h */
    void mo20345h(int i);

    /* renamed from: i */
    void mo20344i(int i);

    /* renamed from: j */
    void mo20343j(int i);
}
