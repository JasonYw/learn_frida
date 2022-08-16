package com.byted.mgl.service.api.privacy.permission;

import android.os.Handler;
import android.os.Looper;
import com.byted.mgl.service.api.privacy.permission.PermitResult;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.minigame.bdpbase.manager.BdpManager;
import com.bytedance.minigame.serviceapi.defaults.log.BdpLogService;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import p002O.C0002O;

/* loaded from: classes15.dex */
public abstract class AbsPermitListener {
    public static ChangeQuickRedirect changeQuickRedirect;
    public boolean mAnyPermissionDenied;
    public Looper mLooper;
    public final Set<String> mPermissions;
    public final List<PermitResult> mResultList;

    static {
        Covode.recordClassIndex(9805);
    }

    public abstract void onDenied(List<PermitResult> list);

    public abstract void onGranted();

    public synchronized boolean shouldInvokeImmediatelyWhenDenied() {
        MethodCollector.m14708i(845);
        MethodCollector.m14707o(845);
        return true;
    }

    public AbsPermitListener() {
        this.mPermissions = new HashSet(1);
        this.mResultList = new ArrayList();
        this.mAnyPermissionDenied = false;
        this.mLooper = Looper.getMainLooper();
    }

    public AbsPermitListener(Looper looper) {
        this.mPermissions = new HashSet(1);
        this.mResultList = new ArrayList();
        this.mAnyPermissionDenied = false;
        this.mLooper = Looper.getMainLooper();
        this.mLooper = looper;
    }

    public final synchronized void registerPermissions(Set<String> set) {
        MethodCollector.m14708i(848);
        if (PatchProxy.proxy(new Object[]{set}, this, changeQuickRedirect, false, 5).isSupported) {
            MethodCollector.m14707o(848);
            return;
        }
        this.mPermissions.addAll(set);
        MethodCollector.m14707o(848);
    }

    public synchronized boolean shouldIgnorePermissionNotFound(String str) {
        MethodCollector.m14708i(844);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            boolean booleanValue = ((Boolean) proxy.result).booleanValue();
            MethodCollector.m14707o(844);
            return booleanValue;
        }
        ((BdpLogService) BdpManager.getInst().getService(BdpLogService.class)).mo14326d("PermissionsResultListener", C0002O.m25086C("Permission not found: ", str));
        MethodCollector.m14707o(844);
        return true;
    }

    private boolean isDenied(String str, PermitResult.Type type) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, type}, this, changeQuickRedirect, false, 4);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (type != PermitResult.Type.DENIED && (shouldIgnorePermissionNotFound(str) || type != PermitResult.Type.NOT_FOUND)) {
            return false;
        }
        return true;
    }

    public final synchronized boolean onResult(String str, int i, boolean z) {
        MethodCollector.m14708i(846);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            boolean booleanValue = ((Boolean) proxy.result).booleanValue();
            MethodCollector.m14707o(846);
            return booleanValue;
        } else if (i == 0) {
            boolean onResult = onResult(str, PermitResult.Type.GRANTED, z);
            MethodCollector.m14707o(846);
            return onResult;
        } else {
            boolean onResult2 = onResult(str, PermitResult.Type.DENIED, z);
            MethodCollector.m14707o(846);
            return onResult2;
        }
    }

    public final synchronized boolean onResult(String str, PermitResult.Type type, boolean z) {
        MethodCollector.m14708i(847);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, type, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 3);
        if (proxy.isSupported) {
            boolean booleanValue = ((Boolean) proxy.result).booleanValue();
            MethodCollector.m14707o(847);
            return booleanValue;
        } else if (!this.mPermissions.remove(str)) {
            MethodCollector.m14707o(847);
            return false;
        } else {
            PermitResult permitResult = new PermitResult(str, type, z);
            this.mResultList.add(permitResult);
            boolean isDenied = isDenied(str, permitResult.resultType);
            if (shouldInvokeImmediatelyWhenDenied()) {
                if (isDenied) {
                    new Handler(this.mLooper).post(new Runnable() { // from class: com.byted.mgl.service.api.privacy.permission.AbsPermitListener.1
                        public static ChangeQuickRedirect changeQuickRedirect;

                        static {
                            Covode.recordClassIndex(9806);
                        }

                        @Override // java.lang.Runnable
                        public void run() {
                            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
                                return;
                            }
                            AbsPermitListener absPermitListener = AbsPermitListener.this;
                            absPermitListener.onDenied(absPermitListener.mResultList);
                        }
                    });
                    MethodCollector.m14707o(847);
                    return true;
                }
            } else if (isDenied) {
                this.mAnyPermissionDenied = true;
            }
            if (this.mPermissions.isEmpty()) {
                if (this.mAnyPermissionDenied) {
                    new Handler(this.mLooper).post(new Runnable() { // from class: com.byted.mgl.service.api.privacy.permission.AbsPermitListener.2
                        public static ChangeQuickRedirect changeQuickRedirect;

                        static {
                            Covode.recordClassIndex(9807);
                        }

                        @Override // java.lang.Runnable
                        public void run() {
                            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
                                return;
                            }
                            AbsPermitListener absPermitListener = AbsPermitListener.this;
                            absPermitListener.onDenied(absPermitListener.mResultList);
                        }
                    });
                } else {
                    new Handler(this.mLooper).post(new Runnable() { // from class: com.byted.mgl.service.api.privacy.permission.AbsPermitListener.3
                        public static ChangeQuickRedirect changeQuickRedirect;

                        static {
                            Covode.recordClassIndex(9808);
                        }

                        @Override // java.lang.Runnable
                        public void run() {
                            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
                                return;
                            }
                            AbsPermitListener.this.onGranted();
                        }
                    });
                }
                MethodCollector.m14707o(847);
                return true;
            }
            MethodCollector.m14707o(847);
            return false;
        }
    }
}
