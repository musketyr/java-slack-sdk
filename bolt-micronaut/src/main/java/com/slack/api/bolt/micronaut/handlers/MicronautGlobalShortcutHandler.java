package com.slack.api.bolt.micronaut.handlers;

import com.slack.api.bolt.handler.builtin.GlobalShortcutHandler;

import java.util.regex.Pattern;

public interface MicronautGlobalShortcutHandler extends GlobalShortcutHandler {

    default Pattern getCallbackIdPattern() {
        return Pattern.compile("^" + Pattern.quote(getCallbackId()) + "$");
    }

    String getCallbackId();

}
