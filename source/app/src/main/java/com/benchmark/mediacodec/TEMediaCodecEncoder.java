package com.benchmark.mediacodec;

import android.media.Image;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Surface;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.nio.ByteBuffer;
import java.util.concurrent.LinkedBlockingQueue;
import p002O.C0002O;
import p003X.AbstractC108320Sks;
import p003X.C108281SkF;
import p003X.C108306Ske;
import p003X.C108313Skl;
import p003X.C108315Skn;
import p003X.C108316Sko;
import p003X.C108318Skq;
import p003X.C108321Skt;

/* loaded from: classes10.dex */
public abstract class TEMediaCodecEncoder {
    public static ChangeQuickRedirect LIZLLL;
    public int LIZ;
    public int LIZIZ;

    /* renamed from: LJ */
    public TEMediaCodecEncodeSettings f25582LJ;
    public MediaCodec LJFF;
    public MediaFormat LJI;
    public Surface LJII;
    public AbstractC108320Sks LJIIIIZZ;
    public int LJIIJJI;
    public int LJIIL;
    public boolean LJIILIIL;
    public byte[] LJIJJ;
    public int LJIILJJIL = -1;
    public long LJIILL = -1;
    public long LJIILLIIL = -1;
    public long LJIIZILJ = -1;
    public LinkedBlockingQueue<Long> LJIJ = new LinkedBlockingQueue<>();
    public volatile EncoderStatus LJIJI = EncoderStatus.UNSET;
    public HandlerThread LJIIIZ = new HandlerThread("TECodecEncoder");
    public Handler LJIIJ = new Handler(this.LJIIIZ.getLooper(), new C108315Skn(this));

    static {
        Covode.recordClassIndex(9679);
    }

    public abstract int LIZ();

    public abstract int LIZ(C2501g c2501g);

    /* loaded from: classes10.dex */
    public enum EncoderStatus {
        UNSET,
        INITED,
        STARTED,
        STOPPED,
        RELEASED;
        
        public static ChangeQuickRedirect changeQuickRedirect;

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static EncoderStatus[] valuesCustom() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
            if (proxy.isSupported) {
                return (EncoderStatus[]) proxy.result;
            }
            return (EncoderStatus[]) values().clone();
        }

        static {
            Covode.recordClassIndex(9680);
        }

        public static EncoderStatus valueOf(String str) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
            if (proxy.isSupported) {
                return (EncoderStatus) proxy.result;
            }
            return (EncoderStatus) Enum.valueOf(EncoderStatus.class, str);
        }
    }

    public int LIZIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZLLL, false, 4);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        LJFF();
        return C108316Sko.LIZ;
    }

    public final int LIZJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZLLL, false, 3);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        return m15999LJ();
    }

    public TEMediaCodecEncoder() {
        this.LJIIIZ.start();
    }

    public final int LIZLLL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZLLL, false, 5);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        LJI();
        int i = Build.VERSION.SDK_INT;
        this.LJIIIZ.quitSafely();
        this.LJIIJ = null;
        this.LJIIIZ = null;
        this.LJIIJJI = 0;
        this.LJIIL = 0;
        this.LJIJJ = null;
        this.LJI = null;
        this.LJIJI = EncoderStatus.UNSET;
        return C108316Sko.LIZ;
    }

    /* renamed from: LJ */
    public final int m15999LJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZLLL, false, 11);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        if (this.LJIJI != EncoderStatus.INITED) {
            C108306Ske.LIZLLL("BXMediaCodecEncoder", "Start encode with invalid status. Current status: " + this.LJIJI);
            return C108316Sko.LJIILIIL;
        }
        C108306Ske.LIZ("BXMediaCodecEncoder", "start encode...");
        this.LJFF.start();
        this.LJIJI = EncoderStatus.STARTED;
        return C108316Sko.LIZ;
    }

    public final int LJFF() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZLLL, false, 12);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        if (this.LJIJI != EncoderStatus.STARTED) {
            C108306Ske.LIZLLL("BXMediaCodecEncoder", "Start encode with invalid status. Current status: " + this.LJIJI);
            return C108316Sko.LJIILIIL;
        }
        C108306Ske.LIZ("BXMediaCodecEncoder", "stop encode...");
        int i = C108316Sko.LIZ;
        this.LJIJI = EncoderStatus.STOPPED;
        MediaCodec mediaCodec = this.LJFF;
        if (mediaCodec != null) {
            mediaCodec.stop();
        }
        return i;
    }

    public final void LJI() {
        if (PatchProxy.proxy(new Object[0], this, LIZLLL, false, 13).isSupported) {
            return;
        }
        if (this.LJIJI != EncoderStatus.UNSET && this.LJIJI != EncoderStatus.RELEASED) {
            C108306Ske.LIZ("BXMediaCodecEncoder", "release encoder...");
            if (this.LJIJI != EncoderStatus.STOPPED) {
                LIZIZ();
            }
            Surface surface = this.LJII;
            if (surface != null) {
                surface.release();
                this.LJII = null;
            }
            MediaCodec mediaCodec = this.LJFF;
            if (mediaCodec != null) {
                mediaCodec.release();
            }
            this.f25582LJ = null;
            this.LJFF = null;
            return;
        }
        C108306Ske.LIZLLL("BXMediaCodecEncoder", "Start encode with invalid status. Current status: " + this.LJIJI);
    }

    private int LJII() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZLLL, false, 14);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        if (this.LJIJI != EncoderStatus.UNSET) {
            return C108316Sko.LJIILIIL;
        }
        String mimeType = this.f25582LJ.getMimeType();
        MediaCodecInfo mediaCodecInfo = null;
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{mimeType}, null, C108281SkF.LIZ, true, 1);
        if (proxy2.isSupported) {
            mediaCodecInfo = (MediaCodecInfo) proxy2.result;
        } else {
            PatchProxyResult proxy3 = PatchProxy.proxy(new Object[]{mimeType}, null, C108281SkF.LIZ, true, 3);
            if (proxy3.isSupported) {
                mediaCodecInfo = (MediaCodecInfo) proxy3.result;
            } else {
                MediaCodecInfo[] codecInfos = new MediaCodecList(1).getCodecInfos();
                if (codecInfos != null && codecInfos.length != 0) {
                    int length = codecInfos.length;
                    int i = 0;
                    loop0: while (true) {
                        if (i >= length) {
                            break;
                        }
                        MediaCodecInfo mediaCodecInfo2 = codecInfos[i];
                        C108306Ske.LIZ("codec info name: ", mediaCodecInfo2.getName());
                        if (mediaCodecInfo2.isEncoder()) {
                            String name = mediaCodecInfo2.getName();
                            if (!name.startsWith("OMX.google.") && !name.startsWith("OMX.Nvidia.") && !name.equals("OMX.TI.DUCATI1.VIDEO.H264E")) {
                                String[] supportedTypes = mediaCodecInfo2.getSupportedTypes();
                                for (int i2 = 0; i2 < supportedTypes.length; i2++) {
                                    C108306Ske.LIZ("codec name: ", supportedTypes[i2]);
                                    if (supportedTypes[i2].equalsIgnoreCase(mimeType)) {
                                        mediaCodecInfo = mediaCodecInfo2;
                                        break loop0;
                                    }
                                }
                                continue;
                            }
                        }
                        i++;
                    }
                }
            }
        }
        if (mediaCodecInfo == null) {
            C108306Ske.LIZLLL("BXMediaCodecEncoder", "No invalid codec!");
            return C108316Sko.LJI;
        } else if (LIZ(mediaCodecInfo) != C108316Sko.LIZ) {
            return C108316Sko.LJI;
        } else {
            try {
                this.LJFF = MediaCodec.createEncoderByType(this.f25582LJ.getMimeType());
                String name2 = this.LJFF.getCodecInfo().getName();
                if (!name2.equals(mediaCodecInfo.getName())) {
                    C108306Ske.LIZJ("BXMediaCodecEncoder", C0002O.m25084C("Don't find proper codec, find: ", name2, "; require: ", mediaCodecInfo.getName()));
                    if (!name2.startsWith("OMX.google.")) {
                        C108306Ske.LIZJ("BXMediaCodecEncoder", C0002O.m25086C("Update codec: ", name2));
                    } else {
                        return C108316Sko.LJII;
                    }
                } else {
                    C108306Ske.LIZ("BXMediaCodecEncoder", C0002O.m25086C("Create codec: ", name2));
                }
                return C108316Sko.LIZ;
            } catch (Exception e) {
                C108306Ske.LIZLLL("BXMediaCodecEncoder", C0002O.m25086C("createByCodecName throw exception: ", e.toString()));
                return C108316Sko.LJI;
            }
        }
    }

    public static TEMediaCodecEncoder LIZ(int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{1}, null, LIZLLL, true, 1);
        if (proxy.isSupported) {
            return (TEMediaCodecEncoder) proxy.result;
        }
        return new C108313Skl();
    }

    private int LIZ(MediaCodecInfo mediaCodecInfo) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{mediaCodecInfo}, this, LIZLLL, false, 16);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(this.f25582LJ.getMimeType());
        if (capabilitiesForType.colorFormats == null) {
            return C108316Sko.LJIIIIZZ;
        }
        for (int i = 0; i < capabilitiesForType.colorFormats.length; i++) {
            C108306Ske.LIZIZ("BXMediaCodecEncoder", "support color format: " + capabilitiesForType.colorFormats[i]);
            if (capabilitiesForType.colorFormats[i] == this.f25582LJ.getInputColorFormat()) {
                return C108316Sko.LIZ;
            }
        }
        return C108316Sko.LIZLLL;
    }

    public final int LIZ(TEMediaCodecEncodeSettings tEMediaCodecEncodeSettings) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{tEMediaCodecEncodeSettings}, this, LIZLLL, false, 2);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        int i = Build.VERSION.SDK_INT;
        if (tEMediaCodecEncodeSettings.getBitRateMode() >= 0 && tEMediaCodecEncodeSettings.getBitRateMode() <= 2) {
            if (tEMediaCodecEncodeSettings.getWidth() > 0 && tEMediaCodecEncodeSettings.getHeight() > 0) {
                Message message = new Message();
                message.what = 1;
                ConditionVariable conditionVariable = new ConditionVariable();
                conditionVariable.close();
                message.obj = new C108318Skq(tEMediaCodecEncodeSettings, conditionVariable);
                this.LJIIJ.sendMessage(message);
                if (!conditionVariable.block(500000L)) {
                    C108306Ske.LIZLLL("BXMediaCodecEncoder", "initEncoder timeout!!!!!");
                    return C108316Sko.LJI;
                } else if (this.LJIJI != EncoderStatus.INITED) {
                    return C108316Sko.LJI;
                } else {
                    return C108316Sko.LIZ;
                }
            }
            return C108316Sko.LJIIJ;
        }
        C108306Ske.LIZLLL("BXMediaCodecEncoder", "Do not support bitrate mode " + tEMediaCodecEncodeSettings.getBitRateMode());
        return C108316Sko.f12185LJ;
    }

    public final int LIZIZ(TEMediaCodecEncodeSettings tEMediaCodecEncodeSettings) {
        int LJII;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{tEMediaCodecEncodeSettings}, this, LIZLLL, false, 10);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        this.f25582LJ = tEMediaCodecEncodeSettings;
        long currentTimeMillis = System.currentTimeMillis();
        try {
            LJII = LJII();
        } catch (Exception unused) {
            this.LJIJI = EncoderStatus.UNSET;
        }
        if (LJII < 0) {
            C108306Ske.LIZLLL("BXMediaCodecEncoder", "create encoder fail : " + LJII);
            return LJII;
        }
        MediaCodecInfo.CodecCapabilities capabilitiesForType = this.LJFF.getCodecInfo().getCapabilitiesForType(this.f25582LJ.getMimeType());
        MediaFormat createVideoFormat = MediaFormat.createVideoFormat(this.f25582LJ.getMimeType(), this.f25582LJ.getWidth(), this.f25582LJ.getHeight());
        createVideoFormat.setInteger("color-format", this.f25582LJ.getInputColorFormat());
        createVideoFormat.setInteger("frame-rate", this.f25582LJ.getFrameRate());
        createVideoFormat.setInteger("i-frame-interval", this.f25582LJ.getIFrameInternal());
        createVideoFormat.setInteger("color-range", this.f25582LJ.getColorRange());
        createVideoFormat.setInteger("color-standard", this.f25582LJ.getColorStandard());
        createVideoFormat.setInteger("color-transfer", this.f25582LJ.getColorTransfer());
        if (this.f25582LJ.isOffBFrame()) {
            createVideoFormat.setInteger("max-bframes", 0);
        }
        MediaCodecInfo.CodecProfileLevel LIZ = LIZ(capabilitiesForType, this.f25582LJ.getEncodeProfile());
        if (LIZ != null) {
            createVideoFormat.setInteger("profile", LIZ.profile);
            createVideoFormat.setInteger("level", LIZ.level);
        } else {
            C108306Ske.LIZIZ("BXMediaCodecEncoder", "unsupport profile: " + this.f25582LJ.getEncodeProfile());
        }
        createVideoFormat.setInteger("bitrate", this.f25582LJ.getBitRate());
        int i = Build.VERSION.SDK_INT;
        if (capabilitiesForType.getEncoderCapabilities().isBitrateModeSupported(this.f25582LJ.getBitRateMode())) {
            createVideoFormat.setInteger("bitrate-mode", this.f25582LJ.getBitRateMode());
        } else {
            C108306Ske.LIZJ("BXMediaCodecEncoder", "codec does not support BitRateMode: " + this.f25582LJ.getBitRateMode());
        }
        C108306Ske.LIZ("BXMediaCodecEncoder", "initEncoder: format = " + createVideoFormat);
        int LIZ2 = LIZ();
        if (LIZ2 != C108316Sko.LIZ) {
            C108306Ske.LIZLLL("BXMediaCodecEncoder", "configRunningMode failed, ret = " + LIZ2);
            return LIZ2;
        }
        this.LJFF.configure(createVideoFormat, (Surface) null, (MediaCrypto) null, 1);
        this.LJIILL = System.currentTimeMillis() - currentTimeMillis;
        if (this.f25582LJ.useSurfaceInput()) {
            this.LJII = this.LJFF.createInputSurface();
        }
        this.LJIJI = EncoderStatus.INITED;
        return C108316Sko.LIZ;
    }

    public final int LIZIZ(C2501g c2501g) {
        int LIZ;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c2501g}, this, LIZLLL, false, 7);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        if (this.LJIJI != EncoderStatus.STARTED) {
            C108306Ske.LIZLLL("BXMediaCodecEncoder", "Cannot encode before starting encoder.");
            return C108316Sko.LJIILIIL;
        } else if (this.LJIIIIZZ == null) {
            C108306Ske.LIZLLL("BXMediaCodecEncoder", "encoder caller is null! Please set encoder callback.");
            return C108316Sko.LJIIL;
        } else if (!c2501g.LIZ() && !c2501g.LJII) {
            C108306Ske.LIZLLL("BXMediaCodecEncoder", c2501g.toString());
            return C108316Sko.f12185LJ;
        } else {
            int i = this.LIZ;
            if (i > 0 && i == this.LJIIJJI + 1) {
                Bundle bundle = new Bundle();
                bundle.putInt("request-sync", 0);
                this.LJFF.setParameters(bundle);
                this.LIZ = 0;
            }
            if (this.LIZIZ > 0 && this.LJIIJJI + 1 == 26) {
                Bundle bundle2 = new Bundle();
                bundle2.putInt("video-bitrate", this.LIZIZ);
                this.LJFF.setParameters(bundle2);
                this.LIZIZ = 0;
            }
            try {
                if (this.f25582LJ.useSurfaceInput()) {
                    PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{c2501g}, this, LIZLLL, false, 8);
                    if (proxy2.isSupported) {
                        LIZ = ((Integer) proxy2.result).intValue();
                    } else if (this.LJIJI != EncoderStatus.STARTED) {
                        LIZ = C108316Sko.LJIILIIL;
                    } else {
                        if (c2501g.LIZ()) {
                            this.LJIIIIZZ.LIZ(c2501g);
                        }
                        if (c2501g.LJII) {
                            C108306Ske.LIZ("BXMediaCodecEncoder", "signal end of stream...  pts: " + c2501g.f25584LJ);
                            this.LJFF.signalEndOfInputStream();
                        }
                        LIZ = C108316Sko.LIZ;
                    }
                } else {
                    LIZ = LIZ(c2501g);
                }
                if (c2501g.f25584LJ == 0) {
                    this.LJIIZILJ = System.currentTimeMillis();
                }
                if (LIZ == C108316Sko.LIZ) {
                    C108306Ske.LIZ("BXMediaCodecEncoder", "encode... " + c2501g + " index: " + this.LJIIJJI);
                    this.LJIIJJI = this.LJIIJJI + 1;
                    this.LJIJ.offer(Long.valueOf(c2501g.f25584LJ));
                    if (c2501g.LJII) {
                        this.LJIILIIL = true;
                    }
                }
                return LIZ;
            } catch (Exception e) {
                throw new TEMediaCodecException(e);
            }
        }
    }

    public final void LIZ(int i, int i2) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, LIZLLL, false, 19).isSupported || this.LJFF == null) {
            return;
        }
        try {
            if (i != 301) {
                if (i == 302) {
                    this.LIZ = i2;
                    return;
                }
                return;
            }
            this.LIZIZ = i2;
        } catch (Exception unused) {
            C108306Ske.LIZLLL("BXMediaCodecEncoder", "setParams error");
        }
    }

    public static MediaCodecInfo.CodecProfileLevel LIZ(MediaCodecInfo.CodecCapabilities codecCapabilities, int i) {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{codecCapabilities, Integer.valueOf(i)}, null, LIZLLL, true, 17);
        if (proxy.isSupported) {
            return (MediaCodecInfo.CodecProfileLevel) proxy.result;
        }
        if (Build.VERSION.SDK_INT < 24) {
            return null;
        }
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : codecCapabilities.profileLevels) {
            C108306Ske.LIZIZ("BXMediaCodecEncoder", "support profile: " + codecProfileLevel.profile);
            if (codecProfileLevel.profile == i) {
                return codecProfileLevel;
            }
        }
        return null;
    }

    public final int LIZ(C2501g c2501g, int i) {
        byte[] bArr;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c2501g, Integer.valueOf(i)}, this, LIZLLL, false, 15);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        if (this.LJIJI != EncoderStatus.STARTED) {
            return C108316Sko.LJIILIIL;
        }
        if (c2501g == null) {
            C108306Ske.LIZLLL("BXMediaCodecEncoder", "Frame is null, frame number: " + this.LJIIJJI);
            return C108316Sko.f12185LJ;
        }
        if (c2501g.LIZ()) {
            if (this.f25582LJ.getInputColorFormat() == C108321Skt.LIZ) {
                Image inputImage = this.LJFF.getInputImage(i);
                if (inputImage != null && inputImage.getPlanes()[1].getPixelStride() == 2) {
                    bArr = new byte[c2501g.LIZJ.length];
                    int i2 = 0;
                    for (int i3 = 0; i3 < this.f25582LJ.getHeight(); i3++) {
                        for (int i4 = 0; i4 < this.f25582LJ.getWidth(); i4++) {
                            bArr[i2] = c2501g.LIZJ[(this.f25582LJ.getWidth() * i3) + i4];
                            i2++;
                        }
                    }
                    for (int i5 = 0; i5 < this.f25582LJ.getHeight() / 4; i5++) {
                        for (int i6 = 0; i6 < this.f25582LJ.getWidth(); i6++) {
                            int width = (this.f25582LJ.getWidth() * this.f25582LJ.getHeight()) + (this.f25582LJ.getWidth() * i5) + i6;
                            bArr[i2] = c2501g.LIZJ[width];
                            bArr[i2 + 1] = c2501g.LIZJ[width + ((this.f25582LJ.getWidth() * this.f25582LJ.getHeight()) / 4)];
                            i2 += 2;
                        }
                    }
                } else {
                    bArr = c2501g.LIZJ;
                }
            } else {
                bArr = c2501g.LIZJ;
            }
            ByteBuffer inputBuffer = this.LJFF.getInputBuffer(i);
            inputBuffer.clear();
            inputBuffer.put(bArr);
            inputBuffer.position(0);
            inputBuffer.limit(bArr.length);
            this.LJFF.queueInputBuffer(i, 0, c2501g.LIZJ.length, c2501g.f25584LJ, 0);
        } else if (c2501g.LJII) {
            C108306Ske.LIZ("BXMediaCodecEncoder", "signal end of stream");
            this.LJFF.queueInputBuffer(i, 0, 0, c2501g.f25584LJ, 4);
        } else {
            C108306Ske.LIZLLL("BXMediaCodecEncoder", "invalid input frame: " + c2501g);
            return C108316Sko.f12185LJ;
        }
        return C108316Sko.LIZ;
    }

    public final void LIZ(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        boolean z;
        boolean z2 = false;
        if (PatchProxy.proxy(new Object[]{mediaCodec, Integer.valueOf(i), bufferInfo}, this, LIZLLL, false, 9).isSupported) {
            return;
        }
        if (this.LJIJI != EncoderStatus.STARTED) {
            C108306Ske.LIZJ("BXMediaCodecEncoder", "the mediaCodec status is not started ,the status is " + this.LJIJI);
        } else if ((bufferInfo.flags & 2) != 0) {
            ByteBuffer outputBuffer = mediaCodec.getOutputBuffer(i);
            outputBuffer.get(4);
            this.LJIJJ = new byte[bufferInfo.size];
            outputBuffer.position(bufferInfo.offset);
            outputBuffer.limit(bufferInfo.offset + bufferInfo.size);
            outputBuffer.get(this.LJIJJ);
            this.LJIILJJIL = this.LJIJJ[5];
            mediaCodec.releaseOutputBuffer(i, false);
        } else {
            C108306Ske.LIZ("BXMediaCodecEncoder", "output frame index: " + this.LJIIL);
            this.LJIIL = this.LJIIL + 1;
            if (this.LJIIL == 1) {
                this.LJIILLIIL = System.currentTimeMillis() - this.LJIIZILJ;
            }
            C2501g c2501g = new C2501g();
            ByteBuffer outputBuffer2 = mediaCodec.getOutputBuffer(i);
            outputBuffer2.position(bufferInfo.offset);
            outputBuffer2.limit(bufferInfo.offset + bufferInfo.size);
            if (bufferInfo.size > 0) {
                c2501g.LIZJ = new byte[bufferInfo.size];
                outputBuffer2.get(c2501g.LIZJ);
            } else if ((bufferInfo.flags & 4) == 0) {
                C108306Ske.LIZLLL("BXMediaCodecEncoder", "frame.mBufferInfo.size <= 0. size:" + bufferInfo.size);
            }
            mediaCodec.releaseOutputBuffer(i, false);
            if ((bufferInfo.flags & 1) != 0) {
                z = true;
                if (this.LJIJJ != null && c2501g.LIZJ != null && c2501g.LIZJ.length > this.LJIJJ.length + 4 && c2501g.LIZJ[4] == this.LJIJJ[4] && (c2501g.LIZJ[this.LJIJJ.length + 4] & 31) == 5) {
                    byte[] bArr = new byte[c2501g.LIZJ.length - this.LJIJJ.length];
                    System.arraycopy(c2501g.LIZJ, this.LJIJJ.length, bArr, 0, bArr.length);
                    c2501g.LIZJ = bArr;
                }
            } else {
                z = false;
            }
            Long poll = this.LJIJ.poll();
            if (poll == null) {
                C108306Ske.LIZLLL("BXMediaCodecEncoder", "send frames' count is not equal receive frames's count!!!!");
                return;
            }
            if ((bufferInfo.flags & 4) != 0) {
                z2 = true;
                c2501g.f25584LJ = poll.longValue();
            } else {
                c2501g.f25584LJ = bufferInfo.presentationTimeUs;
            }
            c2501g.LJFF = poll.longValue();
            c2501g.LJII = z2;
            c2501g.LJI = z;
            AbstractC108320Sks abstractC108320Sks = this.LJIIIIZZ;
            if (abstractC108320Sks != null) {
                abstractC108320Sks.LIZIZ(c2501g);
            }
        }
    }
}
