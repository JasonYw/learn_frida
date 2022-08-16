package com.bytedance.android.btm.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;
import p003X.C106862S5w;

/* loaded from: classes18.dex */
public final class BufferBtm implements Parcelable {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final String btm;
    public final String nodeId;
    public final String pageId;
    public final int step;
    public List<String> targetPagesBtm;
    public final String treeId;
    public int useTimes;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<BufferBtm> CREATOR = new Parcelable.Creator<BufferBtm>() { // from class: com.bytedance.android.btm.api.model.BufferBtm$Companion$CREATOR$1
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(11324);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        /* renamed from: newArray */
        public final BufferBtm[] mo25320newArray(int i) {
            return new BufferBtm[i];
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        /* renamed from: createFromParcel */
        public final BufferBtm mo25319createFromParcel(Parcel parcel) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{parcel}, this, changeQuickRedirect, false, 1);
            if (proxy.isSupported) {
                return (BufferBtm) proxy.result;
            }
            C106862S5w.LIZ(parcel);
            return new BufferBtm(parcel);
        }
    };

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* loaded from: classes18.dex */
    public static final class Companion {
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(11323);
        }

        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final BufferBtm create(String str, int i, String str2, String str3, String str4, int i2, List<String> list) {
            String str5 = str3;
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, Integer.valueOf(i), str2, str5, str4, Integer.valueOf(i2), list}, this, changeQuickRedirect, false, 1);
            if (proxy.isSupported) {
                return (BufferBtm) proxy.result;
            }
            C106862S5w.LIZ(str, str2, list);
            String str6 = "";
            if (str5 == null) {
                str5 = str6;
            }
            if (str4 != null) {
                str6 = str4;
            }
            return new BufferBtm(str, i, str2, str5, str6, i2, list);
        }

        public static /* synthetic */ BufferBtm create$default(Companion companion, String str, int i, String str2, String str3, String str4, int i2, List list, int i3, Object obj) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{companion, str, Integer.valueOf(i), str2, str3, str4, Integer.valueOf(i2), list, Integer.valueOf(i3), obj}, null, changeQuickRedirect, true, 2);
            if (proxy.isSupported) {
                return (BufferBtm) proxy.result;
            }
            if ((i3 & 32) != 0) {
                i2 = 1;
            }
            if ((i3 & 64) != 0) {
                list = new ArrayList();
            }
            return companion.create(str, i, str2, str3, str4, i2, list);
        }
    }

    public final String getBtm() {
        return this.btm;
    }

    public final String getNodeId() {
        return this.nodeId;
    }

    public final String getPageId() {
        return this.pageId;
    }

    public final int getStep() {
        return this.step;
    }

    public final List<String> getTargetPagesBtm() {
        return this.targetPagesBtm;
    }

    public final String getTreeId() {
        return this.treeId;
    }

    public final int getUseTimes() {
        return this.useTimes;
    }

    static {
        Covode.recordClassIndex(11322);
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("btm", this.btm);
            jSONObject.put("step", this.step);
            jSONObject.put("pageId", this.pageId);
            jSONObject.put("nodeId", this.nodeId);
            jSONObject.put("treeId", this.treeId);
            jSONObject.put("useTimes", this.useTimes);
            JSONArray jSONArray = new JSONArray();
            for (String str : this.targetPagesBtm) {
                jSONArray.put(str);
            }
            jSONObject.put("targetPagesBtm", jSONArray);
        } catch (Throwable unused) {
        }
        String jSONObject2 = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject2, "");
        return jSONObject2;
    }

    public final void setUseTimes(int i) {
        this.useTimes = i;
    }

    public final void setTargetPagesBtm(List<String> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 3).isSupported) {
            return;
        }
        C106862S5w.LIZ(list);
        this.targetPagesBtm = list;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public BufferBtm(android.os.Parcel r11) {
        /*
            r10 = this;
            p003X.C106862S5w.LIZ(r11)
            java.lang.String r1 = r11.readString()
            java.lang.String r5 = ""
            if (r1 != 0) goto Lc
            r1 = r5
        Lc:
            int r2 = r11.readInt()
            java.lang.String r3 = r11.readString()
            if (r3 != 0) goto L17
            r3 = r5
        L17:
            java.lang.String r4 = r11.readString()
            if (r4 != 0) goto L1e
            r4 = r5
        L1e:
            java.lang.String r0 = r11.readString()
            if (r0 == 0) goto L25
            r5 = r0
        L25:
            int r6 = r11.readInt()
            r7 = 0
            r8 = 64
            r9 = 0
            r0 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            java.util.List<java.lang.String> r1 = r10.targetPagesBtm
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            r11.readList(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.btm.api.model.BufferBtm.<init>(android.os.Parcel):void");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        if (PatchProxy.proxy(new Object[]{parcel, Integer.valueOf(i)}, this, changeQuickRedirect, false, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ(parcel);
        parcel.writeString(this.btm);
        parcel.writeInt(this.step);
        parcel.writeString(this.pageId);
        parcel.writeString(this.nodeId);
        parcel.writeString(this.treeId);
        parcel.writeInt(this.useTimes);
        parcel.writeList(this.targetPagesBtm);
    }

    public BufferBtm(String str, int i, String str2, String str3, String str4, int i2, List<String> list) {
        C106862S5w.LIZ(str, str2, str3, str4, list);
        this.btm = str;
        this.step = i;
        this.pageId = str2;
        this.nodeId = str3;
        this.treeId = str4;
        this.useTimes = i2;
        this.targetPagesBtm = list;
        this.useTimes = Math.max(this.useTimes, 1);
    }

    public /* synthetic */ BufferBtm(String str, int i, String str2, String str3, String str4, int i2, List list, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, str2, str3, str4, (i3 & 32) != 0 ? 1 : i2, (i3 & 64) != 0 ? new ArrayList() : list);
    }
}
