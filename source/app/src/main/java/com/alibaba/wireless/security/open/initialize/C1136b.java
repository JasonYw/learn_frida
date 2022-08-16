package com.alibaba.wireless.security.open.initialize;

import android.content.Context;
import com.alibaba.wireless.security.framework.C1123d;
import com.alibaba.wireless.security.framework.ISGPluginManager;
import com.alibaba.wireless.security.framework.utils.C1127a;
import com.alibaba.wireless.security.open.SecException;
import com.alibaba.wireless.security.open.initialize.IInitializeComponent;
import com.bytedance.covode.number.Covode;
import com.p3021tt.miniapp.debug.devtool.BdpDebugHttpRequest;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.alibaba.wireless.security.open.initialize.b */
/* loaded from: classes2.dex */
public class C1136b {

    /* renamed from: a */
    public boolean f21837a;

    /* renamed from: b */
    public Set<IInitializeComponent.IInitFinishListener> f21838b;

    /* renamed from: c */
    public Object f21839c;

    /* renamed from: d */
    public String f21840d;

    /* renamed from: e */
    public ISGPluginManager f21841e;

    static {
        Covode.recordClassIndex(4576);
    }

    public C1136b() {
        this.f21838b = new HashSet();
        this.f21839c = new Object();
        this.f21840d = null;
        this.f21841e = null;
        this.f21837a = false;
    }

    public C1136b(String str) {
        this.f21838b = new HashSet();
        this.f21839c = new Object();
        this.f21840d = null;
        this.f21841e = null;
        this.f21837a = false;
        this.f21840d = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m19677b() {
        synchronized (this.f21839c) {
            for (IInitializeComponent.IInitFinishListener iInitFinishListener : this.f21838b) {
                iInitFinishListener.onSuccess();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public void m19673c() {
        synchronized (this.f21839c) {
            for (IInitializeComponent.IInitFinishListener iInitFinishListener : this.f21838b) {
                iInitFinishListener.onError();
            }
        }
    }

    /* renamed from: a */
    public synchronized int m19680a(Context context, String str, boolean z, boolean z2) {
        if (!this.f21837a) {
            if (context == null) {
                throw new SecException(BdpDebugHttpRequest.HTTP_SWITCHING_PROTOCOLS);
            }
            long m19714b = C1127a.m19714b();
            C1123d c1123d = new C1123d();
            c1123d.m19753a(context, this.f21840d, str, z, new Object[0]);
            c1123d.getPluginInfo(c1123d.getMainPluginName());
            C1127a.m19716a("main", "getInstance", "", m19714b);
            this.f21841e = c1123d;
            this.f21837a = true;
        }
        return this.f21837a ? 0 : 1;
    }

    /* renamed from: a */
    public ISGPluginManager m19682a() {
        return this.f21841e;
    }

    /* renamed from: a */
    public void m19679a(IInitializeComponent.IInitFinishListener iInitFinishListener) {
        if (iInitFinishListener != null) {
            synchronized (this.f21839c) {
                this.f21838b.add(iInitFinishListener);
            }
        }
    }

    /* renamed from: a */
    public boolean m19681a(Context context) {
        return true;
    }

    /* renamed from: b */
    public void m19676b(final Context context, final String str, final boolean z, final boolean z2) {
        if (context != null) {
            new Thread(new Runnable() { // from class: com.alibaba.wireless.security.open.initialize.b.1
                static {
                    Covode.recordClassIndex(4577);
                }

                @Override // java.lang.Runnable
                public void run() {
                    try {
                        C1136b.this.m19680a(context, str, z, z2);
                        C1136b.this.m19677b();
                    } catch (SecException e) {
                        e.printStackTrace();
                        C1136b.this.m19673c();
                    }
                }
            }).start();
            return;
        }
        throw new SecException(BdpDebugHttpRequest.HTTP_SWITCHING_PROTOCOLS);
    }

    /* renamed from: b */
    public void m19675b(IInitializeComponent.IInitFinishListener iInitFinishListener) {
        if (iInitFinishListener != null) {
            synchronized (this.f21839c) {
                this.f21838b.remove(iInitFinishListener);
            }
        }
    }
}
