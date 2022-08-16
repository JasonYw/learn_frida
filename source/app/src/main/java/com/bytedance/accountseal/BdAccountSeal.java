package com.bytedance.accountseal;

import android.content.Context;
import android.content.Intent;
import com.bytedance.accountseal.sdk.IProcessor;
import com.bytedance.accountseal.view.BdAccountSealActivity;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.LinkedList;
import org.json.JSONObject;
import p003X.C106862S5w;
import p003X.C116971W2r;
import p003X.C137546cj0;
import p003X.C137562cjG;
import p003X.C137563cjH;
import p003X.C137564cjI;

/* loaded from: classes17.dex */
public final class BdAccountSeal {
    public static final BdAccountSeal INSTANCE = new BdAccountSeal();
    public static final LinkedList<IProcessor> LIZ = new LinkedList<>();
    public static C137563cjH LIZIZ;
    public static boolean LIZJ;
    public static C137564cjI LIZLLL;
    public static ChangeQuickRedirect changeQuickRedirect;

    public final C137563cjH getConfig() {
        return LIZIZ;
    }

    public final LinkedList<IProcessor> getProcessors$seal_cnRelease() {
        return LIZ;
    }

    public final C137564cjI getSettingsManager$seal_cnRelease() {
        return LIZLLL;
    }

    static {
        Covode.recordClassIndex(9842);
    }

    /* loaded from: classes17.dex */
    public enum NativeThemeMode {
        DARK("dark"),
        LIGHT("light");
        
        public static ChangeQuickRedirect changeQuickRedirect;
        public String value;

        public static NativeThemeMode valueOf(String str) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 3);
            return (NativeThemeMode) (proxy.isSupported ? proxy.result : Enum.valueOf(NativeThemeMode.class, str));
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static NativeThemeMode[] valuesCustom() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 2);
            return (NativeThemeMode[]) (proxy.isSupported ? proxy.result : values().clone());
        }

        static {
            Covode.recordClassIndex(9843);
        }

        NativeThemeMode(String str) {
            this.value = str;
        }
    }

    public final void setSettingsManager$seal_cnRelease(C137564cjI c137564cjI) {
        LIZLLL = c137564cjI;
    }

    public final void addProcessor(IProcessor iProcessor) {
        if (PatchProxy.proxy(new Object[]{iProcessor}, this, changeQuickRedirect, false, 3).isSupported) {
            return;
        }
        C106862S5w.LIZ(iProcessor);
        LIZ.add(iProcessor);
    }

    public final void init(C137563cjH c137563cjH) {
        if (PatchProxy.proxy(new Object[]{c137563cjH}, this, changeQuickRedirect, false, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ(c137563cjH);
        if (!LIZJ) {
            long currentTimeMillis = System.currentTimeMillis();
            LIZJ = true ^ LIZJ;
            LIZIZ = c137563cjH;
            LIZLLL = new C137564cjI(c137563cjH);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration", System.currentTimeMillis() - currentTimeMillis);
            C137562cjG.LIZIZ.LIZ("self_unpunish_sdk_init", jSONObject);
        }
    }

    public final void unseal(Context context, String str, String str2, NativeThemeMode nativeThemeMode, AbstractC2520a abstractC2520a) {
        int andIncrement;
        if (PatchProxy.proxy(new Object[]{context, str, str2, nativeThemeMode, abstractC2520a}, this, changeQuickRedirect, false, 2).isSupported) {
            return;
        }
        C106862S5w.LIZ(context, abstractC2520a);
        C137563cjH c137563cjH = LIZIZ;
        if (c137563cjH != null) {
            c137563cjH.LIZJ = str;
        }
        C137562cjG.LIZIZ.LIZ("self_unpunish_sdk_call", null);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{abstractC2520a}, C137546cj0.LIZLLL, C137546cj0.LIZ, false, 1);
        if (proxy.isSupported) {
            andIncrement = ((Integer) proxy.result).intValue();
        } else {
            C106862S5w.LIZ(abstractC2520a);
            andIncrement = C137546cj0.LIZJ.getAndIncrement();
            C137546cj0.LIZIZ.put(Integer.valueOf(andIncrement), abstractC2520a);
        }
        Intent intent = new Intent(context, BdAccountSealActivity.class);
        intent.putExtra("request", andIncrement);
        intent.putExtra("uid", str);
        intent.putExtra("sec_uid", str2);
        if (nativeThemeMode == null) {
            nativeThemeMode = NativeThemeMode.DARK;
        }
        intent.putExtra("theme_mode", nativeThemeMode);
        C116971W2r.LIZ(context, intent);
    }
}
