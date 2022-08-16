package com.benchmark.settings;

import com.bytedance.covode.number.Covode;

/* loaded from: classes21.dex */
public class BXEncodeSettings {
    public String colorFormat;
    public boolean isDecodeToSurface;
    public int srcHeight;
    public int srcWidth;
    public String strVideoOutputPath;
    public String strYUVPath;
    public boolean useVC1;

    static {
        Covode.recordClassIndex(9728);
    }

    public boolean isDecodeToSurface() {
        return this.isDecodeToSurface;
    }

    public int getSrcWidth() {
        return this.srcWidth;
    }

    public int getSrcHeight() {
        return this.srcHeight;
    }

    public String getStrVideoOutputPath() {
        return this.strVideoOutputPath;
    }

    public boolean isUseVC1() {
        return this.useVC1;
    }

    public String getColorFormat() {
        return this.colorFormat;
    }

    public BXEncodeSettings(String str, String str2, boolean z, int i, int i2, String str3, boolean z2) {
        this.srcWidth = 720;
        this.srcHeight = 1080;
        this.strYUVPath = str;
        this.strVideoOutputPath = str2;
        this.srcWidth = i;
        this.srcHeight = i2;
        this.isDecodeToSurface = z;
        this.useVC1 = z2;
        this.colorFormat = str3;
    }
}
