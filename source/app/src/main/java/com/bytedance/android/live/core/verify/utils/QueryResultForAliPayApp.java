package com.bytedance.android.live.core.verify.utils;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.android.live.core.verify.responbean.C4160a;
import com.bytedance.android.tools.superkv.AbstractC10535e;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.p1300mt.protector.impl.GsonProtectorUtils;
import com.umeng.message.proguard.C34037f;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import p002O.C0002O;
import p003X.AbstractC4569445g;
import p003X.C116971W2r;
import p003X.C91258LxM;
import p003X.KM9;
import p003X.QIR;

/* loaded from: classes5.dex */
public class QueryResultForAliPayApp implements AbstractC4569445g {
    public static ChangeQuickRedirect LIZ;
    public Activity LIZIZ;
    public String LIZJ;
    public boolean LIZLLL;

    /* renamed from: LJ */
    public C4160a f26203LJ;
    public Bundle LJFF;
    public boolean LJI;
    public AbstractC10535e LJII;
    public a$d LJIIIIZZ;
    public boolean LJIIIZ;

    static {
        Covode.recordClassIndex(24194);
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (!PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 3).isSupported && event == Lifecycle.Event.ON_RESUME) {
            onResume();
        }
    }

    public final void LIZ() {
        String str;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
            return;
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        try {
            str = C0002O.m25086C("alipays://platformapi/startapp?appId=20000067&url=", URLEncoder.encode(this.f26203LJ.f26202LJ, C34037f.f43302f));
        } catch (UnsupportedEncodingException unused) {
            str = "";
        }
        intent.setData(Uri.parse(str));
        Activity activity = this.LIZIZ;
        if (activity != null) {
            C116971W2r.LIZIZ(activity, intent);
        }
        this.LJI = true;
        AbstractC10535e abstractC10535e = this.LJII;
        if (abstractC10535e != null) {
            abstractC10535e.LIZ("is_verify_processed", GsonProtectorUtils.toJson(KM9.LIZIZ(), this.f26203LJ));
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void onResume() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 2).isSupported || !this.LJI) {
            return;
        }
        this.LJI = false;
        Activity activity = this.LIZIZ;
        C4160a c4160a = this.f26203LJ;
        String str = this.LIZJ;
        Bundle bundle = this.LJFF;
        boolean z = this.LIZLLL;
        a$d a_d = this.LJIIIIZZ;
        boolean z2 = this.LJIIIZ;
        if (!PatchProxy.proxy(new Object[]{activity, c4160a, str, bundle, Byte.valueOf(z ? (byte) 1 : (byte) 0), 0, a_d, Byte.valueOf(z2 ? (byte) 1 : (byte) 0)}, null, QIR.LIZ, true, 24).isSupported) {
            QIR.LIZ(activity, c4160a, str, bundle, z, 0, new HashMap(), a_d, z2);
        }
    }

    public QueryResultForAliPayApp(Activity activity, C4160a c4160a, String str, Bundle bundle, boolean z, a$d a_d, boolean z2) {
        this.LIZIZ = activity;
        this.LIZJ = str;
        this.LJFF = bundle;
        this.LIZLLL = z;
        this.f26203LJ = c4160a;
        this.LJIIIIZZ = a_d;
        this.LJIIIZ = z2;
        if (activity instanceof LifecycleOwner) {
            ((LifecycleOwner) activity).mo29786getLifecycle().addObserver(this);
        }
        this.LJII = C91258LxM.LIZ("webcast_jsb_local_data");
    }
}
