/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.monitoring.v3.model;

/**
 * An SLI measuring performance on a well-known service type. Performance will be computed on the
 * basis of pre-defined metrics. The type of the service_resource determines the metrics to use and
 * the service_resource.labels and metric_labels are used to construct a monitoring filter to filter
 * that metric down to just the data relevant to this service.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Stackdriver Monitoring API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class BasicSli extends com.google.api.client.json.GenericJson {

  /**
   * Good service is defined to be the count of requests made to this service that return
   * successfully.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AvailabilityCriteria availability;

  /**
   * Good service is defined to be the count of requests made to this service that are fast enough
   * with respect to latency.threshold.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private LatencyCriteria latency;

  /**
   * OPTIONAL: The set of locations to which this SLI is relevant. Telemetry from other locations
   * will not be used to calculate performance for this SLI. If omitted, this SLI applies to all
   * locations in which the Service has activity. For service types that don't support breaking down
   * by location, setting this field will result in an error.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> location;

  /**
   * OPTIONAL: The set of RPCs to which this SLI is relevant. Telemetry from other methods will not
   * be used to calculate performance for this SLI. If omitted, this SLI applies to all the
   * Service's methods. For service types that don't support breaking down by method, setting this
   * field will result in an error.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> method;

  /**
   * OPTIONAL: The set of API versions to which this SLI is relevant. Telemetry from other API
   * versions will not be used to calculate performance for this SLI. If omitted, this SLI applies
   * to all API versions. For service types that don't support breaking down by version, setting
   * this field will result in an error.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> version;

  /**
   * Good service is defined to be the count of requests made to this service that return
   * successfully.
   * @return value or {@code null} for none
   */
  public AvailabilityCriteria getAvailability() {
    return availability;
  }

  /**
   * Good service is defined to be the count of requests made to this service that return
   * successfully.
   * @param availability availability or {@code null} for none
   */
  public BasicSli setAvailability(AvailabilityCriteria availability) {
    this.availability = availability;
    return this;
  }

  /**
   * Good service is defined to be the count of requests made to this service that are fast enough
   * with respect to latency.threshold.
   * @return value or {@code null} for none
   */
  public LatencyCriteria getLatency() {
    return latency;
  }

  /**
   * Good service is defined to be the count of requests made to this service that are fast enough
   * with respect to latency.threshold.
   * @param latency latency or {@code null} for none
   */
  public BasicSli setLatency(LatencyCriteria latency) {
    this.latency = latency;
    return this;
  }

  /**
   * OPTIONAL: The set of locations to which this SLI is relevant. Telemetry from other locations
   * will not be used to calculate performance for this SLI. If omitted, this SLI applies to all
   * locations in which the Service has activity. For service types that don't support breaking down
   * by location, setting this field will result in an error.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getLocation() {
    return location;
  }

  /**
   * OPTIONAL: The set of locations to which this SLI is relevant. Telemetry from other locations
   * will not be used to calculate performance for this SLI. If omitted, this SLI applies to all
   * locations in which the Service has activity. For service types that don't support breaking down
   * by location, setting this field will result in an error.
   * @param location location or {@code null} for none
   */
  public BasicSli setLocation(java.util.List<java.lang.String> location) {
    this.location = location;
    return this;
  }

  /**
   * OPTIONAL: The set of RPCs to which this SLI is relevant. Telemetry from other methods will not
   * be used to calculate performance for this SLI. If omitted, this SLI applies to all the
   * Service's methods. For service types that don't support breaking down by method, setting this
   * field will result in an error.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getMethod() {
    return method;
  }

  /**
   * OPTIONAL: The set of RPCs to which this SLI is relevant. Telemetry from other methods will not
   * be used to calculate performance for this SLI. If omitted, this SLI applies to all the
   * Service's methods. For service types that don't support breaking down by method, setting this
   * field will result in an error.
   * @param method method or {@code null} for none
   */
  public BasicSli setMethod(java.util.List<java.lang.String> method) {
    this.method = method;
    return this;
  }

  /**
   * OPTIONAL: The set of API versions to which this SLI is relevant. Telemetry from other API
   * versions will not be used to calculate performance for this SLI. If omitted, this SLI applies
   * to all API versions. For service types that don't support breaking down by version, setting
   * this field will result in an error.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getVersion() {
    return version;
  }

  /**
   * OPTIONAL: The set of API versions to which this SLI is relevant. Telemetry from other API
   * versions will not be used to calculate performance for this SLI. If omitted, this SLI applies
   * to all API versions. For service types that don't support breaking down by version, setting
   * this field will result in an error.
   * @param version version or {@code null} for none
   */
  public BasicSli setVersion(java.util.List<java.lang.String> version) {
    this.version = version;
    return this;
  }

  @Override
  public BasicSli set(String fieldName, Object value) {
    return (BasicSli) super.set(fieldName, value);
  }

  @Override
  public BasicSli clone() {
    return (BasicSli) super.clone();
  }

}
