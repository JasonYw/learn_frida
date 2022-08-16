package com.alipay.sdk.p082m.p121u;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.alipay.sdk.p082m.p109n.C1333a;
import com.bytedance.covode.number.Covode;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import p003X.C116971W2r;

/* renamed from: com.alipay.sdk.m.u.k */
/* loaded from: classes4.dex */
public class C1396k {
    static {
        Covode.recordClassIndex(4896);
    }

    /* renamed from: a */
    public static void m18828a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public static Drawable m18827a(String str, Context context) {
        return m18826a(str, context, 480);
    }

    /* renamed from: a */
    public static Drawable m18826a(String str, Context context, int i) {
        ByteArrayInputStream byteArrayInputStream;
        try {
            byteArrayInputStream = new ByteArrayInputStream(C1333a.m19083a(str));
        } catch (Throwable unused) {
            byteArrayInputStream = null;
        }
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            if (i <= 0) {
                i = 240;
            }
            options.inDensity = i;
            options.inTargetDensity = context.getResources().getDisplayMetrics().densityDpi;
            BitmapDrawable bitmapDrawable = new BitmapDrawable(context.getResources(), C116971W2r.LIZ(byteArrayInputStream, (Rect) null, options));
            m18828a(byteArrayInputStream);
            return bitmapDrawable;
        } catch (Throwable unused2) {
            m18828a(byteArrayInputStream);
            return null;
        }
    }
}
