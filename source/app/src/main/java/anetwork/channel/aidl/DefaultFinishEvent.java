package anetwork.channel.aidl;

import android.os.Parcel;
import android.os.Parcelable;
import anet.channel.request.Request;
import anet.channel.statist.RequestStatistic;
import anet.channel.util.ErrorConstant;
import anetwork.channel.statist.StatisticData;
import com.bytedance.covode.number.Covode;
import p003X.AbstractC109253Szv;
import p003X.T01;

/* loaded from: classes10.dex */
public class DefaultFinishEvent implements Parcelable, AbstractC109253Szv {
    public static final Parcelable.Creator<DefaultFinishEvent> CREATOR = new T01();
    public Object LIZ;
    public int LIZIZ;
    public String LIZJ;
    public StatisticData LIZLLL;

    /* renamed from: LJ */
    public final RequestStatistic f20848LJ;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // p003X.AbstractC109253Szv
    public final int LIZ() {
        return this.LIZIZ;
    }

    @Override // p003X.AbstractC109253Szv
    public final String LIZIZ() {
        return this.LIZJ;
    }

    @Override // p003X.AbstractC109253Szv
    public final StatisticData LIZJ() {
        return this.LIZLLL;
    }

    static {
        Covode.recordClassIndex(2389);
    }

    public String toString() {
        return "DefaultFinishEvent [code=" + this.LIZIZ + ", desc=" + this.LIZJ + ", context=" + this.LIZ + ", statisticData=" + this.LIZLLL + "]";
    }

    public DefaultFinishEvent(int i) {
        this(0, null, null, null);
    }

    public static DefaultFinishEvent LIZ(Parcel parcel) {
        DefaultFinishEvent defaultFinishEvent = new DefaultFinishEvent(0);
        try {
            defaultFinishEvent.LIZIZ = parcel.readInt();
            defaultFinishEvent.LIZJ = parcel.readString();
            defaultFinishEvent.LIZLLL = (StatisticData) parcel.readSerializable();
        } catch (Throwable unused) {
        }
        return defaultFinishEvent;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.LIZIZ);
        parcel.writeString(this.LIZJ);
        StatisticData statisticData = this.LIZLLL;
        if (statisticData != null) {
            parcel.writeSerializable(statisticData);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public DefaultFinishEvent(int r2, java.lang.String r3, anet.channel.request.Request r4) {
        /*
            r1 = this;
            if (r4 == 0) goto L8
            anet.channel.statist.RequestStatistic r0 = r4.f20578a
        L4:
            r1.<init>(r2, r3, r4, r0)
            return
        L8:
            r0 = 0
            goto L4
        */
        throw new UnsupportedOperationException("Method not decompiled: anetwork.channel.aidl.DefaultFinishEvent.<init>(int, java.lang.String, anet.channel.request.Request):void");
    }

    public DefaultFinishEvent(int i, String str, Request request, RequestStatistic requestStatistic) {
        this.LIZLLL = new StatisticData();
        this.LIZIZ = i;
        this.LIZJ = str == null ? ErrorConstant.getErrMsg(i) : str;
        this.f20848LJ = requestStatistic;
    }
}
