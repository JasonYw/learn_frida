package com.bytedance.android.live.broadcast.draw;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.lifecycle.Observer;
import com.bytedance.android.live.broadcast.model.C3159e;
import com.bytedance.android.livesdkapi.depend.model.draw.DrawingLine;
import com.bytedance.android.livesdkapi.depend.model.draw.DrawingPoint;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC88574KvA;
import p003X.C106862S5w;
import p003X.C87092KTm;
import p003X.C87093KTn;
import p003X.KQH;

/* loaded from: classes5.dex */
public final class DrawPanelView extends AbstractC88574KvA {
    public static ChangeQuickRedirect LIZ;
    public KQH LIZIZ;
    public DrawingLine LIZJ;
    public Long LIZLLL;

    /* renamed from: LJ */
    public float f25821LJ;
    public List<DrawingLine> LJI;
    public final Observer<Integer> LJII;
    public final Observer<C3159e> LJIIIIZZ;

    static {
        Covode.recordClassIndex(15617);
    }

    public DrawPanelView(Context context) {
        this(context, null, 0, 6, null);
    }

    public DrawPanelView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final List<DrawingLine> getFullLines() {
        return this.LJI;
    }

    public final List<DrawingLine> getLines() {
        return this.LJI;
    }

    public final void LIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 9).isSupported) {
            return;
        }
        this.LJI.clear();
        this.LIZJ = null;
        LIZ(this.LJI);
    }

    public final void LIZIZ() {
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 10).isSupported && this.LIZIZ != null) {
            KQH kqh = this.LIZIZ;
            if (kqh == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            kqh.LIZIZ().removeObserver(this.LJII);
            KQH kqh2 = this.LIZIZ;
            if (kqh2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            kqh2.LIZLLL().removeObserver(this.LJIIIIZZ);
        }
    }

    public final void setLines(List<DrawingLine> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, LIZ, false, 2).isSupported) {
            return;
        }
        C106862S5w.LIZ(list);
        this.LJI = list;
    }

    private final DrawingPoint LIZ(MotionEvent motionEvent) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{motionEvent}, this, LIZ, false, 7);
        if (proxy.isSupported) {
            return (DrawingPoint) proxy.result;
        }
        DrawingPoint drawingPoint = new DrawingPoint();
        if (motionEvent != null) {
            drawingPoint.setX(motionEvent.getX());
            drawingPoint.setY(motionEvent.getY());
        }
        return drawingPoint;
    }

    public final void setData(KQH kqh) {
        if (PatchProxy.proxy(new Object[]{kqh}, this, LIZ, false, 3).isSupported) {
            return;
        }
        C106862S5w.LIZ(kqh);
        this.LIZIZ = kqh;
        KQH kqh2 = this.LIZIZ;
        if (kqh2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        kqh2.LIZIZ().observeForever(this.LJII);
        KQH kqh3 = this.LIZIZ;
        if (kqh3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        kqh3.LIZLLL().observeForever(this.LJIIIIZZ);
    }

    @Override // p003X.AbstractC88574KvA
    public final void LIZ(List<DrawingLine> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, LIZ, false, 6).isSupported) {
            return;
        }
        KQH kqh = this.LIZIZ;
        if (kqh == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        Integer value = kqh.LJII().getValue();
        if (value != null && value.intValue() >= 13) {
            return;
        }
        super.LIZ(list);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Integer valueOf;
        List<DrawingPoint> points;
        int pow;
        List<DrawingPoint> points2;
        float f;
        float f2;
        List<DrawingPoint> points3;
        List<DrawingPoint> points4;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{motionEvent}, this, LIZ, false, 5);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (motionEvent != null && (valueOf = Integer.valueOf(motionEvent.getAction())) != null) {
            if (valueOf.intValue() == 0) {
                this.LIZJ = new DrawingLine();
                DrawingLine drawingLine = this.LIZJ;
                if (drawingLine != null) {
                    drawingLine.setPoints(new ArrayList());
                }
                DrawingLine drawingLine2 = this.LIZJ;
                if (drawingLine2 != null) {
                    Long l = this.LIZLLL;
                    Intrinsics.checkNotNull(l);
                    drawingLine2.setColor(Long.valueOf(l.longValue() & 16777215));
                }
                DrawingLine drawingLine3 = this.LIZJ;
                if (drawingLine3 != null) {
                    drawingLine3.setWidth(this.f25821LJ);
                }
                DrawingPoint LIZ2 = LIZ(motionEvent);
                DrawingLine drawingLine4 = this.LIZJ;
                if (drawingLine4 != null && (points4 = drawingLine4.getPoints()) != null) {
                    points4.add(LIZ2);
                }
                DrawingLine drawingLine5 = this.LIZJ;
                if (drawingLine5 != null) {
                    this.LJI.add(drawingLine5);
                }
                LIZ(this.LJI);
                KQH kqh = this.LIZIZ;
                if (kqh == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                }
                kqh.LIZ().setValue(1);
            } else if (valueOf.intValue() == 2) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                DrawingLine drawingLine6 = this.LIZJ;
                if (drawingLine6 != null && (points = drawingLine6.getPoints()) != null) {
                    float x2 = points.get(points.size() - 1).getX();
                    float y2 = points.get(points.size() - 1).getY();
                    PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{Float.valueOf(x2), Float.valueOf(y2), Float.valueOf(x), Float.valueOf(y)}, this, LIZ, false, 8);
                    if (proxy2.isSupported) {
                        pow = ((Integer) proxy2.result).intValue();
                    } else {
                        pow = (int) Math.pow(Math.pow(x - x2, 2.0d) + Math.pow(y - y2, 2.0d), 0.5d);
                    }
                    float f3 = pow;
                    if (f3 > 10.0f) {
                        int round = Math.round(f3 / 10.0f);
                        float f4 = y - y2;
                        float f5 = x - x2;
                        double atan = Math.atan(Math.abs(f4) / Math.abs(f5));
                        int cos = (int) (Math.cos(atan) * 10.0d);
                        int sin = (int) (Math.sin(atan) * 10.0d);
                        if (round > 0) {
                            int i = 1;
                            while (true) {
                                if (f5 > 0.0f) {
                                    f = (cos * i) + x2;
                                } else {
                                    f = x2 - (cos * i);
                                }
                                if (f4 > 0.0f) {
                                    f2 = (sin * i) + y2;
                                } else {
                                    f2 = y2 - (sin * i);
                                }
                                DrawingPoint drawingPoint = new DrawingPoint();
                                drawingPoint.setX(f);
                                drawingPoint.setY(f2);
                                DrawingLine drawingLine7 = this.LIZJ;
                                if (drawingLine7 != null && (points3 = drawingLine7.getPoints()) != null) {
                                    points3.add(drawingPoint);
                                }
                                if (i == round) {
                                    break;
                                }
                                i++;
                            }
                        }
                    } else {
                        DrawingPoint LIZ3 = LIZ(motionEvent);
                        DrawingLine drawingLine8 = this.LIZJ;
                        if (drawingLine8 != null && (points2 = drawingLine8.getPoints()) != null) {
                            points2.add(LIZ3);
                        }
                    }
                }
                LIZ(this.LJI);
                return true;
            } else if (valueOf.intValue() == 1) {
                LIZ(this.LJI);
                return true;
            }
        }
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DrawPanelView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C106862S5w.LIZ(context);
        this.LJI = new ArrayList();
        this.LIZLLL = 4278190080L;
        this.f25821LJ = 2.0f;
        this.LJII = new C87092KTm(this);
        this.LJIIIIZZ = new C87093KTn(this);
    }

    public /* synthetic */ DrawPanelView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
