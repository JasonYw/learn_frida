package com.bytedance.android.live.base.model.dynamic;

import com.bytedance.common.utility.collection.CollectionUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.android.live.base.model.dynamic.c */
/* loaded from: classes5.dex */
public class C2818c extends C2819d {
    public static ChangeQuickRedirect LIZ;
    @SerializedName("start_time")
    public long LIZIZ;
    @SerializedName("end_time")
    public long LIZJ;
    @SerializedName("room_id")
    public long LIZLLL;
    @SerializedName("title")

    /* renamed from: LJ */
    public String f25733LJ;
    @SerializedName("is_hide")
    public boolean LJFF;
    @SerializedName("moment_list")
    public List<C2823h> LJI;
    @SerializedName("record_list")
    public List<C2823h> LJII;
    @SerializedName("replay_list")
    public List<C2823h> LJIIIIZZ;
    @SerializedName("total_user")
    public long LJIIIZ;
    @SerializedName("unpublish_moment_list")
    public List<C2823h> LJIIJ;
    @SerializedName("unpublish_replay_list")
    public List<C2823h> LJIIJJI;
    @SerializedName("type")
    public int LJIIL;
    @SerializedName("fold_count")
    public long LJIILIIL;
    @SerializedName("fold_max_time")
    public long LJIILJJIL;
    public boolean LJIILL;
    public boolean LJIILLIIL;

    static {
        Covode.recordClassIndex(14009);
    }

    public final List<C2823h> LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        if (proxy.isSupported) {
            return (List) proxy.result;
        }
        ArrayList arrayList = new ArrayList();
        List<C2823h> list = this.LJI;
        if (list != null) {
            arrayList.addAll(list);
        }
        List<C2823h> list2 = this.LJII;
        if (list2 != null) {
            arrayList.addAll(list2);
        }
        return arrayList;
    }

    public final int LIZJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 3);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        if (CollectionUtils.isEmpty(this.LJIIIIZZ)) {
            return 0;
        }
        return this.LJIIIIZZ.size();
    }

    public final List<Long> LIZIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 2);
        if (proxy.isSupported) {
            return (List) proxy.result;
        }
        ArrayList arrayList = new ArrayList();
        List<C2823h> list = this.LJI;
        if (list != null) {
            for (C2823h c2823h : list) {
                if (c2823h != null) {
                    arrayList.add(Long.valueOf(c2823h.LJFF));
                }
            }
        }
        List<C2823h> list2 = this.LJII;
        if (list2 != null) {
            for (C2823h c2823h2 : list2) {
                if (c2823h2 != null) {
                    arrayList.add(Long.valueOf(c2823h2.LJFF));
                }
            }
        }
        List<C2823h> list3 = this.LJIIIIZZ;
        if (list3 != null) {
            for (C2823h c2823h3 : list3) {
                if (c2823h3 != null) {
                    arrayList.add(Long.valueOf(c2823h3.LJFF));
                }
            }
        }
        return arrayList;
    }
}
