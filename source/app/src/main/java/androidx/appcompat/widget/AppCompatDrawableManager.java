package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import androidx.core.graphics.ColorUtils;
import com.bytedance.covode.number.Covode;
import com.p1594ss.android.ugc.aweme.experiment.ReDexClinitStringAb;
import p003X.AbstractC138495cyR;
import p003X.C138258cub;
import p003X.C138270cun;
import p003X.C138273cuq;
import p003X.C138491cyN;
import p003X.C138492cyO;
import p003X.G4E;

/* loaded from: classes17.dex */
public final class AppCompatDrawableManager {
    public static final PorterDuff.Mode DEFAULT_MODE;
    public static AppCompatDrawableManager INSTANCE;
    public C138492cyO mResourceManager;

    private static void clinit$r$fake() {
        Covode.recordClassIndex(612);
        DEFAULT_MODE = PorterDuff.Mode.SRC_IN;
    }

    static {
        if (ReDexClinitStringAb.abTest >= 5) {
            clinit$r$fake();
            return;
        }
        Covode.recordClassIndex(612);
        DEFAULT_MODE = PorterDuff.Mode.SRC_IN;
    }

    public static synchronized AppCompatDrawableManager get() {
        AppCompatDrawableManager appCompatDrawableManager;
        synchronized (AppCompatDrawableManager.class) {
            if (INSTANCE == null) {
                preload();
            }
            appCompatDrawableManager = INSTANCE;
        }
        return appCompatDrawableManager;
    }

    public static synchronized void preload() {
        synchronized (AppCompatDrawableManager.class) {
            if (INSTANCE == null) {
                AppCompatDrawableManager appCompatDrawableManager = new AppCompatDrawableManager();
                INSTANCE = appCompatDrawableManager;
                appCompatDrawableManager.mResourceManager = C138492cyO.LIZ();
                INSTANCE.mResourceManager.LIZ(new AbstractC138495cyR() { // from class: androidx.appcompat.widget.AppCompatDrawableManager.1
                    public final int[] LIZ = {2130837681, 2130837679, 2130837600};
                    public final int[] LIZIZ = {2130837622, 2130837663, 2130837629, 2130837624, 2130837625, 2130837628, 2130837627};
                    public final int[] LIZJ = {2130837678, 2130837680, 2130837615, 2130837671, 2130837672, 2130837674, 2130837676, 2130837673, 2130837675, 2130837677};
                    public final int[] LIZLLL = {2130837653, 2130837613, 2130837652};

                    /* renamed from: LJ */
                    public final int[] f20229LJ = {2130837669, 2130837682};
                    public final int[] LJFF = {2130837603, 2130837607, 2130837604, 2130837608};

                    static {
                        if (ReDexClinitStringAb.abTest >= 5) {
                            Covode.recordClassIndex(613);
                        } else {
                            Covode.recordClassIndex(613);
                        }
                    }

                    @Override // p003X.AbstractC138495cyR
                    public final PorterDuff.Mode LIZ(int i) {
                        if (i == 2130837667) {
                            return PorterDuff.Mode.MULTIPLY;
                        }
                        return null;
                    }

                    public static boolean LIZ(int[] iArr, int i) {
                        for (int i2 : iArr) {
                            if (i2 == i) {
                                return true;
                            }
                        }
                        return false;
                    }

                    public static ColorStateList LIZIZ(Context context, int i) {
                        int LIZ = C138270cun.LIZ(context, 2130772211);
                        return new ColorStateList(new int[][]{C138270cun.LIZ, C138270cun.LIZJ, C138270cun.LIZIZ, C138270cun.f18305LJ}, new int[]{C138270cun.LIZJ(context, 2130772754), ColorUtils.compositeColors(LIZ, i), ColorUtils.compositeColors(LIZ, i), i});
                    }

                    @Override // p003X.AbstractC138495cyR
                    public final ColorStateList LIZ(Context context, int i) {
                        if (i == 2130837618) {
                            return C138491cyN.LIZ(context, 2131624309);
                        }
                        if (i == 2130837668) {
                            return C138491cyN.LIZ(context, 2131624312);
                        }
                        if (i == 2130837667) {
                            int[][] iArr = new int[3];
                            int[] iArr2 = new int[3];
                            ColorStateList LIZIZ = C138270cun.LIZIZ(context, 2130772758);
                            if (LIZIZ != null && LIZIZ.isStateful()) {
                                iArr[0] = C138270cun.LIZ;
                                iArr2[0] = LIZIZ.getColorForState(iArr[0], 0);
                                iArr[1] = C138270cun.LIZLLL;
                                iArr2[1] = C138270cun.LIZ(context, 2130771992);
                                iArr[2] = C138270cun.f18305LJ;
                                iArr2[2] = LIZIZ.getDefaultColor();
                            } else {
                                iArr[0] = C138270cun.LIZ;
                                iArr2[0] = C138270cun.LIZJ(context, 2130772758);
                                iArr[1] = C138270cun.LIZLLL;
                                iArr2[1] = C138270cun.LIZ(context, 2130771992);
                                iArr[2] = C138270cun.f18305LJ;
                                iArr2[2] = C138270cun.LIZ(context, 2130772758);
                            }
                            return new ColorStateList(iArr, iArr2);
                        } else if (i == 2130837606) {
                            return LIZIZ(context, C138270cun.LIZ(context, 2130772754));
                        } else {
                            if (i == 2130837602) {
                                return LIZIZ(context, 0);
                            }
                            if (i == 2130837605) {
                                return LIZIZ(context, C138270cun.LIZ(context, 2130772208));
                            }
                            if (i != 2130837665 && i != 2130837666) {
                                if (LIZ(this.LIZIZ, i)) {
                                    return C138270cun.LIZIZ(context, 2130771991);
                                }
                                if (LIZ(this.f20229LJ, i)) {
                                    return C138491cyN.LIZ(context, 2131624308);
                                }
                                if (LIZ(this.LJFF, i)) {
                                    return C138491cyN.LIZ(context, 2131624307);
                                }
                                if (i == 2130837662) {
                                    return C138491cyN.LIZ(context, 2131624310);
                                }
                                return null;
                            }
                            return C138491cyN.LIZ(context, 2131624311);
                        }
                    }

                    public static void LIZ(Drawable drawable, int i, PorterDuff.Mode mode) {
                        if (C138273cuq.LIZJ(drawable)) {
                            drawable = drawable.mutate();
                        }
                        if (mode == null) {
                            mode = AppCompatDrawableManager.DEFAULT_MODE;
                        }
                        drawable.setColorFilter(AppCompatDrawableManager.getPorterDuffColorFilter(i, mode));
                    }

                    @Override // p003X.AbstractC138495cyR
                    public final Drawable LIZ(C138492cyO c138492cyO, Context context, int i) {
                        if (i == 2130837614) {
                            return new LayerDrawable(new Drawable[]{c138492cyO.LIZ(context, 2130837613), c138492cyO.LIZ(context, 2130837615)});
                        }
                        return null;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
                    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
                    @Override // p003X.AbstractC138495cyR
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final boolean LIZIZ(android.content.Context r7, int r8, android.graphics.drawable.Drawable r9) {
                        /*
                            r6 = this;
                            android.graphics.PorterDuff$Mode r3 = androidx.appcompat.widget.AppCompatDrawableManager.DEFAULT_MODE
                            int[] r0 = r6.LIZ
                            boolean r0 = LIZ(r0, r8)
                            r4 = 16842801(0x1010031, float:2.3693695E-38)
                            r2 = -1
                            r1 = 0
                            r5 = 1
                            if (r0 == 0) goto L30
                            r4 = 2130771991(0x7f010017, float:1.7147088E38)
                        L13:
                            r0 = 1
                            r1 = -1
                        L15:
                            boolean r0 = p003X.C138273cuq.LIZJ(r9)
                            if (r0 == 0) goto L1f
                            android.graphics.drawable.Drawable r9 = r9.mutate()
                        L1f:
                            int r0 = p003X.C138270cun.LIZ(r7, r4)
                            android.graphics.PorterDuffColorFilter r0 = androidx.appcompat.widget.AppCompatDrawableManager.getPorterDuffColorFilter(r0, r3)
                            r9.setColorFilter(r0)
                            if (r1 == r2) goto L2f
                            r9.setAlpha(r1)
                        L2f:
                            return r5
                        L30:
                            int[] r0 = r6.LIZJ
                            boolean r0 = LIZ(r0, r8)
                            if (r0 == 0) goto L3c
                            r4 = 2130771992(0x7f010018, float:1.714709E38)
                            goto L13
                        L3c:
                            int[] r0 = r6.LIZLLL
                            boolean r0 = LIZ(r0, r8)
                            if (r0 == 0) goto L47
                            android.graphics.PorterDuff$Mode r3 = android.graphics.PorterDuff.Mode.MULTIPLY
                            goto L13
                        L47:
                            r0 = 2130837641(0x7f020089, float:1.7280242E38)
                            if (r8 != r0) goto L58
                            r4 = 16842800(0x1010030, float:2.3693693E-38)
                            r0 = 1109603123(0x42233333, float:40.8)
                            int r1 = java.lang.Math.round(r0)
                            r0 = 1
                            goto L15
                        L58:
                            r0 = 2130837617(0x7f020071, float:1.7280193E38)
                            if (r8 == r0) goto L13
                            return r1
                        */
                        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AppCompatDrawableManager.C02071.LIZIZ(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
                    }

                    @Override // p003X.AbstractC138495cyR
                    public final boolean LIZ(Context context, int i, Drawable drawable) {
                        if (i == 2130837664) {
                            LayerDrawable layerDrawable = (LayerDrawable) drawable;
                            LIZ(layerDrawable.findDrawableByLayerId(16908288), C138270cun.LIZ(context, 2130771991), AppCompatDrawableManager.DEFAULT_MODE);
                            LIZ(layerDrawable.findDrawableByLayerId(16908303), C138270cun.LIZ(context, 2130771991), AppCompatDrawableManager.DEFAULT_MODE);
                            LIZ(layerDrawable.findDrawableByLayerId(16908301), C138270cun.LIZ(context, 2130771992), AppCompatDrawableManager.DEFAULT_MODE);
                            return true;
                        } else if (i != 2130837655 && i != 2130837654 && i != 2130837656) {
                            return false;
                        } else {
                            LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                            LIZ(layerDrawable2.findDrawableByLayerId(16908288), C138270cun.LIZJ(context, 2130771991), AppCompatDrawableManager.DEFAULT_MODE);
                            LIZ(layerDrawable2.findDrawableByLayerId(16908303), C138270cun.LIZ(context, 2130771992), AppCompatDrawableManager.DEFAULT_MODE);
                            LIZ(layerDrawable2.findDrawableByLayerId(16908301), C138270cun.LIZ(context, 2130771992), AppCompatDrawableManager.DEFAULT_MODE);
                            return true;
                        }
                    }
                });
            }
        }
    }

    public final synchronized void onConfigurationChanged(Context context) {
        this.mResourceManager.LIZ(context);
    }

    public static synchronized PorterDuffColorFilter getPorterDuffColorFilter(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter LIZ;
        synchronized (AppCompatDrawableManager.class) {
            LIZ = C138492cyO.LIZ(i, mode);
        }
        return LIZ;
    }

    public final synchronized Drawable getDrawable(Context context, int i) {
        return this.mResourceManager.LIZ(context, i);
    }

    public final synchronized ColorStateList getTintList(Context context, int i) {
        return this.mResourceManager.LIZIZ(context, i);
    }

    public final boolean tintDrawableUsingColorFilter(Context context, int i, Drawable drawable) {
        return this.mResourceManager.LIZ(context, i, drawable);
    }

    public final synchronized Drawable onDrawableLoadedFromResources(Context context, G4E g4e, int i) {
        return this.mResourceManager.LIZ(context, g4e, i);
    }

    public final synchronized Drawable getDrawable(Context context, int i, boolean z) {
        return this.mResourceManager.LIZ(context, i, z);
    }

    public static void tintDrawable(Drawable drawable, C138258cub c138258cub, int[] iArr) {
        ColorStateList colorStateList;
        PorterDuff.Mode mode;
        if (!C138273cuq.LIZJ(drawable) || drawable.mutate() == drawable) {
            if (!c138258cub.LIZLLL && !c138258cub.LIZJ) {
                drawable.clearColorFilter();
            } else {
                PorterDuffColorFilter porterDuffColorFilter = null;
                if (c138258cub.LIZLLL) {
                    colorStateList = c138258cub.LIZ;
                } else {
                    colorStateList = null;
                }
                if (c138258cub.LIZJ) {
                    mode = c138258cub.LIZIZ;
                } else {
                    mode = C138492cyO.LIZ;
                }
                if (colorStateList != null && mode != null) {
                    porterDuffColorFilter = C138492cyO.LIZ(colorStateList.getColorForState(iArr, 0), mode);
                }
                drawable.setColorFilter(porterDuffColorFilter);
            }
            if (Build.VERSION.SDK_INT <= 23) {
                drawable.invalidateSelf();
            }
        }
    }
}
