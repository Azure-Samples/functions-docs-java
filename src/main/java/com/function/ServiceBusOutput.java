package com.function;

import java.util.*;
import com.microsoft.azure.functions.annotation.*;
import com.microsoft.azure.functions.*;

public class ServiceBusOutput {

    @FunctionName("ServiceBusOutput")
    public HttpResponseMessage run(
            @HttpTrigger(
                name = "req", 
                methods = {HttpMethod.GET, HttpMethod.POST},
                authLevel = AuthorizationLevel.FUNCTION) HttpRequestMessage<Optional<String>> request,
            @ServiceBusQueueOutput(
                name = "message",
                queueName = "messages",
                connection = "AzureServiceBus") OutputBinding<String> message,
            final ExecutionContext context) {

        String value = request.getQueryParameters().get("name");
        message.setValue(value);
        return request.createResponseBuilder(HttpStatus.OK).body("Message sent").build();
    }
}
