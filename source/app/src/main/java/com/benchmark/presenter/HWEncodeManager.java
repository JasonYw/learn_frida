package com.benchmark.presenter;

import android.os.Build;
import com.benchmark.mediacodec.C2501g;
import com.benchmark.mediacodec.TEMediaCodecEncodeSettings;
import com.benchmark.mediacodec.TEMediaCodecEncoder;
import com.benchmark.mediacodec.TEMediaMuxer;
import com.benchmark.settings.HWEncoderStrategyWrapper;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import p002O.C0002O;
import p003X.C108306Ske;
import p003X.C108311Skj;
import p003X.C108312Skk;
import p003X.C108316Sko;
import p003X.C108317Skp;
import p003X.C108319Skr;
import p003X.C108874Sto;

/* loaded from: classes10.dex */
public class HWEncodeManager {
    public static ChangeQuickRedirect changeQuickRedirect;
    public TEMediaCodecEncoder mEncode;
    public int mFrameRate;
    public TEMediaMuxer mMuxer;
    public TEMediaCodecEncodeSettings mSettings;
    public HWEncoderStrategyWrapper mStrategy;
    public String mVideoOutputPath;
    public String mYUVPath;
    public FutureTask<Integer> muxerTask;
    public C108311Skj yuvTextureDrawer;
    public LinkedBlockingQueue<C2501g> mOutputFrames = new LinkedBlockingQueue<>();
    public boolean mStart = false;
    public volatile int encodeRet = 0;
    public int mNewFrameRate = 0;
    public int mChangeFPSIndex = 15;
    public HashMap<Long, C2501g> mInputFrames = new HashMap<>();
    public Runnable feedTask = new RunnableC25041();
    public Callable<Integer> muxerinnerTask = new Callable<Integer>() { // from class: com.benchmark.presenter.HWEncodeManager.2
        public static ChangeQuickRedirect LIZ;

        static {
            Covode.recordClassIndex(9719);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x017d, code lost:
            if (r15.LIZIZ.encodeRet != p003X.C108316Sko.LJIILJJIL) goto L45;
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x019a, code lost:
            r15.LIZIZ.mMuxer.LIZ();
            r15.LIZIZ.mMuxer.LIZIZ();
            r15.LIZIZ.mStart = false;
            r0 = java.lang.Integer.valueOf(r13);
            com.bytedance.frameworks.apm.trace.MethodCollector.m14707o(793);
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x01b3, code lost:
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x018c, code lost:
            r15.LIZIZ.mEncode.LIZIZ();
            r15.LIZIZ.mEncode.LIZLLL();
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x00bc, code lost:
            r6.presentationTimeUs = r8.f25584LJ;
            r6.offset = 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x00c4, code lost:
            if (r8.LJI == false) goto L52;
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:0x00c6, code lost:
            r6.flags |= 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x00cd, code lost:
            if (r8.LJII == false) goto L73;
         */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x00cf, code lost:
            r6.flags |= 4;
            r6.size = 0;
            r4.clear();
         */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x00da, code lost:
            r9 = r15.LIZIZ.mMuxer;
            r1 = com.bytedance.hotfix.PatchProxy.proxy(new java.lang.Object[]{r4, r6}, r9, com.benchmark.mediacodec.TEMediaMuxer.LIZ, false, 5);
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x00ed, code lost:
            if (r1.isSupported == false) goto L69;
         */
        /* JADX WARN: Code restructure failed: missing block: B:57:0x00ef, code lost:
            r13 = ((java.lang.Integer) r1.result).intValue();
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x0134, code lost:
            if (r13 >= 0) goto L59;
         */
        /* JADX WARN: Code restructure failed: missing block: B:60:0x013b, code lost:
            r15.LIZIZ.mOutputFrames.poll();
         */
        /* JADX WARN: Code restructure failed: missing block: B:61:0x0144, code lost:
            if (r8.LJII == false) goto L64;
         */
        /* JADX WARN: Code restructure failed: missing block: B:63:0x0146, code lost:
            r13 = p003X.C108316Sko.LIZ;
         */
        /* JADX WARN: Code restructure failed: missing block: B:67:0x0136, code lost:
            java.lang.Thread.sleep(50);
         */
        /* JADX WARN: Code restructure failed: missing block: B:70:0x0113, code lost:
            if (r9.f25583LJ == com.benchmark.mediacodec.TEMediaMuxer.MuxerStatus.STARTED) goto L72;
         */
        /* JADX WARN: Code restructure failed: missing block: B:71:0x0115, code lost:
            p003X.C108306Ske.LIZLLL("BXHwMuxer", "meidamuxer is not started,current status is " + r9.f25583LJ);
            r13 = p003X.C108316Sko.LJIILIIL;
         */
        /* JADX WARN: Code restructure failed: missing block: B:72:0x012b, code lost:
            r9.LIZIZ.writeSampleData(r9.LIZJ, r4, r6);
            r13 = p003X.C108316Sko.LIZ;
         */
        /* JADX WARN: Code restructure failed: missing block: B:73:0x00f8, code lost:
            r4.clear();
            r4.put(r8.LIZJ);
            r4.position(0);
            r4.limit(r8.LIZJ.length);
            r6.size = r8.LIZJ.length;
         */
        /* JADX WARN: Code restructure failed: missing block: B:84:0x018a, code lost:
            if (r15.LIZIZ.encodeRet == p003X.C108316Sko.LJIILJJIL) goto L43;
         */
        @Override // java.util.concurrent.Callable
        /* renamed from: LIZ */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Integer call() {
            /*
                Method dump skipped, instructions count: 481
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.benchmark.presenter.HWEncodeManager.CallableC25062.call():java.lang.Integer");
        }
    };

    static {
        Covode.recordClassIndex(9716);
    }

    public byte[] getCSData() {
        TEMediaCodecEncoder tEMediaCodecEncoder = this.mEncode;
        if (tEMediaCodecEncoder == null) {
            return new byte[1];
        }
        return tEMediaCodecEncoder.LJIJJ;
    }

    public long getFirstFrameCost() {
        TEMediaCodecEncoder tEMediaCodecEncoder = this.mEncode;
        if (tEMediaCodecEncoder == null) {
            return 0L;
        }
        return tEMediaCodecEncoder.LJIILLIIL;
    }

    public long getMediaCodecInitCost() {
        TEMediaCodecEncoder tEMediaCodecEncoder = this.mEncode;
        if (tEMediaCodecEncoder == null) {
            return 0L;
        }
        return tEMediaCodecEncoder.LJIILL;
    }

    public int getProfile() {
        TEMediaCodecEncoder tEMediaCodecEncoder = this.mEncode;
        if (tEMediaCodecEncoder == null) {
            return 0;
        }
        return tEMediaCodecEncoder.LJIILJJIL;
    }

    public int getHoardFrames() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 7);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        TEMediaCodecEncoder tEMediaCodecEncoder = this.mEncode;
        if (tEMediaCodecEncoder == null) {
            return 0;
        }
        return tEMediaCodecEncoder.LJIIL - tEMediaCodecEncoder.LJIIJJI;
    }

    public int init() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        this.mEncode = TEMediaCodecEncoder.LIZ(1);
        int LIZ = this.mEncode.LIZ(this.mSettings);
        this.mChangeFPSIndex = this.mSettings.getChangeFPSIndex();
        if (LIZ < 0) {
            return LIZ;
        }
        this.mMuxer = new TEMediaMuxer(this.mVideoOutputPath, this.mEncode);
        return 0;
    }

    public int getResult() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 5);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        try {
            int intValue = this.muxerTask.get().intValue();
            if (intValue != C108316Sko.LIZ && this.encodeRet != C108316Sko.LJIILJJIL) {
                this.encodeRet = intValue;
            }
            return this.encodeRet;
        } catch (InterruptedException e) {
            C108306Ske.LIZLLL("HWEncodeManager", C0002O.m25086C("thread wait is error: ", e.getMessage()));
            return -1;
        } catch (ExecutionException e2) {
            C108874Sto.LIZ(e2);
            C108306Ske.LIZLLL("HWEncodeManager", C0002O.m25086C("get muxer thread ret is error: ", e2.getMessage()));
            return -1;
        }
    }

    public int start() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 4);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        try {
            int LIZJ = this.mEncode.LIZJ();
            if (LIZJ == 0) {
                this.mStart = true;
                new Thread(this.feedTask).start();
                this.muxerTask = new FutureTask<>(this.muxerinnerTask);
                new Thread(this.muxerTask).start();
            }
            return LIZJ;
        } catch (Exception e) {
            C108874Sto.LIZ(e);
            C108306Ske.LIZLLL("HWEncodeManager", "start encode failed");
            return -218;
        }
    }

    /* renamed from: com.benchmark.presenter.HWEncodeManager$1 */
    /* loaded from: classes10.dex */
    public class RunnableC25041 implements Runnable {
        public static ChangeQuickRedirect LIZ;
        public int LIZIZ;
        public C108312Skk LIZJ;

        static {
            Covode.recordClassIndex(9717);
        }

        /* JADX WARN: Code restructure failed: missing block: B:31:0x00ce, code lost:
            if (((java.lang.Boolean) r1.result).booleanValue() == false) goto L32;
         */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void run() {
            /*
                Method dump skipped, instructions count: 1329
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.benchmark.presenter.HWEncodeManager.RunnableC25041.run():void");
        }

        public RunnableC25041() {
        }
    }

    private void changeFrameRate(int i) {
        this.mNewFrameRate = i;
    }

    public int initStrategyWrapper(long j) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{new Long(j)}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        this.mStrategy = new HWEncoderStrategyWrapper(j);
        this.mSettings = this.mStrategy.getSettings();
        this.mYUVPath = this.mStrategy.getYUVPath();
        this.mVideoOutputPath = this.mStrategy.getVideoOutputPath();
        if (this.mYUVPath != null && this.mVideoOutputPath != null) {
            return 0;
        }
        return -205;
    }

    public void setParams(int i, int i2) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 6).isSupported) {
            return;
        }
        if (i == 303 && i2 > 0) {
            changeFrameRate(i2);
        } else {
            this.mEncode.LIZ(i, i2);
        }
    }

    public int init(String str, String str2, C108319Skr c108319Skr) {
        String str3;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, str2, c108319Skr}, this, changeQuickRedirect, false, 3);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        C108317Skp c108317Skp = new C108317Skp();
        if (c108319Skr.LIZ) {
            str3 = "video/hevc";
        } else {
            str3 = "video/avc";
        }
        c108317Skp.LIZ.mMimeType = str3;
        c108317Skp.LIZ.mInputColorFormat = c108319Skr.LIZIZ;
        c108317Skp.LIZ.mFrameRate = 30;
        c108317Skp.LIZ.mIFrameInternal = 1;
        c108317Skp.LIZ.mBitRate = 4000000;
        c108317Skp.LIZ.mBitRateMode = 1;
        c108317Skp.LIZ.mWidth = 720;
        c108317Skp.LIZ.mHeight = 1280;
        if (c108319Skr.LIZ) {
            c108317Skp.LIZ(1);
        } else if (Build.VERSION.SDK_INT > 25) {
            c108317Skp.LIZ(8);
        } else {
            c108317Skp.LIZ(1);
        }
        this.mSettings = c108317Skp.LIZ;
        this.mYUVPath = str;
        this.mEncode = TEMediaCodecEncoder.LIZ(1);
        int LIZ = this.mEncode.LIZ(this.mSettings);
        if (LIZ < 0) {
            return LIZ;
        }
        this.mMuxer = new TEMediaMuxer(str2, this.mEncode);
        return 0;
    }
}
