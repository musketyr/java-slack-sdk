package com.slack.api.bolt.micronaut.handlers;

import com.slack.api.bolt.handler.builtin.MessageShortcutHandler;

import java.util.regex.Pattern;

public interface MicronautMessageShortcutHandler extends MessageShortcutHandler {

    default Pattern getCallbackIdPattern() {
        return Pattern.compile("^" + Pattern.quote(getCallbackId()) + "$");
    }

    default String getCallbackId() {
        throw new UnsupportedOperationException("Implement either this method or getCallbackIdPattern()");
    }

}
