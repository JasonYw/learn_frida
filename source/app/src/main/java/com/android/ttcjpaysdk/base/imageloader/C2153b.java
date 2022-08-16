package com.android.ttcjpaysdk.base.imageloader;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import android.widget.ImageView;
import com.android.ttcjpaysdk.base.CJPayPerformance;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import p003X.AbstractC135422cAj;
import p003X.AbstractC136233cNo;
import p003X.C109233Szb;
import p003X.C129418abU;
import p003X.C135270c8H;
import p003X.C64833Bi7;
import p003X.C65404BrK;
import p003X.RunnableC137519ciZ;
import p003X.RunnableC137522cic;
import p003X.RunnableC64834Bi8;

/* renamed from: com.android.ttcjpaysdk.base.imageloader.b */
/* loaded from: classes17.dex */
public final class C2153b {
    public static ChangeQuickRedirect LIZ;
    public C65404BrK LIZIZ;
    public C64833Bi7 LIZJ;
    public C109233Szb LIZLLL;

    /* renamed from: LJ */
    public Handler f25449LJ;
    public HandlerThread LJII;
    public static final C135270c8H LJI = new C135270c8H((byte) 0);
    public static final Lazy LJFF = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) ImageLoader$Companion$instance$2.INSTANCE);

    static {
        Covode.recordClassIndex(6244);
    }

    public C2153b() {
        this.LJII = new HandlerThread("CJPay ImageLoader Thread");
        CJPayPerformance.LIZ().LIZ("com.android.ttcjpaysdk.base.imageloader");
        this.LJII.start();
        this.f25449LJ = new Handler(this.LJII.getLooper());
        this.LIZIZ = new C65404BrK();
        this.LIZJ = new C64833Bi7();
        this.LIZLLL = new C109233Szb();
        this.f25449LJ.post(new RunnableC64834Bi8(this));
    }

    public /* synthetic */ C2153b(byte b) {
        this();
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [T, android.graphics.Bitmap] */
    public final void LIZ(String str, AbstractC135422cAj abstractC135422cAj) {
        Boolean bool;
        if (PatchProxy.proxy(new Object[]{str, abstractC135422cAj}, this, LIZ, false, 2).isSupported || TextUtils.isEmpty(str)) {
            return;
        }
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = this.LIZIZ.LIZ(str);
        Bitmap bitmap = (Bitmap) objectRef.element;
        if (bitmap != null) {
            bool = Boolean.valueOf(bitmap.isRecycled());
        } else {
            bool = null;
        }
        if (Intrinsics.areEqual(bool, Boolean.FALSE)) {
            abstractC135422cAj.LIZ((Bitmap) objectRef.element);
        } else {
            this.f25449LJ.post(new RunnableC137519ciZ(this, objectRef, str, abstractC135422cAj));
        }
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [T, android.graphics.Bitmap] */
    public final void LIZ(String str, AbstractC136233cNo abstractC136233cNo) {
        Boolean bool;
        if (PatchProxy.proxy(new Object[]{str, abstractC136233cNo}, this, LIZ, false, 3).isSupported || TextUtils.isEmpty(str)) {
            return;
        }
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = this.LIZIZ.LIZ(str);
        Bitmap bitmap = (Bitmap) objectRef.element;
        if (bitmap != null) {
            bool = Boolean.valueOf(bitmap.isRecycled());
        } else {
            bool = null;
        }
        if (Intrinsics.areEqual(bool, Boolean.FALSE)) {
            abstractC136233cNo.LIZ((Bitmap) objectRef.element);
        } else {
            this.f25449LJ.post(new RunnableC137522cic(this, objectRef, str, abstractC136233cNo));
        }
    }

    public final void LIZ(Activity activity, String str, ImageView imageView) {
        if (!PatchProxy.proxy(new Object[]{activity, str, imageView}, this, LIZ, false, 1).isSupported && !TextUtils.isEmpty(str) && activity != null && imageView != null) {
            LIZ(str, new C129418abU(activity, imageView));
        }
    }
}
