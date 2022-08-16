package com.bytedance.android.annie.websocket;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.frameworks.baselib.network.http.cronet.websocket.IWsClient;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.internal.Intrinsics;
import p003X.C106862S5w;
import p003X.PTN;
import p003X.QZF;
import p003X.QZG;
import p003X.QZH;
import p003X.QZJ;
import p003X.QZS;
import p003X.QZY;

/* renamed from: com.bytedance.android.annie.websocket.d */
/* loaded from: classes8.dex */
public final class C2649d {
    public static ChangeQuickRedirect LIZ;
    public static final PTN LIZJ = new PTN((byte) 0);
    public static final HashMap<String, HashMap<String, ? super AbstractC2648b>> LIZLLL = new HashMap<>();
    public static final Lazy LIZIZ = LazyKt__LazyJVMKt.lazy(SocketManager$Companion$instance$2.INSTANCE);

    public C2649d() {
    }

    static {
        Covode.recordClassIndex(11255);
    }

    public /* synthetic */ C2649d(byte b) {
        this();
    }

    public final String LIZ(String str, String str2) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, str2}, this, LIZ, false, 4);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        C106862S5w.LIZ(str);
        List<AbstractC2648b> LIZIZ2 = LIZIZ(str, str2);
        if (LIZIZ2 != null) {
            for (AbstractC2648b abstractC2648b : LIZIZ2) {
                abstractC2648b.LIZIZ();
            }
            return null;
        } else if (str2 != null) {
            return "The socketTaskID doesn't exist";
        } else {
            return "The containerID doesn't exist";
        }
    }

    public final void LIZJ(String str, String str2) {
        MethodCollector.m14708i(966);
        if (PatchProxy.proxy(new Object[]{str, str2}, this, LIZ, false, 8).isSupported) {
            MethodCollector.m14707o(966);
            return;
        }
        synchronized (LIZLLL) {
            try {
                HashMap<String, ? super AbstractC2648b> hashMap = LIZLLL.get(str);
                if (hashMap != null) {
                    hashMap.remove(str2);
                }
                HashMap<String, ? super AbstractC2648b> hashMap2 = LIZLLL.get(str);
                if (hashMap2 != null && hashMap2.isEmpty()) {
                    LIZLLL.remove(str);
                }
            } catch (Throwable th) {
                MethodCollector.m14707o(966);
                throw th;
            }
        }
        MethodCollector.m14707o(966);
    }

    public final List<AbstractC2648b> LIZIZ(String str, String str2) {
        MethodCollector.m14708i(965);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, str2}, this, LIZ, false, 7);
        if (proxy.isSupported) {
            List<AbstractC2648b> list = (List) proxy.result;
            MethodCollector.m14707o(965);
            return list;
        }
        synchronized (LIZLLL) {
            try {
                ArrayList arrayList = new ArrayList();
                if (str2 != null) {
                    HashMap<String, ? super AbstractC2648b> hashMap = LIZLLL.get(str);
                    if (hashMap != null) {
                        AbstractC2648b abstractC2648b = hashMap.get(str2);
                        if (abstractC2648b != null) {
                            arrayList.add(abstractC2648b);
                        } else {
                            NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type com.bytedance.android.annie.websocket.IWebSocketTask");
                            MethodCollector.m14707o(965);
                            throw nullPointerException;
                        }
                    } else {
                        MethodCollector.m14707o(965);
                        return null;
                    }
                } else {
                    HashMap<String, ? super AbstractC2648b> hashMap2 = LIZLLL.get(str);
                    if (hashMap2 != null) {
                        for (AbstractC2648b abstractC2648b2 : hashMap2.values()) {
                            if (abstractC2648b2 != null) {
                                arrayList.add(abstractC2648b2);
                            } else {
                                NullPointerException nullPointerException2 = new NullPointerException("null cannot be cast to non-null type com.bytedance.android.annie.websocket.IWebSocketTask");
                                MethodCollector.m14707o(965);
                                throw nullPointerException2;
                            }
                        }
                    } else {
                        MethodCollector.m14707o(965);
                        return null;
                    }
                }
                MethodCollector.m14707o(965);
                return arrayList;
            } catch (Throwable th) {
                MethodCollector.m14707o(965);
                throw th;
            }
        }
    }

    public final String LIZ(Context context, String str, QZG qzg, e$a e_a) {
        QZF qzf;
        String uuid;
        QZJ qzy;
        MethodCollector.m14708i(964);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{context, str, qzg, e_a}, this, LIZ, false, 1);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        C106862S5w.LIZ(context, str, qzg, e_a);
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{context, qzg}, QZF.LJFF, QZH.LIZ, false, 1);
        if (proxy2.isSupported) {
            qzf = (QZF) proxy2.result;
        } else {
            C106862S5w.LIZ(context, qzg);
            qzf = new QZF(context, qzg);
            IWsClient LIZ2 = QZS.LJI.LIZ(qzf);
            if (LIZ2 != null) {
                qzf.f11135LJ = LIZ2;
            } else {
                qzf = null;
            }
        }
        if (qzf == null) {
            return null;
        }
        PatchProxyResult proxy3 = PatchProxy.proxy(new Object[0], this, LIZ, false, 6);
        if (proxy3.isSupported) {
            uuid = (String) proxy3.result;
        } else {
            uuid = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "");
        }
        PatchProxyResult proxy4 = PatchProxy.proxy(new Object[]{str, uuid, e_a}, this, LIZ, false, 5);
        if (proxy4.isSupported) {
            qzy = (QZJ) proxy4.result;
        } else {
            qzy = new QZY(this, str, uuid, e_a);
        }
        qzf.LIZ(qzy);
        synchronized (LIZLLL) {
            try {
                if (LIZLLL.containsKey(str)) {
                    HashMap<String, ? super AbstractC2648b> hashMap = LIZLLL.get(str);
                    if (hashMap != null) {
                        hashMap.put(uuid, qzf);
                    }
                } else {
                    HashMap<String, HashMap<String, ? super AbstractC2648b>> hashMap2 = LIZLLL;
                    HashMap<String, ? super AbstractC2648b> hashMap3 = new HashMap<>();
                    hashMap3.put(uuid, qzf);
                    hashMap2.put(str, hashMap3);
                }
            } finally {
                MethodCollector.m14707o(964);
            }
        }
        qzf.LIZ();
        return uuid;
    }
}
