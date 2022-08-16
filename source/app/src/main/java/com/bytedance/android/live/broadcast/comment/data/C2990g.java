package com.bytedance.android.live.broadcast.comment.data;

import android.content.Context;
import android.text.TextUtils;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.base.exception.ApiServerException;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.broadcast.C3243u;
import com.bytedance.android.live.broadcast.api.model.C2917q;
import com.bytedance.android.live.broadcast.gamedetail.AbstractC3095d;
import com.bytedance.android.live.broadcast.imagechoose.c$a;
import com.bytedance.android.live.core.network.CustomApiServerException;
import com.bytedance.android.live.network.response.C5176i;
import com.bytedance.android.live.user.IUserService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdk.chatroom.C5923dp;
import com.bytedance.android.livesdk.user.C9284h;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.json.JSONArray;
import org.json.JSONObject;
import p003X.AbstractC88964L3m;
import p003X.C100839PnV;
import p003X.C106862S5w;
import p003X.C109391T5d;
import p003X.C2K6;
import p003X.C2K7;
import p003X.C2WC;
import p003X.C409882Kg;
import p003X.C81289I2h;
import p003X.C81909IQd;
import p003X.C87010KQi;
import p003X.C88306Kqq;
import p003X.C88440Kt0;
import p003X.C88955L3d;
import p003X.C88966L3o;
import p003X.C88967L3p;
import p003X.C88969L3r;
import p003X.C88970L3s;
import p003X.C88971L3t;
import p003X.C88972L3u;
import p003X.C88973L3v;
import p003X.LK5;

/* renamed from: com.bytedance.android.live.broadcast.comment.data.g */
/* loaded from: classes5.dex */
public final class C2990g extends AbstractC3095d {
    public static ChangeQuickRedirect LIZ;
    public static final /* synthetic */ KProperty[] LIZIZ;
    public int LIZJ;
    public boolean LIZLLL;

    /* renamed from: LJ */
    public C3243u f25812LJ;
    public String LJFF = "";
    public ArrayList<C2917q> LJI = new ArrayList<>();
    public String LJII = "";
    public FragmentManager LJIIIIZZ;
    public boolean LJIIIZ;
    public final C81289I2h LJIIJ;

    static {
        Covode.recordClassIndex(15322);
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(C2990g.class, "likeCommentId", "getLikeCommentId()Lcom/bytedance/live/datacontext/IMutableNonNull;", 0);
        Reflection.property1(propertyReference1Impl);
        LIZIZ = new KProperty[]{propertyReference1Impl};
    }

    public final C2WC<String> LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 2);
        return (C2WC) (proxy.isSupported ? proxy.result : this.LJIIJ.LIZ(this, LIZIZ[0]));
    }

    public final void LIZ(Long l, final Function0<Unit> function0) {
        Observable<C5176i<Object>> observeOn;
        Observable<C5176i<Object>> doFinally;
        Disposable subscribe;
        if (PatchProxy.proxy(new Object[]{l, function0}, this, LIZ, false, 9).isSupported) {
            return;
        }
        C106862S5w.LIZ(function0);
        if (this.LJIIIZ) {
            return;
        }
        this.LJIIIZ = true;
        Observable<C5176i<Object>> deleteEvaluation = ((AudienceGamePromoteCommentApi) C88306Kqq.LIZ().LIZ(AudienceGamePromoteCommentApi.class)).deleteEvaluation(String.valueOf(l));
        if (deleteEvaluation == null || (observeOn = deleteEvaluation.observeOn(AndroidSchedulers.mainThread())) == null || (doFinally = observeOn.doFinally(new C88969L3r(this))) == null || (subscribe = doFinally.subscribe(new Consumer<C5176i<Object>>() { // from class: X.1WH
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(15325);
            }

            @Override // io.reactivex.functions.Consumer
            public final /* synthetic */ void accept(C5176i<Object> c5176i) {
                if (!PatchProxy.proxy(new Object[]{c5176i}, this, LIZ, false, 1).isSupported) {
                    Function0.this.mo30099invoke();
                }
            }
        }, C2K6.LIZIZ)) == null) {
            return;
        }
        LIZ(subscribe);
    }

    public final void LIZIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 16).isSupported) {
            return;
        }
        C87010KQi.LIZ().LIZ(new c$a());
    }

    public C2990g() {
        C2WC<Room> LIZ2;
        Room LIZ3;
        C2WC<Room> LIZ4;
        Room LIZ5;
        C5923dp LIZ6 = C409882Kg.LIZ(C5923dp.LJIIJ, null, 0L, 3, null);
        if (LIZ6 != null && (LIZ4 = LIZ6.LIZ()) != null && (LIZ5 = LIZ4.LIZ()) != null) {
            String.valueOf(LIZ5.ownerUserId);
        }
        C5923dp LIZ7 = C409882Kg.LIZ(C5923dp.LJIIJ, null, 0L, 3, null);
        if (LIZ7 != null && (LIZ2 = LIZ7.LIZ()) != null && (LIZ3 = LIZ2.LIZ()) != null) {
            String.valueOf(LIZ3.getId());
        }
        this.LJIIJ = C81909IQd.LIZ(this, "", null, 2, null);
    }

    private final String LIZ(ArrayList<ImageModel> arrayList) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{arrayList}, this, LIZ, false, 17);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        JSONArray jSONArray = new JSONArray();
        if (arrayList != null) {
            Iterator<ImageModel> it = arrayList.iterator();
            while (it.hasNext()) {
                ImageModel next = it.next();
                JSONObject jSONObject = new JSONObject();
                Intrinsics.checkNotNullExpressionValue(next, "");
                jSONObject.put("uri", next.getUri());
                jSONObject.put("width", next.width);
                jSONObject.put(C109391T5d.LJFF, next.height);
                jSONArray.put(jSONObject);
            }
        }
        String jSONArray2 = jSONArray.toString();
        Intrinsics.checkNotNullExpressionValue(jSONArray2, "");
        return jSONArray2;
    }

    public final void LIZ(C2989f c2989f, AbstractC88964L3m abstractC88964L3m) {
        if (PatchProxy.proxy(new Object[]{c2989f, abstractC88964L3m}, this, LIZ, false, 3).isSupported) {
            return;
        }
        C106862S5w.LIZ(c2989f);
        if (this.LJIIIZ) {
            return;
        }
        this.LJIIIZ = true;
        Disposable subscribe = ((AudienceGamePromoteCommentApi) C88306Kqq.LIZ().LIZ(AudienceGamePromoteCommentApi.class)).makeComment(c2989f.LIZIZ, Double.valueOf(c2989f.LIZLLL), c2989f.f25811LJ, Long.valueOf(c2989f.LJII), LIZ(c2989f.LJI)).compose(C100839PnV.LIZJ()).doFinally(new C88970L3s(this)).subscribe(new C88967L3p(abstractC88964L3m), new C88955L3d(this, abstractC88964L3m));
        if (subscribe != null) {
            LIZ(subscribe);
        }
    }

    public final void LIZ(Context context, String str, String str2, String str3, Long l, String str4, String str5, String str6, final Function1<? super String, Unit> function1) {
        Observable<C5176i<C2992i>> observeOn;
        Observable<C5176i<C2992i>> doFinally;
        Disposable subscribe;
        if (PatchProxy.proxy(new Object[]{context, str, str2, str3, l, str4, str5, str6, function1}, this, LIZ, false, 7).isSupported) {
            return;
        }
        C106862S5w.LIZ(context, function1);
        if (!((IUserService) ServiceManager.getService(IUserService.class)).user().LIZLLL()) {
            ((IUserService) ServiceManager.getService(IUserService.class)).user().LIZ(context, C9284h.LIZ().LIZ()).observeOn(AndroidSchedulers.mainThread()).subscribe(C100839PnV.m22957LJ(), C100839PnV.LIZLLL());
            C88440Kt0.LIZ(LK5.LIZ(2131583618));
        } else if (this.LJIIIZ) {
        } else {
            this.LJIIIZ = true;
            HashMap hashMap = new HashMap();
            hashMap.put("game_id", String.valueOf(str));
            hashMap.put("content", String.valueOf(str2));
            hashMap.put("eval_id", String.valueOf(str3));
            hashMap.put("layer", String.valueOf(l));
            if (!TextUtils.isEmpty(str4)) {
                hashMap.put("reply_to_comment_id", String.valueOf(str4));
            }
            if (!TextUtils.isEmpty(str5)) {
                hashMap.put("reply_to_user_id", String.valueOf(str5));
            }
            if (!TextUtils.isEmpty(str6)) {
                hashMap.put("reply_to_reply_id", String.valueOf(str6));
            }
            Observable<C5176i<C2992i>> makeReply = ((AudienceGamePromoteCommentApi) C88306Kqq.LIZ().LIZ(AudienceGamePromoteCommentApi.class)).makeReply(hashMap);
            if (makeReply != null && (observeOn = makeReply.observeOn(AndroidSchedulers.mainThread())) != null && (doFinally = observeOn.doFinally(new C88972L3u(this))) != null && (subscribe = doFinally.subscribe(new C88973L3v(function1), new Consumer<Throwable>() { // from class: X.2K5
                public static ChangeQuickRedirect LIZ;

                static {
                    Covode.recordClassIndex(15335);
                }

                @Override // io.reactivex.functions.Consumer
                public final /* synthetic */ void accept(Throwable th) {
                    Throwable th2 = th;
                    if (!PatchProxy.proxy(new Object[]{th2}, this, LIZ, false, 1).isSupported) {
                        Function1.this.invoke("");
                        if (th2 instanceof CustomApiServerException) {
                            C88440Kt0.LIZ(((ApiServerException) th2).mPrompt);
                        } else {
                            C88440Kt0.LIZ(LK5.LIZ(2131583533));
                        }
                    }
                }
            })) != null) {
                LIZ(subscribe);
            }
        }
    }

    public final void LIZ(Context context, int i, String str, Integer num, Integer num2, String str2, Long l, String str3, String str4, Function1<? super Integer, Unit> function1) {
        Observable<C5176i<Object>> observeOn;
        Observable<C5176i<Object>> doFinally;
        Disposable subscribe;
        if (PatchProxy.proxy(new Object[]{context, Integer.valueOf(i), str, num, num2, str2, l, str3, str4, function1}, this, LIZ, false, 5).isSupported) {
            return;
        }
        C106862S5w.LIZ(context, function1);
        if (!((IUserService) ServiceManager.getService(IUserService.class)).user().LIZLLL()) {
            ((IUserService) ServiceManager.getService(IUserService.class)).user().LIZ(context, C9284h.LIZ().LIZ()).observeOn(AndroidSchedulers.mainThread()).subscribe(C100839PnV.m22957LJ(), C100839PnV.LIZLLL());
            C88440Kt0.LIZ(LK5.LIZ(2131583616));
        } else if (this.LJIIIZ) {
        } else {
            this.LJIIIZ = true;
            HashMap hashMap = new HashMap();
            hashMap.put("eval_id", String.valueOf(str));
            hashMap.put("game_id", String.valueOf(this.LJFF));
            hashMap.put("relation_type", String.valueOf(num));
            hashMap.put("action_type", String.valueOf(num2));
            if (l != null && ((int) l.longValue()) != 0) {
                hashMap.put("layer", String.valueOf(l));
            }
            if (!TextUtils.isEmpty(str3)) {
                hashMap.put("comment_id", String.valueOf(str3));
            }
            if (!TextUtils.isEmpty(str4)) {
                hashMap.put("parent_id", String.valueOf(str4));
            }
            Observable<C5176i<Object>> likeCommentRequest = ((AudienceGamePromoteCommentApi) C88306Kqq.LIZ().LIZ(AudienceGamePromoteCommentApi.class)).likeCommentRequest(hashMap);
            if (likeCommentRequest != null && (observeOn = likeCommentRequest.observeOn(AndroidSchedulers.mainThread())) != null && (doFinally = observeOn.doFinally(new C88971L3t(this))) != null && (subscribe = doFinally.subscribe(new C88966L3o(this, function1, i, str, l), C2K7.LIZIZ)) != null) {
                LIZ(subscribe);
            }
        }
    }

    public static /* synthetic */ void LIZ(C2990g c2990g, Context context, int i, String str, Integer num, Integer num2, String str2, Long l, String str3, String str4, Function1 function1, int i2, Object obj) {
        if (PatchProxy.proxy(new Object[]{c2990g, context, Integer.valueOf(i), str, num, num2, str2, null, null, null, function1, 448, null}, null, LIZ, true, 6).isSupported) {
            return;
        }
        c2990g.LIZ(context, i, str, num, num2, str2, 0L, "", "", function1);
    }
}
