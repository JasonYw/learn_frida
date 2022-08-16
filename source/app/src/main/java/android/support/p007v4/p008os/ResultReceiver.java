package android.support.p007v4.p008os;

import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.bytedance.covode.number.Covode;
import p003X.AbstractC144071eQb;
import p003X.BinderC144072eQc;
import p003X.C144070eQa;
import p003X.RunnableC144073eQd;

/* renamed from: android.support.v4.os.ResultReceiver */
/* loaded from: classes19.dex */
public class ResultReceiver implements Parcelable {
    public static final Parcelable.Creator<ResultReceiver> CREATOR = new Parcelable.Creator<ResultReceiver>() { // from class: android.support.v4.os.ResultReceiver.1
        static {
            Covode.recordClassIndex(246);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ ResultReceiver[] newArray(int i) {
            return new ResultReceiver[i];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ResultReceiver createFromParcel(Parcel parcel) {
            return new ResultReceiver(parcel);
        }
    };
    public final boolean LIZ;
    public final Handler LIZIZ;
    public AbstractC144071eQb LIZJ;

    public void LIZ(int i, Bundle bundle) {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    static {
        Covode.recordClassIndex(245);
    }

    public ResultReceiver(Parcel parcel) {
        AbstractC144071eQb c144070eQa;
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder == null) {
            c144070eQa = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("android.support.v4.os.IResultReceiver");
            if (queryLocalInterface != null && (queryLocalInterface instanceof AbstractC144071eQb)) {
                c144070eQa = (AbstractC144071eQb) queryLocalInterface;
            } else {
                c144070eQa = new C144070eQa(readStrongBinder);
            }
        }
        this.LIZJ = c144070eQa;
    }

    public final void LIZIZ(int i, Bundle bundle) {
        if (this.LIZ) {
            Handler handler = this.LIZIZ;
            if (handler != null) {
                handler.post(new RunnableC144073eQd(this, i, bundle));
                return;
            } else {
                LIZ(i, bundle);
                return;
            }
        }
        AbstractC144071eQb abstractC144071eQb = this.LIZJ;
        if (abstractC144071eQb != null) {
            try {
                abstractC144071eQb.LIZ(i, bundle);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        synchronized (this) {
            if (this.LIZJ == null) {
                this.LIZJ = new BinderC144072eQc(this);
            }
            parcel.writeStrongBinder(this.LIZJ.asBinder());
        }
    }
}
