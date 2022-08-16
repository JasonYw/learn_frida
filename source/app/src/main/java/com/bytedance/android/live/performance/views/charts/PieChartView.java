package com.bytedance.android.live.performance.views.charts;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.p1300mt.protector.impl.CastProtectorUtils;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import p003X.C83264Iri;

/* loaded from: classes9.dex */
public final class PieChartView extends SurfaceView implements SurfaceHolder.Callback {
    public static ChangeQuickRedirect LIZ;
    public static final HashMap<Integer, Integer> LIZJ;
    public SurfaceHolder LIZIZ;
    public float LIZLLL;

    /* renamed from: LJ */
    public Random f26529LJ;
    public int LJFF;
    public Paint LJI;
    public int LJII;
    public int LJIIIIZZ;
    public RectF LJIIIZ;
    public List<Data> LJIIJ;
    public Thread LJIIJJI;

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
    }

    /* loaded from: classes9.dex */
    public static class Data implements Parcelable {
        public static final Parcelable.Creator<Data> CREATOR = new Parcelable.Creator<Data>() { // from class: com.bytedance.android.live.performance.views.charts.PieChartView.Data.1
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(32791);
            }

            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ Data[] newArray(int i) {
                return new Data[i];
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, com.bytedance.android.live.performance.views.charts.PieChartView$Data] */
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ Data createFromParcel(Parcel parcel) {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{parcel}, this, LIZ, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                return new Data(parcel);
            }
        };
        public static ChangeQuickRedirect LIZ;
        public double LIZIZ;
        public int LIZJ;
        public double LIZLLL;

        /* renamed from: LJ */
        public String f26530LJ;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        static {
            Covode.recordClassIndex(32790);
        }

        public Data(Parcel parcel) {
            this.f26530LJ = "";
            this.LIZIZ = parcel.readDouble();
            this.LIZJ = parcel.readInt();
            this.LIZLLL = parcel.readDouble();
            this.f26530LJ = parcel.readString();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            if (PatchProxy.proxy(new Object[]{parcel, Integer.valueOf(i)}, this, LIZ, false, 2).isSupported) {
                return;
            }
            parcel.writeDouble(this.LIZIZ);
            parcel.writeInt(this.LIZJ);
            parcel.writeDouble(this.LIZLLL);
            parcel.writeString(this.f26530LJ);
        }
    }

    static {
        Covode.recordClassIndex(32789);
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        LIZJ = hashMap;
        hashMap.put(Integer.valueOf(CastProtectorUtils.parseColor("#ffff00")), 0);
        LIZJ.put(Integer.valueOf(CastProtectorUtils.parseColor("#ff9900")), 0);
        LIZJ.put(Integer.valueOf(CastProtectorUtils.parseColor("#ff6600")), 0);
        LIZJ.put(Integer.valueOf(CastProtectorUtils.parseColor("#ff3300")), 0);
        LIZJ.put(Integer.valueOf(CastProtectorUtils.parseColor("#ff6666")), 0);
        LIZJ.put(Integer.valueOf(CastProtectorUtils.parseColor("#ff3366")), 0);
        LIZJ.put(Integer.valueOf(CastProtectorUtils.parseColor("#ff3399")), 0);
        LIZJ.put(Integer.valueOf(CastProtectorUtils.parseColor("#ff99ff")), 0);
        LIZJ.put(Integer.valueOf(CastProtectorUtils.parseColor("#cc9900")), 0);
        LIZJ.put(Integer.valueOf(CastProtectorUtils.parseColor("#cc3399")), 0);
        LIZJ.put(Integer.valueOf(CastProtectorUtils.parseColor("#cc66ff")), 0);
        LIZJ.put(Integer.valueOf(CastProtectorUtils.parseColor("#99ff00")), 0);
        LIZJ.put(Integer.valueOf(CastProtectorUtils.parseColor("#99ccff")), 0);
        LIZJ.put(Integer.valueOf(CastProtectorUtils.parseColor("#9933ff")), 0);
        LIZJ.put(Integer.valueOf(CastProtectorUtils.parseColor("#663300")), 0);
        LIZJ.put(Integer.valueOf(CastProtectorUtils.parseColor("#663399")), 0);
        LIZJ.put(Integer.valueOf(CastProtectorUtils.parseColor("#0000ee")), 0);
        LIZJ.put(Integer.valueOf(CastProtectorUtils.parseColor("#ff3333")), 0);
        LIZJ.put(Integer.valueOf(CastProtectorUtils.parseColor("#caff70")), 0);
        LIZJ.put(Integer.valueOf(CastProtectorUtils.parseColor("#191970")), 0);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        if (PatchProxy.proxy(new Object[]{surfaceHolder}, this, LIZ, false, 17).isSupported) {
            return;
        }
        this.LJIIJJI.start();
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        if (PatchProxy.proxy(new Object[]{surfaceHolder}, this, LIZ, false, 18).isSupported) {
            return;
        }
        this.LJIIJJI.interrupt();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        MethodCollector.m14708i(2166);
        if (PatchProxy.proxy(new Object[]{canvas}, this, LIZ, false, 3).isSupported) {
            MethodCollector.m14707o(2166);
            return;
        }
        super.onDraw(canvas);
        MethodCollector.m14707o(2166);
    }

    public final void setData(List<Data> list) {
        double d;
        if (!PatchProxy.proxy(new Object[]{list}, this, LIZ, false, 11).isSupported && list != null && !list.isEmpty()) {
            this.LJIIJ.clear();
            if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 15).isSupported) {
                for (Integer num : LIZJ.keySet()) {
                    LIZJ.put(num, 0);
                }
                this.LJFF = 0;
            }
            Iterator<Data> it = list.iterator();
            while (true) {
                d = 0.0d;
                if (!it.hasNext()) {
                    break;
                }
                Data next = it.next();
                if (next.LIZIZ > 0.0d) {
                    this.LJIIJ.add(next);
                }
            }
            if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 16).isSupported) {
                for (Data data : this.LJIIJ) {
                    d += data.LIZIZ;
                }
                for (Data data2 : this.LJIIJ) {
                    data2.LIZLLL = data2.LIZIZ / d;
                }
            }
            if (!PatchProxy.proxy(new Object[]{list}, this, LIZ, false, 13).isSupported) {
                this.f26529LJ.setSeed(System.currentTimeMillis());
                for (Data data3 : list) {
                    if (!PatchProxy.proxy(new Object[]{data3}, this, LIZ, false, 14).isSupported) {
                        while (true) {
                            if (this.LJFF < LIZJ.size()) {
                                int nextInt = this.f26529LJ.nextInt(LIZJ.size());
                                Integer num2 = null;
                                Iterator<Integer> it2 = LIZJ.keySet().iterator();
                                int i = 0;
                                while (true) {
                                    if (!it2.hasNext()) {
                                        break;
                                    }
                                    Integer next2 = it2.next();
                                    if (i == nextInt) {
                                        num2 = next2;
                                        break;
                                    }
                                    i++;
                                }
                                if (LIZJ.get(num2).intValue() == 0) {
                                    data3.LIZJ = num2.intValue();
                                    LIZJ.put(num2, 1);
                                    this.LJFF++;
                                    break;
                                }
                            }
                        }
                    }
                }
            }
            if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 10).isSupported) {
                if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
                    this.LIZIZ = getHolder();
                    this.LIZIZ.setFormat(-2);
                    this.LIZIZ.addCallback(this);
                    setZOrderOnTop(true);
                    this.LJI = new Paint();
                    this.LJI.setStyle(Paint.Style.FILL);
                    this.LJI.setAntiAlias(true);
                    this.LJIIIZ = new RectF();
                    this.LIZLLL = C83264Iri.LIZ(getContext(), 100.0f);
                }
                requestLayout();
                postInvalidate();
            }
        }
    }

    @Override // android.view.SurfaceView, android.view.View
    public final void onMeasure(int i, int i2) {
        MethodCollector.m14708i(2165);
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, LIZ, false, 2).isSupported) {
            MethodCollector.m14707o(2165);
            return;
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (1073741824 == mode) {
            size += getPaddingLeft() + getPaddingRight();
        }
        this.LJII = size;
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (1073741824 == mode2) {
            size2 += getPaddingTop() + getPaddingBottom();
        }
        this.LJIIIIZZ = size2;
        setMeasuredDimension(this.LJII, size2);
        float f = this.LIZLLL;
        float f2 = (this.LJII / 2.0f) - f;
        float f3 = (this.LJIIIIZZ / 2.0f) - f;
        this.LJIIIZ.set(f2, f3, (f * 2.0f) + f2, (f * 2.0f) + f3);
        MethodCollector.m14707o(2165);
    }
}
