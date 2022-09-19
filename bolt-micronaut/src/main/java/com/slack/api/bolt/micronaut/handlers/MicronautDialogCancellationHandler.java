package com.slack.api.bolt.micronaut.handlers;

import com.slack.api.bolt.handler.builtin.DialogCancellationHandler;

import java.util.regex.Pattern;

public interface MicronautDialogCancellationHandler extends DialogCancellationHandler {

    default Pattern getCallbackIdPattern() {
        return Pattern.compile("^" + Pattern.quote(getCallbackId()) + "$");
    }

    String getCallbackId();

}
