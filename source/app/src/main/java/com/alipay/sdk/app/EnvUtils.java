package com.alipay.sdk.app;

import com.bytedance.covode.number.Covode;

/* loaded from: classes2.dex */
public class EnvUtils {
    public static EnvEnum mEnv = EnvEnum.ONLINE;

    public static EnvEnum geEnv() {
        return mEnv;
    }

    static {
        Covode.recordClassIndex(4694);
    }

    public static boolean isSandBox() {
        if (mEnv == EnvEnum.SANDBOX) {
            return true;
        }
        return false;
    }

    /* loaded from: classes2.dex */
    public enum EnvEnum {
        ONLINE,
        SANDBOX;

        static {
            Covode.recordClassIndex(4695);
        }
    }

    public static void setEnv(EnvEnum envEnum) {
        mEnv = envEnum;
    }
}
