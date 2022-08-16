package com.amap.api.mapcore2d;

import android.content.Context;
import android.graphics.Point;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import com.amap.api.maps2d.model.LatLng;
import com.bytedance.covode.number.Covode;

/* renamed from: com.amap.api.mapcore2d.au */
/* loaded from: classes19.dex */
public class C1490au extends ViewGroup {

    /* renamed from: a */
    public AbstractC1783y f22724a;

    static {
        Covode.recordClassIndex(5038);
    }

    /* renamed from: a */
    public void m18527a() {
        onLayout(false, 0, 0, 0, 0);
    }

    /* renamed from: com.amap.api.mapcore2d.au$a */
    /* loaded from: classes19.dex */
    public static class C1491a extends ViewGroup.LayoutParams {

        /* renamed from: a */
        public int f22725a;

        /* renamed from: b */
        public LatLng f22726b;

        /* renamed from: c */
        public int f22727c;

        /* renamed from: d */
        public int f22728d;

        /* renamed from: e */
        public int f22729e;

        static {
            Covode.recordClassIndex(5039);
        }

        public C1491a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f22725a = 1;
            this.f22729e = 51;
        }

        public C1491a(int i, int i2, LatLng latLng, int i3, int i4, int i5) {
            super(i, i2);
            this.f22725a = 1;
            this.f22729e = 51;
            this.f22725a = 0;
            this.f22726b = latLng;
            this.f22727c = i3;
            this.f22728d = i4;
            this.f22729e = i5;
        }
    }

    public C1490au(Context context, AbstractC1783y abstractC1783y) {
        super(context);
        this.f22724a = abstractC1783y;
        setWillNotDraw(false);
    }

    /* renamed from: a */
    private void m18524a(View view, C1491a c1491a) {
        int[] iArr = new int[2];
        m18525a(view, c1491a.width, c1491a.height, iArr);
        m18526a(view, iArr[0], iArr[1], c1491a.f22727c, c1491a.f22728d, c1491a.f22729e);
    }

    /* renamed from: b */
    private void m18522b(View view, C1491a c1491a) {
        int[] iArr = new int[2];
        m18525a(view, c1491a.width, c1491a.height, iArr);
        if (view instanceof C1557ce) {
            m18523a((C1557ce) view, iArr, c1491a.f22729e);
        } else if (view instanceof C1477ap) {
            m18526a(view, iArr[0], iArr[1], getWidth() - iArr[0], iArr[1], c1491a.f22729e);
        } else if (view instanceof C1768p) {
            m18526a(view, iArr[0], iArr[1], 0, 0, c1491a.f22729e);
        } else if (c1491a.f22726b != null) {
            try {
                Point mo18286a = this.f22724a.mo17142d().mo18286a(new C1781w((int) (c1491a.f22726b.latitude * 1000000.0d), (int) (c1491a.f22726b.longitude * 1000000.0d)), (Point) null);
                if (mo18286a == null) {
                    return;
                }
                mo18286a.x += c1491a.f22727c;
                mo18286a.y += c1491a.f22728d;
                m18526a(view, iArr[0], iArr[1], mo18286a.x, mo18286a.y, c1491a.f22729e);
            } catch (RemoteException e) {
                C1569cm.m18147a(e, "MapOverlayViewGroup", "layoutMap");
            }
        }
    }

    /* renamed from: a */
    private void m18523a(C1557ce c1557ce, int[] iArr, int i) {
        int m18189b = c1557ce.m18189b();
        if (m18189b == 1) {
            m18526a(c1557ce, iArr[0], iArr[1], getWidth() - iArr[0], (getHeight() + iArr[1]) / 2, i);
        } else if (m18189b == 0) {
            m18526a(c1557ce, iArr[0], iArr[1], getWidth() - iArr[0], getHeight(), i);
        }
    }

    /* renamed from: a */
    private void m18525a(View view, int i, int i2, int[] iArr) {
        View view2;
        if ((view instanceof ListView) && (view2 = (View) view.getParent()) != null) {
            iArr[0] = view2.getWidth();
            iArr[1] = view2.getHeight();
        }
        if (i <= 0 || i2 <= 0) {
            view.measure(0, 0);
        }
        if (i == -2) {
            iArr[0] = view.getMeasuredWidth();
        } else if (i == -1) {
            iArr[0] = getMeasuredWidth();
        } else {
            iArr[0] = i;
        }
        if (i2 == -2) {
            iArr[1] = view.getMeasuredHeight();
        } else if (i2 == -1) {
            iArr[1] = getMeasuredHeight();
        } else {
            iArr[1] = i2;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        try {
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                if (childAt != null) {
                    if (childAt.getLayoutParams() instanceof C1491a) {
                        C1491a c1491a = (C1491a) childAt.getLayoutParams();
                        if (c1491a.f22725a == 0) {
                            m18522b(childAt, c1491a);
                        } else {
                            m18524a(childAt, c1491a);
                        }
                    } else {
                        m18524a(childAt, new C1491a(childAt.getLayoutParams()));
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    private void m18526a(View view, int i, int i2, int i3, int i4, int i5) {
        int i6 = i5 & 7;
        int i7 = i5 & 112;
        if (i6 == 5) {
            i3 -= i;
        } else if (i6 == 1) {
            i3 -= i / 2;
        }
        if (i7 == 80) {
            i4 -= i2;
        } else if (i7 == 16) {
            i4 -= i2 / 2;
        }
        view.layout(i3, i4, i + i3, i2 + i4);
    }
}
