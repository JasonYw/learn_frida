package com.android.ttcjpaysdk.bindcard.base.adpter;

import android.app.Activity;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.android.ttcjpaysdk.bindcard.base.bean.QuickBindCardAdapterBean;
import com.android.ttcjpaysdk.bindcard.base.utils.CJPayQuickBindCardUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.p1300mt.protector.impl.CastProtectorUtils;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.util.List;
import p002O.C0002O;
import p003X.AbstractC136198cNF;
import p003X.AbstractView$OnClickListenerC137362cg2;
import p003X.C116971W2r;
import p003X.C135272c8J;
import p003X.C135851cHe;
import p003X.C136129cM8;

/* loaded from: classes17.dex */
public final class BankCardListAdapter extends RecyclerView.Adapter<C2207b> {
    public static ChangeQuickRedirect LIZ;
    public AbstractC136198cNF LIZIZ;
    public boolean LIZJ;
    public List<QuickBindCardAdapterBean> LIZLLL;

    /* renamed from: LJ */
    public Activity f25469LJ;

    static {
        Covode.recordClassIndex(6992);
    }

    /* loaded from: classes17.dex */
    public enum QuickBindViewType {
        NORMAL(1),
        VOUCHER(2);
        
        public static ChangeQuickRedirect changeQuickRedirect;
        public final int value;

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static QuickBindViewType[] valuesCustom() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
            if (proxy.isSupported) {
                return (QuickBindViewType[]) proxy.result;
            }
            return (QuickBindViewType[]) values().clone();
        }

        static {
            Covode.recordClassIndex(6997);
        }

        public static QuickBindViewType valueOf(String str) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
            if (proxy.isSupported) {
                return (QuickBindViewType) proxy.result;
            }
            return (QuickBindViewType) Enum.valueOf(QuickBindViewType.class, str);
        }

        QuickBindViewType(int i) {
            this.value = i;
        }
    }

    public final void LIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 12).isSupported) {
            return;
        }
        this.LIZJ = false;
        for (int i = 0; i < this.LIZLLL.size(); i++) {
            this.LIZLLL.get(i).isLoading = false;
        }
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 6);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        List<QuickBindCardAdapterBean> list = this.LIZLLL;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    private boolean LIZIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 9);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        return PushConstants.PUSH_FLYME_3_CHANGE_VERSION_START.equalsIgnoreCase(this.LIZLLL.get(0).use_order_info_test);
    }

    private int LIZIZ(int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 13);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        TypedValue typedValue = new TypedValue();
        this.f25469LJ.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.data;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 7);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        if (i < this.LIZLLL.size() && this.LIZLLL.get(i).hasVoucher()) {
            return QuickBindViewType.VOUCHER.value;
        }
        return QuickBindViewType.NORMAL.value;
    }

    /* renamed from: com.android.ttcjpaysdk.bindcard.base.adpter.BankCardListAdapter$b */
    /* loaded from: classes17.dex */
    public static class C2207b extends RecyclerView.ViewHolder {
        public ImageView LIZ;
        public TextView LIZIZ;
        public TextView LIZJ;
        public View LIZLLL;

        /* renamed from: LJ */
        public ProgressBar f25470LJ;
        public ImageView LJFF;

        static {
            Covode.recordClassIndex(6999);
        }

        public C2207b(View view) {
            super(view);
            this.LIZ = (ImageView) view.findViewById(2131187012);
            this.LIZIZ = (TextView) view.findViewById(2131187011);
            this.LIZJ = (TextView) view.findViewById(2131187010);
            this.LIZLLL = view.findViewById(2131166677);
            this.f25470LJ = (ProgressBar) view.findViewById(2131187013);
            this.LJFF = (ImageView) view.findViewById(2131187014);
        }
    }

    public final void LIZ(int i) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 11).isSupported) {
            return;
        }
        this.LIZJ = true;
        for (int i2 = 0; i2 < this.LIZLLL.size(); i2++) {
            if (i == i2) {
                this.LIZLLL.get(i2).isLoading = true;
            } else {
                this.LIZLLL.get(i2).isLoading = false;
            }
        }
        notifyDataSetChanged();
    }

    public BankCardListAdapter(Activity activity, List<QuickBindCardAdapterBean> list) {
        this.LIZLLL = list;
        this.f25469LJ = activity;
    }

    private void LIZ(TextView textView, String str) {
        if (PatchProxy.proxy(new Object[]{textView, str}, this, LIZ, false, 4).isSupported) {
            return;
        }
        textView.setText(str);
        textView.setVisibility(0);
    }

    /* JADX WARN: Type inference failed for: r0v18, types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, com.android.ttcjpaysdk.bindcard.base.adpter.BankCardListAdapter$b] */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ C2207b onCreateViewHolder(ViewGroup viewGroup, int i) {
        View LIZ2;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{viewGroup, Integer.valueOf(i)}, this, LIZ, false, 8);
        if (proxy.isSupported) {
            return (RecyclerView.ViewHolder) proxy.result;
        }
        if (i == QuickBindViewType.VOUCHER.value) {
            if (LIZIZ()) {
                LIZ2 = C116971W2r.LIZ(LayoutInflater.from(viewGroup.getContext()), 2131690637, viewGroup, false);
            } else {
                LIZ2 = C116971W2r.LIZ(LayoutInflater.from(viewGroup.getContext()), 2131690636, viewGroup, false);
            }
            return new C136129cM8(LIZ2);
        }
        return new C2207b(C116971W2r.LIZ(LayoutInflater.from(viewGroup.getContext()), 2131690635, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ void onBindViewHolder(C2207b c2207b, final int i) {
        C2207b c2207b2 = c2207b;
        if (!PatchProxy.proxy(new Object[]{c2207b2, Integer.valueOf(i)}, this, LIZ, false, 1).isSupported && c2207b2 != null) {
            final QuickBindCardAdapterBean quickBindCardAdapterBean = this.LIZLLL.get(i);
            C135851cHe.LIZ(quickBindCardAdapterBean.bankIconUrl, c2207b2.LIZ);
            if (!PatchProxy.proxy(new Object[]{c2207b2}, this, LIZ, false, 5).isSupported) {
                int parseColor = CastProtectorUtils.parseColor("#161823");
                int parseColor2 = CastProtectorUtils.parseColor("#8A8B91");
                int parseColor3 = CastProtectorUtils.parseColor("#1e161823");
                try {
                    parseColor = LIZIZ(2130772636);
                } catch (Exception unused) {
                }
                try {
                    parseColor2 = LIZIZ(2130772705);
                } catch (Exception unused2) {
                }
                try {
                    parseColor3 = LIZIZ(2130772694);
                } catch (Exception unused3) {
                }
                c2207b2.LIZIZ.setTextColor(parseColor);
                c2207b2.LIZJ.setTextColor(parseColor2);
                c2207b2.LIZLLL.setBackgroundColor(parseColor3);
            }
            if (!PatchProxy.proxy(new Object[]{c2207b2}, this, LIZ, false, 10).isSupported && this.f25469LJ != null) {
                c2207b2.LIZ.setBackground(C135272c8J.LIZ(this.f25469LJ, 2130772715));
            }
            c2207b2.LIZIZ.setText(quickBindCardAdapterBean.bankName);
            if (!TextUtils.isEmpty(quickBindCardAdapterBean.descLable) && !LIZIZ()) {
                c2207b2.LIZJ.setVisibility(0);
                c2207b2.LIZJ.setText(quickBindCardAdapterBean.descLable);
            } else {
                c2207b2.LIZJ.setVisibility(8);
            }
            if (quickBindCardAdapterBean.isLoading) {
                c2207b2.f25470LJ.setVisibility(0);
                c2207b2.LJFF.setVisibility(4);
            } else {
                c2207b2.f25470LJ.setVisibility(4);
                c2207b2.LJFF.setVisibility(0);
            }
            if (i == this.LIZLLL.size() - 1) {
                c2207b2.LIZLLL.setVisibility(8);
            } else {
                c2207b2.LIZLLL.setVisibility(0);
            }
            if (c2207b2 instanceof C136129cM8) {
                final C136129cM8 c136129cM8 = (C136129cM8) c2207b2;
                if (!PatchProxy.proxy(new Object[]{c136129cM8, quickBindCardAdapterBean}, this, LIZ, false, 3).isSupported) {
                    c136129cM8.LJI.setVisibility(4);
                    c136129cM8.LJII.setVisibility(4);
                    if (quickBindCardAdapterBean.hasVoucher()) {
                        if (!TextUtils.isEmpty(quickBindCardAdapterBean.unionPayVoucher)) {
                            LIZ(c136129cM8.LJI, quickBindCardAdapterBean.unionPayVoucher);
                        } else {
                            if (CJPayQuickBindCardUtils.m16059LJ(quickBindCardAdapterBean.use_order_info_test)) {
                                if (!TextUtils.isEmpty(quickBindCardAdapterBean.fuseVoucher)) {
                                    LIZ(c136129cM8.LJI, quickBindCardAdapterBean.fuseVoucher);
                                }
                                if (!TextUtils.isEmpty(quickBindCardAdapterBean.cardBinVoucher)) {
                                    if (c136129cM8.LJI.getVisibility() == 0) {
                                        LIZ(c136129cM8.LJII, quickBindCardAdapterBean.cardBinVoucher);
                                    } else {
                                        LIZ(c136129cM8.LJI, quickBindCardAdapterBean.cardBinVoucher);
                                    }
                                }
                            } else if (TextUtils.equals(quickBindCardAdapterBean.debitVoucher, quickBindCardAdapterBean.creditVoucher)) {
                                LIZ(c136129cM8.LJI, quickBindCardAdapterBean.debitVoucher);
                            } else if (!TextUtils.equals(quickBindCardAdapterBean.cardType, "ALL")) {
                                if (!TextUtils.isEmpty(quickBindCardAdapterBean.debitVoucher)) {
                                    LIZ(c136129cM8.LJI, quickBindCardAdapterBean.debitVoucher);
                                }
                                if (!TextUtils.isEmpty(quickBindCardAdapterBean.creditVoucher)) {
                                    LIZ(c136129cM8.LJI, quickBindCardAdapterBean.creditVoucher);
                                }
                            } else {
                                if (!TextUtils.isEmpty(quickBindCardAdapterBean.debitVoucher)) {
                                    LIZ(c136129cM8.LJI, C0002O.m25086C("储蓄卡", quickBindCardAdapterBean.debitVoucher));
                                }
                                if (!TextUtils.isEmpty(quickBindCardAdapterBean.creditVoucher)) {
                                    if (c136129cM8.LJI.getVisibility() == 0) {
                                        LIZ(c136129cM8.LJII, C0002O.m25086C("信用卡", quickBindCardAdapterBean.creditVoucher));
                                    } else {
                                        LIZ(c136129cM8.LJI, C0002O.m25086C("信用卡", quickBindCardAdapterBean.creditVoucher));
                                    }
                                }
                            }
                            if (!PatchProxy.proxy(new Object[]{c136129cM8}, this, LIZ, false, 2).isSupported) {
                                if (LIZIZ()) {
                                    if (c136129cM8.LJII.getVisibility() == 0) {
                                        c136129cM8.LJII.post(new Runnable(this) { // from class: com.android.ttcjpaysdk.bindcard.base.adpter.BankCardListAdapter.2
                                            public static ChangeQuickRedirect LIZ;

                                            static {
                                                Covode.recordClassIndex(6994);
                                            }

                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported && c136129cM8.LJII.getLeft() - c136129cM8.LIZIZ.getRight() < 20) {
                                                    c136129cM8.LJII.setVisibility(4);
                                                }
                                            }
                                        });
                                    } else if (c136129cM8.LJI.getVisibility() == 0) {
                                        c136129cM8.LJI.post(new Runnable(this) { // from class: com.android.ttcjpaysdk.bindcard.base.adpter.BankCardListAdapter.3
                                            public static ChangeQuickRedirect LIZ;

                                            static {
                                                Covode.recordClassIndex(6995);
                                            }

                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
                                                    return;
                                                }
                                                String charSequence = c136129cM8.LJI.getText().toString();
                                                float right = (c136129cM8.LJI.getRight() - c136129cM8.LIZIZ.getRight()) - 20;
                                                if (c136129cM8.LJI.getPaint().measureText(charSequence) > right) {
                                                    int length = charSequence.length();
                                                    String str = charSequence;
                                                    while (length > 0) {
                                                        TextPaint paint = c136129cM8.LJI.getPaint();
                                                        new StringBuilder();
                                                        if (paint.measureText(C0002O.m25086C(str, "...")) <= right) {
                                                            break;
                                                        }
                                                        length--;
                                                        str = str.substring(0, length);
                                                    }
                                                    new StringBuilder();
                                                    int i2 = length / 2;
                                                    charSequence = C0002O.m25085C(charSequence.substring(0, i2), "...", charSequence.substring(charSequence.length() - (length - i2)));
                                                }
                                                c136129cM8.LJI.setText(charSequence);
                                            }
                                        });
                                    }
                                } else if (c136129cM8.LJII.getVisibility() == 0 && c136129cM8.LIZJ.getVisibility() == 0) {
                                    c136129cM8.LJII.post(new Runnable(this) { // from class: com.android.ttcjpaysdk.bindcard.base.adpter.BankCardListAdapter.4
                                        public static ChangeQuickRedirect LIZ;

                                        static {
                                            Covode.recordClassIndex(6996);
                                        }

                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported && c136129cM8.LIZJ.getLeft() - c136129cM8.LJII.getRight() < 20) {
                                                c136129cM8.LIZJ.setVisibility(8);
                                            }
                                        }
                                    });
                                }
                            }
                        }
                    }
                }
            }
            c2207b2.itemView.setOnClickListener(new AbstractView$OnClickListenerC137362cg2() { // from class: com.android.ttcjpaysdk.bindcard.base.adpter.BankCardListAdapter.1
                public static ChangeQuickRedirect LIZ;

                static {
                    Covode.recordClassIndex(6993);
                }

                @Override // p003X.AbstractView$OnClickListenerC137362cg2
                public final void doClick(View view) {
                    if (!PatchProxy.proxy(new Object[]{view}, this, LIZ, false, 1).isSupported && BankCardListAdapter.this.LIZIZ != null && !BankCardListAdapter.this.LIZJ) {
                        BankCardListAdapter.this.LIZIZ.LIZ(i, quickBindCardAdapterBean);
                    }
                }
            });
        }
    }
}
