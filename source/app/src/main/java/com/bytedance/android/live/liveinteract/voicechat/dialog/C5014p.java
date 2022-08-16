package com.bytedance.android.live.liveinteract.voicechat.dialog;

import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.viewbinder.C4319a;
import com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.viewbinder.ae$a;
import com.bytedance.android.live.liveinteract.plantform.api.LinkApi;
import com.bytedance.android.live.liveinteract.plantform.model.C4821p;
import com.bytedance.android.live.liveinteract.plantform.model.C4822q;
import com.bytedance.android.live.liveinteract.voicechat.dialog.C5014p;
import com.bytedance.android.live.network.response.C5176i;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.message.C9605p;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.live.datacontext.C13491f;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p003X.C100839PnV;
import p003X.C88306Kqq;
import p003X.QB4;

/* renamed from: com.bytedance.android.live.liveinteract.voicechat.dialog.p */
/* loaded from: classes12.dex */
public final class C5014p extends C13491f {
    public static ChangeQuickRedirect LIZ;
    public MutableLiveData<C9605p> LJFF;
    public final MutableLiveData<C4822q> LJI;
    public final MutableLiveData<List<Object>> LJII;
    public boolean LJIIIZ;
    public String LIZIZ = "";
    public final C4319a LIZJ = new C4319a(0);
    public final C4319a LIZLLL = new C4319a(1);

    /* renamed from: LJ */
    public boolean f26483LJ = true;
    public final CompositeDisposable LJIIIIZZ = new CompositeDisposable();

    static {
        Covode.recordClassIndex(31100);
    }

    public C5014p() {
        MutableLiveData<C9605p> mutableLiveData = new MutableLiveData<>();
        mutableLiveData.setValue(null);
        this.LJFF = mutableLiveData;
        MutableLiveData<C4822q> mutableLiveData2 = new MutableLiveData<>();
        mutableLiveData2.setValue(null);
        this.LJI = mutableLiveData2;
        MutableLiveData<List<Object>> mutableLiveData3 = new MutableLiveData<>();
        mutableLiveData3.setValue(null);
        this.LJII = mutableLiveData3;
    }

    public final void LIZ(Room room, boolean z) {
        if (PatchProxy.proxy(new Object[]{room, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 1).isSupported) {
            return;
        }
        if (z) {
            this.LIZIZ = "";
            List<Object> value = this.LJII.getValue();
            if (value != null) {
                value.clear();
            }
            if (room == null || this.LJIIIZ) {
                return;
            }
        } else if (!this.f26483LJ || room == null || this.LJIIIZ) {
            return;
        }
        this.LJIIIZ = true;
        Intrinsics.checkNotNull(room);
        QB4.LIZ(((LinkApi) C88306Kqq.LIZ().LIZ(LinkApi.class)).getPrepareApplyList(room.getId(), this.LIZIZ, 50).compose(C100839PnV.LIZJ()).subscribe(new Consumer<C5176i<C4821p>>() { // from class: X.3p5
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(31106);
            }

            @Override // io.reactivex.functions.Consumer
            public final /* synthetic */ void accept(C5176i<C4821p> c5176i) {
                C4821p c4821p;
                Long l;
                C5176i<C4821p> c5176i2 = c5176i;
                if (!PatchProxy.proxy(new Object[]{c5176i2}, this, LIZ, false, 1).isSupported) {
                    if (c5176i2 != null && (c4821p = c5176i2.LIZJ) != null) {
                        C4822q c4822q = c4821p.f26424LJ;
                        if (c4822q != null) {
                            c4822q.f26425LJ = c4821p.LJI;
                        }
                        C5014p.this.LJI.setValue(c4821p.f26424LJ);
                        if (c4821p.f26424LJ != null) {
                            C5014p.this.LJFF.setValue(c4821p.LJFF);
                        }
                        C5014p c5014p = C5014p.this;
                        List<C4822q> list = c4821p.LIZ;
                        boolean z2 = c4821p.LIZIZ;
                        long j = c4821p.LJI;
                        if (!PatchProxy.proxy(new Object[]{list, Byte.valueOf(z2 ? (byte) 1 : (byte) 0), new Long(j)}, c5014p, C5014p.LIZ, false, 6).isSupported) {
                            ArrayList arrayList = new ArrayList();
                            List<Object> value2 = c5014p.LJII.getValue();
                            if (value2 != null) {
                                arrayList.addAll(value2);
                            }
                            if (CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) arrayList) instanceof ae$a) {
                                arrayList.remove(0);
                            }
                            if (CollectionsKt___CollectionsKt.lastOrNull((List<? extends Object>) arrayList) instanceof C4319a) {
                                arrayList.remove(CollectionsKt__CollectionsKt.getLastIndex(arrayList));
                            }
                            if (list != null && !list.isEmpty()) {
                                arrayList.addAll(list);
                            }
                            if (arrayList.size() > 0) {
                                int i = 0;
                                for (T t : arrayList) {
                                    int i2 = i + 1;
                                    if (i < 0) {
                                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                                    }
                                    if (t instanceof C4822q) {
                                        C4822q c4822q2 = (C4822q) t;
                                        c4822q2.f26425LJ = j;
                                        C4822q value3 = c5014p.LJI.getValue();
                                        if (c4822q2.LIZ != null) {
                                            Long l2 = null;
                                            if (value3 != null && value3.LIZ != null) {
                                                User user = c4822q2.LIZ;
                                                if (user != null) {
                                                    l = Long.valueOf(user.getId());
                                                } else {
                                                    l = null;
                                                }
                                                User user2 = value3.LIZ;
                                                if (user2 != null) {
                                                    l2 = Long.valueOf(user2.getId());
                                                }
                                                if (Intrinsics.areEqual(l, l2)) {
                                                    value3.LIZJ = i2;
                                                    c5014p.LJI.setValue(value3);
                                                }
                                            }
                                        }
                                    }
                                    i = i2;
                                }
                                arrayList.add(0, new Object() { // from class: com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.viewbinder.ae$a
                                    static {
                                        Covode.recordClassIndex(26028);
                                    }
                                });
                                if (z2) {
                                    arrayList.add(c5014p.LIZJ);
                                } else {
                                    arrayList.add(c5014p.LIZLLL);
                                }
                            }
                            c5014p.LJII.setValue(arrayList);
                            c5014p.f26483LJ = z2;
                        }
                        String str = c4821p.LIZLLL;
                        if (str != null) {
                            C5014p.this.LIZIZ = str;
                        }
                    }
                    C5014p.this.LJIIIZ = false;
                }
            }
        }, new Consumer<Throwable>() { // from class: X.3p6
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(31107);
            }

            @Override // io.reactivex.functions.Consumer
            public final /* synthetic */ void accept(Throwable th) {
                if (!PatchProxy.proxy(new Object[]{th}, this, LIZ, false, 1).isSupported) {
                    C5014p.this.LJIIIZ = false;
                    ALogger.m15800e("GuestApplyViewModel", "getWaitingList fail!");
                }
            }
        }), this.LJIIIIZZ);
    }
}
