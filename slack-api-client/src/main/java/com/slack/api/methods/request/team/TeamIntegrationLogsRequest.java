package com.slack.api.methods.request.team;

import com.slack.api.methods.SlackApiRequest;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TeamIntegrationLogsRequest implements SlackApiRequest {

    /**
     * Authentication token. Requires scope: `admin`
     */
    private String token;

    /**
     * Filter logs to this service. Defaults to all logs.
     */
    private String serviceId;

    /**
     * Filter logs generated by this user\u2019s actions. Defaults to all logs.
     */
    private String user;

    /**
     * Filter logs to this Slack app. Defaults to all logs.
     */
    private String appId;

    /**
     * Filter logs with this change type. Defaults to all logs.
     */
    private String changeType;

    private Integer count;

    private Integer page;

}