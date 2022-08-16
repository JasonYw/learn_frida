package android.p006ss.com.vboost.request;

import android.p006ss.com.vboost.CapabilityType;
import android.p006ss.com.vboost.CoreCluster;
import android.p006ss.com.vboost.CustomRequest;
import android.p006ss.com.vboost.CustomScene;
import android.p006ss.com.vboost.FrequencyLevel;
import android.p006ss.com.vboost.NetParam;
import android.p006ss.com.vboost.VibratorParam;
import android.p006ss.com.vboost.provider.C0118h;
import androidx.core.view.MotionEventCompat;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.p3021tt.miniapp.debug.devtool.BdpDebugHttpRequest;
import p003X.C144239eTJ;
import p003X.C144244eTO;
import p003X.C144260eTe;
import p003X.CallableC144247eTR;

/* renamed from: android.ss.com.vboost.request.c */
/* loaded from: classes19.dex */
public class C0119c implements Comparable {
    public static ChangeQuickRedirect LIZ;
    public static final String LJIJJLI = C0119c.class.getSimpleName();
    public CapabilityType LIZIZ;
    public FrequencyLevel LIZJ;
    public long LIZLLL;

    /* renamed from: LJ */
    public int f20185LJ;
    public int LJFF;
    public CoreCluster LJI;
    public CustomScene LJII;
    public VibratorParam LJIIIIZZ;
    public NetParam LJIIIZ;
    public boolean LJIIJ;
    public boolean LJIIJJI;
    public TimeoutStrategy LJIIL;
    public NotifyStrategy LJIILIIL;
    public long LJIILJJIL;
    public UpdateStrategy LJIILL;
    public C144260eTe LJIILLIIL;
    public long LJIIZILJ;
    public CallableC144247eTR LJIJ;
    public CustomRequest LJIJI;
    public C0118h LJIJJ;

    static {
        Covode.recordClassIndex(BdpDebugHttpRequest.HTTP_SWITCHING_PROTOCOLS);
    }

    public final long LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        if (proxy.isSupported) {
            return ((Long) proxy.result).longValue();
        }
        long j = this.LIZLLL - (this.LJIIZILJ - this.LJIILJJIL);
        String str = LJIJJLI;
        C144239eTJ.LIZ(str, "real timeout:" + j);
        return j;
    }

    public String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        return "Request{type=" + this.LIZIZ + ", level=" + this.LIZJ + ", timeout=" + this.LIZLLL + ", tid=" + this.f20185LJ + ", priority=" + this.LJFF + ", cluster=" + this.LJI + ", timeoutStrategy=" + this.LJIIL + ", createTime=" + this.LJIILJJIL + ", updateStrategy=" + this.LJIILL + ", info=" + this.LJIILLIIL + ", commitTime=" + this.LJIIZILJ + ", task=" + this.LJIJ + '}';
    }

    public C0119c(CapabilityType capabilityType) {
        this.LIZIZ = capabilityType;
        if (!PatchProxy.proxy(new Object[]{capabilityType}, this, LIZ, false, 3).isSupported) {
            switch (C144244eTO.LIZ[capabilityType.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 18:
                    this.LJIILL = UpdateStrategy.FIFO;
                    break;
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                    this.LJIILL = UpdateStrategy.SMALL;
                    break;
                case 13:
                case 14:
                case MotionEventCompat.AXIS_HAT_X /* 15 */:
                case 16:
                case MotionEventCompat.AXIS_LTRIGGER /* 17 */:
                    this.LJIILL = UpdateStrategy.LAGER;
                    break;
            }
        }
        if (!PatchProxy.proxy(new Object[]{capabilityType}, this, LIZ, false, 2).isSupported) {
            switch (C144244eTO.LIZ[capabilityType.ordinal()]) {
                case 1:
                case 2:
                    this.LJIIL = TimeoutStrategy.ONE_TIME;
                    break;
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    this.LJIIL = TimeoutStrategy.USER_CANCEL;
                    break;
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case MotionEventCompat.AXIS_HAT_X /* 15 */:
                case 16:
                case MotionEventCompat.AXIS_LTRIGGER /* 17 */:
                    this.LJIIL = TimeoutStrategy.USE_OURS;
                    break;
            }
        }
        long currentTimeMillis = System.currentTimeMillis();
        this.LJIIZILJ = currentTimeMillis;
        this.LJIILJJIL = currentTimeMillis;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0042, code lost:
        if (r1 == r3) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0044, code lost:
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0063, code lost:
        if (r1 == r3) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x009c, code lost:
        if (r3 == r1) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00dc, code lost:
        if (r1 == r3) goto L17;
     */
    @Override // java.lang.Comparable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int compareTo(java.lang.Object r7) {
        /*
            Method dump skipped, instructions count: 236
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.p006ss.com.vboost.request.C0119c.compareTo(java.lang.Object):int");
    }
}
