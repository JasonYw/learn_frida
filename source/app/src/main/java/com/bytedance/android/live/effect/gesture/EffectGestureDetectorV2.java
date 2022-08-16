package com.bytedance.android.live.effect.gesture;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import androidx.core.view.GestureDetectorCompat;
import androidx.core.view.MotionEventCompat;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.live.effect.api.AbstractC4169j;
import com.bytedance.android.live.effect.api.C4173o;
import com.bytedance.android.live.effect.api.LiveEffectContextFactory;
import com.bytedance.android.livesdkapi.depend.model.Sticker;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.List;
import p003X.AbstractC412322Tq;
import p003X.C144770ebs;
import p003X.C144772ebu;
import p003X.C86676KDm;
import p003X.C87010KQi;

/* loaded from: classes19.dex */
public final class EffectGestureDetectorV2 implements GestureDetector.OnDoubleTapListener, GestureDetector.OnGestureListener, ScaleGestureDetector.OnScaleGestureListener, AbstractC412322Tq {
    public static ChangeQuickRedirect LIZ;
    public final LiveEffectContextFactory.Type LIZIZ;
    public GestureDetectorCompat LIZJ;
    public ScaleGestureDetector LIZLLL;

    /* renamed from: LJ */
    public boolean f26224LJ;
    public int LJFF;
    public int LJI;
    public int LJII;
    public int LJIIIIZZ;
    public float LJIIIZ = 1.0f;
    public Type LJIIJ = Type.BEF_GESTURE_TYPE_PAN;

    static {
        Covode.recordClassIndex(24519);
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        return true;
    }

    /* loaded from: classes19.dex */
    public enum Type {
        BEF_GESTURE_TYPE_UNKNOWN,
        BEF_GESTURE_TYPE_TAP,
        BEF_GESTURE_TYPE_PAN,
        BEF_GESTURE_TYPE_ROTATE,
        BEF_GESTURE_TYPE_SCALE,
        BEF_GESTURE_TYPE_LONG_PRESS;
        
        public static ChangeQuickRedirect changeQuickRedirect;

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static Type[] valuesCustom() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
            if (proxy.isSupported) {
                return (Type[]) proxy.result;
            }
            return (Type[]) values().clone();
        }

        static {
            Covode.recordClassIndex(24520);
        }

        public static Type valueOf(String str) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
            if (proxy.isSupported) {
                return (Type) proxy.result;
            }
            return (Type) Enum.valueOf(Type.class, str);
        }
    }

    @Override // p003X.AbstractC412322Tq
    public final boolean LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 2);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        AbstractC4169j LJII = C4173o.LIZ(this.LIZIZ).LJII();
        if (LJII == null) {
            return false;
        }
        boolean LIZ2 = LIZ(LJII.LIZIZ(C86676KDm.LIZLLL));
        if (!LIZ2) {
            return LIZ(LJII.LIZIZ("livegame"));
        }
        return LIZ2;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        this.LJIIIZ = 1.0f;
    }

    private C144770ebs LIZIZ(MotionEvent motionEvent) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{motionEvent}, this, LIZ, false, 15);
        if (proxy.isSupported) {
            return (C144770ebs) proxy.result;
        }
        return LIZ(motionEvent, false);
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{motionEvent}, this, LIZ, false, 7);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        LIZ(201, LIZ(motionEvent, true));
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        C144770ebs LIZIZ;
        if (PatchProxy.proxy(new Object[]{motionEvent}, this, LIZ, false, 10).isSupported) {
            return;
        }
        this.LJIIJ = Type.BEF_GESTURE_TYPE_LONG_PRESS;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{motionEvent}, this, LIZ, false, 13);
        if (proxy.isSupported) {
            LIZIZ = (C144770ebs) proxy.result;
        } else {
            LIZIZ = LIZIZ(motionEvent);
        }
        LIZ(204, LIZIZ);
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        C144770ebs LIZIZ;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{motionEvent}, this, LIZ, false, 8);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        this.LJIIJ = Type.BEF_GESTURE_TYPE_TAP;
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{motionEvent}, this, LIZ, false, 14);
        if (proxy2.isSupported) {
            LIZIZ = (C144770ebs) proxy2.result;
        } else {
            LIZIZ = LIZIZ(motionEvent);
        }
        LIZ(206, LIZIZ);
        return false;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        C144770ebs c144770ebs;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{scaleGestureDetector}, this, LIZ, false, 11);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        this.LJIIJ = Type.BEF_GESTURE_TYPE_SCALE;
        float scaleFactor = scaleGestureDetector.getScaleFactor() / this.LJIIIZ;
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{Float.valueOf(scaleFactor)}, this, LIZ, false, 17);
        if (proxy2.isSupported) {
            c144770ebs = (C144770ebs) proxy2.result;
        } else {
            c144770ebs = new C144770ebs();
            c144770ebs.LJI = scaleFactor;
            c144770ebs.LJFF = 3.0f;
        }
        LIZ(205, c144770ebs);
        this.LJIIIZ = scaleGestureDetector.getScaleFactor();
        return false;
    }

    private boolean LIZ(List<Sticker> list) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{list}, this, LIZ, false, 3);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (list != null && list.size() > 0) {
            for (Sticker sticker : list) {
                List<String> types = sticker.getTypes();
                if (types != null && types.size() > 0) {
                    return types.contains("TouchGes");
                }
            }
        }
        return false;
    }

    @Override // p003X.AbstractC412322Tq
    public final boolean LIZ(MotionEvent motionEvent) {
        C144770ebs LIZ2;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{motionEvent}, this, LIZ, false, 1);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (!LIZ()) {
            return false;
        }
        if (!PatchProxy.proxy(new Object[]{motionEvent}, this, LIZ, false, 19).isSupported) {
            if ((motionEvent.getAction() & MotionEventCompat.ACTION_MASK) == 2) {
                for (int i = 0; i < motionEvent.getPointerCount(); i++) {
                    C87010KQi.LIZ().LIZ(new C144772ebu(207, LIZ(motionEvent, motionEvent.getPointerId(i))));
                }
            } else {
                C87010KQi.LIZ().LIZ(new C144772ebu(207, LIZ(motionEvent, motionEvent.getPointerId(motionEvent.getActionIndex()))));
            }
        }
        int action = motionEvent.getAction() & MotionEventCompat.ACTION_MASK;
        this.LIZLLL.onTouchEvent(motionEvent);
        if (action == 0) {
            this.f26224LJ = false;
        }
        if (motionEvent.getPointerCount() > 1) {
            this.f26224LJ = true;
        }
        if (!this.f26224LJ) {
            this.LIZJ.onTouchEvent(motionEvent);
        }
        if (action == 1 && !PatchProxy.proxy(new Object[]{motionEvent}, this, LIZ, false, 5).isSupported) {
            PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{motionEvent}, this, LIZ, false, 12);
            if (proxy2.isSupported) {
                LIZ2 = (C144770ebs) proxy2.result;
            } else {
                LIZ2 = LIZ(motionEvent, true);
            }
            LIZ(202, LIZ2);
        }
        return true;
    }

    private void LIZ(int i, C144770ebs c144770ebs) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), c144770ebs}, this, LIZ, false, 6).isSupported) {
            return;
        }
        if (c144770ebs != null) {
            C87010KQi.LIZ().LIZ(new C144772ebu(i, c144770ebs));
            return;
        }
        ALogger.m15800e("EffectGestureDetector", "notifyTouchEvent event is null, action: " + i);
    }

    public EffectGestureDetectorV2(Context context, LiveEffectContextFactory.Type type) {
        this.LIZIZ = type;
        this.LJFF = context.getApplicationContext().getResources().getDisplayMetrics().widthPixels;
        this.LJI = context.getApplicationContext().getResources().getDisplayMetrics().heightPixels;
        this.LIZJ = new GestureDetectorCompat(context, this);
        this.LIZJ.setIsLongpressEnabled(false);
        this.LIZJ.setOnDoubleTapListener(this);
        this.LIZLLL = new ScaleGestureDetector(context, this);
    }

    private C144770ebs LIZ(MotionEvent motionEvent, boolean z) {
        Type type;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{motionEvent, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 16);
        if (proxy.isSupported) {
            return (C144770ebs) proxy.result;
        }
        C144770ebs c144770ebs = new C144770ebs();
        c144770ebs.LIZIZ = motionEvent.getX() / this.LJFF;
        c144770ebs.LIZJ = motionEvent.getY() / this.LJI;
        if (z && (type = this.LJIIJ) != null) {
            c144770ebs.LIZ = type.ordinal();
        }
        return c144770ebs;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0099, code lost:
        if (r2 != 6) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private p003X.C144770ebs LIZ(android.view.MotionEvent r8, long r9) {
        /*
            Method dump skipped, instructions count: 203
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.effect.gesture.EffectGestureDetectorV2.LIZ(android.view.MotionEvent, long):X.ebs");
    }

    @Override // p003X.AbstractC412322Tq
    public final void LIZ(int i, int i2, int i3, int i4) {
        this.LJFF = i;
        this.LJI = i2;
        this.LJII = i3;
        this.LJIIIIZZ = i4;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        C144770ebs LIZIZ;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{motionEvent, motionEvent2, Float.valueOf(f), Float.valueOf(f2)}, this, LIZ, false, 9);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        this.LJIIJ = Type.BEF_GESTURE_TYPE_PAN;
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{motionEvent2, Float.valueOf(f), Float.valueOf(f2)}, this, LIZ, false, 18);
        if (proxy2.isSupported) {
            LIZIZ = (C144770ebs) proxy2.result;
        } else {
            LIZIZ = LIZIZ(motionEvent2);
            LIZIZ.LIZLLL = f / this.LJFF;
            LIZIZ.f19239LJ = f2 / this.LJI;
            LIZIZ.LJFF = 1.0f;
        }
        LIZ(203, LIZIZ);
        return true;
    }
}
