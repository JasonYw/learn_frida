package com.airbnb.lottie;

import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;

/* loaded from: classes13.dex */
public class LottieImageAsset {
    public Bitmap bitmap;
    public boolean bitmapHasBeenOptMemory;
    public boolean canDownSampleBitmap;
    public final String dirName;
    public final String fileName;
    public final boolean hasAlpha;
    public final int height;

    /* renamed from: id */
    public final String f21081id;
    public final int width;

    static {
        Covode.recordClassIndex(3958);
    }

    public Bitmap getBitmap() {
        return this.bitmap;
    }

    public String getDirName() {
        return this.dirName;
    }

    public String getFileName() {
        return this.fileName;
    }

    public int getHeight() {
        return this.height;
    }

    public String getId() {
        return this.f21081id;
    }

    public int getWidth() {
        return this.width;
    }

    public boolean isHasAlpha() {
        return this.hasAlpha;
    }

    public boolean hasBitmap() {
        if (this.bitmap == null) {
            if (this.fileName.startsWith("data:") && this.fileName.indexOf("base64,") > 0) {
                return true;
            }
            return false;
        }
        return true;
    }

    public void setBitmap(Bitmap bitmap) {
        this.bitmap = bitmap;
    }

    public LottieImageAsset(int i, int i2, String str, String str2, String str3, boolean z) {
        this.width = i;
        this.height = i2;
        this.f21081id = str;
        this.fileName = str2;
        this.dirName = str3;
        this.hasAlpha = z;
    }
}
