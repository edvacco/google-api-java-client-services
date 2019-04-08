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

package com.google.api.services.dialogflow.v2.model;

/**
 * Description of which voice to use for speech synthesis.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dialogflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDialogflowV2VoiceSelectionParams extends com.google.api.client.json.GenericJson {

  /**
   * Optional. The name of the voice. If not set, the service will choose a voice based on the other
   * parameters such as language_code and gender.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Optional. The preferred gender of the voice. If not set, the service will choose a voice based
   * on the other parameters such as language_code and name. Note that this is only a preference,
   * not requirement. If a voice of the appropriate gender is not available, the synthesizer should
   * substitute a voice with a different gender rather than failing the request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String ssmlGender;

  /**
   * Optional. The name of the voice. If not set, the service will choose a voice based on the other
   * parameters such as language_code and gender.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Optional. The name of the voice. If not set, the service will choose a voice based on the other
   * parameters such as language_code and gender.
   * @param name name or {@code null} for none
   */
  public GoogleCloudDialogflowV2VoiceSelectionParams setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Optional. The preferred gender of the voice. If not set, the service will choose a voice based
   * on the other parameters such as language_code and name. Note that this is only a preference,
   * not requirement. If a voice of the appropriate gender is not available, the synthesizer should
   * substitute a voice with a different gender rather than failing the request.
   * @return value or {@code null} for none
   */
  public java.lang.String getSsmlGender() {
    return ssmlGender;
  }

  /**
   * Optional. The preferred gender of the voice. If not set, the service will choose a voice based
   * on the other parameters such as language_code and name. Note that this is only a preference,
   * not requirement. If a voice of the appropriate gender is not available, the synthesizer should
   * substitute a voice with a different gender rather than failing the request.
   * @param ssmlGender ssmlGender or {@code null} for none
   */
  public GoogleCloudDialogflowV2VoiceSelectionParams setSsmlGender(java.lang.String ssmlGender) {
    this.ssmlGender = ssmlGender;
    return this;
  }

  @Override
  public GoogleCloudDialogflowV2VoiceSelectionParams set(String fieldName, Object value) {
    return (GoogleCloudDialogflowV2VoiceSelectionParams) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDialogflowV2VoiceSelectionParams clone() {
    return (GoogleCloudDialogflowV2VoiceSelectionParams) super.clone();
  }

}
