package com.amap.api.maps2d.model;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.FrameLayout;
import com.amap.api.mapcore2d.AbstractC1469ai;
import com.amap.api.mapcore2d.C1484ar;
import com.amap.api.mapcore2d.C1569cm;
import com.bytedance.covode.number.Covode;
import java.io.FileInputStream;
import p002O.C0002O;
import p003X.C116971W2r;

/* loaded from: classes19.dex */
public final class BitmapDescriptorFactory {
    static {
        Covode.recordClassIndex(5366);
    }

    public static BitmapDescriptor defaultMarker() {
        try {
            new StringBuilder();
            return fromAsset(C0002O.m25086C(AbstractC1469ai.EnumC1470a.marker_default2d.name(), ".png"));
        } catch (Throwable th) {
            C1569cm.m18147a(th, "BitmapDescriptorFactory", "defaultMarker");
            return null;
        }
    }

    public static BitmapDescriptor fromAsset(String str) {
        try {
            return fromBitmap(C1569cm.m18149a(str));
        } catch (Throwable th) {
            C1569cm.m18147a(th, "BitmapDescriptorFactory", "fromAsset");
            return null;
        }
    }

    public static BitmapDescriptor fromBitmap(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        try {
            return new BitmapDescriptor(bitmap);
        } catch (Throwable th) {
            C1569cm.m18147a(th, "BitmapDescriptorFactory", "fromBitmap");
            return null;
        }
    }

    public static BitmapDescriptor fromFile(String str) {
        try {
            Context context = C1484ar.f22704a;
            if (context == null) {
                return null;
            }
            FileInputStream openFileInput = context.openFileInput(str);
            Bitmap LIZ = C116971W2r.LIZ(openFileInput);
            openFileInput.close();
            return fromBitmap(LIZ);
        } catch (Throwable th) {
            C1569cm.m18147a(th, "BitmapDescriptorFactory", "fromFile");
            return null;
        }
    }

    public static BitmapDescriptor fromPath(String str) {
        try {
            return fromBitmap(C116971W2r.LJFF(str));
        } catch (Throwable th) {
            C1569cm.m18147a(th, "BitmapDescriptorFactory", "fromPath");
            return null;
        }
    }

    public static BitmapDescriptor fromResource(int i) {
        try {
            Context context = C1484ar.f22704a;
            if (context == null) {
                return null;
            }
            return fromBitmap(C116971W2r.LIZ(context.getResources().openRawResource(i)));
        } catch (Throwable th) {
            C1569cm.m18147a(th, "BitmapDescriptorFactory", "fromResource");
            return null;
        }
    }

    /* renamed from: a */
    public static Bitmap m17134a(View view) {
        try {
            view.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
            view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
            view.buildDrawingCache();
            return view.getDrawingCache().copy(Bitmap.Config.ARGB_8888, false);
        } catch (Throwable th) {
            C1569cm.m18147a(th, "BitmapDescriptorFactory", "getViewBitmap");
            return null;
        }
    }

    public static BitmapDescriptor fromView(View view) {
        try {
            Context context = C1484ar.f22704a;
            if (context == null) {
                return null;
            }
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.addView(view);
            frameLayout.destroyDrawingCache();
            return fromBitmap(m17134a(frameLayout));
        } catch (Throwable th) {
            C1569cm.m18147a(th, "BitmapDescriptorFactory", "fromView");
            return null;
        }
    }

    public static BitmapDescriptor defaultMarker(float f) {
        try {
            float f2 = (((int) (f + 15.0f)) / 30) * 30;
            if (f2 > 330.0f) {
                f2 = 330.0f;
            } else if (f2 < 0.0f) {
                f2 = 0.0f;
            }
            String str = "";
            if (f2 == 0.0f) {
                str = "RED";
            } else if (f2 == 30.0f) {
                str = "ORANGE";
            } else if (f2 == 60.0f) {
                str = "YELLOW";
            } else if (f2 == 120.0f) {
                str = "GREEN";
            } else if (f2 == 180.0f) {
                str = "CYAN";
            } else if (f2 == 210.0f) {
                str = "AZURE";
            } else if (f2 == 240.0f) {
                str = "BLUE";
            } else if (f2 == 270.0f) {
                str = "VIOLET";
            } else if (f2 == 300.0f) {
                str = "MAGENTAV";
            } else if (f2 == 330.0f) {
                str = "ROSE";
            }
            new StringBuilder();
            return fromAsset(C0002O.m25086C(str, "2d.png"));
        } catch (Throwable th) {
            C1569cm.m18147a(th, "BitmapDescriptorFactory", "defaultMarker");
            return null;
        }
    }
}
