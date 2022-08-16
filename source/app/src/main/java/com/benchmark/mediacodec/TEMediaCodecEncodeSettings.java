package com.benchmark.mediacodec;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* loaded from: classes10.dex */
public class TEMediaCodecEncodeSettings {
    public static ChangeQuickRedirect changeQuickRedirect;
    public int mBitRate;
    public int mBitRateMode;
    public int mChangeFPSIndex;
    public int mColorRange;
    public int mColorStandard;
    public int mColorTransfer;
    public int mEncodeProfile;
    public int mFrameRate;
    public int mHeight;
    public int mIFrameInternal;
    public int mInputColorFormat;
    public String mMimeType;
    public boolean mOffBFrame;
    public int mWidth;

    static {
        Covode.recordClassIndex(9677);
    }

    public int getBitRate() {
        return this.mBitRate;
    }

    public int getBitRateMode() {
        return this.mBitRateMode;
    }

    public int getChangeFPSIndex() {
        return this.mChangeFPSIndex;
    }

    public int getColorRange() {
        return this.mColorRange;
    }

    public int getColorStandard() {
        return this.mColorStandard;
    }

    public int getColorTransfer() {
        return this.mColorTransfer;
    }

    public int getEncodeProfile() {
        return this.mEncodeProfile;
    }

    public int getFrameRate() {
        return this.mFrameRate;
    }

    public int getHeight() {
        return this.mHeight;
    }

    public int getIFrameInternal() {
        return this.mIFrameInternal;
    }

    public int getInputColorFormat() {
        return this.mInputColorFormat;
    }

    public String getMimeType() {
        return this.mMimeType;
    }

    public int getWidth() {
        return this.mWidth;
    }

    public boolean isOffBFrame() {
        return this.mOffBFrame;
    }

    public boolean useSurfaceInput() {
        if (this.mInputColorFormat == 2130708361) {
            return true;
        }
        return false;
    }

    public String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        return "mimeType: " + this.mMimeType + ", mInputColorFormat: " + this.mInputColorFormat + ", mFrameRate" + this.mFrameRate + ", mIFrameInternal: " + this.mIFrameInternal + ", mBitRate: " + this.mBitRate + ", mBitRateMode: " + this.mBitRateMode + ", mEncodeProfile: " + this.mEncodeProfile + ", width: " + this.mWidth + ", height: " + this.mHeight + ",colorRange: " + this.mColorRange + ", colorStandard: " + this.mColorStandard + ", colorTransfer: " + this.mColorTransfer;
    }
}
