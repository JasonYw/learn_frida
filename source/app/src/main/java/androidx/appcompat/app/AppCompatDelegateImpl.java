package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.appcompat.view.menu.C0199g;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.AppCompatDrawableManager;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.ViewStubCompat;
import androidx.collection.SimpleArrayMap;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewPropertyAnimatorCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.alipay.sdk.app.OpenAuthTask;
import com.bytedance.covode.number.Covode;
import com.p1594ss.android.ugc.aweme.experiment.ReDexClinitStringAb;
import java.lang.Thread;
import p002O.C0002O;
import p003X.AbstractC138363cwJ;
import p003X.AbstractC138390cwk;
import p003X.AbstractC138401cwv;
import p003X.AbstractC138442cxa;
import p003X.AbstractC138451cxj;
import p003X.AbstractC138457cxp;
import p003X.AbstractC138463cxv;
import p003X.AbstractC138468cy0;
import p003X.AbstractC63109AvP;
import p003X.C115502VdQ;
import p003X.C116971W2r;
import p003X.C116982W3c;
import p003X.C123028YbW;
import p003X.C135099c5W;
import p003X.C138265cui;
import p003X.C138269cum;
import p003X.C138411cx5;
import p003X.C138419cxD;
import p003X.C138440cxY;
import p003X.C138443cxb;
import p003X.C138446cxe;
import p003X.C138458cxq;
import p003X.C138459cxr;
import p003X.C138462cxu;
import p003X.C138464cxw;
import p003X.C138465cxx;
import p003X.C138466cxy;
import p003X.C144002ePU;
import p003X.C4V4;
import p003X.C5LA;
import p003X.C65471BsP;
import p003X.C74776Fe6;
import p003X.LM4;

/* loaded from: classes17.dex */
public class AppCompatDelegateImpl extends AppCompatDelegate implements LayoutInflater.Factory2, AbstractC138401cwv {
    public static final SimpleArrayMap<String, Integer> LJIJJ;
    public static final boolean LJIJJLI;
    public static final int[] LJIL;
    public static final boolean LJJ;
    public static final boolean LJJI;
    public static boolean LJJIFFI;
    public final Object LIZ;
    public final Context LIZIZ;
    public Window LIZJ;
    public final AbstractC138468cy0 LIZLLL;

    /* renamed from: LJ */
    public AbstractC138457cxp f20220LJ;
    public MenuInflater LJFF;
    public AbstractC138442cxa LJI;
    public ActionBarContextView LJII;
    public PopupWindow LJIIIIZZ;
    public Runnable LJIIIZ;
    public ViewPropertyAnimatorCompat LJIIJ;
    public ViewGroup LJIIJJI;
    public boolean LJIIL;
    public boolean LJIILIIL;
    public boolean LJIILJJIL;
    public boolean LJIILL;
    public boolean LJIILLIIL;
    public boolean LJIIZILJ;
    public boolean LJIJ;
    public int LJIJI;
    public C138458cxq LJJII;
    public CharSequence LJJIII;
    public AbstractC138463cxv LJJIIJ;
    public C138465cxx LJJIIJZLJL;
    public C138462cxu LJJIIZ;
    public boolean LJJIIZI;
    public boolean LJJIJ;
    public TextView LJJIJIIJI;
    public View LJJIJIIJIL;
    public boolean LJJIJIL;
    public boolean LJJIJL;
    public boolean LJJIJLIJ;
    public PanelFeatureState[] LJJIL;
    public PanelFeatureState LJJIZ;
    public boolean LJJJ;
    public boolean LJJJI;
    public boolean LJJJIL;
    public boolean LJJJJ;
    public int LJJJJI;
    public int LJJJJIZL;
    public boolean LJJJJJ;
    public boolean LJJJJJL;
    public AbstractC63109AvP LJJJJL;
    public AbstractC63109AvP LJJJJLI;
    public final Runnable LJJJJLL;
    public boolean LJJJJZ;
    public Rect LJJJJZI;
    public Rect LJJJLIIL;
    public C138265cui LJJJLL;

    public static void LIZ(WindowManager windowManager, View view) {
        C115502VdQ.LIZIZ(new Object[]{view});
        windowManager.removeView(view);
    }

    public static void LIZ(WindowManager windowManager, View view, ViewGroup.LayoutParams layoutParams) {
        C115502VdQ.LIZ(new Object[]{view, layoutParams});
        windowManager.addView(view, layoutParams);
    }

    public static int LJFF(int i) {
        if (i == 8) {
            return 108;
        }
        if (i != 9) {
            return i;
        }
        return 109;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void onSaveInstanceState(Bundle bundle) {
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public int getLocalNightMode() {
        return this.LJJJJI;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public boolean isHandleNativeActionModesEnabled() {
        return this.LJJIIZI;
    }

    public final void LIZ(int i) {
        if (i == 108) {
            AbstractC138457cxp supportActionBar = getSupportActionBar();
            if (supportActionBar == null) {
                return;
            }
            supportActionBar.LIZLLL(false);
        } else if (i != 0) {
        } else {
            PanelFeatureState LIZJ = LIZJ(i);
            if (!LIZJ.LJIILJJIL) {
                return;
            }
            LIZ(LIZJ, false);
        }
    }

    public final boolean LIZ(int i, KeyEvent keyEvent) {
        AbstractC138457cxp supportActionBar = getSupportActionBar();
        if (supportActionBar == null || !supportActionBar.LIZ(i, keyEvent)) {
            PanelFeatureState panelFeatureState = this.LJJIZ;
            if (panelFeatureState != null && LIZ(panelFeatureState, keyEvent.getKeyCode(), keyEvent, 1)) {
                PanelFeatureState panelFeatureState2 = this.LJJIZ;
                if (panelFeatureState2 != null) {
                    panelFeatureState2.LJIILIIL = true;
                }
                return true;
            }
            if (this.LJJIZ == null) {
                PanelFeatureState LIZJ = LIZJ(0);
                LIZIZ(LIZJ, keyEvent);
                boolean LIZ = LIZ(LIZJ, keyEvent.getKeyCode(), keyEvent, 1);
                LIZJ.LJIIL = false;
                if (LIZ) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x009c, code lost:
        if (r0 == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00cf, code lost:
        if (LIZIZ(r1, r7) != false) goto L61;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean LIZ(android.view.KeyEvent r7) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.LIZ(android.view.KeyEvent):boolean");
    }

    private void LIZ(PanelFeatureState panelFeatureState, KeyEvent keyEvent) {
        int i;
        ViewGroup.LayoutParams layoutParams;
        if (panelFeatureState.LJIILJJIL || this.LJIIZILJ) {
            return;
        }
        if (panelFeatureState.LIZ == 0 && (this.LIZIZ.getResources().getConfiguration().screenLayout & 15) == 4) {
            return;
        }
        Window.Callback LIZ = LIZ();
        if (LIZ != null && !LIZ.onMenuOpened(panelFeatureState.LIZ, panelFeatureState.LJIIIZ)) {
            LIZ(panelFeatureState, true);
            return;
        }
        WindowManager windowManager = (WindowManager) this.LIZIZ.getSystemService("window");
        if (windowManager == null || !LIZIZ(panelFeatureState, keyEvent)) {
            return;
        }
        if (panelFeatureState.LJI == null || panelFeatureState.LJIILLIIL) {
            if (panelFeatureState.LJI == null) {
                LIZ(panelFeatureState);
                if (panelFeatureState.LJI == null) {
                    return;
                }
            } else if (panelFeatureState.LJIILLIIL && panelFeatureState.LJI.getChildCount() > 0) {
                panelFeatureState.LJI.removeAllViews();
            }
            if (!LIZJ(panelFeatureState) || !panelFeatureState.LIZ()) {
                panelFeatureState.LJIILLIIL = true;
                return;
            }
            ViewGroup.LayoutParams layoutParams2 = panelFeatureState.LJII.getLayoutParams();
            if (layoutParams2 == null) {
                layoutParams2 = new ViewGroup.LayoutParams(-2, -2);
            }
            panelFeatureState.LJI.setBackgroundResource(panelFeatureState.LIZIZ);
            ViewParent parent = panelFeatureState.LJII.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(panelFeatureState.LJII);
            }
            panelFeatureState.LJI.addView(panelFeatureState.LJII, layoutParams2);
            if (!panelFeatureState.LJII.hasFocus()) {
                panelFeatureState.LJII.requestFocus();
            }
        } else if (panelFeatureState.LJIIIIZZ != null && (layoutParams = panelFeatureState.LJIIIIZZ.getLayoutParams()) != null && layoutParams.width == -1) {
            i = -1;
            panelFeatureState.LJIILIIL = false;
            WindowManager.LayoutParams layoutParams3 = new WindowManager.LayoutParams(i, -2, panelFeatureState.LIZLLL, panelFeatureState.f20221LJ, 1002, 8519680, -3);
            layoutParams3.gravity = panelFeatureState.LIZJ;
            layoutParams3.windowAnimations = panelFeatureState.LJFF;
            LIZ(windowManager, panelFeatureState.LJI, layoutParams3);
            panelFeatureState.LJIILJJIL = true;
        }
        i = -2;
        panelFeatureState.LJIILIIL = false;
        WindowManager.LayoutParams layoutParams32 = new WindowManager.LayoutParams(i, -2, panelFeatureState.LIZLLL, panelFeatureState.f20221LJ, 1002, 8519680, -3);
        layoutParams32.gravity = panelFeatureState.LIZJ;
        layoutParams32.windowAnimations = panelFeatureState.LJFF;
        LIZ(windowManager, panelFeatureState.LJI, layoutParams32);
        panelFeatureState.LJIILJJIL = true;
    }

    private boolean LIZ(PanelFeatureState panelFeatureState) {
        panelFeatureState.LIZ(LJFF());
        panelFeatureState.LJI = new C138464cxw(this, panelFeatureState.LJIIJJI);
        panelFeatureState.LIZJ = 81;
        return true;
    }

    public final void LIZ(C0199g c0199g) {
        if (this.LJJIJLIJ) {
            return;
        }
        this.LJJIJLIJ = true;
        this.LJJIIJ.LJII();
        Window.Callback LIZ = LIZ();
        if (LIZ != null && !this.LJIIZILJ) {
            LIZ.onPanelClosed(108, c0199g);
        }
        this.LJJIJLIJ = false;
    }

    public final void LIZ(PanelFeatureState panelFeatureState, boolean z) {
        AbstractC138463cxv abstractC138463cxv;
        if (z && panelFeatureState.LIZ == 0 && (abstractC138463cxv = this.LJJIIJ) != null && abstractC138463cxv.LIZJ()) {
            LIZ(panelFeatureState.LJIIIZ);
            return;
        }
        WindowManager windowManager = (WindowManager) this.LIZIZ.getSystemService("window");
        if (windowManager != null && panelFeatureState.LJIILJJIL && panelFeatureState.LJI != null) {
            LIZ(windowManager, panelFeatureState.LJI);
            if (z) {
                LIZ(panelFeatureState.LIZ, panelFeatureState, (Menu) null);
            }
        }
        panelFeatureState.LJIIL = false;
        panelFeatureState.LJIILIIL = false;
        panelFeatureState.LJIILJJIL = false;
        panelFeatureState.LJII = null;
        panelFeatureState.LJIILLIIL = true;
        if (this.LJJIZ != panelFeatureState) {
            return;
        }
        this.LJJIZ = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0016, code lost:
        if (r4 != null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x000d, code lost:
        if (r4 != null) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void LIZ(int r3, androidx.appcompat.app.AppCompatDelegateImpl.PanelFeatureState r4, android.view.Menu r5) {
        /*
            r2 = this;
            if (r5 != 0) goto L16
            if (r4 != 0) goto Lf
            if (r3 < 0) goto L19
            androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState[] r1 = r2.LJJIL
            int r0 = r1.length
            if (r3 >= r0) goto L19
            r4 = r1[r3]
            if (r4 == 0) goto L19
        Lf:
            androidx.appcompat.view.menu.g r5 = r4.LJIIIZ
        L11:
            boolean r0 = r4.LJIILJJIL
            if (r0 != 0) goto L19
            return
        L16:
            if (r4 == 0) goto L19
            goto L11
        L19:
            boolean r0 = r2.LJIIZILJ
            if (r0 != 0) goto L26
            X.cxq r0 = r2.LJJII
            android.view.Window$Callback r0 = r0.getWrapped()
            r0.onPanelClosed(r3, r5)
        L26:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.LIZ(int, androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState, android.view.Menu):void");
    }

    public final PanelFeatureState LIZ(Menu menu) {
        PanelFeatureState[] panelFeatureStateArr = this.LJJIL;
        if (panelFeatureStateArr != null) {
            for (PanelFeatureState panelFeatureState : panelFeatureStateArr) {
                if (panelFeatureState != null && panelFeatureState.LJIIIZ == menu) {
                    return panelFeatureState;
                }
            }
            return null;
        }
        return null;
    }

    private boolean LIZ(PanelFeatureState panelFeatureState, int i, KeyEvent keyEvent, int i2) {
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((!panelFeatureState.LJIIL && !LIZIZ(panelFeatureState, keyEvent)) || panelFeatureState.LJIIIZ == null) {
            return false;
        }
        return panelFeatureState.LJIIIZ.performShortcut(i, keyEvent, 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b6, code lost:
        if (r9 != false) goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int LIZ(androidx.core.view.WindowInsetsCompat r12, android.graphics.Rect r13) {
        /*
            Method dump skipped, instructions count: 314
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.LIZ(androidx.core.view.WindowInsetsCompat, android.graphics.Rect):int");
    }

    private boolean LIZ(boolean z) {
        if (this.LJIIZILJ) {
            return false;
        }
        int LJIIL = LJIIL();
        boolean LIZ = LIZ(LIZ(this.LIZIZ, LJIIL), z);
        if (LJIIL == 0) {
            LIZ(this.LIZIZ).LIZLLL();
        } else {
            AbstractC63109AvP abstractC63109AvP = this.LJJJJL;
            if (abstractC63109AvP != null) {
                abstractC63109AvP.m24400LJ();
            }
            if (LJIIL == 3) {
                LIZIZ(this.LIZIZ).LIZLLL();
                return LIZ;
            }
        }
        AbstractC63109AvP abstractC63109AvP2 = this.LJJJJLI;
        if (abstractC63109AvP2 != null) {
            abstractC63109AvP2.m24400LJ();
        }
        return LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean LIZ(int r8, boolean r9) {
        /*
            r7 = this;
            android.content.Context r0 = r7.LIZIZ
            r6 = 0
            android.content.res.Configuration r1 = LIZ(r0, r8, r6)
            boolean r5 = r7.LJIILIIL()
            android.content.Context r0 = r7.LIZIZ
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r0 = r0.uiMode
            r4 = r0 & 48
            int r0 = r1.uiMode
            r3 = r0 & 48
            r0 = 1
            if (r4 == r3) goto L52
            if (r9 == 0) goto L52
            if (r5 != 0) goto L52
            boolean r0 = r7.LJJJI
            if (r0 == 0) goto L52
            boolean r0 = androidx.appcompat.app.AppCompatDelegateImpl.LJJ
            if (r0 != 0) goto L30
            boolean r0 = r7.LJJJIL
            if (r0 == 0) goto L52
        L30:
            java.lang.Object r1 = r7.LIZ
            boolean r0 = r1 instanceof android.app.Activity
            if (r0 == 0) goto L52
            android.app.Activity r1 = (android.app.Activity) r1
            boolean r0 = r1.isChild()
            if (r0 != 0) goto L52
            java.lang.Object r0 = r7.LIZ
            android.app.Activity r0 = (android.app.Activity) r0
            androidx.core.app.ActivityCompat.recreate(r0)
            r2 = 1
        L46:
            java.lang.Object r1 = r7.LIZ
            boolean r0 = r1 instanceof androidx.appcompat.app.AppCompatActivity
            if (r0 == 0) goto L51
            androidx.appcompat.app.AppCompatActivity r1 = (androidx.appcompat.app.AppCompatActivity) r1
            r1.onNightModeChanged(r8)
        L51:
            return r2
        L52:
            r2 = 0
            if (r4 == r3) goto L51
            r7.LIZ(r3, r5, r6)
            r2 = 1
            goto L46
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.LIZ(int, boolean):boolean");
    }

    public final Window.Callback LIZ() {
        return this.LIZJ.getCallback();
    }

    public final void LIZJ() {
        ViewPropertyAnimatorCompat viewPropertyAnimatorCompat = this.LJIIJ;
        if (viewPropertyAnimatorCompat != null) {
            viewPropertyAnimatorCompat.cancel();
        }
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public boolean applyDayNight() {
        return LIZ(true);
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final C5LA getDrawerToggleDelegate() {
        return new C138466cxy(this);
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public AbstractC138457cxp getSupportActionBar() {
        m21203LJ();
        return this.f20220LJ;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void onStart() {
        this.LJJJJ = true;
        applyDayNight();
    }

    /* loaded from: classes17.dex */
    public static final class PanelFeatureState {
        public int LIZ;
        public int LIZIZ;
        public int LIZJ;
        public int LIZLLL;

        /* renamed from: LJ */
        public int f20221LJ;
        public int LJFF;
        public ViewGroup LJI;
        public View LJII;
        public View LJIIIIZZ;
        public C0199g LJIIIZ;
        public C138411cx5 LJIIJ;
        public Context LJIIJJI;
        public boolean LJIIL;
        public boolean LJIILIIL;
        public boolean LJIILJJIL;
        public boolean LJIILL;
        public boolean LJIILLIIL;
        public boolean LJIIZILJ;
        public Bundle LJIJ;

        static {
            Covode.recordClassIndex(467);
        }

        /* loaded from: classes17.dex */
        public static class SavedState implements Parcelable {
            public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: androidx.appcompat.app.AppCompatDelegateImpl.PanelFeatureState.SavedState.1
                static {
                    Covode.recordClassIndex(469);
                }

                @Override // android.os.Parcelable.Creator
                public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                    return new SavedState[i];
                }

                @Override // android.os.Parcelable.Creator
                public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                    return SavedState.LIZ(parcel, null);
                }

                @Override // android.os.Parcelable.ClassLoaderCreator
                public final /* synthetic */ SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return SavedState.LIZ(parcel, classLoader);
                }
            };
            public int LIZ;
            public boolean LIZIZ;
            public Bundle LIZJ;

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            static {
                Covode.recordClassIndex(468);
            }

            public static SavedState LIZ(Parcel parcel, ClassLoader classLoader) {
                SavedState savedState = new SavedState();
                savedState.LIZ = parcel.readInt();
                boolean z = true;
                if (parcel.readInt() != 1) {
                    z = false;
                }
                savedState.LIZIZ = z;
                if (savedState.LIZIZ) {
                    savedState.LIZJ = parcel.readBundle(classLoader);
                }
                return savedState;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.LIZ);
                parcel.writeInt(this.LIZIZ ? 1 : 0);
                if (this.LIZIZ) {
                    parcel.writeBundle(this.LIZJ);
                }
            }
        }

        public final boolean LIZ() {
            if (this.LJII == null) {
                return false;
            }
            if (this.LJIIIIZZ == null && this.LJIIJ.LIZ().getCount() <= 0) {
                return false;
            }
            return true;
        }

        public PanelFeatureState(int i) {
            this.LIZ = i;
        }

        public final void LIZ(C0199g c0199g) {
            C138411cx5 c138411cx5;
            C0199g c0199g2 = this.LJIIIZ;
            if (c0199g == c0199g2) {
                return;
            }
            if (c0199g2 != null) {
                c0199g2.removeMenuPresenter(this.LJIIJ);
            }
            this.LJIIIZ = c0199g;
            if (c0199g != null && (c138411cx5 = this.LJIIJ) != null) {
                c0199g.addMenuPresenter(c138411cx5);
            }
        }

        public final AbstractC138363cwJ LIZ(AbstractC138390cwk abstractC138390cwk) {
            if (this.LJIIIZ == null) {
                return null;
            }
            if (this.LJIIJ == null) {
                this.LJIIJ = new C138411cx5(this.LJIIJJI, 2131689503);
                this.LJIIJ.setCallback(abstractC138390cwk);
                this.LJIIIZ.addMenuPresenter(this.LJIIJ);
            }
            return this.LJIIJ.LIZ(this.LJI);
        }

        public final void LIZ(Context context) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme newTheme = context.getResources().newTheme();
            newTheme.setTo(context.getTheme());
            newTheme.resolveAttribute(2130772124, typedValue, true);
            if (typedValue.resourceId != 0) {
                newTheme.applyStyle(typedValue.resourceId, true);
            }
            newTheme.resolveAttribute(2130773866, typedValue, true);
            if (typedValue.resourceId != 0) {
                newTheme.applyStyle(typedValue.resourceId, true);
            } else {
                newTheme.applyStyle(2131493389, true);
            }
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, 0);
            contextThemeWrapper.getTheme().setTo(newTheme);
            this.LJIIJJI = contextThemeWrapper;
            TypedArray obtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(new int[]{16842839, 16842926, 2130771991, 2130771992, 2130772000, 2130772009, 2130772010, 2130772122, 2130772123, 2130772124, 2130772125, 2130772126, 2130772127, 2130772128, 2130772129, 2130772130, 2130772131, 2130772132, 2130772133, 2130772134, 2130772137, 2130772138, 2130772142, 2130772143, 2130772144, 2130772145, 2130772146, 2130772147, 2130772148, 2130772149, 2130772150, 2130772151, 2130772152, 2130772153, 2130772154, 2130772155, 2130772156, 2130772157, 2130772158, 2130772165, 2130772171, 2130772172, 2130772173, 2130772174, 2130772206, 2130772208, 2130772211, 2130772213, 2130772471, 2130772512, 2130772513, 2130772514, 2130772515, 2130772516, 2130772527, 2130772528, 2130772562, 2130772568, 2130772753, 2130772754, 2130772755, 2130772758, 2130772804, 2130772914, 2130772920, 2130772921, 2130772935, 2130772944, 2130772998, 2130773053, 2130773054, 2130773056, 2130773210, 2130773211, 2130773244, 2130773333, 2130773633, 2130773634, 2130773635, 2130773636, 2130773639, 2130773640, 2130773641, 2130773642, 2130773643, 2130773644, 2130773645, 2130773646, 2130773647, 2130773865, 2130773866, 2130773867, 2130773939, 2130773941, 2130774052, 2130774077, 2130774078, 2130774079, 2130774331, 2130774340, 2130774455, 2130774612, 2130774696, 2130774697, 2130774698, 2130774699, 2130774701, 2130774702, 2130774703, 2130774704, 2130774710, 2130774711, 2130774802, 2130774803, 2130774808, 2130774809, 2130775022, 2130775087, 2130775088, 2130775089, 2130775090, 2130775091, 2130775092, 2130775094, 2130775095});
            this.LIZIZ = obtainStyledAttributes.getResourceId(89, 0);
            this.LJFF = obtainStyledAttributes.getResourceId(1, 0);
            obtainStyledAttributes.recycle();
        }
    }

    private CharSequence LJIIJ() {
        Object obj = this.LIZ;
        if (obj instanceof Activity) {
            return ((Activity) obj).getTitle();
        }
        return this.LJJIII;
    }

    private void LJIIJJI() {
        if (!this.LJJIJ) {
            return;
        }
        throw new AndroidRuntimeException("Window feature must be requested before adding content");
    }

    private int LJIIL() {
        int i = this.LJJJJI;
        if (i != -100) {
            return i;
        }
        return AppCompatDelegate.getDefaultNightMode();
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void onPostResume() {
        AbstractC138457cxp supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.LIZJ(true);
        }
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void onStop() {
        this.LJJJJ = false;
        AbstractC138457cxp supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.LIZJ(false);
        }
    }

    private Context LJFF() {
        Context LIZJ;
        AbstractC138457cxp supportActionBar = getSupportActionBar();
        if (supportActionBar == null || (LIZJ = supportActionBar.LIZJ()) == null) {
            return this.LIZIZ;
        }
        return LIZJ;
    }

    private void LJI() {
        if (this.LIZJ == null) {
            Object obj = this.LIZ;
            if (obj instanceof Activity) {
                LIZ(((Activity) obj).getWindow());
            }
        }
        if (this.LIZJ != null) {
            return;
        }
        throw new IllegalStateException("We have not been given a Window");
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public MenuInflater getMenuInflater() {
        Context context;
        if (this.LJFF == null) {
            m21203LJ();
            AbstractC138457cxp abstractC138457cxp = this.f20220LJ;
            if (abstractC138457cxp != null) {
                context = abstractC138457cxp.LIZJ();
            } else {
                context = this.LIZIZ;
            }
            this.LJFF = new C138419cxD(context);
        }
        return this.LJFF;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void installViewFactory() {
        LayoutInflater from = LayoutInflater.from(this.LIZIZ);
        if (from.getFactory() == null) {
            C135099c5W.LIZ(from, this);
        } else {
            from.getFactory2();
        }
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void invalidateOptionsMenu() {
        AbstractC138457cxp supportActionBar = getSupportActionBar();
        if (supportActionBar != null && supportActionBar.LJFF()) {
            return;
        }
        m21202LJ(0);
    }

    /* renamed from: LJ */
    private void m21203LJ() {
        LJII();
        if (this.LJIIL && this.f20220LJ == null) {
            Object obj = this.LIZ;
            if (obj instanceof Activity) {
                this.f20220LJ = new C138443cxb((Activity) obj, this.LJIILIIL);
            } else if (obj instanceof Dialog) {
                this.f20220LJ = new C138443cxb((Dialog) obj);
            }
            AbstractC138457cxp abstractC138457cxp = this.f20220LJ;
            if (abstractC138457cxp != null) {
                abstractC138457cxp.LIZIZ(this.LJJJJZ);
            }
        }
    }

    public final boolean LIZIZ() {
        ViewGroup viewGroup;
        if (this.LJJIJ && (viewGroup = this.LJIIJJI) != null && ViewCompat.isLaidOut(viewGroup)) {
            return true;
        }
        return false;
    }

    public final void LIZLLL() {
        AbstractC138463cxv abstractC138463cxv = this.LJJIIJ;
        if (abstractC138463cxv != null) {
            abstractC138463cxv.LJII();
        }
        if (this.LJIIIIZZ != null) {
            this.LIZJ.getDecorView().removeCallbacks(this.LJIIIZ);
            if (this.LJIIIIZZ.isShowing()) {
                try {
                    C116971W2r.LIZ(this.LJIIIIZZ);
                } catch (IllegalArgumentException unused) {
                }
            }
            this.LJIIIIZZ = null;
        }
        LIZJ();
        PanelFeatureState LIZJ = LIZJ(0);
        if (LIZJ != null && LIZJ.LJIIIZ != null) {
            LIZJ.LJIIIZ.close();
        }
    }

    static {
        if (ReDexClinitStringAb.abTest >= 5) {
            clinit$r$fake();
            return;
        }
        Covode.recordClassIndex(458);
        LJIJJ = new SimpleArrayMap<>();
        int i = Build.VERSION.SDK_INT;
        LJIJJLI = false;
        LJIL = new int[]{16842836};
        LJJ = !"robolectric".equals(Build.FINGERPRINT);
        int i2 = Build.VERSION.SDK_INT;
        LJJI = true;
        if (LJIJJLI && !LJJIFFI) {
            Thread.setDefaultUncaughtExceptionHandler(new C01881(Thread.getDefaultUncaughtExceptionHandler()));
            LJJIFFI = true;
        }
    }

    private void LJII() {
        if (!this.LJJIJ) {
            this.LJIIJJI = LJIIIIZZ();
            CharSequence LJIIJ = LJIIJ();
            if (!TextUtils.isEmpty(LJIIJ)) {
                AbstractC138463cxv abstractC138463cxv = this.LJJIIJ;
                if (abstractC138463cxv != null) {
                    abstractC138463cxv.setWindowTitle(LJIIJ);
                } else {
                    AbstractC138457cxp abstractC138457cxp = this.f20220LJ;
                    if (abstractC138457cxp != null) {
                        abstractC138457cxp.LIZ(LJIIJ);
                    } else {
                        TextView textView = this.LJJIJIIJI;
                        if (textView != null) {
                            textView.setText(LJIIJ);
                        }
                    }
                }
            }
            LJIIIZ();
            this.LJJIJ = true;
            PanelFeatureState LIZJ = LIZJ(0);
            if (!this.LJIIZILJ) {
                if (LIZJ == null || LIZJ.LJIIIZ == null) {
                    m21202LJ(108);
                }
            }
        }
    }

    private boolean LJIILIIL() {
        int i;
        boolean z;
        if (!this.LJJJJJL && (this.LIZ instanceof Activity)) {
            PackageManager packageManager = this.LIZIZ.getPackageManager();
            if (packageManager == null) {
                return false;
            }
            try {
                if (Build.VERSION.SDK_INT >= 29) {
                    i = 269221888;
                } else if (Build.VERSION.SDK_INT >= 24) {
                    i = 786432;
                } else {
                    i = 0;
                }
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(this.LIZIZ, this.LIZ.getClass()), i);
                if (activityInfo != null && (activityInfo.configChanges & 512) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                this.LJJJJJ = z;
            } catch (PackageManager.NameNotFoundException unused) {
                this.LJJJJJ = false;
            }
        }
        this.LJJJJJL = true;
        return this.LJJJJJ;
    }

    private static void clinit$r$fake() {
        Covode.recordClassIndex(458);
        LJIJJ = new SimpleArrayMap<>();
        int i = Build.VERSION.SDK_INT;
        LJIJJLI = false;
        LJIL = new int[]{16842836};
        LJJ = !"robolectric".equals(Build.FINGERPRINT);
        int i2 = Build.VERSION.SDK_INT;
        LJJI = true;
        if (LJIJJLI && !LJJIFFI) {
            Thread.setDefaultUncaughtExceptionHandler(new C01881(Thread.getDefaultUncaughtExceptionHandler()));
            LJJIFFI = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    @Override // androidx.appcompat.app.AppCompatDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onDestroy() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.LIZ
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L9
            androidx.appcompat.app.AppCompatDelegate.removeActivityDelegate(r3)
        L9:
            boolean r0 = r3.LJIJ
            if (r0 == 0) goto L18
            android.view.Window r0 = r3.LIZJ
            android.view.View r1 = r0.getDecorView()
            java.lang.Runnable r0 = r3.LJJJJLL
            r1.removeCallbacks(r0)
        L18:
            r0 = 0
            r3.LJJJJ = r0
            r0 = 1
            r3.LJIIZILJ = r0
            int r1 = r3.LJJJJI
            r0 = -100
            if (r1 == r0) goto L5d
            java.lang.Object r1 = r3.LIZ
            boolean r0 = r1 instanceof android.app.Activity
            if (r0 == 0) goto L5d
            android.app.Activity r1 = (android.app.Activity) r1
            boolean r0 = r1.isChangingConfigurations()
            if (r0 == 0) goto L5d
            androidx.collection.SimpleArrayMap<java.lang.String, java.lang.Integer> r2 = androidx.appcompat.app.AppCompatDelegateImpl.LJIJJ
            java.lang.Object r0 = r3.LIZ
            java.lang.Class r0 = r0.getClass()
            java.lang.String r1 = r0.getName()
            int r0 = r3.LJJJJI
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.put(r1, r0)
        L47:
            X.cxp r0 = r3.f20220LJ
            if (r0 == 0) goto L4e
            r0.LJII()
        L4e:
            X.AvP r0 = r3.LJJJJL
            if (r0 == 0) goto L55
            r0.m24400LJ()
        L55:
            X.AvP r0 = r3.LJJJJLI
            if (r0 == 0) goto L5c
            r0.m24400LJ()
        L5c:
            return
        L5d:
            androidx.collection.SimpleArrayMap<java.lang.String, java.lang.Integer> r1 = androidx.appcompat.app.AppCompatDelegateImpl.LJIJJ
            java.lang.Object r0 = r3.LIZ
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getName()
            r1.remove(r0)
            goto L47
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.onDestroy():void");
    }

    private void LJIIIZ() {
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.LJIIJJI.findViewById(16908290);
        View decorView = this.LIZJ.getDecorView();
        contentFrameLayout.LIZ(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray obtainStyledAttributes = this.LIZIZ.obtainStyledAttributes(new int[]{16842839, 16842926, 2130771991, 2130771992, 2130772000, 2130772009, 2130772010, 2130772122, 2130772123, 2130772124, 2130772125, 2130772126, 2130772127, 2130772128, 2130772129, 2130772130, 2130772131, 2130772132, 2130772133, 2130772134, 2130772137, 2130772138, 2130772142, 2130772143, 2130772144, 2130772145, 2130772146, 2130772147, 2130772148, 2130772149, 2130772150, 2130772151, 2130772152, 2130772153, 2130772154, 2130772155, 2130772156, 2130772157, 2130772158, 2130772165, 2130772171, 2130772172, 2130772173, 2130772174, 2130772206, 2130772208, 2130772211, 2130772213, 2130772471, 2130772512, 2130772513, 2130772514, 2130772515, 2130772516, 2130772527, 2130772528, 2130772562, 2130772568, 2130772753, 2130772754, 2130772755, 2130772758, 2130772804, 2130772914, 2130772920, 2130772921, 2130772935, 2130772944, 2130772998, 2130773053, 2130773054, 2130773056, 2130773210, 2130773211, 2130773244, 2130773333, 2130773633, 2130773634, 2130773635, 2130773636, 2130773639, 2130773640, 2130773641, 2130773642, 2130773643, 2130773644, 2130773645, 2130773646, 2130773647, 2130773865, 2130773866, 2130773867, 2130773939, 2130773941, 2130774052, 2130774077, 2130774078, 2130774079, 2130774331, 2130774340, 2130774455, 2130774612, 2130774696, 2130774697, 2130774698, 2130774699, 2130774701, 2130774702, 2130774703, 2130774704, 2130774710, 2130774711, 2130774802, 2130774803, 2130774808, 2130774809, 2130775022, 2130775087, 2130775088, 2130775089, 2130775090, 2130775091, 2130775092, 2130775094, 2130775095});
        obtainStyledAttributes.getValue(123, contentFrameLayout.getMinWidthMajor());
        obtainStyledAttributes.getValue(124, contentFrameLayout.getMinWidthMinor());
        if (obtainStyledAttributes.hasValue(121)) {
            obtainStyledAttributes.getValue(121, contentFrameLayout.getFixedWidthMajor());
        }
        if (obtainStyledAttributes.hasValue(OpenAuthTask.f22015g)) {
            obtainStyledAttributes.getValue(OpenAuthTask.f22015g, contentFrameLayout.getFixedWidthMinor());
        }
        if (obtainStyledAttributes.hasValue(119)) {
            obtainStyledAttributes.getValue(119, contentFrameLayout.getFixedHeightMajor());
        }
        if (obtainStyledAttributes.hasValue(120)) {
            obtainStyledAttributes.getValue(120, contentFrameLayout.getFixedHeightMinor());
        }
        obtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0067, code lost:
        if (r4 != null) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private android.view.ViewGroup LJIIIIZZ() {
        /*
            Method dump skipped, instructions count: 676
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.LJIIIIZZ():android.view.ViewGroup");
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void onPostCreate(Bundle bundle) {
        LJII();
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void setHandleNativeActionModesEnabled(boolean z) {
        this.LJJIIZI = z;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void setTheme(int i) {
        this.LJJJJIZL = i;
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$1 */
    /* loaded from: classes2.dex */
    public class C01881 implements Thread.UncaughtExceptionHandler {
        public final /* synthetic */ Thread.UncaughtExceptionHandler LIZ;

        static {
            Covode.recordClassIndex(459);
        }

        public C01881(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            this.LIZ = uncaughtExceptionHandler;
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public final void uncaughtException(Thread thread, Throwable th) {
            String message;
            if ((th instanceof Resources.NotFoundException) && (message = th.getMessage()) != null && (message.contains("drawable") || message.contains("Drawable"))) {
                new StringBuilder();
                Resources.NotFoundException notFoundException = new Resources.NotFoundException(C0002O.m25086C(th.getMessage(), ". If the resource you are trying to use is a vector resource, you may be referencing it in an unsupported way. See AppCompatDelegate.setCompatVectorFromResourcesEnabled() for more info."));
                notFoundException.initCause(th.getCause());
                notFoundException.setStackTrace(th.getStackTrace());
                this.LIZ.uncaughtException(thread, notFoundException);
                return;
            }
            this.LIZ.uncaughtException(thread, th);
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$4 */
    /* loaded from: classes22.dex */
    public class C01914 implements C4V4 {
        static {
            Covode.recordClassIndex(462);
        }

        public C01914() {
        }

        @Override // p003X.C4V4
        public final void LIZ(Rect rect) {
            rect.top = AppCompatDelegateImpl.this.LIZ((WindowInsetsCompat) null, rect);
        }
    }

    private AbstractC63109AvP LIZIZ(Context context) {
        if (this.LJJJJLI == null) {
            this.LJJJJLI = new C65471BsP(this, context);
        }
        return this.LJJJJLI;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public <T extends View> T findViewById(int i) {
        LJII();
        return (T) this.LIZJ.findViewById(i);
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void setLocalNightMode(int i) {
        if (this.LJJJJI != i) {
            this.LJJJJI = i;
            if (this.LJJJI) {
                applyDayNight();
            }
        }
    }

    private AbstractC63109AvP LIZ(Context context) {
        if (this.LJJJJL == null) {
            this.LJJJJL = new C144002ePU(this, C116982W3c.LIZ(context));
        }
        return this.LJJJJL;
    }

    /* renamed from: LJ */
    private void m21202LJ(int i) {
        this.LJIJI = (1 << i) | this.LJIJI;
        if (!this.LJIJ) {
            ViewCompat.postOnAnimation(this.LIZJ.getDecorView(), this.LJJJJLL);
            this.LJIJ = true;
        }
    }

    public final void LIZIZ(int i) {
        LIZ(LIZJ(0), true);
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void onConfigurationChanged(Configuration configuration) {
        AbstractC138457cxp supportActionBar;
        if (this.LJIIL && this.LJJIJ && (supportActionBar = getSupportActionBar()) != null) {
            supportActionBar.LIZ(configuration);
        }
        AppCompatDrawableManager.get().onConfigurationChanged(this.LIZIZ);
        LIZ(false);
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void setContentView(View view) {
        LJII();
        ViewGroup viewGroup = (ViewGroup) this.LJIIJJI.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.LJJII.getWrapped().onContentChanged();
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final void setTitle(CharSequence charSequence) {
        this.LJJIII = charSequence;
        AbstractC138463cxv abstractC138463cxv = this.LJJIIJ;
        if (abstractC138463cxv != null) {
            abstractC138463cxv.setWindowTitle(charSequence);
            return;
        }
        AbstractC138457cxp abstractC138457cxp = this.f20220LJ;
        if (abstractC138457cxp != null) {
            abstractC138457cxp.LIZ(charSequence);
            return;
        }
        TextView textView = this.LJJIJIIJI;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    private boolean LIZJ(PanelFeatureState panelFeatureState) {
        if (panelFeatureState.LJIIIIZZ != null) {
            panelFeatureState.LJII = panelFeatureState.LJIIIIZZ;
            return true;
        } else if (panelFeatureState.LJIIIZ == null) {
            return false;
        } else {
            if (this.LJJIIZ == null) {
                this.LJJIIZ = new C138462cxu(this);
            }
            panelFeatureState.LJII = (View) panelFeatureState.LIZ(this.LJJIIZ);
            if (panelFeatureState.LJII != null) {
                return true;
            }
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x001c, code lost:
        if (r0 == false) goto L17;
     */
    @Override // androidx.appcompat.app.AppCompatDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean hasWindowFeature(int r5) {
        /*
            r4 = this;
            int r3 = LJFF(r5)
            r2 = 1
            r1 = 0
            if (r3 == r2) goto L33
            r0 = 2
            if (r3 == r0) goto L30
            r0 = 5
            if (r3 == r0) goto L2d
            r0 = 10
            if (r3 == r0) goto L2a
            r0 = 108(0x6c, float:1.51E-43)
            if (r3 == r0) goto L27
            r0 = 109(0x6d, float:1.53E-43)
            if (r3 != r0) goto L1e
            boolean r0 = r4.LJIILIIL
        L1c:
            if (r0 != 0) goto L36
        L1e:
            android.view.Window r0 = r4.LIZJ
            boolean r0 = r0.hasFeature(r5)
            if (r0 != 0) goto L36
            return r1
        L27:
            boolean r0 = r4.LJIIL
            goto L1c
        L2a:
            boolean r0 = r4.LJIILJJIL
            goto L1c
        L2d:
            boolean r0 = r4.LJJIJL
            goto L1c
        L30:
            boolean r0 = r4.LJJIJIL
            goto L1c
        L33:
            boolean r0 = r4.LJIILLIIL
            goto L1c
        L36:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.hasWindowFeature(int):boolean");
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void onCreate(Bundle bundle) {
        this.LJJJI = true;
        LIZ(false);
        LJI();
        Object obj = this.LIZ;
        if (obj instanceof Activity) {
            String str = null;
            try {
                str = C74776Fe6.LIZIZ((Activity) obj);
            } catch (IllegalArgumentException unused) {
            }
            if (str != null) {
                AbstractC138457cxp abstractC138457cxp = this.f20220LJ;
                if (abstractC138457cxp == null) {
                    this.LJJJJZ = true;
                } else {
                    abstractC138457cxp.LIZIZ(true);
                }
            }
            AppCompatDelegate.addActiveDelegate(this);
        }
        this.LJJJIL = true;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void setContentView(int i) {
        LJII();
        ViewGroup viewGroup = (ViewGroup) this.LJIIJJI.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.LIZIZ).inflate(i, viewGroup);
        this.LJJII.getWrapped().onContentChanged();
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public AbstractC138442cxa startSupportActionMode(AbstractC138451cxj abstractC138451cxj) {
        AbstractC138468cy0 abstractC138468cy0;
        if (abstractC138451cxj != null) {
            AbstractC138442cxa abstractC138442cxa = this.LJI;
            if (abstractC138442cxa != null) {
                abstractC138442cxa.LIZJ();
            }
            C138459cxr c138459cxr = new C138459cxr(this, abstractC138451cxj);
            AbstractC138457cxp supportActionBar = getSupportActionBar();
            if (supportActionBar != null) {
                this.LJI = supportActionBar.LIZ(c138459cxr);
                AbstractC138442cxa abstractC138442cxa2 = this.LJI;
                if (abstractC138442cxa2 != null && (abstractC138468cy0 = this.LIZLLL) != null) {
                    abstractC138468cy0.onSupportActionModeStarted(abstractC138442cxa2);
                }
            }
            if (this.LJI == null) {
                this.LJI = LIZ(c138459cxr);
            }
            return this.LJI;
        }
        throw new IllegalArgumentException("ActionMode callback can not be null.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x006b, code lost:
        if (r2 != null) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean LIZIZ(androidx.appcompat.app.AppCompatDelegateImpl.PanelFeatureState r8) {
        /*
            r7 = this;
            android.content.Context r4 = r7.LIZIZ
            int r0 = r8.LIZ
            r3 = 1
            if (r0 == 0) goto Ld
            int r1 = r8.LIZ
            r0 = 108(0x6c, float:1.51E-43)
            if (r1 != r0) goto L5f
        Ld:
            X.cxv r0 = r7.LJJIIJ
            if (r0 == 0) goto L5f
            android.util.TypedValue r6 = new android.util.TypedValue
            r6.<init>()
            android.content.res.Resources$Theme r5 = r4.getTheme()
            r0 = 2130772133(0x7f0100a5, float:1.7147376E38)
            r5.resolveAttribute(r0, r6, r3)
            r2 = 0
            int r0 = r6.resourceId
            r1 = 2130772134(0x7f0100a6, float:1.7147378E38)
            if (r0 == 0) goto L6e
            android.content.res.Resources r0 = r4.getResources()
            android.content.res.Resources$Theme r2 = r0.newTheme()
            r2.setTo(r5)
            int r0 = r6.resourceId
            r2.applyStyle(r0, r3)
            r2.resolveAttribute(r1, r6, r3)
        L3b:
            int r0 = r6.resourceId
            if (r0 == 0) goto L6b
            if (r2 != 0) goto L4c
            android.content.res.Resources r0 = r4.getResources()
            android.content.res.Resources$Theme r2 = r0.newTheme()
            r2.setTo(r5)
        L4c:
            int r0 = r6.resourceId
            r2.applyStyle(r0, r3)
        L51:
            androidx.appcompat.view.ContextThemeWrapper r1 = new androidx.appcompat.view.ContextThemeWrapper
            r0 = 0
            r1.<init>(r4, r0)
            android.content.res.Resources$Theme r0 = r1.getTheme()
            r0.setTo(r2)
            r4 = r1
        L5f:
            androidx.appcompat.view.menu.g r0 = new androidx.appcompat.view.menu.g
            r0.<init>(r4)
            r0.setCallback(r7)
            r8.LIZ(r0)
            return r3
        L6b:
            if (r2 == 0) goto L5f
            goto L51
        L6e:
            r5.resolveAttribute(r1, r6, r3)
            goto L3b
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.LIZIZ(androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState):boolean");
    }

    public final PanelFeatureState LIZJ(int i) {
        PanelFeatureState[] panelFeatureStateArr = this.LJJIL;
        if (panelFeatureStateArr == null || panelFeatureStateArr.length <= i) {
            PanelFeatureState[] panelFeatureStateArr2 = new PanelFeatureState[i + 1];
            if (panelFeatureStateArr != null) {
                System.arraycopy(panelFeatureStateArr, 0, panelFeatureStateArr2, 0, panelFeatureStateArr.length);
            }
            this.LJJIL = panelFeatureStateArr2;
            panelFeatureStateArr = panelFeatureStateArr2;
        }
        PanelFeatureState panelFeatureState = panelFeatureStateArr[i];
        if (panelFeatureState == null) {
            PanelFeatureState panelFeatureState2 = new PanelFeatureState(i);
            panelFeatureStateArr[i] = panelFeatureState2;
            return panelFeatureState2;
        }
        return panelFeatureState;
    }

    public final void LIZLLL(int i) {
        PanelFeatureState LIZJ;
        PanelFeatureState LIZJ2 = LIZJ(i);
        if (LIZJ2.LJIIIZ != null) {
            Bundle bundle = new Bundle();
            LIZJ2.LJIIIZ.saveActionViewStates(bundle);
            if (bundle.size() > 0) {
                LIZJ2.LJIJ = bundle;
            }
            LIZJ2.LJIIIZ.stopDispatchingItemsChanged();
            LIZJ2.LJIIIZ.clear();
        }
        LIZJ2.LJIIZILJ = true;
        LIZJ2.LJIILLIIL = true;
        if ((i == 108 || i == 0) && this.LJJIIJ != null && (LIZJ = LIZJ(0)) != null) {
            LIZJ.LJIIL = false;
            LIZIZ(LIZJ, null);
        }
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public boolean requestWindowFeature(int i) {
        int LJFF = LJFF(i);
        if (this.LJIILLIIL && LJFF == 108) {
            return false;
        }
        if (this.LJIIL && LJFF == 1) {
            this.LJIIL = false;
        } else if (LJFF != 1) {
            if (LJFF != 2) {
                if (LJFF != 5) {
                    if (LJFF != 10) {
                        if (LJFF != 108) {
                            if (LJFF != 109) {
                                return this.LIZJ.requestFeature(LJFF);
                            }
                            LJIIJJI();
                            this.LJIILIIL = true;
                            return true;
                        }
                        LJIIJJI();
                        this.LJIIL = true;
                        return true;
                    }
                    LJIIJJI();
                    this.LJIILJJIL = true;
                    return true;
                }
                LJIIJJI();
                this.LJJIJL = true;
                return true;
            }
            LJIIJJI();
            this.LJJIJIL = true;
            return true;
        }
        LJIIJJI();
        this.LJIILLIIL = true;
        return true;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void setSupportActionBar(Toolbar toolbar) {
        if (!(this.LIZ instanceof Activity)) {
            return;
        }
        AbstractC138457cxp supportActionBar = getSupportActionBar();
        if (!(supportActionBar instanceof C138443cxb)) {
            this.LJFF = null;
            if (supportActionBar != null) {
                supportActionBar.LJII();
            }
            if (toolbar != null) {
                C138446cxe c138446cxe = new C138446cxe(toolbar, LJIIJ(), this.LJJII);
                this.f20220LJ = c138446cxe;
                this.LIZJ.setCallback(c138446cxe.LIZJ);
            } else {
                this.f20220LJ = null;
                this.LIZJ.setCallback(this.LJJII);
            }
            invalidateOptionsMenu();
            return;
        }
        throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
    }

    @Override // p003X.AbstractC138401cwv
    public void onMenuModeChange(C0199g c0199g) {
        AbstractC138463cxv abstractC138463cxv = this.LJJIIJ;
        if (abstractC138463cxv != null && abstractC138463cxv.LIZIZ() && (!ViewConfiguration.get(this.LIZIZ).hasPermanentMenuKey() || this.LJJIIJ.LIZLLL())) {
            Window.Callback LIZ = LIZ();
            if (!this.LJJIIJ.LIZJ()) {
                if (LIZ != null && !this.LJIIZILJ) {
                    if (this.LJIJ && (1 & this.LJIJI) != 0) {
                        this.LIZJ.getDecorView().removeCallbacks(this.LJJJJLL);
                        this.LJJJJLL.run();
                    }
                    PanelFeatureState LIZJ = LIZJ(0);
                    if (LIZJ.LJIIIZ != null && !LIZJ.LJIIZILJ && LIZ.onPreparePanel(0, LIZJ.LJIIIIZZ, LIZJ.LJIIIZ)) {
                        LIZ.onMenuOpened(108, LIZJ.LJIIIZ);
                        this.LJJIIJ.mo21196LJ();
                        return;
                    }
                    return;
                }
                return;
            }
            this.LJJIIJ.LJFF();
            if (!this.LJIIZILJ) {
                LIZ.onPanelClosed(108, LIZJ(0).LJIIIZ);
                return;
            }
            return;
        }
        PanelFeatureState LIZJ2 = LIZJ(0);
        LIZJ2.LJIILLIIL = true;
        LIZ(LIZJ2, false);
        LIZ(LIZJ2, (KeyEvent) null);
    }

    private AbstractC138442cxa LIZ(AbstractC138451cxj abstractC138451cxj) {
        Context context;
        AbstractC138442cxa abstractC138442cxa;
        AbstractC138468cy0 abstractC138468cy0;
        AbstractC138442cxa onWindowStartingSupportActionMode;
        LIZJ();
        AbstractC138442cxa abstractC138442cxa2 = this.LJI;
        if (abstractC138442cxa2 != null) {
            abstractC138442cxa2.LIZJ();
        }
        AbstractC138468cy0 abstractC138468cy02 = this.LIZLLL;
        if (abstractC138468cy02 != null && !this.LJIIZILJ) {
            try {
                onWindowStartingSupportActionMode = abstractC138468cy02.onWindowStartingSupportActionMode(abstractC138451cxj);
            } catch (AbstractMethodError unused) {
            }
            if (onWindowStartingSupportActionMode != null) {
                this.LJI = onWindowStartingSupportActionMode;
                abstractC138442cxa = this.LJI;
                if (abstractC138442cxa != null && (abstractC138468cy0 = this.LIZLLL) != null) {
                    abstractC138468cy0.onSupportActionModeStarted(abstractC138442cxa);
                }
                return this.LJI;
            }
        }
        boolean z = true;
        if (this.LJII == null) {
            if (this.LJIILL) {
                TypedValue typedValue = new TypedValue();
                Resources.Theme theme = this.LIZIZ.getTheme();
                theme.resolveAttribute(2130772133, typedValue, true);
                if (typedValue.resourceId != 0) {
                    Resources.Theme newTheme = this.LIZIZ.getResources().newTheme();
                    newTheme.setTo(theme);
                    newTheme.applyStyle(typedValue.resourceId, true);
                    context = new ContextThemeWrapper(this.LIZIZ, 0);
                    context.getTheme().setTo(newTheme);
                } else {
                    context = this.LIZIZ;
                }
                this.LJII = new ActionBarContextView(context);
                this.LJIIIIZZ = new PopupWindow(context, (AttributeSet) null, 2130772151);
                LM4.LIZ(this.LJIIIIZZ, 2);
                this.LJIIIIZZ.setContentView(this.LJII);
                this.LJIIIIZZ.setWidth(-1);
                context.getTheme().resolveAttribute(2130772127, typedValue, true);
                this.LJII.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics()));
                this.LJIIIIZZ.setHeight(-2);
                this.LJIIIZ = new Runnable() { // from class: androidx.appcompat.app.AppCompatDelegateImpl.6
                    static {
                        Covode.recordClassIndex(464);
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        AppCompatDelegateImpl.this.LJIIIIZZ.showAtLocation(AppCompatDelegateImpl.this.LJII, 55, 0, 0);
                        AppCompatDelegateImpl.this.LIZJ();
                        if (AppCompatDelegateImpl.this.LIZIZ()) {
                            AppCompatDelegateImpl.this.LJII.setAlpha(0.0f);
                            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
                            ViewPropertyAnimatorCompat animate = ViewCompat.animate(appCompatDelegateImpl.LJII);
                            animate.alpha(1.0f);
                            appCompatDelegateImpl.LJIIJ = animate;
                            AppCompatDelegateImpl.this.LJIIJ.setListener(new C123028YbW() { // from class: androidx.appcompat.app.AppCompatDelegateImpl.6.1
                                static {
                                    Covode.recordClassIndex(465);
                                }

                                @Override // p003X.C123028YbW, p003X.AbstractC123023YbR
                                public final void LIZ(View view) {
                                    AppCompatDelegateImpl.this.LJII.setVisibility(0);
                                }

                                @Override // p003X.C123028YbW, p003X.AbstractC123023YbR
                                public final void LIZIZ(View view) {
                                    AppCompatDelegateImpl.this.LJII.setAlpha(1.0f);
                                    AppCompatDelegateImpl.this.LJIIJ.setListener(null);
                                    AppCompatDelegateImpl.this.LJIIJ = null;
                                }
                            });
                            return;
                        }
                        AppCompatDelegateImpl.this.LJII.setAlpha(1.0f);
                        AppCompatDelegateImpl.this.LJII.setVisibility(0);
                    }
                };
            } else {
                ViewStubCompat viewStubCompat = (ViewStubCompat) this.LJIIJJI.findViewById(2131165810);
                if (viewStubCompat != null) {
                    viewStubCompat.setLayoutInflater(LayoutInflater.from(LJFF()));
                    this.LJII = (ActionBarContextView) viewStubCompat.LIZ();
                }
            }
        }
        if (this.LJII != null) {
            LIZJ();
            this.LJII.LIZJ();
            Context context2 = this.LJII.getContext();
            ActionBarContextView actionBarContextView = this.LJII;
            if (this.LJIIIIZZ != null) {
                z = false;
            }
            C138440cxY c138440cxY = new C138440cxY(context2, actionBarContextView, abstractC138451cxj, z);
            if (abstractC138451cxj.LIZ(c138440cxY, c138440cxY.LIZIZ())) {
                c138440cxY.LIZLLL();
                this.LJII.LIZ(c138440cxY);
                this.LJI = c138440cxY;
                if (LIZIZ()) {
                    this.LJII.setAlpha(0.0f);
                    ViewPropertyAnimatorCompat animate = ViewCompat.animate(this.LJII);
                    animate.alpha(1.0f);
                    this.LJIIJ = animate;
                    this.LJIIJ.setListener(new C123028YbW() { // from class: androidx.appcompat.app.AppCompatDelegateImpl.7
                        static {
                            Covode.recordClassIndex(466);
                        }

                        @Override // p003X.C123028YbW, p003X.AbstractC123023YbR
                        public final void LIZIZ(View view) {
                            AppCompatDelegateImpl.this.LJII.setAlpha(1.0f);
                            AppCompatDelegateImpl.this.LJIIJ.setListener(null);
                            AppCompatDelegateImpl.this.LJIIJ = null;
                        }

                        @Override // p003X.C123028YbW, p003X.AbstractC123023YbR
                        public final void LIZ(View view) {
                            AppCompatDelegateImpl.this.LJII.setVisibility(0);
                            AppCompatDelegateImpl.this.LJII.sendAccessibilityEvent(32);
                            if (AppCompatDelegateImpl.this.LJII.getParent() instanceof View) {
                                ViewCompat.requestApplyInsets((View) AppCompatDelegateImpl.this.LJII.getParent());
                            }
                        }
                    });
                } else {
                    this.LJII.setAlpha(1.0f);
                    this.LJII.setVisibility(0);
                    this.LJII.sendAccessibilityEvent(32);
                    if (this.LJII.getParent() instanceof View) {
                        ViewCompat.requestApplyInsets((View) this.LJII.getParent());
                    }
                }
                if (this.LJIIIIZZ != null) {
                    this.LIZJ.getDecorView().post(this.LJIIIZ);
                }
            } else {
                this.LJI = null;
            }
        }
        abstractC138442cxa = this.LJI;
        if (abstractC138442cxa != null) {
            abstractC138468cy0.onSupportActionModeStarted(abstractC138442cxa);
        }
        return this.LJI;
    }

    /* JADX WARN: Code restructure failed: missing block: B:119:0x01cd, code lost:
        if (r0 != null) goto L110;
     */
    @Override // androidx.appcompat.app.AppCompatDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.content.Context attachBaseContext2(android.content.Context r7) {
        /*
            Method dump skipped, instructions count: 499
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.attachBaseContext2(android.content.Context):android.content.Context");
    }

    private void LIZ(Window window) {
        if (this.LIZJ == null) {
            Window.Callback callback = window.getCallback();
            if (!(callback instanceof C138458cxq)) {
                this.LJJII = new C138458cxq(this, callback);
                window.setCallback(this.LJJII);
                C138269cum LIZ = C138269cum.LIZ(this.LIZIZ, (AttributeSet) null, LJIL);
                Drawable LIZIZ = LIZ.LIZIZ(0);
                if (LIZIZ != null) {
                    window.setBackgroundDrawable(LIZIZ);
                }
                LIZ.LIZ();
                this.LIZJ = window;
                return;
            }
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        throw new IllegalStateException("AppCompat has already installed itself into the Window");
    }

    public AppCompatDelegateImpl(Activity activity, AbstractC138468cy0 abstractC138468cy0) {
        this(activity, null, abstractC138468cy0, activity);
    }

    public AppCompatDelegateImpl(Dialog dialog, AbstractC138468cy0 abstractC138468cy0) {
        this(dialog.getContext(), dialog.getWindow(), abstractC138468cy0, dialog);
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        LJII();
        ((ViewGroup) this.LJIIJJI.findViewById(16908290)).addView(view, layoutParams);
        this.LJJII.getWrapped().onContentChanged();
    }

    @Override // p003X.AbstractC138401cwv
    public boolean onMenuItemSelected(C0199g c0199g, MenuItem menuItem) {
        PanelFeatureState LIZ;
        Window.Callback LIZ2 = LIZ();
        if (LIZ2 != null && !this.LJIIZILJ && (LIZ = LIZ((Menu) c0199g.getRootMenu())) != null) {
            return LIZ2.onMenuItemSelected(LIZ.LIZ, menuItem);
        }
        return false;
    }

    private int LIZ(Context context, int i) {
        if (i == -100) {
            return -1;
        }
        if (i != -1) {
            if (i != 0) {
                if (i != 1 && i != 2) {
                    if (i == 3) {
                        return LIZIZ(context).LIZ();
                    }
                    throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                }
            } else if (Build.VERSION.SDK_INT >= 23 && ((UiModeManager) context.getApplicationContext().getSystemService(UiModeManager.class)).getNightMode() == 0) {
                return -1;
            } else {
                return LIZ(context).LIZ();
            }
        }
        return i;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        LJII();
        ViewGroup viewGroup = (ViewGroup) this.LJIIJJI.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.LJJII.getWrapped().onContentChanged();
    }

    private boolean LIZIZ(PanelFeatureState panelFeatureState, KeyEvent keyEvent) {
        boolean z;
        AbstractC138463cxv abstractC138463cxv;
        int i;
        boolean z2;
        AbstractC138463cxv abstractC138463cxv2;
        if (this.LJIIZILJ) {
            return false;
        }
        if (panelFeatureState.LJIIL) {
            return true;
        }
        PanelFeatureState panelFeatureState2 = this.LJJIZ;
        if (panelFeatureState2 != null && panelFeatureState2 != panelFeatureState) {
            LIZ(panelFeatureState2, false);
        }
        Window.Callback LIZ = LIZ();
        if (LIZ != null) {
            panelFeatureState.LJIIIIZZ = LIZ.onCreatePanelView(panelFeatureState.LIZ);
        }
        if (panelFeatureState.LIZ != 0 && panelFeatureState.LIZ != 108) {
            z = false;
        } else {
            z = true;
            AbstractC138463cxv abstractC138463cxv3 = this.LJJIIJ;
            if (abstractC138463cxv3 != null) {
                abstractC138463cxv3.LJI();
            }
        }
        if (panelFeatureState.LJIIIIZZ == null && (!z || !(this.f20220LJ instanceof C138446cxe))) {
            if (panelFeatureState.LJIIIZ == null || panelFeatureState.LJIIZILJ) {
                if (panelFeatureState.LJIIIZ == null) {
                    LIZIZ(panelFeatureState);
                    if (panelFeatureState.LJIIIZ == null) {
                        return false;
                    }
                }
                if (z && this.LJJIIJ != null) {
                    if (this.LJJIIJZLJL == null) {
                        this.LJJIIJZLJL = new C138465cxx(this);
                    }
                    this.LJJIIJ.LIZ(panelFeatureState.LJIIIZ, this.LJJIIJZLJL);
                }
                panelFeatureState.LJIIIZ.stopDispatchingItemsChanged();
                if (!LIZ.onCreatePanelMenu(panelFeatureState.LIZ, panelFeatureState.LJIIIZ)) {
                    panelFeatureState.LIZ((C0199g) null);
                    if (z && (abstractC138463cxv = this.LJJIIJ) != null) {
                        abstractC138463cxv.LIZ(null, this.LJJIIJZLJL);
                    }
                    return false;
                }
                panelFeatureState.LJIIZILJ = false;
            }
            panelFeatureState.LJIIIZ.stopDispatchingItemsChanged();
            if (panelFeatureState.LJIJ != null) {
                panelFeatureState.LJIIIZ.restoreActionViewStates(panelFeatureState.LJIJ);
                panelFeatureState.LJIJ = null;
            }
            if (!LIZ.onPreparePanel(0, panelFeatureState.LJIIIIZZ, panelFeatureState.LJIIIZ)) {
                if (z && (abstractC138463cxv2 = this.LJJIIJ) != null) {
                    abstractC138463cxv2.LIZ(null, this.LJJIIJZLJL);
                }
                panelFeatureState.LJIIIZ.startDispatchingItemsChanged();
                return false;
            }
            if (keyEvent != null) {
                i = keyEvent.getDeviceId();
            } else {
                i = -1;
            }
            if (KeyCharacterMap.load(i).getKeyboardType() != 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            panelFeatureState.LJIILL = z2;
            panelFeatureState.LJIIIZ.setQwertyMode(panelFeatureState.LJIILL);
            panelFeatureState.LJIIIZ.startDispatchingItemsChanged();
        }
        panelFeatureState.LJIIL = true;
        panelFeatureState.LJIILIIL = false;
        this.LJJIZ = panelFeatureState;
        return true;
    }

    public AppCompatDelegateImpl(Context context, Window window, AbstractC138468cy0 abstractC138468cy0) {
        this(context, window, abstractC138468cy0, context);
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    public AppCompatDelegateImpl(Context context, Activity activity, AbstractC138468cy0 abstractC138468cy0) {
        this(context, null, abstractC138468cy0, activity);
    }

    public static Configuration LIZ(Context context, int i, Configuration configuration) {
        int i2;
        if (i != 1) {
            if (i != 2) {
                i2 = context.getApplicationContext().getResources().getConfiguration().uiMode & 48;
            } else {
                i2 = 32;
            }
        } else {
            i2 = 16;
        }
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i2 | (configuration2.uiMode & (-49));
        return configuration2;
    }

    private void LIZ(int i, boolean z, Configuration configuration) {
        Resources resources = this.LIZIZ.getResources();
        Configuration configuration2 = new Configuration(resources.getConfiguration());
        configuration2.uiMode = i | (resources.getConfiguration().uiMode & (-49));
        C116971W2r.LIZ(resources, configuration2, (DisplayMetrics) null);
        if (Build.VERSION.SDK_INT < 26) {
            ResourcesFlusher.flush(resources);
        }
        int i2 = this.LJJJJIZL;
        if (i2 != 0) {
            this.LIZIZ.setTheme(i2);
            if (Build.VERSION.SDK_INT >= 23) {
                this.LIZIZ.getTheme().applyStyle(this.LJJJJIZL, true);
            }
        }
        if (z) {
            Object obj = this.LIZ;
            if (obj instanceof Activity) {
                Activity activity = (Activity) obj;
                if (activity instanceof LifecycleOwner) {
                    if (((LifecycleOwner) activity).mo29786getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.STARTED)) {
                        activity.onConfigurationChanged(configuration2);
                    }
                } else if (this.LJJJJ) {
                    activity.onConfigurationChanged(configuration2);
                }
            }
        }
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return createView(view, str, context, attributeSet);
    }

    public AppCompatDelegateImpl(Context context, Window window, AbstractC138468cy0 abstractC138468cy0, Object obj) {
        Integer num;
        this.LJJIIZI = true;
        this.LJJJJI = -100;
        this.LJJJJLL = new Runnable() { // from class: androidx.appcompat.app.AppCompatDelegateImpl.2
            static {
                Covode.recordClassIndex(460);
            }

            @Override // java.lang.Runnable
            public final void run() {
                if ((AppCompatDelegateImpl.this.LJIJI & 1) != 0) {
                    AppCompatDelegateImpl.this.LIZLLL(0);
                }
                if ((AppCompatDelegateImpl.this.LJIJI & AccessibilityEventCompat.TYPE_VIEW_SCROLLED) != 0) {
                    AppCompatDelegateImpl.this.LIZLLL(108);
                }
                AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
                appCompatDelegateImpl.LJIJ = false;
                appCompatDelegateImpl.LJIJI = 0;
            }
        };
        this.LIZIZ = context;
        this.LIZLLL = abstractC138468cy0;
        this.LIZ = obj;
        if (this.LJJJJI == -100 && (this.LIZ instanceof Dialog)) {
            Context context2 = this.LIZIZ;
            while (true) {
                if (context2 != null) {
                    if (context2 instanceof AppCompatActivity) {
                        AppCompatActivity appCompatActivity = (AppCompatActivity) context2;
                        if (appCompatActivity != null) {
                            this.LJJJJI = appCompatActivity.getDelegate().getLocalNightMode();
                        }
                    } else if (!(context2 instanceof ContextWrapper)) {
                        break;
                    } else {
                        context2 = ((ContextWrapper) context2).getBaseContext();
                    }
                } else {
                    break;
                }
            }
        }
        if (this.LJJJJI == -100 && (num = LJIJJ.get(this.LIZ.getClass().getName())) != null) {
            this.LJJJJI = num.intValue();
            LJIJJ.remove(this.LIZ.getClass().getName());
        }
        if (window != null) {
            LIZ(window);
        }
        AppCompatDrawableManager.preload();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0033, code lost:
        if (((org.xmlpull.v1.XmlPullParser) r15).getDepth() > 1) goto L16;
     */
    @Override // androidx.appcompat.app.AppCompatDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View createView(android.view.View r12, java.lang.String r13, android.content.Context r14, android.util.AttributeSet r15) {
        /*
            r11 = this;
            X.cui r0 = r11.LJJJLL
            r7 = 0
            if (r0 != 0) goto L21
            android.content.Context r1 = r11.LIZIZ
            r0 = 125(0x7d, float:1.75E-43)
            int[] r0 = new int[r0]
            r0 = {x0086: FILL_ARRAY_DATA  , data: [16842839, 16842926, 2130771991, 2130771992, 2130772000, 2130772009, 2130772010, 2130772122, 2130772123, 2130772124, 2130772125, 2130772126, 2130772127, 2130772128, 2130772129, 2130772130, 2130772131, 2130772132, 2130772133, 2130772134, 2130772137, 2130772138, 2130772142, 2130772143, 2130772144, 2130772145, 2130772146, 2130772147, 2130772148, 2130772149, 2130772150, 2130772151, 2130772152, 2130772153, 2130772154, 2130772155, 2130772156, 2130772157, 2130772158, 2130772165, 2130772171, 2130772172, 2130772173, 2130772174, 2130772206, 2130772208, 2130772211, 2130772213, 2130772471, 2130772512, 2130772513, 2130772514, 2130772515, 2130772516, 2130772527, 2130772528, 2130772562, 2130772568, 2130772753, 2130772754, 2130772755, 2130772758, 2130772804, 2130772914, 2130772920, 2130772921, 2130772935, 2130772944, 2130772998, 2130773053, 2130773054, 2130773056, 2130773210, 2130773211, 2130773244, 2130773333, 2130773633, 2130773634, 2130773635, 2130773636, 2130773639, 2130773640, 2130773641, 2130773642, 2130773643, 2130773644, 2130773645, 2130773646, 2130773647, 2130773865, 2130773866, 2130773867, 2130773939, 2130773941, 2130774052, 2130774077, 2130774078, 2130774079, 2130774331, 2130774340, 2130774455, 2130774612, 2130774696, 2130774697, 2130774698, 2130774699, 2130774701, 2130774702, 2130774703, 2130774704, 2130774710, 2130774711, 2130774802, 2130774803, 2130774808, 2130774809, 2130775022, 2130775087, 2130775088, 2130775089, 2130775090, 2130775091, 2130775092, 2130775094, 2130775095} // fill-array
            android.content.res.TypedArray r1 = r1.obtainStyledAttributes(r0)
            r0 = 116(0x74, float:1.63E-43)
            java.lang.String r0 = r1.getString(r0)
            if (r0 != 0) goto L69
            X.cui r0 = new X.cui
            r0.<init>()
            r11.LJJJLL = r0
        L21:
            boolean r0 = androidx.appcompat.app.AppCompatDelegateImpl.LJIJJLI
            r3 = r12
            r6 = r15
            if (r0 == 0) goto L67
            boolean r0 = r6 instanceof org.xmlpull.v1.XmlPullParser
            r1 = 1
            if (r0 == 0) goto L46
            r0 = r6
            org.xmlpull.v1.XmlPullParser r0 = (org.xmlpull.v1.XmlPullParser) r0
            int r0 = r0.getDepth()
            if (r0 <= r1) goto L36
        L35:
            r7 = 1
        L36:
            X.cui r2 = r11.LJJJLL
            boolean r8 = androidx.appcompat.app.AppCompatDelegateImpl.LJIJJLI
            r9 = 1
            boolean r10 = p003X.G4E.LIZ()
            r4 = r13
            r5 = r14
            android.view.View r0 = r2.createView(r3, r4, r5, r6, r7, r8, r9, r10)
            return r0
        L46:
            r2 = r3
            android.view.ViewParent r2 = (android.view.ViewParent) r2
            if (r2 == 0) goto L36
            android.view.Window r0 = r11.LIZJ
            android.view.View r1 = r0.getDecorView()
        L51:
            if (r2 == 0) goto L35
            if (r2 == r1) goto L36
            boolean r0 = r2 instanceof android.view.View
            if (r0 == 0) goto L36
            r0 = r2
            android.view.View r0 = (android.view.View) r0
            boolean r0 = androidx.core.view.ViewCompat.isAttachedToWindow(r0)
            if (r0 != 0) goto L36
            android.view.ViewParent r2 = r2.getParent()
            goto L51
        L67:
            r7 = 0
            goto L36
        L69:
            java.lang.Class r1 = p003X.C116971W2r.LIZ(r0)     // Catch: java.lang.Throwable -> L7e
            java.lang.Class[] r0 = new java.lang.Class[r7]     // Catch: java.lang.Throwable -> L7e
            java.lang.reflect.Constructor r1 = r1.getDeclaredConstructor(r0)     // Catch: java.lang.Throwable -> L7e
            java.lang.Object[] r0 = new java.lang.Object[r7]     // Catch: java.lang.Throwable -> L7e
            java.lang.Object r0 = r1.newInstance(r0)     // Catch: java.lang.Throwable -> L7e
            X.cui r0 = (p003X.C138265cui) r0     // Catch: java.lang.Throwable -> L7e
            r11.LJJJLL = r0     // Catch: java.lang.Throwable -> L7e
            goto L21
        L7e:
            X.cui r0 = new X.cui
            r0.<init>()
            r11.LJJJLL = r0
            goto L21
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.createView(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }
}
