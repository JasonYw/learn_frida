package com.alibaba.wireless.security.framework;

import android.content.pm.PackageInfo;
import android.content.res.AssetManager;
import com.alibaba.wireless.security.framework.utils.C1127a;
import com.alibaba.wireless.security.framework.utils.C1130d;
import com.alibaba.wireless.security.open.initialize.ISecurityGuardPlugin;
import com.bytedance.covode.number.Covode;

/* renamed from: com.alibaba.wireless.security.framework.c */
/* loaded from: classes2.dex */
public class C1122c implements ISGPluginInfo {

    /* renamed from: a */
    public String f21757a;

    /* renamed from: b */
    public String f21758b;

    /* renamed from: c */
    public ClassLoader f21759c;

    /* renamed from: d */
    public AssetManager f21760d;

    /* renamed from: e */
    public C1120a f21761e;

    /* renamed from: f */
    public ISecurityGuardPlugin f21762f;

    /* renamed from: g */
    public ISGPluginManager f21763g;

    static {
        Covode.recordClassIndex(4545);
    }

    public C1122c(String str, ISGPluginManager iSGPluginManager, String str2, ClassLoader classLoader, C1120a c1120a, ISecurityGuardPlugin iSecurityGuardPlugin) {
        this.f21757a = str;
        this.f21763g = iSGPluginManager;
        this.f21758b = str2;
        this.f21759c = classLoader;
        this.f21761e = c1120a;
        this.f21762f = iSecurityGuardPlugin;
    }

    /* renamed from: a */
    public String m19758a(String str) {
        return this.f21761e.f21743a != null ? this.f21761e.f21743a.applicationInfo.metaData.getString(str) : this.f21761e.m19766a(str);
    }

    @Override // com.alibaba.wireless.security.framework.ISGPluginInfo
    public AssetManager getAssetManager() {
        AssetManager assetManager = this.f21760d;
        if (assetManager != null) {
            return assetManager;
        }
        try {
            AssetManager assetManager2 = (AssetManager) AssetManager.class.newInstance();
            C1130d.m19704a(assetManager2).m19702a("addAssetPath", this.f21757a);
            this.f21760d = assetManager2;
            return this.f21760d;
        } catch (Exception e) {
            C1127a.m19715a("", e);
            return null;
        }
    }

    @Override // com.alibaba.wireless.security.framework.ISGPluginInfo
    public ClassLoader getClassLoader() {
        return this.f21759c;
    }

    @Override // com.alibaba.wireless.security.framework.ISGPluginInfo
    public PackageInfo getPackageInfo() {
        return this.f21761e.f21743a;
    }

    @Override // com.alibaba.wireless.security.framework.ISGPluginInfo
    public String getPluginName() {
        return this.f21758b;
    }

    @Override // com.alibaba.wireless.security.framework.ISGPluginInfo
    public String getPluginPath() {
        return this.f21757a;
    }

    @Override // com.alibaba.wireless.security.framework.ISGPluginInfo
    public ISecurityGuardPlugin getSGPluginEntry() {
        return this.f21762f;
    }

    @Override // com.alibaba.wireless.security.framework.ISGPluginInfo
    public ISGPluginManager getSGPluginManager() {
        return this.f21763g;
    }

    @Override // com.alibaba.wireless.security.framework.ISGPluginInfo
    public String getVersion() {
        return this.f21761e.f21743a != null ? this.f21761e.f21743a.versionName : this.f21761e.m19766a("version");
    }
}
