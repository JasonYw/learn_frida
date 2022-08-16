package com.byted.mgl.base.api.internal.delegate;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.minigame.bdpbase.ipc.BdpIPC;
import com.bytedance.minigame.bdpbase.ipc.IpcInterface;
import java.util.List;

/* loaded from: classes26.dex */
public interface IDelegateIpc {
    static {
        Covode.recordClassIndex(9781);
    }

    BdpIPC.Builder getBdpIpcBuilder(Context context);

    BdpIPC getMainBdpIPC();

    void registerToHolder(List<IpcInterface> list);
}
