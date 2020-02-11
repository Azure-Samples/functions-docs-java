package com.function;

import com.microsoft.azure.functions.annotation.*;
import com.microsoft.azure.functions.*;

/**
 * Azure Functions with Azure Storage Queue trigger.
 */
public class ServicecBusTriggerDemo {
    /**
     * This function will be invoked when a new message is received at the specified path. The message contents are provided as input to this function.
     */
    @FunctionName("ServicecBusTriggerDemo")
    public void run(
        @ServiceBusQueueTrigger(
            name = "message",
            queueName = "messages",
            connection = "AzureServiceBus") String message,
        final ExecutionContext context
    ) {
        context.getLogger().info("Message:" + message);
    }
}
