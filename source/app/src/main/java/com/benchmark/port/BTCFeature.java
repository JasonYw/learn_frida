package com.benchmark.port;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* loaded from: classes9.dex */
public final class BTCFeature {
    public static BTCFeature LIZ = new BTCFeature("overall_score", BTCFeatureKind.FLOAT);
    public static BTCFeature LIZIZ = new BTCFeature("cpu_score", BTCFeatureKind.FLOAT);
    public static BTCFeature LIZJ = new BTCFeature("gpu_score", BTCFeatureKind.FLOAT);
    public static BTCFeature LIZLLL = new BTCFeature("video_record_scene", BTCFeatureKind.FLOAT);

    /* renamed from: LJ */
    public static BTCFeature f25585LJ = new BTCFeature("temp", BTCFeatureKind.FLOAT);
    public static BTCFeature LJFF = new BTCFeature("battery", BTCFeatureKind.FLOAT);
    public static BTCFeature LJI = new BTCFeature("remain_memory", BTCFeatureKind.FLOAT);
    public String LJII;
    public BTCFeatureKind LJIIIIZZ;

    /* loaded from: classes10.dex */
    public enum BTCFeatureKind {
        INT,
        FLOAT,
        BOOLEAN,
        STRING;
        
        public static ChangeQuickRedirect changeQuickRedirect;

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static BTCFeatureKind[] valuesCustom() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
            if (proxy.isSupported) {
                return (BTCFeatureKind[]) proxy.result;
            }
            return (BTCFeatureKind[]) values().clone();
        }

        static {
            Covode.recordClassIndex(9707);
        }

        public static BTCFeatureKind valueOf(String str) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
            if (proxy.isSupported) {
                return (BTCFeatureKind) proxy.result;
            }
            return (BTCFeatureKind) Enum.valueOf(BTCFeatureKind.class, str);
        }
    }

    static {
        Covode.recordClassIndex(9706);
        new BTCFeature("memory_score", BTCFeatureKind.FLOAT);
        new BTCFeature("video_score", BTCFeatureKind.FLOAT);
        new BTCFeature("io_score", BTCFeatureKind.FLOAT);
        new BTCFeature("video_play_scene", BTCFeatureKind.FLOAT);
        new BTCFeature("app_launch_scene", BTCFeatureKind.FLOAT);
        new BTCFeature("virtual_memory", BTCFeatureKind.FLOAT);
    }

    public BTCFeature(String str, BTCFeatureKind bTCFeatureKind) {
        this.LJII = str;
        this.LJIIIIZZ = bTCFeatureKind;
    }
}
