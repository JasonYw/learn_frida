package com.alipay.sdk.p082m.p123x;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.alipay.sdk.p082m.p109n.C1333a;
import com.alipay.sdk.p082m.p121u.C1385e;
import com.bytedance.covode.number.Covode;
import java.io.ByteArrayInputStream;
import p003X.C116971W2r;

/* renamed from: com.alipay.sdk.m.x.a */
/* loaded from: classes2.dex */
public class C1417a {

    /* renamed from: l */
    public static String f22453l = "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";

    /* renamed from: a */
    public AlertDialogC1421d f22454a;

    /* renamed from: b */
    public Activity f22455b;

    /* renamed from: c */
    public String f22456c;

    /* renamed from: d */
    public long f22457d = -1;

    /* renamed from: e */
    public final int f22458e = 1;

    /* renamed from: f */
    public final long f22459f = 10000;

    /* renamed from: g */
    public boolean f22460g = false;

    /* renamed from: h */
    public Handler f22461h = new HandlerC1420c(Looper.getMainLooper());

    static {
        Covode.recordClassIndex(4918);
    }

    /* renamed from: b */
    public void m18740b() {
        this.f22455b = null;
        this.f22454a = null;
    }

    /* renamed from: c */
    public String m18738c() {
        return this.f22456c;
    }

    /* renamed from: a */
    public void m18745a() {
        Activity activity = this.f22455b;
        if (activity != null) {
            activity.runOnUiThread(new RunnableC1419b());
        }
    }

    /* renamed from: d */
    public void m18736d() {
        Activity activity = this.f22455b;
        if (activity != null) {
            activity.runOnUiThread(new RunnableC1418a());
        }
    }

    /* renamed from: com.alipay.sdk.m.x.a$b */
    /* loaded from: classes2.dex */
    public class RunnableC1419b implements Runnable {
        static {
            Covode.recordClassIndex(4920);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C1417a.this.f22454a != null && C1417a.this.f22454a.isShowing()) {
                try {
                    C1417a.this.f22461h.removeMessages(1);
                    C116971W2r.LIZ(C1417a.this.f22454a);
                } catch (Exception e) {
                    C1385e.m18866a(e);
                }
            }
        }

        public RunnableC1419b() {
        }
    }

    /* renamed from: com.alipay.sdk.m.x.a$a */
    /* loaded from: classes2.dex */
    public class RunnableC1418a implements Runnable {
        static {
            Covode.recordClassIndex(4919);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C1417a.this.f22454a == null) {
                C1417a c1417a = C1417a.this;
                c1417a.f22454a = new AlertDialogC1421d(c1417a.f22455b);
                C1417a.this.f22454a.setCancelable(C1417a.this.f22460g);
            }
            try {
                if (!C1417a.this.f22454a.isShowing()) {
                    C116971W2r.LIZJ(C1417a.this.f22454a);
                    C1417a.this.f22461h.sendEmptyMessageDelayed(1, 10000L);
                }
            } catch (Exception e) {
                C1385e.m18866a(e);
            }
        }

        public RunnableC1418a() {
        }
    }

    /* renamed from: com.alipay.sdk.m.x.a$c */
    /* loaded from: classes2.dex */
    public class HandlerC1420c extends Handler {
        static {
            Covode.recordClassIndex(4921);
        }

        @Override // android.os.Handler
        public void dispatchMessage(Message message) {
            C1417a.this.m18745a();
        }

        public HandlerC1420c(Looper looper) {
            super(looper);
        }
    }

    /* renamed from: com.alipay.sdk.m.x.a$d */
    /* loaded from: classes4.dex */
    public class AlertDialogC1421d extends AlertDialog {
        static {
            Covode.recordClassIndex(4922);
        }

        @Override // android.app.AlertDialog, android.app.Dialog
        public void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            setContentView(m18733a(getContext()));
            Window window = getWindow();
            if (window != null) {
                window.setBackgroundDrawable(new ColorDrawable(0));
            }
        }

        /* renamed from: a */
        private View m18733a(Context context) {
            String str;
            LinearLayout linearLayout = new LinearLayout(context);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, m18732a(context, 50.0f));
            layoutParams.gravity = 17;
            linearLayout.setOrientation(0);
            linearLayout.setLayoutParams(layoutParams);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(-450944201);
            gradientDrawable.setCornerRadius(m18732a(context, 5.0f));
            linearLayout.setBackgroundDrawable(gradientDrawable);
            ImageView imageView = new ImageView(context);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(m18732a(context, 20.0f), m18732a(context, 20.0f));
            layoutParams2.gravity = 16;
            layoutParams2.setMargins(m18732a(C1417a.this.f22455b, 17.0f), m18732a(C1417a.this.f22455b, 10.0f), m18732a(C1417a.this.f22455b, 8.0f), m18732a(C1417a.this.f22455b, 10.0f));
            imageView.setLayoutParams(layoutParams2);
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imageView.setImageDrawable(m18731a(context, C1417a.f22453l, 480));
            RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 359.0f, 1, 0.5f, 1, 0.5f);
            rotateAnimation.setRepeatCount(-1);
            rotateAnimation.setDuration(900L);
            rotateAnimation.setInterpolator(new LinearInterpolator());
            imageView.startAnimation(rotateAnimation);
            TextView textView = new TextView(context);
            if (!TextUtils.isEmpty(C1417a.this.f22456c)) {
                str = C1417a.this.f22456c;
            } else {
                str = "正在加载";
            }
            textView.setText(str);
            textView.setTextSize(16.0f);
            textView.setTextColor(-1);
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams3.gravity = 16;
            layoutParams3.setMargins(0, 0, m18732a(context, 17.0f), 0);
            textView.setLayoutParams(layoutParams3);
            linearLayout.addView(imageView);
            linearLayout.addView(textView);
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
            frameLayout.addView(linearLayout);
            return frameLayout;
        }

        public AlertDialogC1421d(Context context) {
            super(context);
        }

        /* renamed from: a */
        private int m18732a(Context context, float f) {
            Resources resources;
            if (context == null) {
                resources = C116971W2r.LIZJ();
            } else {
                resources = context.getResources();
            }
            return (int) (f * resources.getDisplayMetrics().density);
        }

        /* renamed from: a */
        private Drawable m18731a(Context context, String str, int i) {
            ByteArrayInputStream byteArrayInputStream;
            try {
                byteArrayInputStream = new ByteArrayInputStream(C1333a.m19083a(str));
                try {
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    if (i <= 0) {
                        i = 240;
                    }
                    options.inDensity = i;
                    options.inTargetDensity = context.getResources().getDisplayMetrics().densityDpi;
                    BitmapDrawable bitmapDrawable = new BitmapDrawable(context.getResources(), C116971W2r.LIZ(byteArrayInputStream, (Rect) null, options));
                    try {
                        byteArrayInputStream.close();
                        return bitmapDrawable;
                    } catch (Exception unused) {
                        return bitmapDrawable;
                    }
                } catch (Throwable th) {
                    th = th;
                    try {
                        C1385e.m18866a(th);
                        if (byteArrayInputStream != null) {
                            try {
                                byteArrayInputStream.close();
                            } catch (Exception unused2) {
                            }
                        }
                        return null;
                    } catch (Throwable th2) {
                        if (byteArrayInputStream != null) {
                            try {
                                byteArrayInputStream.close();
                            } catch (Exception unused3) {
                            }
                        }
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                byteArrayInputStream = null;
            }
        }
    }

    public C1417a(Activity activity) {
        this.f22455b = activity;
    }

    /* renamed from: a */
    public void m18742a(String str) {
        this.f22456c = str;
    }

    /* renamed from: a */
    public void m18741a(boolean z) {
        this.f22460g = z;
    }

    public C1417a(Activity activity, String str) {
        this.f22455b = activity;
        this.f22456c = str;
    }
}
