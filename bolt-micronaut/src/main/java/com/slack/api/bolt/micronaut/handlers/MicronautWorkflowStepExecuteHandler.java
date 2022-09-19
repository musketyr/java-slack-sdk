package com.slack.api.bolt.micronaut.handlers;

import com.slack.api.bolt.handler.builtin.WorkflowStepExecuteHandler;

import java.util.regex.Pattern;

public interface MicronautWorkflowStepExecuteHandler extends WorkflowStepExecuteHandler {

    default Pattern getPattern() {
        return Pattern.compile("^" + Pattern.quote(getStep()) + "$");
    }

    String getStep();

}
