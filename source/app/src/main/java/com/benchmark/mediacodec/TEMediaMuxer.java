package com.benchmark.mediacodec;

import android.media.MediaFormat;
import android.media.MediaMuxer;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.io.IOException;
import p003X.C108306Ske;
import p003X.C108316Sko;

/* loaded from: classes10.dex */
public final class TEMediaMuxer {
    public static ChangeQuickRedirect LIZ;
    public MediaMuxer LIZIZ;
    public int LIZJ;
    public boolean LIZLLL;

    /* renamed from: LJ */
    public MuxerStatus f25583LJ = MuxerStatus.UNSET;
    public String LJFF;

    static {
        Covode.recordClassIndex(9684);
    }

    /* loaded from: classes10.dex */
    public enum MuxerStatus {
        UNSET,
        INITED,
        STARTED,
        STOPED,
        RELEASED;
        
        public static ChangeQuickRedirect changeQuickRedirect;

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static MuxerStatus[] valuesCustom() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
            if (proxy.isSupported) {
                return (MuxerStatus[]) proxy.result;
            }
            return (MuxerStatus[]) values().clone();
        }

        static {
            Covode.recordClassIndex(9685);
        }

        public static MuxerStatus valueOf(String str) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
            if (proxy.isSupported) {
                return (MuxerStatus) proxy.result;
            }
            return (MuxerStatus) Enum.valueOf(MuxerStatus.class, str);
        }
    }

    public final void LIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 3).isSupported) {
            return;
        }
        if (this.f25583LJ != MuxerStatus.STARTED) {
            C108306Ske.LIZLLL("BXHwMuxer", "stop mediamuxer  with invalid status ,current status is " + this.f25583LJ);
            return;
        }
        this.LIZLLL = true;
        MediaMuxer mediaMuxer = this.LIZIZ;
        if (mediaMuxer != null) {
            mediaMuxer.stop();
        }
        this.f25583LJ = MuxerStatus.STOPED;
    }

    public final void LIZIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 4).isSupported) {
            return;
        }
        if (this.f25583LJ != MuxerStatus.UNSET && this.f25583LJ != MuxerStatus.RELEASED) {
            if (!this.LIZLLL && this.f25583LJ != MuxerStatus.STOPED) {
                LIZ();
            }
            MediaMuxer mediaMuxer = this.LIZIZ;
            if (mediaMuxer != null) {
                mediaMuxer.release();
                this.LIZIZ = null;
            }
            this.f25583LJ = MuxerStatus.UNSET;
            return;
        }
        C108306Ske.LIZLLL("BXHwMuxer", "stop mediamuxer  with invalid status ,current status is " + this.f25583LJ);
    }

    public final int LIZ(MediaFormat mediaFormat) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{mediaFormat}, this, LIZ, false, 1);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        if (this.f25583LJ != MuxerStatus.UNSET) {
            C108306Ske.LIZLLL("BXHwMuxer", "mediamuxer init failed,current status is " + this.f25583LJ);
            return C108316Sko.LJIILIIL;
        }
        try {
            this.LIZIZ = new MediaMuxer(this.LJFF, 0);
            this.LIZJ = this.LIZIZ.addTrack(mediaFormat);
            this.f25583LJ = MuxerStatus.INITED;
            return this.LIZJ;
        } catch (IOException unused) {
            C108306Ske.LIZLLL("BXHwMuxer", "MediaMuxer create fail");
            return C108316Sko.LIZLLL;
        }
    }

    public TEMediaMuxer(String str, TEMediaCodecEncoder tEMediaCodecEncoder) {
        this.LJFF = str;
    }
}
