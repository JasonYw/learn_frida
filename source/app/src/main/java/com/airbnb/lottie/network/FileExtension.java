package com.airbnb.lottie.network;

import com.airbnb.lottie.C0810L;
import com.bytedance.covode.number.Covode;
import p002O.C0002O;

/* loaded from: classes13.dex */
public enum FileExtension {
    Json(".json"),
    Zip(".zip");
    
    public final String extension;

    @Override // java.lang.Enum
    public final String toString() {
        return this.extension;
    }

    public final String tempExtension() {
        return C0002O.m25086C(".temp", this.extension);
    }

    static {
        Covode.recordClassIndex(4142);
    }

    public static FileExtension forFile(String str) {
        FileExtension[] values;
        for (FileExtension fileExtension : values()) {
            if (str.endsWith(fileExtension.extension)) {
                return fileExtension;
            }
        }
        C0810L.warn(C0002O.m25086C("Unable to find correct extension for ", str));
        return Json;
    }

    FileExtension(String str) {
        this.extension = str;
    }
}
