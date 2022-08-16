package com.bytedance.android.btm.impl.page.model;

import android.os.SystemClock;
import com.bytedance.android.btm.api.BtmHostDependManager;
import com.bytedance.android.btm.api.PageProp;
import com.bytedance.android.btm.api.cache.ISavable;
import com.bytedance.android.btm.api.inner.Logger;
import com.bytedance.android.btm.impl.pageshow.PageShowLog$onPageResume$1;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.p1594ss.android.ugc.aweme.experiment.ReDexClinitStringAb;
import com.p3021tt.miniapp.activity.AbsOpenSchemaRelayActivity;
import java.io.Serializable;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import org.json.JSONObject;
import p002O.C0002O;
import p003X.C106862S5w;
import p003X.C142330dyW;
import p003X.C142333dyZ;
import p003X.C142335dyb;
import p003X.C142338dye;
import p003X.C142345dyl;
import p003X.C142370dzA;
import p003X.C142371dzB;
import p003X.C142378dzI;
import p003X.C142396dza;

/* loaded from: classes18.dex */
public class PageInfo implements ISavable<PageInfo>, Serializable {
    public static final C142396dza Companion;
    public static ChangeQuickRedirect changeQuickRedirect = null;
    public static final long serialVersionUID = 20211213;
    public String btmPre;
    public String className;
    public String classSimpleName;
    public long duration;
    public boolean enterPage;
    public long enterTime;
    public Boolean firstShow;
    public final PageInfoStack infoStack;
    public boolean isFirstPage;
    public long lastDuration;
    public long lastPauseTime;
    public long lastResumeTime;
    public String pageBtm;
    public String pageId;
    public String pageShowId;
    public String scene;
    public String sourcePageId;
    public int step;

    static {
        if (ReDexClinitStringAb.abTest >= 5) {
            clinit$r$fake();
            return;
        }
        Covode.recordClassIndex(11477);
        Companion = new C142396dza((byte) 0);
    }

    private static void clinit$r$fake() {
        Covode.recordClassIndex(11477);
        Companion = new C142396dza((byte) 0);
    }

    public final void LIZ(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 2).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        this.scene = str;
    }

    public final void LIZ(String str, int i, String str2) {
        if (PatchProxy.proxy(new Object[]{str, Integer.valueOf(i), str2}, this, changeQuickRedirect, false, 5).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        if (LIZ(this, str2)) {
            return;
        }
        LIZJ();
        this.btmPre = str;
        this.sourcePageId = str2;
        this.step = i;
    }

    public final void LIZ(boolean z, C142378dzI c142378dzI) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0), c142378dzI}, this, changeQuickRedirect, false, 9).isSupported) {
            return;
        }
        this.lastPauseTime = SystemClock.elapsedRealtime();
        long j = this.lastResumeTime;
        if (j > 0) {
            this.duration += this.lastPauseTime - j;
        }
        if (C142370dzA.LIZ().LIZLLL.LIZJ) {
            Flag flag = null;
            if ((c142378dzI != null ? c142378dzI.LIZJ : null) == Flag.BACKGROUND) {
                return;
            }
            if ((c142378dzI != null ? c142378dzI.LIZJ : null) == Flag.FORWARD) {
                C142333dyZ.LIZLLL.LIZIZ(this, false);
                c142378dzI.LIZLLL = true;
                return;
            }
            if (c142378dzI != null) {
                flag = c142378dzI.LIZJ;
            }
            if (flag == Flag.BACK) {
                C142333dyZ.LIZLLL.LIZIZ(this, true);
                c142378dzI.LIZLLL = true;
                return;
            }
            C142333dyZ.LIZLLL.LIZ(this, z);
            return;
        }
        C142333dyZ.LIZLLL.LIZ(this, z);
    }

    public final void LIZIZ() {
        this.lastDuration = this.duration;
        this.enterTime = 0L;
        this.duration = 0L;
    }

    private void LIZJ() {
        this.step = 1;
        this.sourcePageId = null;
        this.btmPre = null;
        this.enterTime = 0L;
        this.duration = 0L;
        this.lastResumeTime = 0L;
        this.lastPauseTime = 0L;
        this.lastDuration = 0L;
        this.scene = "normal";
        this.pageShowId = "";
    }

    public final PageInfo LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 12);
        if (proxy.isSupported) {
            return (PageInfo) proxy.result;
        }
        return LIZ(new PageInfo(this.infoStack));
    }

    @Override // com.bytedance.android.btm.api.cache.ISavable
    public String save() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        return toString();
    }

    public String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(AbsOpenSchemaRelayActivity.PARAMS_CLASS_NAME, this.className);
            jSONObject.put("step", this.step);
            jSONObject.put("page_id", this.pageId);
            jSONObject.put("source_page_id", this.sourcePageId);
            jSONObject.put("page_btm", this.pageBtm);
            jSONObject.put("btm_pre", this.btmPre);
            jSONObject.put("enter_time", this.enterTime);
            jSONObject.put("duration", this.duration);
            jSONObject.put("first_show", this.firstShow);
            jSONObject.put("scene", this.scene);
            jSONObject.put("page_show_id", this.pageShowId);
            jSONObject.put("last_duration", this.lastDuration);
            jSONObject.put("last_resume_time", this.lastResumeTime);
            jSONObject.put("last_pause_time", this.lastPauseTime);
            jSONObject.put("is_first_page", this.isFirstPage);
        } catch (Throwable unused) {
        }
        String jSONObject2 = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject2, "");
        return jSONObject2;
    }

    public PageInfo(PageInfoStack pageInfoStack) {
        String sb;
        C106862S5w.LIZ(pageInfoStack);
        this.infoStack = pageInfoStack;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], C142371dzB.f18874LJ, C142371dzB.LIZ, false, 1);
        if (proxy.isSupported) {
            sb = (String) proxy.result;
        } else if (BtmHostDependManager.INSTANCE.getDebug()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(C142371dzB.LIZIZ.incrementAndGet());
            sb = sb2.toString();
        } else {
            long incrementAndGet = C142371dzB.LIZIZ.incrementAndGet();
            if (incrementAndGet > 10000) {
                C142371dzB.LIZIZ.set(0L);
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append(System.currentTimeMillis());
            sb3.append(incrementAndGet);
            sb = sb3.toString();
        }
        this.pageId = sb;
        this.step = 1;
        this.scene = "normal";
    }

    private PageInfo LIZ(PageInfo pageInfo) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{pageInfo}, this, changeQuickRedirect, false, 13);
        if (proxy.isSupported) {
            return (PageInfo) proxy.result;
        }
        C106862S5w.LIZ(pageInfo);
        pageInfo.pageId = this.pageId;
        pageInfo.sourcePageId = this.sourcePageId;
        pageInfo.btmPre = this.btmPre;
        pageInfo.pageBtm = this.pageBtm;
        pageInfo.step = this.step;
        pageInfo.enterTime = this.enterTime;
        pageInfo.duration = this.duration;
        pageInfo.lastResumeTime = this.lastResumeTime;
        pageInfo.lastPauseTime = this.lastPauseTime;
        pageInfo.lastDuration = this.lastDuration;
        pageInfo.firstShow = this.firstShow;
        pageInfo.className = this.className;
        pageInfo.scene = this.scene;
        pageInfo.isFirstPage = this.isFirstPage;
        pageInfo.pageShowId = this.pageShowId;
        return pageInfo;
    }

    public final void LIZIZ(String str) {
        if (!PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 3).isSupported && str != null && str.length() != 0) {
            List split$default = StringsKt__StringsKt.split$default((CharSequence) str, new String[]{"."}, false, 0, 6, (Object) null);
            if (split$default.size() == 1 && StringsKt__StringsJVMKt.startsWith$default((String) split$default.get(0), "b", false, 2, null)) {
                new StringBuilder();
                this.pageBtm = C0002O.m25084C(BtmHostDependManager.INSTANCE.getDefaultA(), ".", (String) split$default.get(0), ".c0.d0");
            } else if (StringsKt__StringsKt.contains$default((CharSequence) str, (CharSequence) "bUnknown", false, 2, (Object) null)) {
                this.pageBtm = str;
            } else if (StringsKt__StringsJVMKt.startsWith$default((String) split$default.get(0), "a", false, 2, null) && split$default.size() >= 2) {
                new StringBuilder();
                this.pageBtm = C0002O.m25084C((String) split$default.get(0), ".", (String) split$default.get(1), ".c0.d0");
            } else {
                C142330dyW c142330dyW = C142330dyW.LIZIZ;
                new StringBuilder();
                C142330dyW.LIZ(c142330dyW, 1011, C0002O.m25086C(str, " format error"), null, false, false, null, 60, null);
            }
        }
    }

    @Override // com.bytedance.android.btm.api.cache.ISavable
    /* renamed from: LIZJ */
    public final PageInfo mo25318parse(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 16);
        if (proxy.isSupported) {
            return (PageInfo) proxy.result;
        }
        C106862S5w.LIZ(str);
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.className = jSONObject.optString(AbsOpenSchemaRelayActivity.PARAMS_CLASS_NAME);
            this.step = jSONObject.optInt("step");
            String optString = jSONObject.optString("page_id");
            Intrinsics.checkNotNullExpressionValue(optString, "");
            this.pageId = optString;
            this.sourcePageId = jSONObject.optString("source_page_id");
            String optString2 = jSONObject.optString("page_btm");
            if (optString2 == null || optString2.length() == 0) {
                optString2 = null;
            }
            this.pageBtm = optString2;
            this.btmPre = jSONObject.optString("btm_pre");
            this.enterTime = jSONObject.optLong("enter_time");
            this.duration = jSONObject.optLong("duration");
            this.firstShow = Boolean.valueOf(jSONObject.optBoolean("first_show"));
            String optString3 = jSONObject.optString("scene");
            Intrinsics.checkNotNullExpressionValue(optString3, "");
            this.scene = optString3;
            this.pageShowId = jSONObject.optString("page_show_id");
            this.lastDuration = jSONObject.optLong("last_duration");
            this.lastResumeTime = jSONObject.optLong("last_resume_time");
            this.lastPauseTime = jSONObject.optLong("last_pause_time");
            this.isFirstPage = jSONObject.optBoolean("is_first_page");
            return this;
        } catch (Exception e) {
            Logger.INSTANCE.m15958e("btm_error", new PageInfo$parse$2(e));
            return this;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void LIZ(boolean z, boolean z2) {
        boolean z3;
        Object LIZIZ;
        String uuid;
        PageInfo pageInfo;
        boolean z4 = true;
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 7).isSupported) {
            return;
        }
        if (C142370dzA.LIZ().LIZLLL.LIZJ) {
            C142333dyZ c142333dyZ = C142333dyZ.LIZLLL;
            if (!PatchProxy.proxy(new Object[]{this, Byte.valueOf((byte) z), Byte.valueOf((byte) z2)}, c142333dyZ, C142333dyZ.LIZ, false, 4).isSupported) {
                C106862S5w.LIZ(this);
                C142378dzI LIZ = C142335dyb.LIZ();
                if (LIZ != null && (pageInfo = LIZ.LIZIZ) != null && !LIZ.LIZLLL && z == 0 && LIZ.LIZJ != Flag.BACKGROUND && !Intrinsics.areEqual(pageInfo.pageId, this.pageId)) {
                    if (this.step >= pageInfo.step) {
                        z4 = false;
                    }
                    c142333dyZ.LIZJ(pageInfo.LIZ(), z4);
                    pageInfo.LIZIZ();
                }
            }
        } else {
            C142333dyZ c142333dyZ2 = C142333dyZ.LIZLLL;
            if (!PatchProxy.proxy(new Object[]{this}, c142333dyZ2, C142333dyZ.LIZ, false, 3).isSupported) {
                C106862S5w.LIZ(this);
                if (!C142333dyZ.LIZIZ.empty()) {
                    PageInfo pop = C142333dyZ.LIZIZ.pop();
                    Logger.INSTANCE.m15956i("onPageResume", new PageShowLog$onPageResume$1(pop, this));
                    if (!Intrinsics.areEqual(this.pageId, pop.pageId)) {
                        if (this.step < pop.step) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        byte b = z3 ? (byte) 1 : (byte) 0;
                        byte b2 = z3 ? (byte) 1 : (byte) 0;
                        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{pop, Byte.valueOf(b)}, c142333dyZ2, C142333dyZ.LIZ, false, 17);
                        if (!proxy.isSupported ? !(C142345dyl.LIZIZ.LIZJ() || (pop.duration < 500 && (LIZIZ = C142338dye.LIZIZ.LIZIZ(pop)) != null && (C142338dye.LIZIZ.LJII(LIZIZ) == null || ((pop.duration < 50 && Intrinsics.areEqual(pop.firstShow, Boolean.FALSE)) || (z3 && pop.duration < 500))))) : ((Boolean) proxy.result).booleanValue()) {
                            c142333dyZ2.LIZJ(pop.LIZ(), z3);
                        }
                        pop.LIZIZ();
                    }
                }
            }
        }
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[0], C142371dzB.f18874LJ, C142371dzB.LIZ, false, 4);
        if (proxy2.isSupported) {
            uuid = (String) proxy2.result;
        } else {
            uuid = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "");
        }
        this.pageShowId = uuid;
        this.lastResumeTime = SystemClock.elapsedRealtime();
        if (this.enterTime <= 0) {
            this.enterTime = System.currentTimeMillis();
            this.duration = 0L;
        }
        Boolean bool = this.firstShow;
        if (bool == null) {
            this.firstShow = Boolean.TRUE;
        } else if (Intrinsics.areEqual(bool, Boolean.TRUE) && this.duration == 0) {
            this.firstShow = Boolean.FALSE;
        }
    }

    private final boolean LIZ(PageInfo pageInfo, String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{pageInfo, str}, this, changeQuickRedirect, false, 6);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        return Intrinsics.areEqual(pageInfo.pageId, str);
    }

    public final void LIZ(PageProp pageProp, Object obj) {
        if (PatchProxy.proxy(new Object[]{pageProp, obj}, this, changeQuickRedirect, false, 4).isSupported) {
            return;
        }
        C106862S5w.LIZ(pageProp, obj);
        LIZIZ(pageProp.getBtm());
        this.className = obj.getClass().getName();
        this.classSimpleName = obj.getClass().getSimpleName();
        this.infoStack.pageProp = pageProp;
    }

    public static /* synthetic */ void LIZ(PageInfo pageInfo, boolean z, C142378dzI c142378dzI, int i, Object obj) {
        byte b = z ? (byte) 1 : (byte) 0;
        byte b2 = z ? (byte) 1 : (byte) 0;
        if (PatchProxy.proxy(new Object[]{pageInfo, Byte.valueOf(b), null, Integer.valueOf(i), null}, null, changeQuickRedirect, true, 10).isSupported) {
            return;
        }
        if ((i & 1) != 0) {
            z = false;
        }
        pageInfo.LIZ(z, (C142378dzI) null);
    }

    public static /* synthetic */ void LIZ(PageInfo pageInfo, boolean z, boolean z2, int i, Object obj) {
        byte b = z ? (byte) 1 : (byte) 0;
        byte b2 = z ? (byte) 1 : (byte) 0;
        if (PatchProxy.proxy(new Object[]{pageInfo, Byte.valueOf(b), (byte) 0, Integer.valueOf(i), null}, null, changeQuickRedirect, true, 8).isSupported) {
            return;
        }
        if ((i & 1) != 0) {
            z = false;
        }
        pageInfo.LIZ(z, false);
    }
}
