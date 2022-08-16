package com.bytedance.android.live.broadcast.draw;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.Observer;
import com.bytedance.android.live.broadcast.model.C3158d;
import com.bytedance.android.live.broadcast.model.C3160f;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdkapi.depend.model.draw.DrawSEIPolicy;
import com.bytedance.android.livesdkapi.depend.model.draw.DrawingExtra;
import com.bytedance.android.livesdkapi.depend.model.draw.DrawingLine;
import com.bytedance.android.livesdkapi.depend.model.draw.DrawingPoint;
import com.bytedance.android.livesdkapi.depend.model.draw.DrawingSEIData;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.umeng.commonsdk.stateless.C33872b;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p003X.C106862S5w;
import p003X.C4574547f;
import p003X.C87087KTh;
import p003X.C87088KTi;
import p003X.KBF;
import p003X.KQH;
import p003X.KQJ;
import p003X.KQK;

/* loaded from: classes5.dex */
public final class DrawPanelContainer extends FrameLayout {
    public static ChangeQuickRedirect LIZ;
    public KQH LIZIZ;
    public DataCenter LIZJ;
    public Room LIZLLL;

    /* renamed from: LJ */
    public C3158d f25820LJ;
    public C3160f LJFF;
    public int LJI;
    public int LJII;
    public int LJIIIIZZ;
    public int LJIIIZ;
    public int LJIIJ;
    public int LJIIJJI;
    public StringBuilder LJIIL;
    public final Observer<Integer> LJIILIIL;
    public final Observer<Integer> LJIILJJIL;
    public int LJIILL;
    public HashMap LJIILLIIL;

    static {
        Covode.recordClassIndex(15609);
    }

    public DrawPanelContainer(Context context) {
        this(context, null, 0, 6, null);
    }

    public DrawPanelContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final View LIZJ(int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 18);
        if (proxy.isSupported) {
            return (View) proxy.result;
        }
        if (this.LJIILLIIL == null) {
            this.LJIILLIIL = new HashMap();
        }
        View view = (View) this.LJIILLIIL.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.LJIILLIIL.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final int getDuration() {
        return this.LJI;
    }

    public final int getPolicyState() {
        return this.LJIIIIZZ;
    }

    public final int getState() {
        return this.LJII;
    }

    private final float getCanvasHeight() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 12);
        if (proxy.isSupported) {
            return ((Float) proxy.result).floatValue();
        }
        return UIUtils.dip2Px(getContext(), 275.0f);
    }

    private final float getCanvasWidth() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 11);
        if (proxy.isSupported) {
            return ((Float) proxy.result).floatValue();
        }
        return UIUtils.getScreenWidth(getContext()) - UIUtils.dip2Px(getContext(), 24.0f);
    }

    private final List<DrawingLine> getFullLines() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 3);
        if (proxy.isSupported) {
            return (List) proxy.result;
        }
        return ((DrawPanelView) LIZJ(2131172964)).getFullLines();
    }

    public final int getPointSize() {
        int i = 0;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        for (DrawingLine drawingLine : getFullLines()) {
            if (drawingLine.getPoints() != null) {
                List<DrawingPoint> points = drawingLine.getPoints();
                Intrinsics.checkNotNull(points);
                i += points.size();
            }
        }
        return i;
    }

    public final void LIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 16).isSupported) {
            return;
        }
        if (this.LIZIZ != null) {
            KQH kqh = this.LIZIZ;
            if (kqh == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            kqh.LIZ().removeObserver(this.LJIILIIL);
            KQH kqh2 = this.LIZIZ;
            if (kqh2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            kqh2.LIZIZ().removeObserver(this.LJIILJJIL);
        }
        this.LJIIL = new StringBuilder("");
        ((DrawPanelView) LIZJ(2131172964)).LIZIZ();
    }

    public final void setDuration(int i) {
        this.LJI = i;
    }

    public final void setPolicyState(int i) {
        this.LJIIIIZZ = i;
    }

    public final void setState(int i) {
        this.LJII = i;
    }

    public final void LIZIZ(int i) {
        boolean z = true;
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 8).isSupported) {
            return;
        }
        List<DrawingLine> fullLines = getFullLines();
        if (fullLines.size() < this.LJIILL + 1) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        int size = fullLines.size() - 1;
        for (int i2 = this.LJIILL; i2 < size; i2++) {
            arrayList.add(fullLines.get(i2));
        }
        this.LJIILL = fullLines.size() - 1;
        DrawingSEIData drawingSEIData = new DrawingSEIData();
        drawingSEIData.setFull(false);
        int size2 = arrayList.size();
        SettingKey<DrawSEIPolicy> settingKey = LiveConfigSettingKeys.DRAW_SEI_POLICY_SETTING;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        if (size2 < settingKey.getValue().getZipModeThreshold()) {
            z = false;
        }
        drawingSEIData.setZip(z);
        drawingSEIData.setLines(LIZ(arrayList));
        drawingSEIData.setState(2);
        DataCenter dataCenter = this.LIZJ;
        if (dataCenter != null) {
            dataCenter.put("data_broadcast_draw_info", LIZ(drawingSEIData));
        }
    }

    private final List<DrawingLine> LIZ(List<DrawingLine> list) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{list}, this, LIZ, false, 9);
        if (proxy.isSupported) {
            return (List) proxy.result;
        }
        ArrayList arrayList = new ArrayList();
        for (DrawingLine drawingLine : list) {
            DrawingLine drawingLine2 = new DrawingLine();
            drawingLine2.setWidth(drawingLine.getWidth());
            drawingLine2.setColor(drawingLine.getColor());
            drawingLine2.setPoints(new ArrayList());
            List<DrawingPoint> points = drawingLine.getPoints();
            if (points != null) {
                for (DrawingPoint drawingPoint : points) {
                    DrawingPoint drawingPoint2 = new DrawingPoint();
                    float canvasWidth = getCanvasWidth();
                    float canvasHeight = getCanvasHeight();
                    if (canvasWidth > 0.0f) {
                        drawingPoint2.setX((drawingPoint.getX() * 343.0f) / canvasWidth);
                    }
                    if (canvasHeight > 0.0f) {
                        drawingPoint2.setY((drawingPoint.getY() * 275.0f) / canvasHeight);
                    }
                    List<DrawingPoint> points2 = drawingLine2.getPoints();
                    if (points2 != null) {
                        points2.add(drawingPoint2);
                    }
                }
            }
            arrayList.add(drawingLine2);
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void LIZIZ(boolean z) {
        if (!PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 2).isSupported && this.LIZLLL != null && this.f25820LJ != null) {
            KQH kqh = this.LIZIZ;
            if (kqh == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            Room room = this.LIZLLL;
            Intrinsics.checkNotNull(room);
            long id = room.getId();
            C3158d c3158d = this.f25820LJ;
            Intrinsics.checkNotNull(c3158d);
            long j = c3158d.LIZ;
            if (!PatchProxy.proxy(new Object[]{new Long(id), new Long(j), Byte.valueOf((byte) z)}, kqh, KQH.LIZ, false, 14).isSupported) {
                Disposable disposable = kqh.LIZLLL;
                if (disposable != null) {
                    disposable.dispose();
                }
                kqh.LIZLLL = KBF.LIZIZ.LIZ().finishDrawGame(id, j, z).subscribeOn(Schedulers.m138io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new KQJ(kqh), new KQK(kqh));
            }
        }
    }

    public final DrawingSEIData LIZ(DrawingSEIData drawingSEIData) {
        String str;
        List<Long> list;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{drawingSEIData}, this, LIZ, false, 10);
        if (proxy.isSupported) {
            return (DrawingSEIData) proxy.result;
        }
        drawingSEIData.setTime(this.LJIIJJI);
        drawingSEIData.setCanvasWidth(343);
        drawingSEIData.setCanvasHeight(C33872b.f42719g);
        drawingSEIData.setDuration(this.LJI);
        if (this.LJFF != null) {
            DrawingExtra drawingExtra = new DrawingExtra();
            C3160f c3160f = this.LJFF;
            if (c3160f != null) {
                str = c3160f.LIZ;
            } else {
                str = null;
            }
            drawingExtra.setAnswer(str);
            C3158d c3158d = this.f25820LJ;
            if (c3158d != null && (list = c3158d.LIZJ) != null) {
                for (Long l : list) {
                    if (l != null && ((int) l.longValue()) == this.LJI - this.LJIIJJI) {
                        C3158d c3158d2 = this.f25820LJ;
                        Intrinsics.checkNotNull(c3158d2);
                        List<Long> list2 = c3158d2.LIZJ;
                        Intrinsics.checkNotNull(list2);
                        int indexOf = list2.indexOf(l);
                        C3160f c3160f2 = this.LJFF;
                        Intrinsics.checkNotNull(c3160f2);
                        if (c3160f2.LIZIZ != null) {
                            C3160f c3160f3 = this.LJFF;
                            Intrinsics.checkNotNull(c3160f3);
                            List<String> list3 = c3160f3.LIZIZ;
                            Intrinsics.checkNotNull(list3);
                            if (indexOf < list3.size()) {
                                if (!TextUtils.isEmpty(this.LJIIL.toString())) {
                                    this.LJIIL.append((char) 65292);
                                }
                                StringBuilder sb = this.LJIIL;
                                C3160f c3160f4 = this.LJFF;
                                Intrinsics.checkNotNull(c3160f4);
                                List<String> list4 = c3160f4.LIZIZ;
                                Intrinsics.checkNotNull(list4);
                                sb.append(list4.get(indexOf));
                                drawingExtra.setHint(this.LJIIL.toString());
                            }
                        }
                    }
                }
            }
            drawingSEIData.setExtra(drawingExtra);
        }
        return drawingSEIData;
    }

    public final void LIZ(int i) {
        boolean z = true;
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 7).isSupported) {
            return;
        }
        List<DrawingLine> fullLines = getFullLines();
        if (fullLines.size() > 0) {
            this.LJIILL = fullLines.size() - 1;
        }
        DrawingSEIData drawingSEIData = new DrawingSEIData();
        drawingSEIData.setFull(true);
        int size = fullLines.size();
        SettingKey<DrawSEIPolicy> settingKey = LiveConfigSettingKeys.DRAW_SEI_POLICY_SETTING;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        if (size < settingKey.getValue().getZipModeThreshold()) {
            z = false;
        }
        drawingSEIData.setZip(z);
        drawingSEIData.setLines(LIZ(getFullLines()));
        drawingSEIData.setState(2);
        DataCenter dataCenter = this.LIZJ;
        if (dataCenter != null) {
            dataCenter.put("data_broadcast_draw_info", LIZ(drawingSEIData));
        }
    }

    public final void LIZ(boolean z) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 13).isSupported) {
            return;
        }
        LIZ(this.LJI);
        this.LJII = 1;
        this.LJIIJJI = 0;
        this.LJIIL = new StringBuilder("");
        UIUtils.setViewVisibility(LIZJ(2131171663), 8);
        UIUtils.setViewVisibility(LIZJ(2131189276), 8);
        UIUtils.setViewVisibility(LIZJ(2131189275), 0);
        UIUtils.setViewVisibility(LIZJ(2131172959), 8);
        UIUtils.setViewVisibility(LIZJ(2131168316), 0);
        UIUtils.setViewVisibility(LIZJ(2131172954), 0);
        UIUtils.setViewVisibility(LIZJ(2131174980), 8);
        DataCenter dataCenter = this.LIZJ;
        if (dataCenter != null) {
            dataCenter.put("data_broadcast_draw_game_tick", 0);
        }
        LIZIZ(z);
        Room room = this.LIZLLL;
        if (room != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("anchor_id", String.valueOf(room.ownerUserId));
            hashMap.put("room_id", String.valueOf(room.getId()));
            C3160f c3160f = this.LJFF;
            Intrinsics.checkNotNull(c3160f);
            String str = c3160f.LIZ;
            Intrinsics.checkNotNull(str);
            hashMap.put("words", str);
            if (z) {
                hashMap.put("end_type", "advance");
            } else if (!z) {
                hashMap.put("end_type", "time_out");
            }
            C4574547f.LIZ().LIZ("livesdk_pictionary_finish", hashMap, new Object[0]);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DrawPanelContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C106862S5w.LIZ(context);
        MethodCollector.m14708i(1243);
        View.inflate(context, 2131698405, this);
        this.LJI = 70;
        this.LJIIIZ = 4;
        this.LJIIJ = 1;
        this.LJIIL = new StringBuilder("");
        this.LJIILIIL = new C87088KTi(this);
        this.LJIILJJIL = new C87087KTh(this);
        MethodCollector.m14707o(1243);
    }

    public /* synthetic */ DrawPanelContainer(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
