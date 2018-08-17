package org.liquid.worker.client.models;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.experimental.Accessors;
import org.liquid.client.models.Request;

import java.io.Serializable;

/**
 * @author linckye 2018-08-16
 */
@Data
@Accessors(chain = true, fluent = true)
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class CallFunctionRequest
        extends Request
        implements Serializable {

    private String functionName;

}