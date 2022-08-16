package com.bytedance.android.live.broadcast.draw;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.lifecycle.Observer;
import com.bytedance.android.live.broadcast.model.C3160f;
import com.bytedance.android.live.broadcast.model.C3161g;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.DataCenter;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import p003X.C106862S5w;
import p003X.C440943cO;
import p003X.C4574547f;
import p003X.C86440K4k;
import p003X.C88440Kt0;
import p003X.C91211Lwb;
import p003X.KBF;
import p003X.KQD;
import p003X.KQF;
import p003X.KQH;
import p003X.LK5;

/* loaded from: classes5.dex */
public final class DrawWordsSelectView extends FrameLayout implements View.OnClickListener {
    public static ChangeQuickRedirect LIZ;
    public List<C3160f> LIZIZ;
    public int LIZJ;
    public DataCenter LIZLLL;

    /* renamed from: LJ */
    public KQH f25822LJ;
    public final Observer<C3161g> LJFF;
    public List<C3003a> LJI;
    public Disposable LJII;
    public final CompositeDisposable LJIIIIZZ;
    public HashMap LJIIIZ;

    /* renamed from: com.bytedance.android.live.broadcast.draw.DrawWordsSelectView$a */
    /* loaded from: classes5.dex */
    public static final class C3003a {
        public ImageView LIZ;
        public TextView LIZIZ;

        static {
            Covode.recordClassIndex(15631);
        }
    }

    static {
        Covode.recordClassIndex(15630);
    }

    public DrawWordsSelectView(Context context) {
        this(context, null, 0, 6, null);
    }

    public DrawWordsSelectView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final View LIZIZ(int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 11);
        if (proxy.isSupported) {
            return (View) proxy.result;
        }
        if (this.LJIIIZ == null) {
            this.LJIIIZ = new HashMap();
        }
        View view = (View) this.LJIIIZ.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.LJIIIZ.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final CompositeDisposable getCompositeDisposable() {
        return this.LJIIIIZZ;
    }

    public final Disposable getDisposable() {
        return this.LJII;
    }

    public final void LIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 2).isSupported) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        C440943cO.LIZ(jSONObject, "error_msg", "words fetch error");
        C91211Lwb.LIZ("ttlive_draw_something_error", 10, jSONObject);
    }

    public final void LIZIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 9).isSupported) {
            return;
        }
        KQH kqh = this.f25822LJ;
        if (kqh == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        kqh.LJFF().removeObserver(this.LJFF);
        CompositeDisposable compositeDisposable = this.LJIIIIZZ;
        if (compositeDisposable != null) {
            compositeDisposable.clear();
        }
    }

    public final void setDisposable(Disposable disposable) {
        this.LJII = disposable;
    }

    public final void setStartViewStatus(boolean z) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 7).isSupported) {
            return;
        }
        if (z) {
            TextView textView = (TextView) LIZIZ(2131190433);
            Intrinsics.checkNotNullExpressionValue(textView, "");
            textView.setAlpha(1.0f);
            return;
        }
        TextView textView2 = (TextView) LIZIZ(2131190433);
        Intrinsics.checkNotNullExpressionValue(textView2, "");
        textView2.setAlpha(0.34f);
    }

    public final void LIZ(int i) {
        List<C3160f> list;
        boolean z = true;
        if (!PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 4).isSupported && (list = this.LIZIZ) != null && this.LJI != null) {
            Intrinsics.checkNotNull(list);
            if (i < list.size()) {
                List<C3003a> list2 = this.LJI;
                Intrinsics.checkNotNull(list2);
                if (i < list2.size()) {
                    if (i < 0) {
                        z = false;
                    }
                    setStartViewStatus(z);
                    List<C3003a> list3 = this.LJI;
                    Intrinsics.checkNotNull(list3);
                    int size = list3.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        if (i2 == i) {
                            List<C3003a> list4 = this.LJI;
                            Intrinsics.checkNotNull(list4);
                            UIUtils.setViewVisibility(list4.get(i2).LIZ, 0);
                            List<C3003a> list5 = this.LJI;
                            Intrinsics.checkNotNull(list5);
                            TextView textView = list5.get(i2).LIZIZ;
                            if (textView != null) {
                                textView.setTextColor(LK5.LIZIZ(2131628147));
                            }
                        } else {
                            List<C3003a> list6 = this.LJI;
                            Intrinsics.checkNotNull(list6);
                            UIUtils.setViewVisibility(list6.get(i2).LIZ, 8);
                            List<C3003a> list7 = this.LJI;
                            Intrinsics.checkNotNull(list7);
                            TextView textView2 = list7.get(i2).LIZIZ;
                            if (textView2 != null) {
                                textView2.setTextColor(LK5.LIZIZ(2131624626));
                            }
                        }
                    }
                    if (i >= 0) {
                        this.LIZJ = i;
                        List<C3160f> list8 = this.LIZIZ;
                        if (list8 != null) {
                            KQH kqh = this.f25822LJ;
                            if (kqh == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("");
                            }
                            kqh.m23480LJ().setValue(list8.get(this.LIZJ));
                        }
                    }
                }
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Integer valueOf;
        List<C3160f> list;
        Room room;
        if (!PatchProxy.proxy(new Object[]{view}, this, LIZ, false, 5).isSupported && view != null && (valueOf = Integer.valueOf(view.getId())) != null) {
            if (valueOf.intValue() == 2131192524) {
                LIZ(0);
            } else if (valueOf.intValue() == 2131192553) {
                LIZ(1);
            } else if (valueOf != null) {
                if (valueOf.intValue() == 2131168244) {
                    LIZ(2);
                } else if (valueOf.intValue() == 2131168284) {
                    LIZ(3);
                } else if (valueOf.intValue() == 2131190433 && !PatchProxy.proxy(new Object[0], this, LIZ, false, 6).isSupported && (list = this.LIZIZ) != null && this.LJI != null) {
                    int i = this.LIZJ;
                    Intrinsics.checkNotNull(list);
                    if (i < list.size()) {
                        int i2 = this.LIZJ;
                        List<C3003a> list2 = this.LJI;
                        Intrinsics.checkNotNull(list2);
                        if (i2 < list2.size()) {
                            if (this.LIZJ < 0) {
                                C88440Kt0.LIZ(2131583012);
                                return;
                            }
                            DataCenter dataCenter = this.LIZLLL;
                            if (dataCenter != null && (room = (Room) dataCenter.get("data_room", (String) null)) != null) {
                                long id = room.getId();
                                KQH kqh = this.f25822LJ;
                                if (kqh == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("");
                                }
                                List<C3160f> list3 = this.LIZIZ;
                                Intrinsics.checkNotNull(list3);
                                String str = list3.get(this.LIZJ).LIZ;
                                if (!PatchProxy.proxy(new Object[]{new Long(id), str}, kqh, KQH.LIZ, false, 12).isSupported) {
                                    C106862S5w.LIZ(str);
                                    Disposable disposable = kqh.LIZJ;
                                    if (disposable != null) {
                                        disposable.dispose();
                                    }
                                    kqh.LIZJ = KBF.LIZIZ.LIZ().startDrawGame(id, str).subscribeOn(Schedulers.m138io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new KQF(kqh), new C86440K4k(kqh));
                                }
                                HashMap hashMap = new HashMap();
                                hashMap.put("anchor_id", String.valueOf(room.ownerUserId));
                                hashMap.put("room_id", String.valueOf(room.getId()));
                                List<C3160f> list4 = this.LIZIZ;
                                Intrinsics.checkNotNull(list4);
                                String str2 = list4.get(this.LIZJ).LIZ;
                                if (str2 != null) {
                                    hashMap.put("words", str2);
                                }
                                C4574547f.LIZ().LIZ("livesdk_pictionary_start", hashMap, new Object[0]);
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DrawWordsSelectView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C106862S5w.LIZ(context);
        MethodCollector.m14708i(1244);
        this.LIZJ = -1;
        this.LJIIIIZZ = new CompositeDisposable();
        View.inflate(context, 2131698488, this);
        this.LJI = new ArrayList();
        C3003a c3003a = new C3003a();
        c3003a.LIZ = (ImageView) LIZIZ(2131192528);
        c3003a.LIZIZ = (TextView) LIZIZ(2131192532);
        C3003a c3003a2 = new C3003a();
        c3003a2.LIZ = (ImageView) LIZIZ(2131192564);
        c3003a2.LIZIZ = (TextView) LIZIZ(2131192571);
        C3003a c3003a3 = new C3003a();
        c3003a3.LIZ = (ImageView) LIZIZ(2131168249);
        c3003a3.LIZIZ = (TextView) LIZIZ(2131168251);
        C3003a c3003a4 = new C3003a();
        c3003a4.LIZ = (ImageView) LIZIZ(2131168285);
        c3003a4.LIZIZ = (TextView) LIZIZ(2131168287);
        List<C3003a> list = this.LJI;
        if (list != null) {
            list.add(c3003a);
        }
        List<C3003a> list2 = this.LJI;
        if (list2 != null) {
            list2.add(c3003a2);
        }
        List<C3003a> list3 = this.LJI;
        if (list3 != null) {
            list3.add(c3003a3);
        }
        List<C3003a> list4 = this.LJI;
        if (list4 != null) {
            list4.add(c3003a4);
        }
        ((RelativeLayout) LIZIZ(2131192524)).setOnClickListener(this);
        ((RelativeLayout) LIZIZ(2131192553)).setOnClickListener(this);
        ((RelativeLayout) LIZIZ(2131168244)).setOnClickListener(this);
        ((RelativeLayout) LIZIZ(2131168284)).setOnClickListener(this);
        ((TextView) LIZIZ(2131190433)).setOnClickListener(this);
        this.LJFF = new KQD(this);
        MethodCollector.m14707o(1244);
    }

    public /* synthetic */ DrawWordsSelectView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
