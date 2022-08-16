package com.bytedance.android.btm.impl.page.model;

import com.bytedance.android.btm.api.BtmPageLifecycle;
import com.bytedance.android.btm.api.PageProp;
import com.bytedance.android.btm.api.cache.ISavable;
import com.bytedance.android.btm.api.inner.Logger;
import com.bytedance.android.btm.api.model.BufferBtm;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.concurrent.LinkedBlockingDeque;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;
import p003X.AbstractC142393dzX;
import p003X.C106862S5w;
import p003X.C142329dyV;
import p003X.C142334dya;
import p003X.C142335dyb;
import p003X.C142357dyx;
import p003X.C142370dzA;
import p003X.C142378dzI;
import p003X.C142383dzN;
import p003X.C142397dzb;

/* loaded from: classes18.dex */
public final class PageInfoStack implements ISavable<PageInfoStack>, Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    public static final long serialVersionUID = 20211213;
    public boolean ignoreAShow;
    public PageProp pageProp;
    public Boolean userVisibleHint;
    public static final C142397dzb Companion = new C142397dzb((byte) 0);
    public static AbstractC142393dzX pageInfoFactory = new C142383dzN();
    public LinkedBlockingDeque<PageInfo> stack = new LinkedBlockingDeque<>();
    public boolean firstResume = true;
    public BtmPageLifecycle.State nativeState = BtmPageLifecycle.State.INITIALIZED;
    public BtmPageLifecycle.State pageState = BtmPageLifecycle.State.INITIALIZED;

    static {
        Covode.recordClassIndex(11480);
    }

    public final String LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 3);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        return LIZIZ().btmPre;
    }

    public final boolean LIZJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 9);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        return this.stack.isEmpty();
    }

    @Override // com.bytedance.android.btm.api.cache.ISavable
    public final String save() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 10);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        return toString();
    }

    public final PageInfo LIZIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 6);
        if (proxy.isSupported) {
            return (PageInfo) proxy.result;
        }
        if (!this.stack.isEmpty()) {
            PageInfo last = this.stack.getLast();
            Intrinsics.checkNotNullExpressionValue(last, "");
            return last;
        }
        PageInfo LIZ = pageInfoFactory.LIZ(this);
        this.stack.putLast(LIZ);
        return LIZ;
    }

    public final String toString() {
        String str;
        int i = 0;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 8);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("native_state", this.nativeState);
            jSONObject.put("page_state", this.pageState);
            if (this.firstResume) {
                i = 1;
            }
            jSONObject.put("first_resume", i);
            PageProp pageProp = this.pageProp;
            if (pageProp == null || (str = pageProp.save()) == null) {
                str = "{}";
            }
            jSONObject.put("page_prop", str);
            JSONArray jSONArray = new JSONArray();
            try {
                for (PageInfo pageInfo : this.stack) {
                    jSONArray.put(pageInfo.save());
                }
            } catch (Throwable unused) {
            }
            jSONObject.put("stack", jSONArray);
        } catch (Throwable unused2) {
        }
        String jSONObject2 = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject2, "");
        return jSONObject2;
    }

    public final void LIZIZ(BtmPageLifecycle.State state) {
        if (PatchProxy.proxy(new Object[]{state}, this, changeQuickRedirect, false, 2).isSupported) {
            return;
        }
        C106862S5w.LIZ(state);
        this.pageState = state;
    }

    public final void LIZ(BtmPageLifecycle.State state) {
        if (PatchProxy.proxy(new Object[]{state}, this, changeQuickRedirect, false, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ(state);
        this.nativeState = state;
    }

    @Override // com.bytedance.android.btm.api.cache.ISavable
    /* renamed from: LIZ */
    public final PageInfoStack mo25318parse(String str) {
        boolean z = true;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 11);
        if (proxy.isSupported) {
            return (PageInfoStack) proxy.result;
        }
        C106862S5w.LIZ(str);
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("native_state");
            Intrinsics.checkNotNullExpressionValue(optString, "");
            this.nativeState = BtmPageLifecycle.State.valueOf(optString);
            String optString2 = jSONObject.optString("page_state");
            Intrinsics.checkNotNullExpressionValue(optString2, "");
            this.pageState = BtmPageLifecycle.State.valueOf(optString2);
            if (jSONObject.optInt("first_resume") != 1) {
                z = false;
            }
            this.firstResume = z;
            PageProp pageProp = new PageProp(null, false, false, 7, null);
            String optString3 = jSONObject.optString("page_prop");
            Intrinsics.checkNotNullExpressionValue(optString3, "");
            this.pageProp = pageProp.mo25318parse(optString3);
            LinkedBlockingDeque<PageInfo> linkedBlockingDeque = new LinkedBlockingDeque<>();
            try {
                JSONArray jSONArray = jSONObject.getJSONArray("stack");
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    PageInfo pageInfo = new PageInfo(this);
                    String string = jSONArray.getString(i);
                    Intrinsics.checkNotNullExpressionValue(string, "");
                    linkedBlockingDeque.add(pageInfo.mo25318parse(string));
                }
            } catch (Throwable unused) {
            }
            this.stack = linkedBlockingDeque;
            return this;
        } catch (Exception e) {
            Logger.INSTANCE.m15958e("btm_error", new PageInfoStack$parse$2(e));
            return this;
        }
    }

    public final void LIZ(Object obj, String str) {
        boolean z;
        boolean z2;
        if (PatchProxy.proxy(new Object[]{obj, str}, this, changeQuickRedirect, false, 7).isSupported) {
            return;
        }
        C106862S5w.LIZ(obj, str);
        PageInfo LIZIZ = LIZIZ();
        PageInfo.LIZ(LIZIZ, false, (C142378dzI) null, 3, (Object) null);
        if (C142370dzA.LIZ().LIZLLL.LIZJ) {
            C142335dyb.LIZJ.LIZ(C142357dyx.LIZJ.LIZIZ(obj), LIZIZ);
        } else {
            C142334dya.LIZJ.LIZ(obj, LIZIZ);
        }
        PageInfo LIZ = pageInfoFactory.LIZ(this);
        PageProp pageProp = this.pageProp;
        if (pageProp != null) {
            z = pageProp.getAuto();
        } else {
            z = true;
        }
        PageProp pageProp2 = this.pageProp;
        if (pageProp2 != null) {
            z2 = pageProp2.getSingleton();
        } else {
            z2 = false;
        }
        this.pageProp = new PageProp(str, z, z2);
        LIZ.LIZIZ(str);
        BufferBtm LIZIZ2 = C142329dyV.LIZLLL.LIZIZ(null);
        if (LIZIZ2 != null || (LIZIZ2 = C142329dyV.LIZLLL.LIZ(LIZ)) != null) {
            LIZ.btmPre = LIZIZ2.getBtm();
            LIZ.sourcePageId = LIZIZ2.getPageId();
            LIZ.step = LIZIZ2.getStep() + 1;
        }
        this.stack.putLast(LIZ);
        PageInfo.LIZ(LIZ, false, false, 2, (Object) null);
    }
}
