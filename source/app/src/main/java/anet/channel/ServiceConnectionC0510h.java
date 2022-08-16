package anet.channel;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import anet.channel.util.ALog;
import com.bytedance.covode.number.Covode;

/* renamed from: anet.channel.h */
/* loaded from: classes2.dex */
public class ServiceConnectionC0510h implements ServiceConnection {

    /* renamed from: a */
    public final /* synthetic */ Intent f20523a;

    /* renamed from: b */
    public final /* synthetic */ Context f20524b;

    /* renamed from: c */
    public final /* synthetic */ SessionRequest f20525c;

    static {
        Covode.recordClassIndex(2214);
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        ALog.m20788d("awcn.SessionRequest", "onServiceDisconnected", null, new Object[0]);
        this.f20524b.unbindService(this);
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        ALog.m20788d("awcn.SessionRequest", "onServiceConnected", null, new Object[0]);
        try {
            try {
                Messenger messenger = new Messenger(iBinder);
                Message message = new Message();
                message.getData().putParcelable("intent", this.f20523a);
                messenger.send(message);
            } catch (Exception e) {
                ALog.m20787e("awcn.SessionRequest", "onServiceConnected sendMessage error.", null, e, new Object[0]);
            }
        } finally {
            this.f20524b.unbindService(this);
        }
    }

    public ServiceConnectionC0510h(SessionRequest sessionRequest, Intent intent, Context context) {
        this.f20525c = sessionRequest;
        this.f20523a = intent;
        this.f20524b = context;
    }
}
