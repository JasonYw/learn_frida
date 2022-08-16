package cn.ever.cloud.android.entity;

import cn.ever.cloud.android.services.task.entity.TaskState;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.NoWhenBranchMatchedException;
import p003X.C106862S5w;

/* loaded from: classes23.dex */
public final class TaskItemKt {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* loaded from: classes23.dex */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            Covode.recordClassIndex(2870);
            int[] iArr = new int[TaskState.valuesCustom().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[TaskState.Waiting.ordinal()] = 1;
            $EnumSwitchMapping$0[TaskState.Running.ordinal()] = 2;
            $EnumSwitchMapping$0[TaskState.Pause.ordinal()] = 3;
            $EnumSwitchMapping$0[TaskState.Succeeded.ordinal()] = 4;
            $EnumSwitchMapping$0[TaskState.Failed.ordinal()] = 5;
            $EnumSwitchMapping$0[TaskState.Deleted.ordinal()] = 6;
        }
    }

    static {
        Covode.recordClassIndex(2869);
    }

    public static final int toState(TaskState taskState) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{taskState}, null, changeQuickRedirect, true, 1);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        C106862S5w.LIZ(taskState);
        switch (WhenMappings.$EnumSwitchMapping$0[taskState.ordinal()]) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 5;
            case 5:
                return 4;
            case 6:
                return 3;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
