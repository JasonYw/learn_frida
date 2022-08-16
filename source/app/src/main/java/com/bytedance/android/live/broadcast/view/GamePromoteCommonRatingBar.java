package com.bytedance.android.live.broadcast.view;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.bytedance.android.live.broadcast.C3243u;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.livesdk.chatroom.C5923dp;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.p1300mt.protector.impl.CastProtectorUtils;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC413402Xu;
import p003X.AbstractC88953L3b;
import p003X.C106862S5w;
import p003X.C2WC;
import p003X.C409882Kg;
import p003X.C88440Kt0;
import p003X.C88952L3a;
import p003X.LK5;

/* loaded from: classes5.dex */
public final class GamePromoteCommonRatingBar extends View {
    public static ChangeQuickRedirect LIZ;
    public float LIZIZ;
    public int LIZJ;
    public int LIZLLL;

    /* renamed from: LJ */
    public int f25953LJ;
    public C3243u LJFF;
    public int LJI;
    public int LJII;
    public int LJIIIIZZ;
    public boolean LJIIIZ;
    public boolean LJIIJ;
    public final Paint LJIIJJI;
    public final Paint LJIIL;
    public final Paint LJIILIIL;
    public int LJIILJJIL;
    public float LJIILL;
    public final Lazy LJIILLIIL;
    public final Lazy LJIIZILJ;
    public final int LJIJ;
    public float LJIJI;
    public float LJIJJ;
    public AbstractC88953L3b LJIJJLI;

    /* loaded from: classes5.dex */
    public enum StarType {
        NORMAL,
        HALF,
        WHOLE;
        
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(18086);
        }

        public static StarType valueOf(String str) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
            return (StarType) (proxy.isSupported ? proxy.result : Enum.valueOf(StarType.class, str));
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static StarType[] valuesCustom() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
            return (StarType[]) (proxy.isSupported ? proxy.result : values().clone());
        }
    }

    static {
        Covode.recordClassIndex(18085);
    }

    public GamePromoteCommonRatingBar(Context context) {
        this(context, null, 0, 6, null);
    }

    public GamePromoteCommonRatingBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    private final Bitmap getStarBgBitmap() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 2);
        return (Bitmap) (proxy.isSupported ? proxy.result : this.LJIIZILJ.mo27335getValue());
    }

    private final Bitmap getStarBitmap() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        return (Bitmap) (proxy.isSupported ? proxy.result : this.LJIILLIIL.mo27335getValue());
    }

    public final C3243u getGameInfo() {
        return this.LJFF;
    }

    public final int getProgress() {
        return this.LJIILJJIL;
    }

    public final float getScore() {
        return this.LJIILL;
    }

    private final float getStarProgressWidth() {
        float f;
        float f2;
        float f3;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 15);
        if (proxy.isSupported) {
            return ((Float) proxy.result).floatValue();
        }
        float f4 = (this.LJIILJJIL / 100.0f) * this.LJI;
        int i = this.LJII;
        if (i == StarType.HALF.ordinal()) {
            f = LIZIZ(f4) * this.LIZJ;
            f2 = (int) f4;
            f3 = this.LIZIZ;
        } else if (i == StarType.WHOLE.ordinal()) {
            f = LIZ(f4) * this.LIZJ;
            f2 = (int) f4;
            f3 = this.LIZIZ;
        } else {
            f = this.LIZJ * f4;
            f2 = (int) f4;
            f3 = this.LIZIZ;
        }
        return f + (f2 * f3);
    }

    public final void setGameInfo(C3243u c3243u) {
        this.LJFF = c3243u;
    }

    public final void setScore(float f) {
        this.LJIILL = f;
    }

    public final void setOnCommonRatingBarScoreListener(C88952L3a c88952L3a) {
        if (PatchProxy.proxy(new Object[]{c88952L3a}, this, LIZ, false, 5).isSupported) {
            return;
        }
        C106862S5w.LIZ(c88952L3a);
        this.LJIJJLI = c88952L3a;
    }

    private final float LIZ(float f) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Float.valueOf(f)}, this, LIZ, false, 16);
        if (proxy.isSupported) {
            return ((Float) proxy.result).floatValue();
        }
        return (float) Math.ceil(f);
    }

    @Override // android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{motionEvent}, this, LIZ, false, 6);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (!this.LJIIIZ && !this.LJIIJ) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    private final float LIZIZ(float f) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Float.valueOf(f)}, this, LIZ, false, 17);
        if (proxy.isSupported) {
            return ((Float) proxy.result).floatValue();
        }
        double d = f;
        double d2 = d % 0.5d;
        if (d2 == 0.0d) {
            return f;
        }
        float rint = (float) Math.rint(d);
        if (rint < f) {
            if (d2 < 0.25d) {
                return rint;
            }
            return rint + 0.5f;
        } else if (rint > f) {
            if (d2 < 0.25d) {
                return rint - 0.5f;
            }
            return rint;
        } else {
            return f;
        }
    }

    public final void setProgress(int i) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 4).isSupported) {
            return;
        }
        if (i < 0) {
            i = 0;
        } else if (i > 100) {
            i = 100;
        }
        this.LJIILJJIL = i;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 8).isSupported) {
            float f = (this.LJIILJJIL / 100.0f) * this.LJI;
            int i2 = this.LJII;
            if (i2 == StarType.HALF.ordinal()) {
                f = LIZIZ(f);
            } else if (i2 == StarType.WHOLE.ordinal()) {
                f = LIZ(f);
            }
            this.LJIILL = f;
        }
        postInvalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        MethodCollector.m14708i(1345);
        if (PatchProxy.proxy(new Object[]{canvas}, this, LIZ, false, 11).isSupported) {
            MethodCollector.m14707o(1345);
            return;
        }
        super.onDraw(canvas);
        if (this.f25953LJ == -1) {
            MethodCollector.m14707o(1345);
        } else if (canvas != null) {
            int save = canvas.save();
            if (!PatchProxy.proxy(new Object[]{canvas}, this, LIZ, false, 12).isSupported) {
                int i = this.LJI;
                for (int i2 = 0; i2 < i; i2++) {
                    canvas.drawBitmap(getStarBgBitmap(), i2 * (this.LIZJ + this.LIZIZ), 0.0f, this.LJIIJJI);
                }
            }
            if (this.LIZLLL == -1) {
                if (!PatchProxy.proxy(new Object[]{canvas}, this, LIZ, false, 13).isSupported) {
                    canvas.drawRect(0.0f, 0.0f, getStarProgressWidth(), getHeight(), this.LJIILIIL);
                }
            } else if (!PatchProxy.proxy(new Object[]{canvas}, this, LIZ, false, 14).isSupported) {
                Paint paint = this.LJIIL;
                Bitmap starBitmap = getStarBitmap();
                Shader.TileMode tileMode = Shader.TileMode.REPEAT;
                paint.setShader(new BitmapShader(starBitmap, tileMode, tileMode));
                canvas.drawRect(0.0f, 0.0f, getStarProgressWidth(), getHeight(), this.LJIIL);
            }
            canvas.restoreToCount(save);
            MethodCollector.m14707o(1345);
        } else {
            MethodCollector.m14707o(1345);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Integer valueOf;
        C3243u c3243u;
        String str;
        C5923dp LIZ2;
        C2WC<Room> LIZ3;
        Room LIZ4;
        C5923dp LIZ5;
        AbstractC413402Xu<Boolean> LJIILJJIL;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{motionEvent}, this, LIZ, false, 7);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (motionEvent != null && (valueOf = Integer.valueOf(motionEvent.getAction())) != null) {
            if (valueOf.intValue() == 0) {
                SettingKey<Boolean> settingKey = LiveSettingKeys.LIVE_GAME_COMMENT_INSTALL_CHECK_CONFIG;
                Intrinsics.checkNotNullExpressionValue(settingKey, "");
                Boolean value = settingKey.getValue();
                Intrinsics.checkNotNullExpressionValue(value, "");
                if (value.booleanValue() && (c3243u = this.LJFF) != null && (str = c3243u.LJIJJ) != null && (LIZ2 = C409882Kg.LIZ(C5923dp.LJIIJ, null, 0L, 3, null)) != null && (LIZ3 = LIZ2.LIZ()) != null && (LIZ4 = LIZ3.LIZ()) != null && LIZ4.getIdStr() != null && (LIZ5 = C409882Kg.LIZ(C5923dp.LJIIJ, null, 0L, 3, null)) != null && (LJIILJJIL = LIZ5.LJIILJJIL()) != null && !LJIILJJIL.LIZIZ().booleanValue()) {
                    Context context = getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "");
                    if (!LIZ(context, str)) {
                        C88440Kt0.LIZ(LK5.LIZ(2131583547));
                        return false;
                    }
                }
                this.LJIJI = motionEvent.getX();
                this.LJIJJ = motionEvent.getY();
                return true;
            } else if (valueOf != null) {
                if (valueOf.intValue() == 2) {
                    if (this.LJIIJ && Math.abs(motionEvent.getX() - this.LJIJI) - Math.abs(motionEvent.getY() - this.LJIJJ) >= this.LJIJ && LIZ(motionEvent.getX(), motionEvent.getY())) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                        setProgress((int) ((motionEvent.getX() / getWidth()) * 100.0f));
                        AbstractC88953L3b abstractC88953L3b = this.LJIJJLI;
                        return true;
                    }
                    getParent().requestDisallowInterceptTouchEvent(false);
                    return true;
                } else if (valueOf.intValue() == 1 || valueOf.intValue() == 3) {
                    int x = (int) ((motionEvent.getX() / getWidth()) * 100.0f);
                    if (this.LJIIJ && Math.abs(motionEvent.getX() - this.LJIJI) > this.LJIJ) {
                        setProgress(x);
                    }
                    if (this.LJIIIZ && Math.abs(motionEvent.getY() - this.LJIJJ) <= this.LJIJ && Math.abs(motionEvent.getX() - this.LJIJI) <= this.LJIJ && LIZ(motionEvent.getX(), motionEvent.getY())) {
                        setProgress(x);
                        getParent().requestDisallowInterceptTouchEvent(true);
                        AbstractC88953L3b abstractC88953L3b2 = this.LJIJJLI;
                        if (abstractC88953L3b2 != null) {
                            abstractC88953L3b2.LIZ(this.LJIILL, x);
                            return true;
                        }
                    } else {
                        getParent().requestDisallowInterceptTouchEvent(false);
                    }
                }
            }
        }
        return true;
    }

    private final boolean LIZ(float f, float f2) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Float.valueOf(f), Float.valueOf(f2)}, this, LIZ, false, 9);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        return new Rect(0, 0, getWidth(), getHeight()).contains((int) f, (int) f2);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        MethodCollector.m14708i(1344);
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, LIZ, false, 10).isSupported) {
            MethodCollector.m14707o(1344);
            return;
        }
        super.onMeasure(i, i2);
        this.LIZJ = getMeasuredHeight();
        int i3 = this.LJI;
        int i4 = this.LIZJ;
        setMeasuredDimension((i3 * i4) + ((i3 - 1) * ((int) this.LIZIZ)), i4);
        MethodCollector.m14707o(1344);
    }

    private final boolean LIZ(Context context, String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{context, str}, this, LIZ, false, 18);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        try {
            context.getPackageManager().getPackageInfo(str, 1);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GamePromoteCommonRatingBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C106862S5w.LIZ(context);
        MethodCollector.m14708i(1346);
        this.LJI = 5;
        this.LIZJ = 30;
        this.LIZLLL = -1;
        this.f25953LJ = -1;
        this.LJII = StarType.NORMAL.ordinal();
        this.LJIIIIZZ = CastProtectorUtils.parseColor("#F7B500");
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        this.LJIIJJI = paint;
        Paint paint2 = new Paint();
        paint2.setAntiAlias(true);
        this.LJIIL = paint2;
        Paint paint3 = new Paint();
        paint3.setAntiAlias(true);
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        this.LJIILIIL = paint3;
        this.LJIILLIIL = LazyKt__LazyJVMKt.lazy(new GamePromoteCommonRatingBar$starBitmap$2(this, context));
        this.LJIIZILJ = LazyKt__LazyJVMKt.lazy(new GamePromoteCommonRatingBar$starBgBitmap$2(this, context));
        if (!PatchProxy.proxy(new Object[]{context, attributeSet}, this, LIZ, false, 3).isSupported) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{2130774542, 2130774543, 2130774544, 2130774545, 2130774546, 2130774551, 2130774552, 2130774554});
            this.LJI = obtainStyledAttributes.getInt(3, 5);
            this.LIZIZ = obtainStyledAttributes.getDimension(5, 10.0f);
            this.LIZLLL = obtainStyledAttributes.getResourceId(4, -1);
            this.f25953LJ = obtainStyledAttributes.getResourceId(0, -1);
            this.LJII = obtainStyledAttributes.getInt(7, StarType.NORMAL.ordinal());
            this.LJIIIIZZ = obtainStyledAttributes.getColor(2, CastProtectorUtils.parseColor("#F7B500"));
            this.LJIILIIL.setColor(this.LJIIIIZZ);
            this.LJIIIZ = obtainStyledAttributes.getBoolean(1, false);
            this.LJIIJ = obtainStyledAttributes.getBoolean(6, false);
            obtainStyledAttributes.recycle();
        }
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        Intrinsics.checkNotNullExpressionValue(viewConfiguration, "");
        this.LJIJ = viewConfiguration.getScaledTouchSlop();
        MethodCollector.m14707o(1346);
    }

    public /* synthetic */ GamePromoteCommonRatingBar(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
