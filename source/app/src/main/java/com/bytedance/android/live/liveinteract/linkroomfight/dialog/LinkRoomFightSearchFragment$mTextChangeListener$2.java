package com.bytedance.android.live.liveinteract.linkroomfight.dialog;

import android.text.Editable;
import android.text.TextWatcher;
import com.bytedance.android.live.liveinteract.linkroomfight.api.LinkRoomFightApi;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.C100839PnV;
import p003X.C106862S5w;
import p003X.C80087HhZ;
import p003X.C80091Hhd;
import p003X.C80093Hhf;
import p003X.C80096Hhi;
import p003X.C88306Kqq;

/* loaded from: classes3.dex */
public final class LinkRoomFightSearchFragment$mTextChangeListener$2 extends Lambda implements Function0<C45111> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C80087HhZ this$0;

    static {
        Covode.recordClassIndex(27686);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkRoomFightSearchFragment$mTextChangeListener$2(C80087HhZ c80087HhZ) {
        super(0);
        this.this$0 = c80087HhZ;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.bytedance.android.live.liveinteract.linkroomfight.dialog.LinkRoomFightSearchFragment$mTextChangeListener$2$1] */
    /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.android.live.liveinteract.linkroomfight.dialog.LinkRoomFightSearchFragment$mTextChangeListener$2$1, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ C45111 mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return new TextWatcher() { // from class: com.bytedance.android.live.liveinteract.linkroomfight.dialog.LinkRoomFightSearchFragment$mTextChangeListener$2.1
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(27687);
            }

            @Override // android.text.TextWatcher
            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public final void afterTextChanged(Editable editable) {
                if (PatchProxy.proxy(new Object[]{editable}, this, LIZ, false, 1).isSupported) {
                    return;
                }
                Editable text = C80087HhZ.LIZIZ(LinkRoomFightSearchFragment$mTextChangeListener$2.this.this$0).getText();
                Intrinsics.checkNotNullExpressionValue(text, "");
                if (text.length() > 0) {
                    C80087HhZ.LIZJ(LinkRoomFightSearchFragment$mTextChangeListener$2.this.this$0).setVisibility(0);
                    LinkRoomFightSearchFragment$mTextChangeListener$2.this.this$0.LJIIL();
                    if (!LinkRoomFightSearchFragment$mTextChangeListener$2.this.this$0.LJIIL) {
                        C80091Hhd LIZ2 = C80087HhZ.LIZ(LinkRoomFightSearchFragment$mTextChangeListener$2.this.this$0);
                        String valueOf = String.valueOf(editable);
                        if (!PatchProxy.proxy(new Object[]{valueOf}, LIZ2, C80091Hhd.f6926LJ, false, 4).isSupported) {
                            C106862S5w.LIZ(valueOf);
                            LIZ2.LJFF.add(((LinkRoomFightApi) C88306Kqq.LIZ().LIZ(LinkRoomFightApi.class)).searchRivalsHint("live_pk", 30010L, valueOf).compose(C100839PnV.LIZJ()).subscribe(new C80093Hhf(LIZ2), new C80096Hhi<>(LIZ2)));
                        }
                    }
                    LinkRoomFightSearchFragment$mTextChangeListener$2.this.this$0.LJIIL = false;
                    return;
                }
                C80087HhZ.LIZJ(LinkRoomFightSearchFragment$mTextChangeListener$2.this.this$0).setVisibility(8);
                LinkRoomFightSearchFragment$mTextChangeListener$2.this.this$0.LJIILJJIL();
                C80087HhZ.LIZ(LinkRoomFightSearchFragment$mTextChangeListener$2.this.this$0).LIZIZ();
            }
        };
    }
}
