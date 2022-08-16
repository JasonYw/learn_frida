package cn.ever.cloud.android.services.task.entity;

import cn.ever.cloud.android.services.task.TaskProvider;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003X.C106862S5w;

/* loaded from: classes23.dex */
public abstract class Command {
    static {
        Covode.recordClassIndex(3069);
    }

    /* loaded from: classes23.dex */
    public static final class ContextUpdateCommand extends Command {
        public final Context newContext;

        static {
            Covode.recordClassIndex(3070);
        }

        public final Context getNewContext() {
            return this.newContext;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ContextUpdateCommand(Context context) {
            super(null);
            C106862S5w.LIZ(context);
            this.newContext = context;
        }
    }

    /* loaded from: classes23.dex */
    public static final class RegisterProviderCommand extends Command {
        public final TaskProvider provider;

        static {
            Covode.recordClassIndex(3071);
        }

        public final TaskProvider getProvider() {
            return this.provider;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RegisterProviderCommand(TaskProvider taskProvider) {
            super(null);
            C106862S5w.LIZ(taskProvider);
            this.provider = taskProvider;
        }
    }

    /* loaded from: classes23.dex */
    public static final class TaskItemCancelledCommand extends Command {
        public static ChangeQuickRedirect changeQuickRedirect;
        public final List<EventBag> itemEventBags;

        static {
            Covode.recordClassIndex(3072);
        }

        public static /* synthetic */ TaskItemCancelledCommand copy$default(TaskItemCancelledCommand taskItemCancelledCommand, List list, int i, Object obj) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{taskItemCancelledCommand, list, Integer.valueOf(i), obj}, null, changeQuickRedirect, true, 2);
            if (proxy.isSupported) {
                return (TaskItemCancelledCommand) proxy.result;
            }
            if ((i & 1) != 0) {
                list = taskItemCancelledCommand.itemEventBags;
            }
            return taskItemCancelledCommand.copy(list);
        }

        private Object[] getObjects() {
            return new Object[]{this.itemEventBags};
        }

        public final List<EventBag> component1() {
            return this.itemEventBags;
        }

        public final TaskItemCancelledCommand copy(List<? extends EventBag> list) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 1);
            if (proxy.isSupported) {
                return (TaskItemCancelledCommand) proxy.result;
            }
            C106862S5w.LIZ(list);
            return new TaskItemCancelledCommand(list);
        }

        public final boolean equals(Object obj) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 3);
            if (proxy.isSupported) {
                return ((Boolean) proxy.result).booleanValue();
            }
            if (this == obj) {
                return true;
            }
            if (obj instanceof TaskItemCancelledCommand) {
                return C106862S5w.LIZ(((TaskItemCancelledCommand) obj).getObjects(), getObjects());
            }
            return false;
        }

        public final int hashCode() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 4);
            return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(getObjects());
        }

        public final String toString() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 5);
            return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("Command$TaskItemCancelledCommand:%s", getObjects());
        }

        public final List<EventBag> getItemEventBags() {
            return this.itemEventBags;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public TaskItemCancelledCommand(List<? extends EventBag> list) {
            super(null);
            C106862S5w.LIZ(list);
            this.itemEventBags = list;
        }
    }

    /* loaded from: classes23.dex */
    public static final class TaskItemCompleteCommand extends Command {
        public static ChangeQuickRedirect changeQuickRedirect;
        public final List<EventBag> itemEventBags;

        static {
            Covode.recordClassIndex(3073);
        }

        public static /* synthetic */ TaskItemCompleteCommand copy$default(TaskItemCompleteCommand taskItemCompleteCommand, List list, int i, Object obj) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{taskItemCompleteCommand, list, Integer.valueOf(i), obj}, null, changeQuickRedirect, true, 2);
            if (proxy.isSupported) {
                return (TaskItemCompleteCommand) proxy.result;
            }
            if ((i & 1) != 0) {
                list = taskItemCompleteCommand.itemEventBags;
            }
            return taskItemCompleteCommand.copy(list);
        }

        private Object[] getObjects() {
            return new Object[]{this.itemEventBags};
        }

        public final List<EventBag> component1() {
            return this.itemEventBags;
        }

        public final TaskItemCompleteCommand copy(List<? extends EventBag> list) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 1);
            if (proxy.isSupported) {
                return (TaskItemCompleteCommand) proxy.result;
            }
            C106862S5w.LIZ(list);
            return new TaskItemCompleteCommand(list);
        }

        public final boolean equals(Object obj) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 3);
            if (proxy.isSupported) {
                return ((Boolean) proxy.result).booleanValue();
            }
            if (this == obj) {
                return true;
            }
            if (obj instanceof TaskItemCompleteCommand) {
                return C106862S5w.LIZ(((TaskItemCompleteCommand) obj).getObjects(), getObjects());
            }
            return false;
        }

        public final int hashCode() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 4);
            return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(getObjects());
        }

        public final String toString() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 5);
            return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("Command$TaskItemCompleteCommand:%s", getObjects());
        }

        public final List<EventBag> getItemEventBags() {
            return this.itemEventBags;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public TaskItemCompleteCommand(List<? extends EventBag> list) {
            super(null);
            C106862S5w.LIZ(list);
            this.itemEventBags = list;
        }
    }

    /* loaded from: classes23.dex */
    public static final class TaskItemFailCommand extends Command {
        public static ChangeQuickRedirect changeQuickRedirect;
        public final List<EventBag> itemEventBags;

        static {
            Covode.recordClassIndex(3074);
        }

        public static /* synthetic */ TaskItemFailCommand copy$default(TaskItemFailCommand taskItemFailCommand, List list, int i, Object obj) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{taskItemFailCommand, list, Integer.valueOf(i), obj}, null, changeQuickRedirect, true, 2);
            if (proxy.isSupported) {
                return (TaskItemFailCommand) proxy.result;
            }
            if ((i & 1) != 0) {
                list = taskItemFailCommand.itemEventBags;
            }
            return taskItemFailCommand.copy(list);
        }

        private Object[] getObjects() {
            return new Object[]{this.itemEventBags};
        }

        public final List<EventBag> component1() {
            return this.itemEventBags;
        }

        public final TaskItemFailCommand copy(List<? extends EventBag> list) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 1);
            if (proxy.isSupported) {
                return (TaskItemFailCommand) proxy.result;
            }
            C106862S5w.LIZ(list);
            return new TaskItemFailCommand(list);
        }

        public final boolean equals(Object obj) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 3);
            if (proxy.isSupported) {
                return ((Boolean) proxy.result).booleanValue();
            }
            if (this == obj) {
                return true;
            }
            if (obj instanceof TaskItemFailCommand) {
                return C106862S5w.LIZ(((TaskItemFailCommand) obj).getObjects(), getObjects());
            }
            return false;
        }

        public final int hashCode() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 4);
            return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(getObjects());
        }

        public final String toString() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 5);
            return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("Command$TaskItemFailCommand:%s", getObjects());
        }

        public final List<EventBag> getItemEventBags() {
            return this.itemEventBags;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public TaskItemFailCommand(List<? extends EventBag> list) {
            super(null);
            C106862S5w.LIZ(list);
            this.itemEventBags = list;
        }
    }

    /* loaded from: classes23.dex */
    public static final class TaskItemPauseCommand extends Command {
        public static ChangeQuickRedirect changeQuickRedirect;
        public final List<Long> itemIds;
        public final PauseReason pauseReason;

        static {
            Covode.recordClassIndex(3075);
        }

        public static /* synthetic */ TaskItemPauseCommand copy$default(TaskItemPauseCommand taskItemPauseCommand, List list, PauseReason pauseReason, int i, Object obj) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{taskItemPauseCommand, list, pauseReason, Integer.valueOf(i), obj}, null, changeQuickRedirect, true, 2);
            if (proxy.isSupported) {
                return (TaskItemPauseCommand) proxy.result;
            }
            if ((i & 1) != 0) {
                list = taskItemPauseCommand.itemIds;
            }
            if ((i & 2) != 0) {
                pauseReason = taskItemPauseCommand.pauseReason;
            }
            return taskItemPauseCommand.copy(list, pauseReason);
        }

        private Object[] getObjects() {
            return new Object[]{this.itemIds, this.pauseReason};
        }

        public final List<Long> component1() {
            return this.itemIds;
        }

        public final PauseReason component2() {
            return this.pauseReason;
        }

        public final TaskItemPauseCommand copy(List<Long> list, PauseReason pauseReason) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{list, pauseReason}, this, changeQuickRedirect, false, 1);
            if (proxy.isSupported) {
                return (TaskItemPauseCommand) proxy.result;
            }
            C106862S5w.LIZ(list, pauseReason);
            return new TaskItemPauseCommand(list, pauseReason);
        }

        public final boolean equals(Object obj) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 3);
            if (proxy.isSupported) {
                return ((Boolean) proxy.result).booleanValue();
            }
            if (this == obj) {
                return true;
            }
            if (obj instanceof TaskItemPauseCommand) {
                return C106862S5w.LIZ(((TaskItemPauseCommand) obj).getObjects(), getObjects());
            }
            return false;
        }

        public final int hashCode() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 4);
            return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(getObjects());
        }

        public final String toString() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 5);
            return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("Command$TaskItemPauseCommand:%s,%s", getObjects());
        }

        public final List<Long> getItemIds() {
            return this.itemIds;
        }

        public final PauseReason getPauseReason() {
            return this.pauseReason;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskItemPauseCommand(List<Long> list, PauseReason pauseReason) {
            super(null);
            C106862S5w.LIZ(list, pauseReason);
            this.itemIds = list;
            this.pauseReason = pauseReason;
        }
    }

    /* loaded from: classes23.dex */
    public static final class TaskItemRemoveCommand extends Command {
        public static ChangeQuickRedirect changeQuickRedirect;
        public final List<Long> itemIds;

        static {
            Covode.recordClassIndex(3076);
        }

        public static /* synthetic */ TaskItemRemoveCommand copy$default(TaskItemRemoveCommand taskItemRemoveCommand, List list, int i, Object obj) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{taskItemRemoveCommand, list, Integer.valueOf(i), obj}, null, changeQuickRedirect, true, 2);
            if (proxy.isSupported) {
                return (TaskItemRemoveCommand) proxy.result;
            }
            if ((i & 1) != 0) {
                list = taskItemRemoveCommand.itemIds;
            }
            return taskItemRemoveCommand.copy(list);
        }

        private Object[] getObjects() {
            return new Object[]{this.itemIds};
        }

        public final List<Long> component1() {
            return this.itemIds;
        }

        public final TaskItemRemoveCommand copy(List<Long> list) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 1);
            if (proxy.isSupported) {
                return (TaskItemRemoveCommand) proxy.result;
            }
            C106862S5w.LIZ(list);
            return new TaskItemRemoveCommand(list);
        }

        public final boolean equals(Object obj) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 3);
            if (proxy.isSupported) {
                return ((Boolean) proxy.result).booleanValue();
            }
            if (this == obj) {
                return true;
            }
            if (obj instanceof TaskItemRemoveCommand) {
                return C106862S5w.LIZ(((TaskItemRemoveCommand) obj).getObjects(), getObjects());
            }
            return false;
        }

        public final int hashCode() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 4);
            return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(getObjects());
        }

        public final String toString() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 5);
            return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("Command$TaskItemRemoveCommand:%s", getObjects());
        }

        public final List<Long> getItemIds() {
            return this.itemIds;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskItemRemoveCommand(List<Long> list) {
            super(null);
            C106862S5w.LIZ(list);
            this.itemIds = list;
        }
    }

    /* loaded from: classes23.dex */
    public static final class TaskItemResumeCommand extends Command {
        public static ChangeQuickRedirect changeQuickRedirect;
        public final List<Long> itemIds;
        public final PauseReason reason;

        static {
            Covode.recordClassIndex(3077);
        }

        public static /* synthetic */ TaskItemResumeCommand copy$default(TaskItemResumeCommand taskItemResumeCommand, List list, PauseReason pauseReason, int i, Object obj) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{taskItemResumeCommand, list, pauseReason, Integer.valueOf(i), obj}, null, changeQuickRedirect, true, 2);
            if (proxy.isSupported) {
                return (TaskItemResumeCommand) proxy.result;
            }
            if ((i & 1) != 0) {
                list = taskItemResumeCommand.itemIds;
            }
            if ((i & 2) != 0) {
                pauseReason = taskItemResumeCommand.reason;
            }
            return taskItemResumeCommand.copy(list, pauseReason);
        }

        private Object[] getObjects() {
            return new Object[]{this.itemIds, this.reason};
        }

        public final List<Long> component1() {
            return this.itemIds;
        }

        public final PauseReason component2() {
            return this.reason;
        }

        public final TaskItemResumeCommand copy(List<Long> list, PauseReason pauseReason) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{list, pauseReason}, this, changeQuickRedirect, false, 1);
            if (proxy.isSupported) {
                return (TaskItemResumeCommand) proxy.result;
            }
            C106862S5w.LIZ(list, pauseReason);
            return new TaskItemResumeCommand(list, pauseReason);
        }

        public final boolean equals(Object obj) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 3);
            if (proxy.isSupported) {
                return ((Boolean) proxy.result).booleanValue();
            }
            if (this == obj) {
                return true;
            }
            if (obj instanceof TaskItemResumeCommand) {
                return C106862S5w.LIZ(((TaskItemResumeCommand) obj).getObjects(), getObjects());
            }
            return false;
        }

        public final int hashCode() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 4);
            return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(getObjects());
        }

        public final String toString() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 5);
            return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("Command$TaskItemResumeCommand:%s,%s", getObjects());
        }

        public final List<Long> getItemIds() {
            return this.itemIds;
        }

        public final PauseReason getReason() {
            return this.reason;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskItemResumeCommand(List<Long> list, PauseReason pauseReason) {
            super(null);
            C106862S5w.LIZ(list, pauseReason);
            this.itemIds = list;
            this.reason = pauseReason;
        }
    }

    /* loaded from: classes23.dex */
    public static final class TaskItemRetryCommand extends Command {
        public static ChangeQuickRedirect changeQuickRedirect;
        public final List<Long> itemIds;

        static {
            Covode.recordClassIndex(3078);
        }

        public static /* synthetic */ TaskItemRetryCommand copy$default(TaskItemRetryCommand taskItemRetryCommand, List list, int i, Object obj) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{taskItemRetryCommand, list, Integer.valueOf(i), obj}, null, changeQuickRedirect, true, 2);
            if (proxy.isSupported) {
                return (TaskItemRetryCommand) proxy.result;
            }
            if ((i & 1) != 0) {
                list = taskItemRetryCommand.itemIds;
            }
            return taskItemRetryCommand.copy(list);
        }

        private Object[] getObjects() {
            return new Object[]{this.itemIds};
        }

        public final List<Long> component1() {
            return this.itemIds;
        }

        public final TaskItemRetryCommand copy(List<Long> list) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 1);
            if (proxy.isSupported) {
                return (TaskItemRetryCommand) proxy.result;
            }
            C106862S5w.LIZ(list);
            return new TaskItemRetryCommand(list);
        }

        public final boolean equals(Object obj) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 3);
            if (proxy.isSupported) {
                return ((Boolean) proxy.result).booleanValue();
            }
            if (this == obj) {
                return true;
            }
            if (obj instanceof TaskItemRetryCommand) {
                return C106862S5w.LIZ(((TaskItemRetryCommand) obj).getObjects(), getObjects());
            }
            return false;
        }

        public final int hashCode() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 4);
            return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(getObjects());
        }

        public final String toString() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 5);
            return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("Command$TaskItemRetryCommand:%s", getObjects());
        }

        public final List<Long> getItemIds() {
            return this.itemIds;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskItemRetryCommand(List<Long> list) {
            super(null);
            C106862S5w.LIZ(list);
            this.itemIds = list;
        }
    }

    public Command() {
    }

    public /* synthetic */ Command(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
