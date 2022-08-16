package com.bytedance.android.live.broadcastgame.opengame.lynx;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.google.gson.reflect.TypeToken;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsJVMKt;
import p003X.C106862S5w;
import p003X.C436843Py;
import p003X.C87960KlG;
import p003X.C87972KlS;
import p003X.C88260Kq6;
import p003X.LK1;

/* loaded from: classes5.dex */
public final class LynxOpenPlugin$onStart$$inlined$let$lambda$1 extends Lambda implements Function3<String, String, String, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C87960KlG this$0;

    static {
        Covode.recordClassIndex(20218);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LynxOpenPlugin$onStart$$inlined$let$lambda$1(C87960KlG c87960KlG) {
        super(3);
        this.this$0 = c87960KlG;
    }

    @Override // kotlin.jvm.functions.Function3
    public final /* synthetic */ Unit invoke(String str, String str2, String str3) {
        String str4 = str;
        String str5 = str2;
        final String str6 = str3;
        if (!PatchProxy.proxy(new Object[]{str4, str5, str6}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(str4, str5, str6);
            C87960KlG c87960KlG = this.this$0;
            c87960KlG.debugPrefix = str4;
            c87960KlG.configPath = str6;
            if (!StringsKt__StringsJVMKt.isBlank(str6)) {
                Observable.just(str6).subscribeOn(Schedulers.m138io()).subscribe(new Consumer<String>() { // from class: com.bytedance.android.live.broadcastgame.opengame.lynx.LynxOpenPlugin$onStart$$inlined$let$lambda$1.1
                    public static ChangeQuickRedirect LIZ;

                    static {
                        Covode.recordClassIndex(20219);
                    }

                    /* renamed from: com.bytedance.android.live.broadcastgame.opengame.lynx.LynxOpenPlugin$onStart$$inlined$let$lambda$1$1$2 */
                    /* loaded from: classes5.dex */
                    public static final class C35012 extends Lambda implements Function0<Unit> {
                        public static ChangeQuickRedirect changeQuickRedirect;
                        public final /* synthetic */ C3503a $it;
                        public final /* synthetic */ C34991 this$0;

                        static {
                            Covode.recordClassIndex(20221);
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public C35012(C3503a c3503a, C34991 c34991) {
                            super(0);
                            this.$it = c3503a;
                            this.this$0 = c34991;
                        }

                        @Override // kotlin.jvm.functions.Function0
                        /* renamed from: invoke */
                        public final /* synthetic */ Unit mo30099invoke() {
                            String str;
                            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
                                C87960KlG c87960KlG = LynxOpenPlugin$onStart$$inlined$let$lambda$1.this.this$0;
                                C87972KlS c87972KlS = this.$it.LJII;
                                if (c87972KlS != null) {
                                    str = c87972KlS.LIZ;
                                } else {
                                    str = null;
                                }
                                c87960KlG.setHeight(str);
                            }
                            return Unit.INSTANCE;
                        }
                    }

                    @Override // io.reactivex.functions.Consumer
                    public final /* synthetic */ void accept(String str7) {
                        C3503a c3503a;
                        if (!PatchProxy.proxy(new Object[]{str7}, this, LIZ, false, 1).isSupported && (c3503a = (C3503a) C436843Py.LIZ(C88260Kq6.LIZIZ.LIZIZ(str6), new TypeToken<C3503a>() { // from class: com.bytedance.android.live.broadcastgame.opengame.lynx.LynxOpenPlugin$onStart$.inlined.let.lambda.1.1.1
                            static {
                                Covode.recordClassIndex(20220);
                            }
                        }.getType())) != null) {
                            LK1.LIZ(0L, false, false, new C35012(c3503a, this), 7, null);
                        }
                    }
                });
            }
            this.this$0.debugLoad(StringsKt__StringsJVMKt.replace$default(str5, str4, "", false, 4, (Object) null), str5);
        }
        return Unit.INSTANCE;
    }
}
