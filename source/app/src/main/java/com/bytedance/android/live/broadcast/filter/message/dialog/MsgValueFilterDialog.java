package com.bytedance.android.live.broadcast.filter.message.dialog;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.android.live.broadcast.filter.message.p265a.C3011e;
import com.bytedance.android.livesdk.widget.LiveNumberPicker;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.DataCenter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC77736Gkk;
import p003X.C106862S5w;
import p003X.C116971W2r;
import p003X.C87064KSk;
import p003X.C87065KSl;
import p003X.C87068KSo;
import p003X.C87071KSr;
import p003X.C87073KSt;
import p003X.C87074KSu;
import p003X.LK5;
import p003X.View$OnClickListenerC87062KSi;
import p003X.View$OnClickListenerC87072KSs;

/* loaded from: classes5.dex */
public final class MsgValueFilterDialog extends AbstractC77736Gkk {
    public static ChangeQuickRedirect LIZIZ;
    public DataCenter LIZJ;
    public Type LIZLLL;

    /* renamed from: LJ */
    public boolean f25824LJ;
    public LiveNumberPicker LJFF;
    public TextView LJI;
    public List<Integer> LJII;
    public HashMap LJIIIIZZ;

    /* loaded from: classes5.dex */
    public enum Type {
        EACH_GIFT,
        FANS_LEVEL,
        USER_LEVEL;
        
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(15815);
        }

        public static Type valueOf(String str) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
            return (Type) (proxy.isSupported ? proxy.result : Enum.valueOf(Type.class, str));
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static Type[] valuesCustom() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
            return (Type[]) (proxy.isSupported ? proxy.result : values().clone());
        }
    }

    static {
        Covode.recordClassIndex(15814);
    }

    @Override // p003X.AbstractC77736Gkk
    public final void LIZLLL() {
        HashMap hashMap;
        if (!PatchProxy.proxy(new Object[0], this, LIZIZ, false, 11).isSupported && (hashMap = this.LJIIIIZZ) != null) {
            hashMap.clear();
        }
    }

    @Override // p003X.AbstractC77736Gkk, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 12).isSupported) {
            return;
        }
        super.onDestroyView();
        LIZLLL();
    }

    @Override // p003X.AbstractC77736Gkk
    public final ViewGroup.LayoutParams LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZIZ, false, 1);
        if (proxy.isSupported) {
            return (ViewGroup.LayoutParams) proxy.result;
        }
        return new ViewGroup.LayoutParams(-1, LK5.LIZ(258.0f));
    }

    @Override // p003X.AbstractC77736Gkk
    public final DataCenter LIZIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZIZ, false, 2);
        if (proxy.isSupported) {
            return (DataCenter) proxy.result;
        }
        DataCenter dataCenter = this.LIZJ;
        if (dataCenter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return dataCenter;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0092  */
    @Override // p003X.AbstractC77736Gkk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void LIZJ() {
        /*
            r4 = this;
            r2 = 0
            java.lang.Object[] r3 = new java.lang.Object[r2]
            com.bytedance.hotfix.base.ChangeQuickRedirect r1 = com.bytedance.android.live.broadcast.filter.message.dialog.MsgValueFilterDialog.LIZIZ
            r0 = 7
            com.bytedance.hotfix.PatchProxyResult r0 = com.bytedance.hotfix.PatchProxy.proxy(r3, r4, r1, r2, r0)
            boolean r0 = r0.isSupported
            if (r0 == 0) goto Lf
            return
        Lf:
            java.util.List<java.lang.Integer> r1 = r4.LJII
            java.lang.String r3 = ""
            if (r1 == 0) goto L6a
            com.bytedance.android.livesdk.widget.LiveNumberPicker r0 = r4.LJFF
            if (r0 != 0) goto L1c
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r3)
        L1c:
            int r0 = r0.getCurrentNumber()
            java.lang.Object r0 = r1.get(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto L6a
            int r1 = r0.intValue()
        L2c:
            com.bytedance.android.live.broadcast.filter.message.dialog.MsgValueFilterDialog$Type r0 = r4.LIZLLL
            if (r0 != 0) goto L33
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r3)
        L33:
            int[] r3 = p003X.C87065KSl.f8483LJ
            int r0 = r0.ordinal()
            r3 = r3[r0]
            r0 = 1
            if (r3 == r0) goto L92
            r0 = 2
            if (r3 == r0) goto L6c
            r0 = 3
            if (r3 != r0) goto L69
            X.KSG r0 = p003X.C87064KSk.f8482LJ
            X.KSk r0 = r0.LIZ()
            com.bytedance.android.live.broadcast.filter.message.a.e r0 = r0.LIZIZ
            if (r0 == 0) goto L56
            X.KSo r0 = r0.LIZJ
            if (r0 == 0) goto L56
            int r0 = r0.LIZIZ
            if (r0 == r1) goto L57
        L56:
            r2 = 1
        L57:
            r4.f25824LJ = r2
            X.KSG r0 = p003X.C87064KSk.f8482LJ
            X.KSk r0 = r0.LIZ()
            com.bytedance.android.live.broadcast.filter.message.a.e r0 = r0.LIZIZ
            if (r0 == 0) goto L69
            X.KSo r0 = r0.LIZJ
            if (r0 == 0) goto L69
            r0.LIZIZ = r1
        L69:
            return
        L6a:
            r1 = 0
            goto L2c
        L6c:
            X.KSG r0 = p003X.C87064KSk.f8482LJ
            X.KSk r0 = r0.LIZ()
            com.bytedance.android.live.broadcast.filter.message.a.e r0 = r0.LIZIZ
            if (r0 == 0) goto L7e
            X.KSo r0 = r0.LIZJ
            if (r0 == 0) goto L7e
            int r0 = r0.LIZ
            if (r0 == r1) goto L7f
        L7e:
            r2 = 1
        L7f:
            r4.f25824LJ = r2
            X.KSG r0 = p003X.C87064KSk.f8482LJ
            X.KSk r0 = r0.LIZ()
            com.bytedance.android.live.broadcast.filter.message.a.e r0 = r0.LIZIZ
            if (r0 == 0) goto L91
            X.KSo r0 = r0.LIZJ
            if (r0 == 0) goto L91
            r0.LIZ = r1
        L91:
            return
        L92:
            X.KSG r0 = p003X.C87064KSk.f8482LJ
            X.KSk r0 = r0.LIZ()
            com.bytedance.android.live.broadcast.filter.message.a.e r0 = r0.LIZIZ
            if (r0 == 0) goto La4
            X.KSu r0 = r0.LIZLLL
            if (r0 == 0) goto La4
            int r0 = r0.LIZ
            if (r0 == r1) goto La5
        La4:
            r2 = 1
        La5:
            r4.f25824LJ = r2
            X.KSG r0 = p003X.C87064KSk.f8482LJ
            X.KSk r0 = r0.LIZ()
            com.bytedance.android.live.broadcast.filter.message.a.e r0 = r0.LIZIZ
            if (r0 == 0) goto Lb7
            X.KSu r0 = r0.LIZLLL
            if (r0 == 0) goto Lb7
            r0.LIZ = r1
        Lb7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.broadcast.filter.message.dialog.MsgValueFilterDialog.LIZJ():void");
    }

    @Override // p003X.AbstractC77736Gkk, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{bundle}, this, LIZIZ, false, 3).isSupported) {
            return;
        }
        super.onCreate(bundle);
        setStyle(1, 2131494843);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        List<Integer> list;
        Integer num;
        String LIZ;
        C87074KSu c87074KSu;
        C87073KSt c87073KSt;
        ArrayList arrayList;
        String LIZ2;
        List<Integer> list2;
        C87068KSo c87068KSo;
        C87071KSr c87071KSr;
        List<Integer> list3;
        C87068KSo c87068KSo2;
        C87071KSr c87071KSr2;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, bundle}, this, LIZIZ, false, 4);
        if (proxy.isSupported) {
            return (View) proxy.result;
        }
        C106862S5w.LIZ(layoutInflater);
        View LIZ3 = C116971W2r.LIZ(layoutInflater, 2131700296, viewGroup, false);
        View findViewById = LIZ3.findViewById(2131192885);
        Intrinsics.checkNotNullExpressionValue(findViewById, "");
        this.LJFF = (LiveNumberPicker) findViewById;
        LIZ3.findViewById(2131192876).setOnClickListener(new View$OnClickListenerC87072KSs(this));
        LIZ3.findViewById(2131192877).setOnClickListener(new View$OnClickListenerC87062KSi(this));
        View findViewById2 = LIZ3.findViewById(2131193174);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "");
        this.LJI = (TextView) findViewById2;
        if (!PatchProxy.proxy(new Object[0], this, LIZIZ, false, 6).isSupported) {
            Type type = this.LIZLLL;
            if (type == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            int i = C87065KSl.LIZIZ[type.ordinal()];
            String[] strArr = null;
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        num = null;
                        LIZ = null;
                    } else {
                        C3011e c3011e = C87064KSk.f8482LJ.LIZ().LIZIZ;
                        if (c3011e != null && (c87071KSr2 = c3011e.LIZ) != null) {
                            list3 = c87071KSr2.LIZIZ;
                        } else {
                            list3 = null;
                        }
                        this.LJII = list3;
                        C3011e c3011e2 = C87064KSk.f8482LJ.LIZ().LIZIZ;
                        if (c3011e2 != null && (c87068KSo2 = c3011e2.LIZJ) != null) {
                            num = Integer.valueOf(c87068KSo2.LIZIZ);
                        } else {
                            num = null;
                        }
                        LIZ = LK5.LIZ(2131583245);
                    }
                } else {
                    C3011e c3011e3 = C87064KSk.f8482LJ.LIZ().LIZIZ;
                    if (c3011e3 != null && (c87071KSr = c3011e3.LIZ) != null) {
                        list2 = c87071KSr.LIZ;
                    } else {
                        list2 = null;
                    }
                    this.LJII = list2;
                    C3011e c3011e4 = C87064KSk.f8482LJ.LIZ().LIZIZ;
                    if (c3011e4 != null && (c87068KSo = c3011e4.LIZJ) != null) {
                        num = Integer.valueOf(c87068KSo.LIZ);
                    } else {
                        num = null;
                    }
                    LIZ = LK5.LIZ(2131583228);
                }
            } else {
                C3011e c3011e5 = C87064KSk.f8482LJ.LIZ().LIZIZ;
                if (c3011e5 != null && (c87073KSt = c3011e5.LIZIZ) != null) {
                    list = c87073KSt.LIZ;
                } else {
                    list = null;
                }
                this.LJII = list;
                C3011e c3011e6 = C87064KSk.f8482LJ.LIZ().LIZIZ;
                if (c3011e6 != null && (c87074KSu = c3011e6.LIZLLL) != null) {
                    num = Integer.valueOf(c87074KSu.LIZ);
                } else {
                    num = null;
                }
                LIZ = LK5.LIZ(2131583224);
            }
            List<Integer> list4 = this.LJII;
            if (list4 != null) {
                ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list4, 10));
                for (Number number : list4) {
                    int intValue = number.intValue();
                    if (intValue == 0) {
                        Type type2 = this.LIZLLL;
                        if (type2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("");
                        }
                        int i2 = C87065KSl.LIZJ[type2.ordinal()];
                        if (i2 != 1) {
                            if (i2 != 2 && i2 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            LIZ2 = LK5.LIZ(2131583231);
                        } else {
                            LIZ2 = LK5.LIZ(2131583244);
                        }
                    } else {
                        Type type3 = this.LIZLLL;
                        if (type3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("");
                        }
                        int i3 = C87065KSl.LIZLLL[type3.ordinal()];
                        if (i3 != 1) {
                            if (i3 != 2) {
                                if (i3 == 3) {
                                    LIZ2 = LK5.LIZ(2131583246, Integer.valueOf(intValue));
                                } else {
                                    throw new NoWhenBranchMatchedException();
                                }
                            } else {
                                LIZ2 = LK5.LIZ(2131583229, Integer.valueOf(intValue));
                            }
                        } else {
                            LIZ2 = LK5.LIZ(2131583225, Integer.valueOf(intValue));
                        }
                    }
                    arrayList2.add(LIZ2);
                }
                arrayList = arrayList2;
            } else {
                arrayList = null;
            }
            LiveNumberPicker liveNumberPicker = this.LJFF;
            if (liveNumberPicker == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            if (arrayList != null) {
                Object[] array = arrayList.toArray(new String[0]);
                if (array != null) {
                    strArr = (String[]) array;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
            }
            liveNumberPicker.LIZ(strArr);
            List<Integer> list5 = this.LJII;
            if (list5 != null && (!list5.isEmpty())) {
                LiveNumberPicker liveNumberPicker2 = this.LJFF;
                if (liveNumberPicker2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                }
                liveNumberPicker2.LIZ(0);
                LiveNumberPicker liveNumberPicker3 = this.LJFF;
                if (liveNumberPicker3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                }
                liveNumberPicker3.LIZIZ(list5.size() - 1);
            }
            if (num != null) {
                int intValue2 = num.intValue();
                List<Integer> list6 = this.LJII;
                if (list6 != null) {
                    LiveNumberPicker liveNumberPicker4 = this.LJFF;
                    if (liveNumberPicker4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                    }
                    liveNumberPicker4.LIZJ(list6.indexOf(Integer.valueOf(intValue2)));
                }
            }
            if (LIZ != null) {
                TextView textView = this.LJI;
                if (textView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                }
                textView.setText(LIZ);
            }
        }
        return LIZ3;
    }
}
