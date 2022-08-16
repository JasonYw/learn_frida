package com.benchmark.settings;

import com.benchmark.ByteBenchBundle;
import com.benchmark.mediacodec.C2501g;
import com.benchmark.mediacodec.TEMediaCodecEncodeSettings;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* loaded from: classes10.dex */
public class HWEncoderStrategyWrapper {
    public static ChangeQuickRedirect changeQuickRedirect;
    public long mStrategyHandle;

    static {
        Covode.recordClassIndex(9730);
    }

    private native TEMediaCodecEncodeSettings native_getSetting(long j, TEMediaCodecEncodeSettings tEMediaCodecEncodeSettings);

    private native String native_getVideoOutputPath(long j);

    private native String native_getYUVPath(long j);

    private native void native_update(long j, long j2);

    public TEMediaCodecEncodeSettings getSettings() {
        MethodCollector.m14708i(801);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 3);
        if (proxy.isSupported) {
            TEMediaCodecEncodeSettings tEMediaCodecEncodeSettings = (TEMediaCodecEncodeSettings) proxy.result;
            MethodCollector.m14707o(801);
            return tEMediaCodecEncodeSettings;
        }
        TEMediaCodecEncodeSettings native_getSetting = native_getSetting(this.mStrategyHandle, new TEMediaCodecEncodeSettings());
        MethodCollector.m14707o(801);
        return native_getSetting;
    }

    public String getVideoOutputPath() {
        MethodCollector.m14708i(800);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            String str = (String) proxy.result;
            MethodCollector.m14707o(800);
            return str;
        }
        String native_getVideoOutputPath = native_getVideoOutputPath(this.mStrategyHandle);
        MethodCollector.m14707o(800);
        return native_getVideoOutputPath;
    }

    public String getYUVPath() {
        MethodCollector.m14708i(799);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            String str = (String) proxy.result;
            MethodCollector.m14707o(799);
            return str;
        }
        String native_getYUVPath = native_getYUVPath(this.mStrategyHandle);
        MethodCollector.m14707o(799);
        return native_getYUVPath;
    }

    public HWEncoderStrategyWrapper(long j) {
        this.mStrategyHandle = j;
    }

    public void update(C2501g c2501g, C2501g c2501g2, int i) {
        MethodCollector.m14708i(802);
        if (PatchProxy.proxy(new Object[]{c2501g, c2501g2, Integer.valueOf(i)}, this, changeQuickRedirect, false, 4).isSupported) {
            MethodCollector.m14707o(802);
            return;
        }
        ByteBenchBundle obtain = ByteBenchBundle.obtain();
        if (c2501g.LIZJ != null) {
            obtain.setInt("encode_frame_size", c2501g.LIZJ.length);
        } else {
            obtain.setInt("encode_frame_size", 0);
        }
        obtain.setLong("pts", c2501g.f25584LJ);
        obtain.setBool("key_frame", c2501g.LJI);
        obtain.setBool("end_frame", c2501g.LJII);
        native_update(this.mStrategyHandle, obtain.getHandle());
        obtain.recycle();
        MethodCollector.m14707o(802);
    }
}
