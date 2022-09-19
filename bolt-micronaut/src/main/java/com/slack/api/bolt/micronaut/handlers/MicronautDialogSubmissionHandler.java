package com.slack.api.bolt.micronaut.handlers;

import com.slack.api.bolt.handler.builtin.DialogSubmissionHandler;

import java.util.regex.Pattern;

public interface MicronautDialogSubmissionHandler extends DialogSubmissionHandler {

    default Pattern getCallbackIdPattern() {
        return Pattern.compile("^" + Pattern.quote(getCallbackId()) + "$");
    }

    String getCallbackId();

}
