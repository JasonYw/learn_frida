package com.bytedance.android.live.performance.views.charts;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import com.bytedance.android.live.performance.views.charts.LineChartView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.p1300mt.protector.impl.CastProtectorUtils;
import com.p1594ss.android.ugc.aweme.lego.experiment.LegoCommitOptExperiment;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import p003X.LK5;

/* loaded from: classes17.dex */
public class LineChartView extends SurfaceView implements SurfaceHolder.Callback {
    public static ChangeQuickRedirect LIZ;
    public Paint LIZIZ;
    public Path LIZJ;
    public int LIZLLL;

    /* renamed from: LJ */
    public List<Data> f26528LJ;
    public Point[] LJFF;
    public int LJI;
    public int LJII;
    public int LJIIIIZZ;
    public boolean LJIIIZ;
    public boolean LJIIJ;
    public boolean LJIIJJI;
    public SurfaceHolder LJIIL;
    public Paint LJIILIIL;
    public Paint LJIILJJIL;
    public Paint LJIILL;
    public Paint LJIILLIIL;
    public Path LJIIZILJ;
    public int LJIJ;
    public int LJIJI;
    public int LJIJJ;
    public int LJIJJLI;
    public int LJIL;
    public int LJJ;
    public double LJJI;
    public double LJJIFFI;
    public double LJJII;
    public double LJJIII;
    public int LJJIIJ;
    public int LJJIIJZLJL;
    public float LJJIIZ;
    public int LJJIIZI;
    public float LJJIJ;
    public int LJJIJIIJI;
    public float LJJIJIIJIL;
    public float LJJIJIL;
    public int LJJIJL;
    public float LJJIJLIJ;
    public int LJJIL;
    public float LJJIZ;
    public int LJJJ;
    public float LJJJI;
    public boolean LJJJIL;
    public Thread LJJJJ;

    static {
        Covode.recordClassIndex(32785);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
    }

    private int getTableEnd() {
        return this.LJIJI + this.LJIL;
    }

    public int getTableStart() {
        return this.LJIJ + this.LJIL;
    }

    /* loaded from: classes17.dex */
    public static class Data implements Parcelable {
        public static final Parcelable.Creator<Data> CREATOR = new Parcelable.Creator<Data>() { // from class: com.bytedance.android.live.performance.views.charts.LineChartView.Data.1
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(32788);
            }

            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ Data[] newArray(int i) {
                return new Data[i];
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.android.live.performance.views.charts.LineChartView$Data, java.lang.Object] */
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
        public Date LIZJ;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        static {
            Covode.recordClassIndex(32787);
        }

        public Data(Parcel parcel) {
            this.LIZIZ = parcel.readDouble();
            this.LIZJ = (Date) parcel.readSerializable();
        }

        public Data(double d, Date date) {
            this.LIZIZ = d;
            this.LIZJ = date;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            if (PatchProxy.proxy(new Object[]{parcel, Integer.valueOf(i)}, this, LIZ, false, 1).isSupported) {
                return;
            }
            parcel.writeDouble(this.LIZIZ);
            parcel.writeSerializable(this.LIZJ);
        }
    }

    public void LIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 19).isSupported) {
            return;
        }
        LIZJ();
        requestLayout();
        postInvalidate();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 5).isSupported) {
            return;
        }
        super.onFinishInflate();
    }

    public int getDataCount() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 29);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        List<Data> list = this.f26528LJ;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public float getViewDrawHeight() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 17);
        if (proxy.isSupported) {
            return ((Float) proxy.result).floatValue();
        }
        return getMeasuredHeight() * this.LJJIIZ;
    }

    private void LIZJ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 2).isSupported) {
            return;
        }
        this.LIZJ.reset();
        this.LJIIZILJ.reset();
        this.LJI = (int) LK5.LIZJ(this.LJIJJLI);
        this.LJIL = (int) LK5.LIZJ(this.LJJ);
        this.LJJIIJ = (int) LK5.LIZJ(this.LJJIIJZLJL);
        this.LJIJ = this.LJIL * 2;
        this.LJIJI = this.LJIJ + (this.LJI * (this.f26528LJ.size() - 1));
        int i = this.LJIL;
        this.LJIIIIZZ = i;
        this.LJII = i;
        this.LJFF = new Point[this.f26528LJ.size()];
        this.LJIIJ = false;
    }

    public void LIZIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 21).isSupported) {
            return;
        }
        this.LJJI = LIZ(((Data) Collections.max(this.f26528LJ, new Comparator(this) { // from class: X.coG
            public static ChangeQuickRedirect LIZ;
            public final LineChartView LIZIZ;

            static {
                Covode.recordClassIndex(32792);
            }

            {
                this.LIZIZ = this;
            }

            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                Object obj3;
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj, obj2}, this, LIZ, false, 1);
                if (proxy.isSupported) {
                    obj3 = proxy.result;
                } else {
                    LineChartView lineChartView = this.LIZIZ;
                    LineChartView.Data data = (LineChartView.Data) obj;
                    LineChartView.Data data2 = (LineChartView.Data) obj2;
                    PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{data, data2}, lineChartView, LineChartView.LIZ, false, 31);
                    if (!proxy2.isSupported) {
                        int i = (lineChartView.LIZ(data.LIZIZ - lineChartView.LIZ(data2.LIZIZ, 2), 2) > 0.0d ? 1 : (lineChartView.LIZ(data.LIZIZ - lineChartView.LIZ(data2.LIZIZ, 2), 2) == 0.0d ? 0 : -1));
                        if (i == 0) {
                            return 0;
                        }
                        return i > 0 ? 1 : -1;
                    }
                    obj3 = proxy2.result;
                }
                return ((Integer) obj3).intValue();
            }
        })).LIZIZ, 2);
        this.LJJIFFI = LIZ(((Data) Collections.min(this.f26528LJ, new Comparator(this) { // from class: X.coH
            public static ChangeQuickRedirect LIZ;
            public final LineChartView LIZIZ;

            static {
                Covode.recordClassIndex(32793);
            }

            {
                this.LIZIZ = this;
            }

            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                Object obj3;
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj, obj2}, this, LIZ, false, 1);
                if (proxy.isSupported) {
                    obj3 = proxy.result;
                } else {
                    LineChartView lineChartView = this.LIZIZ;
                    LineChartView.Data data = (LineChartView.Data) obj;
                    LineChartView.Data data2 = (LineChartView.Data) obj2;
                    PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{data, data2}, lineChartView, LineChartView.LIZ, false, 30);
                    if (!proxy2.isSupported) {
                        int i = (lineChartView.LIZ(data.LIZIZ - lineChartView.LIZ(data2.LIZIZ, 2), 2) > 0.0d ? 1 : (lineChartView.LIZ(data.LIZIZ - lineChartView.LIZ(data2.LIZIZ, 2), 2) == 0.0d ? 0 : -1));
                        if (i == 0) {
                            return 0;
                        }
                        return i > 0 ? 1 : -1;
                    }
                    obj3 = proxy2.result;
                }
                return ((Integer) obj3).intValue();
            }
        })).LIZIZ, 2);
        double d = this.LJJI;
        this.LJJIII = (d - this.LJJIFFI) / 2.0d;
        double d2 = this.LJJIII;
        if (d2 == 0.0d) {
            d2 = d * 2.0d;
        }
        this.LJJIII = d2;
        this.LJJIII = LIZ(this.LJJIII, 2);
    }

    public LineChartView(Context context) {
        this(context, null);
    }

    public void setBezierLine(boolean z) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 25).isSupported) {
            return;
        }
        this.LJIIIZ = z;
        LIZ();
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        if (PatchProxy.proxy(new Object[]{surfaceHolder}, this, LIZ, false, 28).isSupported) {
            return;
        }
        this.LJIIJJI = false;
        Thread thread = this.LJJJJ;
        if (thread != null) {
            thread.interrupt();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        MethodCollector.m14708i(2164);
        if (PatchProxy.proxy(new Object[]{canvas}, this, LIZ, false, 6).isSupported) {
            MethodCollector.m14707o(2164);
            return;
        }
        super.onDraw(canvas);
        MethodCollector.m14707o(2164);
    }

    public void setData(List<Data> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, LIZ, false, 23).isSupported) {
            return;
        }
        if (list != null) {
            if (list.isEmpty()) {
                return;
            }
            this.f26528LJ.clear();
            this.f26528LJ.addAll(list);
            LIZIZ();
            LIZ();
            return;
        }
        throw new RuntimeException("dataList cannot be null!");
    }

    public void setRulerYSpace(double d) {
        if (PatchProxy.proxy(new Object[]{Double.valueOf(d)}, this, LIZ, false, 26).isSupported) {
            return;
        }
        if (d <= 0.0d) {
            d = this.LJJII;
        }
        this.LJJIII = d;
        LIZ();
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        if (PatchProxy.proxy(new Object[]{surfaceHolder}, this, LIZ, false, 27).isSupported) {
            return;
        }
        this.LJIIJJI = true;
        this.LJJJJ = new Thread() { // from class: com.bytedance.android.live.performance.views.charts.LineChartView.1
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(32786);
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public final void run() {
                Canvas lockCanvas;
                int i = 2162;
                MethodCollector.m14708i(2162);
                if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
                    MethodCollector.m14707o(2162);
                    return;
                }
                while (LineChartView.this.LJIIJJI) {
                    try {
                        if (Build.VERSION.SDK_INT >= 23) {
                            lockCanvas = LineChartView.this.LJIIL.getSurface().lockHardwareCanvas();
                        } else {
                            lockCanvas = LineChartView.this.LJIIL.lockCanvas();
                        }
                        LineChartView lineChartView = LineChartView.this;
                        if (!PatchProxy.proxy(new Object[]{lockCanvas}, lineChartView, LineChartView.LIZ, false, 7).isSupported) {
                            lockCanvas.drawColor(0);
                            lockCanvas.translate(0.0f, (lineChartView.LIZLLL / 2.0f) + (((lineChartView.getViewDrawHeight() + lineChartView.LJII) + lineChartView.LJIIIIZZ) / 2.0f));
                            if (!lineChartView.LJIIJ && !PatchProxy.proxy(new Object[0], lineChartView, LineChartView.LIZ, false, 18).isSupported && !lineChartView.f26528LJ.isEmpty()) {
                                int tableStart = lineChartView.getTableStart();
                                Point point = new Point();
                                point.set(tableStart, -lineChartView.LIZ(lineChartView.f26528LJ.get(0).LIZIZ));
                                lineChartView.LJFF[0] = point;
                                lineChartView.LIZJ.moveTo(point.x, point.y);
                                if (lineChartView.f26528LJ.size() != 1) {
                                    int i2 = 1;
                                    while (i2 < lineChartView.f26528LJ.size()) {
                                        Point point2 = new Point();
                                        double d = lineChartView.f26528LJ.get(i2).LIZIZ;
                                        tableStart += lineChartView.LJI;
                                        point2.set(tableStart, -lineChartView.LIZ(d));
                                        if (lineChartView.LJIIIZ) {
                                            int i3 = point.x + (lineChartView.LJI / 2);
                                            Point point3 = new Point();
                                            point3.set(i3, point.y);
                                            Point point4 = new Point();
                                            point4.set(i3, point2.y);
                                            try {
                                                lineChartView.LIZJ.cubicTo(point3.x, point3.y, point4.x, point4.y, point2.x, point2.y);
                                                continue;
                                            } catch (Exception e) {
                                                e = e;
                                                i = 2162;
                                                e.printStackTrace();
                                                MethodCollector.m14707o(i);
                                                return;
                                            }
                                        } else {
                                            lineChartView.LIZJ.lineTo(point2.x, point2.y);
                                            continue;
                                        }
                                        lineChartView.LJFF[i2] = point2;
                                        i2++;
                                        point = point2;
                                    }
                                }
                                lineChartView.LJIIJ = true;
                            }
                            lineChartView.LIZ(lockCanvas);
                            if (!PatchProxy.proxy(new Object[]{lockCanvas}, lineChartView, LineChartView.LIZ, false, 14).isSupported) {
                                lockCanvas.drawPath(lineChartView.LIZJ, lineChartView.LIZIZ);
                            }
                            lineChartView.LIZIZ(lockCanvas);
                        }
                        if (Build.VERSION.SDK_INT >= 23) {
                            LineChartView.this.LJIIL.getSurface().unlockCanvasAndPost(lockCanvas);
                        } else {
                            LineChartView.this.LJIIL.unlockCanvasAndPost(lockCanvas);
                        }
                        Thread.sleep(16L);
                        i = 2162;
                    } catch (Exception e2) {
                        e = e2;
                    }
                }
                MethodCollector.m14707o(i);
            }
        };
        this.LJJJJ.start();
    }

    private void LIZJ(Canvas canvas) {
        Date date;
        if (PatchProxy.proxy(new Object[]{canvas}, this, LIZ, false, 13).isSupported || this.LJFF == null) {
            return;
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm");
        Date date2 = null;
        for (int i = 0; i < this.LJFF.length; i++) {
            try {
                date = this.f26528LJ.get(i).LIZJ;
                if (i == 0) {
                    date2 = date;
                }
            } catch (Exception e) {
                e = e;
            }
            if (this.LJFF[i] != null) {
                if (i == 0) {
                    LIZ(canvas, simpleDateFormat.format(date), this.LJFF[i].x, 0.0f);
                } else if (date != null && date2 != null && date.getTime() - date2.getTime() > LegoCommitOptExperiment.BOOT_FINISH_DELAY_TIME) {
                    try {
                        LIZ(canvas, simpleDateFormat.format(date), this.LJFF[i].x, 0.0f);
                        date2 = date;
                    } catch (Exception e2) {
                        e = e2;
                        date2 = date;
                        e.printStackTrace();
                    }
                }
            } else {
                return;
            }
        }
    }

    public void LIZIZ(Canvas canvas) {
        if (PatchProxy.proxy(new Object[]{canvas}, this, LIZ, false, 15).isSupported || this.LJFF == null) {
            return;
        }
        float LIZJ = LK5.LIZJ(this.LJJIJIL) / 2.0f;
        int length = this.LJFF.length;
        for (int i = 0; i < length; i++) {
            Point point = this.LJFF[i];
            if (point != null) {
                if (this.LJJJIL) {
                    canvas.drawPoint(point.x, point.y, this.LJIILIIL);
                } else {
                    canvas.drawCircle(point.x, point.y, LIZJ, this.LJIILIIL);
                }
                String format = String.format(Locale.CHINA, "%.2f", Double.valueOf(this.f26528LJ.get(i).LIZIZ));
                float f = point.x;
                float f2 = point.y;
                if (!PatchProxy.proxy(new Object[]{canvas, format, Float.valueOf(f), Float.valueOf(f2)}, this, LIZ, false, 11).isSupported) {
                    this.LJIILLIIL.setTextAlign(Paint.Align.CENTER);
                    LIZ(canvas, this.LJIILLIIL, format, f, f2 - this.LJJIIJ);
                }
            } else {
                return;
            }
        }
    }

    public int LIZ(double d) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Double.valueOf(d)}, this, LIZ, false, 16);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        return (int) ((getViewDrawHeight() * ((Math.abs(LIZ(d, 2) - this.LJJIFFI) * 100.0d) / (Math.abs(this.LJJI - this.LJJIFFI) * 100.0d))) + this.LJIIIIZZ + 0.5d);
    }

    public void LIZ(Canvas canvas) {
        int i = 1;
        if (PatchProxy.proxy(new Object[]{canvas}, this, LIZ, false, 12).isSupported) {
            return;
        }
        int tableEnd = getTableEnd();
        double d = this.LJJIFFI;
        double d2 = 0.0d;
        if (d <= 0.0d) {
            d2 = d % this.LJJIII;
        }
        double d3 = d - d2;
        double d4 = this.LJJI + this.LJJIII;
        while (true) {
            float f = -LIZ(d3);
            this.LJIIZILJ.moveTo(this.LJIJ, f);
            float f2 = tableEnd;
            this.LJIIZILJ.lineTo(f2, f);
            Locale locale = Locale.CHINA;
            Object[] objArr = new Object[i];
            objArr[0] = Double.valueOf(d3);
            String format = String.format(locale, "%.2f", objArr);
            float f3 = this.LJIJ;
            Object[] objArr2 = new Object[4];
            objArr2[0] = canvas;
            objArr2[i] = format;
            objArr2[2] = Float.valueOf(f3);
            objArr2[3] = Float.valueOf(f);
            if (!PatchProxy.proxy(objArr2, this, LIZ, false, 9).isSupported) {
                this.LJIILL.setTextAlign(Paint.Align.RIGHT);
                Paint.FontMetrics fontMetrics = this.LJIILL.getFontMetrics();
                LIZ(canvas, this.LJIILL, format, f3 - this.LJJIIJ, f + (((fontMetrics.bottom - fontMetrics.top) / 2.0f) - fontMetrics.bottom));
            }
            d3 += this.LJJIII;
            if (d3 >= d4) {
                this.LJIIZILJ.moveTo(this.LJIJ, f);
                this.LJIIZILJ.lineTo(this.LJIJ, 0.0f);
                this.LJIIZILJ.lineTo(f2, 0.0f);
                canvas.drawPath(this.LJIIZILJ, this.LJIILJJIL);
                LIZJ(canvas);
                return;
            }
            i = 1;
        }
    }

    public final void LIZ(Data data) {
        if (PatchProxy.proxy(new Object[]{data}, this, LIZ, false, 24).isSupported) {
            return;
        }
        if (this.f26528LJ == null) {
            this.f26528LJ = new ArrayList();
        }
        this.f26528LJ.add(data);
        LIZIZ();
        LIZ();
    }

    public LineChartView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.SurfaceView, android.view.View
    public void onMeasure(int i, int i2) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, LIZ, false, 3).isSupported) {
            return;
        }
        int tableEnd = this.LJIL + getTableEnd() + getPaddingLeft() + getPaddingRight();
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (1073741824 == mode) {
            size += getPaddingTop() + getPaddingBottom();
        }
        setMeasuredDimension(tableEnd, size);
    }

    public double LIZ(double d, int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Double.valueOf(d), 2}, this, LIZ, false, 20);
        if (proxy.isSupported) {
            return ((Double) proxy.result).doubleValue();
        }
        double pow = Math.pow(10.0d, 2.0d);
        return Math.ceil(d * pow) / pow;
    }

    public LineChartView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        MethodCollector.m14708i(2163);
        this.f26528LJ = new ArrayList();
        this.LJIJJ = 20;
        this.LJIJJLI = this.LJIJJ;
        this.LJJ = 15;
        this.LJJII = 10.0d;
        this.LJJIII = this.LJJII;
        this.LJJIIJZLJL = 8;
        this.LJJIIZ = 0.618f;
        this.LJJIIZI = CastProtectorUtils.parseColor("#286DD4");
        this.LJJIJ = 1.0f;
        this.LJJIJIIJI = CastProtectorUtils.parseColor("#FF4081");
        this.LJJIJIIJIL = 4.0f;
        this.LJJIJIL = this.LJJIJIIJIL;
        this.LJJIJL = CastProtectorUtils.parseColor("#BBBBBB");
        this.LJJIJLIJ = 0.25f;
        this.LJJIL = this.LJJIJL;
        this.LJJIZ = 5.0f;
        this.LJJJ = CastProtectorUtils.parseColor("#009688");
        this.LJJJI = 5.0f;
        this.LJIIIZ = false;
        this.LJJJIL = false;
        this.LJIIJ = false;
        this.LJIIJJI = true;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
            this.LJIIL = getHolder();
            this.LJIIL.setFormat(-2);
            this.LJIIL.addCallback(this);
            setZOrderOnTop(true);
            this.LIZIZ = new Paint();
            this.LIZIZ.setAntiAlias(true);
            this.LIZIZ.setStyle(Paint.Style.STROKE);
            this.LIZIZ.setColor(this.LJJIIZI);
            this.LIZIZ.setStrokeWidth(LK5.LIZJ(this.LJJIJ));
            this.LJIILIIL = new Paint();
            this.LJIILIIL.setAntiAlias(true);
            this.LJIILIIL.setStyle(Paint.Style.FILL);
            this.LJIILIIL.setColor(this.LJJIJIIJI);
            this.LJIILIIL.setStrokeWidth(LK5.LIZJ(this.LJJIJIL));
            this.LJIILJJIL = new Paint();
            this.LJIILJJIL.setAntiAlias(true);
            this.LJIILJJIL.setStyle(Paint.Style.STROKE);
            this.LJIILJJIL.setColor(this.LJJIJL);
            this.LJIILJJIL.setStrokeWidth(LK5.LIZJ(this.LJJIJLIJ));
            this.LJIILL = new Paint();
            this.LJIILL.setAntiAlias(true);
            this.LJIILL.setStyle(Paint.Style.FILL);
            this.LJIILL.setTextAlign(Paint.Align.CENTER);
            this.LJIILL.setColor(this.LJJIL);
            this.LJIILL.setTextSize(LK5.LIZIZ(this.LJJIZ));
            this.LJIILLIIL = new Paint();
            this.LJIILLIIL.setAntiAlias(true);
            this.LJIILLIIL.setStyle(Paint.Style.FILL);
            this.LJIILLIIL.setTextAlign(Paint.Align.CENTER);
            this.LJIILLIIL.setColor(this.LJJJ);
            this.LJIILLIIL.setTextSize(LK5.LIZIZ(this.LJJJI));
            this.LIZJ = new Path();
            this.LJIIZILJ = new Path();
            LIZJ();
        }
        MethodCollector.m14707o(2163);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, LIZ, false, 4).isSupported) {
            return;
        }
        super.onSizeChanged(i, i2, i3, i4);
        this.LIZLLL = i2;
    }

    private void LIZ(Canvas canvas, String str, float f, float f2) {
        if (PatchProxy.proxy(new Object[]{canvas, str, Float.valueOf(f), Float.valueOf(0.0f)}, this, LIZ, false, 10).isSupported) {
            return;
        }
        this.LJIILL.setTextAlign(Paint.Align.CENTER);
        Paint.FontMetrics fontMetrics = this.LJIILL.getFontMetrics();
        LIZ(canvas, this.LJIILL, str, f, (((fontMetrics.bottom - fontMetrics.top) / 2.0f) - fontMetrics.bottom) + 0.0f + this.LJJIIJ);
    }

    private void LIZ(Canvas canvas, Paint paint, String str, float f, float f2) {
        if (PatchProxy.proxy(new Object[]{canvas, paint, str, Float.valueOf(f), Float.valueOf(f2)}, this, LIZ, false, 8).isSupported) {
            return;
        }
        canvas.drawText(str, f, f2, paint);
    }
}
