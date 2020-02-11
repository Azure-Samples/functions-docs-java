# Azure Functions binding examples in Java

The following samples are used as a basis for [Azure Functions 2.x+ binding](https://docs.microsoft.com/azure/azure-functions/functions-triggers-bindings#supported-bindings) examples in Java.

## Settings and configuration

The *local.settings.example.json* file is provided for your convenience. Rename the file to *local.settings.json* and add your own connection and API values before trying to run the examples in this repo.

If you're using Visual Studio Code, you can use the [REST Client](https://marketplace.visualstudio.com/items?itemName=humao.rest-client) extension with the *routes.http* file. This file gives you the ability to call sample functions with a single click inside VS Code.

## Samples

The following samples are available in this repo.

| Name | Description  | Trigger | Input | Output |
|------|--------------|---------|-------|--------|
| [HttpTriggerDemo](https://github.com/Azure-Samples/functions-docs-java/tree/master/src/main/java/com/function/HttpTriggerDemo.java) | Triggered by an HTTP request. | Http | N/A | Http |
| [HttpTriggerQueueOutput](https://github.com/Azure-Samples/functions-docs-java/tree/master/src/main/java/com/function/HttpTriggerQueueOutput.java) | Triggered by an HTTP request, writes a queue message. | Http | N/A | Queue |
| [QueueTriggerDemo](https://github.com/Azure-Samples/functions-docs-java/tree/master/src/main/java/com/function/QueueTriggerDemo.java)  | Reads a queue message | Queue | Queue | N/A |
