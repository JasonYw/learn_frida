package com.bytedance.android.live.broadcast.download;

import com.bytedance.android.live.broadcast.api.gamepromote.p256a.AbstractC2889a;
import com.bytedance.covode.number.Covode;
import com.bytedance.framwork.core.sdkmonitor.SDKMonitor;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.random.Random;
import p002O.C0002O;
import p003X.C106862S5w;
import p003X.C89121L9n;
import p003X.C89206LCu;
import p003X.C89255LEr;

/* loaded from: classes5.dex */
public final class GameCenterStrategy$subscribe$1$onStateChanged$3 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ long $currentBytes;
    public final /* synthetic */ long $totalBytes;
    public final /* synthetic */ C89255LEr this$0;

    static {
        Covode.recordClassIndex(15520);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GameCenterStrategy$subscribe$1$onStateChanged$3(C89255LEr c89255LEr, long j, long j2) {
        super(0);
        this.this$0 = c89255LEr;
        this.$currentBytes = j;
        this.$totalBytes = j2;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        double d;
        long j;
        long j2;
        String str;
        C89121L9n c89121L9n;
        double d2;
        String str2;
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            long currentTimeMillis = System.currentTimeMillis();
            C89206LCu c89206LCu = C89206LCu.LIZIZ;
            long j3 = this.$currentBytes;
            long j4 = this.$totalBytes;
            C3002c c3002c = this.this$0.LIZJ;
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{new Long(j3), new Long(j4), c3002c}, c89206LCu, C89206LCu.LIZ, false, 3);
            if (proxy.isSupported) {
                c89121L9n = (C89121L9n) proxy.result;
            } else {
                int i = (int) ((((float) j3) * 100.0f) / ((float) j4));
                if (i > 100) {
                    i = 100;
                }
                double d3 = 1.5d;
                if (i >= 0 && 50 >= i) {
                    d = i * 1.5d;
                } else {
                    d = (i * 0.5d) + 50.0d;
                }
                int i2 = (int) d;
                long j5 = 0;
                if (c3002c != null) {
                    j = c3002c.LJJIJLIJ;
                } else {
                    j = 0;
                }
                long currentTimeMillis2 = System.currentTimeMillis();
                if (c3002c != null) {
                    j2 = c3002c.LJJIL;
                } else {
                    j2 = 0;
                }
                long j6 = j3 - j;
                long j7 = currentTimeMillis2 - j2;
                String str3 = "0Kb/s";
                if (j6 != 0 && j7 != 0 && j2 != 0) {
                    float f = ((((float) j6) / 1024.0f) * 1000.0f) / ((float) j7);
                    if (i >= 0 && 50 >= i) {
                        d2 = f;
                    } else {
                        d2 = f;
                        d3 = 0.5d;
                    }
                    float f2 = (float) (d2 * d3);
                    int nextInt = Random.Default.nextInt(300) + SDKMonitor.SDK_VERSION;
                    if (c3002c != null) {
                        j5 = c3002c.LJJJ;
                    }
                    if (currentTimeMillis2 - j5 > nextInt) {
                        if (f > 1024.0f) {
                            new StringBuilder();
                            String format = String.format("%.2f", Arrays.copyOf(new Object[]{Float.valueOf(f / 1024.0f)}, 1));
                            Intrinsics.checkNotNullExpressionValue(format, "");
                            str3 = C0002O.m25086C(format, "Mb/s");
                        } else {
                            new StringBuilder();
                            String format2 = String.format("%.2f", Arrays.copyOf(new Object[]{Float.valueOf(f)}, 1));
                            Intrinsics.checkNotNullExpressionValue(format2, "");
                            str3 = C0002O.m25086C(format2, "Kb/s");
                        }
                        if (c3002c != null) {
                            c3002c.LJJJ = currentTimeMillis2;
                            if (!PatchProxy.proxy(new Object[]{str3}, c3002c, C3002c.LIZ, false, 4).isSupported) {
                                C106862S5w.LIZ(str3);
                                c3002c.LJJIZ = str3;
                            }
                        }
                    } else {
                        if (c3002c == null || (str2 = c3002c.LJJIZ) == null) {
                            str2 = str3;
                        }
                        str3 = str2;
                    }
                    if (f2 > 1024.0f) {
                        new StringBuilder();
                        String format3 = String.format("%.2f", Arrays.copyOf(new Object[]{Float.valueOf(f2 / 1024.0f)}, 1));
                        Intrinsics.checkNotNullExpressionValue(format3, "");
                        str = C0002O.m25086C(format3, "Mb/s");
                    } else {
                        new StringBuilder();
                        String format4 = String.format("%.2f", Arrays.copyOf(new Object[]{Float.valueOf(f2)}, 1));
                        Intrinsics.checkNotNullExpressionValue(format4, "");
                        str = C0002O.m25086C(format4, "Kb/s");
                    }
                } else {
                    str = str3;
                }
                c89121L9n = new C89121L9n(i, str3, i2, str);
            }
            C3002c c3002c2 = this.this$0.LIZJ;
            if (c3002c2 != null) {
                c3002c2.LJJIJLIJ = this.$currentBytes;
            }
            C3002c c3002c3 = this.this$0.LIZJ;
            if (c3002c3 != null) {
                c3002c3.LJJIL = currentTimeMillis;
            }
            AbstractC2889a abstractC2889a = this.this$0.LIZLLL;
            if (abstractC2889a != null) {
                abstractC2889a.LIZ(c89121L9n);
            }
        }
        return Unit.INSTANCE;
    }
}
