package helloWorldFlow;

import com.amazonaws.services.simpleworkflow.flow.core.Promise;
import helloWorldFlow.GreeterActivitiesClient;
import helloWorldFlow.GreeterActivitiesClientImpl;

public class GreeterWorkflowImpl implements GreeterWorkflow {
    private GreeterActivitiesClient operations = new GreeterActivitiesClientImpl();

    public void greet() {
        Promise<String> name = operations.getName();
        Promise<String> greeting = operations.getGreeting(name);
        operations.say(greeting);
    }
}